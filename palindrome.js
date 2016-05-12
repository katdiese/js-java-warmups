function palindrome(string) {
  var arr = string.split('');
  if(string === arr.reverse().join('')) {
    return true;
  } else {
    return false;
  }
}

console.log(palindrome('ama'));