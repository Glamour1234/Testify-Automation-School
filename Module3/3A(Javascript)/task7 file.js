const side1 = 1
const side2 = 2
const side3 = 3

if (side1 === side2 & side2 === side3 & side1 === side3 ){
    console.log ('Equilateral triangle')

} else  if(side1 === side2 || side2 === side3 || side1 === side3){
    console.log ('Isosceles triangle')

} else if (side1 != side2 ||side2 !=side3 || side1 != side3 ){
    console.log ('Scalene triangle')
}