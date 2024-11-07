public abstract class reptile extends Animal {
    private boolean scales;
    private boolean coldblood;
    private boolean Egglaying;

    public reptile(boolean scales, boolean blood, boolean Egglaying, String specie)
    {
        super(specie);
        this.scales = scales;
        this.coldblood = blood;
        this.Egglaying = Egglaying;
    }

    public String toString()
    {
        return (super.toString() + " Scales:" + this.scales + " Cold Blooded: " + this.coldblood + " is Egglaying: " + this.Egglaying);
    }
    
}
