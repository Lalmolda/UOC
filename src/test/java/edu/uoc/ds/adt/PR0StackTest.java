package edu.uoc.ds.adt;

import org.junit.After;
import org.junit.Before;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PR0StackTest {

    PR0Stack pr0q;

    private void fillStack() {
        for (int c = 0; c < 15; c++) {
            pr0q.push(funcionCalculo(c));
        }
    }

    private static int funcionCalculo(int number) {

        int resultado = (int) Math.pow(number, 2) + 3*number +2;
        return resultado;
    }

    @Before
    public void setUp() {
        this.pr0q = new PR0Stack();

        assertNotNull(this.pr0q.getStack());
        this.fillStack();

    }

    @After
    public void release() {
        this.pr0q = null;
    }


    @org.junit.Test
    public void stackTest() {

        assertEquals(this.pr0q.CAPACITY, this.pr0q.getStack().size());

        assertEquals(240, pr0q.pop());
        assertEquals(210, pr0q.pop());
        assertEquals(182, pr0q.pop());
        assertEquals(156, pr0q.pop());
        assertEquals(132, pr0q.pop());
        assertEquals(110, pr0q.pop());
        assertEquals(90, pr0q.pop());
        assertEquals(72, pr0q.pop());
        assertEquals(56, pr0q.pop());
        assertEquals(42, pr0q.pop());
        assertEquals(30, pr0q.pop());
        assertEquals(20, pr0q.pop());
        assertEquals(12, pr0q.pop());
        assertEquals(6, pr0q.pop());
        assertEquals(2, pr0q.pop());
        //assertEquals(this.pr0q.clearAllStack(), new String("8 7 6 5 4 3 2 1 0 "));

        assertEquals(0, this.pr0q.getStack().size());
    }
}
