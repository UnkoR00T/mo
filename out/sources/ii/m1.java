package ii;

import android.net.Uri;

/* JADX INFO: loaded from: classes4.dex */
final class m1 extends x.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Uri f92648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Uri f92649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Uri f92650c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Uri f92651d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Uri f92652e;

    m1() {
    }

    @Override // ii.x.a
    public final x a() {
        return new y4(this.f92648a, this.f92649b, this.f92650c, this.f92651d, this.f92652e);
    }

    @Override // ii.x.a
    public final x.a b(Uri uri) {
        this.f92648a = uri;
        return this;
    }

    @Override // ii.x.a
    public final x.a c(Uri uri) {
        this.f92652e = uri;
        return this;
    }

    @Override // ii.x.a
    public final x.a d(Uri uri) {
        this.f92649b = uri;
        return this;
    }

    @Override // ii.x.a
    public final x.a e(Uri uri) {
        this.f92651d = uri;
        return this;
    }

    @Override // ii.x.a
    public final x.a f(Uri uri) {
        this.f92650c = uri;
        return this;
    }
}
