package js;

/* JADX INFO: loaded from: classes4.dex */
public final class c0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f104627d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final c0 f104628e = new c0(p0.STRICT, null, null, 6, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p0 f104629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final oq.i f104630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p0 f104631c;

    public static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        public final c0 a() {
            return c0.f104628e;
        }

        private a() {
        }
    }

    public c0(p0 p0Var, oq.i iVar, p0 p0Var2) {
        this.f104629a = p0Var;
        this.f104630b = iVar;
        this.f104631c = p0Var2;
    }

    public final p0 b() {
        return this.f104631c;
    }

    public final p0 c() {
        return this.f104629a;
    }

    public final oq.i d() {
        return this.f104630b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return this.f104629a == c0Var.f104629a && fr.t.c(this.f104630b, c0Var.f104630b) && this.f104631c == c0Var.f104631c;
    }

    public int hashCode() {
        int iHashCode = this.f104629a.hashCode() * 31;
        oq.i iVar = this.f104630b;
        return ((iHashCode + (iVar == null ? 0 : iVar.getVersion())) * 31) + this.f104631c.hashCode();
    }

    public String toString() {
        return "JavaNullabilityAnnotationsStatus(reportLevelBefore=" + this.f104629a + ", sinceVersion=" + this.f104630b + ", reportLevelAfter=" + this.f104631c + ')';
    }

    public /* synthetic */ c0(p0 p0Var, oq.i iVar, p0 p0Var2, int i15, fr.k kVar) {
        this(p0Var, (i15 & 2) != 0 ? new oq.i(1, 0) : iVar, (i15 & 4) != 0 ? p0Var : p0Var2);
    }
}
