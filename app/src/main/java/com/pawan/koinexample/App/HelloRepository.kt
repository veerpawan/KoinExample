package com.pawan.koinexample.App

interface HelloRepository {

    fun sayHello(): String

}

class HelloRepositoryImple : HelloRepository {
    override fun sayHello(): String = "Hello From Repository"
}