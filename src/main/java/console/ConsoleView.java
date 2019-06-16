package console;

import java.util.Scanner;

/**
* 暗号化処理のView
*/
public class ConsoleView{
    
    /** Scanner */
    private Scanner scanner;
    
    /**
    * コンストラクタ。
    */
    public ConsoleView(){
        this.scanner = new Scanner(System.in);
    }
    
    /**
    * 文字列をコンソールから読み取る。
    *
    * @param 入力前に表示するメッセージ
    * @return 入力された文字列
    */
    public String scan(String msg){
        emptyRow();
        System.out.print(msg + ": ");
        return this.scanner.nextLine();
    }
    
    /**
    * メインメニュー
    */
    public void showMenu(){
        emptyRow();
        println("1: Encode");
        println("2: Decode");
        println("q: Quit");
    }
    
    /**
    * 暗号表示の選択メニュー
    */
    public void showEncryptionType(){
        emptyRow();
        println("1: Base64");
        println("2: Base64 (URL safe)");
        println("3: Caesar");
        println("4: Vigenere");
    }
    
    /**
    * 文字列の一行出力。
    */
    public void println(String arg){
        System.out.println(arg);
    }
    
    /**
    *文字列の出力。改行なし。
    */
    public void print(String arg){
        System.out.print(arg);
    }
    
    public void emptyRow(){
        System.out.println("");
    }
}
