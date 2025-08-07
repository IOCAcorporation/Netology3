public class Main {
    public static void main(String[] args) {
        int clientMoney = 50000;
        int bonus = 1;
        int entrance = 1000;
        int minValue = 400;
        int accrualValue = 100;
        int bonusValue = (entrance - minValue) / accrualValue * bonus;
        int money = clientMoney + entrance + bonusValue;
        if (entrance > minValue) {
            System.out.println(bonusValue + " Бонусов");
            System.out.println(money + " - Счет");
        }


    }

}









