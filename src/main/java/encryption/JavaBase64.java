package encryption;

import java.util.Base64;

public class JavaBase64{
    
    private JavaBase64(){
    }
    
    public static String encodeByBase64(String arg){
        return Base64.getEncoder()
            .encodeToString(arg.getBytes());
    }
    
    public static String encodeByUrl(String arg){
        return Base64.getUrlEncoder()
            .encodeToString(arg.getBytes());
    }
    
    public static String decodeByBase64(String arg){
        return new String(Base64.getDecoder().decode(arg));
    }
    
    public static String decodeByUrl(String arg){
        return new String(Base64.getUrlDecoder().decode(arg));
    }
    
}
