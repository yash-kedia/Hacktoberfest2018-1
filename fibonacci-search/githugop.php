<?php

// LANGUAGE: php
// VERSIONS: php4, php5, php7
// AUTHOR: Hugo Nunes
// GITHUB: https://github.com/GitHugop

function fibonacci($num){
  $fibonacci = array(0, 1);
  for ( $i=2; $i<=$num; $i++ ) {
    $fibonacci[$i] = $fibonacci[$i-1] + $fibonacci[$i-2];
  }
  return $fibonacci[$num];
}

echo fibonacci(12);  // 144

?>
