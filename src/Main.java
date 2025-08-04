public class Main {
    public static void main(String[] args) {
        int clientMoney = 50000;
        int bonus = 1;
        int entrance = 1000;
        int minValue = 400;
        int accrualValue = 100;
        int Answer = (entrance - minValue) / accrualValue * bonus;
        int Answer2 = clientMoney + entrance + Answer;
        int Answer3 = clientMoney + entrance;
        if (entrance > minValue) {
            System.out.println(Answer + " Бонусов");
            System.out.println(Answer2 + " - Счет");
            }


            }

        }









