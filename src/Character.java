public abstract class Character {

    public int attackPoints;
    public int defensePoints;
    public int maxHP;
    public int currentHP;
    protected String characterName;
    protected String skillName;
    protected Profession professionName;


    public Character(int AP, int DP, int maxHP) {
        this.attackPoints = AP;
        this.defensePoints = DP;
        this.maxHP = maxHP;
    }

    public void attack(Character enemy) {
        int dmg = attackPoints;
        System.out.println(getCharacterName() + " used " + getSkillName() + " and it took " + dmg);
    }

    public void getAttacked(int dmg) {
        dmg = -defensePoints / 10;
        if (currentHP > dmg) {
            currentHP -= dmg;
        } else {
            currentHP = 0;
            deadInfo();
        }
    }

    private final void deadInfo() {
        System.out.println("You are dead.");
    }

    public void heal(int hp) {
        if (currentHP > 0){
            if (currentHP + hp > maxHP){
                currentHP = maxHP;
            }
            else {currentHP += hp;}

        }
    }

    public int getAttackPoints() {
        return attackPoints;
    }

    public int getDefensePoints() {
        return defensePoints;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public int getCurrentHP() {
        return currentHP;
    }

    public String getCharacterName() {
        return characterName;
    }

    public String getSkillName() {
        return skillName;
    }

    public Profession getProfessionName() {
        return professionName;
    }
}
