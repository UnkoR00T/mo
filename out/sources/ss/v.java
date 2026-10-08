package ss;

/* JADX INFO: loaded from: classes4.dex */
public interface v extends ot.a0 {

    public static abstract class a {

        /* JADX INFO: renamed from: ss.v$a$a, reason: collision with other inner class name */
        public static final class C4740a extends a {
            public final byte[] b() {
                throw null;
            }
        }

        public static final class b extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final x f183941a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final byte[] f183942b;

            public b(x xVar, byte[] bArr) {
                super(null);
                this.f183941a = xVar;
                this.f183942b = bArr;
            }

            public final x b() {
                return this.f183941a;
            }

            public /* synthetic */ b(x xVar, byte[] bArr, int i15, fr.k kVar) {
                this(xVar, (i15 & 2) != 0 ? null : bArr);
            }
        }

        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        public final x a() {
            b bVar = this instanceof b ? (b) this : null;
            if (bVar != null) {
                return bVar.b();
            }
            return null;
        }

        private a() {
        }
    }

    a b(zs.b bVar, ws.c cVar);

    a c(qs.g gVar, ws.c cVar);
}
