
package problemdomain;

public class SudokuGame implements Serilizable{
    
    private final GameState gameState;
    private final int[][] gridState;
    
    public static final int GRID_BOUNDAR= 9;
    
    public SudokuGame(GameState gameState, int[][] gridState){
        this.gameState = gameState;
        this.gridState = gridState;
    }
    
    public GameState getGameState(){
        return gameState;
    }
    
    public int[][] getCopyOfGridState(){
        return SudokuUtilities.copyToNewArray(gridState);
    }
}
