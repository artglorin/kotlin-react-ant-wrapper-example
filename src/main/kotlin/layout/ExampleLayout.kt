package layout

import kantd.components.CodeBlock
import react.RBuilder
import react.dom.div
import react.dom.h2
import react.dom.hr
import react.dom.p
import kotlin.browser.document

data class Example (
    val exampleTitle: String,
    val code: String,
    val component: RBuilder.() -> Unit
)

data class ExampleBlock(
    val blockTitle: String,
    val examples: List<Example>
)

data class ExamplePageData(
    val pageTitle: String,
    val exampleBlocks: List<ExampleBlock>
)

fun RBuilder.examplePage(pageData: ExamplePageData) {
    document.title = pageData.pageTitle
    p("page-title primary underline"){
        +pageData.pageTitle
    }
    for (exampleBlock in pageData.exampleBlocks) {
        exampleBlock(title = exampleBlock.blockTitle, examples = exampleBlock.examples)
    }
}

fun RBuilder.exampleBlock(
    title: String,
    examples: List<Example>
) {
    div {
        p("underline primary paragraph-title") {
            +title
        }
        for (example in examples) {
            example(
                text = example.exampleTitle,
                code = example.code,
                item = example.component
            )
        }
    }
}

fun RBuilder.example(
    text: String,
    code: String,
    item: RBuilder.() -> Unit
) {
    h2 {
        +text
    }
    child(CodeBlock::class) {
        attrs {
            sourceCode = code
        }
    }

    h2 {
        +"Result"
    }
    p {
        item()
    }
    hr(classes = "example-divider") { }
}