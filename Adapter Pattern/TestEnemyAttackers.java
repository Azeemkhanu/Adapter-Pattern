public class TestEnemyAttackers{

    public static void main(String[] args) {
        EnemyTank rx7Tank=new EnemyTank();
        EnemyRobort fridRobort=new EnemyRobort();
        EnemyRobortAdapter robortAdapter=new EnemyRobortAdapter(fridRobort);


        System.out.println("The Robort:");

        fridRobort.reactToHuman("Azeem");
        fridRobort.smashWithHand();
        fridRobort.walkForward();

        System.out.println("\n--------------------------------------------------------------------");
        System.out.println("The Tank:");

        rx7Tank.assignDriver("Khan");
        rx7Tank.fireweapon();
        rx7Tank.dirveForward();

        System.out.println("--------------------------------------------------------------------");
        System.out.println("The Robort with Adapter");

        robortAdapter.assignDriver("Hassan");
        robortAdapter.fireweapon();
        robortAdapter.dirveForward();
        System.out.println("--------------------------------------------------------------------");

    }
} 