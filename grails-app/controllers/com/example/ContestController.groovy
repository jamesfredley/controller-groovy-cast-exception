package com.example

class ContestController {

    def index() { }

    def dq(long id, long imageId) {}  // WORKS FINE!
    def submit(long id, long images) {} // GroovyCastException: Cannot cast object '1000311' with class 'java.lang.String' to class 'long'
    def prepareQuestionnaire(Long id) {}  // GroovyCastException: Cannot cast object '1000271' with class 'java.lang.String' to class 'java.lang.Long'

    def submit(long images) { params.long('id')}
}
