package ii;

import android.net.Uri;

/* JADX INFO: loaded from: classes4.dex */
final class k1 extends w.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f92500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f92501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Uri f92502c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f92503d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f92504e;

    k1() {
    }

    @Override // ii.w.a
    public final w a() {
        return new w4(this.f92500a, this.f92501b, this.f92502c, this.f92503d, this.f92504e);
    }

    @Override // ii.w.a
    public final w.a b(String str) {
        this.f92503d = str;
        return this;
    }

    @Override // ii.w.a
    public final w.a c(String str) {
        this.f92504e = str;
        return this;
    }

    @Override // ii.w.a
    public final w.a d(Uri uri) {
        this.f92502c = uri;
        return this;
    }

    @Override // ii.w.a
    public final w.a e(String str) {
        this.f92500a = str;
        return this;
    }

    @Override // ii.w.a
    public final w.a f(String str) {
        this.f92501b = str;
        return this;
    }
}
