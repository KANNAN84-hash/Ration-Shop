package rationcard;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MemberManagerTest {

	@Test
	public void test1() {
		CardMemberManager.addMember("kannan",10,"2000-01-11","male");
		
		}

	@Test
	public void test2() {
		
		CardMemberManager.displayMember();
		}
	
	
	
	@Test
	public void test3() {
		NameManager.initialMembers();
		
		}
	
	@Test
	public void test4() {
		String name = "N.Vibin";
		NameManager.addMember(name);
		
		}
	@Test
	public void test5() {
		
		NameManager.displayMembers();
		
		}
	
	@Test
	public void test6() {
		String name = "N.Vibin";
		NameManager.removeMember(name);
		
		}
	@Test
	public void test7() {
		
		NameManager.displayMembers();
		
		}
	
	@Test
	public void test8() {
		String name1="Mrs.Santhi";
		String name2="Mrs.Shanthi";
		
		NameManager.update( name1,  name2);
		
		}
	@Test
	public void test9() {
		
		NameManager.displayMembers();
		
		}
	
	@Test
	public void test10() {
		NameManager.initialMembers();
		String name="Mr.Rajendran";
		
		boolean count=NameManager.namePresent(name);
		assertEquals(true,count);
		
		}

	
}
