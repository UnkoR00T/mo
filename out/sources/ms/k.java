package ms;

import js.f0;
import vr.i0;

/* JADX INFO: loaded from: classes4.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f128051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p f128052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final oq.k<f0> f128053c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final os.e f128054d;

    public k(d dVar, p pVar, oq.k<f0> kVar) {
        this.f128051a = dVar;
        this.f128052b = pVar;
        this.f128053c = kVar;
        this.f128054d = new os.e(this, pVar);
    }

    public final d a() {
        return this.f128051a;
    }

    public final f0 b() {
        return this.f128053c.getValue();
    }

    public final oq.k<f0> c() {
        return this.f128053c;
    }

    public final i0 d() {
        return this.f128051a.m();
    }

    public final rt.n e() {
        return this.f128051a.u();
    }

    public final p f() {
        return this.f128052b;
    }

    public final os.e g() {
        return this.f128054d;
    }
}
