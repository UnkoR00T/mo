package p060i1;

import a1.o;
import b3.f;
import b3.x;
import c5.c;
import c5.d;
import c5.h;
import er.p;
import fr.m0;
import java.util.Map;
import ju.q0;
import lr.m;
import oq.i0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.x0;
import p056h1.p1;
import p071kotlin.Metadata;
import p076m2.r;
import p076m2.t;
import p143z0.a2;
import p143z0.h2;
import pq.v;
import pq.v0;
import tq.e;
import tq.j;
import u0.e2;
import u0.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000_\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\n*\u0001$\u001a1\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0014\u0010\n\u001a\u00020\t*\u00020\u0006H\u0080@¢\u0006\u0004\b\n\u0010\u000b\u001a\u0014\u0010\f\u001a\u00020\t*\u00020\u0006H\u0080@¢\u0006\u0004\b\f\u0010\u000b\u001a\u001b\u0010\u000f\u001a\u00020\u000e*\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001b\u0010\u0012\u001a\u00020\u000e*\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001aL\u0010\u001c\u001a\u00020\t*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00022\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u00172\u0018\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\t0\u0019H\u0082@¢\u0006\u0004\b\u001c\u0010\u001d\"\u001a\u0010#\u001a\u00020\u001e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&\"\u001a\u0010,\u001a\u00020\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+¨\u0006-"}, d2 = {"", "initialPage", "", "initialPageOffsetFraction", "Lkotlin/Function0;", "pageCount", "Li1/i1;", "n", "(IFLer/a;Lm2/r;II)Li1/i1;", "Loq/i0;", "h", "(Li1/i1;Ltq/e;)Ljava/lang/Object;", "i", "Li1/g0;", "", "j", "(Li1/g0;I)J", "Li1/u0;", "k", "(Li1/u0;I)J", "Lh1/p1;", "targetPage", "targetPageOffsetToSnappedPosition", "Lu0/l;", "animationSpec", "Lkotlin/Function2;", "Lz0/h2;", "updateTargetPage", "f", "(Lh1/p1;IFLu0/l;Ler/p;Ltq/e;)Ljava/lang/Object;", "Lc5/h;", "a", "F", "l", "()F", "DefaultPositionThreshold", "i1/m1$b", "b", "Li1/m1$b;", "UnitDensity", "c", "Li1/u0;", "m", "()Li1/u0;", "EmptyLayoutInfo", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f87960a = h.n(56);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final b f87961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final u0 f87962c;

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0016X\u0096D¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00058\u0016X\u0096D¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR,\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u000e8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"i1/m1$a", "Le4/x0;", "Loq/i0;", "k", "()V", "", "a", "I", "l", "()I", "width", "b", "getHeight", "height", "", "Le4/a;", "c", "Ljava/util/Map;", "i", "()Ljava/util/Map;", "getAlignmentLines$annotations", "alignmentLines", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements x0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int width;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int height;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final Map<p036e4.a, Integer> alignmentLines = v0.i();

        a() {
        }

        @Override // p036e4.x0
        public int getHeight() {
            return this.height;
        }

        @Override // p036e4.x0
        public Map<p036e4.a, Integer> i() {
            return this.alignmentLines;
        }

        @Override // p036e4.x0
        public void k() {
        }

        @Override // p036e4.x0
        /* JADX INFO: renamed from: l, reason: from getter */
        public int getWidth() {
            return this.width;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006¨\u0006\u000b"}, d2 = {"i1/m1$b", "Lc5/d;", "", "a", "F", "getDensity", "()F", "density", "b", "i2", "fontScale", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final float density = 1.0f;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final float fontScale = 1.0f;

        b() {
        }

        @Override // c5.d
        public float getDensity() {
            return this.density;
        }

        @Override // c5.l
        /* JADX INFO: renamed from: i2, reason: from getter */
        public float getFontScale() {
            return this.fontScale;
        }
    }

    static {
        b bVar = new b();
        f87961b = bVar;
        f87962c = new u0(v.n(), 0, 0, 0, a2.Horizontal, 0, 0, false, 0, null, null, 0.0f, 0, false, o.b.f1227a, new a(), false, null, null, q0.a(j.f191408a), bVar, c.b(0, 0, 0, 0, 15, null), 393216, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object f(final p1 p1Var, int i15, float f15, l<Float> lVar, p<? super h2, ? super Integer, i0> pVar, e<? super i0> eVar) {
        pVar.B(p1Var, vq.b.e(i15));
        boolean z15 = i15 > p1Var.h();
        int iB = (p1Var.b() - p1Var.h()) + 1;
        if (((z15 && i15 > p1Var.b()) || (!z15 && i15 < p1Var.h())) && Math.abs(i15 - p1Var.h()) >= 3) {
            p1Var.c(z15 ? m.e(i15 - iB, p1Var.h()) : m.j(iB + i15, p1Var.h()), 0);
        }
        float fE = p1.e(p1Var, i15, 0, 2, null) + f15;
        final m0 m0Var = new m0();
        Object objM = e2.m(0.0f, fE, 0.0f, lVar, new p() { // from class: i1.l1
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return m1.g(m0Var, p1Var, ((Float) obj).floatValue(), ((Float) obj2).floatValue());
            }
        }, eVar, 4, null);
        return objM == uq.b.e() ? objM : i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(m0 m0Var, p1 p1Var, float f15, float f16) {
        m0Var.f66406a += p1Var.d(f15 - m0Var.f66406a);
        return i0.f148189a;
    }

    public static final Object h(i1 i1Var, e<? super i0> eVar) {
        Object objP;
        return (i1Var.A() + 1 >= i1Var.N() || (objP = i1.p(i1Var, i1Var.A() + 1, 0.0f, null, eVar, 6, null)) != uq.b.e()) ? i0.f148189a : objP;
    }

    public static final Object i(i1 i1Var, e<? super i0> eVar) {
        Object objP;
        return (i1Var.A() + (-1) < 0 || (objP = i1.p(i1Var, i1Var.A() + (-1), 0.0f, null, eVar, 6, null)) != uq.b.e()) ? i0.f148189a : objP;
    }

    public static final long j(g0 g0Var, int i15) {
        long pageSpacing = (((((long) i15) * ((long) (g0Var.getPageSpacing() + g0Var.getPageSize()))) + ((long) g0Var.f())) + ((long) g0Var.getAfterContentPadding())) - ((long) g0Var.getPageSpacing());
        int iB = (int) (g0Var.getOrientation() == a2.Horizontal ? g0Var.b() >> 32 : g0Var.b() & BodyPartID.bodyIdMax);
        return m.f(pageSpacing - ((long) (iB - m.n(g0Var.getSnapPosition().a(iB, g0Var.getPageSize(), g0Var.f(), g0Var.getAfterContentPadding(), i15 - 1, i15), 0, iB))), 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long k(u0 u0Var, int i15) {
        int iB = (int) (u0Var.getOrientation() == a2.Horizontal ? u0Var.b() >> 32 : u0Var.b() & BodyPartID.bodyIdMax);
        return m.n(u0Var.getSnapPosition().a(iB, u0Var.getPageSize(), u0Var.f(), u0Var.getAfterContentPadding(), 0, i15), 0, iB);
    }

    public static final float l() {
        return f87960a;
    }

    public static final u0 m() {
        return f87962c;
    }

    public static final i1 n(final int i15, final float f15, final er.a<Integer> aVar, r rVar, int i16, int i17) {
        if ((i17 & 1) != 0) {
            i15 = 0;
        }
        if ((i17 & 2) != 0) {
            f15 = 0.0f;
        }
        if (t.k()) {
            t.o(-1210768637, i16, -1, "androidx.compose.foundation.pager.rememberPagerState (PagerState.kt:93)");
        }
        Object[] objArr = new Object[0];
        x<e, ?> xVarA = e.INSTANCE.a();
        boolean z15 = true;
        boolean z16 = ((((i16 & 14) ^ 6) > 4 && rVar.c(i15)) || (i16 & 6) == 4) | ((((i16 & 112) ^ 48) > 32 && rVar.b(f15)) || (i16 & 48) == 32);
        if ((((i16 & 896) ^ MLKEMEngine.KyberPolyBytes) <= 256 || !rVar.W(aVar)) && (i16 & MLKEMEngine.KyberPolyBytes) != 256) {
            z15 = false;
        }
        boolean z17 = z16 | z15;
        Object objE = rVar.E();
        if (z17 || objE == r.INSTANCE.a()) {
            objE = new er.a() { // from class: i1.k1
                @Override // er.a
                public final Object a() {
                    return m1.o(i15, f15, aVar);
                }
            };
            rVar.v(objE);
        }
        e eVar = (e) f.i(objArr, xVarA, (er.a) objE, rVar, 0);
        eVar.H0().setValue(aVar);
        if (t.k()) {
            t.n();
        }
        return eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e o(int i15, float f15, er.a aVar) {
        return new e(i15, f15, aVar);
    }
}
