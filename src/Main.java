public class Main {
    public static void main(String[] args) {
        int clientMoney = 50000;
        int bonus = 1;
        int entrance = 350;

        int accrualValue = 400;
        int bonusValue = (entrance - accrualValue) / (accrualValue / 4) * bonus;
        int money = clientMoney + entrance + bonusValue;
        if (entrance > accrualValue) {
            System.out.println(bonusValue + " Бонусов");
            System.out.println(money + " - Счет");
        } else {
            System.out.println(money + " - Счет");
        }


    }

}









