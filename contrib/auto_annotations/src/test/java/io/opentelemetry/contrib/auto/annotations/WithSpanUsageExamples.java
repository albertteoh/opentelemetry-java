/*
 * Copyright 2020, OpenTelemetry Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.opentelemetry.contrib.auto.annotations;

/**
 * This class is not a classical test. It's just a demonstration of possible usages of {@link
 * WithSpan} annotation together with some explanations. The goal of this class is to serve as an
 * early detection system for inconvenient API and unintended API breakage.
 */
@SuppressWarnings("unused")
public class WithSpanUsageExamples {

  /**
   * A new span will be created for this method's execution. Span's name will be automatically
   * generated by OpenTelemetry auto-instrumentation, probably as "WithSpanUsageExamples.method1".
   */
  @WithSpan
  public void method1() {}

  /** Name of the generated span will be "shinyName". */
  @WithSpan("shinyName")
  public void method2() {}
}