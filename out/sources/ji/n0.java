package ji;

import android.net.Uri;
import ii.u0;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class n0 extends q.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List f103248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f103249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private m f103250c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f103251d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f103252e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Uri f103253f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private byte f103254g;

    n0() {
    }

    @Override // ji.q.a
    public final q a() {
        List list;
        if (this.f103254g == 1 && (list = this.f103248a) != null) {
            return new o0(list, this.f103249b, this.f103250c, this.f103251d, this.f103252e, this.f103253f, null);
        }
        StringBuilder sb5 = new StringBuilder();
        if (this.f103248a == null) {
            sb5.append(" places");
        }
        if (this.f103254g == 0) {
            sb5.append(" responsePageIndex");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb5.toString()));
    }

    @Override // ji.q.a
    public final List<ii.l0> c() {
        List<ii.l0> list = this.f103248a;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("Property \"places\" has not been set");
    }

    @Override // ji.q.a
    public final List<u0> d() {
        return this.f103249b;
    }

    @Override // ji.q.a
    public final q.a e(m mVar) {
        this.f103250c = mVar;
        return this;
    }

    @Override // ji.q.a
    public final q.a f(List<ii.l0> list) {
        if (list == null) {
            throw new NullPointerException("Null places");
        }
        this.f103248a = list;
        return this;
    }

    @Override // ji.q.a
    public final q.a g(List<u0> list) {
        this.f103249b = list;
        return this;
    }

    @Override // ji.q.a
    public final q.a h(Uri uri) {
        this.f103253f = uri;
        return this;
    }

    @Override // ji.q.a
    public final q.a i(String str) {
        this.f103251d = str;
        return this;
    }

    @Override // ji.q.a
    public final q.a j(int i15) {
        this.f103252e = i15;
        this.f103254g = (byte) 1;
        return this;
    }
}
