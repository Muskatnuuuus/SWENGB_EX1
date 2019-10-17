package fh.joanneum.swengb.lab1

fun main() {
    val testShape = Shape()
    println(testShape.color) //black

    val testRectangle = Rectangle(width = 5.0, length = 2.0 )
    println(testRectangle.getArea()) // 10.0
    testRectangle.length // 2

    val aShape: Shape = testRectangle
    // aShape.width // ERROR: not available!
    println(aShape.getArea()) // 10.0

    val testCircle = Circle(radius = 3.0)
    println(testCircle.getArea()) // 10.0
    testCircle.radius // 2

    val circle = Circle(radius = 10.0, color = "red")
    println(circle)

    val rectangle = Rectangle(width = 6.0, length = 4.0, color = "blue")
    println(rectangle)



    val circle1 = Circle(radius = 10.0, color = "red")
    val circle2 = Circle(radius = 10.0, color = "red")

    println(circle1 === circle2) //  checking referential integrity
    println(circle1 == circle2) //  checking structural integrity
    println(setOf<Circle>(circle1, circle2).size) // elements in the set


    val canvas = Canvas()
    canvas.addShape(Rectangle("white", width = 5.0, length = 2.0))
    canvas.addShape(Circle("red", radius = 1.0))
    println(canvas.getTotalArea()) //  13.14
}

