package my.lib

import zio._

import some.dep.Important

// - break out small utility libraries from larger projects
// - test out fixes to open source dependencies
object Main extends ZIOAppDefault {
  val run = Console.printLine(Important.importantValue)
}
