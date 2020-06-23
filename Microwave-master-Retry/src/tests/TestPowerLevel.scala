package tests

import microwave.model.Microwave
import org.scalatest.FunSuite

class TestPowerLevel extends FunSuite{

  test("PowerLevel"){
    val microwave:Microwave=new Microwave()
    microwave.numberPressed(5)
    microwave.numberPressed(5)
    microwave.powerLevelPressed()
    microwave.numberPressed(2)
    microwave.cookTimePressed()
    microwave.numberPressed(2)
    microwave.numberPressed(5)
    microwave.startPressed()
    assert(microwave.currentInstructions().cookTime==25)
//    assert(microwave.currentInstructions().powerLevel==20)
    microwave.startPressed()
 //   assert(microwave.currentInstructions().powerLevel==20)
    microwave.clearPressed()
    microwave.powerLevelPressed()
    microwave.numberPressed(1)
    microwave.numberPressed(2)
    microwave.numberPressed(3)
    microwave.numberPressed(4)
    microwave.startPressed()
    assert(microwave.currentInstructions().powerLevel==40)
  }



  //  val microwave: Microwave = new Microwave()
//
//
//  test("nomore"){
//
//    //example power Level 1
////    assert(microwave.currentInstructions().cookTime == 0)
////    assert(microwave.currentInstructions().powerLevel == 100)
//    microwave.numberPressed(5)
//    microwave.numberPressed(5)
//    microwave.powerLevelPressed()
//    microwave.numberPressed(5)
//    microwave.startPressed()
//    assert(microwave.currentInstructions().cookTime == 55)
//    assert(microwave.currentInstructions().powerLevel == 50)
//    //example power Level 2
//
//  }
//  test("nomoresdglkjdsklgjdsklg "){
//    val microwave123: Microwave = new Microwave()
//    //example power Level 1
//    //    assert(microwave.currentInstructions().cookTime == 0)
//    //    assert(microwave.currentInstructions().powerLevel == 100)
//
//
//    microwave123.numberPressed(7)
//    microwave123.powerLevelPressed()
//    microwave123.numberPressed(8)
//    microwave123.cookTimePressed()
//    microwave123.numberPressed(9)
//    microwave123.startPressed()
//    assert(microwave123.currentInstructions().cookTime == 9)
//    assert(microwave123.currentInstructions().powerLevel == 80)
//    //example power Level 2
//
//  }
//  test("kill me selgf  "){
//    val microwave1123: Microwave = new Microwave()
//    //example power Level 1
//    //    assert(microwave.currentInstructions().cookTime == 0)
//
//
//    microwave1123.powerLevelPressed()
//    microwave1123.numberPressed(0)
//    microwave1123.numberPressed(5)
//    microwave1123.numberPressed(7)
//    microwave1123.startPressed()
//        assert(microwave1123.currentInstructions().powerLevel == 70)
//
////
////    microwave123.numberPressed(7)
////    microwave123.powerLevelPressed()
////    microwave123.numberPressed(8)
////    microwave123.cookTimePressed()
////    microwave123.numberPressed(9)
////    microwave123.startPressed()
////    assert(microwave123.currentInstructions().cookTime == 9)
////    assert(microwave123.currentInstructions().powerLevel == 80)
//    //example power Level 2
//
//  }










//  test("nomore of this "){
//    val microwave2: Microwave = new Microwave()
//    assert(microwave2.currentInstructions().cookTime == 0)
//    assert(microwave2.currentInstructions().powerLevel == 100)
//    microwave2.numberPressed(5)
//    microwave2.numberPressed(5)
//    microwave2.powerLevelPressed()
//    microwave2.numberPressed(2)
//    microwave2.cookTimePressed()
//    microwave2.numberPressed(2)
//    microwave2.numberPressed(5)
//    microwave2.startPressed()
//    assert(microwave2.currentInstructions().cookTime == 25)
//    assert(microwave2.currentInstructions().powerLevel == 20)
//  }
//
//  test("nomore of this 11 "){
//    val microwave3: Microwave = new Microwave()
//    assert(microwave3.currentInstructions().cookTime == 0)
//    assert(microwave3.currentInstructions().powerLevel == 100)
//
//    microwave3.powerLevelPressed()
//    microwave3.numberPressed(8)
//    microwave3.numberPressed(6)
//    microwave3.numberPressed(4)
//    microwave3.startPressed()
//    assert(microwave3.currentInstructions().cookTime == 0)
//    assert(microwave3.currentInstructions().powerLevel == 40)
//  }
//
//  test("nomore 30 "){
//    val microwave4: Microwave = new Microwave()
//    //example power Level 1
//    assert(microwave4.currentInstructions().cookTime == 0)
//    assert(microwave4.currentInstructions().powerLevel == 100)
//    microwave4.numberPressed(5)
//    microwave4.numberPressed(5)
//    microwave4.powerLevelPressed()
//    microwave4.numberPressed(5)
//    microwave4.startPressed()
//    assert(microwave4.currentInstructions().cookTime == 55)
//    assert(microwave4.currentInstructions().powerLevel == 50)
//    microwave4.thirtySecondsPressed()
//    assert(microwave4.currentInstructions().cookTime == 85)
//    assert(microwave4.currentInstructions().powerLevel == 50)
//
//
//    //example power Level 2
//
//  }
//  test("PowerLevel"){
//    val microwave:Microwave=new Microwave()
//    microwave.numberPressed(5)
//    microwave.numberPressed(5)
//    microwave.powerLevelPressed()
//    microwave.numberPressed(2)
//    microwave.cookTimePressed()
//    microwave.numberPressed(2)
//    microwave.numberPressed(5)
//    microwave.startPressed()
//    assert(microwave.currentInstructions().cookTime==25)
//    assert(microwave.currentInstructions().powerLevel==20)
//    microwave.startPressed()
//    assert(microwave.currentInstructions().powerLevel==20)
//    microwave.clearPressed()
//    microwave.powerLevelPressed()
//    microwave.numberPressed(1)
//    microwave.numberPressed(2)
//    microwave.numberPressed(3)
//    microwave.numberPressed(4)
//    microwave.startPressed()
//    assert(microwave.currentInstructions().powerLevel==40)
//  }

}
