//import java.util.Arrays;
class Solution {
    public int bulbSwitch(int n) {
        return (int)Math.sqrt(n);
        /*boolean[] bulbs=new boolean[n];
        Arrays.fill(bulbs,true);
        for(int i=2;i<=n;i++)//start from round 2 since the array becomes all true in round 1 and we assigned it all true in the start instead.
        {
            for(int b=0;b<n;b+=i)
            {
                if(b==0) b-=1;
                else
                bulbs[b]=!bulbs[b];
                //System.out.print(b+" "+bulbs[b]);
            }
            //bulbs[0]=true;
            //System.out.println();
        }
        int c=0;
        for(boolean k:bulbs)
        {
            //System.out.println(k);
            if(k==true) c++;
        }
        return c;*/
    }
}
