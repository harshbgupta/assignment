package co.si.main.zing.splash.networking

import co.si.main.zing.splash.ui.SplashFragment
import co.si.main.zing.splash.ui.SplashFragmentDirections
import corp.hell.kernel.parent.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

/**
 * Copyright © 2021 Hell Corporation. All rights reserved.
 *
 * @author Mr. Lucifer
 * @since September 08, 2021
 */
@HiltViewModel
class SplashViewModel @Inject constructor() : BaseViewModel() {

    ///////////////////////////////////////////////////////////////////////////
    // Click Listener
    ///////////////////////////////////////////////////////////////////////////
    fun onClickCard1() {
        navigateToScreen(SplashFragmentDirections.actionSplashFragmentToLoginFragment())
    }

}