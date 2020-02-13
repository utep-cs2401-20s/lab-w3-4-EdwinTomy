public class TorusGameOfLife extends GameOfLife{

    @Override
    public int neighbors(int row, int column) {
        int sum = 0;

        sum += previous[((row - 1) % board.length) + board.length][((column - 1) % board.length) + board.length];

        sum += previous[((row - 1) % board.length) + board.length][((column) % board.length) + board.length];

        sum += previous[((row - 1) % board.length) + board.length][((column + 1) % board.length) + board.length];

        sum += previous[((row) % board.length) + board.length][((column - 1) % board.length) + board.length];

        sum += previous[((row) % board.length) + board.length][((column + 1) % board.length) + board.length];

        sum += previous[((row + 1) % board.length) + board.length][((column - 1) % board.length) + board.length];

        sum += previous[((row + 1) % board.length) + board.length][((column) % board.length) + board.length];

        sum += previous[((row + 1) % board.length) + board.length][((column + 1) % board.length) + board.length];

        return sum;
    }
}
