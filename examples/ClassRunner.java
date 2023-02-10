public class ClassRunner {
    
    public static void main(String[] args) {
        Biycle vihangasBicycle = new Biycle();
        Biycle lakmalsBiycle = new Biycle();
        vihangasBicycle.stop();
        lakmalsBiycle.increaseSpeed(40);
        System.out.println("[Vihanga] speed Print: " + vihangasBicycle.speed);
        System.out.println("[Lakmal] speed Print: " + lakmalsBiycle.speed);
        vihangasBicycle.increaseSpeed(50);
        lakmalsBiycle.increaseSpeed(10);
        System.out.println("----------------");
        System.out.println("[Vihanga] speed Print: " + vihangasBicycle.speed);
        System.out.println("[Lakmal] speed Print: " + lakmalsBiycle.speed);
        vihangasBicycle.applyBreak();
        System.out.println("-----------------");
        System.out.println("[Vihanga] speed Print: " + vihangasBicycle.speed);
        System.out.println("[Lakmal] speed Print: " + lakmalsBiycle.speed);
        
    }
}
