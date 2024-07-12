import org.python.CoveragePython
import org.python.Dependency
import org.python.SonarQube
import org.python.UnitTesting

def callCoveragePython() {
    new CoveragePython().call()
}

def callDependency() {
    new Dependency().call()
}

def callSonarqube() {
    new UnitTesting().call()
}

def callUnitTesting() {
    new UnitTesting().call()
}
