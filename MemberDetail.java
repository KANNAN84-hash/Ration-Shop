package rationcard;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class MemberDetail
{
	
	 String name;
	public Integer age;
	public LocalDate dob;
	
	@Override
	public String toString() {
		return " { Name="+ name +", age=" + age + ", dob=" + dob + ", gender=" + gender +"}"  ;
	}
	public String gender;
	
	
}

