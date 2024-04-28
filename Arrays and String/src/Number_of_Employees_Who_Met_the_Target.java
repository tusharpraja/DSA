public class Number_of_Employees_Who_Met_the_Target {

    public static void main(String[] args) {
        int[] hour = {0,1,2,3,4};
        int target = 2;
        System.out.println(numberOfEmployeesWhoMetTarget(hour,target));
    }

    public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int ans = 0;
        for (int i = 0; i < hours.length; i++) {
            if (hours[i] >= target){
                ans++;
            }
        }
        return ans;
    }
}


//Example 1:
//
//Input: hours = [0,1,2,3,4], target = 2
//Output: 3
//Explanation: The company wants each employee to work for at least 2 hours.
//- Employee 0 worked for 0 hours and didn't meet the target.
//- Employee 1 worked for 1 hours and didn't meet the target.
//- Employee 2 worked for 2 hours and met the target.
//- Employee 3 worked for 3 hours and met the target.
//- Employee 4 worked for 4 hours and met the target.
//There are 3 employees who met the target.
//Example 2:
//
//Input: hours = [5,1,4,2,2], target = 6
//Output: 0
//Explanation: The company wants each employee to work for at least 6 hours.
//There are 0 employees who met the target.
