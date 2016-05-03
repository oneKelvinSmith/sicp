(ns sicp.exercise-1-5-test
  (:require  [clojure.test :refer :all]
             [sicp.exercise-1-5 :refer :all]))

(deftest exercise-1-5-test
  (testing "applicative order: infinite recursion, normal order: 0"
    (is (thrown? StackOverflowError (test 0 (p))))))
