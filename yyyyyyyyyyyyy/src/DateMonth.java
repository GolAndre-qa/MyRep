import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DateMonth {

	public static int inSameMonth(int[] A, String[] arr) {
		
		List<String> lst = new ArrayList<String>();
		
		for(String e:arr) {
			System.out.println(e.split("-")[1]);
			lst.add(e.split("-")[1]);
		}
		
		Map<String, Long> ma = new HashMap <>();
		lst.forEach(e -> ma.merge(e, 1L, Long::sum));
		System.out.println("MA:" + ma);
		for(String each:ma.keySet()) {
			if(ma.get(each)>=3) {
				System.out.println("The key is: " + each + "  The value is: " + ma.get(each) );
				int sum = 0;
				for(int i = 0; i < arr.length ; i++) {
					if(arr[i].split("-")[1].equalsIgnoreCase(each)) {
						sum = sum + A[i];
					}
				}
				System.out.println("SUM: " + sum);
			}
			
		}
		

		
		//=========================
		
		 int i = 0;
		 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		 
		 List<Date> date_arr = new ArrayList<Date>();
		 
		 for (String each:arr ) {
			 try {
				date_arr.add(sdf.parse(each));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
		 
		 
		 System.out.println(date_arr);
		 
		 Map <Integer, Long> result_map = new HashMap <Integer, Long>();
		 
		 for(Date edate:date_arr) {
			 if (result_map.containsKey(edate.getMonth())) {
				 result_map.put(edate.getMonth(), result_map.get(edate.getMonth()) + 1L);
			 } else {
				 result_map.put(edate.getMonth(), 1L);
			 }
		 }
		 
		 System.out.println(result_map);

		 Map <Integer, Long> result_map1 = new HashMap <>();
		 
		 date_arr.forEach(e -> result_map1.put(e.getMonth(), result_map1.getOrDefault(e.getMonth(), 0L) + 1L));
		 
		 System.out.println(result_map1);
		 
		 
		 
		 Map <Integer, Long> result_map2 = new HashMap <>();
		 
		 date_arr.forEach(e -> result_map2.merge(e.getMonth(), 1L, Long::sum));
		 
		 System.out.println(result_map2);
		 
		 return i;
	}
	
	
	public static void main(String[] args) {
		
		
		
		inSameMonth(new int[] {100,20,30,90,50,60} ,new String[]{"2020-01-01", "2020-01-02","2020-02-01", "2020-02-02", "2020-02-30", "2020-01-02"});
	}
	
}
