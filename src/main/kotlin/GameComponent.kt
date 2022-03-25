import models.Game
import models.OneWayDoor
import models.QuestLine
import react.Props

import react.dom.*
import react.functionComponent
import react.useState

external interface GameProps : Props {
	var game: Game
}

val gameComponent = functionComponent<GameProps> { props ->
	val (state, setState) = useState(mapOf<QuestLine, Int>())

	div {
		h1 {
			+props.game.name
		}
		ul {
			val remainingOneWayDoors = mutableSetOf<OneWayDoor>()
			for (ql in props.game.questLines) {
				val curStep = state[ql] ?: 0
				for (step in ql.steps.take(curStep)) {
					key = step.text
					li {
						span(classes = "badge bg-secondary") {
							+"Done"
						}
						+" "
						b {
							+ql.name
						}
						+": "
						+step.text
					}
				}
			}
			for (ql in props.game.questLines) {
				val curStep = state[ql] ?: 0
				if (curStep < ql.steps.size) {
					li {
						key = ql.name
						b {
							+ql.name
						}
						+": "
						+ql.steps[curStep].text
						+" "
						button(classes = "btn btn-primary btn-sm") {
							+"Done"
							attrs {
								onClick = {
									setState(state.plus(Pair(ql, curStep + 1)))
								}
							}
						}
					}
					val owd: OneWayDoor? = ql.nextOneWayDoor(ql.steps[curStep])
					if (owd != null) {
						remainingOneWayDoors.add(owd)
					}
				}
			}
			for (owd in remainingOneWayDoors) {
				li {
					key = owd.text
					span(classes = "badge rounded-pill bg-danger") {
						+"One Way Door"
					}
					+" "
					+owd.text
				}
			}
		}
	}
}