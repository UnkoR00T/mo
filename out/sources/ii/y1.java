package ii;

import android.net.Uri;

/* JADX INFO: loaded from: classes4.dex */
final class y1 extends f0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private o f92864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private o f92865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Uri f92866c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f92867d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f92868e;

    y1() {
    }

    @Override // ii.f0.a
    public final f0 a() {
        return new k5(this.f92864a, this.f92865b, this.f92866c, this.f92867d, this.f92868e);
    }

    @Override // ii.f0.a
    public final f0.a b(o oVar) {
        this.f92865b = oVar;
        return this;
    }

    @Override // ii.f0.a
    public final f0.a c(String str) {
        this.f92867d = str;
        return this;
    }

    @Override // ii.f0.a
    public final f0.a d(String str) {
        this.f92868e = str;
        return this;
    }

    @Override // ii.f0.a
    public final f0.a e(Uri uri) {
        this.f92866c = uri;
        return this;
    }

    @Override // ii.f0.a
    public final f0.a f(o oVar) {
        this.f92864a = oVar;
        return this;
    }
}
