/**
 * This class acts like a client to order the products.
 * This creates the builder objects of different products and pass them to the director for execution.
 */
public class Order {

    public static void main(String[] args) {
        Director director = new Director();

        NichirintouBuilder nichirintouBuilder = new NichirintouBuilder();

        director.buildTengenVersion(nichirintouBuilder);
        Nichirintou tengenVersion = nichirintouBuilder.getResult();
        System.out.println(tengenVersion);

        director.buildInosukeVersion(nichirintouBuilder);
        Nichirintou inosukeVersion = nichirintouBuilder.getResult();
        System.out.println(inosukeVersion);

        SayaBuilder sayaBuilder = new SayaBuilder();

        director.buildTanjirouSaya(sayaBuilder);
        Saya tanjirouSaya = sayaBuilder.getResult();
        System.out.println(tanjirouSaya);
    }
}
