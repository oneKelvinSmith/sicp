(ns sicp.chapter-1-2)

(defn factorial [n]
  (if (= n 1)
    1
    (* n (factorial (- n 1)))))
