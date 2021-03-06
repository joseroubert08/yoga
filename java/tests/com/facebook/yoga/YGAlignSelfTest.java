/**
 * Copyright (c) 2014-present, Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 */

 // @Generated by gentest/gentest.rb from gentest/fixtures/YGAlignSelfTest.html

package com.facebook.yoga;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class YGAlignSelfTest {
  @Test
  public void test_align_self_center() {
    final YogaNode root = new YogaNode();
    root.setWidth(100f);
    root.setHeight(100f);

    final YogaNode root_child0 = new YogaNode();
    root_child0.setAlignSelf(YogaAlign.CENTER);
    root_child0.setWidth(10f);
    root_child0.setHeight(10f);
    root.addChildAt(root_child0, 0);
    root.setDirection(YogaDirection.LTR);
    root.calculateLayout();

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(100f, root.getLayoutWidth(), 0.0f);
    assertEquals(100f, root.getLayoutHeight(), 0.0f);

    assertEquals(45f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(10f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(10f, root_child0.getLayoutHeight(), 0.0f);

    root.setDirection(YogaDirection.RTL);
    root.calculateLayout();

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(100f, root.getLayoutWidth(), 0.0f);
    assertEquals(100f, root.getLayoutHeight(), 0.0f);

    assertEquals(45f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(10f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(10f, root_child0.getLayoutHeight(), 0.0f);
  }

  @Test
  public void test_align_self_flex_end() {
    final YogaNode root = new YogaNode();
    root.setWidth(100f);
    root.setHeight(100f);

    final YogaNode root_child0 = new YogaNode();
    root_child0.setAlignSelf(YogaAlign.FLEX_END);
    root_child0.setWidth(10f);
    root_child0.setHeight(10f);
    root.addChildAt(root_child0, 0);
    root.setDirection(YogaDirection.LTR);
    root.calculateLayout();

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(100f, root.getLayoutWidth(), 0.0f);
    assertEquals(100f, root.getLayoutHeight(), 0.0f);

    assertEquals(90f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(10f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(10f, root_child0.getLayoutHeight(), 0.0f);

    root.setDirection(YogaDirection.RTL);
    root.calculateLayout();

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(100f, root.getLayoutWidth(), 0.0f);
    assertEquals(100f, root.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(10f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(10f, root_child0.getLayoutHeight(), 0.0f);
  }

  @Test
  public void test_align_self_flex_start() {
    final YogaNode root = new YogaNode();
    root.setWidth(100f);
    root.setHeight(100f);

    final YogaNode root_child0 = new YogaNode();
    root_child0.setAlignSelf(YogaAlign.FLEX_START);
    root_child0.setWidth(10f);
    root_child0.setHeight(10f);
    root.addChildAt(root_child0, 0);
    root.setDirection(YogaDirection.LTR);
    root.calculateLayout();

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(100f, root.getLayoutWidth(), 0.0f);
    assertEquals(100f, root.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(10f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(10f, root_child0.getLayoutHeight(), 0.0f);

    root.setDirection(YogaDirection.RTL);
    root.calculateLayout();

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(100f, root.getLayoutWidth(), 0.0f);
    assertEquals(100f, root.getLayoutHeight(), 0.0f);

    assertEquals(90f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(10f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(10f, root_child0.getLayoutHeight(), 0.0f);
  }

  @Test
  public void test_align_self_flex_end_override_flex_start() {
    final YogaNode root = new YogaNode();
    root.setAlignItems(YogaAlign.FLEX_START);
    root.setWidth(100f);
    root.setHeight(100f);

    final YogaNode root_child0 = new YogaNode();
    root_child0.setAlignSelf(YogaAlign.FLEX_END);
    root_child0.setWidth(10f);
    root_child0.setHeight(10f);
    root.addChildAt(root_child0, 0);
    root.setDirection(YogaDirection.LTR);
    root.calculateLayout();

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(100f, root.getLayoutWidth(), 0.0f);
    assertEquals(100f, root.getLayoutHeight(), 0.0f);

    assertEquals(90f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(10f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(10f, root_child0.getLayoutHeight(), 0.0f);

    root.setDirection(YogaDirection.RTL);
    root.calculateLayout();

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(100f, root.getLayoutWidth(), 0.0f);
    assertEquals(100f, root.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(10f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(10f, root_child0.getLayoutHeight(), 0.0f);
  }

  @Test
  public void test_align_self_baseline() {
    final YogaNode root = new YogaNode();
    root.setFlexDirection(YogaFlexDirection.ROW);
    root.setWidth(100f);
    root.setHeight(100f);

    final YogaNode root_child0 = new YogaNode();
    root_child0.setAlignSelf(YogaAlign.BASELINE);
    root_child0.setWidth(50f);
    root_child0.setHeight(50f);
    root.addChildAt(root_child0, 0);

    final YogaNode root_child1 = new YogaNode();
    root_child1.setAlignSelf(YogaAlign.BASELINE);
    root_child1.setWidth(50f);
    root_child1.setHeight(20f);
    root.addChildAt(root_child1, 1);

    final YogaNode root_child1_child0 = new YogaNode();
    root_child1_child0.setWidth(50f);
    root_child1_child0.setHeight(10f);
    root_child1.addChildAt(root_child1_child0, 0);
    root.setDirection(YogaDirection.LTR);
    root.calculateLayout();

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(100f, root.getLayoutWidth(), 0.0f);
    assertEquals(100f, root.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(50f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(50f, root_child0.getLayoutHeight(), 0.0f);

    assertEquals(50f, root_child1.getLayoutX(), 0.0f);
    assertEquals(40f, root_child1.getLayoutY(), 0.0f);
    assertEquals(50f, root_child1.getLayoutWidth(), 0.0f);
    assertEquals(20f, root_child1.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child1_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child1_child0.getLayoutY(), 0.0f);
    assertEquals(50f, root_child1_child0.getLayoutWidth(), 0.0f);
    assertEquals(10f, root_child1_child0.getLayoutHeight(), 0.0f);

    root.setDirection(YogaDirection.RTL);
    root.calculateLayout();

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(100f, root.getLayoutWidth(), 0.0f);
    assertEquals(100f, root.getLayoutHeight(), 0.0f);

    assertEquals(50f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(50f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(50f, root_child0.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child1.getLayoutX(), 0.0f);
    assertEquals(40f, root_child1.getLayoutY(), 0.0f);
    assertEquals(50f, root_child1.getLayoutWidth(), 0.0f);
    assertEquals(20f, root_child1.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child1_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child1_child0.getLayoutY(), 0.0f);
    assertEquals(50f, root_child1_child0.getLayoutWidth(), 0.0f);
    assertEquals(10f, root_child1_child0.getLayoutHeight(), 0.0f);
  }

}
