class GFG06{
    // Function to find the majority elements in the array
    public List<Integer> findMajority(int[] arr) {
        List<Integer> list=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        int maj=arr.length/3;
        for(int i=0;i<arr.length;i++)
        {
            if(!map.containsKey(arr[i]))
            {
                map.put(arr[i],1);
                if(maj==0) list.add(arr[i]);
            }
            else
            {
                int votes=map.get(arr[i]);
                votes++;
                if(votes>maj && !list.contains(arr[i])) list.add(arr[i]);
                map.put(arr[i],votes);
            }
        }
        Collections.sort(list);
        return list;
    }
}