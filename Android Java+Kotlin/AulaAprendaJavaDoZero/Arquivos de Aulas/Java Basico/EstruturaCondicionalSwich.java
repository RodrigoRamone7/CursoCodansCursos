class EstruturaCondicionalSwich {
    public static void main(String[] args) {
        int opcao = 3;
        switch ( opcao ){
            case 1 :
                System.out.println("Saldo atual");
                break;
            case 2 :
                System.out.println("Extrato");
                break;
            case 3 :
                System.out.println("Cartões de crédito");
                break;
            default:
                System.out.println("Nenhuma opção selecionada");
        }
    }
}