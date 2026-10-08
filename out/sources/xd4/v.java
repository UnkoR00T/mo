package xd4;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lxd4/v;", "Lxw/f;", "Lxd4/u;", "Lwn3/c;", "<init>", "()V", "entryPoint", "c", "(Lxd4/u;)Lwn3/c;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class v implements xw.f<u, wn3.c> {
    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public wn3.c b(u entryPoint) {
        if (fr.t.c(entryPoint, a.f218058a)) {
            return wn3.c.a.C5672a.f214188a;
        }
        if (fr.t.c(entryPoint, b.f218061a)) {
            return wn3.c.b.a.f214189a;
        }
        if (fr.t.c(entryPoint, c.f218063a)) {
            return wn3.c.b.C5673b.f214190a;
        }
        if (fr.t.c(entryPoint, d.f218065a)) {
            return wn3.c.b.AbstractC5674c.a.f214191a;
        }
        if (fr.t.c(entryPoint, e.f218067a)) {
            return wn3.c.b.AbstractC5674c.C5675b.f214192a;
        }
        if (entryPoint instanceof h) {
            return new wn3.c.b.f(((h) entryPoint).getId());
        }
        if (fr.t.c(entryPoint, i.f218077a)) {
            return wn3.c.b.g.f214198a;
        }
        if (fr.t.c(entryPoint, j.f218079a)) {
            return wn3.c.b.h.f214199a;
        }
        if (fr.t.c(entryPoint, k.f218081a)) {
            return wn3.c.b.i.f214200a;
        }
        if (fr.t.c(entryPoint, l.f218083a)) {
            return wn3.c.b.j.f214201a;
        }
        if (entryPoint instanceof m) {
            return new wn3.c.b.k(((m) entryPoint).getId());
        }
        if (entryPoint instanceof n) {
            return new wn3.c.b.l(((n) entryPoint).getBundleId());
        }
        if (fr.t.c(entryPoint, o.f218089a)) {
            return wn3.c.b.m.f214204a;
        }
        if (fr.t.c(entryPoint, p.f218091a)) {
            return wn3.c.b.n.f214205a;
        }
        if (fr.t.c(entryPoint, q.f218093a)) {
            return wn3.c.b.o.f214206a;
        }
        if (fr.t.c(entryPoint, r.f218095a)) {
            return wn3.c.b.p.f214207a;
        }
        if (entryPoint instanceof t) {
            return new wn3.c.b.Wru(((t) entryPoint).getLicenceType());
        }
        if (entryPoint instanceof s) {
            return new wn3.c.b.WithDeeplink(((s) entryPoint).getData());
        }
        if (entryPoint instanceof DynamicMultiDocument) {
            DynamicMultiDocument dynamicMultiDocument = (DynamicMultiDocument) entryPoint;
            return new wn3.c.b.DynamicMultiDocument(dynamicMultiDocument.getDocumentId(), dynamicMultiDocument.getDocumentType());
        }
        if (!(entryPoint instanceof DynamicDocument)) {
            throw new oq.p();
        }
        DynamicDocument dynamicDocument = (DynamicDocument) entryPoint;
        return new wn3.c.b.DynamicDocument(dynamicDocument.getDocumentIID(), dynamicDocument.getDocumentType());
    }
}
