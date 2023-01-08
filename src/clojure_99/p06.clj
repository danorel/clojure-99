(ns clojure_99.p06)

(defn palindrome
  "Checks if palindrome"
  ([coll] (= (seq coll) (reverse coll))))

(defn longest-palindrome
  "Calculates longest palindrome in collection"
  ([words] (->> words
                (distinct)
                (filter palindrome)
                (sort-by count)
                (last))))
