package id;

import android.graphics.Path;
import android.graphics.PointF;

/* JADX INFO: loaded from: classes3.dex */
public class i extends ud.a<PointF> {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Path f90982q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final ud.a<PointF> f90983r;

    public i(fd.f fVar, ud.a<PointF> aVar) {
        super(fVar, aVar.f197576b, aVar.f197577c, aVar.f197578d, aVar.f197579e, aVar.f197580f, aVar.f197581g, aVar.f197582h);
        this.f90983r = aVar;
        j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void j() {
        T t15;
        T t16;
        T t17 = this.f197577c;
        boolean z15 = (t17 == 0 || (t16 = this.f197576b) == 0 || !((PointF) t16).equals(((PointF) t17).x, ((PointF) t17).y)) ? false : true;
        T t18 = this.f197576b;
        if (t18 == 0 || (t15 = this.f197577c) == 0 || z15) {
            return;
        }
        ud.a<PointF> aVar = this.f90983r;
        this.f90982q = td.m.d((PointF) t18, (PointF) t15, aVar.f197589o, aVar.f197590p);
    }

    Path k() {
        return this.f90982q;
    }
}
