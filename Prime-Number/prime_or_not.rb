def prime_or_not(number)
  return false if number <= 1
  return true if number <= 3
  return false if number%2 == 0 || number%3 == 0

  (5..number).step(6).each do |n|
	return true unless n*n <= number
	return false if number%n == 0 || number%(n+2) == 0
  end
  return true
end

number = gets.to_i
if prime_or_not(number)
  puts "Given number is prime"
else
  puts "Given number is not prime"
end
