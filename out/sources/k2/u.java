package k2;

import c5.z;
import ju.p0;
import oq.i0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import p076m2.x2;
import p076m2.x3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0082@¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J'\u0010#\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b#\u0010$J\u0018\u0010&\u001a\u00020%2\u0006\u0010\u0010\u001a\u00020%H\u0096@¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\u0006¢\u0006\u0004\b(\u0010\u001dR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R(\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010*\u001a\u0004\b6\u0010,\"\u0004\b7\u0010.R\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010\u0018\"\u0004\bA\u0010BR\u0016\u0010F\u001a\u00020C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER+\u0010L\u001a\u00020\u00132\u0006\u0010G\u001a\u00020\u00138B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010\u0018\"\u0004\bK\u0010BR+\u0010P\u001a\u00020\u00132\u0006\u0010G\u001a\u00020\u00138B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bM\u0010I\u001a\u0004\bN\u0010\u0018\"\u0004\bO\u0010BR\u0014\u0010R\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010\u0018R\u0014\u0010V\u001a\u00020S8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bT\u0010UR\u0014\u0010X\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bW\u0010\u0018R\u0014\u0010Z\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bY\u0010,¨\u0006["}, d2 = {"Lk2/u;", "Lg4/j;", "Lz3/a;", "", "isRefreshing", "Lkotlin/Function0;", "Loq/i0;", "onRefresh", "enabled", "Lk2/v;", "state", "Lc5/h;", "threshold", "<init>", "(ZLer/a;ZLk2/v;FLfr/k;)V", "Lm3/e;", "available", "B3", "(J)J", "", "velocity", "J3", "(FLtq/e;)Ljava/lang/Object;", "A3", "()F", "z3", "(Ltq/e;)Ljava/lang/Object;", "y3", "W2", "()V", "Lz3/g;", "source", "h2", "(JI)J", "consumed", "d1", "(JJI)J", "Lc5/y;", "r2", "(JLtq/e;)Ljava/lang/Object;", "R3", "v", "Z", "I3", "()Z", "N3", "(Z)V", "w", "Ler/a;", "getOnRefresh", "()Ler/a;", "M3", "(Ler/a;)V", "x", "getEnabled", "L3", "y", "Lk2/v;", "F3", "()Lk2/v;", "O3", "(Lk2/v;)V", "z", "F", "getThreshold-D9Ej5fM", "P3", "(F)V", "Lg4/g;", "A", "Lg4/g;", "nestedScrollNode", "<set-?>", "B", "Lm2/x2;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37090q, "Q3", "verticalOffset", "C", "D3", "K3", "distancePulled", "C3", "adjustedDistancePulled", "", "G3", "()I", "thresholdPx", "E3", "progress", "R2", "shouldAutoInvalidate", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class u extends g4.j implements z3.a {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private g4.g nestedScrollNode;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final x2 verticalOffset;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private final x2 distancePulled;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private boolean isRefreshing;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private er.a<i0> onRefresh;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private boolean enabled;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private v state;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private float threshold;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f107548d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f107550f;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f107548d = obj;
            this.f107550f |= PKIFailureInfo.systemUnavail;
            return u.this.y3(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f107551d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f107553f;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f107551d = obj;
            this.f107553f |= PKIFailureInfo.systemUnavail;
            return u.this.z3(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class c extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f107554e;

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f107554e;
            if (i15 == 0) {
                oq.u.b(obj);
                v state = u.this.getState();
                float f15 = u.this.getIsRefreshing() ? 1.0f : 0.0f;
                this.f107554e = 1;
                if (state.c(f15, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((c) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return u.this.new c(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class d extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f107556e;

        d(tq.e<? super d> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f107556e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (!u.this.getState().e()) {
                    v state = u.this.getState();
                    float fH3 = u.this.H3() / u.this.G3();
                    this.f107556e = 1;
                    if (state.c(fH3, this) == objE) {
                        return objE;
                    }
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((d) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return u.this.new d(eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        float f107558d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f107559e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f107561g;

        e(tq.e<? super e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f107559e = obj;
            this.f107561g |= PKIFailureInfo.systemUnavail;
            return u.this.r2(0L, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class f extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        float f107562d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f107563e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f107565g;

        f(tq.e<? super f> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f107563e = obj;
            this.f107565g |= PKIFailureInfo.systemUnavail;
            return u.this.J3(0.0f, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class g extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f107566e;

        g(tq.e<? super g> eVar) {
            super(2, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
        
            if (r5.y3(r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
        
            if (r5.z3(r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
        
            return r0;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r5) throws java.lang.Throwable {
            /*
                r4 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r4.f107566e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1b
                if (r1 == r3) goto L17
                if (r1 != r2) goto Lf
                goto L17
            Lf:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L17:
                oq.u.b(r5)
                goto L3c
            L1b:
                oq.u.b(r5)
                k2.u r5 = k2.u.this
                boolean r5 = r5.getIsRefreshing()
                if (r5 != 0) goto L31
                k2.u r5 = k2.u.this
                r4.f107566e = r3
                java.lang.Object r5 = k2.u.t3(r5, r4)
                if (r5 != r0) goto L3c
                goto L3b
            L31:
                k2.u r5 = k2.u.this
                r4.f107566e = r2
                java.lang.Object r5 = k2.u.u3(r5, r4)
                if (r5 != r0) goto L3c
            L3b:
                return r0
            L3c:
                oq.i0 r5 = oq.i0.f148189a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: k2.u.g.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((g) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return u.this.new g(eVar);
        }
    }

    public /* synthetic */ u(boolean z15, er.a aVar, boolean z16, v vVar, float f15, fr.k kVar) {
        this(z15, aVar, z16, vVar, f15);
    }

    private final float A3() {
        if (C3() <= G3()) {
            return C3();
        }
        float fM = lr.m.m(Math.abs(E3()) - 1.0f, 0.0f, 2.0f);
        return G3() + (G3() * (fM - (((float) Math.pow(fM, 2)) / 4)));
    }

    private final long B3(long available) {
        float fD3;
        if (this.isRefreshing) {
            fD3 = 0.0f;
        } else {
            float fD = lr.m.d(D3() + Float.intBitsToFloat((int) (available & BodyPartID.bodyIdMax)), 0.0f);
            fD3 = fD - D3();
            K3(fD);
            Q3(A3());
        }
        return m3.e.e((((long) Float.floatToRawIntBits(fD3)) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(0.0f) << 32));
    }

    private final float C3() {
        return D3() * 0.5f;
    }

    private final float D3() {
        return this.distancePulled.a();
    }

    private final float E3() {
        return C3() / G3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int G3() {
        return g4.h.o(this).X0(this.threshold);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float H3() {
        return this.verticalOffset.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object J3(float f15, tq.e<? super Float> eVar) throws Throwable {
        f fVar;
        if (eVar instanceof f) {
            fVar = (f) eVar;
            int i15 = fVar.f107565g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                fVar.f107565g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                fVar = new f(eVar);
            }
        } else {
            fVar = new f(eVar);
        }
        Object obj = fVar.f107563e;
        Object objE = uq.b.e();
        int i16 = fVar.f107565g;
        if (i16 == 0) {
            oq.u.b(obj);
            if (this.isRefreshing) {
                return vq.b.d(0.0f);
            }
            if (C3() > G3()) {
                this.onRefresh.a();
            }
            if (D3() == 0.0f || f15 < 0.0f) {
                f15 = 0.0f;
            }
            fVar.f107562d = f15;
            fVar.f107565g = 1;
            if (y3(fVar) == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f15 = fVar.f107562d;
            oq.u.b(obj);
        }
        K3(0.0f);
        return vq.b.d(f15);
    }

    private final void K3(float f15) {
        this.distancePulled.p(f15);
    }

    private final void Q3(float f15) {
        this.verticalOffset.p(f15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object y3(tq.e<? super i0> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f107550f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f107550f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f107548d;
        Object objE = uq.b.e();
        int i16 = aVar.f107550f;
        try {
            if (i16 == 0) {
                oq.u.b(obj);
                v vVar = this.state;
                aVar.f107550f = 1;
                if (vVar.d(aVar) == objE) {
                    return objE;
                }
            } else {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            K3(0.0f);
            Q3(0.0f);
            return i0.f148189a;
        } catch (Throwable th4) {
            K3(0.0f);
            Q3(0.0f);
            throw th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object z3(tq.e<? super i0> eVar) throws Throwable {
        b bVar;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f107553f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f107553f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object obj = bVar.f107551d;
        Object objE = uq.b.e();
        int i16 = bVar.f107553f;
        try {
            if (i16 == 0) {
                oq.u.b(obj);
                v vVar = this.state;
                bVar.f107553f = 1;
                if (vVar.b(bVar) == objE) {
                    return objE;
                }
            } else {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            if (getIsAttached()) {
                K3(G3());
                Q3(G3());
            }
            return i0.f148189a;
        } catch (Throwable th4) {
            if (getIsAttached()) {
                K3(G3());
                Q3(G3());
            }
            throw th4;
        }
    }

    /* JADX INFO: renamed from: F3, reason: from getter */
    public final v getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: I3, reason: from getter */
    public final boolean getIsRefreshing() {
        return this.isRefreshing;
    }

    public final void L3(boolean z15) {
        this.enabled = z15;
    }

    public final void M3(er.a<i0> aVar) {
        this.onRefresh = aVar;
    }

    public final void N3(boolean z15) {
        this.isRefreshing = z15;
    }

    public final void O3(v vVar) {
        this.state = vVar;
    }

    public final void P3(float f15) {
        this.threshold = f15;
    }

    @Override // f3.m.c
    /* JADX INFO: renamed from: R2 */
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    public final void R3() {
        ju.k.d(M2(), null, null, new g(null), 3, null);
    }

    @Override // f3.m.c
    public void W2() {
        n3(this.nestedScrollNode);
        ju.k.d(M2(), null, null, new c(null), 3, null);
        Q3(this.isRefreshing ? G3() : 0.0f);
    }

    @Override // z3.a
    public long d1(long consumed, long available, int source) {
        if (!this.state.e() && this.enabled && z3.g.d(source, z3.g.INSTANCE.b())) {
            long jB3 = B3(available);
            ju.k.d(M2(), null, null, new d(null), 3, null);
            return jB3;
        }
        return m3.e.INSTANCE.c();
    }

    @Override // z3.a
    public long h2(long available, int source) {
        if (!this.state.e() && this.enabled) {
            return (!z3.g.d(source, z3.g.INSTANCE.b()) || Float.intBitsToFloat((int) (BodyPartID.bodyIdMax & available)) >= 0.0f) ? m3.e.INSTANCE.c() : B3(available);
        }
        return m3.e.INSTANCE.c();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // z3.a
    public Object r2(long j15, tq.e<? super c5.y> eVar) throws Throwable {
        e eVar2;
        float f15;
        if (eVar instanceof e) {
            eVar2 = (e) eVar;
            int i15 = eVar2.f107561g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                eVar2.f107561g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                eVar2 = new e(eVar);
            }
        } else {
            eVar2 = new e(eVar);
        }
        Object objJ3 = eVar2.f107559e;
        Object objE = uq.b.e();
        int i16 = eVar2.f107561g;
        if (i16 == 0) {
            oq.u.b(objJ3);
            float fI = c5.y.i(j15);
            eVar2.f107558d = 0.0f;
            eVar2.f107561g = 1;
            objJ3 = J3(fI, eVar2);
            if (objJ3 == objE) {
                return objE;
            }
            f15 = 0.0f;
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f15 = eVar2.f107558d;
            oq.u.b(objJ3);
        }
        return c5.y.b(z.a(f15, ((Number) objJ3).floatValue()));
    }

    private u(boolean z15, er.a<i0> aVar, boolean z16, v vVar, float f15) {
        this.isRefreshing = z15;
        this.onRefresh = aVar;
        this.enabled = z16;
        this.state = vVar;
        this.threshold = f15;
        this.nestedScrollNode = z3.f.c(this, null);
        this.verticalOffset = x3.a(0.0f);
        this.distancePulled = x3.a(0.0f);
    }
}
