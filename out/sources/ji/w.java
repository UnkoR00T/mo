package ji;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class w extends c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f103303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f103304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ii.i f103305c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private vh.a f103306d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f103307e;

    w() {
    }

    @Override // ji.c.a
    public final c.a b(vh.a aVar) {
        this.f103306d = aVar;
        return this;
    }

    @Override // ji.c.a
    public final c.a c(ii.i iVar) {
        this.f103305c = iVar;
        return this;
    }

    @Override // ji.c.a
    final c.a d(List list) {
        if (list == null) {
            throw new NullPointerException("Null placeFields");
        }
        this.f103304b = list;
        return this;
    }

    @Override // ji.c.a
    final c e() {
        List list;
        String str = this.f103303a;
        if (str != null && (list = this.f103304b) != null) {
            return new x(str, list, this.f103305c, this.f103306d, this.f103307e, null);
        }
        StringBuilder sb5 = new StringBuilder();
        if (this.f103303a == null) {
            sb5.append(" placeId");
        }
        if (this.f103304b == null) {
            sb5.append(" placeFields");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb5.toString()));
    }

    final c.a f(String str) {
        if (str == null) {
            throw new NullPointerException("Null placeId");
        }
        this.f103303a = str;
        return this;
    }
}
