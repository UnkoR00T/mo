package ly2;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: ly2.d, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lly2/d;", "", "Lly2/f$d;", "Llv2/a;", "applicationOwner", "", "isIdentityPhotoFeatureEnabled", "<init>", "(Llv2/a;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Llv2/a;", "b", "()Llv2/a;", "Z", "c", "()Z", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Checking implements f.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final lv2.a applicationOwner;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isIdentityPhotoFeatureEnabled;

    public Checking(lv2.a aVar, boolean z15) {
        this.applicationOwner = aVar;
        this.isIdentityPhotoFeatureEnabled = z15;
    }

    @Override // ly2.f.d
    /* JADX INFO: renamed from: b, reason: from getter */
    public lv2.a getApplicationOwner() {
        return this.applicationOwner;
    }

    @Override // ly2.f.d
    /* JADX INFO: renamed from: c, reason: from getter */
    public boolean getIsIdentityPhotoFeatureEnabled() {
        return this.isIdentityPhotoFeatureEnabled;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Checking)) {
            return false;
        }
        Checking checking = (Checking) other;
        return this.applicationOwner == checking.applicationOwner && this.isIdentityPhotoFeatureEnabled == checking.isIdentityPhotoFeatureEnabled;
    }

    public int hashCode() {
        return (this.applicationOwner.hashCode() * 31) + Boolean.hashCode(this.isIdentityPhotoFeatureEnabled);
    }

    public String toString() {
        return "Checking(applicationOwner=" + this.applicationOwner + ", isIdentityPhotoFeatureEnabled=" + this.isIdentityPhotoFeatureEnabled + ')';
    }
}
