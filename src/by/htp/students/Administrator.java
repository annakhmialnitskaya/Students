package by.htp.students;

import java.util.Arrays;

public class Administrator {
	private String name;

	public Administrator() {
		this.name = "Vasya";
	}

	public Group createGroup(int groupNumber, int studentsCount) {
		Group group = new Group(groupNumber, studentsCount);
		return group;
	}

	public void enrollStudent(Student student, Group group) {
		group.addStudent(student);
	}

	public void printGroup(Group group) {
		Student[] list = group.getStudents();
		for (int i = 0; i < list.length; i++) {
			if (list[i] != null) {
				System.out.println(list[i]);
			}
		}
	}

	public String toString() {
		return "admin: " + name;
	}

	public double minRating(Group group) {
		Student[] list = group.getStudents();
		double minValue = list[0].getRating();
		for (int i = 0; i < list.length; i++) {
			if (list[i].getRating() < minValue) {
				minValue = list[i].getRating();
			}
		}
		return minValue;
	}

	public void deleteStudentWithMinRating(double minRating, Group group) {
		System.out.println("delete students with min rating:");
		Student[] list = group.getStudents();
		for (int i = 0; i < list.length; i++) {
			if (minRating == list[i].getRating()) {
				list[i] = null;
			}
		}
	}

	public void sortStudents(Group group) {
		System.out.println("Sort students ascending:");
		Student[] list = group.getStudents();
		Arrays.sort(list);
	}
}
