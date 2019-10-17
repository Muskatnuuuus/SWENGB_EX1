package fh.joanneum.swengb.lab1

class Canvas(){
    private var shapes = mutableListOf<Shape>()

    fun addShape(shape: Shape){
        shapes.add(shape)
    }
    fun getTotalArea(): Double{
        return shapes.sumByDouble { it.getArea() }

    }

    fun shapesCountPerType():Map<String, Int> {
        shapes.groupBy { it.javaClass.simpleName}.map { it -> it.key to it.value.size }

    }
}