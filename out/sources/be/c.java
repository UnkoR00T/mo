package be;

import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
class c implements f, com.bumptech.glide.load.data.d.a<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<zd.f> f18640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g<?> f18641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f.a f18642c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f18643d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private zd.f f18644e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List<fe.o<File, ?>> f18645f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f18646g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile fe.o.a<?> f18647h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private File f18648j;

    c(g<?> gVar, f.a aVar) {
        this(gVar.c(), gVar, aVar);
    }

    private boolean b() {
        return this.f18646g < this.f18645f.size();
    }

    @Override // be.f
    public boolean a() {
        we.b.a("DataCacheGenerator.startNext");
        while (true) {
            try {
                boolean z15 = false;
                if (this.f18645f != null && b()) {
                    this.f18647h = null;
                    while (!z15 && b()) {
                        List<fe.o<File, ?>> list = this.f18645f;
                        int i15 = this.f18646g;
                        this.f18646g = i15 + 1;
                        this.f18647h = list.get(i15).a(this.f18648j, this.f18641b.t(), this.f18641b.f(), this.f18641b.k());
                        if (this.f18647h != null && this.f18641b.u(this.f18647h.f61677c.a())) {
                            this.f18647h.f61677c.e(this.f18641b.l(), this);
                            z15 = true;
                        }
                    }
                    we.b.e();
                    return z15;
                }
                int i16 = this.f18643d + 1;
                this.f18643d = i16;
                if (i16 >= this.f18640a.size()) {
                    we.b.e();
                    return false;
                }
                zd.f fVar = this.f18640a.get(this.f18643d);
                File fileA = this.f18641b.d().a(new d(fVar, this.f18641b.p()));
                this.f18648j = fileA;
                if (fileA != null) {
                    this.f18644e = fVar;
                    this.f18645f = this.f18641b.j(fileA);
                    this.f18646g = 0;
                }
            } catch (Throwable th4) {
                we.b.e();
                throw th4;
            }
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void c(Exception exc) {
        this.f18642c.j(this.f18644e, exc, this.f18647h.f61677c, zd.a.DATA_DISK_CACHE);
    }

    @Override // be.f
    public void cancel() {
        fe.o.a<?> aVar = this.f18647h;
        if (aVar != null) {
            aVar.f61677c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void f(Object obj) {
        this.f18642c.e(this.f18644e, obj, this.f18647h.f61677c, zd.a.DATA_DISK_CACHE, this.f18644e);
    }

    c(List<zd.f> list, g<?> gVar, f.a aVar) {
        this.f18643d = -1;
        this.f18640a = list;
        this.f18641b = gVar;
        this.f18642c = aVar;
    }
}
