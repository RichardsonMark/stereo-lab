public class Stereo {

    private String name;
    private Radio radio;
    private RecordDeck recordDeck;
    private CdPlayer cdPlayer;

    public Stereo(String name, Radio radio, RecordDeck recordDeck, CdPlayer cdPlayer){
        this.name = name;
        this.radio = radio;
        this.recordDeck = recordDeck;
        this.cdPlayer = cdPlayer;
    }

    public String getName() {
        return name;
    }

    public String tuneRadio(String station){
        return "Radio tuned to " + radio.tune(station);
    }

    public String playCD(String string){
        return cdPlayer.play(string);
    }

    public String playRecord(String string){
        return recordDeck.play(string);
    }

    public String raiseVolume(){
        return "Turn it up!";
    }

    public String lowerVolume(){
        return "Turn it down!";
    }

    public String connect(){
        return "Connected to " + name;
    }
}
