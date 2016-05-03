(ns sicp.exercise-1-7
  (:require  [sicp.chapter-1 :refer [improve abs]]))

(defn good-enough-improved? [previous-guess guess]
  (< (abs (- previous-guess guess))
     (* guess 0.0001)))

(defn sqrt-iter-improved [previous-guess guess x]
  (if (good-enough-improved? previous-guess guess)
    guess
    (sqrt-iter-improved guess (improve guess x) x)))

(defn sqrt-improved [x]
  (sqrt-iter-improved 2.0 1.0 x))
