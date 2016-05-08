(ns sicp.exercise-1-9-test
  (:require  [clojure.test :refer :all])
  (:require  [sicp.exercise-1-9 :refer :all]))

(deftest +-inc-test
  (testing "inc version is linear recursive"
    (is (= (+-inc 4 5) 9))))

(deftest +-dec-test
  (testing "dec version is iterative"
    (is (= (+-dec 4 5) 9))))
