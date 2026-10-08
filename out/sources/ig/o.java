package ig;

import hg.a.b;

/* JADX INFO: loaded from: classes3.dex */
public class o<A extends hg.a.b, L> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n<A, L> f92239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f92240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Runnable f92241c;

    public static class a<A extends hg.a.b, L> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private p f92242a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private p f92243b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private j f92245d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private gg.c[] f92246e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f92248g;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Runnable f92244c = v0.f92284a;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f92247f = true;

        /* synthetic */ a(byte[] bArr) {
        }

        public o<A, L> a() {
            jg.s.b(this.f92242a != null, "Must set register function");
            jg.s.b(this.f92243b != null, "Must set unregister function");
            jg.s.b(this.f92245d != null, "Must set holder");
            return new o<>(new t0(this, this.f92245d, this.f92246e, this.f92247f, this.f92248g), new u0(this, (j.a) jg.s.m(this.f92245d.b(), "Key must not be null")), this.f92244c, null);
        }

        public a<A, L> b(p<A, vh.m<Void>> pVar) {
            this.f92242a = pVar;
            return this;
        }

        public a<A, L> c(boolean z15) {
            this.f92247f = z15;
            return this;
        }

        public a<A, L> d(gg.c... cVarArr) {
            this.f92246e = cVarArr;
            return this;
        }

        public a<A, L> e(int i15) {
            this.f92248g = i15;
            return this;
        }

        public a<A, L> f(p<A, vh.m<Boolean>> pVar) {
            this.f92243b = pVar;
            return this;
        }

        public a<A, L> g(j<L> jVar) {
            this.f92245d = jVar;
            return this;
        }

        final /* synthetic */ p h() {
            return this.f92242a;
        }

        final /* synthetic */ p i() {
            return this.f92243b;
        }
    }

    /* synthetic */ o(n nVar, u uVar, Runnable runnable, byte[] bArr) {
        this.f92239a = nVar;
        this.f92240b = uVar;
        this.f92241c = runnable;
    }

    public static <A extends hg.a.b, L> a<A, L> a() {
        return new a<>(null);
    }
}
