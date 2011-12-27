/**
 * Copyright 2011 Matt Weagle
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.custom.scalabundle

import java.lang.System
import org.osgi.framework.BundleActivator
import org.osgi.framework.BundleContext

class Activator extends BundleActivator {
  def start(context: BundleContext) = {
    System.out.println("Hello World from Scala BundleActivator");
  }
  def stop(context: BundleContext) = {
    System.out.println("Goodbye, cruel world from Scala BundleActivator");
  }
}
