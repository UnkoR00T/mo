package v;

import android.util.Range;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class n1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p1.a<Integer> f202707i = p1.a.a("camerax.core.captureConfig.rotation", Integer.TYPE);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final p1.a<Integer> f202708j = p1.a.a("camerax.core.captureConfig.jpegQuality", Integer.class);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final p1.a<Range<Integer>> f202709k = p1.a.a("camerax.core.captureConfig.resolvedFrameRate", Range.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final List<u1> f202710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final p1 f202711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f202712c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final boolean f202713d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final List<s> f202714e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f202715f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final t3 f202716g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final c0 f202717h;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Set<u1> f202718a = new HashSet();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private t2 f202719b = u2.l0();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f202720c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f202721d = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private List<s> f202722e = new ArrayList();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f202723f = false;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private w2 f202724g = w2.g();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private c0 f202725h;

        public static a i(w3<?> w3Var) {
            b bVarH = w3Var.H(null);
            if (bVarH != null) {
                a aVar = new a();
                bVarH.a(w3Var, aVar);
                return aVar;
            }
            throw new IllegalStateException("Implementation is missing option unpacker for " + w3Var.w(w3Var.toString()));
        }

        public void a(Collection<s> collection) {
            Iterator<s> it = collection.iterator();
            while (it.hasNext()) {
                c(it.next());
            }
        }

        public void b(t3 t3Var) {
            this.f202724g.f(t3Var);
        }

        public void c(s sVar) {
            if (this.f202722e.contains(sVar)) {
                return;
            }
            this.f202722e.add(sVar);
        }

        public <T> void d(p1.a<T> aVar, T t15) {
            this.f202719b.m(aVar, t15);
        }

        public void e(p1 p1Var) {
            for (p1.a<?> aVar : p1Var.b()) {
                Object objF = this.f202719b.f(aVar, null);
                Object objD = p1Var.d(aVar);
                if (objF instanceof s2) {
                    ((s2) objF).a(((s2) objD).c());
                } else {
                    if (objD instanceof s2) {
                        objD = ((s2) objD).clone();
                    }
                    this.f202719b.e0(aVar, p1Var.c(aVar), objD);
                }
            }
        }

        public void f(u1 u1Var) {
            this.f202718a.add(u1Var);
        }

        public void g(String str, Object obj) {
            this.f202724g.h(str, obj);
        }

        public n1 h() {
            return new n1(new ArrayList(this.f202718a), z2.k0(this.f202719b), this.f202720c, this.f202721d, new ArrayList(this.f202722e), this.f202723f, t3.c(this.f202724g), this.f202725h);
        }

        public Range<Integer> j() {
            return (Range) this.f202719b.f(n1.f202709k, n3.f202727a);
        }

        public Set<u1> k() {
            return this.f202718a;
        }

        public int l() {
            return this.f202720c;
        }

        public void m(Range<Integer> range) {
            d(n1.f202709k, range);
        }

        public void n(int i15) {
            this.f202724g.h("CAPTURE_CONFIG_ID_KEY", Integer.valueOf(i15));
        }

        public void o(p1 p1Var) {
            this.f202719b = u2.m0(p1Var);
        }

        public void p(boolean z15) {
            this.f202721d = z15;
        }

        public void q(int i15) {
            if (i15 != 0) {
                d(w3.M, Integer.valueOf(i15));
            }
        }

        public void r(int i15) {
            this.f202720c = i15;
        }

        public void s(boolean z15) {
            this.f202723f = z15;
        }

        public void t(int i15) {
            if (i15 != 0) {
                d(w3.N, Integer.valueOf(i15));
            }
        }
    }

    public interface b {
        void a(w3<?> w3Var, a aVar);
    }

    n1(List<u1> list, p1 p1Var, int i15, boolean z15, List<s> list2, boolean z16, t3 t3Var, c0 c0Var) {
        this.f202710a = list;
        this.f202711b = p1Var;
        this.f202712c = i15;
        this.f202714e = Collections.unmodifiableList(list2);
        this.f202715f = z16;
        this.f202716g = t3Var;
        this.f202717h = c0Var;
        this.f202713d = z15;
    }

    public static n1 b() {
        return new a().h();
    }

    public List<s> c() {
        return this.f202714e;
    }

    public Range<Integer> d() {
        Range<Integer> range = (Range) this.f202711b.f(f202709k, n3.f202727a);
        Objects.requireNonNull(range);
        return range;
    }

    public int e() {
        Object objD = this.f202716g.d("CAPTURE_CONFIG_ID_KEY");
        if (objD == null) {
            return -1;
        }
        return ((Integer) objD).intValue();
    }

    public p1 f() {
        return this.f202711b;
    }

    public int g() {
        Integer num = (Integer) this.f202711b.f(w3.M, 0);
        Objects.requireNonNull(num);
        return num.intValue();
    }

    public List<u1> h() {
        return Collections.unmodifiableList(this.f202710a);
    }

    public t3 i() {
        return this.f202716g;
    }

    public int j() {
        return this.f202712c;
    }

    public int k() {
        Integer num = (Integer) this.f202711b.f(w3.N, 0);
        Objects.requireNonNull(num);
        return num.intValue();
    }

    public boolean l() {
        return this.f202715f;
    }
}
