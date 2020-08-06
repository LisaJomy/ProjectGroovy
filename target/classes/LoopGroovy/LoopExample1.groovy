package LoopGroovy
//For
//for(intialisation of variable; boolean :incre/dec){
//	action
//}

// program to print 1-10
//for(int i=0; i<=10;i++){
//	println "the value of i "+i
//}

//While

/*intialisation
 * while(condition=boolean){
 * action
 * 
 * increament or decrement
 * 
 * } 
 */

//j=1
//while(j<10){
//	println "the value of j "+j
//	j++
//}
//
////for Each loop
///*for (DataType variable: item[list,map,array]){
//}*/
//
//int item= [1,2,3,4,5,6,7]
//
//for(int i: item){
//	println "the value of i" +i
//}
//
//
//// Using closures
//
////upto
////1.upto(){closure
//
////}
//
//1.upto(10){
//	
//	println "I have used upto 4"
//}

//step
1.step(12,2){
	println "${it}"
}

//times

3.times{
	println" I am learning groovy"
}