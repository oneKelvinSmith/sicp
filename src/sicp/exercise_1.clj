(ns sicp.exercise-1
  (:require  [sicp.chapter-1 :refer :all]))

(def a 3)
(def b (+ a 1))

(def formula
  (/
   (+ 5 4 (- 2
             (- 3
                (+ 6
                   (/ 4 5)))))
   (* 3
      (- 6 2)
      (- 2 7))))

(defn sum-of-squares-of-largest-two-of-three [a b c]
  (cond
    (or
     (and (> a b) (> b c))
     (and (> b a) (> a c))) (sum-of-squares a b)
    (or
     (and (> a c) (> c b))
     (and (> c a) (> a b))) (sum-of-squares a c)
    :else (sum-of-squares b c)))
