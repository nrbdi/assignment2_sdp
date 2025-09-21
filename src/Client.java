public class Client {
    private final Cosmetic cosmetic;

    public Client(CosmeticFactory factory) {
        this.cosmetic = factory.createCosmetic();
    }

    public Cosmetic getCosmetic() {
        return cosmetic;
    }
}