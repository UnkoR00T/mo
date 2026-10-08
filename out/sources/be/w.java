package be;

import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
class w implements f, com.bumptech.glide.load.data.d.a<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f.a f18819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g<?> f18820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f18821c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f18822d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private zd.f f18823e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List<fe.o<File, ?>> f18824f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f18825g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile fe.o.a<?> f18826h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private File f18827j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private x f18828k;

    w(g<?> gVar, f.a aVar) {
        this.f18820b = gVar;
        this.f18819a = aVar;
    }

    private boolean b() {
        return this.f18825g < this.f18824f.size();
    }

    @Override // be.f
    public boolean a() {
        we.b.a("ResourceCacheGenerator.startNext");
        try {
            List<zd.f> listC = this.f18820b.c();
            boolean z15 = false;
            if (listC.isEmpty()) {
                we.b.e();
                return false;
            }
            List<Class<?>> listM = this.f18820b.m();
            if (listM.isEmpty()) {
                if (File.class.equals(this.f18820b.r())) {
                    we.b.e();
                    return false;
                }
                throw new IllegalStateException("Failed to find any load path from " + this.f18820b.i() + " to " + this.f18820b.r());
            }
            while (true) {
                if (this.f18824f != null && b()) {
                    this.f18826h = null;
                    while (!z15 && b()) {
                        List<fe.o<File, ?>> list = this.f18824f;
                        int i15 = this.f18825g;
                        this.f18825g = i15 + 1;
                        this.f18826h = list.get(i15).a(this.f18827j, this.f18820b.t(), this.f18820b.f(), this.f18820b.k());
                        if (this.f18826h != null && this.f18820b.u(this.f18826h.f61677c.a())) {
                            this.f18826h.f61677c.e(this.f18820b.l(), this);
                            z15 = true;
                        }
                    }
                    we.b.e();
                    return z15;
                }
                int i16 = this.f18822d + 1;
                this.f18822d = i16;
                if (i16 >= listM.size()) {
                    int i17 = this.f18821c + 1;
                    this.f18821c = i17;
                    if (i17 >= listC.size()) {
                        we.b.e();
                        return false;
                    }
                    this.f18822d = 0;
                }
                zd.f fVar = listC.get(this.f18821c);
                Class<?> cls = listM.get(this.f18822d);
                this.f18828k = new x(this.f18820b.b(), fVar, this.f18820b.p(), this.f18820b.t(), this.f18820b.f(), this.f18820b.s(cls), cls, this.f18820b.k());
                File fileA = this.f18820b.d().a(this.f18828k);
                this.f18827j = fileA;
                if (fileA != null) {
                    this.f18823e = fVar;
                    this.f18824f = this.f18820b.j(fileA);
                    this.f18825g = 0;
                }
            }
        } catch (Throwable th4) {
            we.b.e();
            throw th4;
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void c(Exception exc) {
        this.f18819a.j(this.f18828k, exc, this.f18826h.f61677c, zd.a.RESOURCE_DISK_CACHE);
    }

    @Override // be.f
    public void cancel() {
        fe.o.a<?> aVar = this.f18826h;
        if (aVar != null) {
            aVar.f61677c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void f(Object obj) {
        this.f18819a.e(this.f18823e, obj, this.f18826h.f61677c, zd.a.RESOURCE_DISK_CACHE, this.f18828k);
    }
}
