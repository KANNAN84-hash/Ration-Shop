package rationcard;

import java.time.LocalDate; 
import java.util.ArrayList;

public class CardMemberManager {
	static ArrayList<MemberDetail> data = new ArrayList<MemberDetail> ();// object data is created of type
	                                                          // BioData and it is array list form
	/**
	 * value is given to the data by creating the object and giving the names
	 * @param name
	 * @param age
	 * @param dateOfBirth
	 * @param gender
	 */
public static  void addMember(String name,int age,String dateOfBirth,String gender )
	

{
	MemberDetail user1 = new MemberDetail();
	user1.name = name;
	String date =dateOfBirth; 
	user1.dob=LocalDate.parse(date); 
	user1.age=age;
	user1.gender=gender;
	data.add(user1);

}
/**
 * display the detail of the particular member
 */
  public static void displayMember()
  {
	  for (MemberDetail memberDetail : data) {
			
			System.out.println(memberDetail);
		}
  }
	
	

}
