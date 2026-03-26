public class JumpSearch {
        public static int Search(int[] arr, int x, int m) {
        int k = 0;
        
        while (k * m < arr.length) {
            int index = k * m;

            // Since k starts at 0, this piece accounts for all three example iterations
            if (arr[index] == x) {
                return index;
            }
            // Since the array is already sorted, 
            // we can break out if our current element is ever greater than x because it means we've passed it
            if (x < arr[index]) {
                break;
            }
            // This piece keeps count of how many jumps we've made
            k++;
        }

        //To prevent the for loop from going out of bounds
        int start = Math.max(0, (k - 1) * m);
        int end = Math.min(k * m , arr.length - 1);

        for (int i = start; i <= end; i++) {
            if (arr[i] == x){
                return i;
            }
        }

        // If the number isn't found
        return -1;
    }

    public static void main(String[] args) {
        // Example array
        int Array[] = {0,1,1,2,3,5,8,13,21,55,77,89,101,201,256,780};
        // Number to be found
        int num = 77;
        // Block size
        int blockSize = 2;

        System.out.println("The number being searched for: " + num);
        System.out.println("Result index with block size = (" + blockSize + ") : " + Search(Array, num, blockSize));
    }
}
