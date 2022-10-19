package shopAndGoods;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;

public class ShopTest {
    // TODO

    Shop shop = new Shop();

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testGetShelves() {
        Assert.assertEquals(12, shop.getShelves().size());

    }

    @Test
    public void testAddGoodsShouldAdd() throws OperationNotSupportedException {
        Goods banana = new Goods("banana", "1");
        Goods tomato = new Goods("tomato", "2");
        Goods bike = new Goods("bike", "3");
        Assert.assertEquals("Goods: 1 is placed successfully!", shop.addGoods("Shelves1", banana));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddGoodsOnTakenShelf() throws OperationNotSupportedException {
        Goods banana = new Goods("banana", "1");
        Goods tomato = new Goods("tomato", "2");
        Goods bike = new Goods("bike", "3");
        shop.addGoods("Shelves1", tomato);
        shop.addGoods("Shelves1", banana);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddGoodsOnNonExistingShelf() throws OperationNotSupportedException {
        Goods banana = new Goods("banana", "1");
        Goods tomato = new Goods("tomato", "2");
        Goods bike = new Goods("bike", "3");
        shop.addGoods("Shelves100", tomato);
    }


    @Test(expected = OperationNotSupportedException.class)
    public void testAddExistingGood() throws OperationNotSupportedException {
        Goods banana = new Goods("banana", "1");
        Goods tomato = new Goods("tomato", "2");
        Goods bike = new Goods("bike", "3");
        shop.addGoods("Shelves1", tomato);
        shop.addGoods("Shelves2", tomato);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveGoodsFromNonExistingShelf() throws OperationNotSupportedException {
        Goods banana = new Goods("banana", "1");
        Goods tomato = new Goods("tomato", "2");
        Goods bike = new Goods("bike", "3");
        shop.removeGoods("Shelves100", tomato);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveDifferentGoodsFromExistingShelf() throws OperationNotSupportedException {
        Goods banana = new Goods("banana", "1");
        Goods tomato = new Goods("tomato", "2");
        Goods bike = new Goods("bike", "3");
        shop.addGoods("Shelves1", banana);
        shop.removeGoods("Shelves1", tomato);
    }

    @Test
    public void testRemoveShouldRemove() throws OperationNotSupportedException {
        Goods banana = new Goods("banana", "1");
        Goods tomato = new Goods("tomato", "2");
        Goods bike = new Goods("bike", "3");
        Assert.assertEquals("bike", bike.getName());
        shop.addGoods("Shelves1", banana);
        Assert.assertEquals(String.format("Goods: %s is removed successfully!", banana.getGoodsCode()), shop.removeGoods("Shelves1", banana));
        Assert.assertNull(shop.getShelves().get("Shelves1"));


    }


}