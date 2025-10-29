public class search {
    public static int getIndex(Object[] arr,Object search){
        for (int index=0;index< arr.length;index++){
            if (arr[index].equals(search)){
                return index;
            }
        }
        return -1;
    }
}
