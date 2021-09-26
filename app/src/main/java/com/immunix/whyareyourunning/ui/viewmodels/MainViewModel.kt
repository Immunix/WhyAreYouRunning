package com.immunix.whyareyourunning.ui.viewmodels

import androidx.lifecycle.ViewModel
import com.immunix.whyareyourunning.repo.MainRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    val mainRepo: MainRepo
) : ViewModel() {

}