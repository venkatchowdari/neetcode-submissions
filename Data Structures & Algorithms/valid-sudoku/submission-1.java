class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] cols = new HashSet[9];
        HashSet<Character>[] boxes = new HashSet[9];

        for(int i=0;i<9;i++){
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        for(int r=0;r<9;r++){
            for(int c=0;c<9;c++){
                char ch = board[r][c];

                if(ch == '.') continue;

                int boxIndex = (r/3) *3 + (c/3);

                if(rows[r].contains(ch)) return false;
                if(cols[c].contains(ch)) return false;
                if(boxes[boxIndex].contains(ch)) return false;

                rows[r].add(ch);
                cols[c].add(ch);
                boxes[boxIndex].add(ch);
            }
        }

        return true;
    }
}
