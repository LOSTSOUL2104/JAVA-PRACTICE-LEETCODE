import java.util.Arrays;

public class LINEAR_SEARCH
{
    public static void main(String[] args)
        {
//            int [] nums = {23,1,2,3,4,5,6};
//            int target = 1;
//            int ans = LinearSearch(nums,target);
//            System.out.println(ans);
                  //SEARCH IN STRING
            String name = "priyansh";
            char target = 'h';
            System.out.println(search(name,target));

            System.out.println(Arrays.toString(name.toCharArray()));
        }
    static boolean search2(String str,char target)
    {
        if (str.length() == 0)
        {
            return false;
        }
      for(char ch : str.toCharArray())
      {
          if (ch == target)
          {
              return true;
          }
      }
        return false;
    }


    static boolean search(String str,char target)
        {
            if (str.length() == 0)
            {
                return false;
            }
            for (int i = 0; i < str.length(); i++) {
                if (target == str.charAt(i))
                {
                    return true;
                }
            }
            return false;
        }
//    static int LinearSearch(int[] arr, int target)
//    {
//        if (arr.length == 0) {
//            return -1;
//        }
//        for (int i = 0; i < arr.length; i++)
//        {
//            int element = arr[i];
//            if (element==target)
//            {
//                return i;
//            }
//        }
//        return -1;
//    }

}
