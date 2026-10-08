package st;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class e extends e1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f184014e = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final tt.r f184015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f184016c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final lt.k f184017d;

    public static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        private a() {
        }
    }

    @Override // st.t0
    public List<d2> R0() {
        return pq.v.n();
    }

    @Override // st.t0
    public t1 S0() {
        return t1.f184126b.k();
    }

    @Override // st.t0
    public boolean U0() {
        return this.f184016c;
    }

    @Override // st.o2
    /* JADX INFO: renamed from: a1, reason: merged with bridge method [inline-methods] */
    public e1 X0(boolean z15) {
        return z15 == U0() ? this : d1(z15);
    }

    @Override // st.o2
    /* JADX INFO: renamed from: b1, reason: merged with bridge method [inline-methods] */
    public e1 Z0(t1 t1Var) {
        return this;
    }

    public final tt.r c1() {
        return this.f184015b;
    }

    public abstract e d1(boolean z15);

    @Override // st.o2
    /* JADX INFO: renamed from: e1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public e Y0(tt.g gVar) {
        return this;
    }

    @Override // st.t0
    public lt.k r() {
        return this.f184017d;
    }
}
