package es;

/* JADX INFO: loaded from: classes4.dex */
public final class y {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f53241c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final y f53242d = new y(null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a0 f53243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private v f53244b;

    public static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        private a() {
        }
    }

    public y(a0 a0Var, v vVar) {
        this.f53243a = a0Var;
        this.f53244b = vVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f53243a == yVar.f53243a && fr.t.c(this.f53244b, yVar.f53244b);
    }

    public int hashCode() {
        a0 a0Var = this.f53243a;
        int iHashCode = (a0Var == null ? 0 : a0Var.hashCode()) * 31;
        v vVar = this.f53244b;
        return iHashCode + (vVar != null ? vVar.hashCode() : 0);
    }

    public String toString() {
        return "KmTypeProjection(variance=" + this.f53243a + ", type=" + this.f53244b + ')';
    }
}
