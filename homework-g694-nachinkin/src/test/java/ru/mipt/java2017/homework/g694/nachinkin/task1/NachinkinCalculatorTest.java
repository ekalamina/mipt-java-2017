package ru.mipt.java2017.homework.g694.nachinkin.task1;

import ru.mipt.java2017.homework.base.task1.Calculator;
import ru.mipt.java2017.homework.tests.task1.AbstractCalculatorTest;

public class NachinkinCalculatorTest extends AbstractCalculatorTest {
  @Override
  protected Calculator calc() { return new NachinkinCalculator(); }
}
