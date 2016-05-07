(ns sicp.exercise-1-6
  (:require  [sicp.chapter-1-1 :refer [average square abs]]))

(defn good-enough? [guess x]
  (< (abs (- (square guess) x)) 0.001))

(defn improve [guess x]
  (average guess (/ x guess)))

(defn new-if [predicate
              then-clause
              else-clause]
  (cond predicate then-clause
        :else else-clause))

(defn sqrt-iter [guess x]
  (new-if (good-enough? guess x)
          guess
          (sqrt-iter (improve guess x) x)))

(defn sqrt [x]
  (sqrt-iter 1.0 x))
