package com.febrian.matahatiapp

import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.Query
import kotlinx.coroutines.tasks.await
import java.lang.Exception

class MovementRepository(
    private val db: FirebaseFirestore
) {

    suspend fun getAllMovement(): Result<List<ItemMovement?>> {
        return try {
            val documentSnapshot = db.collection("Movement").get().await()
            val itemMovement = documentSnapshot.toObjects(ItemMovement::class.java)
            Result.success(itemMovement)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    suspend fun getMovementByCategory(category:String): Result<List<ItemMovement?>> {
        return try {
            val documentSnapshot = db.collection("Movement").whereEqualTo("","").get().await()
            val itemMovement = documentSnapshot.toObjects(ItemMovement::class.java)
            Result.success(itemMovement)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}