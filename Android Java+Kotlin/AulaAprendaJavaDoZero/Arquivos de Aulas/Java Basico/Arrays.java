class Arrays {
    public static void main(String[] args) {
        String nome = "Rodrigo";
        String[] nomes = {"Rodrigo", "João", "Pedro", "Paulo", "Ana", "Katia"};
        int[] numeros = {200, 500, 800, 1000};

        System.out.println("Resultado " + nomes[1]);

        String[] joao = {"João", "22"};
        String[] ana = {"Ana", "25"};
        String[][] conversas = {
                /* É necessário utilizar duas chaves pois indica que isso é um array
                que recebe outro array indicado pelo [][] no tipo da variável
                */
               joao,
                ana,
        };
        System.out.println(conversas[1][0]);
    }
}