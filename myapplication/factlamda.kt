class FactorialLambda(n: Int) : (Int) -> Int {
        override fun invoke(n: Int): Int =
                if (n == 0 || n == 1)
                    1;
                else
                    n * this(n - 1);
    }
fun main() {
    val reader = Scanner(System.`in`)
    print("Enter the number : ")
    val num = reader.nextInt()
    val factorialLambda = FactorialLambda(num)
    print(factorialLambda(num))
    }
