package com.example

class ContestController {

    def index() { }

    def dq(long id, long imageId) {
        render "id: $id, imageId: $imageId"
    }  // WORKS FINE!
    def submit(long id, long images) {
        render "id: $id, images: $images"
    } // GroovyCastException: Cannot cast object '1000311' with class 'java.lang.String' to class 'long'
    def prepareQuestionnaire(Long id) {
        render "id: $id"
    }  // GroovyCastException: Cannot cast object '1000271' with class 'java.lang.String' to class 'java.lang.Long'
}
