(ns sandbox.core
  (:gen-class))

(defn factorial_comp
	[n]
	(reduce * (range 1 (+ n 1)))

	)

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (factorial_comp 5)))
