package screen

object ScreenStack {
    private val screenStack = mutableListOf<Screen>()

    /** Add a screen to screen stack  */
    fun push(screen: Screen) {
        screenStack.add(screen)
    }

    /** Removes the last screen from screen stack */
    fun pop() {
        screenStack.removeLastOrNull()
    }

    /** Returns the last screen from screen stack, or null if screen stack is empty */
    fun peek(): Screen? {
        return screenStack.lastOrNull()
    }
}

sealed class Screen