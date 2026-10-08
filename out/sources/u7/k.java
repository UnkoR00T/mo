package u7;

import ak.n0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n0<l> f195956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<l> f195957b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ByteBuffer[] f195958c = new ByteBuffer[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private l.a f195959d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private l.a f195960e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f195961f;

    public k(n0<l> n0Var) {
        this.f195956a = n0Var;
        l.a aVar = l.a.f195963e;
        this.f195959d = aVar;
        this.f195960e = aVar;
        this.f195961f = false;
    }

    private int d() {
        return this.f195958c.length - 1;
    }

    private void h(ByteBuffer byteBuffer) {
        boolean z15;
        for (boolean z16 = true; z16; z16 = z15) {
            z15 = false;
            for (int i15 = 0; i15 <= d(); i15++) {
                if (!this.f195958c[i15].hasRemaining()) {
                    l lVar = this.f195957b.get(i15);
                    if (!lVar.e()) {
                        ByteBuffer byteBuffer2 = i15 > 0 ? this.f195958c[i15 - 1] : byteBuffer.hasRemaining() ? byteBuffer : l.f195962a;
                        long jRemaining = byteBuffer2.remaining();
                        lVar.c(byteBuffer2);
                        this.f195958c[i15] = lVar.a();
                        z15 |= jRemaining - ((long) byteBuffer2.remaining()) > 0 || this.f195958c[i15].hasRemaining();
                    } else if (!this.f195958c[i15].hasRemaining() && i15 < d()) {
                        this.f195957b.get(i15 + 1).d();
                    }
                }
            }
        }
    }

    public l.a a(l.a aVar) throws l.c {
        if (aVar.equals(l.a.f195963e)) {
            throw new l.c(aVar);
        }
        for (int i15 = 0; i15 < this.f195956a.size(); i15++) {
            l lVar = this.f195956a.get(i15);
            l.a aVarG = lVar.g(aVar);
            if (lVar.h()) {
                zj.p.w(!aVarG.equals(l.a.f195963e));
                aVar = aVarG;
            }
        }
        this.f195960e = aVar;
        return aVar;
    }

    @Deprecated
    public void b() {
        c(l.b.f195968b);
    }

    public void c(l.b bVar) {
        this.f195957b.clear();
        this.f195959d = this.f195960e;
        this.f195961f = false;
        long jF = bVar.f195969a;
        for (int i15 = 0; i15 < this.f195956a.size(); i15++) {
            l lVar = this.f195956a.get(i15);
            lVar.b(new l.b(jF));
            if (lVar.h()) {
                jF = lVar.f(jF);
                zj.p.w(jF >= 0);
                this.f195957b.add(lVar);
            }
        }
        this.f195958c = new ByteBuffer[this.f195957b.size()];
        for (int i16 = 0; i16 <= d(); i16++) {
            this.f195958c[i16] = this.f195957b.get(i16).a();
        }
    }

    public ByteBuffer e() {
        if (!g()) {
            return l.f195962a;
        }
        ByteBuffer byteBuffer = this.f195958c[d()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        h(l.f195962a);
        return this.f195958c[d()];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f195956a.size() != kVar.f195956a.size()) {
            return false;
        }
        for (int i15 = 0; i15 < this.f195956a.size(); i15++) {
            if (this.f195956a.get(i15) != kVar.f195956a.get(i15)) {
                return false;
            }
        }
        return true;
    }

    public boolean f() {
        return this.f195961f && this.f195957b.get(d()).e() && !this.f195958c[d()].hasRemaining();
    }

    public boolean g() {
        return !this.f195957b.isEmpty();
    }

    public int hashCode() {
        return this.f195956a.hashCode();
    }

    public void i() {
        if (!g() || this.f195961f) {
            return;
        }
        this.f195961f = true;
        this.f195957b.get(0).d();
    }

    public void j(ByteBuffer byteBuffer) {
        if (!g() || this.f195961f) {
            return;
        }
        h(byteBuffer);
    }

    public void k() {
        for (int i15 = 0; i15 < this.f195956a.size(); i15++) {
            l lVar = this.f195956a.get(i15);
            lVar.b(l.b.f195968b);
            lVar.reset();
        }
        this.f195957b.clear();
        this.f195958c = new ByteBuffer[0];
        l.a aVar = l.a.f195963e;
        this.f195959d = aVar;
        this.f195960e = aVar;
        this.f195961f = false;
    }
}
