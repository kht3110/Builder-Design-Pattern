public class Saya {
    private final String type;
    private final int blades;
    private final String material;
    private final String tsuba;
    private final String colour;

    public Saya(String type, int blades, String material, String tsuba, String colour) {
        this.type = type;
        this.blades = blades;
        this.material = material;
        this.tsuba = tsuba;
        this.colour = colour;
    }

    public String getType() {
        return type;
    }

    public int getBlades() {
        return blades;
    }

    public String getMaterial() {
        return material;
    }

    public String getTsuba() {
        return tsuba;
    }

    public String getColour() {
        return colour;
    }

    @Override
    public String toString() {
        return "Saya: " + "type = " + type + ", blades = " + blades
                + ", material = " + material + ", tsuba = " + tsuba
                + ", colour = " + colour;
    }
}

