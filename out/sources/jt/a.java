package jt;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import ms.k;
import pq.v;
import vr.g1;
import yr.k0;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<f> f105190b;

    /* JADX WARN: Multi-variable type inference failed */
    public a(List<? extends f> list) {
        this.f105190b = list;
    }

    @Override // jt.f
    public void a(vr.e eVar, List<vr.d> list, k kVar) {
        Iterator<T> it = this.f105190b.iterator();
        while (it.hasNext()) {
            ((f) it.next()).a(eVar, list, kVar);
        }
    }

    @Override // jt.f
    public List<zs.f> b(vr.e eVar, k kVar) {
        List<f> list = this.f105190b;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            v.D(arrayList, ((f) it.next()).b(eVar, kVar));
        }
        return arrayList;
    }

    @Override // jt.f
    public k0 c(vr.e eVar, k0 k0Var, k kVar) {
        Iterator<T> it = this.f105190b.iterator();
        while (it.hasNext()) {
            k0Var = ((f) it.next()).c(eVar, k0Var, kVar);
        }
        return k0Var;
    }

    @Override // jt.f
    public List<zs.f> d(vr.e eVar, k kVar) {
        List<f> list = this.f105190b;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            v.D(arrayList, ((f) it.next()).d(eVar, kVar));
        }
        return arrayList;
    }

    @Override // jt.f
    public void e(vr.e eVar, zs.f fVar, Collection<g1> collection, k kVar) {
        Iterator<T> it = this.f105190b.iterator();
        while (it.hasNext()) {
            ((f) it.next()).e(eVar, fVar, collection, kVar);
        }
    }

    @Override // jt.f
    public void f(vr.e eVar, zs.f fVar, Collection<g1> collection, k kVar) {
        Iterator<T> it = this.f105190b.iterator();
        while (it.hasNext()) {
            ((f) it.next()).f(eVar, fVar, collection, kVar);
        }
    }

    @Override // jt.f
    public List<zs.f> g(vr.e eVar, k kVar) {
        List<f> list = this.f105190b;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            v.D(arrayList, ((f) it.next()).g(eVar, kVar));
        }
        return arrayList;
    }

    @Override // jt.f
    public void h(vr.e eVar, zs.f fVar, List<vr.e> list, k kVar) {
        Iterator<T> it = this.f105190b.iterator();
        while (it.hasNext()) {
            ((f) it.next()).h(eVar, fVar, list, kVar);
        }
    }
}
