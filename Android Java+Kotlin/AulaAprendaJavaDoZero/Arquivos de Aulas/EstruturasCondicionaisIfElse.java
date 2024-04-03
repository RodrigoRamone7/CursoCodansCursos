class Scratch {
    public static void main(String[] args) {
        double compras = 400;
        byte idade = 50;

        boolean resultado = compras >= 300 && idade >= 50;

        if ( resultado ){
            System.out.println("DESCONTO DE 30%");
        } else {
            System.out.println("Não tem desconto");
        }
    }
}