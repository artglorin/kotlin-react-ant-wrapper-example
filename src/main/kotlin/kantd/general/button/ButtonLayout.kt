package kantd.general.button

import layout.Example
import layout.ExampleBlock
import layout.ExamplePageData
import layout.examplePage
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.span
import kotlin.browser.window

class ButtonLayout : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        examplePage(
            ExamplePageData(
                pageTitle = "Button examples",
                exampleBlocks = listOf(
                    ExampleBlock(
                        blockTitle = "Base button",
                        examples = listOf(
                            Example(
                                exampleTitle = "Simple buttons",
                                code = "antdBaseButton()",
                                component = {
                                    antdBaseButton()
                                }
                            ),
                            Example(
                                exampleTitle = "A Primary block button with text",
                                code = "antdBaseButton {\n" +
                                        "    buttonText = \"Button text\"\n" +
                                        "    block = true\n" +
                                        "    type = AntdButtonType.PRIMARY\n" +
                                        "}",
                                component = {
                                    antdBaseButton {
                                        buttonText = "Button text"
                                        block = true
                                        type = AntdButtonType.PRIMARY
                                    }
                                }
                            ),
                            Example(
                                exampleTitle = "A clickable button with text and Danger type.",
                                code = "antdBaseButton {\n" +
                                        "    buttonText = \"Click me\"\n" +
                                        "    onClick = { window.alert(\"Button clicked.\") }\n" +
                                        "    type = AntdButtonType.DANGER\n" +
                                        "}",
                                component = {
                                    antdBaseButton {
                                        buttonText = "Click me"
                                        onClick = { window.alert("Button clicked.") }
                                        type = AntdButtonType.DANGER
                                    }
                                }
                            ),
                            Example(
                                exampleTitle = "Button with custom content",
                                code = "antdBaseButton {\n" +
                                        "    buttonText = \"This text is from 'buttonText' property.\"\n" +
                                        "    content = {\n" +
                                        "        span(\"notable-span\") {\n" +
                                        "            +\"And this text is from 'content' property.\"\n" +
                                        "        }\n" +
                                        "    }\n" +
                                        "}",
                                component = {
                                    antdBaseButton {
                                        buttonText = "This text is from 'buttonText' property."
                                        content = {
                                            span("notable-span") {
                                                +"And this text is from 'content' property."
                                            }
                                        }
                                    }
                                }
                            )
                        )
                    ),
                    ExampleBlock(
                        blockTitle = "Anchor button",
                        examples = listOf(
                            Example(
                                exampleTitle = "Anchor button with link to the 'Ant design site'",
                                code = "antdAnchorButton {\n    icon = \"heart\"\n    href = \"https://ant.design/components/button/\"\n    target = \"_blank\"\n    buttonText = \"Open ant design site\"\n    rel = \"nofollow\"\n}",
                                component = {
                                    antdAnchorButton {
                                        icon = "heart"
                                        href = "https://ant.design/components/button/"
                                        target = "_blank"
                                        buttonText = "Open ant design site"
                                        rel = "nofollow"
                                    }
                                }
                            )
                        )
                    ),
                    ExampleBlock(
                        blockTitle = "Native button",
                        examples = listOf(
                            Example(
                                exampleTitle = "Native button",
                                code = "antdNativeButton {\n    href = \"\"\n    target = \"_self\"\n    name = \"\"\n    buttonText = \"Native button\"\n}",
                                component = {
                                    antdNativeButton {
                                        href = ""
                                        target = "_self"
                                        name = ""
                                        buttonText = "Native button"
                                    }
                                }
                            )
                        )
                    )
                )
            )
        )
    }
}

