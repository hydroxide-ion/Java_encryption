package console;

import java.util.Scanner;

/**
* 暗号化処理のコンソール画面
*/
public class Console {

    ConsoleView view;

    public static void main(String[] args){
        Controller controller = new Controller();
        boolean isLoop = true;
        while(isLoop){
            controller.process();
            isLoop = controller.isLoop();
        }
    }
}
