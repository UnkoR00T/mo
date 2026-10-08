package re;

/* JADX INFO: loaded from: classes3.dex */
public class j implements e, d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f173351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f173352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile d f173353c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile d f173354d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private e.a f173355e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private e.a f173356f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f173357g;

    public j(Object obj, e eVar) {
        e.a aVar = e.a.CLEARED;
        this.f173355e = aVar;
        this.f173356f = aVar;
        this.f173352b = obj;
        this.f173351a = eVar;
    }

    private boolean l() {
        e eVar = this.f173351a;
        return eVar == null || eVar.d(this);
    }

    private boolean m() {
        e eVar = this.f173351a;
        return eVar == null || eVar.h(this);
    }

    private boolean n() {
        e eVar = this.f173351a;
        return eVar == null || eVar.k(this);
    }

    @Override // re.d
    public boolean a() {
        boolean z15;
        synchronized (this.f173352b) {
            z15 = this.f173355e == e.a.SUCCESS;
        }
        return z15;
    }

    @Override // re.e, re.d
    public boolean b() {
        boolean z15;
        synchronized (this.f173352b) {
            try {
                z15 = this.f173354d.b() || this.f173353c.b();
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return z15;
    }

    @Override // re.e
    public void c(d dVar) {
        synchronized (this.f173352b) {
            try {
                if (dVar.equals(this.f173354d)) {
                    this.f173356f = e.a.SUCCESS;
                    return;
                }
                this.f173355e = e.a.SUCCESS;
                e eVar = this.f173351a;
                if (eVar != null) {
                    eVar.c(this);
                }
                if (!this.f173356f.e()) {
                    this.f173354d.clear();
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // re.d
    public void clear() {
        synchronized (this.f173352b) {
            this.f173357g = false;
            e.a aVar = e.a.CLEARED;
            this.f173355e = aVar;
            this.f173356f = aVar;
            this.f173354d.clear();
            this.f173353c.clear();
        }
    }

    @Override // re.e
    public boolean d(d dVar) {
        boolean z15;
        synchronized (this.f173352b) {
            try {
                z15 = l() && dVar.equals(this.f173353c) && this.f173355e != e.a.PAUSED;
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return z15;
    }

    @Override // re.e
    public void e(d dVar) {
        synchronized (this.f173352b) {
            try {
                if (!dVar.equals(this.f173353c)) {
                    this.f173356f = e.a.FAILED;
                    return;
                }
                this.f173355e = e.a.FAILED;
                e eVar = this.f173351a;
                if (eVar != null) {
                    eVar.e(this);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // re.d
    public boolean f() {
        boolean z15;
        synchronized (this.f173352b) {
            z15 = this.f173355e == e.a.CLEARED;
        }
        return z15;
    }

    @Override // re.d
    public void g() {
        synchronized (this.f173352b) {
            try {
                if (!this.f173356f.e()) {
                    this.f173356f = e.a.PAUSED;
                    this.f173354d.g();
                }
                if (!this.f173355e.e()) {
                    this.f173355e = e.a.PAUSED;
                    this.f173353c.g();
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // re.e
    public e getRoot() {
        e root;
        synchronized (this.f173352b) {
            try {
                e eVar = this.f173351a;
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
        synchronized (this.f173352b) {
            try {
                z15 = m() && dVar.equals(this.f173353c) && !b();
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return z15;
    }

    @Override // re.d
    public boolean i(d dVar) {
        if (dVar instanceof j) {
            j jVar = (j) dVar;
            if (this.f173353c != null ? this.f173353c.i(jVar.f173353c) : jVar.f173353c == null) {
                if (this.f173354d == null) {
                    if (jVar.f173354d == null) {
                        return true;
                    }
                } else if (this.f173354d.i(jVar.f173354d)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // re.d
    public boolean isRunning() {
        boolean z15;
        synchronized (this.f173352b) {
            z15 = this.f173355e == e.a.RUNNING;
        }
        return z15;
    }

    @Override // re.d
    public void j() {
        synchronized (this.f173352b) {
            try {
                this.f173357g = true;
                try {
                    if (this.f173355e != e.a.SUCCESS) {
                        e.a aVar = this.f173356f;
                        e.a aVar2 = e.a.RUNNING;
                        if (aVar != aVar2) {
                            this.f173356f = aVar2;
                            this.f173354d.j();
                        }
                    }
                    if (this.f173357g) {
                        e.a aVar3 = this.f173355e;
                        e.a aVar4 = e.a.RUNNING;
                        if (aVar3 != aVar4) {
                            this.f173355e = aVar4;
                            this.f173353c.j();
                        }
                    }
                    this.f173357g = false;
                } catch (Throwable th4) {
                    this.f173357g = false;
                    throw th4;
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
    }

    @Override // re.e
    public boolean k(d dVar) {
        boolean z15;
        synchronized (this.f173352b) {
            try {
                z15 = n() && (dVar.equals(this.f173353c) || this.f173355e != e.a.SUCCESS);
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return z15;
    }

    public void o(d dVar, d dVar2) {
        this.f173353c = dVar;
        this.f173354d = dVar2;
    }
}
