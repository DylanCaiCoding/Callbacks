@file:Suppress("unused")

package com.dylanc.callbacks

/**
 * @author Dylan Cai
 */

/** A callback that takes 0 arguments. */
fun interface Callback0 {
  /** Invokes the callback. */
  operator fun invoke()
}

/** A callback that takes 1 argument. */
fun interface Callback1<in P1> {
  /** Invokes the callback with the specified argument. */
  operator fun invoke(p1: P1)
}

/** A callback that takes 2 arguments. */
fun interface Callback2<in P1, in P2> {
  /** Invokes the callback with the specified arguments. */
  operator fun invoke(p1: P1, p2: P2)
}

/** A callback that takes 3 arguments. */
fun interface Callback3<in P1, in P2, in P3> {
  /** Invokes the callback with the specified arguments. */
  operator fun invoke(p1: P1, p2: P2, p3: P3)
}

/** A callback that takes 4 arguments. */
fun interface Callback4<in P1, in P2, in P3, in P4> {
  /** Invokes the callback with the specified arguments. */
  operator fun invoke(p1: P1, p2: P2, p3: P3, p4: P4)
}

/** A callback that takes 5 arguments. */
fun interface Callback5<in P1, in P2, in P3, in P4, in P5> {
  /** Invokes the callback with the specified arguments. */
  operator fun invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5)
}

/** A callback that takes 6 arguments. */
fun interface Callback6<in P1, in P2, in P3, in P4, in P5, in P6> {
  /** Invokes the callback with the specified arguments. */
  operator fun invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6)
}