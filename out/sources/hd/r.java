package hd;

import android.graphics.Path;
import fd.a0;
import fd.g0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class r implements m, id.a.b, k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f83694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f83695c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a0 f83696d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final id.m f83697e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f83698f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Path f83693a = new Path();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final b f83699g = new b();

    public r(a0 a0Var, pd.b bVar, od.r rVar) {
        this.f83694b = rVar.b();
        this.f83695c = rVar.d();
        this.f83696d = a0Var;
        id.m mVarL = rVar.c().l();
        this.f83697e = mVarL;
        bVar.j(mVarL);
        mVarL.a(this);
    }

    private void h() {
        this.f83698f = false;
        this.f83696d.invalidateSelf();
    }

    @Override // hd.m
    public Path W() {
        if (this.f83698f && !this.f83697e.k()) {
            return this.f83693a;
        }
        this.f83693a.reset();
        if (this.f83695c) {
            this.f83698f = true;
            return this.f83693a;
        }
        Path pathH = this.f83697e.h();
        if (pathH == null) {
            return this.f83693a;
        }
        this.f83693a.set(pathH);
        this.f83693a.setFillType(Path.FillType.EVEN_ODD);
        this.f83699g.b(this.f83693a);
        this.f83698f = true;
        return this.f83693a;
    }

    @Override // id.a.b
    public void a() {
        h();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:12:0x002a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:13:0x002c  */
    /* JADX WARN: Code duplicated, block: B:21:0x0039 A[SYNTHETIC] */
    @Override // hd.c
    public void b(List<c> list, List<c> list2) {
        ArrayList arrayList = null;
        for (int i15 = 0; i15 < list.size(); i15++) {
            c cVar = list.get(i15);
            if (cVar instanceof u) {
                u uVar = (u) cVar;
                if (uVar.k() == od.t.a.SIMULTANEOUSLY) {
                    this.f83699g.a(uVar);
                    uVar.c(this);
                } else if (!(cVar instanceof s)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    s sVar = (s) cVar;
                    sVar.e(this);
                    arrayList.add(sVar);
                }
            } else if (!(cVar instanceof s)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                s sVar2 = (s) cVar;
                sVar2.e(this);
                arrayList.add(sVar2);
            }
        }
        this.f83697e.s(arrayList);
    }

    @Override // md.f
    public void c(md.e eVar, int i15, List<md.e> list, md.e eVar2) {
        td.j.k(eVar, i15, list, eVar2, this);
    }

    @Override // md.f
    public <T> void g(T t15, ud.c<T> cVar) {
        if (t15 == g0.S) {
            this.f83697e.o(cVar);
        }
    }

    @Override // hd.c
    public String getName() {
        return this.f83694b;
    }
}
