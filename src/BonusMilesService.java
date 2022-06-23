public class BonusMilesService {

    public int calculate(int cost) {
        int oneBonusMileCost = 20;
        int bonuses;
        bonuses = cost / oneBonusMileCost;
        return bonuses;
    }
}
