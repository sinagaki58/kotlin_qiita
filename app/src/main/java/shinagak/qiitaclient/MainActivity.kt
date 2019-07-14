package shinagak.qiitaclient

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ListView
import shinagak.qiitaclient.model.Article
import shinagak.qiitaclient.model.User

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val listAdapter = ArticleListAdapter(applicationContext)
        listAdapter.articles = listOf(
            dummyArticle("kotlin入門", "taro"),
            dummyArticle("java入門", "jiro")
        )

        val listView: ListView = findViewById(R.id.list_view) as ListView
        listView.adapter = listAdapter
        listView.setOnItemClickListener { adapterView, view, position, id ->
            val article = listAdapter.articles[position]
            ArticleActivity.intent(this, article).let { startActivity(it) }
        }
    }

    private fun dummyArticle(title: String, userName: String): Article =
        Article(
            id = "",
            title = title,
            url = "http://www.example.com/articles/123",
            user = User(id = "", name = userName, profileImageUrl = "")
        )

}
