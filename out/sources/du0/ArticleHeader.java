package du0;

import fr.t;
import java.time.OffsetDateTime;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: du0.c, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001a"}, d2 = {"Ldu0/c;", "", "", "category", "picture", "Ljava/time/OffsetDateTime;", "publishedFrom", "title", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/time/OffsetDateTime;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Ljava/time/OffsetDateTime;", "()Ljava/time/OffsetDateTime;", "d", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ArticleHeader {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String category;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String picture;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final OffsetDateTime publishedFrom;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    public ArticleHeader(String str, String str2, OffsetDateTime offsetDateTime, String str3) {
        this.category = str;
        this.picture = str2;
        this.publishedFrom = offsetDateTime;
        this.title = str3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getPicture() {
        return this.picture;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final OffsetDateTime getPublishedFrom() {
        return this.publishedFrom;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ArticleHeader)) {
            return false;
        }
        ArticleHeader articleHeader = (ArticleHeader) other;
        return t.c(this.category, articleHeader.category) && t.c(this.picture, articleHeader.picture) && t.c(this.publishedFrom, articleHeader.publishedFrom) && t.c(this.title, articleHeader.title);
    }

    public int hashCode() {
        int iHashCode = ((this.category.hashCode() * 31) + this.picture.hashCode()) * 31;
        OffsetDateTime offsetDateTime = this.publishedFrom;
        return ((iHashCode + (offsetDateTime == null ? 0 : offsetDateTime.hashCode())) * 31) + this.title.hashCode();
    }

    public String toString() {
        return "ArticleHeader(category=" + this.category + ", picture=" + this.picture + ", publishedFrom=" + this.publishedFrom + ", title=" + this.title + ")";
    }
}
