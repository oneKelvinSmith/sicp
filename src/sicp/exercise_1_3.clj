(ns sicp.exercise-1-3
  (:require  [sicp.chapter-1 :refer [sum-of-squares]]))


(defn sum-of-squares-of-largest-two-of-three [a b c]
  (cond
    (or
     (and (> a b) (> b c))
     (and (> b a) (> a c))) (sum-of-squares a b)
    (or
     (and (> a c) (> c b))
     (and (> c a) (> a b))) (sum-of-squares a c)
    :else (sum-of-squares b c)))
