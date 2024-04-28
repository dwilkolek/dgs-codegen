package com.netflix.graphql.dgs.codegen.cases.inputWithDefaultValueForNonNullableFields.expected.types

import com.netflix.graphql.dgs.codegen.GraphQLInput
import kotlin.Any
import kotlin.Pair
import kotlin.String
import kotlin.collections.List

public class Car(
  public val brand: String = default<Car, String>("brand", "BMW"),
) : GraphQLInput() {
  override fun fields(): List<Pair<String, Any?>> = listOf("brand" to brand)
}
