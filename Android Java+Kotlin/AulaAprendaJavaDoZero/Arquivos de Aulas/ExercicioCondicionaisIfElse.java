class Scratch {
    public static void main(String[] args) {
        byte n1 = 30;
        byte n2 = 20;

        if (n1 > n2){
            System.out.println("O número maior é: " + n1);
        } else {
            System.out.println("O número maior é: " + n2);
        }

        double compras = 900;

        if (compras <= 200){
            System.out.println("Não tem desconto");
        } else if (compras >= 201 && compras <= 400){
            System.out.println("Desconto de 20%");
        } else if (compras >= 401 && compras <= 800) {
            System.out.println("Desconto de 30%");
        } else {
            System.out.println("Desconto de 40%");
        }
    }
}