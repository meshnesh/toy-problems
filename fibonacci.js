
// looping code

// var looping = function(n) {
//     var a = 0, b = 1, f = 1;
//     for(var i = 2; i <= 10; i++) {
//         f = a + b;
//         a = b;
//         b = f;
//     }
//     return f;
// };




// recursive code

// var recursive = function(n) {
//     if(n <= 2) {
//         return 1;
//     } else {
//         return this.recursive(n - 1) + this.recursive(n - 2);
//     }
// };


// array method

// var i;
// var fib = []; // Initialize array!
//
// fib[0] = 0;
// fib[1] = 1;
// for(i=2; i<=10; i++)
// {
    // Next fibonacci number = previous + one before previous
    // Translated to JavaScript:
//     fib[i] = fib[i-2] + fib[i-1];
//     alert(fib[i]);
// }

var fib = [0, 1];
for(var i=fib.length; i<10; i++) {
    fib[i] = fib[i-2] + fib[i-1];
}
console.log(fib);