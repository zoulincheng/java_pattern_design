/**
 * The MIT License
 * Copyright (c) 2014 Ilkka Seppälä
 * <p>
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * <p>
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * <p>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.zlkj.abstract_document;

import com.zlkj.abstract_document.domain.Car;
import com.zlkj.abstract_document.domain.HasModel;
import com.zlkj.abstract_document.domain.HasParts;
import com.zlkj.abstract_document.domain.HasPrice;
import com.zlkj.abstract_document.domain.HasType;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * The Abstract Document pattern enables handling additional, non-static
 * properties. This pattern uses concept of traits to enable type safety and
 * separate properties of different classes into set of interfaces.
 * <p>
 * <p>
 * In Abstract Document pattern,({@link AbstractDocument}) fully implements
 * {@link Document}) interface. Traits are then defined to enable access to
 * properties in usual, static way.
 */
public class App {

  /**
   * Executes the App
   */
  public App() {
    System.out.println("Constructing parts and car");

    Map<String, Object> carProperties = new HashMap<>();
    carProperties.put(HasModel.PROPERTY, "300SL");
    carProperties.put(HasPrice.PROPERTY, 10000L);

    Map<String, Object> wheelProperties = new HashMap<>();
    wheelProperties.put(HasType.PROPERTY, "wheel");
    wheelProperties.put(HasModel.PROPERTY, "15C");
    wheelProperties.put(HasPrice.PROPERTY, 100L);

    Map<String, Object> doorProperties = new HashMap<>();
    doorProperties.put(HasType.PROPERTY, "door");
    doorProperties.put(HasModel.PROPERTY, "Lambo");
    doorProperties.put(HasPrice.PROPERTY, 300L);

    carProperties.put(HasParts.PROPERTY, Arrays.asList(wheelProperties, doorProperties));

    Car car = new Car(carProperties);

    System.out.println("Here is our car:");
    System.out.println("-> model: " + car.getModel().get());
    System.out.println("-> price: " + car.getPrice().get());
    System.out.println("-> parts: ");
    car.getParts().forEach(p -> System.out
        .println("\t" + p.getType().get() + "/" + p.getModel().get() + "/" + p.getPrice().get()));
  }

  /**
   * Program entry point
   *
   * @param args command line args
   */
  public static void main(String[] args) {
    new App();
  }

}
