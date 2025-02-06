```groovy
def myMethod(List<String> list) {
  list.eachWithIndex { item, index ->
    println "Item $index: $item"
    if (item == "stop") {
      return // This will only exit the eachWithIndex loop, not myMethod
    }
  }
  println "This will always print"
}

myMethod(['a', 'b', 'stop', 'c'])
```