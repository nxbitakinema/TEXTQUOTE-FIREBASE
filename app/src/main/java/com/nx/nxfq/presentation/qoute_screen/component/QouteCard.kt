package com.nx.nxfq.presentation.qoute_screen.component

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults.cardColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.nx.nxfq.domain.model.Qoute

@Composable
fun QouteCard(
    qoute: Qoute,
    deleteQoute: () -> Unit
) {
    Card(
        modifier = Modifier.fillMaxWidth().padding(all = 14.dp),
        colors = cardColors(Color.Transparent)
    ) {
        QouteText(
            qouteText = qoute.title.orEmpty()
        )
        QouteAuther(
            qouteAuther = qoute.author.orEmpty()
        )
        DeleteIcon(
            deleteQoute = deleteQoute
        )
        Spacer(modifier = Modifier.height(14.dp)
        )

    }
}