package ss;

/* JADX INFO: loaded from: classes4.dex */
public final class a0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f183823b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f183824a;

    public static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        public final a0 a(String str, String str2) {
            return new a0(str + '#' + str2, null);
        }

        public final a0 b(ys.d dVar) {
            if (dVar instanceof ys.d.b) {
                ys.d.b bVar = (ys.d.b) dVar;
                return d(bVar.e(), bVar.d());
            }
            if (!(dVar instanceof ys.d.a)) {
                throw new oq.p();
            }
            ys.d.a aVar = (ys.d.a) dVar;
            return a(aVar.e(), aVar.d());
        }

        public final a0 c(ws.d dVar, xs.a.c cVar) {
            return d(dVar.getString(cVar.B()), dVar.getString(cVar.A()));
        }

        public final a0 d(String str, String str2) {
            return new a0(str + str2, null);
        }

        public final a0 e(a0 a0Var, int i15) {
            return new a0(a0Var.a() + '@' + i15, null);
        }

        private a() {
        }
    }

    public /* synthetic */ a0(String str, fr.k kVar) {
        this(str);
    }

    public final String a() {
        return this.f183824a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0) && fr.t.c(this.f183824a, ((a0) obj).f183824a);
    }

    public int hashCode() {
        return this.f183824a.hashCode();
    }

    public String toString() {
        return "MemberSignature(signature=" + this.f183824a + ')';
    }

    private a0(String str) {
        this.f183824a = str;
    }
}
