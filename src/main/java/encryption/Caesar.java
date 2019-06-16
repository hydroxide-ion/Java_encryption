package encryption;

/**
* シーザー暗号の処理。
*/
public class Caesar{

    /**
    * コンストラクタ。staticなのでインスタンス生成しない。
    */
    private Caesar(){
    }
    
    /**
    * シーザー暗号方式でエンコード
    * 
    * @param 文字列
    * @param シフト文字数
    * @return 変換後の文字列
    */
    public static String encode(String arg, int shift){
        String result = "";
        // 一文字ずつエンコード
        for(int i=0;i<arg.length();i++){
            result += String.valueOf(
                (char) (arg.charAt(i) + shift)
            );
        }
        return result;
    }
    
    /**
    * シーザー暗号方式でデコード
    * 
    * @param 文字列
    * @param シフト文字数
    * @return 変換後の文字列
    */
    public static String decode(String arg, int shift){
        String result = "";
        // 一文字ずつデコード
        for(int i=0;i<arg.length();i++){
            result += String.valueOf(
                (char) (arg.charAt(i) - shift)
            );
        }
        return result;
    }
}
