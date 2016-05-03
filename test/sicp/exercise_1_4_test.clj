(ns sicp.exercise-1-4-test
  (:require  [clojure.test :refer :all]
             [sicp.exercise-1-4 :refer :all]))

(deftest exercise-1-4-test
  (testing "a plus abs b behavior"
    (is (= (a-plus-abs-b 2 2) 4))
    (is (= (a-plus-abs-b (- 12) 0) (- 12)))
    (is (= (a-plus-abs-b 0 (- 42)) 42))))
