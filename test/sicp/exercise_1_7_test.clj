(ns sicp.exercise-1-7-test
  (:require  [clojure.test :refer :all]
             [sicp.exercise-1-7 :refer :all]
             [sicp.chapter-1-1 :refer [square sqrt]]))

(deftest exercise-1-7-test
  (testing "sqrt of small number (0.00042) is out of tolerance (0.001)"
    (is (not (< (- (sqrt (square 0.00042))
                   0.00042)
                0.001))))
  (testing "alternative good enough function"
    (is (< (- (sqrt-improved (square 0.00042))
              0.00042)
           0.001))))
