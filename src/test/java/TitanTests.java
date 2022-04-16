import org.junit.jupiter.api.Test;
import titans.ArmoredTitan;

import static org.junit.jupiter.api.Assertions.*;

/**
 * <p>In this class we test if the things we did have taken effect</p>
 * <p>Before anything we introduce a new titan named MAMAD.</p>
 * <p>In each organ test we can see :</p>
 * <p>1. The default hp</p>
 * <p>2. The default durability</p>
 * <p>3. The default k</p>
 * <p>Note: We only test damage for face and neck organ being sure that the formula will work for
 * other organs as well.</p>
 * <p>At last we also tested if we can get a boolean answer to see if the hp is destroyed
 * or not</p>
 * <p>(True = Health is destroyed // False = Health isn't destroyed) </p>
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
    public void FaceOrganTrueFalse_Test(){
        assertFalse(mamad.getFaceOrgan().takeDamage(40));// returns false because the damage can't destroy hp
        assertTrue(mamad.getFaceOrgan().takeDamage(90));// returns true because the damage can destroy hp
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
        assertFalse(mamad.getNeckOrgan().takeDamage(0));
    }
    @Test
    public void RightArmOrgan_Test(){
        assertEquals(mamad.getRightArmOrgan().getHp(), 80); // getting the default hp (i'm dum)
        assertEquals(mamad.getRightArmOrgan().getArmor().getDurability(),75); // getting the default armor
        assertEquals(mamad.getRightArmOrgan().getArmor().getK(),3.4); // getting the default K
    }
    @Test
    public void LeftArmOrgan_Test(){
        assertEquals(mamad.getLeftArmOrgan().getHp(), 80); // getting the default hp (i'm dum)
        assertEquals(mamad.getLeftArmOrgan().getArmor().getDurability(),75); // getting the default armor
        assertEquals(mamad.getLeftArmOrgan().getArmor().getK(),3.4); // getting the default K
    }
    @Test
    public void ChestOrgan_Test(){
        assertEquals(mamad.getChestOrgan().getHp(), 210); // getting the default hp (i'm dum)
        assertEquals(mamad.getChestOrgan().getArmor().getDurability(),115); // getting the default armor
        assertEquals(mamad.getChestOrgan().getArmor().getK(),12.2); // getting the default K
    }
    @Test
    public void StomachOrgan_Test(){
        assertEquals(mamad.getStomachOrgan().getHp(), 50); // getting the default hp (i'm dum)
        assertEquals(mamad.getStomachOrgan().getArmor().getDurability(),100); // getting the default armor
        assertEquals(mamad.getStomachOrgan().getArmor().getK(),11.2); // getting the default K
    }
    @Test
    public void RightLegOrgan_Test(){
        assertEquals(mamad.getRightLegArmor().getHp(), 55); // getting the default hp (i'm dum)
        assertEquals(mamad.getRightLegArmor().getArmor().getDurability(),110); // getting the default armor
        assertEquals(mamad.getRightLegArmor().getArmor().getK(),12.0); // getting the default K
    }
    @Test
    public void LeftLegOrgan_Test(){
        assertEquals(mamad.getLeftLegArmor().getHp(), 55); // getting the default hp (i'm dum)
        assertEquals(mamad.getLeftLegArmor().getArmor().getDurability(),110); // getting the default armor
        assertEquals(mamad.getLeftLegArmor().getArmor().getK(),12.0); // getting the default K
    }
    @Test
    public void RightFootOrgan_Test(){
        assertEquals(mamad.getRightFootOrgan().getHp(), 45); // getting the default hp (i'm dum)
        assertEquals(mamad.getRightFootOrgan().getArmor().getDurability(),76.3); // getting the default armor
        assertEquals(mamad.getRightFootOrgan().getArmor().getK(),8.2); // getting the default K
    }
    @Test
    public void LeftFootOrgan_Test(){
        assertEquals(mamad.getLeftFootOrgan().getHp(), 45); // getting the default hp (i'm dum)
        assertEquals(mamad.getLeftFootOrgan().getArmor().getDurability(),76.3); // getting the default armor
        assertEquals(mamad.getLeftFootOrgan().getArmor().getK(),8.2); // getting the default K
    }
}
