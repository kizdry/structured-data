(ns structured-data)

(defn do-a-thing [x]
  (let [x2 (+ x x)]
    (Math/pow x2 x2)))

(defn spiff [v]
  (let [v1 (get v 0)
        v3 (get v 2)]
    (+ v1 v3)))

(comment
 (defn spiff [v]
   (when (vector? v)
     (let [v1 (or (get v 0) 0)
           v3 (or (get v 2) 0)]
       (+ v1 v3)))))


(defn cutify [v]
  (conj v "<3"))

(defn spiff-destructuring [v]
    (let [[v1 _ v3] v]
      (+ v1 v3)))

(defn point [x y]
  [x y])

(defn rectangle [bottom-left top-right]
  [bottom-left top-right])

(defn height [ [[x1 y1] [x2 y2]] ]
  (Math/abs (- y1 y2)))


(defn width [ [[x1 y1] [x2 y2]] ]
  (Math/abs (- x1 x2)))


(defn square? [rectangle]
  (= (width rectangle) (height rectangle)))

(defn area [[[x1 y1] [x2 y2]]]
  (* (Math/abs (- x1 x2)) (Math/abs (- y1 y2))))

(defn contains-point? [[[x1 y1] [x2 y2]]
                       [xp yp]]
    (and
      (<= x1 xp x2)
      (<= y1 yp y2)))

(defn contains-rectangle? [outer [point1 point2]]
  (and
    (contains-point? outer point1)
    (contains-point? outer point2)))


(defn title-length [book]
  (count (get book :title)))

(defn author-count [book]
  (count (get book :authors)))

(defn multiple-authors? [book]
  (>= (author-count book) 2))

(defn add-author [book new-author]
  :-)

(defn alive? [author]
  :-)

(defn element-lengths [collection]
  :-)

(defn second-elements [collection]
  :-)

(defn titles [books]
  :-)

(defn monotonic? [a-seq]
  :-)

(defn stars [n]
  :-)

(defn toggle [a-set elem]
  :-)

(defn contains-duplicates? [a-seq]
  :-)

(defn old-book->new-book [book]
  :-)

(defn has-author? [book author]
  :-)

(defn authors [books]
  :-)

(defn all-author-names [books]
  :-)

(defn author->string [author]
  :-)

(defn authors->string [authors]
  :-)

(defn book->string [book]
  :-)

(defn books->string [books]
  :-)

(defn books-by-author [author books]
  :-)

(defn author-by-name [name authors]
  :-)

(defn living-authors [authors]
  :-)

(defn has-a-living-author? [book]
  :-)

(defn books-by-living-authors [books]
  :-)

; %________%
