class VariaveisTipos {
    public static void main(String[] args) {
        /* Tipos primitivos
         * Os tipos primitivos são os tipos mais básicos da linguagem.
         * Geralmente não carregam métodos como uma classe ou objeto.
         * */
        System.out.println("Tipos primitivos");

        byte idade = 30;
        System.out.println("A idade é: " + idade);

        int numeroCasa = 360;
        System.out.println("Número da casa: " + numeroCasa);

        float preco = 34.96f; // É necessario o f no final para identificar que é um float
        System.out.println("O preço é: " + preco);

        double total = 356.9867;
        System.out.println("Valor total: " + total);

        boolean visivel = true;
        System.out.println("Está visivel? " + visivel);

        char genero = 'M';
        System.out.println("O gênero é: " + genero);

        System.out.println(" ");

        /* Classes wrapper
         * São tipos que básicamente funcionam da mesma forma que os tipos primitivos,
         * mas carregam em si métodos que fazem operações com os valores recebidos ou
         * conversões de valores.
         *
         * Tipos como as Classes wrapper começam com letra Maiúscula.
         * */
        System.out.println("Classes wrapper");

        Byte idadeC = 52;
        System.out.println("A idade em classe: " + idadeC);

        Integer numeroCasaC = 360;
        System.out.println("O número da casa é: " + numeroCasaC);

        Double totalC = 456.9867;
        System.out.println("Valor total: " + totalC);

        String nome = "Rodrigo Ramone";
        System.out.println("O nome é: " + nome);

    }
}