fun main() {
    val setA = (1..10).toSet()
    val setB = (5..15).toSet()

    val intersection = setA.intersect(setB)

    println("Пересечение setA и setB: $intersection")

    val union = setA.union(setB)

    println("Объединение setA и setB: $union")

    val diff = setA.subtract(setB)

    println("Разность  setA и setB: $diff")

    val isASubsetOfB = setA.subtract(setB).isEmpty()
     val isBSubsetOfA = setB.subtract(setA).isEmpty()

    println("setA является подмножеством setB: $isASubsetOfB")
    println("setB является подмножеством setA: $isBSubsetOfA")

    val symmetricDifference = (setA - setB) union (setB - setA)
    println("Симметрическая разность setA и setB: $symmetricDifference")

    val areEqual = setA == setB


    println("Множества setA и setB равны: $areEqual")


}

