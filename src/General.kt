abstract class General(val name: String , val player: Player) : Player by player {

}

class LiuBei(player: Player) : General("Liu Bei" , player){
    init {
        player.currentHP= 5
    }
}

class CaoCao(player: Player) : General("Cao Cao" , player){
    init {
        player.currentHP= 5
    }
}

class SunQuan(player: Player) : General("Sun Quan" , player){
    init {
        player.currentHP= 5
    }
}


class ZhouYu(player: Player) : General("Zhou Yu" , player){
    init {
        player.currentHP= 3
    }
}


class DiaoChan(player: Player) : General("Diao Chan" , player){
    init {
        player.currentHP= 3
    }
}


class LvBu(player: Player) : General("Lv Bu" , player){
    init {
        player.currentHP= 4
    }
}

class ZhugeLiang(player: Player) : General("Zhuge Liang" , player){
    init {
        player.currentHP= 4
    }
}

class XuChu(player: Player) : General("Xu Chu" , player){
    init {
        player.currentHP= 4
    }
}

class GuanYu(player: Player) : General("Guan Yu" , player){
    init {
        player.currentHP= 4
    }
}

class SimaYi(player: Player) : General("Sima Yi" , player){
    init {
        player.currentHP= 3
    }
}


class ZhengFei(player: Player) : General("Zheng Fei" , player){
    init {
        player.currentHP= 4
    }
}


class ZhenJi(player: Player) : General("Zhen Ji" , player){
    init {
        player.currentHP= 3
    }
}




