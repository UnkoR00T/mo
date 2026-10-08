package ii;

import android.net.Uri;

/* JADX INFO: loaded from: classes4.dex */
final class e1 extends t.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private o f92410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private o f92411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private o f92412c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private o f92413d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Uri f92414e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f92415f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f92416g;

    e1() {
    }

    @Override // ii.t.a
    public final t a() {
        o oVar = this.f92410a;
        if (oVar != null) {
            return new q4(oVar, this.f92411b, this.f92412c, this.f92413d, this.f92414e, this.f92415f, this.f92416g);
        }
        throw new IllegalStateException("Missing required properties: overview");
    }

    @Override // ii.t.a
    public final t.a b(o oVar) {
        this.f92411b = oVar;
        return this;
    }

    @Override // ii.t.a
    public final t.a c(String str) {
        this.f92415f = str;
        return this;
    }

    @Override // ii.t.a
    public final t.a d(String str) {
        this.f92416g = str;
        return this;
    }

    @Override // ii.t.a
    public final t.a e(Uri uri) {
        this.f92414e = uri;
        return this;
    }

    @Override // ii.t.a
    public final t.a f(o oVar) {
        this.f92412c = oVar;
        return this;
    }

    @Override // ii.t.a
    public final t.a g(o oVar) {
        this.f92413d = oVar;
        return this;
    }

    final t.a h(o oVar) {
        if (oVar == null) {
            throw new NullPointerException("Null overview");
        }
        this.f92410a = oVar;
        return this;
    }
}
