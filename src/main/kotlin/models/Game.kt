package models

sealed class QuestItem(val text: String)

class QuestStep(text: String) : QuestItem(text)

class OneWayDoor(text: String) : QuestItem(text)

data class QuestLine(
	val name: String,
	private val items: List<QuestItem>
) {
	val steps: List<QuestStep> = items.filterIsInstance<QuestStep>()
	fun nextOneWayDoor(step: QuestStep): OneWayDoor? =
		items.dropWhile { it != step }.filterIsInstance<OneWayDoor>().firstOrNull()
}

data class Game(
	val name: String,
	val questLines: List<QuestLine>,
)

