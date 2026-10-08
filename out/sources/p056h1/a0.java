package p056h1;

import c5.n;
import er.l;
import fr.k;
import fr.m;
import ip.a;
import ju.p0;
import n3.x1;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;
import p076m2.a3;
import p076m2.c6;
import u0.c;
import u0.j0;
import u0.p;
import u0.q;
import u0.s3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b/\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 F2\u00020\u0001:\u0001\u0016B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\fJ\r\u0010\u0014\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\fJ\r\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR*\u0010$\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R*\u0010(\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u001f\u001a\u0004\b&\u0010!\"\u0004\b'\u0010#R*\u0010,\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010\u001f\u001a\u0004\b*\u0010!\"\u0004\b+\u0010#R$\u00102\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020\u000f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R+\u00109\u001a\u00020\u000f2\u0006\u00103\u001a\u00020\u000f8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00101\"\u0004\b7\u00108R+\u0010=\u001a\u00020\u000f2\u0006\u00103\u001a\u00020\u000f8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b:\u00105\u001a\u0004\b;\u00101\"\u0004\b<\u00108R+\u0010A\u001a\u00020\u000f2\u0006\u00103\u001a\u00020\u000f8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b>\u00105\u001a\u0004\b?\u00101\"\u0004\b@\u00108R+\u0010D\u001a\u00020\u000f2\u0006\u00103\u001a\u00020\u000f8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u00105\u001a\u0004\bB\u00101\"\u0004\bC\u00108R\"\u0010I\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010E\u001a\u0004\bF\u0010G\"\u0004\bE\u0010HR\"\u0010L\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010E\u001a\u0004\bJ\u0010G\"\u0004\bK\u0010HR(\u0010Q\u001a\u0004\u0018\u00010M2\b\u0010-\u001a\u0004\u0018\u00010M8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000b\u0010N\u001a\u0004\bO\u0010PR \u0010U\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020S0R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010TR \u0010W\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020V0R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010TR+\u0010[\u001a\u00020\r2\u0006\u00103\u001a\u00020\r8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bX\u00105\u001a\u0004\bY\u0010G\"\u0004\bZ\u0010HR\"\u0010]\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bY\u0010E\u001a\u0004\bX\u0010G\"\u0004\b\\\u0010H¨\u0006^"}, d2 = {"Lh1/a0;", "", "Lju/p0;", "coroutineScope", "Ln3/x1;", "graphicsContext", "Lkotlin/Function0;", "Loq/i0;", "onLayerPropertyChanged", "<init>", "(Lju/p0;Ln3/x1;Ler/a;)V", "n", "()V", "Lc5/n;", "delta", "", "isMovingAway", "m", "(JZ)V", "k", "l", "y", "a", "Lju/p0;", "b", "Ln3/x1;", "c", "Ler/a;", "Lu0/j0;", "", "d", "Lu0/j0;", "getFadeInSpec", "()Lu0/j0;", "C", "(Lu0/j0;)V", "fadeInSpec", "e", "getPlacementSpec", "I", "placementSpec", "f", "getFadeOutSpec", a.f96138c, "fadeOutSpec", "value", "g", "Z", "x", "()Z", "isRunningMovingAwayAnimation", "<set-?>", "h", "Lm2/a3;", "w", "G", "(Z)V", "isPlacementAnimationInProgress", "i", "t", "z", "isAppearanceAnimationInProgress", "j", "v", "B", "isDisappearanceAnimationInProgress", "u", "A", "isDisappearanceAnimationFinished", "J", "s", "()J", "(J)V", "rawOffset", "o", "E", "finalOffset", "Lq3/c;", "Lq3/c;", "p", "()Lq3/c;", "layer", "Lu0/c;", "Lu0/q;", "Lu0/c;", "placementDeltaAnimation", "Lu0/p;", "visibilityAnimation", "q", "r", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "placementDelta", "F", "lookaheadOffset", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f79256t = 8;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final long f79257u;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final p0 coroutineScope;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final x1 graphicsContext;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final er.a<i0> onLayerPropertyChanged;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private j0<Float> fadeInSpec;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private j0<n> placementSpec;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private j0<Float> fadeOutSpec;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean isRunningMovingAwayAnimation;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final a3 isPlacementAnimationInProgress;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final a3 isAppearanceAnimationInProgress;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final a3 isDisappearanceAnimationInProgress;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final a3 isDisappearanceAnimationFinished;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private long rawOffset;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private long finalOffset;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private q3.c layer;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final u0.c<n, q> placementDeltaAnimation;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final u0.c<Float, p> visibilityAnimation;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final a3 placementDelta;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private long lookaheadOffset;

    /* JADX INFO: renamed from: h1.a0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lh1/a0$a;", "", "<init>", "()V", "Lc5/n;", "NotInitialized", "J", "a", "()J", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final long a() {
            return a0.f79257u;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class b extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f79276e;

        b(tq.e<? super b> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f79276e;
            if (i15 == 0) {
                u.b(obj);
                u0.c cVar = a0.this.visibilityAnimation;
                Float fD = vq.b.d(1.0f);
                this.f79276e = 1;
                if (cVar.t(fD, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((b) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return a0.this.new b(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class c extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f79278e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f79279f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ a0 f79280g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ j0<Float> f79281h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ q3.c f79282j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z15, a0 a0Var, j0<Float> j0Var, q3.c cVar, tq.e<? super c> eVar) {
            super(2, eVar);
            this.f79279f = z15;
            this.f79280g = a0Var;
            this.f79281h = j0Var;
            this.f79282j = cVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(q3.c cVar, a0 a0Var, u0.c cVar2) {
            cVar.K(((Number) cVar2.m()).floatValue());
            a0Var.onLayerPropertyChanged.a();
            return i0.f148189a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0061, code lost:
        
            if (r13 == r0) goto L24;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r13) throws java.lang.Throwable {
            /*
                r12 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r12.f79278e
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L24
                if (r1 == r4) goto L20
                if (r1 != r3) goto L18
                oq.u.b(r13)     // Catch: java.lang.Throwable -> L14
                r9 = r12
                goto L64
            L14:
                r0 = move-exception
                r13 = r0
                r9 = r12
                goto L74
            L18:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L20:
                oq.u.b(r13)     // Catch: java.lang.Throwable -> L14
                goto L40
            L24:
                oq.u.b(r13)
                boolean r13 = r12.f79279f     // Catch: java.lang.Throwable -> L71
                if (r13 == 0) goto L40
                h1.a0 r13 = r12.f79280g     // Catch: java.lang.Throwable -> L14
                u0.c r13 = p056h1.a0.d(r13)     // Catch: java.lang.Throwable -> L14
                r1 = 0
                java.lang.Float r1 = vq.b.d(r1)     // Catch: java.lang.Throwable -> L14
                r12.f79278e = r4     // Catch: java.lang.Throwable -> L14
                java.lang.Object r13 = r13.t(r1, r12)     // Catch: java.lang.Throwable -> L14
                if (r13 != r0) goto L40
                r9 = r12
                goto L63
            L40:
                h1.a0 r13 = r12.f79280g     // Catch: java.lang.Throwable -> L71
                u0.c r4 = p056h1.a0.d(r13)     // Catch: java.lang.Throwable -> L71
                r13 = 1065353216(0x3f800000, float:1.0)
                java.lang.Float r5 = vq.b.d(r13)     // Catch: java.lang.Throwable -> L71
                u0.j0<java.lang.Float> r6 = r12.f79281h     // Catch: java.lang.Throwable -> L71
                q3.c r13 = r12.f79282j     // Catch: java.lang.Throwable -> L71
                h1.a0 r1 = r12.f79280g     // Catch: java.lang.Throwable -> L71
                h1.b0 r8 = new h1.b0     // Catch: java.lang.Throwable -> L71
                r8.<init>()     // Catch: java.lang.Throwable -> L71
                r12.f79278e = r3     // Catch: java.lang.Throwable -> L71
                r7 = 0
                r10 = 4
                r11 = 0
                r9 = r12
                java.lang.Object r13 = u0.c.f(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L6e
                if (r13 != r0) goto L64
            L63:
                return r0
            L64:
                u0.j r13 = (u0.AnimationResult) r13     // Catch: java.lang.Throwable -> L6e
                h1.a0 r13 = r9.f79280g
                p056h1.a0.e(r13, r2)
                oq.i0 r13 = oq.i0.f148189a
                return r13
            L6e:
                r0 = move-exception
            L6f:
                r13 = r0
                goto L74
            L71:
                r0 = move-exception
                r9 = r12
                goto L6f
            L74:
                h1.a0 r0 = r9.f79280g
                p056h1.a0.e(r0, r2)
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: h1.a0.c.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((c) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new c(this.f79279f, this.f79280g, this.f79281h, this.f79282j, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class d extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f79283e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ j0<Float> f79285g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ q3.c f79286h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(j0<Float> j0Var, q3.c cVar, tq.e<? super d> eVar) {
            super(2, eVar);
            this.f79285g = j0Var;
            this.f79286h = cVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(q3.c cVar, a0 a0Var, u0.c cVar2) {
            cVar.K(((Number) cVar2.m()).floatValue());
            a0Var.onLayerPropertyChanged.a();
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            d dVar;
            Throwable th4;
            Object objE = uq.b.e();
            int i15 = this.f79283e;
            if (i15 == 0) {
                u.b(obj);
                try {
                    u0.c cVar = a0.this.visibilityAnimation;
                    Float fD = vq.b.d(0.0f);
                    j0<Float> j0Var = this.f79285g;
                    final q3.c cVar2 = this.f79286h;
                    final a0 a0Var = a0.this;
                    l lVar = new l() { // from class: h1.c0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return a0.d.O(cVar2, a0Var, (c) obj2);
                        }
                    };
                    this.f79283e = 1;
                    dVar = this;
                    try {
                        if (u0.c.f(cVar, fD, j0Var, null, lVar, dVar, 4, null) == objE) {
                            return objE;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        th4 = th;
                        a0.this.B(false);
                        throw th4;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    dVar = this;
                    th4 = th;
                    a0.this.B(false);
                    throw th4;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                try {
                    u.b(obj);
                    dVar = this;
                } catch (Throwable th7) {
                    th4 = th7;
                    dVar = this;
                    a0.this.B(false);
                    throw th4;
                }
            }
            a0.this.A(true);
            a0.this.B(false);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((d) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return a0.this.new d(this.f79285g, this.f79286h, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class e extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f79287e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f79288f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ j0<n> f79290h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ long f79291j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(j0<n> j0Var, long j15, tq.e<? super e> eVar) {
            super(2, eVar);
            this.f79290h = j0Var;
            this.f79291j = j15;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(a0 a0Var, long j15, u0.c cVar) {
            a0Var.H(n.l(((n) cVar.m()).getPackedValue(), j15));
            a0Var.onLayerPropertyChanged.a();
            return i0.f148189a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:32:0x00ad, code lost:
        
            if (u0.c.f(r12, r4, r5, null, r7, r8, 4, null) == r0) goto L33;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r12) throws java.lang.Throwable {
            /*
                r11 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r11.f79288f
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L27
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L17
                oq.u.b(r12)     // Catch: java.util.concurrent.CancellationException -> L14
                r8 = r11
                goto Lb0
            L14:
                r8 = r11
                goto Lbb
            L17:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1f:
                java.lang.Object r1 = r11.f79287e
                u0.j0 r1 = (u0.j0) r1
                oq.u.b(r12)     // Catch: java.util.concurrent.CancellationException -> L14
                goto L6c
            L27:
                oq.u.b(r12)
                h1.a0 r12 = p056h1.a0.this     // Catch: java.util.concurrent.CancellationException -> L14
                u0.c r12 = p056h1.a0.c(r12)     // Catch: java.util.concurrent.CancellationException -> L14
                boolean r12 = r12.p()     // Catch: java.util.concurrent.CancellationException -> L14
                if (r12 == 0) goto L45
                u0.j0<c5.n> r12 = r11.f79290h     // Catch: java.util.concurrent.CancellationException -> L14
                boolean r1 = r12 instanceof u0.q1     // Catch: java.util.concurrent.CancellationException -> L14
                if (r1 == 0) goto L3f
                u0.q1 r12 = (u0.q1) r12     // Catch: java.util.concurrent.CancellationException -> L14
                goto L43
            L3f:
                u0.q1 r12 = p056h1.e0.a()     // Catch: java.util.concurrent.CancellationException -> L14
            L43:
                r1 = r12
                goto L48
            L45:
                u0.j0<c5.n> r12 = r11.f79290h     // Catch: java.util.concurrent.CancellationException -> L14
                goto L43
            L48:
                h1.a0 r12 = p056h1.a0.this     // Catch: java.util.concurrent.CancellationException -> L14
                u0.c r12 = p056h1.a0.c(r12)     // Catch: java.util.concurrent.CancellationException -> L14
                boolean r12 = r12.p()     // Catch: java.util.concurrent.CancellationException -> L14
                if (r12 != 0) goto L75
                h1.a0 r12 = p056h1.a0.this     // Catch: java.util.concurrent.CancellationException -> L14
                u0.c r12 = p056h1.a0.c(r12)     // Catch: java.util.concurrent.CancellationException -> L14
                long r4 = r11.f79291j     // Catch: java.util.concurrent.CancellationException -> L14
                c5.n r4 = c5.n.c(r4)     // Catch: java.util.concurrent.CancellationException -> L14
                r11.f79287e = r1     // Catch: java.util.concurrent.CancellationException -> L14
                r11.f79288f = r3     // Catch: java.util.concurrent.CancellationException -> L14
                java.lang.Object r12 = r12.t(r4, r11)     // Catch: java.util.concurrent.CancellationException -> L14
                if (r12 != r0) goto L6c
                r8 = r11
                goto Laf
            L6c:
                h1.a0 r12 = p056h1.a0.this     // Catch: java.util.concurrent.CancellationException -> L14
                er.a r12 = p056h1.a0.b(r12)     // Catch: java.util.concurrent.CancellationException -> L14
                r12.a()     // Catch: java.util.concurrent.CancellationException -> L14
            L75:
                r5 = r1
                h1.a0 r12 = p056h1.a0.this     // Catch: java.util.concurrent.CancellationException -> L14
                u0.c r12 = p056h1.a0.c(r12)     // Catch: java.util.concurrent.CancellationException -> L14
                java.lang.Object r12 = r12.m()     // Catch: java.util.concurrent.CancellationException -> L14
                c5.n r12 = (c5.n) r12     // Catch: java.util.concurrent.CancellationException -> L14
                long r3 = r12.getPackedValue()     // Catch: java.util.concurrent.CancellationException -> L14
                long r6 = r11.f79291j     // Catch: java.util.concurrent.CancellationException -> L14
                long r3 = c5.n.l(r3, r6)     // Catch: java.util.concurrent.CancellationException -> L14
                h1.a0 r12 = p056h1.a0.this     // Catch: java.util.concurrent.CancellationException -> L14
                u0.c r12 = p056h1.a0.c(r12)     // Catch: java.util.concurrent.CancellationException -> L14
                r6 = r3
                c5.n r4 = c5.n.c(r6)     // Catch: java.util.concurrent.CancellationException -> L14
                h1.a0 r1 = p056h1.a0.this     // Catch: java.util.concurrent.CancellationException -> L14
                r8 = r6
                h1.d0 r7 = new h1.d0     // Catch: java.util.concurrent.CancellationException -> L14
                r7.<init>()     // Catch: java.util.concurrent.CancellationException -> L14
                r1 = 0
                r11.f79287e = r1     // Catch: java.util.concurrent.CancellationException -> L14
                r11.f79288f = r2     // Catch: java.util.concurrent.CancellationException -> L14
                r6 = 0
                r9 = 4
                r10 = 0
                r8 = r11
                r3 = r12
                java.lang.Object r12 = u0.c.f(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.util.concurrent.CancellationException -> Lbb
                if (r12 != r0) goto Lb0
            Laf:
                return r0
            Lb0:
                h1.a0 r12 = p056h1.a0.this     // Catch: java.util.concurrent.CancellationException -> Lbb
                r0 = 0
                p056h1.a0.h(r12, r0)     // Catch: java.util.concurrent.CancellationException -> Lbb
                h1.a0 r12 = p056h1.a0.this     // Catch: java.util.concurrent.CancellationException -> Lbb
                p056h1.a0.j(r12, r0)     // Catch: java.util.concurrent.CancellationException -> Lbb
            Lbb:
                oq.i0 r12 = oq.i0.f148189a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: h1.a0.e.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((e) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return a0.this.new e(this.f79290h, this.f79291j, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class f extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f79292e;

        f(tq.e<? super f> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f79292e;
            if (i15 == 0) {
                u.b(obj);
                u0.c cVar = a0.this.placementDeltaAnimation;
                n nVarC = n.c(n.INSTANCE.b());
                this.f79292e = 1;
                if (cVar.t(nVarC, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            a0.this.H(n.INSTANCE.b());
            a0.this.G(false);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((f) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return a0.this.new f(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class g extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f79294e;

        g(tq.e<? super g> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f79294e;
            if (i15 == 0) {
                u.b(obj);
                u0.c cVar = a0.this.placementDeltaAnimation;
                this.f79294e = 1;
                if (cVar.u(this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((g) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return a0.this.new g(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class h extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f79296e;

        h(tq.e<? super h> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f79296e;
            if (i15 == 0) {
                u.b(obj);
                u0.c cVar = a0.this.visibilityAnimation;
                this.f79296e = 1;
                if (cVar.u(this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((h) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return a0.this.new h(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class i extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f79298e;

        i(tq.e<? super i> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f79298e;
            if (i15 == 0) {
                u.b(obj);
                u0.c cVar = a0.this.visibilityAnimation;
                this.f79298e = 1;
                if (cVar.u(this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((i) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return a0.this.new i(eVar);
        }
    }

    static {
        long j15 = Integer.MAX_VALUE;
        f79257u = n.d((j15 & BodyPartID.bodyIdMax) | (j15 << 32));
    }

    public a0(p0 p0Var, x1 x1Var, er.a<i0> aVar) {
        this.coroutineScope = p0Var;
        this.graphicsContext = x1Var;
        this.onLayerPropertyChanged = aVar;
        Boolean bool = Boolean.FALSE;
        this.isPlacementAnimationInProgress = c6.e(bool, null, 2, null);
        this.isAppearanceAnimationInProgress = c6.e(bool, null, 2, null);
        this.isDisappearanceAnimationInProgress = c6.e(bool, null, 2, null);
        this.isDisappearanceAnimationFinished = c6.e(bool, null, 2, null);
        long j15 = f79257u;
        this.rawOffset = j15;
        n.Companion companion = n.INSTANCE;
        this.finalOffset = companion.b();
        this.layer = x1Var != null ? x1Var.c() : null;
        String str = null;
        this.placementDeltaAnimation = new u0.c<>(n.c(companion.b()), s3.N(companion), null, str, 12, null);
        this.visibilityAnimation = new u0.c<>(Float.valueOf(1.0f), s3.P(m.f66405a), str, null, 12, null);
        this.placementDelta = c6.e(n.c(companion.b()), null, 2, null);
        this.lookaheadOffset = j15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A(boolean z15) {
        this.isDisappearanceAnimationFinished.setValue(Boolean.valueOf(z15));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B(boolean z15) {
        this.isDisappearanceAnimationInProgress.setValue(Boolean.valueOf(z15));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(boolean z15) {
        this.isPlacementAnimationInProgress.setValue(Boolean.valueOf(z15));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H(long j15) {
        this.placementDelta.setValue(n.c(j15));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z(boolean z15) {
        this.isAppearanceAnimationInProgress.setValue(Boolean.valueOf(z15));
    }

    public final void C(j0<Float> j0Var) {
        this.fadeInSpec = j0Var;
    }

    public final void D(j0<Float> j0Var) {
        this.fadeOutSpec = j0Var;
    }

    public final void E(long j15) {
        this.finalOffset = j15;
    }

    public final void F(long j15) {
        this.lookaheadOffset = j15;
    }

    public final void I(j0<n> j0Var) {
        this.placementSpec = j0Var;
    }

    public final void J(long j15) {
        this.rawOffset = j15;
    }

    public final void k() {
        q3.c cVar = this.layer;
        j0<Float> j0Var = this.fadeInSpec;
        if (t() || j0Var == null || cVar == null) {
            if (v()) {
                if (cVar != null) {
                    cVar.K(1.0f);
                }
                ju.k.d(this.coroutineScope, null, null, new b(null), 3, null);
                return;
            }
            return;
        }
        z(true);
        boolean zV = v();
        boolean z15 = !zV;
        if (!zV) {
            cVar.K(0.0f);
        }
        ju.k.d(this.coroutineScope, null, null, new c(z15, this, j0Var, cVar, null), 3, null);
    }

    public final void l() {
        q3.c cVar = this.layer;
        j0<Float> j0Var = this.fadeOutSpec;
        if (cVar == null || v() || j0Var == null) {
            return;
        }
        B(true);
        ju.k.d(this.coroutineScope, null, null, new d(j0Var, cVar, null), 3, null);
    }

    public final void m(long delta, boolean isMovingAway) {
        j0<n> j0Var = this.placementSpec;
        if (j0Var == null) {
            return;
        }
        long jL = n.l(r(), delta);
        H(jL);
        G(true);
        this.isRunningMovingAwayAnimation = isMovingAway;
        ju.k.d(this.coroutineScope, null, null, new e(j0Var, jL, null), 3, null);
    }

    public final void n() {
        if (w()) {
            ju.k.d(this.coroutineScope, null, null, new f(null), 3, null);
        }
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final long getFinalOffset() {
        return this.finalOffset;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final q3.c getLayer() {
        return this.layer;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final long getLookaheadOffset() {
        return this.lookaheadOffset;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long r() {
        return ((n) this.placementDelta.getValue()).getPackedValue();
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final long getRawOffset() {
        return this.rawOffset;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean t() {
        return ((Boolean) this.isAppearanceAnimationInProgress.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean u() {
        return ((Boolean) this.isDisappearanceAnimationFinished.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean v() {
        return ((Boolean) this.isDisappearanceAnimationInProgress.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean w() {
        return ((Boolean) this.isPlacementAnimationInProgress.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final boolean getIsRunningMovingAwayAnimation() {
        return this.isRunningMovingAwayAnimation;
    }

    public final void y() {
        x1 x1Var;
        if (w()) {
            G(false);
            ju.k.d(this.coroutineScope, null, null, new g(null), 3, null);
        }
        if (t()) {
            z(false);
            ju.k.d(this.coroutineScope, null, null, new h(null), 3, null);
        }
        if (v()) {
            B(false);
            ju.k.d(this.coroutineScope, null, null, new i(null), 3, null);
        }
        this.isRunningMovingAwayAnimation = false;
        H(n.INSTANCE.b());
        this.rawOffset = f79257u;
        q3.c cVar = this.layer;
        if (cVar != null && (x1Var = this.graphicsContext) != null) {
            x1Var.a(cVar);
        }
        this.layer = null;
        this.fadeInSpec = null;
        this.fadeOutSpec = null;
        this.placementSpec = null;
    }
}
