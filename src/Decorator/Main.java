package Decorator;

public class Main {
    public static void main(String[] args) {
        
        Bebida cafe = new Cafe();
        System.out.println("Preço do café: " + cafe.getPreco());
        System.out.println("Descrição do café: " + cafe.getDescricao());

        Bebida cafeComAcucar = new Acucar(cafe);
        System.out.println("Preço do café com açúcar: " + cafeComAcucar.getPreco());
        System.out.println("Descrição do café com açúcar: " + cafeComAcucar.getDescricao());

        Bebida cafeComLeite = new Leite(cafe);
        System.out.println("Preço do café com leite: " + cafeComLeite.getPreco());
        System.out.println("Descrição do café com leite: " + cafeComLeite.getDescricao());

        Bebida cafeCompleto = new Leite(new Acucar(cafe));
        System.out.println("Preço do café completo: " + cafeCompleto.getPreco());
        System.out.println("Descrição do café completo: " + cafeCompleto.getDescricao());
    }
}
