package console;

import encryption.JavaBase64;
import encryption.Caesar;
import encryption.Vigenere;
import lombok.Getter;

public class Controller{

    /** ConsoleView */
    private ConsoleView view;

    /** ループを継続するかの判定フラグ */
    @Getter
    private boolean loop = true;

    /**
    * コンストラクタ。
    */
    public Controller(){
        this.view = new ConsoleView();
    }
    
    /**
    * 処理部分。
    */
    public void process(){
        view.showMenu();
        String command = view.scan("encode/decode?");
        switch(command){
        case "1":
            encodeProcess();
            break;
        case "2":
            decodeProcess();
            break;
        case "q":
            this.loop = false;
        default:
            break;
        }
    }
    
    private void encodeProcess(){
        view.showEncryptionType();
        String type = view.scan("Encryption type");
        String arg = view.scan("Plain message");
        switch(type){
        case "1":
            view.println(JavaBase64.encodeByBase64(arg));
            break;
        case "2":
            view.println(JavaBase64.encodeByUrl(arg));
            break;
        case "3":
            String shift = view.scan("Shift number");
            view.println(Caesar.encode(
                arg,
                Integer.parseInt(shift)
            ));
            break;
        case "4":
            String key = view.scan("Key");
            view.println(Vigenere.encodeAlphabet(arg,key));
            break;
        default:
            break;
        }
    }
    
    private void decodeProcess(){
        view.showEncryptionType();
        String type = view.scan("Encryption type");
        String arg = view.scan("Plain message");
        switch(type){
        case "1":
            view.println(JavaBase64.decodeByBase64(arg));
            break;
        case "2":
            view.println(JavaBase64.decodeByUrl(arg));
            break;
        case "3":
            String shift = view.scan("Shift number");
            view.println(Caesar.decode(
                arg,
                Integer.parseInt(shift)
            ));
            break;
        case "4":
            String key = view.scan("Key");
            view.println(Vigenere.decodeAlphabet(arg,key));
            break;
        default:
            break;
        }
    }
    
}

