
package puzzle;

import java.awt.EventQueue;


public class Puzzle {

    
    public static void main(String[] args) {
        
         EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                PuzzleFrame puzzlee = new PuzzleFrame();
                puzzlee.setVisible(true);
            }
        });
        
        
        
    }
    
}
