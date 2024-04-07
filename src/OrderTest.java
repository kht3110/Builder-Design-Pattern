import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OrderTest {
    @Test
    public void testNichirintouOne() {
        Director director = new Director();

        NichirintouBuilder nichirintouBuilder = new NichirintouBuilder();

        director.buildTanjirouVersion(nichirintouBuilder);
        Nichirintou tanjirouVersion = nichirintouBuilder.getResult();

        String expected = "Nichirintou: type = Uchigatana, blades = 1, material = Placer iron, tsuba = Red and black hexagon, colour = Black";
        assertEquals("The product is not crafted according to the requirement.", expected, tanjirouVersion.toString());
    }

    @Test
    public void testSayaOne() {
        Director director = new Director();

        SayaBuilder sayaBuilder = new SayaBuilder();

        director.buildZenitsuSaya(sayaBuilder);
        Saya zenitsuSaya = sayaBuilder.getResult();

        String expected = "Saya: type = Uchigatana, blades = 1, material = Placer iron, tsuba = Small triangles with a golden border, colour = Yellow";
        assertEquals("The product is not crafted according to the requirement.", expected, zenitsuSaya.toString());
    }

    @Test
    public void testComplex() {
        Director director = new Director();

        NichirintouBuilder nichirintouBuilder = new NichirintouBuilder();
        SayaBuilder sayaBuilder = new SayaBuilder();

        director.buildKyojuroVersion(nichirintouBuilder);
        Nichirintou KyojuroVersion = nichirintouBuilder.getResult();

        director.buildKyojuroSaya(sayaBuilder);
        Saya KyojuroSaya = sayaBuilder.getResult();

        String expectedNichirintou = "Nichirintou: type = Uchigatana, blades = 1, material = Placer iron, tsuba = Yellow and red flame with an orange border, colour = Red";
        assertEquals("The product is not crafted according to the requirement.", expectedNichirintou, KyojuroVersion.toString());

        String expectedSaya = "Saya: type = Uchigatana, blades = 1, material = Placer iron, tsuba = Yellow and red flame with an orange border, colour = Red";
        assertEquals("The product is not crafted according to the requirement.", expectedSaya, KyojuroSaya.toString());
    }
}
