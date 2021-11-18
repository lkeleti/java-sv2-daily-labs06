package day03;

public class RoundAmount {
    public int roundAmount(int amount){
        int lastNumber = amount % 10;

        switch (lastNumber){
            case 1,6: {
                amount -= 1;
                break;
            }
            case 2,7: {
                amount -= 2;
                break;
            }
            case 3,8: {
                amount += 2;
                break;
            }
            case 4,9: {
                amount += 1;
                break;
            }
            default:
                break;
        }
        return amount;
    }
}
