package models

import com.github.javafaker.Faker

class NoteModel() {
    var title: String = Faker.instance().lorem().sentence(3)
    var body: String = Faker.instance().lorem().sentence(15)
}
