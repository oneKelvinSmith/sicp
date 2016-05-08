(ns sicp.exercise-1-9)

(defn +-inc [a b]
  (if (= a 0)
    b
    (inc (+-inc (dec a) b))))
;; (+-inc 4 5)
;; (inc (+-inc 3 5))
;; (inc (+-inc 2 5))
;; (inc (+-inc 1 5))
;; (inc (+-inc 0 5))
;; (inc 5)
;; (inc 6)
;; (inc 7)
;; (inc 8)
;; 9

(defn +-dec [a b]
  (if (= a 0)
    b
    (+-dec (dec a) (inc b))))
;; (+-dec 4 5)
;; (+-dec 3 6)
;; (+-dec 2 7)
;; (+-dec 1 8)
;; (+-dec 0 9)
;; 9
