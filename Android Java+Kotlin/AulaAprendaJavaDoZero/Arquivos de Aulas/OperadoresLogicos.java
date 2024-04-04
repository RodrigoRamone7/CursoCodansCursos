class OperadoresLogicos {
    public static void main(String[] args) {
        byte idade = 30;
        double compras = 300;
        boolean resultado = compras >= 300 || idade >= 50;

        System.out.println("Desconto: " + resultado);

        byte idadeE = 50;
        double comprasE = 300;
        boolean resultadoE = comprasE >= 300 && idadeE >= 50;
        System.out.println("Desconto: " + resultadoE);
    }
}