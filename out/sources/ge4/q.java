package ge4;

import fv.d0;
import fv.e0;
import java.io.IOException;
import java.util.Objects;
import vv.k0;

/* JADX INFO: loaded from: classes2.dex */
final class q<T> implements d<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w f72353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f72354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object[] f72355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final fv.e.a f72356d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final h<e0, T> f72357e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile boolean f72358f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private fv.e f72359g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Throwable f72360h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f72361j;

    class a implements fv.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f72362a;

        a(f fVar) {
            this.f72362a = fVar;
        }

        private void b(Throwable th4) {
            try {
                this.f72362a.a(q.this, th4);
            } catch (Throwable th5) {
                c0.t(th5);
                th5.printStackTrace();
            }
        }

        @Override // fv.f
        public void a(fv.e eVar, d0 d0Var) {
            try {
                try {
                    this.f72362a.b(q.this, q.this.g(d0Var));
                } catch (Throwable th4) {
                    c0.t(th4);
                    th4.printStackTrace();
                }
            } catch (Throwable th5) {
                c0.t(th5);
                b(th5);
            }
        }

        @Override // fv.f
        public void d(fv.e eVar, IOException iOException) {
            b(iOException);
        }
    }

    static final class b extends e0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final e0 f72364c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final vv.g f72365d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        IOException f72366e;

        class a extends vv.n {
            a(k0 k0Var) {
                super(k0Var);
            }

            @Override // vv.n, vv.k0
            public long k3(vv.e eVar, long j15) throws IOException {
                try {
                    return super.k3(eVar, j15);
                } catch (IOException e15) {
                    b.this.f72366e = e15;
                    throw e15;
                }
            }
        }

        b(e0 e0Var) {
            this.f72364c = e0Var;
            this.f72365d = vv.v.c(new a(e0Var.getSource()));
        }

        void E() throws IOException {
            IOException iOException = this.f72366e;
            if (iOException != null) {
                throw iOException;
            }
        }

        @Override // fv.e0
        /* JADX INFO: renamed from: W3 */
        public vv.g getSource() {
            return this.f72365d;
        }

        @Override // fv.e0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f72364c.close();
        }

        @Override // fv.e0
        /* JADX INFO: renamed from: r */
        public long getContentLength() {
            return this.f72364c.getContentLength();
        }

        @Override // fv.e0
        /* JADX INFO: renamed from: u */
        public fv.x getF67343c() {
            return this.f72364c.getF67343c();
        }
    }

    static final class c extends e0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final fv.x f72368c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f72369d;

        c(fv.x xVar, long j15) {
            this.f72368c = xVar;
            this.f72369d = j15;
        }

        @Override // fv.e0
        /* JADX INFO: renamed from: W3 */
        public vv.g getSource() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }

        @Override // fv.e0
        /* JADX INFO: renamed from: r */
        public long getContentLength() {
            return this.f72369d;
        }

        @Override // fv.e0
        /* JADX INFO: renamed from: u */
        public fv.x getF67343c() {
            return this.f72368c;
        }
    }

    q(w wVar, Object obj, Object[] objArr, fv.e.a aVar, h<e0, T> hVar) {
        this.f72353a = wVar;
        this.f72354b = obj;
        this.f72355c = objArr;
        this.f72356d = aVar;
        this.f72357e = hVar;
    }

    private fv.e c() {
        fv.e eVarB = this.f72356d.b(this.f72353a.a(this.f72354b, this.f72355c));
        if (eVarB != null) {
            return eVarB;
        }
        throw new NullPointerException("Call.Factory returned null.");
    }

    private fv.e e() throws IOException {
        fv.e eVar = this.f72359g;
        if (eVar != null) {
            return eVar;
        }
        Throwable th4 = this.f72360h;
        if (th4 != null) {
            if (th4 instanceof IOException) {
                throw ((IOException) th4);
            }
            if (th4 instanceof RuntimeException) {
                throw ((RuntimeException) th4);
            }
            throw ((Error) th4);
        }
        try {
            fv.e eVarC = c();
            this.f72359g = eVarC;
            return eVarC;
        } catch (IOException | Error | RuntimeException e15) {
            c0.t(e15);
            this.f72360h = e15;
            throw e15;
        }
    }

    @Override // ge4.d
    public synchronized fv.b0 C() {
        try {
        } catch (IOException e15) {
            throw new RuntimeException("Unable to create request.", e15);
        }
        return e().getOriginalRequest();
    }

    @Override // ge4.d
    public void F1(f<T> fVar) {
        fv.e eVar;
        Throwable th4;
        Objects.requireNonNull(fVar, "callback == null");
        synchronized (this) {
            try {
                if (this.f72361j) {
                    throw new IllegalStateException("Already executed.");
                }
                this.f72361j = true;
                eVar = this.f72359g;
                th4 = this.f72360h;
                if (eVar == null && th4 == null) {
                    try {
                        fv.e eVarC = c();
                        this.f72359g = eVarC;
                        eVar = eVarC;
                    } catch (Throwable th5) {
                        th4 = th5;
                        c0.t(th4);
                        this.f72360h = th4;
                    }
                }
            } catch (Throwable th6) {
                throw th6;
            }
        }
        if (th4 != null) {
            fVar.a(this, th4);
            return;
        }
        if (this.f72358f) {
            eVar.cancel();
        }
        eVar.s1(new a(fVar));
    }

    @Override // ge4.d
    public boolean M() {
        boolean z15 = true;
        if (this.f72358f) {
            return true;
        }
        synchronized (this) {
            try {
                fv.e eVar = this.f72359g;
                if (eVar == null || !eVar.getCanceled()) {
                    z15 = false;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return z15;
    }

    @Override // ge4.d
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public q<T> m40clone() {
        return new q<>(this.f72353a, this.f72354b, this.f72355c, this.f72356d, this.f72357e);
    }

    @Override // ge4.d
    public void cancel() {
        fv.e eVar;
        this.f72358f = true;
        synchronized (this) {
            eVar = this.f72359g;
        }
        if (eVar != null) {
            eVar.cancel();
        }
    }

    x<T> g(d0 d0Var) throws IOException {
        e0 body = d0Var.getBody();
        d0 d0VarC = d0Var.K().b(new c(body.getF67343c(), body.getContentLength())).c();
        int code = d0VarC.getCode();
        if (code < 200 || code >= 300) {
            try {
                return x.c(c0.a(body), d0VarC);
            } finally {
                body.close();
            }
        }
        if (code == 204 || code == 205) {
            body.close();
            return x.i(null, d0VarC);
        }
        b bVar = new b(body);
        try {
            return x.i(this.f72357e.a(bVar), d0VarC);
        } catch (RuntimeException e15) {
            bVar.E();
            throw e15;
        }
    }
}
