public class Paciente implements Comparable<Pacientes> {

	private String empName;

	private String empenfermedad;

	private Integer empgravedad;

	

	public void Paciente(String empName, String empenfermedad, int empgravedad){

		this.empName = empName;

		this.empenfermedad = empenfermedad;

		this.empgravedad = empgravedad;

	}

	

	public boolean equals1(Object obj) {


		Pacientes e2 = (Pacientes) obj;

		//System.out.println(this.empId + " "+ e2.empId);

		if(this.empName==e2.empName){

			return true;

		}

		return false;

	}
	public boolean equals(Object obj) {

		Pacientes e2 = (Pacientes) obj;

		//System.out.println(this.empId + " "+ e2.empId);

		if(this.empenfermedad==e2.empenfermedad){

			return true;

		}

		return false;


	

	}
	public boolean equals3(Object obj) {

		Pacientes e2 = (Pacientes) obj;

		//System.out.println(this.empId + " "+ e2.empId);

		if(this.empgravedad==e2.empgravedad){

			return true;

		}
	

		return false;
	}


	

	@Override

	//public String toString() {
	public String toString() {
		return "Paciente [empName=" + empName + ", empenfermedad=" + empenfermedad + ", empgravedad=" + empgravedad
				+ "]";
		//return this.getempName()+"-"+this.getempenfermedad()+"-"+this.getempgravedad();
		//esta linea me sale con error por favor revisala//
		

	}





	@Override

	public int compareTo(Pacientes emp) {		

		// Natural ordering based on empId. 

		// As objects are sorted in ascending order of empId. So Employee object with smaller empId will have higher priority.

		return this.getempName().compareTo(emp.getempName());

	}



	@Override
	public int compareTo(Pacientes arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

}
