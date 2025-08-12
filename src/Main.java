public class Main {
    public static void main(String[] args) {
        int clientMoney = 50000;
        int bonus = 1;
        int entrance = 3500;

        int accrualValue = 400;
        int bonusAlgoritm = entrance / 100;
        int money = clientMoney + entrance + bonusAlgoritm;
        if (entrance > accrualValue) {
            System.out.println(bonusAlgoritm + " Бонусов");
            System.out.println(money + " - Счет");
        } else {
            System.out.println(money + " - Счет");
        }


    }

}









