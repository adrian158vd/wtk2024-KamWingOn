import kotlin.random.Random

abstract class GeneralFactory {
    abstract fun createRandomGeneral(): General
    abstract fun createPlayer(nth :Int): Player
}

class LordFactory : GeneralFactory() {
    private val availableLords = mutableListOf("LiuBei", "CaoCao", "SunQuan")

    override fun createRandomGeneral(): General {
        if (availableLords.isEmpty()) {
            throw NoSuchElementException("dont have lord create")
        }
        val player = createPlayer(1)
        val lordName = availableLords.random()
        return when (lordName){
            "LiuBei" -> LiuBei(player)
            "CaoCao" -> CaoCao(player)
            "SunQuan" -> SunQuan(player)
            else -> throw IllegalStateException("wrong lord name")
        }
    }

    override fun createPlayer(nth: Int): Player {
       return Lord()
    }
}

class NonLordFactory : GeneralFactory() {
    private val availableNonLords = mutableListOf(
        "ZhouYu",
        "DiaoChan",
        "LvBu",
        "ZhugeLiang",
        "XuChu",
        "GuanYu",
        "SimaYi",
        "ZhengFei",
        "ZhenJi"
    )

    override fun createRandomGeneral(): General {
        if (availableNonLords.isEmpty()) {
            throw NoSuchElementException("dont have Non-lord create")
        }
        val player = createPlayer(availableNonLords.size)
        val nonlordName = availableNonLords.random()
        availableNonLords.remove(nonlordName)
        return  when (nonlordName){
            "ZhouYu" -> ZhouYu(player)
            "DiaoChan" -> DiaoChan(player)
            "LvBu"  -> LvBu(player)
            "ZhugeLiang" -> ZhugeLiang(player)
            "XuChu"  -> XuChu(player)
            "GuanYu" -> GuanYu(player)
            "SimaYi" -> SimaYi(player)
            "ZhengFei" -> ZhengFei(player)
            "ZhenJi" -> ZhenJi(player)
            else -> throw IllegalStateException("wrong Non-lord name")
        }

    }

    override fun createPlayer(nth: Int): Player {
        var p :Player = Loyalist();
        when (nth){
            2 , 4 , 9 -> p = Loyalist()
            3 , 5 , 6 , 8 -> p = Rebel()
            7 , 1 -> p = Spy()

        }
        return p



    }
}