import java.util.Objects;

public class Smite{
    public String name;
    public int damage;
    public int damageToChampions;
    public int rechargeTime;
    public int currentMaxRechargeTime;
    public int defaultMaxRechargeTime;
    public int cooldown;
    public int currentMaxCooldown;
    public int defaultMaxCooldown;

    public Smite(String name){
        this.name = name;
        if(Objects.equals(name, "Smite"))
            this.damage = 450;
        else if(Objects.equals(name, "Chilling Smite"))
                this.damage = 900;
            else if(Objects.equals(name, "Challenging Smite"))
                    this.damage = 900;
        this.damageToChampions = 0;
        this.rechargeTime = 15;
        this.currentMaxRechargeTime = 15;
        this.defaultMaxRechargeTime = 15;
        this.cooldown = 90;
        this.currentMaxCooldown = 90;
        this.defaultMaxCooldown = 90;
    }

    public void changeDamage(int level){
        if(Objects.equals(this.name, "Challenging Smite"))
            this.damageToChampions = 48 + (77 * level / 17);
        else if(Objects.equals(this.name, "Chilling Smite"))
                this.damageToChampions = 12 + 8 * level;
    }
}
