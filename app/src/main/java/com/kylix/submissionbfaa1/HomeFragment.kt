package com.kylix.submissionbfaa1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.kylix.submissionbfaa1.data.DataDummy

class HomeFragment : Fragment() {

    //TODO 3: Buat view binding pada Home Fragment

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //TODO 4: Ubah return menjadi view binding
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val userAdapter = UserAdapter()
        activity?.let { DataDummy.getAllUsers(it) }?.let { userAdapter.setAllData(it) }

        val rvUserList = view.findViewById<RecyclerView>(R.id.rv_user_list)
        rvUserList.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
            adapter = userAdapter
        }
    }
}