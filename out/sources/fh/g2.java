package fh;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class g2 implements dl.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f63051a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f63052b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private dl.c f63053c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b2 f63054d;

    g2(b2 b2Var) {
        this.f63054d = b2Var;
    }

    private final void b() {
        if (this.f63051a) {
            throw new dl.b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f63051a = true;
    }

    final void a(dl.c cVar, boolean z15) {
        this.f63051a = false;
        this.f63053c = cVar;
        this.f63052b = z15;
    }

    @Override // dl.g
    public final dl.g add(String str) throws IOException {
        b();
        this.f63054d.f(this.f63053c, str, this.f63052b);
        return this;
    }

    @Override // dl.g
    public final dl.g c(boolean z15) throws IOException {
        b();
        this.f63054d.g(this.f63053c, z15 ? 1 : 0, this.f63052b);
        return this;
    }
}
