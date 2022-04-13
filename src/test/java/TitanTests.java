import org.junit.jupiter.api.Test;
import titans.ArmoredTitan;

import static org.junit.jupiter.api.Assertions.*;

/**
 * In this class we test if the things we did have taken effect
 * In each test we can see :
 * 1. the default hp
 * 2. the default durability
 * 3. the default k
 * 4. giving damage to the organ and then testing it
 * 5. giving damage to the armor and then testing it
 */
public class TitanTests {
    ArmoredTitan mamad = ArmoredTitan.create();
    @Test
    public void FaceOrgan_Test(){
        assertEquals(mamad.getFaceOrgan().getHp(), 30); // getting the default hp (i'm dum)
        assertEquals(mamad.getFaceOrgan().getArmor().getDurability(),60); // getting the default armor
        assertEquals(mamad.getFaceOrgan().getArmor().getK(),1.8); // getting the default K
        mamad.getFaceOrgan().takeDamage(40);// giving damage to organ
        assertEquals(mamad.getFaceOrgan().getHp(),2);// making sure it happened
        mamad.getFaceOrgan().getArmor().takeDamage(50);// giving damage to armor
        assertEquals(mamad.getFaceOrgan().getArmor().getDurability(),32.22);// making sure it happened
    }
    @Test
    public void NeckOrgan_Test(){
        assertEquals(mamad.getNeckOrgan().getHp(), 45); // getting the default hp (i'm dum)
        assertEquals(mamad.getNeckOrgan().getArmor().getDurability(),50); // getting the default armor
        assertEquals(mamad.getNeckOrgan().getArmor().getK(),2.1); // getting the default K
        mamad.getNeckOrgan().takeDamage(50);// giving damage to organ
        assertEquals(mamad.getNeckOrgan().getHp(),7.5);// making sure it happened
        mamad.getNeckOrgan().getArmor().takeDamage(60);// giving damage to armor
        assertEquals(mamad.getNeckOrgan().getArmor().getDurability(),21.43);// making sure it happened
    }
    @Test
    public void RightArmOrgan_Test(){
        assertEquals(mamad.getRightArmOrgan().getHp(), 80); // getting the default hp (i'm dum)
        assertEquals(mamad.getRightArmOrgan().getArmor().getDurability(),75); // getting the default armor
        assertEquals(mamad.getRightArmOrgan().getArmor().getK(),3.4); // getting the default K
        mamad.getRightArmOrgan().takeDamage(130);// giving damage to the organ
        assertEquals(mamad.getRightArmOrgan().getHp(),-1.25);// making sure it happened
        mamad.getRightArmOrgan().getArmor().takeDamage(149);// giving damage to armor
        assertEquals(mamad.getRightArmOrgan().getArmor().getDurability(),31.18);// making sure it happened
    }
    @Test
    public void LeftArmOrgan_Test(){
        assertEquals(mamad.getLeftArmOrgan().getHp(), 80); // getting the default hp (i'm dum)
        assertEquals(mamad.getLeftArmOrgan().getArmor().getDurability(),75); // getting the default armor
        assertEquals(mamad.getLeftArmOrgan().getArmor().getK(),3.4); // getting the default K
        mamad.getLeftArmOrgan().takeDamage(130);// giving damage to the organ
        assertEquals(mamad.getLeftArmOrgan().getHp(),-1.25);// making sure it happened
        mamad.getLeftArmOrgan().getArmor().takeDamage(149);// giving damage to armor
        assertEquals(mamad.getLeftArmOrgan().getArmor().getDurability(),31.18);// making sure it happened
    }
    @Test
    public void ChestOrgan_Test(){
        assertEquals(mamad.getChestOrgan().getHp(), 210); // getting the default hp (i'm dum)
        assertEquals(mamad.getChestOrgan().getArmor().getDurability(),115); // getting the default armor
        assertEquals(mamad.getChestOrgan().getArmor().getK(),12.2); // getting the default K
        mamad.getChestOrgan().takeDamage(200);// giving damage to the organ
        assertEquals(mamad.getChestOrgan().getHp(),125);// making sure it happened
        mamad.getChestOrgan().getArmor().takeDamage(150);// giving damage to armor
        assertEquals(mamad.getChestOrgan().getArmor().getDurability(),102.7);// making sure it happened
    }
    @Test
    public void StomachOrgan_Test(){
        assertEquals(mamad.getStomachOrgan().getHp(), 50); // getting the default hp (i'm dum)
        assertEquals(mamad.getStomachOrgan().getArmor().getDurability(),100); // getting the default armor
        assertEquals(mamad.getStomachOrgan().getArmor().getK(),11.2); // getting the default K
        mamad.getStomachOrgan().takeDamage(70);// giving damage to the organ
        assertEquals(mamad.getStomachOrgan().getHp(),15);// making sure it happened
        mamad.getStomachOrgan().getArmor().takeDamage(200);// giving damage to armor
        assertEquals(mamad.getStomachOrgan().getArmor().getDurability(),82.14);// making sure it happened
    }
    @Test
    public void RightLegOrgan_Test(){
        assertEquals(mamad.getRightLegArmor().getHp(), 55); // getting the default hp (i'm dum)
        assertEquals(mamad.getRightLegArmor().getArmor().getDurability(),110); // getting the default armor
        assertEquals(mamad.getRightLegArmor().getArmor().getK(),12.0); // getting the default K
        mamad.getRightLegArmor().takeDamage(100);// giving damage to the organ
        assertEquals(mamad.getRightLegArmor().getHp(),10);// making sure it happened
        mamad.getRightLegArmor().getArmor().takeDamage(350);// giving damage to armor
        assertEquals(mamad.getRightLegArmor().getArmor().getDurability(),80.83);// making sure it happened
    }
    @Test
    public void LeftLegOrgan_Test(){
        assertEquals(mamad.getLeftLegArmor().getHp(), 55); // getting the default hp (i'm dum)
        assertEquals(mamad.getLeftLegArmor().getArmor().getDurability(),110); // getting the default armor
        assertEquals(mamad.getLeftLegArmor().getArmor().getK(),12.0); // getting the default K
        mamad.getLeftLegArmor().takeDamage(100);// giving damage to the organ
        assertEquals(mamad.getLeftLegArmor().getHp(),10);// making sure it happened
        mamad.getLeftLegArmor().getArmor().takeDamage(350);// giving damage to armor
        assertEquals(mamad.getLeftLegArmor().getArmor().getDurability(),80.83);// making sure it happened
    }
    @Test
    public void RightFootOrgan_Test(){
        assertEquals(mamad.getRightFootOrgan().getHp(), 45); // getting the default hp (i'm dum)
        assertEquals(mamad.getRightFootOrgan().getArmor().getDurability(),76.3); // getting the default armor
        assertEquals(mamad.getRightFootOrgan().getArmor().getK(),8.2); // getting the default K
        mamad.getRightFootOrgan().takeDamage(20);// giving damage to the organ
        assertEquals(mamad.getRightFootOrgan().getHp(),32.63);// making sure it happened
        mamad.getRightFootOrgan().getArmor().takeDamage(200);// giving damage to armor
        assertEquals(mamad.getRightFootOrgan().getArmor().getDurability(),51.91);// making sure it happened
    }
    @Test
    public void LeftFootOrgan_Test(){
        assertEquals(mamad.getLeftFootOrgan().getHp(), 45); // getting the default hp (i'm dum)
        assertEquals(mamad.getLeftFootOrgan().getArmor().getDurability(),76.3); // getting the default armor
        assertEquals(mamad.getLeftFootOrgan().getArmor().getK(),8.2); // getting the default K
        mamad.getLeftFootOrgan().takeDamage(20);// giving damage to the organ
        assertEquals(mamad.getLeftFootOrgan().getHp(),32.63);// making sure it happened
        mamad.getLeftFootOrgan().getArmor().takeDamage(200);// giving damage to armor
        assertEquals(mamad.getLeftFootOrgan().getArmor().getDurability(),51.91);// making sure it happened
    }
}
