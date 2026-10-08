package rs;

/* JADX INFO: loaded from: classes4.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f175680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f175681b;

    public m(l lVar, boolean z15) {
        this.f175680a = lVar;
        this.f175681b = z15;
    }

    public static /* synthetic */ m b(m mVar, l lVar, boolean z15, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            lVar = mVar.f175680a;
        }
        if ((i15 & 2) != 0) {
            z15 = mVar.f175681b;
        }
        return mVar.a(lVar, z15);
    }

    public final m a(l lVar, boolean z15) {
        return new m(lVar, z15);
    }

    public final l c() {
        return this.f175680a;
    }

    public final boolean d() {
        return this.f175681b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f175680a == mVar.f175680a && this.f175681b == mVar.f175681b;
    }

    public int hashCode() {
        return (this.f175680a.hashCode() * 31) + Boolean.hashCode(this.f175681b);
    }

    public String toString() {
        return "NullabilityQualifierWithMigrationStatus(qualifier=" + this.f175680a + ", isForWarningOnly=" + this.f175681b + ')';
    }

    public /* synthetic */ m(l lVar, boolean z15, int i15, fr.k kVar) {
        this(lVar, (i15 & 2) != 0 ? false : z15);
    }
}
