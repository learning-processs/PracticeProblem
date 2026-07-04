public class MaxArea {

    
    public static int maxArea(int[] height) {
        int max =0; 
        for(int i = 0 ; i < height.length ;i++){
            for( int j = i + 1 ; j < height.length ; j++){
                int width = j - i ; 

                int ht = Math.min(height[i], height[j]);

                int area = width * ht;

                max = Math.max(max, area);
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int height[] = {1,8,6,2,5,4,8,3,7};
        int height2[] = {1, 1};

        System.out.println(maxArea(height2));
    }
}
