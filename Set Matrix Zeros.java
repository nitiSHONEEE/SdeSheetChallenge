import java.util.* ;
import java.io.*; 
public class Solution {
    public static void setZeros(int m[][]) {
        int colZero=-1;
      
        for(int i=0; i<m.length ;i++){
            if(m[i][0]==0) colZero=0;
            for(int j=1; j<m[0].length ;j++){
                if(m[i][j]==0){
                    m[0][j]=m[i][0]=0;
                }
            }
        }
        for (int i = m.length - 1; i >= 0; i--) {
            for (int j = m[0].length - 1; j >= 1; j--)
                if (m[i][0] == 0 || m[0][j] == 0)
                {
                    m[i][j] = 0;
                }
            if (colZero == 0) 
            {
                m[i][0] = 0;
            }
        }
    }

}
