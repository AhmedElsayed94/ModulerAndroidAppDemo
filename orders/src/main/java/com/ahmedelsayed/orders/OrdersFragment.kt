package com.ahmedelsayed.orders

import com.ahmedelsayed.library_base.fragment.BaseContainerFragment
import kotlinx.android.synthetic.main.fragment_orders.*


class OrdersFragment : BaseContainerFragment() {

    override val layoutResourceId = R.layout.fragment_orders

    override fun onResume() {
        super.onResume()
        fragmentAnimation.playAnimation()
    }
}
