package iu0;

import fr.t;
import java.time.OffsetDateTime;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: iu0.e, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\r\u001a\u0004\b\u000f\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0011\u0010\u0004R\u001a\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0014\u0010\u0004R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u001a"}, d2 = {"Liu0/e;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "articleId", "b", "category", "c", "picture", "d", "e", "title", "Ljava/time/OffsetDateTime;", "Ljava/time/OffsetDateTime;", "()Ljava/time/OffsetDateTime;", "publishedFrom", "securityincidentservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ArticleSummaryDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("articleId")
    private final String articleId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("category")
    private final String category;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("picture")
    private final String picture;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("title")
    private final String title;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("publishedFrom")
    private final OffsetDateTime publishedFrom;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getArticleId() {
        return this.articleId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getPicture() {
        return this.picture;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final OffsetDateTime getPublishedFrom() {
        return this.publishedFrom;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ArticleSummaryDto)) {
            return false;
        }
        ArticleSummaryDto articleSummaryDto = (ArticleSummaryDto) other;
        return t.c(this.articleId, articleSummaryDto.articleId) && t.c(this.category, articleSummaryDto.category) && t.c(this.picture, articleSummaryDto.picture) && t.c(this.title, articleSummaryDto.title) && t.c(this.publishedFrom, articleSummaryDto.publishedFrom);
    }

    public int hashCode() {
        int iHashCode = ((((((this.articleId.hashCode() * 31) + this.category.hashCode()) * 31) + this.picture.hashCode()) * 31) + this.title.hashCode()) * 31;
        OffsetDateTime offsetDateTime = this.publishedFrom;
        return iHashCode + (offsetDateTime == null ? 0 : offsetDateTime.hashCode());
    }

    public String toString() {
        return "ArticleSummaryDto(articleId=" + this.articleId + ", category=" + this.category + ", picture=" + this.picture + ", title=" + this.title + ", publishedFrom=" + this.publishedFrom + ')';
    }
}
