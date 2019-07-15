package ivan.samoylov;

public class Main {

    public static void main(String[] args) {
	final int MAX_SIZE = 15;
	BinarySearch array;
    array = new BinarySearch(MAX_SIZE);

    for (int i = 0; i < MAX_SIZE; i++){
        array.add(i*i);
    }

    System.out.print("Elements in array :");
    array.printArray();
    int searchElement = 64;

    if (array.find(searchElement) != array.size()){
        System.out.println("Found " + searchElement);
    }
    else {
        System.out.println("Can't found " + searchElement);
    }

    searchElement = 9999;
    if (array.find(searchElement) != array.size()){
        System.out.println("Found " + searchElement);
    }
    else {
        System.out.println("Can't found " + searchElement);
    }


    }
}
