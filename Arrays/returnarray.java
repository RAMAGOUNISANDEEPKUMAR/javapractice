class returnarray{
    int[] arraymethod(int[] arr){
        return  arr;
    }
    public static void main(String args[]){
        int a[] = {1,22,33,44};
        returnarray r1 = new returnarray();
        int[] return_arr = r1.arraymethod(a);
        for(int i = 0 ;i < return_arr.length; i++){
            System.out.println(return_arr[i]);
        }
    }

}