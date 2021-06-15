import java.util.Scanner;
import java.util.Random;

public class kazuate {
    static int inputNum(String text, Scanner scan){
        while(true) {
            System.out.println(text);
            try{
                int num = Integer.parseInt(scan.nextLine());
                if(10 <= num && num <= 99){
                    return num;
                }
                else {
                    System.out.println("入力値がおかしいです.");
                }
            } catch(NumberFormatException e){
                
            }
        }
    }

    public static void main(String[] args) throws Exception {
        int clear = 0;
        Random rand = new Random();
        System.out.println("=====数当てゲーム=====");

        int ans = rand.nextInt(90) + 10; //答えの数字をランダム生成

        for(int i=0;i<5;i++){
           Scanner scan = new Scanner(System.in);
           String text = "2桁の正の整数を入力してください。(残り" + (5-i) + "回)";
           int num = inputNum(text, scan);

            if(ans == num){
                clear = 1;
                System.out.println("当たり！！！！！！！！");
                break;
            }
            else if(ans < num){
                System.out.println("答えより大きい数字です。");
                if(Math.abs(ans - num) >= 20){
                    System.out.println("答えと20以上離れています。");
                }
            }
            else if(ans > num){
                System.out.println("答えより小さい数字です。");
                if(Math.abs(ans - num) >= 20){
                    System.out.println("答えと20以上離れています。");
                }
            }
        }
        if(clear == 0){
            System.out.println("クリア失敗！！正解は「"+ ans +"」でした！");
        }
    }
}
