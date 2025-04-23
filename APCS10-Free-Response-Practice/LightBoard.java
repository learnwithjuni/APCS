public class LightBoard
{
 /** The lights on the board, where true represents on and false represents off.
 */
 private boolean[][] lights;

 /** Constructs a LightBoard object having numRows rows and numCols columns.
 * Precondition: numRows > 0, numCols > 0
 * Postcondition: each light has a 40% probability of being set to on.
 */
 public LightBoard(int numRows, int numCols) { 
  lights = new boolean[numRows][numCols];

  for(int r = 0; r < lights.length; r++) {
    for(int c = 0; c < lights[0].length; c++){
      if(Math.random() <= 0.4) {
        lights[r][c] = true;
      }
    }
  }
  }

 /** Evaluates a light in row index row and column index col and returns a status
 * as described in part (b).
 * Precondition: row and col are valid indexes in lights.
 */
 public boolean evaluateLight(int row, int col) {
  int onInColumn = 0;

  for(int r = 0; r < lights.length; r++)
    if(lights[r][col])
      onInColumn++;
        
  if(lights[row][col])
  {
    if(onInColumn % 2 == 0)
      return false;
  }
  else
  {
    if(onInColumn % 3 == 0)
      return true;
  }
        
  return lights[row][col];
  }
 // There may be additional instance variables, constructors, and methods not shown.
} 