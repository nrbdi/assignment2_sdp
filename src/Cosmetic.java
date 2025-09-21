public abstract class Cosmetic {
    protected String name;
    protected double price;

    public Cosmetic(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public abstract void apply();

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class FoundationLuxury extends Cosmetic {
    public FoundationLuxury() {
        super("Estee Lauder Foundation", 25000);
    }

    @Override
    public void apply() {
        System.out.println("Applying luxury foundation: " + name + " (" + price + "₸)");
    }
}

class FoundationBudget extends Cosmetic {
    public FoundationBudget() {
        super("Catrice HD cover Foundation", 3500);
    }

    @Override
    public void apply() {
        System.out.println("Applying budget foundation: " + name + " (" + price + "₸)");
    }
}

class LipstickLuxury extends Cosmetic {
    public LipstickLuxury() {
        super("YSL red Lipstick", 18000);
    }

    @Override
    public void apply() {
        System.out.println("Applying luxury lipstick: " + name + " (" + price + "₸)");
    }
}

class LipstickBudget extends Cosmetic {
    public LipstickBudget() {
        super("Vivienne Sabo Lipstick", 1200);
    }

    @Override
    public void apply() {
        System.out.println("Applying budget lipstick: " + name + " (" + price + "₸)");
    }
}