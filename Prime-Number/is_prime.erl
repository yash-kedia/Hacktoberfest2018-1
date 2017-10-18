-module(isPrime).
-export([isPrime/1]).

isPrime(0)-> false;
isPrime(1)-> false;
isPrime(2)-> true;

isPrime(N) ->
    case (N rem 2) =:= 0 of
        true -> true;
        _ -> false
    end.
