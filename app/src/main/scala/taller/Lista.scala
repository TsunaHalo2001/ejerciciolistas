package taller

class Lista() {
  def ejercicio1(l1 : List[Int], l2 : List[Int]) : List[Int] = {
    /*(l1, l2) match {
      case (Nil, Nil) => Nil
      case (x::xs, _) => ejercicio1(xs, l2) :+ x
      case (Nil, y::ys) => ejercicio1(Nil, ys) :+ y
    }*/
    if (l1.nonEmpty) ejercicio1(l1.tail, l2) :+ l1.head
    else if (l2.nonEmpty) ejercicio1(l1, l2.tail) :+ l2.head
    else Nil
  }
}
