package eh;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class d2 implements dl.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f50354a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f50355b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private dl.c f50356c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final y1 f50357d;

    d2(y1 y1Var) {
        this.f50357d = y1Var;
    }

    private final void b() {
        if (this.f50354a) {
            throw new dl.b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f50354a = true;
    }

    final void a(dl.c cVar, boolean z15) {
        this.f50354a = false;
        this.f50356c = cVar;
        this.f50355b = z15;
    }

    @Override // dl.g
    public final dl.g add(String str) throws IOException {
        b();
        this.f50357d.f(this.f50356c, str, this.f50355b);
        return this;
    }

    @Override // dl.g
    public final dl.g c(boolean z15) throws IOException {
        b();
        this.f50357d.g(this.f50356c, z15 ? 1 : 0, this.f50355b);
        return this;
    }
}
