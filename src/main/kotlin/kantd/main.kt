package kantd

import kantd.general.button.ButtonLayout
import react.RBuilder
import react.dom.*
import react.router.dom.browserRouter
import react.router.dom.navLink
import react.router.dom.route
import kotlin.browser.document


external fun require(name: String): dynamic

fun main() {
    require("antd")
    require("antd/dist/antd.css")
    require("kotlin-react-antd")
    require("react")
    require("react-dom")
    require("react-router-dom")
    render(document.getElementById("content")) {
        browserRouter {
            navigation()
            content()
        }
    }
}
fun RBuilder.navigation() {
    div(classes = "main-menu") {
        h2 {
            +"Content"
        }
        ul {
            li {
                navLink("/general/button"){
                    +"Buttons example."
                }
            }
        }
    }
}

fun RBuilder.content() {
    div(classes = "content") {
        route(path = "/general/button") {
            child(ButtonLayout::class){}
        }
//        route(path = "general") {
//        }
    }
}
