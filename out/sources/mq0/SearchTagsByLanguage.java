package mq0;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: mq0.c0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0016"}, d2 = {"Lmq0/c0;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmq0/z;", "a", "Lmq0/z;", "()Lmq0/z;", "language", "", "b", "Ljava/util/List;", "()Ljava/util/List;", "tags", "mobilesettingsservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SearchTagsByLanguage {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("language")
    private final z language;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("tags")
    private final List<String> tags;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final z getLanguage() {
        return this.language;
    }

    public final List<String> b() {
        return this.tags;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchTagsByLanguage)) {
            return false;
        }
        SearchTagsByLanguage searchTagsByLanguage = (SearchTagsByLanguage) other;
        return this.language == searchTagsByLanguage.language && fr.t.c(this.tags, searchTagsByLanguage.tags);
    }

    public int hashCode() {
        return (this.language.hashCode() * 31) + this.tags.hashCode();
    }

    public String toString() {
        return "SearchTagsByLanguage(language=" + this.language + ", tags=" + this.tags + ')';
    }
}
