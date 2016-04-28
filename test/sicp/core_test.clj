(ns sicp.core-test
  (:require [clojure.test :refer :all]
            [sicp.core :refer :all]))

(deftest main-test
  (testing "main prints out Hello, World!"
    (is (= (-main) (println "Hello, World!")))))
