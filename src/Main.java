public class Main {
    public static void main(String[] args) {
        int clientMoney = 50000;
        int bonus = 1;
        double entrance = 0;
        int accrualValue = 1000;
        double bonusAlgoritm = entrance / 100;
        double money = clientMoney + entrance + bonusAlgoritm;
        double noBonusMoney = clientMoney + entrance;
        if (entrance > accrualValue) {
            System.out.println(bonusAlgoritm + " Бонусов");
            System.out.println(money + " - Счет");
        } else {
            System.out.println(noBonusMoney + " - Счет");
            System.out.println(entrance + " - Поступление");
        }


    }

}









