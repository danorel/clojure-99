(ns clojure_99.p01_test
  (:require [clojure.test :refer :all]
            [clojure_99.p01 :refer :all]))

(deftest my-last-test
  (testing "My last test"
    (is (= (my-last [1 2 3 4 5])) 5)))