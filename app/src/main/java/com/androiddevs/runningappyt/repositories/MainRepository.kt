package com.androiddevs.runningappyt.repositories

import com.androiddevs.runningappyt.db.Run
import com.androiddevs.runningappyt.db.RunDAO
import javax.inject.Inject

class MainRepository @Inject constructor(
    val runDAO: RunDAO
) {

    suspend fun insertRun(run: Run) = runDAO.insertRun(run)

    suspend fun deleteRun(run: Run) = runDAO.deleteRun(run)

    fun getAllRunSortedByDate() = runDAO.getAllRunSortedByDate()

    fun getAllRunSortedByDistance() = runDAO.getAllRunSortedByDistance()

    fun getAllRunSortedByTimesInMills() = runDAO.getAllRunSortedByTimesInMills()

    fun getAllRunSortedByAvgSpeed() = runDAO.getAllRunSortedByAvgSpeed()

    fun getAllRunSortedByCaloriesBurned() = runDAO.getAllRunSortedByCaloriesBurned()

    fun getTotalAvgSpeed() = runDAO.getTotalAvgSpeed()

    fun getTotalDistance() = runDAO.getTotalDistance()

    fun getTotalTimeInMills() = runDAO.getTotalTimeInMills()

    fun getTotalCaloriesBurned() = runDAO.getTotalCaloriesBurned()


}