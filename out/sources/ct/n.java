package ct;

import pq.e1;
import st.d2;
import st.t0;
import vr.l1;
import vr.t1;

/* JADX INFO: loaded from: classes4.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f37659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n f37660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n f37661c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final n f37662d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final n f37663e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final n f37664f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final n f37665g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final n f37666h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final n f37667i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final n f37668j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final n f37669k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final n f37670l;

    public static final class a {

        /* JADX INFO: renamed from: ct.n$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0793a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f37671a;

            static {
                int[] iArr = new int[vr.f.values().length];
                try {
                    iArr[vr.f.CLASS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[vr.f.INTERFACE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[vr.f.ENUM_CLASS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[vr.f.OBJECT.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[vr.f.ANNOTATION_CLASS.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[vr.f.ENUM_ENTRY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                f37671a = iArr;
            }
        }

        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        public final String a(vr.i iVar) {
            if (iVar instanceof l1) {
                return "typealias";
            }
            if (!(iVar instanceof vr.e)) {
                throw new AssertionError("Unexpected classifier: " + iVar);
            }
            vr.e eVar = (vr.e) iVar;
            if (eVar.e0()) {
                return "companion object";
            }
            switch (C0793a.f37671a[eVar.k().ordinal()]) {
                case 1:
                    return "class";
                case 2:
                    return "interface";
                case 3:
                    return "enum class";
                case 4:
                    return "object";
                case 5:
                    return "annotation class";
                case 6:
                    return "enum entry";
                default:
                    throw new oq.p();
            }
        }

        public final n b(er.l<? super y, oq.i0> lVar) {
            b0 b0Var = new b0();
            lVar.b(b0Var);
            b0Var.q0();
            return new w(b0Var);
        }

        private a() {
        }
    }

    public interface b {

        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f37672a = new a();

            private a() {
            }

            @Override // ct.n.b
            public void a(t1 t1Var, int i15, int i16, StringBuilder sb5) {
            }

            @Override // ct.n.b
            public void b(int i15, StringBuilder sb5) {
                sb5.append("(");
            }

            @Override // ct.n.b
            public void c(int i15, StringBuilder sb5) {
                sb5.append(")");
            }

            @Override // ct.n.b
            public void d(t1 t1Var, int i15, int i16, StringBuilder sb5) {
                if (i15 != i16 - 1) {
                    sb5.append(", ");
                }
            }
        }

        void a(t1 t1Var, int i15, int i16, StringBuilder sb5);

        void b(int i15, StringBuilder sb5);

        void c(int i15, StringBuilder sb5);

        void d(t1 t1Var, int i15, int i16, StringBuilder sb5);
    }

    static {
        a aVar = new a(null);
        f37659a = aVar;
        f37660b = aVar.b(c.f37625a);
        f37661c = aVar.b(e.f37630a);
        f37662d = aVar.b(f.f37636a);
        f37663e = aVar.b(g.f37642a);
        f37664f = aVar.b(h.f37648a);
        f37665g = aVar.b(i.f37653a);
        f37666h = aVar.b(j.f37655a);
        f37667i = aVar.b(k.f37656a);
        f37668j = aVar.b(l.f37657a);
        f37669k = aVar.b(m.f37658a);
        f37670l = aVar.b(d.f37628a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 A(y yVar) {
        yVar.l(e1.e());
        return oq.i0.f148189a;
    }

    public static /* synthetic */ String O(n nVar, wr.c cVar, wr.e eVar, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: renderAnnotation");
        }
        if ((i15 & 2) != 0) {
            eVar = null;
        }
        return nVar.N(cVar, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 q(y yVar) {
        yVar.c(false);
        yVar.l(e1.e());
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 r(y yVar) {
        yVar.c(false);
        yVar.l(e1.e());
        yVar.e(true);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 s(y yVar) {
        yVar.c(false);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 t(y yVar) {
        yVar.l(e1.e());
        yVar.g(ct.b.C0792b.f37596a);
        yVar.o(f0.ONLY_NON_SYNTHESIZED);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 u(y yVar) {
        yVar.m(true);
        yVar.g(ct.b.a.f37595a);
        yVar.l(x.f37691d);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 v(y yVar) {
        yVar.l(x.f37690c);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 w(y yVar) {
        yVar.l(x.f37691d);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 x(y yVar) {
        yVar.a(h0.HTML);
        yVar.l(x.f37691d);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 y(y yVar) {
        yVar.c(false);
        yVar.l(e1.e());
        yVar.g(ct.b.C0792b.f37596a);
        yVar.p(true);
        yVar.o(f0.NONE);
        yVar.f(true);
        yVar.n(true);
        yVar.e(true);
        yVar.b(true);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 z(y yVar) {
        yVar.g(ct.b.C0792b.f37596a);
        yVar.o(f0.ONLY_NON_SYNTHESIZED);
        return oq.i0.f148189a;
    }

    public abstract String M(vr.m mVar);

    public abstract String N(wr.c cVar, wr.e eVar);

    public abstract String P(String str, String str2, sr.j jVar);

    public abstract String Q(zs.d dVar);

    public abstract String R(zs.f fVar, boolean z15);

    public abstract String S(t0 t0Var);

    public abstract String T(d2 d2Var);

    public final n U(er.l<? super y, oq.i0> lVar) {
        b0 b0VarS = ((w) this).N0().s();
        lVar.b(b0VarS);
        b0VarS.q0();
        return new w(b0VarS);
    }
}
