class Solution {
    public boolean isRobotBounded(String ins) { 
        char[] arr= ins.toCharArray();
        int x=0,startx=0;
        int y=0,starty=0;
        char d='n';
        int s=0;
        while(s<=3){
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]=='G')
            {
                if(d=='n') y+=1;
                else if(d=='s') y-=1;
                else if(d=='e') x+=1;
                else x-=1;
            }
            else if(arr[i]=='L')
            {
                if(d=='n') d='w';
                else if(d=='s') d='e';
                else if(d=='e') d='n';
                else d='s';
            }
            else if(arr[i]=='R')
            {
                if(d=='n') d='e';
                else if(d=='s') d='w';
                else if(d=='e') d='s';
                else d='n';
            }
        }
        
        if(x==startx && y==starty)
        {
            return true;
        }
        else
        s++;
        }
        return false;
    }
}
