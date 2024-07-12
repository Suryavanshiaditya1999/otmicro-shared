import org.python.CoveragePython
import org.python.Dependency

def callCoveragePython() {
    new CoveragePython().call()
}

def callDependency() {
    new Dependency().call()
}
