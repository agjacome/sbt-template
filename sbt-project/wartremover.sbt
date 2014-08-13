wartremoverErrors ++= Warts.allBut(
  Wart.DefaultArguments,
  Wart.ListOps,
  Wart.OptionPartial,
  Wart.Var
)

wartremoverWarnings ++= Seq(
  Wart.DefaultArguments,
  Wart.ListOps,
  Wart.OptionPartial,
  Wart.Var
)
