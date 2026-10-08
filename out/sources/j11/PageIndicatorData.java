package j11;

import fr.t;
import k40.EmptyStateData;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: j11.a, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0011\u0010\u0016¨\u0006\u0017"}, d2 = {"Lj11/a;", "", "", "isLoading", "Lk40/a;", "emptyStateMData", "<init>", "(ZLk40/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "()Z", "Lk40/a;", "()Lk40/a;", "cases_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PageIndicatorData {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f98519c = EmptyStateData.f108236d;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoading;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final EmptyStateData emptyStateMData;

    public PageIndicatorData(boolean z15, EmptyStateData emptyStateData) {
        this.isLoading = z15;
        this.emptyStateMData = emptyStateData;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final EmptyStateData getEmptyStateMData() {
        return this.emptyStateMData;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PageIndicatorData)) {
            return false;
        }
        PageIndicatorData pageIndicatorData = (PageIndicatorData) other;
        return this.isLoading == pageIndicatorData.isLoading && t.c(this.emptyStateMData, pageIndicatorData.emptyStateMData);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isLoading) * 31;
        EmptyStateData emptyStateData = this.emptyStateMData;
        return iHashCode + (emptyStateData == null ? 0 : emptyStateData.hashCode());
    }

    public String toString() {
        return "PageIndicatorData(isLoading=" + this.isLoading + ", emptyStateMData=" + this.emptyStateMData + ')';
    }
}
