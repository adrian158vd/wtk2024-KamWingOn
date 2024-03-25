import kotlin.random.Random


object GeneralManager {
    private val generals: MutableList<General> = mutableListOf()
    private val lordFactory = LordFactory();
    private val nonLordFactory = NonLordFactory();

    fun addGeneral(general: General) {
        generals.add(general)
    }


    fun getGeneralCount(): Int = generals.size

    fun createGenerals(nth:Int) {
        generals.clear()


            val lord = lordFactory.createRandomGeneral()
            addGeneral(lord)


        for (i in 2..nth) {
            val nonLord = nonLordFactory.createRandomGeneral()
            addGeneral(nonLord)
        }
    }

    fun printGeneral() {
        generals.forEach{ general ->
            println("General ${general.name} created.")
            println("${general.name}, a ${general.player.identity}, has ${general.player.currentHP} health point. ")
        }
    }


}

fun main() {
    GeneralManager.createGenerals(10)
    GeneralManager.printGeneral()

    val generalCount = GeneralManager.getGeneralCount()
    println("Total number of generals: $generalCount")
}


