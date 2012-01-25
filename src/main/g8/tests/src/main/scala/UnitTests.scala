package $package$.tests

import junit.framework.Assert._
import _root_.android.test.AndroidTestCase
import _root_.android.test.ActivityInstrumentationTestCase2

class UnitTests extends AndroidTestCase {
  def testPackageIsCorrect {
    assertEquals("$package$", getContext.getPackageName)
  }
}

class ActivityTest extends ActivityInstrumentationTestCase2(classOf[$main_activity$]) {
   def testHelloWorldIsShown() {
      val activity = getActivity()
      val textview = activity.findView($package$.TR.textview)
      assertEquals(textview.getText(), "hello, world!")
    }
}
