/*
Copyright 1999 CERN - European Organization for Nuclear Research.
Permission to use, copy, modify, distribute and sell this software and its documentation for any purpose 
is hereby granted without fee, provided that the above copyright notice appear in all copies and 
that both that copyright notice and this permission notice appear in supporting documentation. 
CERN makes no representations about the suitability of this software for any purpose. 
It is provided "as is" without expressed or implied warranty.
*/
package org.apache.mahout.matrix.buffer;

import org.apache.mahout.matrix.list.DoubleArrayList;
/**
 * Target of a streaming <tt>DoubleBuffer</tt> into which data is flushed upon buffer overflow.
 *
 */
/** 
 * @deprecated until unit tests are in place.  Until this time, this class/interface is unsupported.
 */
@Deprecated
public interface DoubleBufferConsumer {
/**
 * Adds all elements of the specified list to the receiver.
 * @param list the list of which all elements shall be added.
 */
public void addAllOf(DoubleArrayList list);
}