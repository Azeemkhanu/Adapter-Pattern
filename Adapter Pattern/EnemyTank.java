import java.util.Random;
public class EnemyTank extends EnemyAttacker{
    Random generator=new Random();

    @Override
    public void fireweapon() {
        int attackDamage=generator.nextInt(10)+1;
        System.out.println("Enemy Tank does "+attackDamage+" damage");        
    }

    @Override
    public void dirveForward() {
        int movement=generator.nextInt(5)+1;
        System.out.println("Enemy Tank moves "+movement+" space");   
        
    }

    @Override
    public void assignDriver(String driverName) {
        System.out.println(driverName+" is driving the tank");        
    }
    
}
