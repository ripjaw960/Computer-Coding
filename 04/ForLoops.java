public class ForLoops {
    public static void main(String[] args) {
	int[] array = new int[10000];
	int[] array1 = {0, 0, 0, 6, 0, 0, 989898, 0, 0, 0};

	for (int i = 0; i < array.length; i++) {
	    array[i] = i;
	}

	for (int d = 0; d < array.length; d++) {
	    System.out.println(array[d]);
	}


    }
}