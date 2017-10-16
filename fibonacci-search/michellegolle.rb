def fibonacci(n)
   (0..1).include?(n) ? n :  (fibonacci( n - 1 ) + fibonacci( n - 2 ))
end
