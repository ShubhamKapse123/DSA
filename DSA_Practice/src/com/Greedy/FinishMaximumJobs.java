import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FinishMaximumJobs {
    public int solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        int n=A.size();
        ArrayList<List<Integer>> mapOfJobTime= new ArrayList<>();

        for(int i=0;i<n;i++){
            List<Integer> map= Arrays.asList(A.get(i),B.get(i));
            mapOfJobTime.add(map);
        }
   Comparator<ArrayList<Integer>> comp = new Comparator<ArrayList<Integer>>() {
        public int compare(ArrayList<Integer> a1, ArrayList<Integer> a2) {
            return a1.get(1).compareTo(a2.get(1));
        }
    };

    // Sort the ArrayList using the Comparator
  Arrays.sort(mapOfJobTime);

int count = 1;
int endTime = mapOfJobTime.get(0).get(1);

for(int i=0;i<n;i++){
if(mapOfJobTime.get(i).get(0)>endTime){
        count++;
        endTime=mapOfJobTime.get(i).get(1);
}

  
 }
 return count;
}
}