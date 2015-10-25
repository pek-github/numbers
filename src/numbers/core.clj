(ns numbers.core)

(defn min-divisor 
  "find the minimum divisor of a given number" 
  [num]

  (cond
    (= num 0) 0  ; TODO: throw Exception
    (< num 0) -1 ; TODO: throw Exception
    (= num 1) 1
    (even? num) 2
    :else
      (loop [k 3]
        (if (> (* k k) num)
          num
          (if (= 0 (mod num k)) 
            k 
            (recur (+ k 2))
          )
        )
      )
  )
)


(defn is-prime 
  "check if a given number is prime"
  [num]

  (let [m (min-divisor num)]
    (and (> m 1) (= m num))
  )
)


(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))
