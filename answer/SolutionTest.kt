import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class SolutionTest : StringSpec({
    "두 수의 합을 계산한다." {
        val solution = Solution()
        solution.solution(2, 3) shouldBe 5
        solution.solution(-1, 1) shouldBe 0
        solution.solution(100, 200) shouldBe 300
    }
})
