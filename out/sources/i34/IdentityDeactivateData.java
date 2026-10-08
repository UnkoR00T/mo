package i34;

import k34.u;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: i34.b, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ.\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001c\u0010\u001b¨\u0006\u001d"}, d2 = {"Li34/b;", "Ldx/b$d$a;", "Lk34/u;", "identityType", "", "clearData", "hasAnyCertActive", "<init>", "(Lk34/u;ZZ)V", "a", "(Lk34/u;ZZ)Li34/b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lk34/u;", "e", "()Lk34/u;", "b", "Z", "c", "()Z", "d", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class IdentityDeactivateData implements dx.b.Deactivate.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final u identityType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean clearData;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean hasAnyCertActive;

    public IdentityDeactivateData(u uVar, boolean z15, boolean z16) {
        this.identityType = uVar;
        this.clearData = z15;
        this.hasAnyCertActive = z16;
    }

    public static /* synthetic */ IdentityDeactivateData b(IdentityDeactivateData identityDeactivateData, u uVar, boolean z15, boolean z16, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            uVar = identityDeactivateData.identityType;
        }
        if ((i15 & 2) != 0) {
            z15 = identityDeactivateData.clearData;
        }
        if ((i15 & 4) != 0) {
            z16 = identityDeactivateData.hasAnyCertActive;
        }
        return identityDeactivateData.a(uVar, z15, z16);
    }

    public final IdentityDeactivateData a(u identityType, boolean clearData, boolean hasAnyCertActive) {
        return new IdentityDeactivateData(identityType, clearData, hasAnyCertActive);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getClearData() {
        return this.clearData;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getHasAnyCertActive() {
        return this.hasAnyCertActive;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final u getIdentityType() {
        return this.identityType;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IdentityDeactivateData)) {
            return false;
        }
        IdentityDeactivateData identityDeactivateData = (IdentityDeactivateData) other;
        return this.identityType == identityDeactivateData.identityType && this.clearData == identityDeactivateData.clearData && this.hasAnyCertActive == identityDeactivateData.hasAnyCertActive;
    }

    public int hashCode() {
        return (((this.identityType.hashCode() * 31) + Boolean.hashCode(this.clearData)) * 31) + Boolean.hashCode(this.hasAnyCertActive);
    }

    public String toString() {
        return "IdentityDeactivateData(identityType=" + this.identityType + ", clearData=" + this.clearData + ", hasAnyCertActive=" + this.hasAnyCertActive + ")";
    }
}
