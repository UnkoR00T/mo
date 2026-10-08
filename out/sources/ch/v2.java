package ch;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class v2 implements dl.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f26410a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f26411b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private dl.c f26412c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final r2 f26413d;

    v2(r2 r2Var) {
        this.f26413d = r2Var;
    }

    private final void b() {
        if (this.f26410a) {
            throw new dl.b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f26410a = true;
    }

    final void a(dl.c cVar, boolean z15) {
        this.f26410a = false;
        this.f26412c = cVar;
        this.f26411b = z15;
    }

    @Override // dl.g
    public final dl.g add(String str) throws IOException {
        b();
        this.f26413d.f(this.f26412c, str, this.f26411b);
        return this;
    }

    @Override // dl.g
    public final dl.g c(boolean z15) throws IOException {
        b();
        this.f26413d.g(this.f26412c, z15 ? 1 : 0, this.f26411b);
        return this;
    }
}
