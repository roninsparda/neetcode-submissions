class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer,Integer> countFreq = new HashMap<>();

        for(int i : nums){
            countFreq.put(i,countFreq.getOrDefault(i,0)+1);
        }

        List<Map.Entry<Integer,Integer>> ansList = new ArrayList<Map.Entry<Integer,Integer>>(countFreq.entrySet());

        Collections.sort(ansList,new Comparator< Map.Entry<Integer,Integer> >(){
            public int compare(Map.Entry<Integer, Integer> ob1,
                                 Map.Entry<Integer,Integer> ob2){
                return (ob1.getValue()).compareTo(ob2.getValue());
            }
        });


        int arr[] = new int[k];

        for(int i = 0; i < k ; i++){
            arr[i] = ansList.get(ansList.size()-i-1).getKey();
        }
       
        

        return arr;
    }
}
