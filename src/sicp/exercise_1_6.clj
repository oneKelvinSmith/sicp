(ns sicp.exercise-1-6
  (:require  [sicp.chapter-1 :refer [good-enough? improve]]))

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
