package leetcode1304;

public class FindNuniqueSumToZeroFunction {
	// O(N) solution
    public int[] sumZero(int n) {
        int[] result = new int[n];
        
        int sum = 0;
        
        for(int i = 0; i < n - 1; i++){
            result[i] += i + 1;
            
            sum += result[i];
        }
        
        // sum will be the negative of total
        result[n - 1] = -sum;
        
        return result;
    }
    
	// formula from online
    public int[] sumZero1(int n) {
        int[] result = new int[n];

        for(int i = 0; i < n; i++){
            result[i] = i * 2 - n + 1;
        }
        return result;
    }
}
