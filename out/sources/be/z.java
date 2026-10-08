package be;

import android.util.Log;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
class z implements f, f.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g<?> f18840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f.a f18841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile int f18842c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile c f18843d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile Object f18844e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile fe.o.a<?> f18845f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile d f18846g;

    class a implements com.bumptech.glide.load.data.d.a<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ fe.o.a f18847a;

        a(fe.o.a aVar) {
            this.f18847a = aVar;
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void c(Exception exc) {
            if (z.this.d(this.f18847a)) {
                z.this.h(this.f18847a, exc);
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void f(Object obj) {
            if (z.this.d(this.f18847a)) {
                z.this.f(this.f18847a, obj);
            }
        }
    }

    z(g<?> gVar, f.a aVar) {
        this.f18840a = gVar;
        this.f18841b = aVar;
    }

    private boolean b(Object obj) throws Throwable {
        Throwable th4;
        long jB = ve.g.b();
        boolean z15 = false;
        try {
            com.bumptech.glide.load.data.e<T> eVarO = this.f18840a.o(obj);
            Object objA = eVarO.a();
            zd.d<X> dVarQ = this.f18840a.q(objA);
            e eVar = new e(dVarQ, objA, this.f18840a.k());
            d dVar = new d(this.f18845f.f61675a, this.f18840a.p());
            de.a aVarD = this.f18840a.d();
            aVarD.b(dVar, eVar);
            if (Log.isLoggable("SourceGenerator", 2)) {
                dVar.toString();
                Objects.toString(obj);
                Objects.toString(dVarQ);
                ve.g.a(jB);
            }
            if (aVarD.a(dVar) != null) {
                this.f18846g = dVar;
                this.f18843d = new c(Collections.singletonList(this.f18845f.f61675a), this.f18840a, this);
                this.f18845f.f61677c.b();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Objects.toString(this.f18846g);
                Objects.toString(obj);
            }
            try {
                this.f18841b.e(this.f18845f.f61675a, eVarO.a(), this.f18845f.f61677c, this.f18845f.f61677c.d(), this.f18845f.f61675a);
                return false;
            } catch (Throwable th5) {
                th4 = th5;
                z15 = true;
                if (z15) {
                    throw th4;
                }
                this.f18845f.f61677c.b();
                throw th4;
            }
        } catch (Throwable th6) {
            th4 = th6;
        }
    }

    private boolean c() {
        return this.f18842c < this.f18840a.g().size();
    }

    private void i(fe.o.a<?> aVar) {
        this.f18845f.f61677c.e(this.f18840a.l(), new a(aVar));
    }

    @Override // be.f
    public boolean a() {
        if (this.f18844e != null) {
            Object obj = this.f18844e;
            this.f18844e = null;
            try {
                if (!b(obj)) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        if (this.f18843d != null && this.f18843d.a()) {
            return true;
        }
        this.f18843d = null;
        this.f18845f = null;
        boolean z15 = false;
        while (!z15 && c()) {
            List<fe.o.a<?>> listG = this.f18840a.g();
            int i15 = this.f18842c;
            this.f18842c = i15 + 1;
            this.f18845f = listG.get(i15);
            if (this.f18845f != null && (this.f18840a.e().c(this.f18845f.f61677c.d()) || this.f18840a.u(this.f18845f.f61677c.a()))) {
                i(this.f18845f);
                z15 = true;
            }
        }
        return z15;
    }

    @Override // be.f
    public void cancel() {
        fe.o.a<?> aVar = this.f18845f;
        if (aVar != null) {
            aVar.f61677c.cancel();
        }
    }

    boolean d(fe.o.a<?> aVar) {
        fe.o.a<?> aVar2 = this.f18845f;
        return aVar2 != null && aVar2 == aVar;
    }

    @Override // be.f.a
    public void e(zd.f fVar, Object obj, com.bumptech.glide.load.data.d<?> dVar, zd.a aVar, zd.f fVar2) {
        this.f18841b.e(fVar, obj, dVar, this.f18845f.f61677c.d(), fVar);
    }

    void f(fe.o.a<?> aVar, Object obj) {
        j jVarE = this.f18840a.e();
        if (obj != null && jVarE.c(aVar.f61677c.d())) {
            this.f18844e = obj;
            this.f18841b.g();
        } else {
            f.a aVar2 = this.f18841b;
            zd.f fVar = aVar.f61675a;
            com.bumptech.glide.load.data.d<?> dVar = aVar.f61677c;
            aVar2.e(fVar, obj, dVar, dVar.d(), this.f18846g);
        }
    }

    @Override // be.f.a
    public void g() {
        throw new UnsupportedOperationException();
    }

    void h(fe.o.a<?> aVar, Exception exc) {
        f.a aVar2 = this.f18841b;
        d dVar = this.f18846g;
        com.bumptech.glide.load.data.d<?> dVar2 = aVar.f61677c;
        aVar2.j(dVar, exc, dVar2, dVar2.d());
    }

    @Override // be.f.a
    public void j(zd.f fVar, Exception exc, com.bumptech.glide.load.data.d<?> dVar, zd.a aVar) {
        this.f18841b.j(fVar, exc, dVar, this.f18845f.f61677c.d());
    }
}
