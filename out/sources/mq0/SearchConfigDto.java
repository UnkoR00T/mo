package mq0;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: mq0.y, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0016\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0004¨\u0006\u0017"}, d2 = {"Lmq0/y;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "Lmq0/x;", "a", "Ljava/util/List;", "()Ljava/util/List;", "news", "b", "popular", "c", "Ljava/lang/String;", "searchTagsChecksum", "mobilesettingsservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SearchConfigDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("news")
    private final List<SearchConfigDocumentOrService> news;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("popular")
    private final List<SearchConfigDocumentOrService> popular;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("searchTagsChecksum")
    private final String searchTagsChecksum;

    public final List<SearchConfigDocumentOrService> a() {
        return this.news;
    }

    public final List<SearchConfigDocumentOrService> b() {
        return this.popular;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getSearchTagsChecksum() {
        return this.searchTagsChecksum;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchConfigDto)) {
            return false;
        }
        SearchConfigDto searchConfigDto = (SearchConfigDto) other;
        return fr.t.c(this.news, searchConfigDto.news) && fr.t.c(this.popular, searchConfigDto.popular) && fr.t.c(this.searchTagsChecksum, searchConfigDto.searchTagsChecksum);
    }

    public int hashCode() {
        return (((this.news.hashCode() * 31) + this.popular.hashCode()) * 31) + this.searchTagsChecksum.hashCode();
    }

    public String toString() {
        return "SearchConfigDto(news=" + this.news + ", popular=" + this.popular + ", searchTagsChecksum=" + this.searchTagsChecksum + ')';
    }
}
