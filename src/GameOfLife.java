public class GameOfLife {
    int size;
    int[][] board;
    int[][] previous;

//Constructors.
    public GameOfLife(){}

    public GameOfLife(int size){
        this.size = size;
        int[][] board = new int[size][size];
        int[][] previous = new int[size][size];
    }

    public GameOfLife(int[][] arr){
        this.size = arr.length;
        previous = new int[size][size];
        board = new int[size][size];

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++) {
                previous[i][j] = arr[i][j];
            }
        }

        System.out.println("Original Board: ");
        for(int i = 0; i < previous.length; i++){
            for(int j = 0; j < previous[i].length; j++){
                System.out.print(previous[i][j]);
            }System.out.println("");
        }System.out.println("");

    }

//Methods.
    public int[][] getBoard(){
        return board;
    }

    public void oneStep(){
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++) {
                if(previous[i][j] == 1){
                    if(neighbors(i,j) == 2 || neighbors(i, j) == 3)
                        board[i][j] = 1;
                    else
                        board[i][j] = 0;
                }

                if(previous[i][j] == 0){
                    if(neighbors(i,j) == 3)
                        board[i][j] = 1;
                    else
                        board[i][j] = 0;
                }
            }
        }

        System.out.println("Board: ");
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                System.out.print(board[i][j]);
            }System.out.println("");
        }System.out.println("");
    }

    public int neighbors(int row, int column){
        int sum = 0;

        if(row != 0 && column != 0)
            sum += previous[row - 1][column - 1];

        if(row != 0)
            sum += previous[row - 1][column];

        if(row != 0 && column != board.length - 1)
            sum += previous[row - 1][column + 1];

        if(column != 0)
            sum += previous[row][column - 1];

        if(column != board.length - 1)
            sum += previous[row][column + 1];

        if(row != board.length - 1 && column != 0)
            sum += previous[row + 1][column - 1];

        if(row != board.length - 1)
            sum += previous[row + 1][column];

        if(row != board.length - 1 && column != board.length - 1)
            sum += previous[row + 1][column + 1];

        return sum;
    }

    public void evolution(int n){
        for(int i = 0; i < n; i++) {
            oneStep();

            for(int k = 0; k < size; k++){
                for(int j = 0; j < size; j++) {
                    previous[k][j] = board[k][j];
                }
            }

        }
    }
}
