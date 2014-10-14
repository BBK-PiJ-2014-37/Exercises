int fact(int n) {
	int result = 0;
	if (n == 0) {
		result = 1;
	} else {
  		result = n * fact(n-1);
	}
	return result;
}



println fact(5);
