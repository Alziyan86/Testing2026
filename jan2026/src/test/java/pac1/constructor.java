package pac1;
enum gender{
	M,F
}
public class constructor {
 String FirstName;
 String LastName;
 gender g;
 long userid;
 public constructor (String fn,String ln,gender gg,long no)
 {
	 this.FirstName=fn;
	 this.LastName=ln;
	 
	 this.userid=no;
	 this.g=gg;
 }
 
 public String getFirstName() {
	return FirstName;
 }
 public void setFirstName(String firstName) {
	FirstName = firstName;
 }
 public String getLastName() {
	return LastName;
 }
 public void setLastName(String lastName) {
	LastName = lastName;
 }
 //public char getGender() {
	//return Gender;
 //}
 //public void setGender(char gender) {
	//Gender = gender;
 }
 //}


