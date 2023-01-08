(ns clojure_99.p06_test
  (:require [clojure.test :refer :all]
            [clojure_99.p06 :refer :all]))

(deftest longest-palindrome-test
  (testing "Longest palindrome"
    (is (= "abba" (longest-palindrome ["abba" "lol" "figaro"])))
    (is (= "lol" (longest-palindrome ["lol" "figaro"])))))

(deftest palindrome-test
  (testing "Check if palindrome"
    (is (= true (palindrome "abba")))
    (is (= false (palindrome "abb")))))