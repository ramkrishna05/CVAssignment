public class ShuffleArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        shuffleArray(array);

        // print my array
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    // this is my logic function for shuffleArray
    public static void shuffleArray(int[] arr) {
        int n = arr.length;
        int[] shuffledArray = new int[n];
        boolean[] used = new boolean[n];
        int currentIndex = 0;

        while (currentIndex < n) {
            int randomIndex = getRandomIndex(n);
            if (!used[randomIndex]) {
                shuffledArray[currentIndex] = arr[randomIndex];
                used[randomIndex] = true;
                currentIndex++;
            }
        }

        // i use arraycopy for storing in shufflearray to my original array
        System.arraycopy(shuffledArray, 0, arr, 0, n);
    }

    // this is my custom random function it is give me unique index every time between 0 to n-1;
    //Math.random() genrate floating point between 0 to 1;

    public static int getRandomIndex(int n) {

        return (int) (Math.random() * n);
    }
}

