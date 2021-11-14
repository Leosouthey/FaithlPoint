plugins {
    java
    id("io.izzel.taboolib") version "1.31"
    id("org.jetbrains.kotlin.jvm") version "1.5.31"
}

taboolib {
    install("common")
    install("common-5")
    install("platform-bukkit")
    install("module-lang")
    install("module-nms")
    install("module-ui-receptacle")
    install("module-chat")
    install("module-configuration")
    install("module-metrics")
    install("module-database")
    install("expansion-player-database")
    classifier = null
    version = "6.0.4-5"
    description {
        contributors {
            name("Leosouthey")
        }
        links{
            name("homepage").url("https://forum.faithl.com")
        }
        dependencies {
            name("AttributePlus").optional(true)
            name("OriginAttribute").optional(true)
            name("Zaphkiel").optional(true)
            name("PlaceholderAPI").optional(true)
        }
    }
}

repositories {
    mavenCentral()
    maven { url = uri("https://repo2s.ptms.ink/repository/maven-releases") }
    maven { url = uri("https://repo.pcgamingfreaks.at/repository/maven-everything") }
    maven { url = uri("https://nexus.badbones69.com/repository/maven-releases") }
    maven { url = uri("https://jitpack.io") }
}

dependencies {
    implementation("ink.ptms.core:v11701:11701:mapped")
    implementation("ink.ptms.core:v11701:11701:universal")
    compileOnly("public:AttributePlus:3.2.1")
//    compileOnly("ink.ptms:Zaphkiel:1.7.4")
    compileOnly("com.alibaba:fastjson:1.2.78")
    compileOnly("org.jetbrains.kotlin:kotlin-stdlib:1.5.31")
    compileOnly(fileTree("libs"))
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
}

configure<JavaPluginExtension> {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}