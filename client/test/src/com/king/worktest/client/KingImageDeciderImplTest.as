package com.king.worktest.client {

import org.hamcrest.assertThat;

public class KingImageDeciderImplTest {
    public function KingImageDeciderImplTest() {
    }

    internal var kingImageDecider:KingImageDeciderImpl;

    [Before]
    public function setUp():void {
        kingImageDecider = new KingImageDeciderImpl();
    }

    [Test]
    public function testStuff():void {
        assertThat(true, kingImageDecider.showImage());
    }

}
}
