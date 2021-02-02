public class CdPlayer extends Component {

    private int numberOfCds;

    public CdPlayer(String make, String model, int numberOfCds){
        super(make, model);
        this.numberOfCds = numberOfCds;
    }

    public String play(String string){
        return string + " is playing!";
    }

    public int getNumberOfCds() {
        return numberOfCds;
    }

    public void setNumberOfCds(int numberOfCds) {
        this.numberOfCds = numberOfCds;
    }
}
