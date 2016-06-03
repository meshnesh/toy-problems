var result = 1,
    term1 = 0,
    term2 = 1,
    i = 1;
while(i < 10)
{
    result = term1 + term2;
    console.log(result);
    term1 = term2;
    term2 = result;
    i++;
}




// RECURSIVE METHOD

// function mellow(x) {
//     if (x === 0) {
//         return 0;
//     } else if (x === 1) {
//         return 1;
//     } else {
//         return fib(x-1)+fib(x-2);
//     }
// }