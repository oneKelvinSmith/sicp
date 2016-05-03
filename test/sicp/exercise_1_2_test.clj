(ns sicp.exercise-1-2-test
  (:require  [clojure.test :refer :all]
             [sicp.exercise-1-2 :refer :all]))

(deftest exercise-1-2-test
  (testing "translationg of formula"
    (is (= formula (- 37/150)))))
