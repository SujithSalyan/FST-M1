package activities;
import java.util.ArrayList;

public class Activity9 {

	public static void main(String[] args) {
		ArrayList<String> myarrList = new ArrayList<String>();//declaration of Array list of datatypes 'String'
		//Adding items to arraylist at default index
		myarrList.add("BMW");
		myarrList.add("Hyundai");
		myarrList.add("Toyota"); 
		//Adding items to arraylist at specific index
		myarrList.add(0,"Nissan");
		myarrList.add(3,"Fiat");
		
		System.out.println("All objects in the arra list are :");
		for(String s:myarrList)
		{
			System.out.println(s);
		}
		
		
		System.out.println("Third Element in the list is:"+myarrList.get(2));
		
		System.out.println("Is Suzuki in the list ?:"+myarrList.contains("Suzuki"));
		
		
		System.out.println("Size of the array list is:"+myarrList.size());
		
		
		myarrList.remove("Fiat");
		
		System.out.println("New size of the Array list is :"+myarrList.size());

	}

}
