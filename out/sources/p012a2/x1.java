package p012a2;

import b1.i;
import c5.h;
import p071kotlin.Metadata;
import tq.e;
import u0.CubicBezierEasing;
import u0.c;
import u0.i0;
import u0.l;
import u0.x2;
import uq.b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a>\u0010\u0007\u001a\u00020\u0006*\f\u0012\u0004\u0012\u00020\u0001\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u0080@¢\u0006\u0004\b\u0007\u0010\b\"\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b\"\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000b\"\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000b¨\u0006\u0011"}, d2 = {"Lu0/c;", "Lc5/h;", "target", "Lb1/i;", "from", "to", "Loq/i0;", "d", "(Lu0/c;FLb1/i;Lb1/i;Ltq/e;)Ljava/lang/Object;", "Lu0/x2;", "a", "Lu0/x2;", "DefaultIncomingSpec", "b", "DefaultOutgoingSpec", "c", "HoveredOutgoingSpec", "material"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final x2<h> f2000a = new x2<>(120, 0, i0.d(), 2, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final x2<h> f2001b = new x2<>(150, 0, new CubicBezierEasing(0.4f, 0.0f, 0.6f, 1.0f), 2, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final x2<h> f2002c = new x2<>(120, 0, new CubicBezierEasing(0.4f, 0.0f, 0.6f, 1.0f), 2, null);

    public static final Object d(c<h, ?> cVar, float f15, i iVar, i iVar2, e<? super oq.i0> eVar) {
        l<h> lVarB;
        if (iVar2 != null) {
            lVarB = w1.f1977a.a(iVar2);
        } else {
            lVarB = iVar != null ? w1.f1977a.b(iVar) : null;
        }
        l<h> lVar = lVarB;
        if (lVar != null) {
            Object objF = c.f(cVar, h.j(f15), lVar, null, null, eVar, 12, null);
            return objF == b.e() ? objF : oq.i0.f148189a;
        }
        Object objT = cVar.t(h.j(f15), eVar);
        return objT == b.e() ? objT : oq.i0.f148189a;
    }
}
