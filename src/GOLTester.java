//import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class GOLTester {

//Game of Life.
//Test cases for the method OneStep() for GameOfLife Class.
    @Test
    public void testGOLOneStep1(){
        System.out.println("GOL, OneStep: Test Case 1");
        int[][] A = {{0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0},
                     {0, 1, 1, 1, 0},
                     {0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0}};

        GameOfLife sol = new GameOfLife(A);

        int[][] B = {{0, 0, 0, 0, 0},
                     {0, 0, 1, 0, 0},
                     {0, 0, 1, 0, 0},
                     {0, 0, 1, 0, 0},
                     {0, 0, 0, 0, 0}};

        sol.oneStep();
        assertArrayEquals(B, sol.board);
    }

    @Test
    public void testGOLOneStep2(){
        System.out.println("GOL, OneStep: Test Case 2");
        int[][] A = {{0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0, 0},
                     {0, 0, 1, 1, 1, 0},
                     {0, 1, 1, 1, 0, 0},
                     {0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0, 0}};

        GameOfLife sol = new GameOfLife(A);

        int[][] B = {{0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 1, 0, 0},
                     {0, 1, 0, 0, 1, 0},
                     {0, 1, 0, 0, 1, 0},
                     {0, 0, 1, 0, 0, 0},
                     {0, 0, 0, 0, 0, 0}};

        sol.oneStep();
        assertArrayEquals(B, sol.board);
    }

    @Test
    public void testGOLOneStep3(){
        System.out.println("GOL, OneStep: Test Case 3");
        int[][] A = {{0, 0, 0, 0, 0, 0},
                     {0, 1, 1, 0, 0, 0},
                     {0, 1, 1, 0, 0, 0},
                     {0, 0, 0, 1, 1, 0},
                     {0, 0, 0, 1, 1, 0},
                     {0, 0, 0, 0, 0, 0}};

        GameOfLife sol = new GameOfLife(A);

        int[][] B = {{0, 0, 0, 0, 0, 0},
                     {0, 1, 1, 0, 0, 0},
                     {0, 1, 0, 0, 0, 0},
                     {0, 0, 0, 0, 1, 0},
                     {0, 0, 0, 1, 1, 0},
                     {0, 0, 0, 0, 0, 0}};

        sol.oneStep();
        assertArrayEquals(B, sol.board);
    }

    @Test
    public void testGOLOneStep4(){
        System.out.println("GOL, OneStep: Test Case 4");
        int[][] A = {{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};

        GameOfLife sol = new GameOfLife(A);

        int[][] B = {{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};

        sol.oneStep();
        assertArrayEquals(B, sol.board);
    }

    @Test
    public void testGOLOneStep5(){
        System.out.println("GOL, OneStep: Test Case 5");
        int[][] A = {{1, 1, 1, 1, 1},
                     {1, 0, 0, 0, 1},
                     {1, 0, 0, 0, 1},
                     {1, 0, 0, 0, 1},
                     {1, 1, 1, 1, 1}};

        GameOfLife sol = new GameOfLife(A);

        int[][] B = {{1, 1, 1, 1, 1},
                     {1, 0, 1, 0, 1},
                     {1, 1, 0, 1, 1},
                     {1, 0, 1, 0, 1},
                     {1, 1, 1, 1, 1}};

        sol.oneStep();
        assertArrayEquals(B, sol.board);
    }

//Test cases for the method evolution() for GameOfLife Class.
    @Test
    public void testGOLEvolution1(){
        System.out.println("GOL, Evolution: Test Case 1");
        int[][] A = {{0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0},
                     {0, 1, 1, 1, 0},
                     {0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0}};

        GameOfLife sol = new GameOfLife(A);

        int[][] B = {{0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0},
                     {0, 1, 1, 1, 0},
                     {0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0}};

        sol.evolution(2);
        assertArrayEquals(B, sol.board);
    }

    @Test
    public void testGOLEvolution2(){
        System.out.println("GOL, Evolution: Test Case 2");
        int[][] A = {{0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0, 0},
                     {0, 0, 1, 1, 1, 0},
                     {0, 1, 1, 1, 0, 0},
                     {0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0, 0}};

        GameOfLife sol = new GameOfLife(A);

        int[][] B = {{0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0, 0},
                     {0, 0, 1, 1, 1, 0},
                     {0, 1, 1, 1, 0, 0},
                     {0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0, 0}};

        sol.evolution(2);
        assertArrayEquals(B, sol.board);
    }

    @Test
    public void testGOLEvolution3(){
        System.out.println("GOL, Evolution: Test Case 3");
        int[][] A = {{0, 0, 0, 0, 0, 0},
                     {0, 1, 1, 0, 0, 0},
                     {0, 1, 1, 0, 0, 0},
                     {0, 0, 0, 1, 1, 0},
                     {0, 0, 0, 1, 1, 0},
                     {0, 0, 0, 0, 0, 0}};

        GameOfLife sol = new GameOfLife(A);

        int[][] B = {{0, 0, 0, 0, 0, 0},
                     {0, 1, 1, 0, 0, 0},
                     {0, 1, 1, 0, 0, 0},
                     {0, 0, 0, 1, 1, 0},
                     {0, 0, 0, 1, 1, 0},
                     {0, 0, 0, 0, 0, 0}};

        sol.evolution(2);
        assertArrayEquals(B, sol.board);
    }

    @Test
    public void testGOLEvolution4(){
        System.out.println("GOL, Evolution: Test Case 4");
        int[][] A = {{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};

        GameOfLife sol = new GameOfLife(A);

        int[][] B = {{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};

        sol.evolution(4);
        assertArrayEquals(B, sol.board);
    }

    @Test
    public void testGOLEvolution5(){
        System.out.println("GOL, Evolution: Test Case 5");
        int[][] A = {{1, 1, 1, 1, 1},
                     {1, 0, 0, 0, 1},
                     {1, 0, 0, 0, 1},
                     {1, 0, 0, 0, 1},
                     {1, 1, 1, 1, 1}};

        GameOfLife sol = new GameOfLife(A);

        int[][] B = {{0, 0, 0, 0, 0},
                     {0, 1, 0, 1, 0},
                     {0, 0, 0, 0, 0},
                     {0, 1, 0, 1, 0},
                     {0, 0, 0, 0, 0}};

        sol.evolution(3);
        assertArrayEquals(B, sol.board);
    }

//Test cases for the method neighbors() for GameOfLife Class.
    @Test
    public void testGOLneighbors1(){
        System.out.println("GOL, Neighbors: Test Case 1");
        int [][] A = {{1, 0, 1},
                      {0, 1, 0},
                      {1, 0, 1}};

        GameOfLife sol = new GameOfLife(A);
        assertEquals(4, sol.neighbors(1,1));
    }

    @Test
    public void testGOLneighbors2(){
        System.out.println("GOL, Neighbors: Test Case 2");
        int [][] A = {{0, 0, 0},
                      {0, 0, 0},
                      {0, 0, 0}};

        GameOfLife sol = new GameOfLife(A);
        assertEquals(0, sol.neighbors(1,1));
    }

    @Test
    public void testGOLneighbors3(){
        System.out.println("GOL, Neighbors: Test Case 3");
        int [][] A = {{0, 0, 1},
                      {1, 0, 1},
                      {0, 0, 1}};

        GameOfLife sol = new GameOfLife(A);
        assertEquals(0, sol.neighbors(1,0));
    }

    @Test
    public void testGOLneighbors4(){
        System.out.println("GOL, Neighbors: Test Case 4");
        int [][] A = {{0, 0, 1},
                      {0, 0, 0},
                      {1, 0, 0}};

        GameOfLife sol = new GameOfLife(A);
        assertEquals(0, sol.neighbors(2,0));
    }

    @Test
    public void testGOLneighbors5(){
        System.out.println("GOL, Neighbors: Test Case 5");
        int [][] A = {{1, 1, 1},
                      {1, 1, 1},
                      {1, 1, 1}};

        GameOfLife sol = new GameOfLife(A);
        assertEquals(3, sol.neighbors(0,0));
    }

//Torus Game of Life: The figures were shifted to the border of the 2D array to test how it interacts.
//Test cases for the method OneStep() for GameOfLife Class.
    @Test
    public void testGOLTorusOneStep1(){
        System.out.println("GOLTorus, OneStep: Test Case 1");
        int[][] A = {{0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0},
                     {1, 1, 0, 0, 1},
                     {0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0}};

        TorusGameOfLife sol = new TorusGameOfLife(A);

        int[][] B = {{0, 0, 0, 0, 0},
                     {1, 0, 0, 0, 0},
                     {1, 0, 0, 0, 0},
                     {1, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0}};

        sol.oneStep();
        assertArrayEquals(B, sol.board);
    }

    @Test
    public void testGOLTorusOneStep2(){
        System.out.println("GOLTorus, OneStep: Test Case 2");
        int[][] A = {{0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0, 0},
                     {1, 1, 1, 0, 0, 0},
                     {1, 1, 0, 0, 0, 1},
                     {0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0, 0}};

        TorusGameOfLife sol = new TorusGameOfLife(A);

        int[][] B = {{0, 0, 0, 0, 0, 0},
                     {0, 1, 0, 0, 0, 0},
                     {0, 0, 1, 0, 0, 1},
                     {0, 0, 1, 0, 0, 1},
                     {1, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0, 0}};

        sol.oneStep();
        assertArrayEquals(B, sol.board);
    }

    @Test
    public void testGOLTorusOneStep3(){
        System.out.println("GOLTorus, OneStep: Test Case 3");
        int[][] A = {{0, 0, 0, 0, 0, 0},
                     {1, 0, 0, 0, 0, 1},
                     {1, 0, 0, 0, 0, 1},
                     {0, 1, 1, 0, 0, 0},
                     {0, 1, 1, 0, 0, 0},
                     {0, 0, 0, 0, 0, 0}};

        TorusGameOfLife sol = new TorusGameOfLife(A);

        int[][] B = {{0, 0, 0, 0, 0, 0},
                     {1, 0, 0, 0, 0, 1},
                     {0, 0, 0, 0, 0, 1},
                     {0, 0, 1, 0, 0, 0},
                     {0, 1, 1, 0, 0, 0},
                     {0, 0, 0, 0, 0, 0}};

        sol.oneStep();
        assertArrayEquals(B, sol.board);
    }

    @Test
    public void testGOLTorusOneStep4(){
        System.out.println("GOLTorus, OneStep: Test Case 4");
        int[][] A = {{0, 0, 0, 0},
                     {1, 0, 0, 1},
                     {1, 0, 0, 1},
                     {0, 0, 0, 0}};

        TorusGameOfLife sol = new TorusGameOfLife(A);

        int[][] B = {{0, 0, 0, 0},
                     {1, 0, 0, 1},
                     {1, 0, 0, 1},
                     {0, 0, 0, 0}};

        sol.oneStep();
        assertArrayEquals(B, sol.board);
    }

    @Test
    public void testGOLTorusOneStep5(){
        System.out.println("GOLTorus, OneStep: Test Case 5");
        int[][] A = {{1, 1, 1, 1, 1},
                     {0, 0, 0, 1, 1},
                     {0, 0, 0, 1, 1},
                     {0, 0, 0, 1, 1},
                     {1, 1, 1, 1, 1}};

        TorusGameOfLife sol = new TorusGameOfLife(A);

        int[][] B = {{0, 0, 0, 0, 0},
                     {0, 1, 0, 0, 0},
                     {1, 0, 1, 0, 0},
                     {0, 1, 0, 0, 0},
                     {0, 0, 0, 0, 0}};

        sol.oneStep();
        assertArrayEquals(B, sol.board);
    }

    //Test cases for the method evolution() for GameOfLife Class.
    @Test
    public void testGOLTorusEvolution1(){
        System.out.println("GOLTorus, Evolution: Test Case 1");
        int[][] A = {{0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0},
                     {1, 1, 0, 0, 1},
                     {0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0}};

        TorusGameOfLife sol = new TorusGameOfLife(A);

        int[][] B = {{0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0},
                     {1, 1, 0, 0, 1},
                     {0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0}};

        sol.evolution(2);
        assertArrayEquals(B, sol.board);
    }

    @Test
    public void testGOLTorusEvolution2(){
        System.out.println("GOLTorus, Evolution: Test Case 2");
        int[][] A = {{0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0, 0},
                     {1, 1, 1, 0, 0, 0},
                     {1, 1, 0, 0, 0, 1},
                     {0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0, 0}};

        TorusGameOfLife sol = new TorusGameOfLife(A);

        int[][] B = {{0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0, 0},
                     {1, 1, 1, 0, 0, 0},
                     {1, 1, 0, 0, 0, 1},
                     {0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0, 0}};

        sol.evolution(2);
        assertArrayEquals(B, sol.board);
    }

    @Test
    public void testGOLTorusEvolution3(){
        System.out.println("GOLTorus, Evolution: Test Case 3");
        int[][] A = {{0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 1, 1, 0},
                     {0, 0, 0, 1, 1, 0},
                     {1, 0, 0, 0, 0, 1},
                     {1, 0, 0, 0, 0, 1},
                     {0, 0, 0, 0, 0, 0}};

        TorusGameOfLife sol = new TorusGameOfLife(A);

        int[][] B = {{0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 1, 1, 0},
                     {0, 0, 0, 1, 1, 0},
                     {1, 0, 0, 0, 0, 1},
                     {1, 0, 0, 0, 0, 1},
                     {0, 0, 0, 0, 0, 0}};

        sol.evolution(2);
        assertArrayEquals(B, sol.board);
    }

    @Test
    public void testGOLTorusEvolution4(){
        System.out.println("GOLTorus, Evolution: Test Case 4");
        int[][] A = {{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 1, 0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                     {0, 0, 1, 1, 1, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};

        TorusGameOfLife sol = new TorusGameOfLife(A);

        int[][] B = {{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                     {0, 0, 0, 0, 0, 0, 0, 0, 1, 0},
                     {0, 0, 0, 0, 0, 0, 1, 1, 1, 0},
                     {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};

        sol.evolution(16);
        assertArrayEquals(B, sol.board);
    }

    @Test
    public void testGOLTorusEvolution5(){
        System.out.println("GOLTorus, Evolution: Test Case 5");
        int[][] A = {{1, 1, 1, 1, 1},
                     {0, 0, 0, 1, 1},
                     {0, 0, 0, 1, 1},
                     {0, 0, 0, 1, 1},
                     {1, 1, 1, 1, 1}};

        TorusGameOfLife sol = new TorusGameOfLife(A);

        int[][] B = {{0, 0, 0, 0, 0},
                     {0, 1, 0, 0, 0},
                     {1, 0, 1, 0, 0},
                     {0, 1, 0, 0, 0},
                     {0, 0, 0, 0, 0}};

        sol.evolution(3);
        assertArrayEquals(B, sol.board);
    }

    //Test cases for the method neighbors() for GameOfLife Class.
    @Test
    public void testGOLTorusNeighbors1(){
        System.out.println("GOLTorus, Neighbors: Test Case 1");
        int [][] A = {{1, 0, 1},
                      {0, 1, 0},
                      {1, 0, 1}};

        TorusGameOfLife sol = new TorusGameOfLife(A);
        assertEquals(4, sol.neighbors(1,1));
    }

    @Test
    public void testGOLTorusNeighbors2(){
        System.out.println("GOLTorus, Neighbors: Test Case 2");
        int [][] A = {{0, 0, 0},
                      {0, 0, 0},
                      {0, 0, 0}};

        TorusGameOfLife sol = new TorusGameOfLife(A);
        assertEquals(0, sol.neighbors(1,1));
    }

    @Test
    public void testGOLTorusNeighbors3(){
        System.out.println("GOLTorus, Neighbors: Test Case 3");
        int [][] A = {{0, 0, 1},
                      {1, 0, 1},
                      {0, 0, 1}};

        TorusGameOfLife sol = new TorusGameOfLife(A);
        assertEquals(3, sol.neighbors(1,0));
    }

    @Test
    public void testGOLTorusNeighbors4(){
        System.out.println("GOLTorus, Neighbors: Test Case 4");
        int [][] A = {{0, 0, 1},
                      {0, 0, 0},
                      {1, 0, 0}};

        TorusGameOfLife sol = new TorusGameOfLife(A);
        assertEquals(1, sol.neighbors(2,0));
    }

    @Test
    public void testGOLTorusNeighbors5(){
        System.out.println("GOLTorus, Neighbors: Test Case 5");
        int [][] A = {{1, 1, 1},
                      {1, 1, 1},
                      {1, 1, 1}};

        TorusGameOfLife sol = new TorusGameOfLife(A);
        assertEquals(8, sol.neighbors(0,0));
    }
}
