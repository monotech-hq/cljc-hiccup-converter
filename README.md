
# cljc-hiccup-converter

### Overview

The <strong>cljc-hiccup-converter</strong> is a simple Hiccup to HTML converter.

### deps.edn

```
{:deps {bithandshake/cljc-hiccup-converter {:git/url "https://github.com/bithandshake/cljc-hiccup-converter"
                                            :sha     "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"}}
```

### Current version

Check out the latest commit on the [release branch](https://github.com/bithandshake/cljc-hiccup-converter/tree/release).

### Documentation

The <strong>cljc-hiccup-converter</strong> functional documentation is [available here](documentation/COVER.md).

### Changelog

You can track the changes of the <strong>cljc-hiccup-converter</strong> library [here](CHANGES.md).

# Usage

### Index

- [How to convert Hiccup to HTML?](#how-to-convert-hiccup-to-html)

### How to convert Hiccup to HTML?

The [`hiccup-converter.api/to-html`](documentation/cljc/hiccup-converter/API.md/#to-html)
function converts the given Hiccup structure to HTML string.

```
(to-html [:html [:body [:div {:style {:background "red"}} "My text"]]])
; =>
; "<html><body><div style=\"background: red;\">My text</div></body></html>"
```
