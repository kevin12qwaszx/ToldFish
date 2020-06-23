package tests
import microwave.model.Microwave
import org.scalatest._

class TestFullFunctionality extends FunSuite{
    test("findgdsal"){
        val microwave:Microwave=new Microwave()
        microwave.openDoor()
        microwave.numberPressed(9)
        assert(microwave.currentInstructions().cookTime==0)
        microwave.clearPressed()
        microwave.closeDoor()
        microwave.numberPressed(9)
        microwave.startPressed()
        assert(microwave.currentInstructions().cookTime==9)
        microwave.clearPressed()
        microwave.popcornPressed()
        assert(microwave.currentInstructions().cookTime==140)
        assert(microwave.currentInstructions().powerLevel==100)
        microwave.clearPressed()
        microwave.numberPressed(9)
        microwave.startPressed()
        assert(microwave.currentInstructions().cookTime==9)
        microwave.clearPressed()
        microwave.popcornPressed()
        microwave.openDoor()
        assert(microwave.currentInstructions().cookTime==0)
        assert(microwave.currentInstructions().powerLevel==0)
        microwave.closeDoor()
        microwave.clearPressed()
        microwave.openDoor()
        microwave.popcornPressed()
        assert(microwave.currentInstructions().cookTime==0)
        assert(microwave.currentInstructions().powerLevel==0)
        microwave.closeDoor()
        microwave.clearPressed()
        microwave.numberPressed(3)
        microwave.numberPressed(0)
        microwave.startPressed()
        assert(microwave.currentInstructions().cookTime==30)
        microwave.clearPressed()
        microwave.openDoor()
        microwave.numberPressed(1)
        microwave.numberPressed(2)
        microwave.startPressed()
        assert(microwave.currentInstructions().cookTime==0)
        microwave.powerLevelPressed()
        microwave.numberPressed(2)
        microwave.startPressed()
        assert(microwave.currentInstructions().powerLevel==0)
        microwave.closeDoor()
        microwave.startPressed()
        assert(microwave.currentInstructions().powerLevel==20)
        microwave.clearPressed()
        microwave.openDoor()
        microwave.popcornPressed()
        microwave.popcornPressed()
        assert(microwave.currentInstructions().cookTime==0)
        assert(microwave.currentInstructions().powerLevel==0)
        microwave.closeDoor()
        microwave.startPressed()
        assert(microwave.currentInstructions().cookTime==140)
        assert(microwave.currentInstructions().powerLevel==100)
        microwave.thirtySecondsPressed()
        assert(microwave.currentInstructions().cookTime==170)
        microwave.openDoor()
        microwave.thirtySecondsPressed()
        microwave.thirtySecondsPressed()
        assert(microwave.currentInstructions().cookTime==0)


    }
//    test("ahh2.0"){
//        val microwave123:Microwave=new Microwave()
//        microwave123.numberPressed(5)
//        microwave123.cookTimePressed()
//        microwave123.numberPressed(5)
//        microwave123.doorOpen()
//        microwave123.numberPressed(5)
//        microwave123.closeDoor()
//        microwave123.startPressed()
//        assert(microwave123.currentInstructions().cookTime==55)
//
//        microwave123.clearPressed()
//        microwave123.numberPressed(5)
//        microwave123.doorOpen()
//        microwave123.cookTimePressed()
//        microwave123.numberPressed(5)
//        microwave123.closeDoor()
//        microwave123.numberPressed(5)
//        microwave123.startPressed()
//        assert(microwave123.currentInstructions().cookTime==55)
//
//        microwave123.closeDoor()
//        microwave123.clearPressed()
//        microwave123.doorOpen()
//        microwave123.powerLevelPressed()
//        microwave123.startPressed()
//        microwave123.closeDoor()
//        microwave123.numberPressed(6)
//        microwave123.startPressed()
//        assert(microwave123.currentInstructions().powerLevel==100)
//        microwave123.startPressed()
//        assert(microwave123.currentInstructions().powerLevel==100)
//        microwave123.clearPressed()
//
//        microwave123.clearPressed()
//        microwave123.doorOpen()
//        microwave123.popcornPressed()
//        microwave123.startPressed()
//        microwave123.closeDoor()
//        microwave123.startPressed()
//        assert(microwave123.currentInstructions().cookTime==140)
//        assert(microwave123.currentInstructions().powerLevel==100)
//        microwave123.clearPressed()
//
//        microwave123.powerLevelPressed()
//        microwave123.openDoor()
//        microwave123.numberPressed(5)
//        microwave123.closeDoor()
//        microwave123.startPressed()
//        assert(microwave123.currentInstructions().powerLevel==50)
//        microwave123.clearPressed()
//
//
//        microwave123.openDoor()
//        microwave123.popcornPressed()
//        microwave123.closeDoor()
//        microwave123.startPressed()
//        assert(microwave123.currentInstructions().cookTime==140)
//        assert(microwave123.currentInstructions().powerLevel==100)
//
//        microwave123.clearPressed()
//        microwave123.openDoor()
//        microwave123.thirtySecondsPressed()
//        microwave123.closeDoor()
//        microwave123.startPressed()
//        assert(microwave123.currentInstructions().cookTime==30)
//
//        microwave123.clearPressed()
//        microwave123.numberPressed(5)
//        microwave123.openDoor()
//        microwave123.cookTimePressed()
//        microwave123.closeDoor()
//        microwave123.numberPressed(6)
//        microwave123.startPressed()
//        assert(microwave123.currentInstructions().cookTime==6)
//        microwave123.clearPressed()
//
//        microwave123.openDoor()
//        microwave123.powerLevelPressed()
//        microwave123.closeDoor()
//        assert(microwave123.doorOpen()==false)
//        microwave123.numberPressed(2)
//        assert(microwave123.doorOpen()==false)
//        microwave123.startPressed()
//        assert(microwave123.currentInstructions().powerLevel==20)
//        assert(microwave123.doorOpen()==false)
//        microwave123.clearPressed()
//        assert(microwave123.doorOpen()==false)
//
//        microwave123.openDoor()
//        microwave123.cookTimePressed()
//        microwave123.closeDoor()
//        assert(microwave123.doorOpen()==false)
//        microwave123.numberPressed(3)
//        assert(microwave123.doorOpen()==false)
//        microwave123.startPressed()
//        assert(microwave123.doorOpen()==false)
//        assert(microwave123.currentInstructions().cookTime==3)
//        microwave123.clearPressed()
//        assert(microwave123.doorOpen()==false)
//        assert(!microwave123.doorOpen())
//        microwave123.openDoor()
//        assert(microwave123.doorOpen()==true)
//        microwave123.powerLevelPressed()
//        assert(microwave123.doorOpen()==true)
//        microwave123.popcornPressed()
//        assert(microwave123.doorOpen()==true)
//        microwave123.closeDoor()
//        assert(microwave123.doorOpen()==false)
//        microwave123.startPressed()
//        assert(microwave123.doorOpen()==false)
//        assert(microwave123.currentInstructions().cookTime==140)
//        assert(microwave123.currentInstructions().powerLevel==100)
//        microwave123.clearPressed()
//
//        assert(microwave123.doorOpen()==false)
//        microwave123.openDoor()
//        microwave123.popcornPressed()
//        microwave123.cookTimePressed()
//        assert(microwave123.doorOpen()==true)
//        microwave123.closeDoor()
//        microwave123.numberPressed(6)
//        microwave123.startPressed()
//        assert(microwave123.doorOpen()==false)
//        assert(microwave123.currentInstructions().cookTime==6)
//        assert(microwave123.currentInstructions().powerLevel==100)
//        microwave123.clearPressed()
//
//        microwave123.powerLevelPressed()
//        microwave123.numberPressed(0)
//        microwave123.numberPressed(5)
//        microwave123.numberPressed(7)
//        microwave123.startPressed()
//        assert(microwave123.currentInstructions().powerLevel == 70)
//        microwave123.clearPressed()
//
//        microwave123.numberPressed(7)
//        microwave123.powerLevelPressed()
//        microwave123.numberPressed(8)
//        microwave123.cookTimePressed()
//        microwave123.numberPressed(9)
//        microwave123.startPressed()
//        assert(microwave123.currentInstructions().cookTime == 9)
//        assert(microwave123.currentInstructions().powerLevel == 80)
//        microwave123.clearPressed()
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//    }
//  test("afffhh"){
//      val microwave:Microwave=new Microwave()
//
//      microwave.openDoor()
//      microwave.numberPressed(9)
//      assert(microwave.currentInstructions().cookTime==0)
//      microwave.clearPressed()
//      microwave.closeDoor()
//      microwave.numberPressed(9)
//      microwave.startPressed()
//      assert(microwave.currentInstructions().cookTime==9)
//      microwave.clearPressed()
//      microwave.popcornPressed()
//      assert(microwave.currentInstructions().cookTime==140)
//      assert(microwave.currentInstructions().powerLevel==100)
//      microwave.clearPressed()
//      microwave.numberPressed(9)
//      microwave.startPressed()
//      assert(microwave.currentInstructions().cookTime==9)
//      microwave.clearPressed()
//      microwave.popcornPressed()
//      microwave.openDoor()
//      assert(microwave.currentInstructions().cookTime==0)
//      assert(microwave.currentInstructions().powerLevel==0)
//      microwave.closeDoor()
//      microwave.clearPressed()
//      microwave.openDoor()
//      microwave.popcornPressed()
//      assert(microwave.currentInstructions().cookTime==0)
//      assert(microwave.currentInstructions().powerLevel==0)
//      microwave.closeDoor()
//      microwave.clearPressed()
//      microwave.numberPressed(3)
//      microwave.numberPressed(0)
//      microwave.startPressed()
//      assert(microwave.currentInstructions().cookTime==30)
//      microwave.clearPressed()
//      microwave.openDoor()
//      microwave.numberPressed(1)
//      microwave.numberPressed(2)
//      microwave.startPressed()
//      assert(microwave.currentInstructions().cookTime==0)
//      microwave.powerLevelPressed()
//      microwave.numberPressed(2)
//      microwave.startPressed()
//      assert(microwave.currentInstructions().powerLevel==0)
//      microwave.closeDoor()
//      microwave.startPressed()
//      assert(microwave.currentInstructions().powerLevel==20)
//      microwave.clearPressed()
//      microwave.openDoor()
//      microwave.popcornPressed()
//      microwave.popcornPressed()
//      assert(microwave.currentInstructions().cookTime==0)
//      assert(microwave.currentInstructions().powerLevel==0)
//      microwave.closeDoor()
//      microwave.startPressed()
//      assert(microwave.currentInstructions().cookTime==140)
//      assert(microwave.currentInstructions().powerLevel==100)
//      microwave.thirtySecondsPressed()
//      assert(microwave.currentInstructions().cookTime==170)
//      microwave.openDoor()
//      microwave.thirtySecondsPressed()
//      microwave.thirtySecondsPressed()
//      assert(microwave.currentInstructions().cookTime==0)
//
//
//
//    //example power Level 1
//
//
//
//
//  }




