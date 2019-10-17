package fh.joanneum.swengb.lab1

open class Shape(val color:String = "black") {
    open fun getArea():Double {
        return 0.0
    }

    override fun toString(): String {
        return "Shape(color='$color')"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Shape

        if (color != other.color) return false

        return true
    }

    override fun hashCode(): Int {
        return color.hashCode()
    }


}

