package p046f2;

import h2.z1;
import h7.i;
import java.util.List;
import l2.h0;
import n3.g2;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0007R\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0007R\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014R\u001a\u0010\u001c\u001a\u00020\u00198\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0006\u001a\u0004\b\u001b\u0010\u0007¨\u0006\u001d"}, d2 = {"Lf2/qd;", "", "<init>", "()V", "Lc5/h;", "b", "F", "()F", "ContainerWidth", "c", "a", "ContainerHeight", "d", "getIndicatorSize-D9Ej5fM", "IndicatorSize", "", "Lh7/i;", "e", "Ljava/util/List;", "getIndeterminateIndicatorPolygons", "()Ljava/util/List;", "IndeterminateIndicatorPolygons", "f", "getDeterminateIndicatorPolygons", "DeterminateIndicatorPolygons", "", "g", "getActiveIndicatorScale$material3", "ActiveIndicatorScale", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class qd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final qd f57397a = new qd();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final float ContainerWidth;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final float ContainerHeight;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final float IndicatorSize;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final List<i> IndeterminateIndicatorPolygons;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final List<i> DeterminateIndicatorPolygons;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final float ActiveIndicatorScale;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f57404h;

    static {
        h0 h0Var = h0.f114654a;
        float fC = h0Var.c();
        ContainerWidth = fC;
        float fB = h0Var.b();
        ContainerHeight = fB;
        float fA = h0Var.a();
        IndicatorSize = fA;
        rd.Companion companion = rd.INSTANCE;
        IndeterminateIndicatorPolygons = v.q(companion.o(), companion.k(), companion.m(), companion.n(), companion.p(), companion.j(), companion.l());
        i iVarI = companion.i();
        float[] fArrC = g2.c(null, 1, null);
        g2.m(fArrC, 18.0f);
        i0 i0Var = i0.f148189a;
        DeterminateIndicatorPolygons = v.q(z1.a(iVarI, fArrC), companion.o());
        ActiveIndicatorScale = fA / Math.min(fC, fB);
        f57404h = 8;
    }

    private qd() {
    }

    public final float a() {
        return ContainerHeight;
    }

    public final float b() {
        return ContainerWidth;
    }
}
