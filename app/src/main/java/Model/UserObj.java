package Model;

import android.nfc.cardemulation.CardEmulation;

public class UserObj {
    private String userName;
    private CardObj co;
    //getter
    public String UserName()
    {
        return userName;
    }

    public CardObj Co(){
        return co;
    }
    //setter
    public void String (String UserName)
    {
        this.userName=UserName;
    }

    public UserObj(String UserName, CardObj Co){
        userName = UserName;
        co = Co;
    }

    public UserObj(){}
}
