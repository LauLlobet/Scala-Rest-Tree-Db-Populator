package lau.llobet.resttreedbpopulator

import org.scalatest._

class TreeDbPopulatorSpec extends WordSpec with Matchers {
  "au.llobet.resttreedbpopulator.TreeDbPopulato" should {

    "not have the same if for 2 instances" in {
      val root = "https://api.spotify.com"
      val c1 = TreeDbPopulator(root)

      c1.root should be {root}
    }
  }

}
