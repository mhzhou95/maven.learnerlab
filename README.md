# Student, Instructor, Classroom
* **Purpose** - to demonstrate the use of [Java interfaces](http://tutorials.jenkov.com/java/interfaces.html)


# Part 1.1 - Create `Person` Class
* Create a `Person` class.
	* `Person` constructor should have a parameter of type `String` which sets the `name` instance-variable to the respective value.
	* The class should declare a `final` field named `id` of type `long`.
	* The class should define a `getId()` method which returns the `Person` object's `id` field.
	* The class should define a `getName()` method which returns the `Person` object's `name` field.
	* The class should define a `setName()` method which sets the `Person` object's `name` field.

-
# Part 1.0 - Test `Person`
* Create a `TestPerson` class.
	* Create a `testSetName` method which ensures that a `Person` object's `name` variable is being set by invoking the `.setName` method.
	* Create a `testConstructor` method which ensures that a `Person` object's `name` variable is being set by invoking the `Person` constructor.

-
# Part 2.0 - Create `Learner` Interface
* Create a `Learner` interface.
	* `Learner` should declare one method signature:
		* Method name: `learn`
		* Method parameters: `double numberOfHours`
		* Method return-type: `void`

-
# Part 3.1 - Create `Student` Class
* Create a `Student` class such that:
	* `Student` is a subclass of `Person`
	* `Student` implements the `Learner` interface
	* `Student` should have an instance variable `totalStudyTime` of type `double`
	* `Student` should have a concrete implementation of the `learn` method which increments the `totalStudyTime` variable by the specified `numberOfHours` argument.
	* `Student` should have a `getTotalStudyTime()` method which returns the `totalStudyTime` instance variable.


-
# Part 3.0 - Test `Student`
* Create a `TestStudent` class.
	* Create a `testImplementation` method that asserts that a `Student` is an `instanceof` a `Learner`.
	* Create a `testInheritance` method that asserts that a `Student` is an `instanceof` a `Person`.
	* Create a `testLearn` method that ensures a `Student`'s `totalStudyTime` instance variable is incremented by the specified `numberOfHours` by invoking the `.learn` method.

-
# Part 4.0 - Create `Teacher` Interface
* Create a `Teacher` interface.
	* `Teacher` should declare a `teach` method signature:
		* Method name: `teach`
		* Method parameters:
			* `Student student`
			* `double numberOfHours`
		* Method return-type: `void` 

	* `Teacher` should declare a `lecture` method signature:
		* Method name: `lecture`
		* Method parameters:
			* `Student[] student`
			* `double numberOfHours`
		* Method return-type: `void`

		
-
# Part 5.1 - Create `Instructor` Class
* Create an `Instructor` class such that:
	* `Instructor` is a subclass of `Person`
	* `Instructor` implements the `Teacher` interface
	* `Instructor` should have a concrete implementation of the `teach` method which invokes the `learn` method on the specified `Student` object.
	* `Instructor` should have a concrete implementation of the `lecture` method which invokes the `learn` method on each of the elements in the specified array of `Student` objects.
		* `numberOfHours` should be evenly split amongst the students.
			* `double numberOfHoursPerStudent = numberOfHours / students.length;`

-
# Part 5.0 - Test `Instructor`
* Create a `TestInstructor` class.
	* Create a `testImplementation` method that asserts that an `Instructor` is an `instanceof` a `Teacher`.
	* Create a `testInheritance` method that asserts that a `Instructor` is an `instanceof` a `Person`.
	* Create a `testTeach` method that ensures when an `Instructor` invokes the `.teach` method, a respective student's `totalStudyTime` instance variable is incremented.
	* Create a `testLecture` method that ensures when an `Instructor` invokes the `.teach` method, a respective student's `totalStudyTime` instance variable is incremented by the specified `numberOfHours`.


-
# Part 6.1 - Create `People` class
* Create a `People` class.
	* The class should instantiate an `ArrayList` field of `Person` objects named `personList`.
	* The class should define a method named `add` which adds a `Person` to the `personList`.
	* The class should define a method named `findById` which makes use of a `long id` parameter to return a `Person` object with the respective `id` field.
	* The class should define a method named `remove` which makes use of a `Person person` parameter to remove a respective `Person` object.
	* The class should define a method named `remove` which makes use of a `long id` parameter to remove a `Person` object with the respective `id` field.
	* The class should define a method named `getArray` which returns an array representation of the `personList` field.
	* The class should define a named `removeAll` which clears our `personList` field.
	
-
# Part 6.0 - Test `People`
* Create a `TestPeople` class.
	* Create a `testAdd` method which ensures that our `personList` in our `People` class populated with respective `Student` objects following invokation of the `addStudent` method.
	* Create a `testRemove` method which ensures that the `personList` in a `People` object is **depopulated** with a respective `Person` object following the invokation of the `remove` method.
	* Create a `testFindById` method which ensures that a respective `Person` object with a respective `id` field is returned upon invokation of the `findById` method on a respective `People` object.


-
# Part 7.1 - Create `MyCohort` singleton
* **Note:** The creation of this class will demonstrate an implementation of [singleton design pattern](https://www.journaldev.com/1377/java-singleton-design-pattern-best-practices-examples#eager-initialization).
* Create a `MyCohort` class.
	* The class should be a subclass of the `People` class.
	* The class should _statically instantiate_ a `final` field named `INSTANCE` of type `MyCohort`.
	* The class should define a _private constructor_ which populates the `INSTANCE` field with respective `Student` representations of your colleagues.
		* Each student should have a unique `id` field.
	* The class should define a `getInstance` method which returns the `INSTANCE` field.
	
	

-
# Part 7.0 - Test `MyCohort` singleton
* Create a `TestMyCohort` class.
	* Create a `test` method which ensures that each of the students in your current cohort are in your `MyCohort` singleton.

-
# Part 7.2 - Create `ZipCodeInstructors` singleton
* Use `Part 7.0` and `Part 7.1` as a reference.
* Create a `ZipCodeInstructors` singleton which represents the set of instructors at ZipCodeWilmington.
* Create a `TestZipCodeInstructors` class.



-
# Part 8.1 - Create `ZipCodeWilmington` Class
* Use `Part 7` as a reference.
* Create a `ZipCodeWilmington` singleton.
	* The class should declare a field that references `MyCohort` called `cohort`.
	* The class should declare a field that references `ZipCodeInstructors` called `instructors`.
	* The class should define a method `hostLecture` which makes use of a `long id, double numberOfHours` parameter to identify a respective `Instructor` to host a `lecture` to the composite `people` field in the `cohort` reference.

-
# Part 8.0 - Test `ZipCodeWilmington`
* Create a `TestZipCodeWilmington` class.
	* Create a `testHostLecture` method which ensures that each of the `Student`'s `totalStudyTime` instance variable is incremented by the specified `numberOfHours` upon invoking the `.hostLecture` method.
