/**
 * This class implements the Blacksmith interface, which is the Builder Interface.
 * This allows the users to customize the Saya with the setters and return the product using the getResult method.
 */
public class SayaBuilder implements Blacksmith{

    private String type;
    private int blades;
    private String material;
    private String tsuba;
    private String colour;

    @Override
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void setBlades(int blades) {
        this.blades = blades;
    }

    @Override
    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public void setTsuba(String tsuba) {
        this.tsuba = tsuba;
    }

    @Override
    public void setColour(String colour) {
        this.colour = colour;
    }

    /**
     * Create the desired Nichirintou.
     * @return  The Nichirintou that is crafted
     */
    public Saya getResult() {
        return new Saya(type, blades, material, tsuba, colour);
    }

    @Override
    public String toString() {
        return "{type = " + type + ", blade = " + blades + ", material = " + material + ", tsuba = " + tsuba + ", colour = " + colour + "}";
    }
}
