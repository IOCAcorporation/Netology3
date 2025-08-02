public class Main {
    public static void main(String[] args) {
        int Client_money = 50000;
        int Bonus = 1;
        int b = 1000;
        int a = 400;
        int c = 100;
        int Answer = (a - b) / c * Bonus;
        int Answer2 = Client_money + a + Answer;
        int Answer3 = Client_money + a;
        if (a > b) {
            System.out.println("Вам начисляется бонус в ");
            System.out.println(Answer + " рублей! ");
            System.out.println("Итого на счету - ");
            System.out.println(Answer2 + "рублей.");

        }

    }


}




