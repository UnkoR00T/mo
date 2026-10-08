package ot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import vr.h1;

/* JADX INFO: loaded from: classes4.dex */
public abstract class u extends r {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ws.a f149858h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final qt.s f149859j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ws.e f149860k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final n0 f149861l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private us.n f149862m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private lt.k f149863n;

    public u(zs.c cVar, rt.n nVar, vr.i0 i0Var, us.n nVar2, ws.a aVar, qt.s sVar) {
        super(cVar, nVar, i0Var);
        this.f149858h = aVar;
        this.f149859j = sVar;
        ws.e eVar = new ws.e(nVar2.U(), nVar2.T());
        this.f149860k = eVar;
        this.f149861l = new n0(nVar2, eVar, aVar, new s(this));
        this.f149862m = nVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h1 U0(u uVar, zs.b bVar) {
        qt.s sVar = uVar.f149859j;
        return sVar != null ? sVar : h1.f208052a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection W0(u uVar) {
        Collection<zs.b> collectionB = uVar.M0().b();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionB) {
            zs.b bVar = (zs.b) obj;
            if (!bVar.j() && !l.f149782c.a().contains(bVar)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(pq.v.y(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((zs.b) it.next()).h());
        }
        return arrayList2;
    }

    @Override // ot.r
    public void R0(n nVar) {
        us.n nVar2 = this.f149862m;
        if (nVar2 == null) {
            throw new IllegalStateException("Repeated call to DeserializedPackageFragmentImpl::initialize");
        }
        this.f149862m = null;
        this.f149863n = new qt.m0(this, nVar2.R(), this.f149860k, this.f149858h, this.f149859j, nVar, "scope of " + this, new t(this));
    }

    @Override // ot.r
    /* JADX INFO: renamed from: V0, reason: merged with bridge method [inline-methods] */
    public n0 M0() {
        return this.f149861l;
    }

    @Override // vr.o0
    public lt.k r() {
        lt.k kVar = this.f149863n;
        if (kVar == null) {
            return null;
        }
        return kVar;
    }
}
