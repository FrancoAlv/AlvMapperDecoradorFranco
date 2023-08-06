package com.grupoalv.decorador
@Target(AnnotationTarget.FIELD)
@Retention(AnnotationRetention.RUNTIME)
annotation class MapperName(
    val nombreValue:String=""
)