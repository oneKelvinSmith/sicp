(ns sicp.exercise-1-8-test
  (:require  [clojure.test :refer :all]
             [sicp.exercise-1-8 :refer :all]))

(deftest exercise-1-8-test
  (testing "cube root using newton's method"
    (is (= (cube-root 8) 2.000000000012062))
    (is (= (cube-root 27) 3.0000000000000977))
    (is (= (cube-root 64) 4.000000000076121))))
