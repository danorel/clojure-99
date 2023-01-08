(ns clojure_99.core)

; Functions

;; 1. Define a function greet that takes no arguments and prints "Hello". Replace the ___ with the implementation: (defn greet [] _)

(defn greet [] (println "Hello"))
(greet)

;; 2. Redefine greet using def, first with the fn special form and then with the #() reader macro.

(def greet-fn (fn [name] (println "Hello" name)))

(#(println "Hello" %) "Dan")
(greet-fn "Dan")

;; 3. Define a function greeting which:
  ;Given no arguments, returns "Hello, World!"
  ;Given one argument x, returns "Hello, x!"
  ;Given two arguments x and y, returns "x, y!"

(defn greet-multi-arity
  ([] (println "Hello, World!"))
  ([x] (println "Hello," x))
  ([x y] (println x "," y)))

(greet-multi-arity)
(greet-multi-arity "You")
(greet-multi-arity "Hello" "You")

;; 4. Define a function do-nothing which takes a single argument x and returns it, unchanged.

(defn do-nothing [x] x)

(do-nothing 5)                                              ;;; Same function as identity function below
(identity 5)

;; 5. Define a function triplicate which takes another function and calls it three times, without any arguments.

(defn triplicate
  ([f args] (triplicate f 3 args))
  ([f i args]
   (println (apply f args))
   (if (> i 1)
     (recur f (dec i) args)
     nil)))

(triplicate print '("Hello" "World" "How" "Are" "You" "?"))
(triplicate + '(1 2 3 4 5))

;; 6. Define a function opposite which takes a single argument f. It should return another function which takes any number of arguments, applies f on them, and then calls not on the result. The not function in Clojure does logical negation.

(defn opposite [f]
  (fn [& args]
    (not (apply f args))))

((opposite +) -1 0 1)