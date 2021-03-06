import react.dom.render
import kotlinx.browser.document
import kotlinx.browser.window
import models.EldenRing

fun main() {
	window.onload = {
		render(document.getElementById("root")) {
			child(gameComponent) {
				attrs {
					game = EldenRing
				}
			}
		}
	}
}
