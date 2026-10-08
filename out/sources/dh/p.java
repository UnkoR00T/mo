package dh;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class p implements dl.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f42126a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f42127b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private dl.c f42128c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final l f42129d;

    p(l lVar) {
        this.f42129d = lVar;
    }

    private final void b() {
        if (this.f42126a) {
            throw new dl.b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f42126a = true;
    }

    final void a(dl.c cVar, boolean z15) {
        this.f42126a = false;
        this.f42128c = cVar;
        this.f42127b = z15;
    }

    @Override // dl.g
    public final dl.g add(String str) throws IOException {
        b();
        this.f42129d.f(this.f42128c, str, this.f42127b);
        return this;
    }

    @Override // dl.g
    public final dl.g c(boolean z15) throws IOException {
        b();
        this.f42129d.g(this.f42128c, z15 ? 1 : 0, this.f42127b);
        return this;
    }
}
