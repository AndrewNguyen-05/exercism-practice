class Dna(val chain: String) {

    init {
        for (c in chain) {
            if (c !in setOf('A', 'C', 'G', 'T')) {
                throw IllegalArgumentException("error")
            }
        }
    }

    val nucleotideCounts: Map<Char, Int>
        get() {
            var A_cnt = 0
            var G_cnt = 0
            var C_cnt = 0
            var T_cnt = 0
            for(c in chain) {
                when(c) {
                    'A' -> A_cnt++
                    'G' -> G_cnt++
                    'C' -> C_cnt++
                    'T' -> T_cnt++
                }  
            }
            return mapOf('A' to A_cnt, 'G' to G_cnt, 'C' to C_cnt, 'T' to T_cnt)
        }
}
