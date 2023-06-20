
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




function buynow(){
 var a = document.getElementById("buy-now")
  a.innerHTML = alert (`added cart`);
}


function cart(){
  var shop = document.getElementById("cart-shop");

  
}


