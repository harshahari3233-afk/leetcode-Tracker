// Last updated: 7/9/2026, 3:07:21 PM
class Solution {
    public int numRookCaptures(char[][] board) {
        int count=0;
        int k=0;
        int l=0;
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                if(board[i][j]=='R'){
                    k=i;
                    l=j;
                }
            }
        }
        for(int i=k+1;i<8;i++){
            if(board[i][l]=='B'){
                break;
            }
            if(board[i][l]=='p'){
                count++;
                break;
            }
        }
        for(int i=k-1;i>=0;i--){
            if(board[i][l]=='B'){
                break;
            }
            if(board[i][l]=='p'){
                count++;
                break;
            }
        }
        for(int i=l-1;i>=0;i--){
            if(board[k][i]=='B'){
                break;
            }
            if(board[k][i]=='p'){
                count++;
                break;
            }
        }
           for(int i=l+1;i<8;i++){
            if(board[k][i]=='B'){
                break;
            }
            if(board[k][i]=='p'){
                count++;
                break;
            }
        }
        return count;
        
    }
}