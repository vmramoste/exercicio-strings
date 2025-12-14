public class ParteMaiuscula {
    public static void main(String[] args) {
        // Pega os dados
        var scanner = new java.util.Scanner(System.in);
        System.out.print("Digite o texto inicial: ");
        String inicial = scanner.nextLine();
        System.out.print("Digite o texto que deseja tornar maiúsculo: ");
        String parteAAlterar = scanner.nextLine();

        //Encontrar a parte a alterar dentro da string inicial e torná-la maiúscula
        System.out.println(inicial.replace(parteAAlterar, parteAAlterar.toUpperCase()));

    }
}
