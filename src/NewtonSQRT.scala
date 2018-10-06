object NewtonSQRT extends App{
  def sqrt(x: Double): Double = sqrtIter(1, x)

  def square(x: Double): Double = x * x

  def isGoodEnough(y: Double, x: Double): Boolean = Math.abs(square(y) - x) < 0.001

  def improve(y: Double, x: Double): Double = (y + x / y) / 2

  def sqrtIter(y: Double, x: Double): Double = if (isGoodEnough(y, x)) y else sqrtIter(improve(y, x), x)

  Console.println("Square root of 31 is: " + sqrt(31))
  Console.println("(Square root of 31)^2 is: " + square(sqrt(31)))
}
