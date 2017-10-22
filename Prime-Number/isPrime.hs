isPrime :: Int -> Bool
isPrime n = isDividable n (n-1)
    where isDividable 1 _ = False
          isDividable 2 _ = True
          isDividable x 2 = (x `mod` 2) > 0
          isDividable x y = (x `mod` y) > 0 && isDividable x (y - 1)

