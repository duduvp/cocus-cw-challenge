package br.com.cocus.cwchallenge.data.persistence.entity.dto

import com.google.gson.annotations.SerializedName

data class RanksDTO(
        @SerializedName("overall")
        val overall: List<RankDTO> = emptyList(),
        @SerializedName("languages")
        val languages: List<RankDTO> = emptyList()
)