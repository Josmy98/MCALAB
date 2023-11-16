def generate_fibonacci(n):
	fibonacci_series = []
	a, b = 0, 1
	for _ in range(n):
		fibonacci_series.append(a)
		a, b = b, a + b
	return fibonacci_series
n = int(input("Enter the number in terms for fibonacci series:"))
fibonacci_series = generate_fibonacci(n)
print("fibonacci series of",n,"terms:",fibonacci_series)
