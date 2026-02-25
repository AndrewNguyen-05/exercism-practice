    val hm = mapOf<List<String>, String>(
        listOf("AUG") to "Methionine",
        listOf("UUU", "UUC") to "Phenylalanine",
        listOf("UUA", "UUG") to "Leucine",
        listOf("UCU", "UCC", "UCA", "UCG") to "Serine",
        listOf("UAU", "UAC") to "Tyrosine",
        listOf("UGU", "UGC") to "Cysteine",
        listOf("UGG") to "Tryptophan",
        listOf("UAA", "UAG", "UGA") to "STOP"
    )
    
fun translate(rna: String?): List<String> {

    if (rna == null) return emptyList()

    val res = mutableListOf<String>()
    for(i in 0 until rna.length step 3) {
        if (i + 3 > rna.length) {
            throw IllegalArgumentException("Invalid codon")
        }
        val protein = getProtein(rna.substring(i, i + 3))
        when(protein) {
            "STOP" -> break
            "Invalid Codon" -> throw IllegalArgumentException("Invalid Codon")
            else -> res.add(protein)
        }
    }
    return res
}

fun getProtein(codon: String): String {

    for(k in hm.keys){
        if(k.contains(codon)) {
            return hm.getValue(k)
        }
    }
    return "Invalid Codon"
}
