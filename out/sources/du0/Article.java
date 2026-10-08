package du0;

import fr.t;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: du0.a, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u0016\u0010\u001eR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0019\u0010!¨\u0006\""}, d2 = {"Ldu0/a;", "", "", "id", "Ldu0/c;", "header", "", "Ldu0/d;", "content", "Ldu0/b;", "footer", "<init>", "(Ljava/lang/String;Ldu0/c;Ljava/util/List;Ldu0/b;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "Ldu0/c;", "c", "()Ldu0/c;", "Ljava/util/List;", "()Ljava/util/List;", "d", "Ldu0/b;", "()Ldu0/b;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Article {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final ArticleHeader header;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<ArticleParagraph> content;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final ArticleFooter footer;

    public Article(String str, ArticleHeader articleHeader, List<ArticleParagraph> list, ArticleFooter articleFooter) {
        this.id = str;
        this.header = articleHeader;
        this.content = list;
        this.footer = articleFooter;
    }

    public final List<ArticleParagraph> a() {
        return this.content;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final ArticleFooter getFooter() {
        return this.footer;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final ArticleHeader getHeader() {
        return this.header;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Article)) {
            return false;
        }
        Article article = (Article) other;
        return t.c(this.id, article.id) && t.c(this.header, article.header) && t.c(this.content, article.content) && t.c(this.footer, article.footer);
    }

    public int hashCode() {
        int iHashCode = ((((this.id.hashCode() * 31) + this.header.hashCode()) * 31) + this.content.hashCode()) * 31;
        ArticleFooter articleFooter = this.footer;
        return iHashCode + (articleFooter == null ? 0 : articleFooter.hashCode());
    }

    public String toString() {
        return "Article(id=" + this.id + ", header=" + this.header + ", content=" + this.content + ", footer=" + this.footer + ")";
    }
}
