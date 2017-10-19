<?php

// LANGUAGE: php
// VERSIONS: php4, php5, php7
// GITHUB: https://github.com/GitHugop
// Source: http://php.net/manual/en/function.gmp-prob-prime.php

// definitely not a prime
echo gmp_prob_prime("6") . "\n";
// Output: 0

// probably a prime
echo gmp_prob_prime("1111111111111111111") . "\n";
// Output: 1

// definitely a prime
echo gmp_prob_prime("11") . "\n";
// Output: 2

?>
