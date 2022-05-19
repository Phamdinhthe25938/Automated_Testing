import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TriangleClassifierTest {

    @Test
    void triangleClassifier() {
        int side1=4;
        int side2=7;
        int side3=9;
        String Triangle = "tam giac thuong";
        String result = TriangleClassifier.TriangleClassifier(side1,side2,side3);
        assertEquals(Triangle, result);
    }
}