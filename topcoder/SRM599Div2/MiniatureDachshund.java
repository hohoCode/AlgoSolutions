/*
Problem Statement for MiniatureDachshund


Problem Statement
    	Dachshund is a popular dog breed. In this problem, a miniature dachshund 
        is defined as a dachshund whose weight is not more than 5,000 grams. 



Lun the miniature dachshund loves mikan (satsuma oranges). She has just bought 
some mikan. You are given a int[] mikan. It gives the weight of all mikan she 
bought. For each valid i, mikan[i] is the weight of the i-th mikan in grams. 



You are also given an int weight. Currently, Lun weighs weight grams. When she 
eats i-th mikan, her weight increases by mikan[i] grams. If she eats multiple 
mikan, her weight increases by their total weight. She cannot eat just a part 
of a mikan. In other words, if she chooses to eat a mikan, she eats it completely. 



She wants to remain being a miniature dachshund. That is, she wants her weight 
not to exceed 5,000 grams. Under this condition, calculate and return the maximum 
number of mikan Lun can eat.
 
Definition
    	
Class:	MiniatureDachshund
Method:	maxMikan
Parameters:	int[], int
Returns:	int
Method signature:	int maxMikan(int[] mikan, int weight)
(be sure your method is public)
    
 
Constraints
-	mikan will contain between 1 and 50 elements, inclusive.
-	Each element of mikan will be between 50 and 200, inclusive.
-	weight will be between 3,000 and 5,000, inclusive.
 
Examples
0)	
    	
{100, 100, 100, 100, 100}
4750
Returns: 2
Here, Lun weighs 4,750 grams and has bought 5 mikan, each of which weighs 100 
grams. When she eats 2 of these, her weight will be 4,950 grams. She should 
not eat more.
1)	
    	
{100, 100, 100, 100, 50}
4750
Returns: 3
This time, one of the mikan is smaller. She can eat it with 2 of the 100-gram 
mikan. Note that her weight is allowed to be exactly 5,000 grams.
2)	
    	
{120, 90, 130, 100, 110, 80}
3000
Returns: 6
When she is light enough, she can eat all of the mikan she has bought.
3)	
    	
{50}
5000
Returns: 0
When her weight is already 5,000 grams, she should not eat anything.
4)	
    	
{200, 50, 200, 50, 200, 50, 200, 50}
4800
Returns: 4
 */

import java.util.Arrays;

public class MiniatureDachshund {
    public int maxMikan(int[] mikan, int weight) {
        Arrays.sort(mikan);
        int res = 0, total = 5000 - weight;
        for(int i = 0; i < mikan.length && total > 0; i++) {
            if(total >= mikan[i]) {
                res++;
                total -= mikan[i];
            }
        }
        return res;
    }
}
