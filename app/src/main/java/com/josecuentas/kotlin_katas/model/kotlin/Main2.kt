package com.josecuentas.kotlin_katas.model.kotlin

/**
 * Created by iPibeDx on 4/03/17.
 */
object Main2 {
    @JvmStatic
    fun main(args:Array<String>) {
        var personList = listOf(
                User("José", 23),
                User("Juan", 22),
                User("Pepe", 21)
                )

        val person = personList.find{
            it.name.equals("Juan")
        }
        println(person)
        personList.find({it.name.equals("juan", false)})
        var form:Form = Form()
        form.input1 = ""
    }

}