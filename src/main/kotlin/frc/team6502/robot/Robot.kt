package frc.team6502.robot

import kyberlib.command.KRobot
import kyberlib.input.controller.KXboxController

class Robot : KRobot() {
    val controller = KXboxController(0)

    override fun teleopPeriodic() {
        val leftSpeed = controller.leftX.value
        val rightSpeed = controller.rightX.value
    }
}