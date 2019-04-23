package com.example.testmqttaplication

class PublisherThread(private val mqttHelper:MqttHelper): Thread() {

    override fun run() {
        while (true) {
            mqttHelper.publish("current time ${System.currentTimeMillis()}")
            sleep(1000)
        }
    }
}