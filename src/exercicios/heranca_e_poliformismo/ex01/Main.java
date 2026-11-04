package exercicios.heranca_e_poliformismo.ex01;

public class Main {
    public static void main(String[] args) {
        // Exemplo de Filme com Meia-Entrada
        HalfPriceTicket halfPriceTicket = new HalfPriceTicket(75, "A era do Gelo 4", false);
        System.out.printf("Filme: %s | Faixa de Áudio: %s | Meia-Entrada: R$ %.2f\n", halfPriceTicket.getMovie(), halfPriceTicket.getAudioType(halfPriceTicket.isLegend()), halfPriceTicket.getRealValue());

        // Exemplo de Filme com Família Pequena
        FamilyTicket smallFamilyTicket = new FamilyTicket(64, "Homem Aranha", true, 2);
        System.out.printf("Filme: %s | Faixa de Áudio: %s | Pessoas: %s | Ingresso Família: R$ %.2f\n", smallFamilyTicket.getMovie(), smallFamilyTicket.getAudioType(smallFamilyTicket.isLegend()), smallFamilyTicket.getNumberOfPeople(), smallFamilyTicket.getRealValue());

        // Exemplo de Filme com Família Grande
        FamilyTicket bigFamilyTicket = new FamilyTicket(64, "Homem Aranha", true, 4);
        System.out.printf("Filme: %s | Faixa de Áudio: %s | Pessoas: %s | Ingresso Família: R$ %.2f\n", bigFamilyTicket.getMovie(), bigFamilyTicket.getAudioType(bigFamilyTicket.isLegend()), bigFamilyTicket.getNumberOfPeople(), bigFamilyTicket.getRealValue());
    }
}
