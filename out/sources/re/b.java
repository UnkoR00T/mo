package re;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements e, d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f173305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f173306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile d f173307c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile d f173308d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private e.a f173309e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private e.a f173310f;

    public b(Object obj, e eVar) {
        e.a aVar = e.a.CLEARED;
        this.f173309e = aVar;
        this.f173310f = aVar;
        this.f173305a = obj;
        this.f173306b = eVar;
    }

    private boolean l(d dVar) {
        e.a aVar = this.f173309e;
        e.a aVar2 = e.a.FAILED;
        if (aVar != aVar2) {
            return dVar.equals(this.f173307c);
        }
        if (!dVar.equals(this.f173308d)) {
            return false;
        }
        e.a aVar3 = this.f173310f;
        return aVar3 == e.a.SUCCESS || aVar3 == aVar2;
    }

    private boolean m() {
        e eVar = this.f173306b;
        return eVar == null || eVar.d(this);
    }

    private boolean n() {
        e eVar = this.f173306b;
        return eVar == null || eVar.h(this);
    }

    private boolean o() {
        e eVar = this.f173306b;
        return eVar == null || eVar.k(this);
    }

    @Override // re.d
    public boolean a() {
        boolean z15;
        synchronized (this.f173305a) {
            try {
                e.a aVar = this.f173309e;
                e.a aVar2 = e.a.SUCCESS;
                z15 = aVar == aVar2 || this.f173310f == aVar2;
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return z15;
    }

    @Override // re.e, re.d
    public boolean b() {
        boolean z15;
        synchronized (this.f173305a) {
            try {
                z15 = this.f173307c.b() || this.f173308d.b();
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return z15;
    }

    @Override // re.e
    public void c(d dVar) {
        synchronized (this.f173305a) {
            try {
                if (dVar.equals(this.f173307c)) {
                    this.f173309e = e.a.SUCCESS;
                } else if (dVar.equals(this.f173308d)) {
                    this.f173310f = e.a.SUCCESS;
                }
                e eVar = this.f173306b;
                if (eVar != null) {
                    eVar.c(this);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // re.d
    public void clear() {
        synchronized (this.f173305a) {
            try {
                e.a aVar = e.a.CLEARED;
                this.f173309e = aVar;
                this.f173307c.clear();
                if (this.f173310f != aVar) {
                    this.f173310f = aVar;
                    this.f173308d.clear();
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // re.e
    public boolean d(d dVar) {
        boolean z15;
        synchronized (this.f173305a) {
            try {
                z15 = m() && dVar.equals(this.f173307c);
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return z15;
    }

    @Override // re.e
    public void e(d dVar) {
        synchronized (this.f173305a) {
            try {
                if (dVar.equals(this.f173308d)) {
                    this.f173310f = e.a.FAILED;
                    e eVar = this.f173306b;
                    if (eVar != null) {
                        eVar.e(this);
                    }
                    return;
                }
                this.f173309e = e.a.FAILED;
                e.a aVar = this.f173310f;
                e.a aVar2 = e.a.RUNNING;
                if (aVar != aVar2) {
                    this.f173310f = aVar2;
                    this.f173308d.j();
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // re.d
    public boolean f() {
        boolean z15;
        synchronized (this.f173305a) {
            try {
                e.a aVar = this.f173309e;
                e.a aVar2 = e.a.CLEARED;
                z15 = aVar == aVar2 && this.f173310f == aVar2;
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return z15;
    }

    @Override // re.d
    public void g() {
        synchronized (this.f173305a) {
            try {
                e.a aVar = this.f173309e;
                e.a aVar2 = e.a.RUNNING;
                if (aVar == aVar2) {
                    this.f173309e = e.a.PAUSED;
                    this.f173307c.g();
                }
                if (this.f173310f == aVar2) {
                    this.f173310f = e.a.PAUSED;
                    this.f173308d.g();
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // re.e
    public e getRoot() {
        e root;
        synchronized (this.f173305a) {
            try {
                e eVar = this.f173306b;
                root = eVar != null ? eVar.getRoot() : this;
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return root;
    }

    @Override // re.e
    public boolean h(d dVar) {
        boolean z15;
        synchronized (this.f173305a) {
            try {
                z15 = n() && l(dVar);
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return z15;
    }

    @Override // re.d
    public boolean i(d dVar) {
        if (dVar instanceof b) {
            b bVar = (b) dVar;
            if (this.f173307c.i(bVar.f173307c) && this.f173308d.i(bVar.f173308d)) {
                return true;
            }
        }
        return false;
    }

    @Override // re.d
    public boolean isRunning() {
        boolean z15;
        synchronized (this.f173305a) {
            try {
                e.a aVar = this.f173309e;
                e.a aVar2 = e.a.RUNNING;
                z15 = aVar == aVar2 || this.f173310f == aVar2;
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return z15;
    }

    @Override // re.d
    public void j() {
        synchronized (this.f173305a) {
            try {
                e.a aVar = this.f173309e;
                e.a aVar2 = e.a.RUNNING;
                if (aVar != aVar2) {
                    this.f173309e = aVar2;
                    this.f173307c.j();
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // re.e
    public boolean k(d dVar) {
        boolean zO;
        synchronized (this.f173305a) {
            zO = o();
        }
        return zO;
    }

    public void p(d dVar, d dVar2) {
        this.f173307c = dVar;
        this.f173308d = dVar2;
    }
}
