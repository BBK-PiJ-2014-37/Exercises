boolean isPalindrome(String s) {
  int j = 0
  int l = s.size()
  if (l == 0) {
    return true;
  }
  if ((l == 1 || l == 2) && s[0] == s[l-1]) {
      return true;
  } else if (isPalindrome(s.substring(1, l-2))) {    
    return true
  } else {
    return false
  }
}
println isPalindrome("anana")