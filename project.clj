(defproject fourier-daydreams "0.1.0-SNAPSHOT"
   :license
   {  :name "Eclipse Public License"
      :url "http://www.eclipse.org/legal/epl-v10.html"  }
   :dependencies
   [  [org.clojure/clojure "1.5.1"]
      [overtone            "0.9.1"]  ]
   :main ^:skip-aot fourier-daydreams.core
   :target-path "target/%s"
   :profiles {:uberjar {:aot :all}}  )
