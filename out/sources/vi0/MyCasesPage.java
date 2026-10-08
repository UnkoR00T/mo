package vi0;

import fr.t;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: vi0.d, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\f¨\u0006\u001b"}, d2 = {"Lvi0/d;", "", "", "Lvi0/b;", "myCases", "", "last", "", "nextPageId", "<init>", "(Ljava/util/List;ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "Z", "()Z", "c", "Ljava/lang/String;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MyCasesPage {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<MyCase> myCases;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean last;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String nextPageId;

    public MyCasesPage(List<MyCase> list, boolean z15, String str) {
        this.myCases = list;
        this.last = z15;
        this.nextPageId = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getLast() {
        return this.last;
    }

    public final List<MyCase> b() {
        return this.myCases;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getNextPageId() {
        return this.nextPageId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MyCasesPage)) {
            return false;
        }
        MyCasesPage myCasesPage = (MyCasesPage) other;
        return t.c(this.myCases, myCasesPage.myCases) && this.last == myCasesPage.last && t.c(this.nextPageId, myCasesPage.nextPageId);
    }

    public int hashCode() {
        int iHashCode = ((this.myCases.hashCode() * 31) + Boolean.hashCode(this.last)) * 31;
        String str = this.nextPageId;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "MyCasesPage(myCases=" + this.myCases + ", last=" + this.last + ", nextPageId=" + this.nextPageId + ")";
    }
}
