% LANGUAGE: Erlang
% AUTHOR: Phaneendra Marisa
% GITHUB: https://github.com/spmarisa

-module(hello).
-export([hello_world/0]).

hello_world() -> io:fwrite("Hello World!\n").
