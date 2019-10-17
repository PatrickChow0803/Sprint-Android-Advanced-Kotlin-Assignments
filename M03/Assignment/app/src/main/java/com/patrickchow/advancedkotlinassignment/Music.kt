package com.patrickchow.advancedkotlinassignment

sealed class Music(var name: String)

class Rock(name: String):Music(name)

class Pop(name: String):Music(name)

class Classical(name: String):Music(name)