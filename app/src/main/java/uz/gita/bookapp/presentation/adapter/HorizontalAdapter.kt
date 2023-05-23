package uz.gita.bookapp.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import uz.gita.bookapp.data.model.BookData
import uz.gita.bookapp.databinding.ItemBookBinding

class HorizontalAdapter : ListAdapter<BookData, HorizontalAdapter.ViewHolder>(MyDiffUtil) {

    object MyDiffUtil : DiffUtil.ItemCallback<BookData>() {
        override fun areItemsTheSame(oldItem: BookData, newItem: BookData): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: BookData, newItem: BookData): Boolean {
            return oldItem == newItem
        }
    }

    private var clickListener: ((BookData) -> Unit) ?= null

    fun setClickListener(block: (BookData) -> Unit ) {
        clickListener = block
    }

    inner class ViewHolder(private val binding: ItemBookBinding) : RecyclerView.ViewHolder(binding.root) {

        init {
            binding.linearLayout.setOnClickListener {
                clickListener?.invoke(getItem(adapterPosition))
            }
        }

        fun bind(data: BookData) = with(binding) {
            bookTitle.text = data.title
            bookAuthor.text = "By ${data.author}"
            Glide
                .with(root.context)
                .load(data.coverUrl)
                .centerCrop()
                .into(bookCoverImage)

            Unit
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
        ViewHolder(ItemBookBinding.inflate(LayoutInflater.from(parent.context), parent, false))

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        getItem(position)?.let { holder.bind(it) }
    }
}
