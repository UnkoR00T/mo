package dt;

import st.x1;

/* JADX INFO: loaded from: classes4.dex */
class e implements tt.e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f44474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final vr.a f44475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final vr.a f44476c;

    public e(boolean z15, vr.a aVar, vr.a aVar2) {
        this.f44474a = z15;
        this.f44475b = aVar;
        this.f44476c = aVar2;
    }

    @Override // tt.e.a
    public boolean a(x1 x1Var, x1 x1Var2) {
        return g.h(this.f44474a, this.f44475b, this.f44476c, x1Var, x1Var2);
    }
}
