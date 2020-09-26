package kata.flattenarray;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.junit.Assert;

public class SolutionTest {

    @Test
    public void simpleAdd() {
      assertEquals("Kata.add(3,5)", Kata.add(3).applyAsInt(5), 8);
    }
}
