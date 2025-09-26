package routine.core

data class Routine(
    val id: Int,
    val trigger: Trigger,
    val condition: Expression,
    val actions: List<Action>,
)