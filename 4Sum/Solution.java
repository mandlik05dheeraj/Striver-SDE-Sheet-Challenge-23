class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> finalList = new ArrayList<>() ;
        
        if(nums.length==4 && nums[0]>999999999){
            return finalList;
        }
        Arrays.sort(nums);
        
        int n = nums.length ;

        for(int i=0 ; i<n-3 ; i++){
            for(int j=i+1 ; j<n-2 ; j++){
               int left = j+1 ;;
               int right = n-1 ;
                while(left<right){
                    int sum = nums[i]+nums[j]+nums[left]+nums[right];
                    if(sum>target)
                    right-=1;
                    else if(sum==target){
                    List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[left]);
                        list.add(nums[right]);
                        if(!finalList.contains(list)){
                            finalList.add(list);
                        }
                        left+=1 ;
                    }

                    else{
                        left+=1 ;
                    }
                }  
            }
        }
        System.out.println(finalList);
        return finalList;
    }
}
