package by.htp.students;

public class Group {
	private Student[] students;
	private int number;
	int lastIndex;

	public Student[] getStudents() {
		return students;
	}
	

	public Group(int number2, int size) {
		lastIndex = 0;
		this.number = number2;
		students = new Student[size];
	}

	public void addStudent(Student student) {
		students[lastIndex] = student;
		lastIndex++;
	}
}
