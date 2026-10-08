package ii;

import java.time.Instant;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class a2 extends g0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private g0.b f92356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f92357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f92358c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List f92359d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Boolean f92360e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Instant f92361f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Instant f92362g;

    a2() {
    }

    @Override // ii.g0.a
    public final g0.a b(g0.b bVar) {
        this.f92356a = bVar;
        return this;
    }

    @Override // ii.g0.a
    public final g0.a c(List<j0> list) {
        if (list == null) {
            throw new NullPointerException("Null periods");
        }
        this.f92357b = list;
        return this;
    }

    @Override // ii.g0.a
    public final g0.a d(List<w0> list) {
        if (list == null) {
            throw new NullPointerException("Null specialDays");
        }
        this.f92358c = list;
        return this;
    }

    @Override // ii.g0.a
    public final g0.a e(List<String> list) {
        if (list == null) {
            throw new NullPointerException("Null weekdayText");
        }
        this.f92359d = list;
        return this;
    }

    @Override // ii.g0.a
    public final g0.a f(Boolean bool) {
        this.f92360e = bool;
        return this;
    }

    @Override // ii.g0.a
    public final g0.a g(Instant instant) {
        this.f92361f = instant;
        return this;
    }

    @Override // ii.g0.a
    public final g0.a h(Instant instant) {
        this.f92362g = instant;
        return this;
    }

    @Override // ii.g0.a
    final g0 i() {
        List list;
        List list2;
        List list3 = this.f92357b;
        if (list3 != null && (list = this.f92358c) != null && (list2 = this.f92359d) != null) {
            return new m5(this.f92356a, list3, list, list2, this.f92360e, this.f92361f, this.f92362g);
        }
        StringBuilder sb5 = new StringBuilder();
        if (this.f92357b == null) {
            sb5.append(" periods");
        }
        if (this.f92358c == null) {
            sb5.append(" specialDays");
        }
        if (this.f92359d == null) {
            sb5.append(" weekdayText");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb5.toString()));
    }
}
