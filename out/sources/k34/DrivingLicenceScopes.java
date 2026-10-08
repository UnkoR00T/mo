package k34;

import java.util.List;
import jr0.DrivingLicenceScope;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: k34.p, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\rJ\r\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\rJF\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lk34/p;", "", "Ljr0/d;", "drivingLicence", "activeTemporaryDrivingLicence", "", "invalidatedTemporaryDrivingLicences", "Liy/b0;", "picture", "<init>", "(Ljr0/d;Ljr0/d;Ljava/util/List;Liy/b0;)V", "", "h", "()Z", "g", "i", "a", "(Ljr0/d;Ljr0/d;Ljava/util/List;Liy/b0;)Lk34/p;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljr0/d;", "d", "()Ljr0/d;", "b", "c", "Ljava/util/List;", "e", "()Ljava/util/List;", "Liy/b0;", "f", "()Liy/b0;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DrivingLicenceScopes {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final DrivingLicenceScope drivingLicence;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final DrivingLicenceScope activeTemporaryDrivingLicence;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<DrivingLicenceScope> invalidatedTemporaryDrivingLicences;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.b0 picture;

    public DrivingLicenceScopes(DrivingLicenceScope drivingLicenceScope, DrivingLicenceScope drivingLicenceScope2, List<DrivingLicenceScope> list, iy.b0 b0Var) {
        this.drivingLicence = drivingLicenceScope;
        this.activeTemporaryDrivingLicence = drivingLicenceScope2;
        this.invalidatedTemporaryDrivingLicences = list;
        this.picture = b0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DrivingLicenceScopes b(DrivingLicenceScopes drivingLicenceScopes, DrivingLicenceScope drivingLicenceScope, DrivingLicenceScope drivingLicenceScope2, List list, iy.b0 b0Var, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            drivingLicenceScope = drivingLicenceScopes.drivingLicence;
        }
        if ((i15 & 2) != 0) {
            drivingLicenceScope2 = drivingLicenceScopes.activeTemporaryDrivingLicence;
        }
        if ((i15 & 4) != 0) {
            list = drivingLicenceScopes.invalidatedTemporaryDrivingLicences;
        }
        if ((i15 & 8) != 0) {
            b0Var = drivingLicenceScopes.picture;
        }
        return drivingLicenceScopes.a(drivingLicenceScope, drivingLicenceScope2, list, b0Var);
    }

    public final DrivingLicenceScopes a(DrivingLicenceScope drivingLicence, DrivingLicenceScope activeTemporaryDrivingLicence, List<DrivingLicenceScope> invalidatedTemporaryDrivingLicences, iy.b0 picture) {
        return new DrivingLicenceScopes(drivingLicence, activeTemporaryDrivingLicence, invalidatedTemporaryDrivingLicences, picture);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final DrivingLicenceScope getActiveTemporaryDrivingLicence() {
        return this.activeTemporaryDrivingLicence;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final DrivingLicenceScope getDrivingLicence() {
        return this.drivingLicence;
    }

    public final List<DrivingLicenceScope> e() {
        return this.invalidatedTemporaryDrivingLicences;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DrivingLicenceScopes)) {
            return false;
        }
        DrivingLicenceScopes drivingLicenceScopes = (DrivingLicenceScopes) other;
        return fr.t.c(this.drivingLicence, drivingLicenceScopes.drivingLicence) && fr.t.c(this.activeTemporaryDrivingLicence, drivingLicenceScopes.activeTemporaryDrivingLicence) && fr.t.c(this.invalidatedTemporaryDrivingLicences, drivingLicenceScopes.invalidatedTemporaryDrivingLicences) && fr.t.c(this.picture, drivingLicenceScopes.picture);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final iy.b0 getPicture() {
        return this.picture;
    }

    public final boolean g() {
        return this.activeTemporaryDrivingLicence != null;
    }

    public final boolean h() {
        return this.drivingLicence != null;
    }

    public int hashCode() {
        DrivingLicenceScope drivingLicenceScope = this.drivingLicence;
        int iHashCode = (drivingLicenceScope == null ? 0 : drivingLicenceScope.hashCode()) * 31;
        DrivingLicenceScope drivingLicenceScope2 = this.activeTemporaryDrivingLicence;
        int iHashCode2 = (iHashCode + (drivingLicenceScope2 == null ? 0 : drivingLicenceScope2.hashCode())) * 31;
        List<DrivingLicenceScope> list = this.invalidatedTemporaryDrivingLicences;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        iy.b0 b0Var = this.picture;
        return iHashCode3 + (b0Var != null ? b0Var.hashCode() : 0);
    }

    public final boolean i() {
        List<DrivingLicenceScope> list = this.invalidatedTemporaryDrivingLicences;
        if (list != null) {
            return !list.isEmpty();
        }
        return false;
    }

    public String toString() {
        return "DrivingLicenceScopes(drivingLicence=" + this.drivingLicence + ", activeTemporaryDrivingLicence=" + this.activeTemporaryDrivingLicence + ", invalidatedTemporaryDrivingLicences=" + this.invalidatedTemporaryDrivingLicences + ", picture=" + this.picture + ")";
    }
}
