// Last updated: 7/9/2026, 3:08:51 PM
class NumArray {
    int[] nums;
    int[] tree;
    int n;
    public NumArray(int[] nums) {
        this.nums=nums;
        this.n=nums.length;
        tree=new int[n+1];
        for(int i=0;i<n;i++){
            add(i+1,nums[i]);
        }
    }
    private void add(int ind,int val){
        while(ind<=n){
            tree[ind]+=val;
            ind+=ind&(-ind);
        }
    }
    
    public void update(int index, int val) {
        int d=val-nums[index];
        nums[index]=val;
        add(index+1,d);
    }
    private int pre(int index){
        int sum=0;
        while(index>0){
            sum+=tree[index];
            index-=index &(-index);

        }
        return sum;
    }
    
    public int sumRange(int left, int right) {
    return  pre(right+1)-pre(left);
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);ac
 */