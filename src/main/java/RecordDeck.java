public class RecordDeck extends Component {

    private int playSpeed;

    public RecordDeck(String make, String model, int playSpeed){
        super(make, model);
        this.playSpeed = playSpeed;
    }

    public String play(String string){
        return string + " is playing!";
    }

    public int getPlaySpeed() {
        return playSpeed;
    }

    public void setPlaySpeed(int playSpeed) {
        this.playSpeed = playSpeed;
    }
}
