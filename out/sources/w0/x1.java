package w0;

import android.view.View;
import p071kotlin.Metadata;
import p076m2.f6;
import p076m2.x5;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0091\u0001\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006\u0012\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001e\u0010\u001cJ\u0085\u0001\u0010\u001f\u001a\u00020\f2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00102\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\u00062\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\fH\u0016¢\u0006\u0004\b!\u0010\u001cJ\u000f\u0010\"\u001a\u00020\fH\u0016¢\u0006\u0004\b\"\u0010\u001cJ\u000f\u0010#\u001a\u00020\fH\u0016¢\u0006\u0004\b#\u0010\u001cJ\u0013\u0010%\u001a\u00020\f*\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\f2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J\u0013\u0010,\u001a\u00020\f*\u00020+H\u0016¢\u0006\u0004\b,\u0010-R.\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R0\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010/\u001a\u0004\b5\u00101\"\u0004\b6\u00103R0\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u0010/\u001a\u0004\b8\u00101\"\u0004\b9\u00103R\"\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\"\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010;\u001a\u0004\bL\u0010=\"\u0004\bM\u0010?R\"\u0010\u0015\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010;\u001a\u0004\bO\u0010=\"\u0004\bP\u0010?R\"\u0010\u0016\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010A\u001a\u0004\bR\u0010C\"\u0004\bS\u0010ER\"\u0010\u0018\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\u0018\u0010]\u001a\u0004\u0018\u00010Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0018\u0010`\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u0018\u0010d\u001a\u0004\u0018\u00010a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR/\u0010j\u001a\u0004\u0018\u00010'2\b\u0010e\u001a\u0004\u0018\u00010'8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b;\u0010f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010*R\u001e\u0010n\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010k8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010mR\u0016\u0010p\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010GR\u0018\u0010t\u001a\u0004\u0018\u00010q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010sR\u001e\u0010x\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010u8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010wR\u0014\u0010z\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\by\u0010I¨\u0006{"}, d2 = {"Lw0/x1;", "Lf3/m$c;", "Lg4/s;", "Lg4/q;", "Lg4/i1;", "Lg4/v0;", "Lkotlin/Function1;", "Lc5/d;", "Lm3/e;", "sourceCenter", "magnifierCenter", "Lc5/k;", "Loq/i0;", "onSizeChanged", "", "zoom", "", "useTextDefault", "size", "Lc5/h;", "cornerRadius", "elevation", "clippingEnabled", "Lw0/l2;", "platformMagnifierFactory", "<init>", "(Ler/l;Ler/l;Ler/l;FZJFFZLw0/l2;Lfr/k;)V", "w3", "()V", "z3", "A3", "y3", "(Ler/l;Ler/l;FZJFFZLer/l;Lw0/l2;)V", "W2", "X2", "T0", "Lp3/c;", "y", "(Lp3/c;)V", "Le4/b0;", "coordinates", "h", "(Le4/b0;)V", "Ln4/i0;", "E2", "(Ln4/i0;)V", "r", "Ler/l;", "getSourceCenter", "()Ler/l;", "setSourceCenter", "(Ler/l;)V", "s", "getMagnifierCenter", "setMagnifierCenter", "t", "getOnSizeChanged", "setOnSizeChanged", "v", "F", "getZoom", "()F", "setZoom", "(F)V", "w", "Z", "getUseTextDefault", "()Z", "setUseTextDefault", "(Z)V", "x", "J", "getSize-MYxV2XQ", "()J", "setSize-EaSLcWc", "(J)V", "getCornerRadius-D9Ej5fM", "setCornerRadius-0680j_4", "z", "getElevation-D9Ej5fM", "setElevation-0680j_4", "A", "getClippingEnabled", "setClippingEnabled", "B", "Lw0/l2;", "getPlatformMagnifierFactory", "()Lw0/l2;", "setPlatformMagnifierFactory", "(Lw0/l2;)V", "Landroid/view/View;", "C", "Landroid/view/View;", "view", ip.a.f96138c, "Lc5/d;", "density", "Lw0/k2;", "E", "Lw0/k2;", "magnifier", "<set-?>", "Lm2/a3;", "P0", "()Le4/b0;", "x3", "layoutCoordinates", "Lm2/f6;", "G", "Lm2/f6;", "anchorPositionInRootState", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "sourceCenterInRoot", "Lc5/r;", "I", "Lc5/r;", "previousSize", "Llu/g;", "K", "Llu/g;", "drawSignalChannel", "t3", "anchorPositionInRoot", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class x1 extends f3.m.c implements g4.s, g4.q, g4.i1, g4.v0 {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private boolean clippingEnabled;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private l2 platformMagnifierFactory;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private View view;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private c5.d density;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private k2 magnifier;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final p076m2.a3 layoutCoordinates;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private f6<m3.e> anchorPositionInRootState;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private long sourceCenterInRoot;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private c5.r previousSize;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private lu.g<oq.i0> drawSignalChannel;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private er.l<? super c5.d, m3.e> sourceCenter;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private er.l<? super c5.d, m3.e> magnifierCenter;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private er.l<? super c5.k, oq.i0> onSizeChanged;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private float zoom;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private boolean useTextDefault;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private long size;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private float cornerRadius;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private float elevation;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class a extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f209110e;

        a(tq.e<? super a> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 O(long j15) {
            return oq.i0.f148189a;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0021  */
        /* JADX WARN: Code duplicated, block: B:13:0x0029  */
        /* JADX WARN: Code duplicated, block: B:16:0x0032  */
        /* JADX WARN: Code duplicated, block: B:18:0x003a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0038 -> B:11:0x0021). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0045 -> B:21:0x0048). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // vq.a
        public final java.lang.Object J(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r4.f209110e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                oq.u.b(r5)
                goto L48
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                oq.u.b(r5)
                goto L32
            L1e:
                oq.u.b(r5)
            L21:
                w0.x1 r5 = w0.x1.this
                lu.g r5 = w0.x1.q3(r5)
                if (r5 == 0) goto L32
                r4.f209110e = r3
                java.lang.Object r5 = r5.a(r4)
                if (r5 != r0) goto L32
                goto L47
            L32:
                w0.x1 r5 = w0.x1.this
                w0.k2 r5 = w0.x1.r3(r5)
                if (r5 == 0) goto L21
                w0.w1 r5 = new w0.w1
                r5.<init>()
                r4.f209110e = r2
                java.lang.Object r5 = p076m2.n2.b(r5, r4)
                if (r5 != r0) goto L48
            L47:
                return r0
            L48:
                w0.x1 r5 = w0.x1.this
                w0.k2 r5 = w0.x1.r3(r5)
                if (r5 == 0) goto L21
                r5.c()
                goto L21
            */
            throw new UnsupportedOperationException("Method not decompiled: w0.x1.a.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((a) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return x1.this.new a(eVar);
        }
    }

    public /* synthetic */ x1(er.l lVar, er.l lVar2, er.l lVar3, float f15, boolean z15, long j15, float f16, float f17, boolean z16, l2 l2Var, fr.k kVar) {
        this(lVar, lVar2, lVar3, f15, z15, j15, f16, f17, z16, l2Var);
    }

    private final void A3() {
        c5.d dVar;
        k2 k2Var = this.magnifier;
        if (k2Var == null || (dVar = this.density) == null || c5.r.d(k2Var.b(), this.previousSize)) {
            return;
        }
        er.l<? super c5.k, oq.i0> lVar = this.onSizeChanged;
        if (lVar != null) {
            lVar.b(c5.k.c(dVar.a0(c5.s.e(k2Var.b()))));
        }
        this.previousSize = c5.r.b(k2Var.b());
    }

    private final p036e4.b0 P0() {
        return (p036e4.b0) this.layoutCoordinates.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m3.e s3(x1 x1Var) {
        return m3.e.d(x1Var.sourceCenterInRoot);
    }

    private final long t3() {
        if (this.anchorPositionInRootState == null) {
            this.anchorPositionInRootState = x5.d(new er.a() { // from class: w0.v1
                @Override // er.a
                public final Object a() {
                    return x1.u3(this.f209092a);
                }
            });
        }
        f6<m3.e> f6Var = this.anchorPositionInRootState;
        return f6Var != null ? f6Var.getValue().getPackedValue() : m3.e.INSTANCE.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m3.e u3(x1 x1Var) {
        p036e4.b0 b0VarP0 = x1Var.P0();
        return m3.e.d(b0VarP0 != null ? p036e4.c0.g(b0VarP0) : m3.e.INSTANCE.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 v3(x1 x1Var) {
        x1Var.z3();
        return oq.i0.f148189a;
    }

    private final void w3() {
        k2 k2Var = this.magnifier;
        if (k2Var != null) {
            k2Var.dismiss();
        }
        View viewA = this.view;
        if (viewA == null) {
            viewA = g4.i.a(this);
        }
        View view = viewA;
        this.view = view;
        c5.d dVarO = this.density;
        if (dVarO == null) {
            dVarO = g4.h.o(this);
        }
        c5.d dVar = dVarO;
        this.density = dVar;
        this.magnifier = this.platformMagnifierFactory.a(view, this.useTextDefault, this.size, this.cornerRadius, this.elevation, this.clippingEnabled, dVar, this.zoom);
        A3();
    }

    private final void x3(p036e4.b0 b0Var) {
        this.layoutCoordinates.setValue(b0Var);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0066  */
    private final void z3() {
        long jB;
        c5.d dVarO = this.density;
        if (dVarO == null) {
            dVarO = g4.h.o(this);
            this.density = dVarO;
        }
        long packedValue = this.sourceCenter.b(dVarO).getPackedValue();
        if ((packedValue & 9223372034707292159L) == 9205357640488583168L || (t3() & 9223372034707292159L) == 9205357640488583168L) {
            this.sourceCenterInRoot = m3.e.INSTANCE.b();
            k2 k2Var = this.magnifier;
            if (k2Var != null) {
                k2Var.dismiss();
                return;
            }
            return;
        }
        this.sourceCenterInRoot = m3.e.q(t3(), packedValue);
        er.l<? super c5.d, m3.e> lVar = this.magnifierCenter;
        if (lVar != null) {
            m3.e eVarD = m3.e.d(lVar.b(dVarO).getPackedValue());
            if ((eVarD.getPackedValue() & 9223372034707292159L) == 9205357640488583168L) {
                eVarD = null;
            }
            if (eVarD != null) {
                jB = m3.e.q(t3(), eVarD.getPackedValue());
            } else {
                jB = m3.e.INSTANCE.b();
            }
        } else {
            jB = m3.e.INSTANCE.b();
        }
        long j15 = jB;
        if (this.magnifier == null) {
            w3();
        }
        k2 k2Var2 = this.magnifier;
        if (k2Var2 != null) {
            k2Var2.a(this.sourceCenterInRoot, j15, this.zoom);
        }
        A3();
    }

    @Override // g4.i1
    public void E2(n4.i0 i0Var) {
        i0Var.e(y1.b(), new er.a() { // from class: w0.u1
            @Override // er.a
            public final Object a() {
                return x1.s3(this.f209088a);
            }
        });
    }

    @Override // g4.v0
    public void T0() {
        g4.w0.a(this, new er.a() { // from class: w0.t1
            @Override // er.a
            public final Object a() {
                return x1.v3(this.f209079a);
            }
        });
    }

    @Override // f3.m.c
    public void W2() {
        T0();
        this.drawSignalChannel = lu.j.b(0, null, null, 7, null);
        ju.k.d(M2(), null, ju.r0.UNDISPATCHED, new a(null), 1, null);
    }

    @Override // f3.m.c
    public void X2() {
        k2 k2Var = this.magnifier;
        if (k2Var != null) {
            k2Var.dismiss();
        }
        this.magnifier = null;
    }

    @Override // g4.s
    public void h(p036e4.b0 coordinates) {
        x3(coordinates);
    }

    @Override // g4.q
    public void y(p3.c cVar) {
        cVar.H2();
        lu.g<oq.i0> gVar = this.drawSignalChannel;
        if (gVar != null) {
            lu.k.b(gVar.d(oq.i0.f148189a));
        }
    }

    public final void y3(er.l<? super c5.d, m3.e> sourceCenter, er.l<? super c5.d, m3.e> magnifierCenter, float zoom, boolean useTextDefault, long size, float cornerRadius, float elevation, boolean clippingEnabled, er.l<? super c5.k, oq.i0> onSizeChanged, l2 platformMagnifierFactory) {
        float f15 = this.zoom;
        long j15 = this.size;
        float f16 = this.cornerRadius;
        boolean z15 = this.useTextDefault;
        float f17 = this.elevation;
        boolean z16 = this.clippingEnabled;
        l2 l2Var = this.platformMagnifierFactory;
        View view = this.view;
        c5.d dVar = this.density;
        this.sourceCenter = sourceCenter;
        this.magnifierCenter = magnifierCenter;
        this.zoom = zoom;
        this.useTextDefault = useTextDefault;
        this.size = size;
        this.cornerRadius = cornerRadius;
        this.elevation = elevation;
        this.clippingEnabled = clippingEnabled;
        this.onSizeChanged = onSizeChanged;
        this.platformMagnifierFactory = platformMagnifierFactory;
        View viewA = g4.i.a(this);
        c5.d dVarO = g4.h.o(this);
        if (this.magnifier != null && ((!y1.a(zoom, f15) && !platformMagnifierFactory.b()) || !c5.k.h(size, j15) || !c5.h.p(cornerRadius, f16) || !c5.h.p(elevation, f17) || useTextDefault != z15 || clippingEnabled != z16 || !fr.t.c(platformMagnifierFactory, l2Var) || !fr.t.c(viewA, view) || !fr.t.c(dVarO, dVar))) {
            w3();
        }
        z3();
    }

    private x1(er.l<? super c5.d, m3.e> lVar, er.l<? super c5.d, m3.e> lVar2, er.l<? super c5.k, oq.i0> lVar3, float f15, boolean z15, long j15, float f16, float f17, boolean z16, l2 l2Var) {
        this.sourceCenter = lVar;
        this.magnifierCenter = lVar2;
        this.onSizeChanged = lVar3;
        this.zoom = f15;
        this.useTextDefault = z15;
        this.size = j15;
        this.cornerRadius = f16;
        this.elevation = f17;
        this.clippingEnabled = z16;
        this.platformMagnifierFactory = l2Var;
        this.layoutCoordinates = x5.i(null, x5.k());
        this.sourceCenterInRoot = m3.e.INSTANCE.b();
    }
}
