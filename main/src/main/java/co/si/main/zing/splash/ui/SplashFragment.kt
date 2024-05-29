package co.si.main.zing.splash.ui

import android.os.Handler
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import co.si.core.utils.closeKeyboard
import co.si.main.R
import co.si.main.databinding.SplashFragmentBinding
import co.si.main.zing.splash.networking.SplashViewModel
import co.si.main.zing.utils.getPreBasicDataFromDataStoreAndEstablishSocketConnection
import com.bumptech.glide.Glide
import corp.hell.kernel.parent.BaseFragment
import corp.hell.kernel.constants.AppData.mLanguage
import kotlinx.coroutines.launch
import timber.log.Timber
import java.util.Locale

class SplashFragment :
    BaseFragment<SplashFragmentBinding, SplashViewModel>(SplashFragmentBinding::inflate) {

    override val viewModel by viewModels<SplashViewModel>()
    private val args by navArgs<SplashFragmentArgs>()

    override fun onPostCreateView() {
        super.onPostCreateView()
        closeKeyboard(binding.root)
        setLanguage()
        liveDataObserver()//observing live data
        restOfCoding()
    }


    /**
     * Rest of Coding starts here
     */
    private fun restOfCoding() = lifecycleScope.launch {
        getPreBasicDataFromDataStoreAndEstablishSocketConnection()
        binding.viewModel = viewModel
    }


    /**
     * Put live data observer here
     */
    private fun liveDataObserver() {

    }

    /**
     * Setting language
     */
    private fun setLanguage() {
        var myLocale = Locale(mLanguage)
        var dm = resources.displayMetrics
        var conf = resources.configuration
        conf.locale = myLocale
        resources.updateConfiguration(conf, dm)
    }
}