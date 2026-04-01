class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totgas=0,totcost=0;
        int tot=0,start=0;
        for(int i=0;i<gas.length;i++)
        {
            totgas+=gas[i];
            totcost+=cost[i];
            tot+=gas[i]-cost[i];
            if(tot<0)
            {
                start=i+1;
                tot=0;
            }           
        }
        if(totgas>=totcost)
        {
            return start;
        }
        return -1;
    }
}
