object SumOfMultiples {

    fun sum(factors: Set<Int>, limit: Int): Int {
        var res = 0
        if(factors.contains(1)) return limit * (limit - 1) / 2
        for(i in 1 until limit) {
            for(num in factors) {
                if(num != 0 && i % num == 0) {
                    res += i
                    break
                }
            }
        }
        return res
    }
}
