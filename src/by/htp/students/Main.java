package by.htp.students;

public class Main {

	public static void main(String[] args) {

		Administrator admin = new Administrator();

		Student student1 = new Student("Dima", 30);
		Student student2 = new Student("Vitaly", 31);
		Student student3 = new Student("Olga", 32);
		Student student4 = new Student("Ivan", 33);
		Group group = admin.createGroup(5, 3);

		admin.enrollStudent(student3, group);
		admin.enrollStudent(student1, group);
		admin.enrollStudent(student2, group);
		admin.enrollStudent(student4, group);

		admin.printGroup(group);
		System.out.println("" + admin);

		admin.sortStudents(group);
		admin.printGroup(group);

		admin.deleteStudentWithMinRating(admin.minRating(group), group);
		admin.printGroup(group);
	}

}
