package java_development_que;

public class quetion_2 {
      int id;
      String Name;
     String Department ;
     

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public String getDepartment() {
		return Department;
	}


	public void setDepartment(String department) {
		Department = department;
	}
    public quetion_2(int  id ,String department,String name ) {
    	this.setDepartment(department);
    	this.setName(name);
    	this.setId(id);
    }

	public static void main(String[] args) {
		 quetion_2 obj=new quetion_2(135,"civil Engineering","satish manepalli" );
		 //acessing:
		 System.out.printf("Department =%s\n",obj.getDepartment());
		 System.out.printf("id  =%d \n", obj.getId());
		 System.out.printf("Name  =%s \n",obj.getName());
	}

}
