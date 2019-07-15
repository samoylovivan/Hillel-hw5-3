package ivan.samoylov;

public class BinarySearch {
    private int[] arr;
    private int sizeArr;


    public BinarySearch(int max) {
        arr = new int[max];
        sizeArr = 0;
    }

    public int size(){
        return sizeArr;
    }

    public int find(int key) {
        int lowerBound = 0;
        int upperBound = size() - 1;
        int current;

        while(true){
            current = (lowerBound + upperBound) / 2;
            if (arr[current] == key){
                return key;
            }
            else if(lowerBound > upperBound){
                return sizeArr;
            }
            else {
                if (arr[current] < key){
                    lowerBound = current + 1;
                }
                else{
                    upperBound = current - 1;
                }
            }
        }
    }

    public void add(int element){
        int j;
        for(j = 0; j < size(); j++){
            if (arr[j] > element){
                break;
            }
        }
        for (int k = size(); k > j; k--){
            arr[k] = arr[k-1];
        }
        arr[j] = element;
        sizeArr++;
    }

    public void printArray(){
        for (int i = 0; i < size(); i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }


}
