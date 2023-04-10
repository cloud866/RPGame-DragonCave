public class Skeleton extends Creature implements Fighting {

    public Skeleton() {
        super("Skeleton", 10, 20);
    }

    @Override
    public void attack(Creature enemy) {
        super.attack(enemy);
    }
}
