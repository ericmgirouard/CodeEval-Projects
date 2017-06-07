package Easy;
//HEY BUD THIS JUST FINDS THE AVERAGE
public class MinDist {

	public static void main(String[] args) {
		String line = "93 6600 3926 7943 1024 7578 2521 2075 428 6017 2165 7026 9120 2917 826 3012 3793 6050 4907 6757 9972 1766 1896 761 2763 2705 7893 1367 7831 6331 4971 2965 8158 7219 5879 3312 7343 5345 4607 2881 4165 8331 573 6863 6158 7038 8902 5451 2958 5189 8491 574 6278 8144 2515 5421 7445 9704 5711 7530 4451 8506 5369 2781 2680 7675 3206 5297 1575 4122 450 7501 6400 9138 7174 6618 2343 4232 7494 5687 7413 4390 2549 408 6936 6820 3954 3999 6367 6161 4997 8978 7078 1169";
		line = line.trim();
        String[] ints = line.split(" ");
        int[] nums = new int[ints.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(ints[i]);
        }//now we have ints
        int n = nums[0];
        int sum = 0;
        for (int i = 1; i < nums.length; i++) {
            sum += nums[i];
        }
        int optimalHouse = sum/n;
        //find sum of distances from house to all others
        int sumD = 0;
        for (int i = 1; i < nums.length; i++) {
            sumD += Math.abs(nums[i]-optimalHouse);
        }//obtained min diastance sum
        System.out.println(sumD);

	}

}
