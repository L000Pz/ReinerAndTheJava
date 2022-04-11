import org.junit.jupiter.api.Test;
import titans.ArmoredTitan;

import static org.junit.jupiter.api.Assertions.*;

public class TitanTests {
    ArmoredTitan mamad = ArmoredTitan.create();
    @Test
    public void FaceOrgan_Test(){
        assertEquals(mamad.getFaceOrgan().getHp(), 30); // getting the default hp (i'm dum)
        mamad.getFaceOrgan().takeDamage(40);// giving damage to organ
        assertEquals(mamad.getFaceOrgan().getHp(),2);// making sure it happened
        mamad.getFaceOrgan().getArmor().takeDamage(50);// giving damage to armor
        assertEquals(mamad.getFaceOrgan().getArmor().getDurability(),32.22);// making sure it happened
    }
    @Test
    public void NeckOrgan_Test(){
        mamad.getNeckOrgan().takeDamage(50);// giving damage to organ
        assertEquals(mamad.getNeckOrgan().getHp(),7.5);// making sure it happened
        mamad.getNeckOrgan().getArmor().takeDamage(60);// giving damage to armor
        assertEquals(mamad.getNeckOrgan().getArmor().getDurability(),21.43);// making sure it happened
    }
    @Test
    public void RightArmOrgan_Test(){
        mamad.getRightArmOrgan().takeDamage(130);// giving damage to the organ
        assertEquals(mamad.getRightArmOrgan().getHp(),-1.25);// making sure it happened
        mamad.getRightArmOrgan().getArmor().takeDamage(149);// giving damage to armor
        assertEquals(mamad.getRightArmOrgan().getArmor().getDurability(),31.18);// making sure it happened
    }
    @Test
    public void LeftArmOrgan_Test(){
        mamad.getLeftArmOrgan().takeDamage(130);// giving damage to the organ
        assertEquals(mamad.getLeftArmOrgan().getHp(),-1.25);// making sure it happened
        mamad.getLeftArmOrgan().getArmor().takeDamage(149);// giving damage to armor
        assertEquals(mamad.getLeftArmOrgan().getArmor().getDurability(),31.18);// making sure it happened
    }
    @Test
    public void ChestOrgan_Test(){
        mamad.getChestOrgan().takeDamage(200);// giving damage to the organ
        assertEquals(mamad.getChestOrgan().getHp(),125);// making sure it happened
        mamad.getChestOrgan().getArmor().takeDamage(150);// giving damage to armor
        assertEquals(mamad.getChestOrgan().getArmor().getDurability(),102.7);// making sure it happened
    }
    @Test
    public void StomachOrgan_Test(){
        mamad.getStomachOrgan().takeDamage(70);// giving damage to the organ
        assertEquals(mamad.getStomachOrgan().getHp(),15);// making sure it happened
        mamad.getStomachOrgan().getArmor().takeDamage(200);// giving damage to armor
        assertEquals(mamad.getStomachOrgan().getArmor().getDurability(),82.14);// making sure it happened
    }
    @Test
    public void RightLegOrgan_Test(){
        mamad.getRightLegArmor().takeDamage(100);// giving damage to the organ
        assertEquals(mamad.getRightLegArmor().getHp(),10);// making sure it happened
        mamad.getRightLegArmor().getArmor().takeDamage(350);// giving damage to armor
        assertEquals(mamad.getRightLegArmor().getArmor().getDurability(),80.83);// making sure it happened
    }
    @Test
    public void LeftLegOrgan_Test(){
        mamad.getLeftLegArmor().takeDamage(100);// giving damage to the organ
        assertEquals(mamad.getLeftLegArmor().getHp(),10);// making sure it happened
        mamad.getLeftLegArmor().getArmor().takeDamage(350);// giving damage to armor
        assertEquals(mamad.getLeftLegArmor().getArmor().getDurability(),80.83);// making sure it happened
    }
    @Test
    public void RightFootOrgan_Test(){
        mamad.getRightFootOrgan().takeDamage(20);// giving damage to the organ
        assertEquals(mamad.getRightFootOrgan().getHp(),32.63);// making sure it happened
        mamad.getRightFootOrgan().getArmor().takeDamage(200);// giving damage to armor
        assertEquals(mamad.getRightFootOrgan().getArmor().getDurability(),51.91);// making sure it happened
    }
    @Test
    public void LeftFootOrgan_Test(){
        mamad.getLeftFootOrgan().takeDamage(20);// giving damage to the organ
        assertEquals(mamad.getLeftFootOrgan().getHp(),32.63);// making sure it happened
        mamad.getLeftFootOrgan().getArmor().takeDamage(200);// giving damage to armor
        assertEquals(mamad.getLeftFootOrgan().getArmor().getDurability(),51.91);// making sure it happened
    }
}
