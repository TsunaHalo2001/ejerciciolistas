package taller

import org.scalatest.funsuite.AnyFunSuite
import org.junit.runner.RunWith
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class ListaTest extends AnyFunSuite {
  val objBuscarLista = new Lista()

  test("Encontrar 3 en List(1, 2, 3, 4, 5)") {
    assert(objBuscarLista.ejercicio1(List(1, 2, 3), List(4, 5, 6)) === List(6, 5, 4, 3, 2, 1))
  }
}
