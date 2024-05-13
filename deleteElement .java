public class deleteElement {
    public staic int[] element(int[] array, int index) {
        if ( int index < 0; index >= array.length){
            System.out.println("invalid index");
            return array;

        }
        array[index] = -1;
        return array;
    }
    public static void main( string[] args){
        int[]array={3,7,1,9,4};
        int index=2;
        deleteElement(element);





    }

}
