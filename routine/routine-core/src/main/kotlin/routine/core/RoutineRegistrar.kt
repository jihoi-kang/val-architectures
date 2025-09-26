package routine.core

interface RoutineRegistrar {

    suspend fun register(routine: Routine)

    suspend fun unregister(routine: Routine)

}