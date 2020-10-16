package com.tab.mybadges.ui.userList

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.tab.mybadges.R
import com.tab.mybadges.entities.User

class UserListAdapter (
    private var userList: ArrayList<User>,
    private val layout: Int
) : RecyclerView.Adapter<UserListAdapter.ViewHolder>() {

    private lateinit var context: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(layout, parent, false)
        context = parent.context
        val viewHolder: ViewHolder = ViewHolder(view)

        return viewHolder
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(userList.get(position))
    }

    fun setUserList(list: List<User>) {
        userList.clear()
        userList.addAll(list)
        notifyDataSetChanged()
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private var userImage: ImageView = itemView.findViewById(R.id.user_photo)
        private var userName: TextView = itemView.findViewById(R.id.user_name)
        private var projectName: TextView = itemView.findViewById(R.id.project_name)

        fun bind (user: User) {
            userImage.setImageResource(user.userPhoto)
            userName.setText(user.userName)
            projectName.setText(user.projectName)
        }
    }
}