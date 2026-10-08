package w0;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import p076m2.x5;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0019\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001a\u0010\u0017J3\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J<\u0010'\u001a\u00020\f2\u0006\u0010\"\u001a\u00020!2\"\u0010&\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020!\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0$\u0012\u0006\u0012\u0004\u0018\u00010%0#H\u0096@¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\f2\u0006\u0010*\u001a\u00020)H\u0000¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u000fH\u0000¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\fH\u0000¢\u0006\u0004\b/\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u00100R\u0016\u00103\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00106\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u00105R \u0010<\u001a\b\u0012\u0004\u0012\u00020\f078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R(\u0010D\u001a\u00020\u00118\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b=\u0010>\u0012\u0004\bC\u0010\u000e\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u0016\u0010F\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010>R\u0016\u0010G\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u00102R\u0016\u0010I\u001a\u00020H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u00102R\u0014\u0010L\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010KR\u001a\u0010Q\u001a\u00020M8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u0010N\u001a\u0004\bO\u0010PR\u0014\u0010R\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u0010@¨\u0006S"}, d2 = {"Lw0/d;", "Lw0/g2;", "Landroid/content/Context;", "context", "Lc5/d;", "density", "Landroidx/compose/ui/graphics/Color;", "glowColor", "Ld1/d3;", "glowDrawPadding", "<init>", "(Landroid/content/Context;Lc5/d;JLd1/d3;Lfr/k;)V", "Loq/i0;", "g", "()V", "Lm3/e;", "delta", "", "o", "(J)Z", "scroll", "", "n", "(J)F", "k", "l", "m", "Lz3/g;", "source", "Lkotlin/Function1;", "performScroll", "c", "(JILer/l;)J", "Lc5/y;", "velocity", "Lkotlin/Function2;", "Ltq/e;", "", "performFling", "a", "(JLer/p;Ltq/e;)Ljava/lang/Object;", "Lm3/k;", "size", "p", "(J)V", "h", "()J", "j", "Lc5/d;", "b", "J", "pointerPosition", "Lw0/m0;", "Lw0/m0;", "edgeEffectWrapper", "Lm2/a3;", "d", "Lm2/a3;", "i", "()Lm2/a3;", "redrawSignal", "e", "Z", "getInvalidationEnabled$foundation", "()Z", "setInvalidationEnabled$foundation", "(Z)V", "getInvalidationEnabled$foundation$annotations", "invalidationEnabled", "f", "scrollCycleInProgress", "containerSize", "La4/a0;", "pointerId", "La4/y0;", "La4/y0;", "pointerInputNode", "Lg4/g;", "Lg4/g;", "r", "()Lg4/g;", "node", "isInProgress", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d implements g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c5.d density;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private long pointerPosition;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final m0 edgeEffectWrapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final p076m2.a3<oq.i0> redrawSignal;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean invalidationEnabled;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean scrollCycleInProgress;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private long containerSize;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private long pointerId;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final a4.y0 pointerInputNode;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final g4.g node;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        long f208863d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f208864e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f208866g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f208864e = obj;
            this.f208866g |= PKIFailureInfo.systemUnavail;
            return d.this.a(0L, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements PointerInputEventHandler {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"La4/c;", "Loq/i0;", "<anonymous>", "(La4/c;)V"}, k = 3, mv = {2, 1, 0})
        static final class a extends vq.i implements er.p<a4.c, tq.e<? super oq.i0>, Object> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int f208868c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private /* synthetic */ Object f208869d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ d f208870e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d dVar, tq.e<? super a> eVar) {
                super(2, eVar);
                this.f208870e = dVar;
            }

            /* JADX WARN: Code duplicated, block: B:26:0x0096  */
            /* JADX WARN: Code duplicated, block: B:29:0x00ac A[LOOP:1: B:25:0x0094->B:29:0x00ac, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:44:0x00b0 A[EDGE_INSN: B:44:0x00b0->B:31:0x00b0 BREAK  A[LOOP:1: B:25:0x0094->B:29:0x00ac], SYNTHETIC] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x005e -> B:18:0x0061). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // vq.a
            public final java.lang.Object J(java.lang.Object r15) {
                /*
                    Method dump skipped, instruction units count: 227
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: w0.d.b.a.J(java.lang.Object):java.lang.Object");
            }

            @Override // er.p
            /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
            public final Object B(a4.c cVar, tq.e<? super oq.i0> eVar) {
                return ((a) v(cVar, eVar)).J(oq.i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
                a aVar = new a(this.f208870e, eVar);
                aVar.f208869d = obj;
                return aVar;
            }
        }

        b() {
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(a4.k0 k0Var, tq.e<? super oq.i0> eVar) {
            Object objD = p143z0.g1.d(k0Var, new a(d.this, null), eVar);
            return objD == uq.b.e() ? objD : oq.i0.f148189a;
        }
    }

    public /* synthetic */ d(Context context, c5.d dVar, long j15, d1.d3 d3Var, fr.k kVar) {
        this(context, dVar, j15, d3Var);
    }

    private final void g() {
        boolean z15;
        m0 m0Var = this.edgeEffectWrapper;
        EdgeEffect edgeEffect = m0Var.topEffect;
        boolean z16 = true;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z15 = !edgeEffect.isFinished();
        } else {
            z15 = false;
        }
        EdgeEffect edgeEffect2 = m0Var.bottomEffect;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z15 = !edgeEffect2.isFinished() || z15;
        }
        EdgeEffect edgeEffect3 = m0Var.leftEffect;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z15 = !edgeEffect3.isFinished() || z15;
        }
        EdgeEffect edgeEffect4 = m0Var.rightEffect;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (edgeEffect4.isFinished() && !z15) {
                z16 = false;
            }
            z15 = z16;
        }
        if (z15) {
            j();
        }
    }

    private final float k(long scroll) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (h() >> 32));
        int i15 = (int) (scroll & BodyPartID.bodyIdMax);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i15) / Float.intBitsToFloat((int) (this.containerSize & BodyPartID.bodyIdMax));
        EdgeEffect edgeEffectG = this.edgeEffectWrapper.g();
        k0 k0Var = k0.f208985a;
        return k0Var.c(edgeEffectG) == 0.0f ? (-k0Var.e(edgeEffectG, -fIntBitsToFloat2, 1 - fIntBitsToFloat)) * Float.intBitsToFloat((int) (this.containerSize & BodyPartID.bodyIdMax)) : Float.intBitsToFloat(i15);
    }

    private final float l(long scroll) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (h() & BodyPartID.bodyIdMax));
        int i15 = (int) (scroll >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i15) / Float.intBitsToFloat((int) (this.containerSize >> 32));
        EdgeEffect edgeEffectI = this.edgeEffectWrapper.i();
        k0 k0Var = k0.f208985a;
        return k0Var.c(edgeEffectI) == 0.0f ? k0Var.e(edgeEffectI, fIntBitsToFloat2, 1 - fIntBitsToFloat) * Float.intBitsToFloat((int) (this.containerSize >> 32)) : Float.intBitsToFloat(i15);
    }

    private final float m(long scroll) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (h() & BodyPartID.bodyIdMax));
        int i15 = (int) (scroll >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i15) / Float.intBitsToFloat((int) (this.containerSize >> 32));
        EdgeEffect edgeEffectK = this.edgeEffectWrapper.k();
        k0 k0Var = k0.f208985a;
        return k0Var.c(edgeEffectK) == 0.0f ? (-k0Var.e(edgeEffectK, -fIntBitsToFloat2, fIntBitsToFloat)) * Float.intBitsToFloat((int) (this.containerSize >> 32)) : Float.intBitsToFloat(i15);
    }

    private final float n(long scroll) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (h() >> 32));
        int i15 = (int) (scroll & BodyPartID.bodyIdMax);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i15) / Float.intBitsToFloat((int) (this.containerSize & BodyPartID.bodyIdMax));
        EdgeEffect edgeEffectM = this.edgeEffectWrapper.m();
        k0 k0Var = k0.f208985a;
        return k0Var.c(edgeEffectM) == 0.0f ? k0Var.e(edgeEffectM, fIntBitsToFloat2, fIntBitsToFloat) * Float.intBitsToFloat((int) (this.containerSize & BodyPartID.bodyIdMax)) : Float.intBitsToFloat(i15);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x002d  */
    private final boolean o(long delta) {
        boolean zS;
        if (this.edgeEffectWrapper.s()) {
            int i15 = (int) (delta >> 32);
            if (Float.intBitsToFloat(i15) < 0.0f) {
                k0.f208985a.f(this.edgeEffectWrapper.i(), Float.intBitsToFloat(i15));
                zS = this.edgeEffectWrapper.s();
            } else {
                zS = false;
            }
        } else {
            zS = false;
        }
        if (this.edgeEffectWrapper.v()) {
            int i16 = (int) (delta >> 32);
            if (Float.intBitsToFloat(i16) > 0.0f) {
                k0.f208985a.f(this.edgeEffectWrapper.k(), Float.intBitsToFloat(i16));
                zS = zS || this.edgeEffectWrapper.v();
            }
        }
        if (this.edgeEffectWrapper.z()) {
            int i17 = (int) (delta & BodyPartID.bodyIdMax);
            if (Float.intBitsToFloat(i17) < 0.0f) {
                k0.f208985a.f(this.edgeEffectWrapper.m(), Float.intBitsToFloat(i17));
                zS = zS || this.edgeEffectWrapper.z();
            }
        }
        if (this.edgeEffectWrapper.p()) {
            int i18 = (int) (delta & BodyPartID.bodyIdMax);
            if (Float.intBitsToFloat(i18) > 0.0f) {
                k0.f208985a.f(this.edgeEffectWrapper.g(), Float.intBitsToFloat(i18));
                return zS || this.edgeEffectWrapper.p();
            }
        }
        return zS;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
    
        if (r14.B(r12, r0) == r1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0134, code lost:
    
        if (r15 == r1) goto L50;
     */
    @Override // w0.g2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(long r12, er.p<? super c5.y, ? super tq.e<? super c5.y>, ? extends java.lang.Object> r14, tq.e<? super oq.i0> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.d.a(long, er.p, tq.e):java.lang.Object");
    }

    @Override // w0.g2
    public boolean b() {
        m0 m0Var = this.edgeEffectWrapper;
        EdgeEffect edgeEffect = m0Var.topEffect;
        if (edgeEffect != null && k0.f208985a.c(edgeEffect) != 0.0f) {
            return true;
        }
        EdgeEffect edgeEffect2 = m0Var.bottomEffect;
        if (edgeEffect2 != null && k0.f208985a.c(edgeEffect2) != 0.0f) {
            return true;
        }
        EdgeEffect edgeEffect3 = m0Var.leftEffect;
        if (edgeEffect3 != null && k0.f208985a.c(edgeEffect3) != 0.0f) {
            return true;
        }
        EdgeEffect edgeEffect4 = m0Var.rightEffect;
        return (edgeEffect4 == null || k0.f208985a.c(edgeEffect4) == 0.0f) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x022a  */
    /* JADX WARN: Code duplicated, block: B:105:0x022f  */
    /* JADX WARN: Code duplicated, block: B:107:0x0237  */
    /* JADX WARN: Code duplicated, block: B:108:0x023b  */
    /* JADX WARN: Code duplicated, block: B:110:0x023e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:112:0x0242  */
    /* JADX WARN: Code duplicated, block: B:23:0x0081  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b8 A[PHI: r11
      0x00b8: PHI (r11v9 float) = (r11v8 float), (r11v12 float) binds: [B:43:0x00e9, B:32:0x00b1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:58:0x0132 A[PHI: r14
      0x0132: PHI (r14v9 float) = (r14v8 float), (r14v12 float) binds: [B:67:0x0162, B:56:0x012b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // w0.g2
    public long c(long delta, int source, er.l<? super m3.e, m3.e> performScroll) {
        float fK;
        float fIntBitsToFloat;
        float fM;
        float fIntBitsToFloat2;
        boolean z15;
        boolean z16;
        int i15;
        boolean z17;
        if (m3.k.k(this.containerSize)) {
            return performScroll.b(m3.e.d(delta)).getPackedValue();
        }
        if (!this.scrollCycleInProgress) {
            if (this.edgeEffectWrapper.u()) {
                l(m3.e.INSTANCE.c());
            }
            if (this.edgeEffectWrapper.x()) {
                m(m3.e.INSTANCE.c());
            }
            if (this.edgeEffectWrapper.B()) {
                n(m3.e.INSTANCE.c());
            }
            if (this.edgeEffectWrapper.r()) {
                k(m3.e.INSTANCE.c());
            }
            this.scrollCycleInProgress = true;
        }
        float fC = f.c(source);
        long jR = m3.e.r(delta, fC);
        int i16 = (int) (delta & BodyPartID.bodyIdMax);
        if (Float.intBitsToFloat(i16) == 0.0f) {
            fIntBitsToFloat = 0.0f;
        } else if (this.edgeEffectWrapper.B() && Float.intBitsToFloat(i16) < 0.0f) {
            fK = n(jR);
            if (!this.edgeEffectWrapper.B()) {
                this.edgeEffectWrapper.m().finish();
            }
            if (fK == Float.intBitsToFloat((int) (jR & BodyPartID.bodyIdMax))) {
                fIntBitsToFloat = Float.intBitsToFloat(i16);
            } else {
                fIntBitsToFloat = fK / fC;
            }
        } else if (!this.edgeEffectWrapper.r() || Float.intBitsToFloat(i16) <= 0.0f) {
            fIntBitsToFloat = 0.0f;
        } else {
            fK = k(jR);
            if (!this.edgeEffectWrapper.r()) {
                this.edgeEffectWrapper.g().finish();
            }
            if (fK == Float.intBitsToFloat((int) (jR & BodyPartID.bodyIdMax))) {
                fIntBitsToFloat = Float.intBitsToFloat(i16);
            } else {
                fIntBitsToFloat = fK / fC;
            }
        }
        int i17 = (int) (delta >> 32);
        if (Float.intBitsToFloat(i17) == 0.0f) {
            fIntBitsToFloat2 = 0.0f;
        } else if (this.edgeEffectWrapper.u() && Float.intBitsToFloat(i17) < 0.0f) {
            fM = l(jR);
            if (!this.edgeEffectWrapper.u()) {
                this.edgeEffectWrapper.i().finish();
            }
            if (fM == Float.intBitsToFloat((int) (jR >> 32))) {
                fIntBitsToFloat2 = Float.intBitsToFloat(i17);
            } else {
                fIntBitsToFloat2 = fM / fC;
            }
        } else if (!this.edgeEffectWrapper.x() || Float.intBitsToFloat(i17) <= 0.0f) {
            fIntBitsToFloat2 = 0.0f;
        } else {
            fM = m(jR);
            if (!this.edgeEffectWrapper.x()) {
                this.edgeEffectWrapper.k().finish();
            }
            if (fM == Float.intBitsToFloat((int) (jR >> 32))) {
                fIntBitsToFloat2 = Float.intBitsToFloat(i17);
            } else {
                fIntBitsToFloat2 = fM / fC;
            }
        }
        long jE = m3.e.e((((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & BodyPartID.bodyIdMax));
        m3.e.Companion companion = m3.e.INSTANCE;
        if (!m3.e.j(jE, companion.c())) {
            j();
        }
        long jP = m3.e.p(delta, jE);
        long packedValue = performScroll.b(m3.e.d(jP)).getPackedValue();
        long jP2 = m3.e.p(jP, packedValue);
        if ((Float.intBitsToFloat((int) (jP >> 32)) != 0.0f || Float.intBitsToFloat((int) (jP & BodyPartID.bodyIdMax)) != 0.0f) && (Float.intBitsToFloat((int) (packedValue >> 32)) != 0.0f || Float.intBitsToFloat((int) (packedValue & BodyPartID.bodyIdMax)) != 0.0f)) {
            m0 m0Var = this.edgeEffectWrapper;
            if (m0Var.u() || m0Var.B() || m0Var.x() || m0Var.r()) {
                g();
            }
        }
        if (z3.g.d(source, z3.g.INSTANCE.b())) {
            int i18 = (int) (jP2 >> 32);
            if (Float.intBitsToFloat(i18) > 0.5f) {
                l(jP2);
            } else {
                if (Float.intBitsToFloat(i18) < -0.5f) {
                    m(jP2);
                } else {
                    z16 = false;
                }
                i15 = (int) (jP2 & BodyPartID.bodyIdMax);
                if (Float.intBitsToFloat(i15) > 0.5f) {
                    n(jP2);
                } else {
                    if (Float.intBitsToFloat(i15) < -0.5f) {
                        k(jP2);
                    } else {
                        z17 = false;
                    }
                    if (!z16 || z17) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                }
                z17 = true;
                if (z16) {
                }
                z15 = true;
            }
            z16 = true;
            i15 = (int) (jP2 & BodyPartID.bodyIdMax);
            if (Float.intBitsToFloat(i15) > 0.5f) {
                n(jP2);
            } else {
                if (Float.intBitsToFloat(i15) < -0.5f) {
                    k(jP2);
                } else {
                    z17 = false;
                }
                if (z16) {
                }
                z15 = true;
            }
            z17 = true;
            if (z16) {
            }
            z15 = true;
        } else {
            z15 = false;
        }
        if (!m3.e.j(jP, companion.c())) {
            z15 = o(delta) || z15;
        }
        if (z15) {
            j();
        }
        return m3.e.q(jE, packedValue);
    }

    public final long h() {
        long jB = this.pointerPosition;
        if ((9223372034707292159L & jB) == 9205357640488583168L) {
            jB = m3.l.b(this.containerSize);
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jB >> 32)) / Float.intBitsToFloat((int) (this.containerSize >> 32));
        return m3.e.e((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jB & BodyPartID.bodyIdMax)) / Float.intBitsToFloat((int) (this.containerSize & BodyPartID.bodyIdMax)))) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
    }

    public final p076m2.a3<oq.i0> i() {
        return this.redrawSignal;
    }

    public final void j() {
        if (this.invalidationEnabled) {
            this.redrawSignal.setValue(oq.i0.f148189a);
        }
    }

    public final void p(long size) {
        boolean zF = m3.k.f(this.containerSize, m3.k.INSTANCE.b());
        boolean zF2 = m3.k.f(size, this.containerSize);
        this.containerSize = size;
        if (!zF2) {
            m0 m0Var = this.edgeEffectWrapper;
            int iD = hr.a.d(Float.intBitsToFloat((int) (size >> 32)));
            m0Var.C(c5.r.c((((long) hr.a.d(Float.intBitsToFloat((int) (size & BodyPartID.bodyIdMax)))) & BodyPartID.bodyIdMax) | (((long) iD) << 32)));
        }
        if (zF || zF2) {
            return;
        }
        g();
    }

    @Override // w0.g2
    /* JADX INFO: renamed from: r, reason: from getter */
    public g4.g getNode() {
        return this.node;
    }

    private d(Context context, c5.d dVar, long j15, d1.d3 d3Var) {
        this.density = dVar;
        this.pointerPosition = m3.e.INSTANCE.b();
        m0 m0Var = new m0(context, n3.o1.j(j15));
        this.edgeEffectWrapper = m0Var;
        this.redrawSignal = x5.i(oq.i0.f148189a, x5.k());
        this.invalidationEnabled = true;
        this.containerSize = m3.k.INSTANCE.b();
        this.pointerId = a4.a0.a(-1L);
        a4.y0 y0VarA = a4.w0.a(new b());
        this.pointerInputNode = y0VarA;
        this.node = Build.VERSION.SDK_INT >= 31 ? new l3(y0VarA, this, m0Var) : new a1(y0VarA, this, m0Var, d3Var);
    }
}
