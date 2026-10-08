package vp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements hp.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final gp.c f207797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bp.d f207798b;

    public d(gp.c cVar) {
        this.f207797a = cVar;
        bp.d dVar = new bp.d();
        this.f207798b = dVar;
        dVar.Y4(bp.i.f20911w3, new bp.a());
    }

    @Override // hp.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public bp.d D1() {
        return this.f207798b;
    }

    public gp.h b() {
        bp.b bVarP4 = this.f207798b.p4(bp.i.O2);
        if (bVarP4 instanceof bp.d) {
            return new gp.h((bp.d) bVarP4, this.f207797a.O());
        }
        return null;
    }

    gp.c c() {
        return this.f207797a;
    }

    public Iterator<j> d() {
        return new l(this).iterator();
    }

    public l e() {
        return new l(this);
    }

    public List<j> f() {
        j jVarA;
        bp.a aVarJ4 = this.f207798b.j4(bp.i.f20911w3);
        if (aVarJ4 == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        for (int i15 = 0; i15 < aVarJ4.size(); i15++) {
            bp.b bVarK4 = aVarJ4.k4(i15);
            if ((bVarK4 instanceof bp.d) && (jVarA = j.a(this, (bp.d) bVarK4, null)) != null) {
                arrayList.add(jVarA);
            }
        }
        return new hp.a(arrayList, aVarJ4);
    }

    public boolean g() {
        return this.f207798b.h4(bp.i.P5, false);
    }

    public w h() {
        return null;
    }

    public void i(boolean z15) {
        this.f207798b.T4(bp.i.V7, 2, z15);
    }

    public void j(boolean z15) {
        this.f207798b.T4(bp.i.V7, 1, z15);
    }

    public d(gp.c cVar, bp.d dVar) {
        this.f207797a = cVar;
        this.f207798b = dVar;
    }
}
