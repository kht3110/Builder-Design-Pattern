/**
 * This class acts like the boss that instructs its workers, i.e. the builder classes, to work in a particular order.
 * With in this class, the products that will be created are listed here, each with a separate method and a set of instructions.
 */
public class Director {

    public void buildTanjirouVersion(Blacksmith blacksmith) {
        blacksmith.setType("Uchigatana");
        blacksmith.setBlades(1);
        blacksmith.setMaterial("Placer iron");
        blacksmith.setTsuba("Red and black hexagon");
        blacksmith.setColour("Black");
    }

    public void buildInosukeVersion(Blacksmith blacksmith) {
        blacksmith.setType("Serrated Knife");
        blacksmith.setBlades(2);
        blacksmith.setMaterial("Placer iron");
        blacksmith.setTsuba("None");
        blacksmith.setColour("Blue-grey");
    }

    public void buildTengenVersion(Blacksmith blacksmith) {
        blacksmith.setType("Broadsword");
        blacksmith.setBlades(2);
        blacksmith.setMaterial("Placer iron");
        blacksmith.setTsuba("Golden colver surrounded by ble stripes");
        blacksmith.setColour("Orange");
    }

    public void buildKyojuroVersion(Blacksmith blacksmith) {
        blacksmith.setType("Uchigatana");
        blacksmith.setBlades(1);
        blacksmith.setMaterial("Placer iron");
        blacksmith.setTsuba("Yellow and red flame with an orange border");
        blacksmith.setColour("Red");
    }

    public void buildTanjirouSaya(Blacksmith blacksmith) {
        blacksmith.setType("Uchigatana");
        blacksmith.setBlades(1);
        blacksmith.setMaterial("Placer iron");
        blacksmith.setTsuba("Red and black hexagon");
        blacksmith.setColour("Black");
    }

    public void buildZenitsuSaya(Blacksmith blacksmith) {
        blacksmith.setType("Uchigatana");
        blacksmith.setBlades(1);
        blacksmith.setMaterial("Placer iron");
        blacksmith.setTsuba("Small triangles with a golden border");
        blacksmith.setColour("Yellow");
    }

    public void buildKyojuroSaya(Blacksmith blacksmith) {
        blacksmith.setType("Uchigatana");
        blacksmith.setBlades(1);
        blacksmith.setMaterial("Placer iron");
        blacksmith.setTsuba("Yellow and red flame with an orange border");
        blacksmith.setColour("Red");
    }
}
