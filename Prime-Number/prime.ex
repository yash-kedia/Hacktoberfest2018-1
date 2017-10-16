defmodule Prime do
  def is_prime?(number) do
    cond do
      number == 1 -> false
      number == 2 -> true
      number == 3 -> true
      rem(number, 2) == 0 -> false
      rem(number, 3) == 0 -> false

      true ->
        upto = 5..div(number, 2)
        prime_checker(number, Enum.to_list(upto))
    end
  end

  def prime_checker(_, []), do: true
  def prime_checker(n, [head|tail]) do
    if rem(n, head) == 0 do
      false
    else
      prime_checker(n, tail)
    end
  end
end

is_prime =
  ""
  |> IO.gets
  |> String.trim
  |> String.to_integer
  |> Prime.is_prime?

if is_prime do
  IO.puts "This number is a prime number"
else
  IO.puts "This number is not a prime number"
end
