package by.htp.students;

public class Student implements Comparable<Student> {

	private String fio;
	private Double rating;

	public Student() {
	}

	public String getFio() {
		return fio;
	}

	public Double getRating() {
		return rating;
	}

	public Student(String fio, double rating) {
		this.fio = fio;
		this.rating = rating;
	}

	public String toString() {
		return " fio: " + fio + " rating:" + rating;
	}

	@Override
	public int compareTo(Student anotherStudent) {
		return getRating().compareTo(anotherStudent.getRating());
	}
}
