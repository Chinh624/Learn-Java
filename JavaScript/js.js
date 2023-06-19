
function User(userName,password){
    this.userName = userName;
    this.password = password;
}
 getUser = function() {
return  `${this.userName} ${this.password}`;
}
// ban co the su dung cai nay de tao nhung doi tuong user moi 
// example: var user1= new User("tham so truyen vao");
//             console.log(user1);



user1 = new User("chinh",123);
console.log(user1);
var cart = [];


function User(userName, password) {
this.userName = userName;
this.password = password;
this.getUser = function() {
    return `${this.userName} ${this.password}`;
  };
}

// You can use this code to create new user objects
// Example: var user1 = new User("tham so truyen vao");
// console.log(user1);

var user1 = new User("chinh", 123);
console.log(user1);





var random = Math.floor(Math.random() * 100);

if(random < 50){
console.log("congulutions")
}else{
console.log("failed");
}

function getRandNumbers (min, max, length){
var arrNumbers = [];

for (var i = 0; i < length; i++) { 
    var numRandom = Math.floor(Math.random() * (max - min) + min);
arrNumbers.push(numRandom);
// lam tron + tim so ngau nhien 
// Them numRamdom vao arrNumbers
} 
return arrNumbers;
}

console.log(getRandNumbers(3, 8, 5));


// Tao ham roi truyen tham so min max length 

console.log(getTotal([1,2,3]));

function getTotal(arr) { 
    var sum=0;
    for(var i=0 ; i< arr.length;i++){
        sum = sum + arr[i];
    }
    return sum;
    }


var myArray = [
'javascript',
'php',
'js',
'css',
];

var arrayLength = myArray.length;

for(var i=0 ; i< arrayLength ; i++) {
console.log(myArray[i]);
}

// vong lap for of

var myinfor={
name:'chinh' ,
age: 18,

};

console.log(Object.keys(myinfor));

for(var value of Object.keys(myinfor)){
console.log(value);
}



var myArray2 = [
'javascript',
'php',
'js',
'css',
];

var i =0;

while(i< myArray2.length) {
i++;
console.log(myArray2[i]);
}




var userBuy = [
{
Price: 100,
Name: 'Chinh',
Age:18
},

{
Price: 200,
Name: 'Yi',
Age:18
},

{
Price: 9000,
Name: 'yasuo',
Age:18
}
];


var totalPrice = userBuy.find(function(Price) {
i++;

return Price + userBuy.Price;
});

console.log(totalPrice);


var title = 'reponsive web design';

console.log(title.includes('ii',0));


var salary = "1000$";

(function () {
  console.log("Original salary was " + salary);

  var salary = "5000$";

  console.log("My New Salary " + salary);
})();

var a ='hasaghi'


console.log(typeof a);


var array = [1,2,3,4,5,6,7,8,9,10];

for ( var i = 0; i > array.length; i++);{

console.log(array[i]);

}

function abc2 (a,b,c){

    let abc =0; //duoc su dung trong pham vi nay
        return a +b +c;
    }
    
     consolog.log(abc);

localStorage.setItem('key', 'value');

var data = localStorage.getItem('key');

localStorage.removeItem('key');

