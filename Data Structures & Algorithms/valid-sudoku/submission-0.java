class Solution {
    public boolean isValidSudoku(char[][] board) {

        HashMap<Integer, HashSet<Character>> rows = new HashMap<>();
        HashMap<Integer, HashSet<Character>> columns = new HashMap<>();
        HashMap<Integer, HashSet<Character>> blocks = new HashMap<>();
        
        for(int z=0;z<9;z++){
            rows.put(z, new HashSet<Character>());
            columns.put(z, new HashSet<Character>());
            blocks.put(z, new HashSet<Character>());
        }
        
       

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]>'0' && board[i][j]<='9'){
                    if( !(rows.get(i).add(board[i][j])) )
                        return false;
                    if( !(columns.get(j).add(board[i][j])) )
                        return false;
                    if( !(blocks.get((i / 3) * 3 + (j / 3)).add(board[i][j])) )
                        return false;
                }
            }
        }

        return true;
        
    }
}
