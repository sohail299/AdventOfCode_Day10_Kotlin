data class StarPositionAndVelocity(
    var positionX: Int, var positionY: Int,
    var velocityX: Int, var velocityY: Int,
    var time: Int = 0
) {
    var posX = 0
    var posY = 0
    var t = 0

    //movement of starts
    fun movement(t: Int) : StarPositionAndVelocity {

        posX = positionX * velocityX + time
        posY = positionY * velocityY + time
        this.t = t + time
        return StarPositionAndVelocity(posX, posY, velocityX, velocityY, this.t)
    }

}