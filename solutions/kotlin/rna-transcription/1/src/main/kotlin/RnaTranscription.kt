fun transcribeToRna(dna: String): String {
    val sbd = StringBuilder()
    for(c in dna) {
        when(c) {
            'G' -> sbd.append('C')
            'C' -> sbd.append('G')
            'T' -> sbd.append('A')
            'A' -> sbd.append('U')
        }
    }
    return sbd.toString()
}