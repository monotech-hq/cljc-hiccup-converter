
(ns hiccup-converter.convert
    #?(:clj  (:require [hiccup.core]
                       [hiccup.api])
       :cljs (:require [reagent.api]
                       [hiccup.api])))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn to-html
  ; @param (hiccup) n
  ;
  ; @usage
  ; (to-html [:html [:body [:div {:style {:background :red}} "My text"]]])
  ;
  ; @example
  ; (to-html [:html [:body [:div {:style {:background :red}} "My text"]]])
  ; =>
  ; "<html><body><div style=\"background: red;\">My text</div></body></html>"
  ;
  ; @return (html)
  [n]
  #?(:clj  (-> n hiccup.api/unparse-css hiccup.core/html)
     :cljs (-> n reagent.api/render-to-html)))
