/**
* RPG Stat Manager Central Server
* This is the server for the data accass of the RPG Users
*
* OpenAPI spec version: 1.0.0
* Contact: holloszaboakos.1996@gmail.com
*
* NOTE: This class is auto generated by the swagger code generator program.
* https://github.com/swagger-api/swagger-codegen.git
* Do not edit the class manually.
*/
package com.example.rpgstatmanager.swagger.client.models

/**
 * 
 * @param id 
 * @param race_id 
 * @param name 
 * @param positive 
 * @param description 
 * @param effect 
 * @param moves 
 */
data class Ability (
    val id: kotlin.String? = null,
    val race_id: kotlin.String? = null,
    val name: kotlin.String? = null,
    val positive: kotlin.Boolean? = null,
    val description: kotlin.String? = null,
    val effect: kotlin.String? = null,
    val moves: kotlin.Array<Move>? = null
) {

}

