package com.grupoalv.decorador
@Target(AnnotationTarget.FIELD)
@Retention(AnnotationRetention.RUNTIME)
annotation class Mapper(
    val mapperby: String = "",

    )