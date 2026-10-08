package st;

import java.util.ArrayDeque;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f184148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f184149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f184150c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f184151d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final wt.s f184152e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final r f184153f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final s f184154g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f184155h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f184156i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ArrayDeque<wt.j> f184157j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Set<wt.j> f184158k;

    public interface a {

        /* JADX INFO: renamed from: st.w1$a$a, reason: collision with other inner class name */
        public static final class C4745a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private boolean f184159a;

            @Override // st.w1.a
            public void a(er.a<Boolean> aVar) {
                if (this.f184159a) {
                    return;
                }
                this.f184159a = aVar.a().booleanValue();
            }

            public final boolean b() {
                return this.f184159a;
            }
        }

        void a(er.a<Boolean> aVar);
    }

    public enum b {
        CHECK_ONLY_LOWER,
        CHECK_SUBTYPE_AND_LOWER,
        SKIP_LOWER;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ wq.a f184164e = wq.b.a(b());
    }

    public static abstract class c {

        public static abstract class a extends c {
            public a() {
                super(null);
            }
        }

        public static final class b extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f184165a = new b();

            private b() {
                super(null);
            }

            @Override // st.w1.c
            public wt.j a(w1 w1Var, wt.i iVar) {
                return w1Var.j().N0(iVar);
            }
        }

        /* JADX INFO: renamed from: st.w1$c$c, reason: collision with other inner class name */
        public static final class C4746c extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C4746c f184166a = new C4746c();

            private C4746c() {
                super(null);
            }

            @Override // st.w1.c
            public /* bridge */ /* synthetic */ wt.j a(w1 w1Var, wt.i iVar) {
                return (wt.j) b(w1Var, iVar);
            }

            public Void b(w1 w1Var, wt.i iVar) {
                throw new UnsupportedOperationException("Should not be called");
            }
        }

        public static final class d extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f184167a = new d();

            private d() {
                super(null);
            }

            @Override // st.w1.c
            public wt.j a(w1 w1Var, wt.i iVar) {
                return w1Var.j().F(iVar);
            }
        }

        public /* synthetic */ c(fr.k kVar) {
            this();
        }

        public abstract wt.j a(w1 w1Var, wt.i iVar);

        private c() {
        }
    }

    public w1(boolean z15, boolean z16, boolean z17, boolean z18, wt.s sVar, r rVar, s sVar2) {
        this.f184148a = z15;
        this.f184149b = z16;
        this.f184150c = z17;
        this.f184151d = z18;
        this.f184152e = sVar;
        this.f184153f = rVar;
        this.f184154g = sVar2;
    }

    public static /* synthetic */ Boolean d(w1 w1Var, wt.i iVar, wt.i iVar2, boolean z15, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addSubtypeConstraint");
        }
        if ((i15 & 4) != 0) {
            z15 = false;
        }
        return w1Var.c(iVar, iVar2, z15);
    }

    public Boolean c(wt.i iVar, wt.i iVar2, boolean z15) {
        return null;
    }

    public final void e() {
        this.f184157j.clear();
        this.f184158k.clear();
        this.f184156i = false;
    }

    public boolean f(wt.i iVar, wt.i iVar2) {
        return true;
    }

    public b g(wt.j jVar, wt.d dVar) {
        return b.CHECK_SUBTYPE_AND_LOWER;
    }

    public final ArrayDeque<wt.j> h() {
        return this.f184157j;
    }

    public final Set<wt.j> i() {
        return this.f184158k;
    }

    public final wt.s j() {
        return this.f184152e;
    }

    public final void k() {
        this.f184156i = true;
        if (this.f184157j == null) {
            this.f184157j = new ArrayDeque<>(4);
        }
        if (this.f184158k == null) {
            this.f184158k = cu.k.f37890c.a();
        }
    }

    public final boolean l(wt.i iVar) {
        return this.f184151d && this.f184152e.E(iVar);
    }

    public final boolean m() {
        return this.f184150c;
    }

    public final boolean n() {
        return this.f184148a;
    }

    public final boolean o() {
        return this.f184149b;
    }

    public final wt.i p(wt.i iVar) {
        return this.f184153f.a(iVar);
    }

    public final wt.i q(wt.i iVar) {
        return this.f184154g.a(iVar);
    }

    public boolean r(er.l<? super a, oq.i0> lVar) {
        a.C4745a c4745a = new a.C4745a();
        lVar.b(c4745a);
        return c4745a.b();
    }
}
