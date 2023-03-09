fun main() {

    task1()
    task2()
    task3()
    task4()
    task5()
    task6()
    task7()
    task8()
    task9()
    task10()
}

fun task1(){
    //1.1278217 ədədində 78 ədədini mod və div əməliyyatlarından istifadə edərək ekrana cixardin

    val divMod78 = 1278217/1000%100
    println(divMod78)
}

fun task2(){
    //2.1278217 ədədində 2782 ədədini mod və div əməliyyatlarından istifadə edərək ekrana cixardin

    val divMod2782 = 1278217/100%10000
    println(divMod2782)
}

fun task3(){
    //3.238545 ədədində 8 ədədini mod və div əməliyyatlarından istifadə edərək ekrana cixardin

    val divMod8 = 238545/1000%10
    println(divMod8)
}

fun task4(){
    //4.238545 ədədində 23 ədədini mod və div əməliyyatlarından istifadə edərək ekrana cixardin

    val divMod23 = 238545/10000
    println(divMod23)
}

fun task5(){
    //5.238545 ədədində hər bir ədədi mod və div əməliyyatlarından istifadə edərək tapin və onlarin cemini tapin.(Numune:2+3+8+5+4+5)

    val divModSum = 238545/100000 + 238545/10000%10 + 238545/1000%10 + 238545/100%10 + 238545/10%10 + 238545%10
    println(divModSum)
}

fun task6(){
    //6.238545 ədədində ədədləri iki-iki mod və div əməliyyatlarından istifadə edərək tapin və onlarin cemini tapin.(Numune:23+85+45)

    val divModDoubleSum = 238545/10000 + 238545/100%100 + 238545%100
    println(divModDoubleSum)
}

fun task7(){
    //7.3423432 ədədində son iki və ilk ədədi mod və div əməliyyatlarından istifadə edərək tapin və onlarin cemini tapin.(Numune:34+32)

    val divModFirstDoubleandLastDouble = 3423432/100000 + 3423432%100
    println(divModFirstDoubleandLastDouble)
}

fun task8(){
    //8.3423432 ədədində 343 ədədini mod və div əməliyyatlarından istifadə edərək ekrana cixardin.

    val divMod343 = 3423432/10%1000
    println(divMod343)
}

fun task9(){
    //9.9423435 ədədində ilk və son ədədi mod və div əməliyyatlarından istifadə edərək tapın və onlarin cemini ekrana cixardin (Numune:9+5)

    val divModFirstandLast = 9423435/1000000 + 9423435%10
    println(divModFirstandLast)
}

fun task10(){
    //10.9423435 ədədində hər bir ədədi mod və div əməliyyatlarından istifadə edərək tapin və onlarin ədədi ortasını tapin.

    val divModAverage = (9423435.0/1000000 + 9423435.0/100000%10 + 9423435.0/10000%10 + 9423435.0/1000%10 + 9423435.0/100%10 + 9423435.0/10%10 + 9423435.0%10)/7
    println(divModAverage)
}