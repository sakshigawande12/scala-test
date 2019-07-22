package edu.knoldus

class Sorting {

  /*def insertionSort(list: List[Int]): List[Int] = {
    var arr=list.toArray
    var i = 0
    var key = 0
    var j = 0
    i = 1
    while ( {
      i < arr.length
    }) {
      key = arr(i)
      j = i - 1
       while ( {
        j >= 0 && arr(j) > key
      }) {
        arr(j + 1) = arr(j)
        j = j - 1
      }
      arr(j + 1) = key

      {
        i += 1; i - 1
      }
    }
  } */



  def bubbleSort(list: List[Int]): List[Int] = {
    val arr=list.toArray
     for (i <- 1 to arr.length - 1) {
      for (j <- (i - 1) to 0 by -1) {
        if (arr(j) > arr(j + 1)) {
          var temp = arr(j + 1)
          arr(j + 1) = arr(j)
          arr(j) = temp
        }
      }
    }
    arr.toList
  }

}