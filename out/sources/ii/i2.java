package ii;

import android.net.Uri;

/* JADX INFO: loaded from: classes4.dex */
final class i2 extends k0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f92474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f92475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f92476c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f92477d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f92478e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private g f92479f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Uri f92480g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Uri f92481h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private byte f92482i;

    i2() {
    }

    @Override // ii.k0.a
    public final k0.a b(String str) {
        if (str == null) {
            throw new NullPointerException("Null attributions");
        }
        this.f92474a = str;
        return this;
    }

    @Override // ii.k0.a
    public final k0.a c(g gVar) {
        this.f92479f = gVar;
        return this;
    }

    @Override // ii.k0.a
    public final k0.a d(Uri uri) {
        this.f92480g = uri;
        return this;
    }

    @Override // ii.k0.a
    public final k0.a e(int i15) {
        this.f92475b = i15;
        this.f92482i = (byte) (this.f92482i | 1);
        return this;
    }

    @Override // ii.k0.a
    public final k0.a f(int i15) {
        this.f92476c = i15;
        this.f92482i = (byte) (this.f92482i | 2);
        return this;
    }

    @Override // ii.k0.a
    public final k0.a g(String str) {
        this.f92478e = str;
        return this;
    }

    @Override // ii.k0.a
    public final k0.a h(Uri uri) {
        this.f92481h = uri;
        return this;
    }

    @Override // ii.k0.a
    final k0 i() {
        String str;
        String str2;
        if (this.f92482i == 3 && (str = this.f92474a) != null && (str2 = this.f92477d) != null) {
            return new v5(str, this.f92475b, this.f92476c, str2, this.f92478e, this.f92479f, this.f92480g, this.f92481h);
        }
        StringBuilder sb5 = new StringBuilder();
        if (this.f92474a == null) {
            sb5.append(" attributions");
        }
        if ((this.f92482i & 1) == 0) {
            sb5.append(" height");
        }
        if ((this.f92482i & 2) == 0) {
            sb5.append(" width");
        }
        if (this.f92477d == null) {
            sb5.append(" photoReference");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb5.toString()));
    }

    final k0.a j(String str) {
        if (str == null) {
            throw new NullPointerException("Null photoReference");
        }
        this.f92477d = str;
        return this;
    }
}