  //  test("okok"){
      //  val microwave:Microwave=new Microwave()
//            microwave.numberPressed(5)
//            microwave.numberPressed(5)
//            microwave.powerLevelPressed()
//            microwave.numberPressed(5)
//            microwave.startPressed()
//            assert(microwave.currentInstructions().cookTime == 55)
//            assert(microwave.currentInstructions().powerLevel == 50)
//            microwave.clearPressed()
//            //example power Level 2
//            assert(microwave.currentInstructions().cookTime == 0)
//            assert(microwave.currentInstructions().powerLevel == 100)
//            microwave.numberPressed(5)
//            microwave.numberPressed(5)
//            microwave.powerLevelPressed()
//            microwave.numberPressed(2)
//            microwave.powerLevelPressed()
//            microwave.numberPressed(2)
//            microwave.cookTimePressed()
//            microwave.numberPressed(2)
//            microwave.numberPressed(5)
//            microwave.startPressed()
//            assert(microwave.currentInstructions().cookTime == 25)
//            assert(microwave.currentInstructions().powerLevel == 20)
//            microwave.clearPressed()
//
//            assert(microwave.currentInstructions().cookTime == 0)
//            //testing all the number close
//            assert(microwave.currentInstructions().cookTime == 0)
//            microwave.numberPressed(1)
//            microwave.numberPressed(2)
//            microwave.numberPressed(3)
//            microwave.numberPressed(4)
//            microwave.numberPressed(5)
//            microwave.numberPressed(6)
//            microwave.numberPressed(7)
//            microwave.numberPressed(8)
//            microwave.numberPressed(9)
//            microwave.numberPressed(0)
//            microwave.startPressed()
//            assert(microwave.currentInstructions().cookTime == 1234567890)
//            microwave.clearPressed()
//
//            //testing 30 close
//            assert(microwave.currentInstructions().cookTime == 0)
//            microwave.thirtySecondsPressed()
//            assert(microwave.currentInstructions().cookTime==30)
//            microwave.clearPressed()
//            assert(microwave.currentInstructions().cookTime == 0)
//            microwave.numberPressed(1)
//            microwave.numberPressed(2)
//            microwave.thirtySecondsPressed()
//            assert(microwave.currentInstructions().cookTime==42)
//            microwave.clearPressed()
//            assert(microwave.currentInstructions().cookTime == 0)
//            microwave.numberPressed(1)
//            microwave.thirtySecondsPressed()
//            assert(microwave.currentInstructions().cookTime==31)
//            microwave.thirtySecondsPressed()
//            assert(microwave.currentInstructions().cookTime==61)
//            microwave.clearPressed()
//
//            //example test one
//            assert(microwave.currentInstructions().cookTime == 0)
//            microwave.numberPressed(1)
//            microwave.numberPressed(2)
//            microwave.numberPressed(3)
//            microwave.numberPressed(4)
//            microwave.numberPressed(5)
//            microwave.numberPressed(6)
//            microwave.numberPressed(7)
//            microwave.numberPressed(8)
//            microwave.numberPressed(9)
//            microwave.numberPressed(0)
//            assert(microwave.currentInstructions().cookTime == 0)
//            microwave.clearPressed()
//            microwave.startPressed()
//            assert(microwave.currentInstructions().cookTime == 0)
//            microwave.clearPressed()
//            assert(microwave.currentInstructions().cookTime == 0)
//
//
//            //testing all the number open
//            assert(microwave.currentInstructions().cookTime == 0)
//            microwave.openDoor()
//            microwave.numberPressed(1)
//            microwave.numberPressed(2)
//            microwave.numberPressed(3)
//            microwave.numberPressed(4)
//            microwave.numberPressed(5)
//            microwave.numberPressed(6)
//            microwave.numberPressed(7)
//            microwave.numberPressed(8)
//            microwave.numberPressed(9)
//            microwave.numberPressed(0)
//            microwave.closeDoor()
//            microwave.startPressed()
//            assert(microwave.currentInstructions().cookTime == 1234567890)
//            microwave.clearPressed()
//
//            //testing 30 open
//            assert(microwave.currentInstructions().cookTime == 0)
//            microwave.openDoor()
//            microwave.thirtySecondsPressed()
//            microwave.closeDoor()
//            microwave.startPressed()
//            assert(microwave.currentInstructions().cookTime==30)
//            microwave.clearPressed()
//            assert(microwave.currentInstructions().cookTime == 0)
//            microwave.openDoor()
//            microwave.numberPressed(1)
//            microwave.numberPressed(2)
//            microwave.thirtySecondsPressed()
//            microwave.closeDoor()
//            microwave.startPressed()
//            assert(microwave.currentInstructions().cookTime==42)
//            microwave.clearPressed()
//            assert(microwave.currentInstructions().cookTime == 0)
//            microwave.openDoor()
//            microwave.numberPressed(1)
//            microwave.thirtySecondsPressed()
//            microwave.closeDoor()
//            microwave.startPressed()
//            assert(microwave.currentInstructions().cookTime==31)
//            microwave.thirtySecondsPressed()
//            assert(microwave.currentInstructions().cookTime==61)
//            microwave.clearPressed()
//            assert(microwave.currentInstructions().cookTime == 0)
//            microwave.openDoor()
//            microwave.thirtySecondsPressed()
//            microwave.thirtySecondsPressed()
//            microwave.closeDoor()
//            microwave.startPressed()
//            assert(microwave.currentInstructions().cookTime==60)
//            microwave.closeDoor()
//            microwave.clearPressed()
//            assert(microwave.currentInstructions().cookTime == 0)
//
//            //+ 30 while running
//            assert(microwave.currentInstructions().cookTime == 0)
//            microwave.numberPressed(1)
//            microwave.numberPressed(2)
//            microwave.numberPressed(3)
//            microwave.thirtySecondsPressed()
//            assert(microwave.currentInstructions().cookTime == 153)
//            microwave.thirtySecondsPressed()
//            assert(microwave.currentInstructions().cookTime == 183)
//            microwave.thirtySecondsPressed()
//            assert(microwave.currentInstructions().cookTime == 213)
//            microwave.clearPressed()
//            assert(microwave.currentInstructions().cookTime == 0)
//
//            //add number after running open door
//            assert(microwave.currentInstructions().cookTime == 0)
//            microwave.numberPressed(1)
//            microwave.startPressed()
//            assert(microwave.currentInstructions().cookTime == 1)
//            microwave.openDoor()
//            microwave.numberPressed(1)
//            microwave.closeDoor()
//            microwave.startPressed()
//            assert(microwave.currentInstructions().cookTime == 11)
//            microwave.clearPressed()
//            assert(microwave.currentInstructions().cookTime == 0)
//            microwave.numberPressed(1)
//            microwave.startPressed()
//            assert(microwave.currentInstructions().cookTime == 1)
//            microwave.openDoor()
//            microwave.numberPressed(1)
//            microwave.closeDoor()
//            microwave.numberPressed(1)
//            microwave.startPressed()
//            assert(microwave.currentInstructions().cookTime == 111)
//            microwave.clearPressed()
//            assert(microwave.currentInstructions().cookTime == 0)
//
//            //add 30 after running open door
//            assert(microwave.currentInstructions().cookTime == 0)
//            microwave.thirtySecondsPressed()
//            assert(microwave.currentInstructions().cookTime == 30)
//            microwave.openDoor()
//            microwave.thirtySecondsPressed()
//            microwave.closeDoor()
//            microwave.startPressed()
//            assert(microwave.currentInstructions().cookTime == 60)
//            microwave.clearPressed()
//            assert(microwave.currentInstructions().cookTime == 0)
//            microwave.thirtySecondsPressed()
//            assert(microwave.currentInstructions().cookTime == 30)
//            microwave.openDoor()
//            microwave.thirtySecondsPressed()
//            microwave.closeDoor()
//            microwave.thirtySecondsPressed()
//            assert(microwave.currentInstructions().cookTime == 90)
//            microwave.clearPressed()
//            assert(microwave.currentInstructions().cookTime == 0)
//
//            //add 30+1 after running open door
//            assert(microwave.currentInstructions().cookTime == 0)
//            microwave.numberPressed(1)
//            microwave.thirtySecondsPressed()
//            assert(microwave.currentInstructions().cookTime == 31)
//            microwave.openDoor()
//            microwave.numberPressed(1)
//            microwave.thirtySecondsPressed()
//            microwave.closeDoor()
//            microwave.startPressed()
//            assert(microwave.currentInstructions().cookTime == 341)
//            microwave.clearPressed()
//            assert(microwave.currentInstructions().cookTime == 0)
//            microwave.numberPressed(1)
//            microwave.thirtySecondsPressed()
//            assert(microwave.currentInstructions().cookTime == 31)
//            microwave.openDoor()
//            microwave.numberPressed(1)
//            microwave.thirtySecondsPressed()
//            microwave.closeDoor()
//            microwave.numberPressed(1)
//            microwave.thirtySecondsPressed()
//            assert(microwave.currentInstructions().cookTime == 3441)
//            microwave.clearPressed()
//            assert(microwave.currentInstructions().cookTime == 0)
//
//            //all number  wont work while running
//            assert(microwave.currentInstructions().cookTime == 0)
//            microwave.numberPressed(1)
//            microwave.startPressed()
//            assert(microwave.currentInstructions().cookTime == 1)
//            microwave.numberPressed(1)
//            microwave.numberPressed(2)
//            microwave.numberPressed(3)
//            microwave.numberPressed(4)
//            microwave.numberPressed(5)
//            microwave.numberPressed(6)
//            microwave.numberPressed(7)
//            microwave.numberPressed(8)
//            microwave.numberPressed(9)
//            microwave.numberPressed(0)
//            microwave.clearPressed()
//            microwave.startPressed()
//            assert(microwave.currentInstructions().cookTime == 0)
//            assert(microwave.currentInstructions().cookTime == 0)
//            microwave.clearPressed()
//            assert(microwave.currentInstructions().cookTime == 0)
//            microwave.numberPressed(1)
//            microwave.startPressed()
//            assert(microwave.currentInstructions().cookTime == 1)
//            microwave.numberPressed(1)
//            microwave.numberPressed(2)
//            microwave.numberPressed(3)
//            microwave.numberPressed(4)
//            microwave.numberPressed(5)
//            microwave.numberPressed(6)
//            microwave.numberPressed(7)
//            microwave.numberPressed(8)
//            microwave.numberPressed(9)
//            microwave.numberPressed(0)
//            microwave.openDoor()
//            microwave.closeDoor()
//            microwave.startPressed()
//            assert(microwave.currentInstructions().cookTime == 1)
//            microwave.clearPressed()
//            assert(microwave.currentInstructions().cookTime == 0)
//
//            //the button 0 is work
//            assert(microwave.currentInstructions().cookTime == 0)
//            microwave.numberPressed(0)
//            microwave.startPressed()
//            assert(microwave.currentInstructions().cookTime == 0)
//            microwave.clearPressed()
//            assert(microwave.currentInstructions().cookTime == 0)
//            assert(microwave.currentInstructions().cookTime == 0)
//            microwave.numberPressed(0)
//            microwave.startPressed()
//            microwave.doorOpen()
//            microwave.numberPressed(0)
//            microwave.closeDoor()
//            microwave.startPressed()
//            microwave.clearPressed()
//            assert(microwave.currentInstructions().cookTime == 0)
//
//            //popcorn is working
//            assert(microwave.currentInstructions().cookTime == 0)
//            microwave.popcornPressed()
//            assert(microwave.currentInstructions().cookTime == 140)
//            microwave.clearPressed()
//            assert(microwave.currentInstructions().cookTime == 0)
//            microwave.popcornPressed()
//            microwave.popcornPressed()
//            assert(microwave.currentInstructions().cookTime == 140)
//            microwave.clearPressed()
//            assert(microwave.currentInstructions().cookTime == 0)
//            microwave.popcornPressed()
//            microwave.thirtySecondsPressed()
//            assert(microwave.currentInstructions().cookTime == 170)
//            microwave.thirtySecondsPressed()
//            assert(microwave.currentInstructions().cookTime == 200)
//            microwave.clearPressed()
//            assert(microwave.currentInstructions().cookTime == 0)
//            microwave.popcornPressed()
//            microwave.openDoor()
//            microwave.thirtySecondsPressed()
//            microwave.closeDoor()
//            microwave.startPressed()
//            assert(microwave.currentInstructions().cookTime == 170)
//            microwave.clearPressed()
//            assert(microwave.currentInstructions().cookTime == 0)
//            microwave.popcornPressed()
//            microwave.openDoor()
//            microwave.numberPressed(1)
//            microwave.closeDoor()
//            microwave.numberPressed(1)
//            microwave.startPressed()
//            assert(microwave.currentInstructions().cookTime == 14011)
//            microwave.clearPressed()
//            assert(microwave.currentInstructions().cookTime == 0)
//            microwave.popcornPressed()
//            microwave.openDoor()
//            microwave.thirtySecondsPressed()
//            microwave.closeDoor()
//            microwave.popcornPressed()
//            assert(microwave.currentInstructions().cookTime == 140)
//            microwave.clearPressed()
//            assert(microwave.currentInstructions().cookTime == 0)

