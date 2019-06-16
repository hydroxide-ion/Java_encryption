package encryption;

/**
* ヴィジュネリ暗号のクラス。
*/
public class Vigenere{

    /**
    * インスタンス化しない。
    */
    private Vigenere(){
    }
    
    /**
    * ヴィジュネル暗号方式でエンコード
    */
    public static String encodeAlphabet(String arg, 
    String key){
        String result = "";
        
        for(int i=0;i<arg.length();i++){
            int keyIndex = i % key.length();
            result += String.valueOf(
                setAlphabet(
                    ((int) arg.charAt(i)),
                    ((int) key.charAt(keyIndex)),
                    true
                )
            );
        }
        return result;
    }
    
    /**
    * ヴィジュネル暗号方式でデコード
    */
    public static String decodeAlphabet(String arg, 
    String key){
        String result = "";
        
        for(int i=0;i<arg.length();i++){
            int keyIndex = i % key.length();
            result += String.valueOf(
                setAlphabet(
                    ((int) arg.charAt(i)),
                    ((int) key.charAt(keyIndex)),
                    false
                )
            );
        }
        return result;
    }
    
    private static char setAlphabet(int nArg, 
        int nKey, boolean isEncode){
        
        int indexArg;
        if (nArg>=65 && nArg<=90){
            indexArg = nArg - 65;
        } else if (nArg>=97 && nArg<=122){
            indexArg = nArg - 97;
        } else {
            indexArg = 0;
        }
        
        int indexKey;
        if (nKey>=65 && nKey<=90){
            indexKey = nKey - 65;
        } else if (nKey>=97 && nKey<=122){
            indexKey = nKey - 97;
        } else {
            indexKey = 0;
        }
        
        int number = isEncode ? 
            indexArg + indexKey :
            indexArg - indexKey;
            
        if (number < 0){
            return (char) (97 + 26 + number);
        }
        if (number > 25){
            return (char) (97 - 1 + (number-25));
        }
        return (char) (97 + number);
    }
    
    private static char setAscii(int number){
        if (number < 32){
            return (char) (127 - (32-number));
        }
        if (number > 126){
            return (char) (31 + (number-126));
        }
        return (char) number;
    }
}
