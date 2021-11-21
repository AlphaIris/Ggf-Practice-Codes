class Solution {
    ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        ArrayList<Integer> res=new ArrayList<>();
        for(int i =0;i<n;i++){
            int val=arr[i];
            int ind=i+1;
            if(val==ind){
                res.add(val);
            }
        }
        return res;
    }
}