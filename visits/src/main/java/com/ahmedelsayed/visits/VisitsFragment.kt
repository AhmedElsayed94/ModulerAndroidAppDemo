package com.ahmedelsayed.visits

import com.ahmedelsayed.library_base.fragment.BaseContainerFragment
import kotlinx.android.synthetic.main.fragment_visits.*


class VisitsFragment : BaseContainerFragment() {

    override val layoutResourceId = R.layout.fragment_visits

    override fun onResume() {
        super.onResume()
        fragmentAnimation.playAnimation()
    }
}
