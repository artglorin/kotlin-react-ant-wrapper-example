package kantd.components

import kotlinx.html.classes
import kotlinx.html.js.onClickFunction
import react.*
import react.dom.code
import react.dom.div
import react.dom.pre


interface CodeBlockState : RState{
    var open: Boolean?
}
interface CodeBlockProps : RProps{
    var sourceCode: String?
}

class CodeBlock(props: CodeBlockProps): RComponent<CodeBlockProps, CodeBlockState>(props) {

    override fun RBuilder.render() {
        val active = state.open == true
        div {
            +"""${ if (active) "Hide" else "Show"} code"""
            attrs{
                classes += """source-code-button ${ if (active) "active" else ""}"""
                onClickFunction = {
                    setState {
                        open = !(state.open ?: false)
                    }
                }
            }
        }
        if (active)  {
            props.sourceCode?.let {sourceCode ->
                pre("source-code") {
                    code {
                        +sourceCode
                    }
                }
            }
        }
    }

}