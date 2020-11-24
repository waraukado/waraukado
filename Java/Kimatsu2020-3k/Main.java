import java.util.Scanner;
public class Main{
    public static void main(String[]args) {
        // 初期設定
        int command = 0;
        Scanner scn = new Scanner(System.in);

        // Carインスタンス作成
        Car mycar = new Car();        
        // Personインスタンス作成
        Person driver = new Person();

        // 各種値入力（車）
        System.out.println("◎車種設定");
        // 名前
        System.out.print("　車の名前：");
        mycar.setCarName(scn.nextLine());
        // メーカー
        System.out.print("　車のメーカ：");
        mycar.setCarMaker(scn.nextLine());
        // 燃費
        System.out.print("　燃費：");
        mycar.setFuelconsumption(inputD(scn));
        // タンク容量
        System.out.print("　ガソリンタンク容量：");
        mycar.setFueltank(inputD(scn));
        mycar.charge(mycar.getFueltank()); // スタート時は満タンにする。

        // 各種値入力（オーナー）
        System.out.println("◎オーナー情報");
        // 姓
        System.out.print("　お名前（姓）：");
        driver.setLastName(scn.nextLine());
        // 名
        System.out.print("　お名前（名）：");
        driver.setFirstName(scn.nextLine());

        // メイン処理（ドライブ）
        System.out.println("走行：1　給油：2　終了：99");
        while(command != 99){
            System.out.print("■コマンドを入力してください：　");
            //コマンド入力
            command = inputCommand(scn,1,2,99);
            switch (command){
                case 1: // 走行
                    System.out.print("走行距離（km）：");
                    mycar.run(inputD(scn));
                    break;
                case 2: // 給油
                    System.out.print("給油量（L）：");
                    double fuelL = inputD(scn); // 給油量はドライバーで集計
                    
                    if(fuelL + mycar.getFuel() <= mycar.getFueltank() ){ // タンク容量を超える給油量を指定した場合の処理
                        driver.setOil(driver.getOil() + fuelL);
                        System.out.println(fuelL + "L 給油しました。");
                    }else{
                        driver.setOil(driver.getOil() + (mycar.getFueltank() - mycar.getFuel()));
                        System.out.println("[満]" + (mycar.getFueltank() - mycar.getFuel()) + "L 給油しました。");
                    }
                    mycar.charge(fuelL); // 車への給油処理
                    break;
                case 99: // 終了
                    break;
                default:
            }
            System.out.println("＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝");
            System.out.println("ガソリン残Ｌ：" + mycar.getFuel() + "　走行距離" + mycar.getMileage());
            System.out.println("＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝");    
        }     
        // 終了（メッセージ表示）
        System.out.println();
        System.out.println("お疲れさまでした。");
        System.out.println("＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝");
        System.out.println("車：" + mycar.getCarName() + "（" +mycar.getCarMaker() + "）");
        System.out.println("オーナー：" + driver.getLastName() + "　" + driver.getFirstName());
        System.out.println("走行距離：" + mycar.getMileage());
        System.out.println("ガソリン　給油量：" + driver.getOil() + "Ｌ　使用料：" + ( (driver.getOil() + mycar.getFueltank() ) - mycar.getFuel() ) );
        System.out.println("＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝");
        scn.close();
    }

    public static int inputCommand(Scanner scn,int A,int B,int C){ // チェック付きコマンド入力メソッド
        int command=0;
        String inputC;
        
        while(true){
            inputC = scn.nextLine();
            try{
                command = Integer.parseInt(inputC);
            }catch(NumberFormatException e){
                System.out.println("入力した値が不正です。数値を入力して下さい。");
            }

            if(command != A && command != B && command != C){
                System.out.println("ERROR [走行：1　給油：2　終了：99] いずれかの値を入力して下さい。");
            }else{
                break;
            }
        }
        return command;               
    }

    public static double inputD(Scanner scn){ // double型入力用メソッド
        String inputf;
        double inputFuel;
        
        while(true){
            inputf = scn.nextLine();
            try{
                inputFuel = Double.parseDouble(inputf);
                break;
            }catch(NumberFormatException e){
                System.out.println("入力した値が不正です。数値を入力して下さい。");
            }
        }
        return inputFuel;               
    }

}