            //cook time button
            //assert(microwave.currentInstructions().cookTime == 0)
//            microwave.numberPressed(1)
//            microwave.numberPressed(1)
//            microwave.numberPressed(1)
//            microwave.cookTimePressed()
//            microwave.numberPressed(2)
//            microwave.numberPressed(0)
//            microwave.startPressed()
//            assert(microwave.currentInstructions().cookTime == 20)
//            microwave.clearPressed()
//            assert(microwave.currentInstructions().cookTime == 0)
//            microwave.numberPressed(1)
//            microwave.numberPressed(1)
//            microwave.numberPressed(1)
//            microwave.cookTimePressed()
//            microwave.numberPressed(1)
//            microwave.numberPressed(2)
//            microwave.numberPressed(3)
//            microwave.numberPressed(4)
//            microwave.numberPressed(5)
//            microwave.numberPressed(6)
//            microwave.numberPressed(7)
//            microwave.numberPressed(8)
//            microwave.numberPressed(9)
//            microwave.numberPressed(0)
//            microwave.startPressed()
//            assert(microwave.currentInstructions().cookTime == 1234567890)
//            microwave.clearPressed()
//            assert(microwave.currentInstructions().cookTime == 0)
//            microwave.numberPressed(1)
//            microwave.numberPressed(1)
//            microwave.numberPressed(1)
//            microwave.cookTimePressed()
//            microwave.thirtySecondsPressed()
//            assert(microwave.currentInstructions().cookTime == 30)
//            microwave.clearPressed()
//            assert(microwave.currentInstructions().cookTime == 0)
//            microwave.numberPressed(1)
//            microwave.numberPressed(1)
//            microwave.numberPressed(1)
//            microwave.cookTimePressed()
//            microwave.numberPressed(1)
//            microwave.thirtySecondsPressed()
//            assert(microwave.currentInstructions().cookTime == 31)
//            microwave.clearPressed()
//            assert(microwave.currentInstructions().cookTime == 0)
//

  //  }




}