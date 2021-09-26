package com.immunix.whyareyourunning.repo

import com.immunix.whyareyourunning.db.Run
import com.immunix.whyareyourunning.db.RunDAO
import javax.inject.Inject

class MainRepo @Inject constructor(
    private val runDao: RunDAO
) {
    suspend fun insertRun(run: Run) = runDao.insertRun(run)

    suspend fun deleteRun(run: Run) = runDao.deleteRun(run)

    fun getRunsSortedByDate() = runDao.getRunsSortedByDate()

    fun getRunsSortedByDistance() = runDao.getRunsSortedByDistance()

    fun getRunsSortedByTimeInMillis() = runDao.getRunsSortedByMillis()

    fun getRunsSortedByAvgSpeed() = runDao.getRunsSortedBySpeed()

    fun getRunsSortedByCalories() = runDao.getRunsSortedByCalories()

    fun getTotalAvgSpeed() = runDao.getAvgSpeed()

    fun getTotalDistance() = runDao.getTotalDistance()

    fun getTotalCaloriesBurned() = runDao.getTotalCaloriesBurned()

    fun getTotalTimeMillis() = runDao.getTotalTimeInMillis()
}