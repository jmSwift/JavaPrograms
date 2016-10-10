//how many people havecats, sacks , and kits

public class StIves
{
    public static void main(String[] args)
    {
        int wives = 7;
        int sacks;
        int cats;
        int kits;
        int total;
        
        sacks = wives*7;
        cats = sacks*7;
        kits = 7*cats;
        total = 1 + wives + sacks+ cats + kits;
        
        System.out.println("Wives: "+ wives);
        System.out.println("Sacks"+ sacks);
        System.out.println("Cats"+ cats);
        System.out.println("Kits"+ kits);
        System.out.println("Man, wives, sack, cats, and kits: "+ total);
        
    }
}

