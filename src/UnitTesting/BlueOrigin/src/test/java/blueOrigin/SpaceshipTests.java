package blueOrigin;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SpaceshipTests {
    //TODO: TEST ALL THE FUNCTIONALITY OF THE PROVIDED CLASS Spaceship

    @Test
    public void testAddAstronauts(){

        Astronaut astronaut = new Astronaut("Ivan", 10);
        List<Astronaut> astronauts = new ArrayList<>();
        astronauts.add(astronaut);
        Spaceship spaceship = new Spaceship("Spaceship", 10);
        spaceship.add(astronaut);

        Assert.assertEquals(1, spaceship.getCount() );
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddAstronautsExist(){

        Astronaut astronaut = new Astronaut("Ivan", 10);
        List<Astronaut> astronauts = new ArrayList<>();
        astronauts.add(astronaut);

        Spaceship spaceship = new Spaceship("Spaceship", 3);
        spaceship.add(astronaut);
        spaceship.add(astronaut);

    }
    @Test(expected = IllegalArgumentException.class)
    public void testAddAstronautNotEnoughCapacity(){

        Astronaut astronaut = new Astronaut("Ivan", 10);
        Astronaut astronaut1 = new Astronaut("Gosho", 10);

        Spaceship spaceship = new Spaceship("Spaceship", 1);
        spaceship.add(astronaut);
        spaceship.add(astronaut1);

    }

    @Test
    public void testRemoveAstronaut(){

        Astronaut astronaut = new Astronaut("Ivan", 10);
        Astronaut astronaut1 = new Astronaut("Gosho", 10);
        Spaceship spaceship = new Spaceship("Spaceship", 3);

        spaceship.add(astronaut);
        Assert.assertEquals(1, spaceship.getCount());
        spaceship.remove(astronaut.getName());
        Assert.assertEquals(0, spaceship.getCount());

    }




    @Test(expected = NullPointerException.class)
    public void testSetEmptyName(){

        Spaceship spaceship = new Spaceship("", 10);

    }
    @Test(expected = NullPointerException.class)
    public void testSetEmptyNameNull(){

        Spaceship spaceship = new Spaceship(null, 10);

    }

    @Test (expected = IllegalArgumentException.class)
    public void testSetZeroCapacity(){
        Spaceship spaceship = new Spaceship("Spaceship", -1);

    }
    @Test
    public void testSpaceshipGetName(){
        Spaceship spaceship = new Spaceship("Spaceship", 2);

        Assert.assertEquals("Spaceship", spaceship.getName());

    }

}
