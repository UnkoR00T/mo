package p056h1;

import c5.h;
import fr.l0;
import fr.m0;
import fr.n0;
import fr.p0;
import lr.m;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import tq.e;
import u0.AnimationState;
import u0.k;
import vq.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a4\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\bH\u0080@¢\u0006\u0004\b\u000b\u0010\f\"\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\"\u0014\u0010\u0012\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000f\"\u0014\u0010\u0013\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000f¨\u0006\u0014"}, d2 = {"Lh1/p1;", "", "index", "", "g", "(Lh1/p1;I)Z", "scrollOffset", "numOfItemsForTeleport", "Lc5/d;", "density", "Loq/i0;", "c", "(Lh1/p1;IIILc5/d;Ltq/e;)Ljava/lang/Object;", "Lc5/h;", "a", "F", "TargetDistance", "b", "BoundDistance", "MinimumDistance", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f79538a = h.n(2500);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f79539b = h.n(1500);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f79540c = h.n(50);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f79541d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f79542e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f79543f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f79544g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f79545h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f79546j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f79547k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f79548l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        float f79549m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        float f79550n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        float f79551p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f79552q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f79553r;

        a(e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f79552q = obj;
            this.f79553r |= PKIFailureInfo.systemUnavail;
            return s1.c(null, 0, 0, 0, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00ea A[Catch: p -> 0x01ec, TryCatch #1 {p -> 0x01ec, blocks: (B:35:0x00e6, B:37:0x00ea, B:39:0x00f0, B:53:0x0121, B:57:0x015d, B:61:0x0165), top: B:107:0x00e6 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x011a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x011c  */
    /* JADX WARN: Code duplicated, block: B:55:0x015a  */
    /* JADX WARN: Code duplicated, block: B:56:0x015c  */
    /* JADX WARN: Code duplicated, block: B:59:0x0160  */
    /* JADX WARN: Code duplicated, block: B:60:0x0163  */
    /* JADX WARN: Code duplicated, block: B:70:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [T, u0.n] */
    /* JADX WARN: Type inference failed for: r8v16, types: [T, u0.n] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x01b5 -> B:18:0x0072). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object c(p056h1.p1 r37, int r38, int r39, int r40, c5.d r41, tq.e<? super oq.i0> r42) {
        /*
            Method dump skipped, instruction units count: 643
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p056h1.s1.c(h1.p1, int, int, int, c5.d, tq.e):java.lang.Object");
    }

    private static final boolean d(boolean z15, p1 p1Var, int i15, int i16) {
        if (z15) {
            if (p1Var.h() > i15) {
                return true;
            }
            return p1Var.h() == i15 && p1Var.g() > i16;
        }
        if (p1Var.h() < i15) {
            return true;
        }
        return p1Var.h() == i15 && p1Var.g() < i16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final i0 e(p1 p1Var, int i15, float f15, m0 m0Var, l0 l0Var, boolean z15, float f16, n0 n0Var, int i16, int i17, p0 p0Var, k kVar) {
        if (!g(p1Var, i15)) {
            float fI = (f15 > 0.0f ? m.i(((Number) kVar.e()).floatValue(), f15) : m.d(((Number) kVar.e()).floatValue(), f15)) - m0Var.f66406a;
            float fD = p1Var.d(fI);
            if (!g(p1Var, i15) && !d(z15, p1Var, i15, i17)) {
                if (fI != fD) {
                    kVar.a();
                    l0Var.f66404a = false;
                    return i0.f148189a;
                }
                m0Var.f66406a += fI;
                if (z15) {
                    if (((Number) kVar.e()).floatValue() > f16) {
                        kVar.a();
                    }
                } else if (((Number) kVar.e()).floatValue() < (-f16)) {
                    kVar.a();
                }
                if (z15) {
                    if (n0Var.f66407a >= 2 && i15 - p1Var.b() > i16) {
                        p1Var.c(i15 - i16, 0);
                    }
                } else if (n0Var.f66407a >= 2 && p1Var.h() - i15 > i16) {
                    p1Var.c(i16 + i15, 0);
                }
            }
        }
        if (!d(z15, p1Var, i15, i17)) {
            if (g(p1Var, i15)) {
                throw new p(p1.e(p1Var, i15, 0, 2, null), (AnimationState) p0Var.f66410a);
            }
            return i0.f148189a;
        }
        p1Var.c(i15, i17);
        l0Var.f66404a = false;
        kVar.a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(float f15, m0 m0Var, p1 p1Var, k kVar) {
        float fD = 0.0f;
        if (f15 > 0.0f) {
            fD = m.i(((Number) kVar.e()).floatValue(), f15);
        } else if (f15 < 0.0f) {
            fD = m.d(((Number) kVar.e()).floatValue(), f15);
        }
        float f16 = fD - m0Var.f66406a;
        if (f16 != p1Var.d(f16) || fD != ((Number) kVar.e()).floatValue()) {
            kVar.a();
        }
        m0Var.f66406a += f16;
        return i0.f148189a;
    }

    public static final boolean g(p1 p1Var, int i15) {
        return i15 <= p1Var.b() && p1Var.h() <= i15;
    }
}
