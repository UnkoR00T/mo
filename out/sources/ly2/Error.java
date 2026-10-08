package ly2;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: ly2.e, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006\u001e"}, d2 = {"Lly2/e;", "", "Lly2/f$a;", "Lhb4/c;", "vmsAdapter", "Llv2/a;", "applicationOwner", "", "isIdentityPhotoFeatureEnabled", "<init>", "(Lhb4/c;Llv2/a;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lhb4/c;", "()Lhb4/c;", "b", "Llv2/a;", "getApplicationOwner", "()Llv2/a;", "c", "Z", "()Z", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Error implements f.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final hb4.c vmsAdapter;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final lv2.a applicationOwner;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isIdentityPhotoFeatureEnabled;

    public Error(hb4.c cVar, lv2.a aVar, boolean z15) {
        this.vmsAdapter = cVar;
        this.applicationOwner = aVar;
        this.isIdentityPhotoFeatureEnabled = z15;
    }

    @Override // ly2.f.a
    /* JADX INFO: renamed from: a, reason: from getter */
    public hb4.c getVmsAdapter() {
        return this.vmsAdapter;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsIdentityPhotoFeatureEnabled() {
        return this.isIdentityPhotoFeatureEnabled;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Error)) {
            return false;
        }
        Error error = (Error) other;
        return fr.t.c(this.vmsAdapter, error.vmsAdapter) && this.applicationOwner == error.applicationOwner && this.isIdentityPhotoFeatureEnabled == error.isIdentityPhotoFeatureEnabled;
    }

    public int hashCode() {
        return (((this.vmsAdapter.hashCode() * 31) + this.applicationOwner.hashCode()) * 31) + Boolean.hashCode(this.isIdentityPhotoFeatureEnabled);
    }

    public String toString() {
        return "Error(vmsAdapter=" + this.vmsAdapter + ", applicationOwner=" + this.applicationOwner + ", isIdentityPhotoFeatureEnabled=" + this.isIdentityPhotoFeatureEnabled + ')';
    }
}
