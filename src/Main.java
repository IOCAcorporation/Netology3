public class Main {
    public static void main(String[] args) {
        int clientMoney = 50000;
        int bonus = 1;
        int entrance = 1000;
        int minValue = 400;
        int accrualValue = 100;
        int answer = (entrance - minValue) / accrualValue * bonus;
        int answer2 = clientMoney + entrance + answer;
        int answer3 = clientMoney + entrance;
        if (entrance > minValue) {
            System.out.println(answer + " Бонусов");
            System.out.println(answer2 + " - Счет");
            }


            }

        }










