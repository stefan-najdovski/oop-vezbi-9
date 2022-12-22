public class Main {
    public static void main(String[] args) {
        Vraboten vraboten = new Vraboten("Stefan", "Najdovski", 50000.0);
        XML xml = new XML();
        xml.createXMLFile("vraboten.xml", vraboten);
    }
}