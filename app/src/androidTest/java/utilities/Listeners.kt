package utilities

import org.junit.AssumptionViolatedException
import org.junit.rules.TestWatcher
import org.junit.runner.Description
import org.junit.runners.model.Statement

class Listeners: TestWatcher() {
    override fun apply(base: Statement?, description: Description?): Statement {
        return super.apply(base, description)
    }

    override fun succeeded(description: Description) {
        Logs.writeStatus("PASS", description.methodName)
    }

    override fun failed(e: Throwable?, description: Description) {
        Logs.writeStatus("FAILED", description.methodName)
    }

    override fun skipped(e: AssumptionViolatedException?, description: Description) {
        Logs.writeStatus("SKIPPED", description.methodName)
    }

    override fun skipped(e: org.junit.internal.AssumptionViolatedException?, description: Description) {
        Logs.writeStatus("SKIPPED", description.methodName)
    }

    override fun starting(description: Description) {
        Logs.startTest(description.methodName)
    }

    override fun finished(description: Description) {
        Logs.finishedTest(description.methodName)
    }
}
