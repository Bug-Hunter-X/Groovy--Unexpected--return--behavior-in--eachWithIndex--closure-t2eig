```groovy
def myMethod(List<String> list) {
  list.eachWithIndex { item, index ->
    println "Item $index: $item"
    if (item == "stop") {
      return false // Returning false from the closure will stop iteration
    }
  }
  println "This will only print if 'stop' is not in the list"
}

myMethod(['a', 'b', 'stop', 'c'])

//Alternative solution using find

def myMethod2(List<String> list) {
    list.findIndexOf { it == "stop" }?.let {
        println "Item at index $it is 'stop'"
    }?:println "'stop' not found"
}

myMethod2(['a', 'b', 'stop', 'c']) 
```