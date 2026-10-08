package ii;

import android.net.Uri;

/* JADX INFO: loaded from: classes4.dex */
final class u7 extends m.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f92799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f92800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f92801c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Uri f92802d;

    u7() {
    }

    @Override // ii.m.a
    public final m a() {
        return new h4(this.f92799a, this.f92800b, this.f92801c, this.f92802d);
    }

    @Override // ii.m.a
    public final m.a b(String str) {
        this.f92801c = str;
        return this;
    }

    @Override // ii.m.a
    public final m.a c(Uri uri) {
        this.f92802d = uri;
        return this;
    }

    @Override // ii.m.a
    public final m.a d(String str) {
        this.f92800b = str;
        return this;
    }

    @Override // ii.m.a
    public final m.a e(String str) {
        this.f92799a = str;
        return this;
    }
}
