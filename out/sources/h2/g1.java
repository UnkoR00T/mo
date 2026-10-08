package h2;

import p071kotlin.Metadata;
import u0.CubicBezierEasing;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a>\u0010\u0007\u001a\u00020\u0006*\f\u0012\u0004\u0012\u00020\u0001\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u0080@¢\u0006\u0004\b\u0007\u0010\b\"\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b\"\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\"\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000f\"\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000f¨\u0006\u0014"}, d2 = {"Lu0/c;", "Lc5/h;", "target", "Lb1/i;", "from", "to", "Loq/i0;", "d", "(Lu0/c;FLb1/i;Lb1/i;Ltq/e;)Ljava/lang/Object;", "Lu0/g0;", "a", "Lu0/g0;", "OutgoingSpecEasing", "Lu0/x2;", "b", "Lu0/x2;", "DefaultIncomingSpec", "c", "DefaultOutgoingSpec", "HoveredOutgoingSpec", "material3"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final u0.g0 f79768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final u0.x2<c5.h> f79769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final u0.x2<c5.h> f79770c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final u0.x2<c5.h> f79771d;

    static {
        CubicBezierEasing cubicBezierEasing = new CubicBezierEasing(0.4f, 0.0f, 0.6f, 1.0f);
        f79768a = cubicBezierEasing;
        f79769b = new u0.x2<>(120, 0, u0.i0.d(), 2, null);
        f79770c = new u0.x2<>(150, 0, cubicBezierEasing, 2, null);
        f79771d = new u0.x2<>(120, 0, cubicBezierEasing, 2, null);
    }

    public static final Object d(u0.c<c5.h, ?> cVar, float f15, b1.i iVar, b1.i iVar2, tq.e<? super oq.i0> eVar) {
        u0.l<c5.h> lVarB;
        if (iVar2 != null) {
            lVarB = f1.f79760a.a(iVar2);
        } else {
            lVarB = iVar != null ? f1.f79760a.b(iVar) : null;
        }
        u0.l<c5.h> lVar = lVarB;
        if (lVar != null) {
            Object objF = u0.c.f(cVar, c5.h.j(f15), lVar, null, null, eVar, 12, null);
            return objF == uq.b.e() ? objF : oq.i0.f148189a;
        }
        Object objT = cVar.t(c5.h.j(f15), eVar);
        return objT == uq.b.e() ? objT : oq.i0.f148189a;
    }
}
