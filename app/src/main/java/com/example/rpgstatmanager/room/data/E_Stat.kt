package com.example.rpgstatmanager.room.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName= "stat")
data class E_Stat (
    @PrimaryKey(autoGenerate= true)
    var id: String,
    @ColumnInfo(name = "characterId")
    var characterId: String,
    @ColumnInfo(name = "half")
    var half: String,
    @ColumnInfo(name = "line")
    var line: String,
    @ColumnInfo(name = "value")
    var value: Long
)