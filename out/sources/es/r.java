package es;

/* JADX INFO: loaded from: classes4.dex */
public final class r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f53183c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private v f53184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f53185b;

    public static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        private a() {
        }
    }

    public r(v vVar, String str) {
        this.f53184a = vVar;
        this.f53185b = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return fr.t.c(this.f53184a, rVar.f53184a) && fr.t.c(this.f53185b, rVar.f53185b);
    }

    public int hashCode() {
        int iHashCode = this.f53184a.hashCode() * 31;
        String str = this.f53185b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "KmFlexibleTypeUpperBound(type=" + this.f53184a + ", typeFlexibilityId=" + this.f53185b + ')';
    }
}
