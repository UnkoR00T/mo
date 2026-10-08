package io.sentry;

import java.io.IOException;
import java.io.Writer;

/* JADX INFO: loaded from: classes4.dex */
public final class b2 implements l3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.sentry.vendor.gson.stream.c f94672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a2 f94673b;

    public b2(Writer writer, int i15) {
        this.f94672a = new io.sentry.vendor.gson.stream.c(writer);
        this.f94673b = new a2(i15);
    }

    @Override // io.sentry.l3
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public b2 d(boolean z15) throws IOException {
        this.f94672a.d0(z15);
        return this;
    }

    @Override // io.sentry.l3
    public String a() {
        return this.f94672a.C();
    }

    @Override // io.sentry.l3
    public void e0(boolean z15) {
        this.f94672a.e0(z15);
    }

    @Override // io.sentry.l3
    public l3 i(String str) throws IOException {
        this.f94672a.E(str);
        return this;
    }

    @Override // io.sentry.l3
    public void j(String str) {
        this.f94672a.N(str);
    }

    @Override // io.sentry.l3
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public b2 g() throws IOException {
        this.f94672a.m();
        return this;
    }

    @Override // io.sentry.l3
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public b2 Y() throws IOException {
        this.f94672a.p();
        return this;
    }

    @Override // io.sentry.l3
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public b2 e() {
        this.f94672a.u();
        return this;
    }

    @Override // io.sentry.l3
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public b2 h0() {
        this.f94672a.y();
        return this;
    }

    @Override // io.sentry.l3
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public b2 f(String str) {
        this.f94672a.H(str);
        return this;
    }

    @Override // io.sentry.l3
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public b2 n() throws IOException {
        this.f94672a.J();
        return this;
    }

    @Override // io.sentry.l3
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public b2 c(double d15) throws IOException {
        this.f94672a.V(d15);
        return this;
    }

    @Override // io.sentry.l3
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public b2 b(long j15) throws IOException {
        this.f94672a.Z(j15);
        return this;
    }

    @Override // io.sentry.l3
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public b2 l(v0 v0Var, Object obj) {
        this.f94673b.a(this, v0Var, obj);
        return this;
    }

    @Override // io.sentry.l3
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public b2 m(Boolean bool) throws IOException {
        this.f94672a.a0(bool);
        return this;
    }

    @Override // io.sentry.l3
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public b2 k(Number number) throws IOException {
        this.f94672a.b0(number);
        return this;
    }

    @Override // io.sentry.l3
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public b2 h(String str) throws IOException {
        this.f94672a.c0(str);
        return this;
    }
}
