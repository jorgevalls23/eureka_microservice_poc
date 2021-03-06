/*
 * Test Eureka starter class
 */
package es.microservices.spring.netflix.eureka;

import groovy.*
import spock.lang.*

class EurekaStarterTest extends Specification{
    def "length of Spock's and his friends' names"() {
        expect:
        name.size() == length

        where:
        name     | length
        "Spock"  | 5
        "Kirk"   | 4
        "Scotty" | 6
    }
}