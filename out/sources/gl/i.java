package gl;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
class i implements dl.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f73543a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f73544b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private dl.c f73545c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f f73546d;

    i(f fVar) {
        this.f73546d = fVar;
    }

    private void a() {
        if (this.f73543a) {
            throw new dl.b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f73543a = true;
    }

    @Override // dl.g
    public dl.g add(String str) throws IOException {
        a();
        this.f73546d.g(this.f73545c, str, this.f73544b);
        return this;
    }

    void b(dl.c cVar, boolean z15) {
        this.f73543a = false;
        this.f73545c = cVar;
        this.f73544b = z15;
    }

    @Override // dl.g
    public dl.g c(boolean z15) {
        a();
        this.f73546d.l(this.f73545c, z15, this.f73544b);
        return this;
    }
}
