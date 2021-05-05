package rationcard;



public class CardName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NameManager.initialMembers(); // initially all the members gets added creating the ration card
		
	
		String name ="R.Revathy";
		NameManager.addMember(name);//add a single member to the card
	
		String name1="Mrs.Santhi";
	    NameManager.removeMember(name1);// remove a member in the card
	
		String name2="Mrs.Santhi";
		String name3="Mrs.Shanthi";
		NameManager.update(name2,name3);// one name gets changed by another name
		NameManager.displayMembers();// display all the members
		String name4 = "R.Revathy";
		boolean result=NameManager.namePresent(name4);//check whether the particular name is present 
		                                                   
        System.out.println(result);
        
		
	}

}
