

window.addEventListener('load', function() {
  var loader = document.getElementById('loader');
  var text = document.getElementById('textloader');
  var whiteout = document.getElementById('whiteout');
  
  document.body.classList.add('done');
  text.innerHTML = 'Loading...';

  loader.style.display = 'block';
  text.style.display = 'block';
  whiteout.style.display = 'block';

  setTimeout(function() {
    loader.style.display = 'none';
    text.style.display = 'none';
    whiteout.style.display = 'none';
  }, 2000);
});

function showtime(){
var data = new Data();
  console.log(data);
}


// /cai tren la dung de loadding trang nha mn
// window.onload = function() {
//   var text = document.getElementById('textloader').innerHTML ='Loading...';
//   setTimeout(function() {
//     text.classList.add('paused');
//     text.style.display = 'none';
//   },2000);
// };






// var arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
// for (var element of arr) {
//  console.log(element);
// }



//   function bankAccount(owner ,blance,bankNumber) {
//     this.owner = owner;
//     this.blance = blance;
//     this.bankNumber = bankNumber;
    
//     this.getBlance = function() {
//         return `${this.blance}`;
//       };
//     }



// function withDraw(amount){
//   var afAmount;
//   if (amount < 50000){
//     console.log('khong duoc rut');
//   }else{
//     afAmount = bankAccount.blance - amount;
//     console.log("duoc rut" + afAmount);
//   }
//   return afAmount;
// }

// function deposit(amount){
//   var addDeposit;
//   if(amount >10000);
//    addDeposit = bankAccount.blance + amount;

//    return (addDeposit);
// }


// function total(a, b, callBack) {
//    var result =a + b;
//    callBack(result);
//   }
  
//   function displayResult(result) {
//    console.log("The result is: " + result);
//   }
  
//   total(5, 3, displayResult);














