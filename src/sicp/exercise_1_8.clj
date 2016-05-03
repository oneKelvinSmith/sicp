(ns sicp.exercise-1-8
  (:require  [sicp.chapter-1 :refer [square abs]]))

(defn improve [guess n]
  (/ (+ (/ n
           (square guess))
        (* 2 guess))
      3))

(defn good-enough? [last-guess guess]
  (< (abs (- last-guess guess))
     (* guess 0.0001)))

(defn cube-root-iter [last-guess guess n]
  (if (good-enough? last-guess guess)
    guess
    (cube-root-iter guess
                    (improve guess n)
                    n)))

(defn cube-root [n]
  (cube-root-iter 2.0 1.0 n))
