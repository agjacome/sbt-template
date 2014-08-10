import wartremover._

wartremoverSettings

wartremoveErrors ++= Warts.allBut(
  Wart.DefaultArguments,
  Wart.ListOps,
  Wart.OptionPartial,
  Wart.Var
)

wartremoveWarnings ++= Seq(
  Wart.DefaultArguments,
  Wart.ListOps,
  Wart.OptionPartial,
  Wart.Var
)
