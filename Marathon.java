class Marathon {
    public static int Fastest(){
        int[] times = {
            341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
            343, 317, 265
        };

        int a = 0;
        int b = 1;
        for (int count = 0; count < times.length; count++){
            if (times[a] < times[b]){
                b += 1;
                if (b == a){
                    b = a + 1;
                }

            } else if (times[a] > times[b]){
                a += 1;
                if (a == b){
                    a = b + 1;
                }
            }
        }

        int d = 0;

        if (a < b){
            d = a;
        } else if (b < a){
            d = a;
        }

        return d;
        
            
    }

    public static void main (String[] arguments) {
        String[] names = {
            "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
            "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
            "Aaron", "Kate"
        };

        int[] times = {
            341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
            343, 317, 265
        };

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + ": " + times[i]);
        }

        System.out.println(names[Fastest()] + 
            " is the fastest runner with a time of " +
            times[Fastest()]);
    }


    
}
 
/* 
Solution 1: 
public static int getMinIndex(int[] values) {

int minValue = Integer.MAX
_
VALUE;

int minIndex = -1;
for(int i=0; i<values.length; i++)

if (values[i] < minValue) {
minValue = values[i];
minIndex = i;
}
return minIndex;
}

solution 2:
public static int getSecondMinIndex(int[] values) {
int secondIdx = -1;
int minIdx= getMinIndex(values);
for(int i=0; i<values.length; i++) {
if (i == minIdx)
continue;
if (secondIdx == -1 ||
values[i] < values[secondIdx])
secondIdx = i;

}

return secondIdx;

} 

*/