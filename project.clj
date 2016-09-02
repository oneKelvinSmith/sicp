(defproject sicp "0.1.0-SNAPSHOT"
  :description "A place to work through the examples in SICP with Clojure"
  :url "https://github.com/oneKelvinSmith/sicp_clojure/"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot sicp.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
