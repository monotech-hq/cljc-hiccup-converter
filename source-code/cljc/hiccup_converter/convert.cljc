
(ns hiccup-converter.convert
    #?(:clj  (:require [hiccup.core]
                       [fruits.hiccup.api])
       :cljs (:require [reagent.dom.server]
                       [fruits.hiccup.api])))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn to-html
  ; @param (hiccup) n
  ;
  ; @usage
  ; (to-html [:html [:body [:div {:style {:background :red}} "My text"]]])
  ; =>
  ; "<html><body><div style=\"background: red;\">My text</div></body></html>"
  ;
  ; @return (html)
  [n]
  #?(:clj  (-> n fruits.hiccup.api/unparse-css hiccup.core/html)
     :cljs (-> n reagent.dom.server/render-to-string)))
