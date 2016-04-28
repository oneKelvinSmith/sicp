(ns sicp.core-test
  (:require [clojure.test :refer :all]
            [sicp.core :refer :all]))

(deftest main-prints-to-stdout
  (testing "main prints out"
    (is (= (-main) (println "Hello, World!")))))
