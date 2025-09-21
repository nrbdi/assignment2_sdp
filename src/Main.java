public class Main {
    public static void main(String[] args) {
        CosmeticFactory luxuryFoundationFactory = new LuxuryFoundationFactory();
        Client luxuryFoundationClient = new Client(luxuryFoundationFactory);
        luxuryFoundationClient.getCosmetic().apply();

        CosmeticFactory budgetFoundationFactory = new BudgetFoundationFactory();
        Client budgetFoundationClient = new Client(budgetFoundationFactory);
        budgetFoundationClient.getCosmetic().apply();

        CosmeticFactory luxuryLipstickFactory = new LuxuryLipstickFactory();
        Client luxuryLipstickClient = new Client(luxuryLipstickFactory);
        luxuryLipstickClient.getCosmetic().apply();

        CosmeticFactory budgetLipstickFactory = new BudgetLipstickFactory();
        Client budgetLipstickClient = new Client(budgetLipstickFactory);
        budgetLipstickClient.getCosmetic().apply();
    }
}


