(ns clojure_99.p01)

(defn my-last [vec]
  (get vec (- (count vec) 1)))