public class Skateboard extends Vehicle{

    private String deckType;

    public Skateboard(String name, int wheels, String deckType) {
        super(name,wheels);
        this.deckType = deckType;
    }

    public String getDeckType(){
        return deckType;
    }

    public void setDeckType(String decks){
        deckType = decks;
    }

}
