import java.util.*;
class Solution {
    public int minCostToMoveChips(int[] position) {
        int even_position=0;
        int odd_position=0;
        for(int i:position)
        {
            if(i%2==0)
            even_position++;
            else
            odd_position++;
        }
        return Math.min(even_position,odd_position);
    }
}
