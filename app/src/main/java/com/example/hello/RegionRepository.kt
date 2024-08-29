package com.example.hello

object RegionRepository {
    val region1Data = RegionData(
        "Region 1 (Ilocos Region)",
        listOf("Ilocos Norte", "Ilocos Sur", "La Union", "Pangasinan"),
        listOf("Municipality1", "Municipality2") // Add actual municipalities
    )

    val region2Data = RegionData(
        "Region 2 (Cagayan Valley)",
        listOf("Batanes", "Cagayan", "Isabela", "Quirino", "Nueva Vizcaya"),
        listOf("Municipality1", "Municipality2") // Add actual municipalities
    )

    val region3Data = RegionData(
        "Region 3 (Central Luzon)",
        listOf("Aurora", "Bataan", "Bulacan", "Nueva Ecija", "Pampanga", "Tarlac", "Zambales"),
        listOf("Municipality1", "Municipality2") // Add actual municipalities
    )

    val region4AData = RegionData(
        "Region 4A (CALABARZON)",
        listOf("Cavite", "Laguna", "Batangas", "Rizal", "Quezon"),
        listOf("Municipality1", "Municipality2") // Add actual municipalities
    )

    val region4BData = RegionData(
    "Region 4B (MIMAROPA)",
    listOf("Occidental Mindoro", "Oriental Mindoro", "Marinduque", "Romblon", "Palawan"),
    listOf("Municipality1", "Municipality2")
    )

    val region5Data = RegionData(
    "Region 5 (Bicol Region)",
    listOf("Albay", "Sorsogon", "Catanduanes", "Masbate", "Camarines Sur", "Camarines Norte"),
    listOf("Municipality1", "Municipality2")
    )
}
