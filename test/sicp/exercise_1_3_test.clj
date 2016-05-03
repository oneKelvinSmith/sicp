(ns sicp.exercise-1-3-test
  (:require  [clojure.test :refer :all]
             [sicp.exercise-1-3 :refer :all]))

(deftest exercise-1-3-test
  (testing "sum of squares of largest two out of three numbers"
    (is (= (sum-of-squares-of-largest-two-of-three 1 2 3) 13))
    (is (= (sum-of-squares-of-largest-two-of-three 4 2 5) 41))))
