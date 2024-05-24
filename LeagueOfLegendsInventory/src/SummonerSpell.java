public class SummonerSpell {
    public String name;
    public int cooldown;
    public int currentMaxCooldown;
    public int defaultMaxCooldown;

    public SummonerSpell(String name, int defaultMaxCooldown){
        this.name = name;
        this.cooldown = defaultMaxCooldown;
        this.currentMaxCooldown = defaultMaxCooldown;
        this.defaultMaxCooldown = defaultMaxCooldown;
    }

    public SummonerSpell(){
        this.name = "";
        this.cooldown = 0;
        this.currentMaxCooldown = 0;
        this.defaultMaxCooldown = 0;
    }
}
