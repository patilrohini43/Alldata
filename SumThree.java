package all.program.com;


import java.util.*; 
  
public class SumThree{ 
  
    
    public static List<List<Integer> > findTriplets(int[] b, int sum) 
    { 
  
        
        Arrays.sort(b); 
  
        List<List<Integer> > pair = new ArrayList<>(); 
        TreeSet<String> set = new TreeSet<String>(); 
        List<Integer> triplets = new ArrayList<>(); 
  
      
        for (int i = 0; i < b.length - 2; i++) { 
  
            
            int j = i + 1; 
  
           
            int k = b.length - 1; 
  
            while (j < k) { 
  
                if (b[i] + b[j] + b[k] == sum) { 
  
                    String str = b[i] + ":" + b[j] + ":" + b[k]; 
  
                    if (!set.contains(str)) { 
  
                       
                        triplets.add(b[i]); 
                        triplets.add(b[j]); 
                        triplets.add(b[k]); 
                        pair.add(triplets); 
                        triplets = new ArrayList<>(); 
                        set.add(str); 
                    } 
  
                    j++; 
                    k--; 
  
                } else if (b[i] + b[j] + b[k] < sum) 
                    j++; 
  
                else 
                    k--; 
            } 
        } 
        return pair; 
    } 
  
    public static void main(String[] args) 
    { 
        int[] b = { 12, 3, 6, 1, 6, 9 }; 
        int sum = 21; 
        
        
        /*
        Scanner s = new Scanner(System.in);

        System.out.print("Enter no. of elements you want in array:");

       int n = s.nextInt();

        int b[] = new int[n];
        int sum = 24;
    
        System.out.println("Enter all the elements:");

        for(int i = 0; i < n; i++)

        {

            b[i] = s.nextInt();

          sum = sum + b[i];

        }

		System.out.println("Sum:" + sum); 
  */
        List<List<Integer> > triplets = findTriplets(b, sum); 
  
        if (!triplets.isEmpty()) { 
            System.out.println(triplets); 
        } else { 
            System.out.println("No triplets can be formed"); 
        } 
    } 
} 
