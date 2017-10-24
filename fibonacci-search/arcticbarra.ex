defmodule Fibonacci do
  def fibonacci(n) do
    if (n == 0 || n == 1) do
      n
    else
      fibonacci(n-1) + fibonacci(n-2)
  end
end
