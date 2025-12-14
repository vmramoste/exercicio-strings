public class InverteString {
    public static void main(String[] args) {
        var scanner = new java.util.Scanner(System.in);
        System.out.print("Digite o valor a ser invertido: ");
        String inicial = scanner.next();
        System.out.println("A string invertida é: " + new StringBuilder(inicial).reverse());

    }
}
