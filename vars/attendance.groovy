// import org.python.CoveragePython
// import org.python.Dependency
// import org.python.SonarQube
// import org.python.UnitTesting
import org.python.Checkout

def call(String gitUrl, String branch = 'main') {
    new Checkout().call(gitUrl, branch)
}

// def callDependency() {
//     new Dependency().call()
// }

// def callSonarqube() {
//     new UnitTesting().call()
// }

// def callUnitTesting() {
//     new UnitTesting().call()
// }
