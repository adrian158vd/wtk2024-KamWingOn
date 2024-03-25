interface Player {
    var currentHP:Int
    val identity: String
}

class Lord : Player {
    override var currentHP : Int = 0
    override var identity : String = "Lord"
}

class Loyalist : Player {
    override var currentHP : Int = 0
    override var identity : String = "Loyalist"
}

class Spy : Player {
    override var currentHP : Int = 0
    override var identity : String = "Spy"
}

class Rebel : Player {
    override var currentHP : Int = 0
    override var identity : String = "Rebel"
}

