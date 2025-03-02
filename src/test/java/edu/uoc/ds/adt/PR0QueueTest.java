package edu.uoc.ds.adt;

import org.junit.After;
import org.junit.Before;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PR0QueueTest {

    PR0Queue pr0q;


    private void fillQueue() {
        for (int c = 0; c < 15; c++) {
            pr0q.add(funcionCalculo(c));
        }
    }

    private static int funcionCalculo(int number) {

        int resultado = (int) Math.pow(number, 2) + 3*number +2;
        return resultado;
    }

    @Before
    public void setUp() {
        this.pr0q = new PR0Queue();

        assertNotNull(this.pr0q.getQueue());
        fillQueue();
    }

    @After
    public void release() {
        this.pr0q = null;
    }


    @org.junit.Test
    public void queueTest() {
        assertEquals(this.pr0q.CAPACITY, this.pr0q.getQueue().size());

        assertEquals(2, pr0q.poll());
        assertEquals(6, pr0q.poll());
        assertEquals(12, pr0q.poll());
        assertEquals(20, pr0q.poll());
        assertEquals(30, pr0q.poll());
        assertEquals(42, pr0q.poll());
        assertEquals(56, pr0q.poll());
        assertEquals(72, pr0q.poll());
        assertEquals(90, pr0q.poll());
        assertEquals(110, pr0q.poll());
        assertEquals(132, pr0q.poll());
        assertEquals(156, pr0q.poll());
        assertEquals(182, pr0q.poll());
        assertEquals(210, pr0q.poll());
        assertEquals(240, pr0q.poll());

        //assertEquals(this.pr0q.clearFullQueue(), new String("0 1 2 3 4 5 6 7 8 "));

        assertEquals(0, this.pr0q.getQueue().size());
    }

}
