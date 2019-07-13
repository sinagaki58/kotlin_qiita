package shinagak.qiitaclient

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import shinagak.qiitaclient.model.Article
import shinagak.qiitaclient.model.User
import shinagak.qiitaclient.view.ArticleView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val articleView = ArticleView(applicationContext)
        articleView.setArticle(
            Article(id = "123",
            title = "Kotlin入門",
            url = "http://www.example.com/articles/123",
            user = User(id = "456", name = "たろう", profileImageUrl = "")
            )
        )

        setContentView(articleView)
    }
}
