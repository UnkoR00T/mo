package tt2;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: tt2.a, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0011\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, d2 = {"Ltt2/a;", "", "", "shouldRefresh", "shouldShowUnrestrictedSnackbar", "<init>", "(ZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "peselrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PeselUnrestrictNavParam {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean shouldRefresh;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean shouldShowUnrestrictedSnackbar;

    public PeselUnrestrictNavParam(boolean z15, boolean z16) {
        this.shouldRefresh = z15;
        this.shouldShowUnrestrictedSnackbar = z16;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getShouldRefresh() {
        return this.shouldRefresh;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getShouldShowUnrestrictedSnackbar() {
        return this.shouldShowUnrestrictedSnackbar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PeselUnrestrictNavParam)) {
            return false;
        }
        PeselUnrestrictNavParam peselUnrestrictNavParam = (PeselUnrestrictNavParam) other;
        return this.shouldRefresh == peselUnrestrictNavParam.shouldRefresh && this.shouldShowUnrestrictedSnackbar == peselUnrestrictNavParam.shouldShowUnrestrictedSnackbar;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.shouldRefresh) * 31) + Boolean.hashCode(this.shouldShowUnrestrictedSnackbar);
    }

    public String toString() {
        return "PeselUnrestrictNavParam(shouldRefresh=" + this.shouldRefresh + ", shouldShowUnrestrictedSnackbar=" + this.shouldShowUnrestrictedSnackbar + ')';
    }
}
