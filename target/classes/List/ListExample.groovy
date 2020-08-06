import groovy.beans.ListenerList

// empty list

def list=[]

println list.size()

// to define the generics of the list

def list2=[2,3,4,5,1]

// different ways to add values to the list
//1
list.add("Dwarika")



//2
list << "Lisa"

//3
list.push("Example3")

println list

//4// its like replace
list.putAt(1,"Collect")
println list

// to retreive or get value

// 1

println list[1]

//2

println list.get(2)

//3

println list.getAt(0)

//4

println list[-3]
// To remove value from the list- provide the value and remove

println list.remove("Example3")

println list

//2
//Provide the index and remove

list.add("demo1")

list.add("demo2")

list.add("demo3")

list.add("demo4")

println list


println list.remove(0)

println list

//3 remove// very impor
list=list-"demo2"

println list

//How to count same king of data in list

def lis3=[1,3,3,5,7,5,8,9,0]

println lis3.count(3)

//To sort the list

println.sort






