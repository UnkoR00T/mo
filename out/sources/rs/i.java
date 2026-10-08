package rs;

/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f175656e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final i f175657f = new i(null, null, false, false, 8, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f175658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j f175659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f175660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f175661d;

    public static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        public final i a() {
            return i.f175657f;
        }

        private a() {
        }
    }

    public i(l lVar, j jVar, boolean z15, boolean z16) {
        this.f175658a = lVar;
        this.f175659b = jVar;
        this.f175660c = z15;
        this.f175661d = z16;
    }

    public static /* synthetic */ i c(i iVar, l lVar, j jVar, boolean z15, boolean z16, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            lVar = iVar.f175658a;
        }
        if ((i15 & 2) != 0) {
            jVar = iVar.f175659b;
        }
        if ((i15 & 4) != 0) {
            z15 = iVar.f175660c;
        }
        if ((i15 & 8) != 0) {
            z16 = iVar.f175661d;
        }
        return iVar.b(lVar, jVar, z15, z16);
    }

    public final i b(l lVar, j jVar, boolean z15, boolean z16) {
        return new i(lVar, jVar, z15, z16);
    }

    public final boolean d() {
        return this.f175660c;
    }

    public final j e() {
        return this.f175659b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f175658a == iVar.f175658a && this.f175659b == iVar.f175659b && this.f175660c == iVar.f175660c && this.f175661d == iVar.f175661d;
    }

    public final l f() {
        return this.f175658a;
    }

    public final boolean g() {
        return this.f175661d;
    }

    public int hashCode() {
        l lVar = this.f175658a;
        int iHashCode = (lVar == null ? 0 : lVar.hashCode()) * 31;
        j jVar = this.f175659b;
        return ((((iHashCode + (jVar != null ? jVar.hashCode() : 0)) * 31) + Boolean.hashCode(this.f175660c)) * 31) + Boolean.hashCode(this.f175661d);
    }

    public String toString() {
        return "JavaTypeQualifiers(nullability=" + this.f175658a + ", mutability=" + this.f175659b + ", definitelyNotNull=" + this.f175660c + ", isNullabilityQualifierForWarning=" + this.f175661d + ')';
    }

    public /* synthetic */ i(l lVar, j jVar, boolean z15, boolean z16, int i15, fr.k kVar) {
        this(lVar, jVar, z15, (i15 & 8) != 0 ? false : z16);
    }
}
