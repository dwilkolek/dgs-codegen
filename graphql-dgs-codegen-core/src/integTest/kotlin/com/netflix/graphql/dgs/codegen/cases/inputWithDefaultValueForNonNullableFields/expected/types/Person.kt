package com.netflix.graphql.dgs.codegen.cases.inputWithDefaultValueForNonNullableFields.expected.types

import com.netflix.graphql.dgs.codegen.GraphQLInput
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Pair
import kotlin.String
import kotlin.collections.List

public class Person(
  public val name: String = default<Person, String>("name", "Damian"),
  public val age: Int = default<Person, Int>("age", 18),
  public val car: Car = default<Person, Car>("car",
      com.netflix.graphql.dgs.codegen.cases.inputWithDefaultValueForNonNullableFields.expected.types.Car(brand
      = "Ford")),
  public val hobbies: List<Hobby> = default<Person, List<Hobby>>("hobbies",
      listOf(com.netflix.graphql.dgs.codegen.cases.inputWithDefaultValueForNonNullableFields.expected.types.Hobby.Hokey)),
  public val isHappy: Boolean = default<Person, Boolean>("isHappy", true),
) : GraphQLInput() {
  override fun fields(): List<Pair<String, Any?>> = listOf("name" to name, "age" to age, "car" to
      car, "hobbies" to hobbies, "isHappy" to isHappy)
}
