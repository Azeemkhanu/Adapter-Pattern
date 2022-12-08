public class EnemyRobortAdapter extends EnemyAttacker{
    EnemyRobort theRobort;

    public EnemyRobortAdapter(EnemyRobort theRobort) {
        this.theRobort = theRobort;
    }

    @Override
    public void fireweapon() {
        theRobort.smashWithHand();
        
    }

    @Override
    public void dirveForward() {
        theRobort.walkForward();
    }

    @Override
    public void assignDriver(String driverName) {
        theRobort.reactToHuman(driverName);        
    }
    
}
