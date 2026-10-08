package ms;

import js.f0;
import qs.z;

/* JADX INFO: loaded from: classes4.dex */
public final class c {
    public static final k c(k kVar, p pVar) {
        return new k(kVar.a(), pVar, kVar.c());
    }

    private static final k d(k kVar, vr.m mVar, z zVar, int i15, oq.k<f0> kVar2) {
        return new k(kVar.a(), zVar != null ? new m(kVar, mVar, zVar, i15) : kVar.f(), kVar2);
    }

    public static final k e(k kVar, vr.g gVar, z zVar, int i15) {
        return d(kVar, gVar, zVar, i15, oq.l.b(oq.o.NONE, new a(kVar, gVar)));
    }

    public static /* synthetic */ k f(k kVar, vr.g gVar, z zVar, int i15, int i16, Object obj) {
        if ((i16 & 2) != 0) {
            zVar = null;
        }
        if ((i16 & 4) != 0) {
            i15 = 0;
        }
        return e(kVar, gVar, zVar, i15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 g(k kVar, vr.g gVar) {
        return j(kVar, gVar.getAnnotations());
    }

    public static final k h(k kVar, vr.m mVar, z zVar, int i15) {
        return d(kVar, mVar, zVar, i15, kVar.c());
    }

    public static /* synthetic */ k i(k kVar, vr.m mVar, z zVar, int i15, int i16, Object obj) {
        if ((i16 & 4) != 0) {
            i15 = 0;
        }
        return h(kVar, mVar, zVar, i15);
    }

    public static final f0 j(k kVar, wr.h hVar) {
        return kVar.a().a().d(kVar.b(), hVar);
    }

    public static final k k(k kVar, wr.h hVar) {
        return hVar.isEmpty() ? kVar : new k(kVar.a(), kVar.f(), oq.l.b(oq.o.NONE, new b(kVar, hVar)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 l(k kVar, wr.h hVar) {
        return j(kVar, hVar);
    }

    public static final k m(k kVar, d dVar) {
        return new k(dVar, kVar.f(), kVar.c());
    }
}
