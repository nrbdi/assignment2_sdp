public interface CosmeticFactory {
    Cosmetic createCosmetic();
}

class LuxuryFoundationFactory implements CosmeticFactory {
    @Override
    public Cosmetic createCosmetic() {
        return new FoundationLuxury();
    }
}

class BudgetFoundationFactory implements CosmeticFactory {
    @Override
    public Cosmetic createCosmetic() {
        return new FoundationBudget();
    }
}

class LuxuryLipstickFactory implements CosmeticFactory {
    @Override
    public Cosmetic createCosmetic() {
        return new LipstickLuxury();
    }
}

class BudgetLipstickFactory implements CosmeticFactory {
    @Override
    public Cosmetic createCosmetic() {
        return new LipstickBudget();
    }
}
