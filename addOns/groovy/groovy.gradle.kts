import org.zaproxy.gradle.addon.AddOnStatus

version = "3.0.0"
description = "Adds Groovy support to ZAP"

zapAddOn {
    addOnName.set("Groovy Support")
    addOnStatus.set(AddOnStatus.BETA)
    zapVersion.set("2.7.0")

    manifest {
        author.set("ZAP Dev Team")
    }
}

dependencies {
    implementation("org.codehaus.groovy:groovy-all:2.4.14")

    testImplementation(project(":testutils"))
    testImplementation(parent!!.childProjects.get("websocket")!!)
}
