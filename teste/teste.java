import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;

class BruteForce {

    static public void findPermutation(int n, BigInteger k) {
        // Esse metodo foi copiado (e depois, adaptado) de
        // https://stackoverflow.com/questions/31216097/given-n-and-k-return-the-kth-permutation-sequence
        int[] numbers = new int[n];
        int[] indices = new int[n];

        // initialise the numbers 1, 2, 3...
        for (int i = 0; i < n; i++)
                numbers[i] = i + 1;

        BigInteger divisor = BigInteger.ONE;
        for (BigInteger place = BigInteger.ONE; place.compareTo(BigInteger.valueOf(n)) <= 0; place.add(BigInteger.ONE)) {
                if(k.divide(divisor) == BigInteger.ZERO)
                        break;	// all the remaining indices will be zero

            // compute the index at that place:
            int placeInt = place.intValue();
            BigInteger aux = (k.divide(divisor)).mod(place);
            indices[n-placeInt] = aux.intValue();
            divisor = divisor.multiply(place);
        }

        // print out the indices:
        // System.out.println(Arrays.toString(indices));

        // permute the numbers array according to the indices:
        for (int i = 0; i < n; i++) {
            int index = indices[i] + i;

            // take the element at index and place it at i, moving the rest up
            if(index != i) {
                int temp = numbers[index];
                for(int j = index; j > i; j--)
                   numbers[j] = numbers[j-1];
                numbers[i] = temp;
            }
        }

        System.out.println(Arrays.toString(numbers));
    }

 	public static void main (String[] args) throws java.lang.Exception
	{
		findPermutation(3, BigInteger.valueOf(5));
	}

}
