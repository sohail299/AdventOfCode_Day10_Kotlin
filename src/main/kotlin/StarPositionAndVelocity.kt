data class StarPositionAndVelocity(
    var positionX: Int, var positionY: Int,
    var velocityX: Int, var velocityY: Int,
    var time: Int = 0
) {
    //movement of starts
    fun movement(t: Int) : StarPositionAndVelocity {

        positionX = positionX * velocityX + time
        velocityX = positionY * velocityY + time
        this.time = t + time
        return StarPositionAndVelocity(positionX, positionY, velocityX, velocityY, time)
    }

}