package iu0;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: iu0.b, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\r\u001a\u0004\b\u000f\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0011\u0010\u0004¨\u0006\u0013"}, d2 = {"Liu0/b;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "content", "b", "url", "c", "urlDescription", "securityincidentservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ArticleFooterDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("content")
    private final String content;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("url")
    private final String url;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("urlDescription")
    private final String urlDescription;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getUrlDescription() {
        return this.urlDescription;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ArticleFooterDto)) {
            return false;
        }
        ArticleFooterDto articleFooterDto = (ArticleFooterDto) other;
        return t.c(this.content, articleFooterDto.content) && t.c(this.url, articleFooterDto.url) && t.c(this.urlDescription, articleFooterDto.urlDescription);
    }

    public int hashCode() {
        return (((this.content.hashCode() * 31) + this.url.hashCode()) * 31) + this.urlDescription.hashCode();
    }

    public String toString() {
        return "ArticleFooterDto(content=" + this.content + ", url=" + this.url + ", urlDescription=" + this.urlDescription + ')';
    }
}
