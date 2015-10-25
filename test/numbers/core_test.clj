(ns numbers.core-test
  (:require [clojure.test :refer :all]
            [numbers.core :refer :all]))

(deftest minimum-divisor-test
  (testing "Prime number 2"
    (is (= 2 (min-divisor 2))))

  (testing "Prime number 3"
    (is (= 3 (min-divisor 3))))

  (testing "Prime number 17"
    (is (= 17 (min-divisor 17))))

  (testing "Non-Prime number 6"
    (is (= 2 (min-divisor 6))))

  (testing "Prime number 35"
    (is (= 5 (min-divisor 35))))

  (testing "Edge case: number 1"
    (is (= 1 (min-divisor 1))))

  (testing "Edge case: number 0"
    (is (= 0 (min-divisor 0))))

  (testing "Edge case: negative integer: -11"
    (is (= -1 (min-divisor -11))))
)


(deftest is-prime-test
  (testing "Prime number 2"
    (is (is-prime 2)))

  (testing "Prime number 7"
    (is (is-prime 7)))

  (testing "Non-Prime number 6"
    (is (not (is-prime 6))))

  (testing "Non-Prime number 15"
    (is (not (is-prime 15))))

  (testing "Edge-case: number 1"
    (is (not (is-prime 1))))

  (testing "Edge-case: number 0"
    (is (not (is-prime 0))))

  (testing "Edge-case: negative integer: -11"
    (is (not (is-prime -11))))
)


(deftest a-test
  (testing "FIXME, I fail."
    (is (= 0 0)))

  (testing "FIXME, I fail. No.2"
    (is (= 1 1)))
)
