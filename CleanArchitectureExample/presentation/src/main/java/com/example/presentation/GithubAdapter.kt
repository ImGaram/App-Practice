package com.example.presentation

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.domain.githubexample.model.GithubRepo
import com.example.presentation.databinding.ItemGithubRepoBinding

class GithubAdapter: RecyclerView.Adapter<GithubAdapter.GithubViewHolder>() {

    private val items = mutableListOf<GithubRepo>()

    @SuppressLint("NotifyDataSetChanged")
    fun setItems(items: List<GithubRepo>) {
        this.items.clear()
        this.items.addAll(items)

        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GithubViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return GithubViewHolder(ItemGithubRepoBinding.inflate(layoutInflater))
    }

    override fun onBindViewHolder(holder: GithubViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int {
        return items.size
    }


    inner class GithubViewHolder(
        private val binding: ItemGithubRepoBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(repo: GithubRepo) {
            binding.repoName.text = repo.name
            binding.repoUrl.text = repo.url
        }
    }
}