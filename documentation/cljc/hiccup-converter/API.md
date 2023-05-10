
# hiccup-converter.api isomorphic namespace

##### [README](../../../README.md) > [DOCUMENTATION](../../COVER.md) > hiccup-converter.api

### Index

- [to-html](#to-html)

### to-html

```
@param (hiccup) n
```

```
@usage
(to-html [:html [:body [:div {:style {:background :red}} "My text"]]])
```

```
@example
(to-html [:html [:body [:div {:style {:background :red}} "My text"]]])
=>
"<html><body><div style=\"background: red;\">My text</div></body></html>"
```

```
@return (html)
```

<details>
<summary>Source code</summary>

```
(defn to-html
  [n]
  #?(:clj  (-> n hiccup.api/unparse-css hiccup.core/html)
     :cljs (-> n reagent.api/render-to-html)))
```

</details>

<details>
<summary>Require</summary>

```
(ns my-namespace (:require [hiccup-converter.api :refer [to-html]]))

(hiccup-converter.api/to-html ...)
(to-html                      ...)
```

</details>

---

This documentation is generated with the [clj-docs-generator](https://github.com/bithandshake/clj-docs-generator) engine.

