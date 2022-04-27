import static org.junit.jupiter.api.Assertions.*;

class farturaTest {

    @org.junit.jupiter.api.Test
    void ivaredu() {
        double num = 12.76;
        num *= 1.04;
        fartura f = new fartura(12.76);
        f.ivareduced();
        assertEquals(num, f.total);
    }

    @org.junit.jupiter.api.Test
    void iva() {
        double num = 12.76;
        num *= 1.21;
        fartura f = new fartura(12.76);
        f.iva();
        assertEquals(num, f.total);
    }

    @org.junit.jupiter.api.Test
    void descuentoesp() {
        double num = 12.76;
        num *= 1.21;
        num *= 0.9;
        fartura f = new fartura(12.76);
        f.descuentoesp();
        assertEquals(num, f.total);
    }
}