package ts0;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: ts0.j, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\n¨\u0006\u0017"}, d2 = {"Lts0/j;", "", "", "Lts0/g;", "items", "", "nextPageId", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Ljava/lang/String;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RestrictionChecksPage {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<RestrictionCheck> items;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String nextPageId;

    public RestrictionChecksPage(List<RestrictionCheck> list, String str) {
        this.items = list;
        this.nextPageId = str;
    }

    public final List<RestrictionCheck> a() {
        return this.items;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getNextPageId() {
        return this.nextPageId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RestrictionChecksPage)) {
            return false;
        }
        RestrictionChecksPage restrictionChecksPage = (RestrictionChecksPage) other;
        return fr.t.c(this.items, restrictionChecksPage.items) && fr.t.c(this.nextPageId, restrictionChecksPage.nextPageId);
    }

    public int hashCode() {
        int iHashCode = this.items.hashCode() * 31;
        String str = this.nextPageId;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "RestrictionChecksPage(items=" + this.items + ", nextPageId=" + this.nextPageId + ")";
    }
}
