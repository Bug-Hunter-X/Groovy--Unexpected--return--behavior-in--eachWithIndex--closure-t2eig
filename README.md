# Groovy: Unexpected `return` behavior in `eachWithIndex` closure

This example demonstrates a common pitfall in Groovy when using the `eachWithIndex` method.  The `return` statement inside the closure only exits the closure itself, not the enclosing method.

The `bug.groovy` file shows the problem. The expected behavior might be to stop processing when "stop" is encountered. However, the code after the `eachWithIndex` loop still executes.

The solution in `bugSolution.groovy` demonstrates a correct way to achieve the desired behavior.