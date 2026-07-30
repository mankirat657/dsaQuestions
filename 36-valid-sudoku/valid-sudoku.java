class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n = board.length;
        //first i will check for rows
        for(int i = 0; i < n; i++){
            HashSet<Character> set = new HashSet<>();
            for(int j = 0; j < board[i].length; j++){
                char elm = board[i][j];
                if(elm == '.' ) continue;
                if(set.contains(elm)) return false;
                else set.add(elm);
            }
            set.clear();
        }
        //second check for columns
        for(int i = 0; i < n; i++){
            HashSet<Character> set = new HashSet<>();
            for(int j = 0; j < board[i].length; j++){
                char elm = board[j][i];
                if(elm == '.') continue;
                if(set.contains(elm)) return false;
                else set.add(elm);
            }
        }
        //now checking for 3 * 3 boxes
        for(int i = 0; i < n; i+=3){
            for(int j = 0; j < board[i].length; j+=3){
                HashSet<Character> set = new HashSet<>();
                int k = i;
                int c = j;
                while(k < i + 3){
                    c = j;
                    while(c < j + 3){
                        char elm = board[k][c];
                         if(elm != '.'){
                            if(set.contains(elm)) return false;
                            set.add(elm);
                        }
                        c+=1;
                    }
                    k+=1;
                }
            set.clear();
            }
        }
        return true;
    }
}