class main {

    public static void main(String[] args) {
        Player p = new Player();
        p.attack();
        p.defend();
        p.castSpell("Fire ball");
        p.useWeapon();
    }
}

interface Character {
    void attack();
    void defend();
}

interface Mage{
    void castSpell(String spell);
}

interface Warrior{
    void useWeapon();
}

class Player implements Character,Mage,Warrior{

    public void attack(){
        System.out.println("The player attacks the enemy.");
    }
    public void defend(){
        System.out.println("The player defends against the ememy's attack.");
    }
    public void castSpell(String spell){
        System.out.println("The player casts "+spell);
    }
    public void useWeapon(){
        System.out.println("The player uses a weapon to attack.");
    }
}