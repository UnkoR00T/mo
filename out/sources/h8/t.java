package h8;

import a8.b2;
import a8.f3;
import a8.y1;
import android.net.Uri;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
final class t implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Uri f81698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s f81699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final j1 f81700c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f81701d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f81702e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicReference<Throwable> f81703f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ArrayList<b> f81704g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.google.common.util.concurrent.q<?> f81705h;

    class a implements com.google.common.util.concurrent.j<Object> {
        a() {
        }

        @Override // com.google.common.util.concurrent.j
        public void a(Object obj) {
            t.this.f81702e.set(true);
        }

        @Override // com.google.common.util.concurrent.j
        public void b(Throwable th4) {
            t.this.f81703f.set(th4);
        }
    }

    private final class b implements z0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f81707a = 0;

        public b() {
        }

        @Override // h8.z0
        public void a() throws IOException {
            Throwable th4 = (Throwable) t.this.f81703f.get();
            if (th4 != null) {
                throw new IOException(th4);
            }
        }

        @Override // h8.z0
        public int b(y1 y1Var, z7.f fVar, int i15) {
            int i16 = this.f81707a;
            if (i16 == 2) {
                fVar.k(4);
                return -4;
            }
            if ((i15 & 2) != 0 || i16 == 0) {
                y1Var.f4794b = t.this.f81700c.b(0).a(0);
                this.f81707a = 1;
                return -5;
            }
            if (!t.this.f81702e.get()) {
                return -3;
            }
            int length = t.this.f81701d.length;
            fVar.k(1);
            fVar.f233230f = 0L;
            if ((i15 & 4) == 0) {
                fVar.x(length);
                fVar.f233228d.put(t.this.f81701d, 0, length);
            }
            if ((i15 & 1) == 0) {
                this.f81707a = 2;
            }
            return -4;
        }

        @Override // h8.z0
        public int c(long j15) {
            return 0;
        }

        public void d() {
            if (this.f81707a == 2) {
                this.f81707a = 1;
            }
        }

        @Override // h8.z0
        public boolean f() {
            return t.this.f81702e.get();
        }
    }

    public t(Uri uri, String str, s sVar) {
        this.f81698a = uri;
        t7.p pVarQ = new t7.p.b().A0(str).Q();
        this.f81699b = sVar;
        this.f81700c = new j1(new t7.f0(pVarQ));
        this.f81701d = uri.toString().getBytes(StandardCharsets.UTF_8);
        this.f81702e = new AtomicBoolean();
        this.f81703f = new AtomicReference<>();
        this.f81704g = new ArrayList<>();
    }

    @Override // h8.b0, h8.a1
    public long a() {
        return this.f81702e.get() ? Long.MIN_VALUE : 0L;
    }

    @Override // h8.b0, h8.a1
    public boolean b() {
        return !this.f81702e.get();
    }

    @Override // h8.b0, h8.a1
    public boolean c(b2 b2Var) {
        return !this.f81702e.get();
    }

    @Override // h8.b0, h8.a1
    public long d() {
        return this.f81702e.get() ? Long.MIN_VALUE : 0L;
    }

    @Override // h8.b0, h8.a1
    public void e(long j15) {
    }

    @Override // h8.b0
    public long h(long j15, f3 f3Var) {
        return j15;
    }

    @Override // h8.b0
    public long i(long j15) {
        for (int i15 = 0; i15 < this.f81704g.size(); i15++) {
            this.f81704g.get(i15).d();
        }
        return j15;
    }

    @Override // h8.b0
    public long k() {
        return -9223372036854775807L;
    }

    public void m() {
        com.google.common.util.concurrent.q<?> qVar = this.f81705h;
        if (qVar != null) {
            qVar.cancel(false);
        }
    }

    @Override // h8.b0
    public void p(b0.a aVar, long j15) {
        aVar.f(this);
        com.google.common.util.concurrent.q<?> qVarA = this.f81699b.a(new s.a(this.f81698a));
        this.f81705h = qVarA;
        com.google.common.util.concurrent.k.a(qVarA, new a(), com.google.common.util.concurrent.u.a());
    }

    @Override // h8.b0
    public void q() {
    }

    @Override // h8.b0
    public j1 t() {
        return this.f81700c;
    }

    @Override // h8.b0
    public long u(j8.r[] rVarArr, boolean[] zArr, z0[] z0VarArr, boolean[] zArr2, long j15) {
        for (int i15 = 0; i15 < rVarArr.length; i15++) {
            z0 z0Var = z0VarArr[i15];
            if (z0Var != null && (rVarArr[i15] == null || !zArr[i15])) {
                this.f81704g.remove(z0Var);
                z0VarArr[i15] = null;
            }
            if (z0VarArr[i15] == null && rVarArr[i15] != null) {
                b bVar = new b();
                this.f81704g.add(bVar);
                z0VarArr[i15] = bVar;
                zArr2[i15] = true;
            }
        }
        return j15;
    }

    @Override // h8.b0
    public void w(long j15, boolean z15) {
    }
}
