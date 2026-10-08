package ig;

import hg.a.b;

/* JADX INFO: loaded from: classes3.dex */
public abstract class s<A extends hg.a.b, ResultT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final gg.c[] f92269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f92270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f92271c;

    public static class a<A extends hg.a.b, ResultT> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private p f92272a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private gg.c[] f92274c;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f92273b = true;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f92275d = 0;

        /* synthetic */ a(byte[] bArr) {
        }

        public s<A, ResultT> a() {
            jg.s.b(this.f92272a != null, "execute parameter required");
            return new a1(this, this.f92274c, this.f92273b, this.f92275d);
        }

        public a<A, ResultT> b(p<A, vh.m<ResultT>> pVar) {
            this.f92272a = pVar;
            return this;
        }

        public a<A, ResultT> c(boolean z15) {
            this.f92273b = z15;
            return this;
        }

        public a<A, ResultT> d(gg.c... cVarArr) {
            this.f92274c = cVarArr;
            return this;
        }

        public a<A, ResultT> e(int i15) {
            this.f92275d = i15;
            return this;
        }

        final /* synthetic */ p f() {
            return this.f92272a;
        }
    }

    @Deprecated
    public s() {
        this.f92269a = null;
        this.f92270b = false;
        this.f92271c = 0;
    }

    public static <A extends hg.a.b, ResultT> a<A, ResultT> a() {
        return new a<>(null);
    }

    protected abstract void b(A a15, vh.m<ResultT> mVar);

    public boolean c() {
        return this.f92270b;
    }

    public final gg.c[] d() {
        return this.f92269a;
    }

    public final int e() {
        return this.f92271c;
    }

    protected s(gg.c[] cVarArr, boolean z15, int i15) {
        this.f92269a = cVarArr;
        boolean z16 = false;
        if (cVarArr != null && z15) {
            z16 = true;
        }
        this.f92270b = z16;
        this.f92271c = i15;
    }
}
