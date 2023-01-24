public class LP_8Main {
    public int[] myArray;
    public int mySize;
    public int myCapcity;

    private  final int DEFAULT_SIZE = 16;

    public void IntArrayList() {
        myArray = new int[DEFAULT_SIZE];
        mySize = 0;
        myCapcity = DEFAULT_SIZE;
    }

    public void doubleCapacity() {
        myCapcity *= 2;
        int[] tempArray = new int[myCapcity];

        for(int i = 0; i < mySize; i++) {
            tempArray[i] = myArray[i];
        }

        myArray = tempArray;
    }

    public void halfCapcity() {
        myCapcity /= 2;
        int[] tempArray = new int[myCapcity];

        for(int i = 0; i < mySize; i++) {
            tempArray[i] = myArray[i];
        }

        myArray = tempArray;
    }

    public void add(int num) {
        if (mySize + 1 == myCapcity) {
            doubleCapacity();
        }

        mySize++;
        myArray[mySize] = num;
    }

    public void remove(int index) {
        for(int i = index + 1; i < mySize; i++) {
            myArray[i - 1] = myArray[i];
        }

        mySize--;
        if (mySize <= (myCapcity * 0.25)) {
            halfCapcity();
        }
    }
}
