// The Lagom plugin
addSbtPlugin("com.lightbend.lagom" % "lagom-sbt-plugin" % "1.4.13")

// The Cinnamon Telemetry plugin
addSbtPlugin("com.lightbend.cinnamon" % "sbt-cinnamon" % "2.12.0-M5")

// Credentials and resolver to download the Cinnamon Telemetry libraries
credentials += Credentials(Path.userHome / ".lightbend" / "commercial.credentials")
resolvers += Resolver.url("lightbend-commercial", url("https://repo.lightbend.com/commercial-releases"))(Resolver.ivyStylePatterns)


