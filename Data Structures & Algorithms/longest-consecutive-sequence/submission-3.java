class Solution{

    boolean isStartSeq(int val, Set<Integer> s){
        if(s.contains(val-1) )
            return false;
        return true;
    }

    boolean isEndSeq(int val, Set<Integer> s){
        if(s.contains(val+1) )
            return false;
        return true;
    }

    boolean isSeq(int val, Set<Integer> s){
        if(s.contains(val+1) && s.contains(val-1))
            return true;
        return false;
    }

    public int longestConsecutive(int[] nums) {
        //key will be the pred, val will be the accompanied count.
        //will store max count so far in a variable
        //they don't have to be in order
        Set<Integer> s = new HashSet<>();

        int maxCount = 0;

        for(int n: nums){
            s.add(n);
        }
        int[] starts = new int[nums.length];
        int inserts = 0;
        for(int num:nums){
            if(isStartSeq(num,s))
                starts[inserts++] = num;
        }
        System.out.println(Arrays.toString(starts));
        int currMax;
        
        for(int i=0;i<inserts;i++){
            currMax = 1;
            int next = starts[i]+1;
            while(s.contains(next) && !isEndSeq(next,s)){
                currMax++;
                next++;
            }
            if(s.contains(next))
                currMax++;
            maxCount = (currMax>maxCount)?currMax:maxCount;
        }

        return maxCount;



    }
}
