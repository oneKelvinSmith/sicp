(ns sicp.exercise-1-6-test
  (:require  [clojure.test :refer :all]
             [sicp.exercise-1-6 :refer :all]))

(deftest exercise-1-6-test
  (testing "a new if"
    (is (= (new-if (= 2 3) 0 5) 5))
    (is (= (new-if (= 1 1) 0 5) 0)))
  (testing "sqrt-with-new-if will recurse infinitely as cond uses applicative order"
    (is (thrown? StackOverflowError (sqrt 16)))))
