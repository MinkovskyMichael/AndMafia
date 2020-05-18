package Model;//this is card object

public class CardObj {
    private String cardName;

    //getter
    public String CardName()
    {
        return cardName;
    }

    //setter
    public void String (String CardName)
    {
        this.cardName=CardName;
    }

    public CardObj(String CardName){
        cardName = CardName;
    }

    public CardObj(){}
}
