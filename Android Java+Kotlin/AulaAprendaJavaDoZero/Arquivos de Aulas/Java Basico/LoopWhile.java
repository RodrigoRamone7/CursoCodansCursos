class LoopWhile {
    public static void main(String[] args) {
        int numero = 10;
        numero++;
        numero = numero + 1;
        numero += 1;
        System.out.println(numero);

        while ( numero >= 5){
            System.out.println(numero);
            numero--;
        }
    }
}