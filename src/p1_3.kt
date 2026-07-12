data class Student(
    var enrollmentNo: String,
    var name: String,
    var branch: String,
    var className: String,
    var batch: String,
    var collegeName: String,
    var universityName: String,
    var age: Int
)

fun main() {

    print("Enter Student Enrollment No: ")
    val enrollmentNo = readLine()!!

    print("Enter Student Name: ")
    val name = readLine()!!

    print("Enter Student Branch: ")
    val branch = readLine()!!

    print("Enter Student Class: ")
    val className = readLine()!!

    print("Enter Student Batch: ")
    val batch = readLine()!!

    print("Enter College Name: ")
    val collegeName = readLine()!!

    print("Enter University Name: ")
    val universityName = readLine()!!

    print("Enter Student Age: ")
    val age = readLine()!!.toInt()

    val student = Student(
        enrollmentNo,
        name,
        branch,
        className,
        batch,
        collegeName,
        universityName,
        age
    )

    println("\n***********************")
    println("Student's Data:")
    println("Enrollment No.: ${student.enrollmentNo}")
    println("Name: ${student.name}")
    println("Age: ${student.age}")
    println("Branch: ${student.branch}")
    println("Class: ${student.className}")
    println("Batch: ${student.batch}")
    println("College Name: ${student.collegeName}")
    println("University Name: ${student.universityName}")
}