package p046f2;

import c5.h;
import er.l;
import f3.m;
import g4.e;
import g4.f;
import g4.z;
import java.util.LinkedHashMap;
import java.util.Map;
import oq.i0;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p036e4.a;
import p036e4.a2;
import p036e4.v0;
import p036e4.x0;
import p036e4.y0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0017\u001a\u00020\u0016*\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R$\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lf2/oe;", "Lf3/m$c;", "Lg4/e;", "Lg4/z;", "<init>", "()V", "", "sizePx", "Le4/a2;", "placeable", "Loq/i0;", "q3", "(ILe4/a2;)V", "", "Le4/a;", "o3", "()Ljava/util/Map;", "Le4/y0;", "Le4/v0;", "measurable", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "Le4/x0;", "c", "(Le4/y0;Le4/v0;J)Le4/x0;", "r", "Ljava/util/Map;", "alignmentLinesCache", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class oe extends m.c implements e, z {

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private Map<a, Integer> alignmentLinesCache;

    private final Map<a, Integer> o3() {
        Map<a, Integer> map = this.alignmentLinesCache;
        if (map != null) {
            return map;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(2);
        this.alignmentLinesCache = linkedHashMap;
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p3(int i15, a2 a2Var, int i16, a2.a aVar) {
        a2.a.E(aVar, a2Var, hr.a.d((i15 - a2Var.getWidth()) / 2.0f), hr.a.d((i16 - a2Var.getHeight()) / 2.0f), 0.0f, 4, null);
        return i0.f148189a;
    }

    private final void q3(int sizePx, a2 placeable) {
        Map<a, Integer> mapO3 = o3();
        mapO3.put(hd.g(), Integer.valueOf(lr.m.e(Math.round((sizePx - placeable.getWidth()) / 2.0f), 0)));
        mapO3.put(hd.h(), Integer.valueOf(lr.m.e(Math.round((sizePx - placeable.getHeight()) / 2.0f), 0)));
    }

    @Override // g4.z
    public x0 c(y0 y0Var, v0 v0Var, long j15) {
        float f15 = 0;
        float fN = h.n(lr.m.d(((h) f.a(this, hd.f())).getValue(), h.n(f15)));
        final a2 a2VarO0 = v0Var.o0(j15);
        boolean z15 = getIsAttached() && !Float.isNaN(fN) && h.l(fN, h.n(f15)) > 0;
        int iX0 = Float.isNaN(fN) ? 0 : y0Var.X0(fN);
        final int iMax = z15 ? Math.max(a2VarO0.getWidth(), iX0) : a2VarO0.getWidth();
        final int iMax2 = z15 ? Math.max(a2VarO0.getHeight(), iX0) : a2VarO0.getHeight();
        if (z15) {
            q3(iX0, a2VarO0);
        }
        Map<a, Integer> mapI = this.alignmentLinesCache;
        if (mapI == null) {
            mapI = pq.v0.i();
        }
        return y0Var.x1(iMax, iMax2, mapI, new l() { // from class: f2.ne
            @Override // er.l
            public final Object b(Object obj) {
                return oe.p3(iMax, a2VarO0, iMax2, (a2.a) obj);
            }
        });
    }
}
