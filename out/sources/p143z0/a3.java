package p143z0;

import c5.y;
import c5.z;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import er.l;
import er.p;
import fr.o0;
import fr.t;
import m3.e;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import vq.k;
import w0.g2;
import w0.z1;
import z3.g;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0089\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001`\b\u0001\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0016\u001a\u00020\u0015*\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u0014*\u00020\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001b\u001a\u00020\u0014*\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\"\u001a\u00020\u001e*\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020\u001eH\u0002¢\u0006\u0004\b%\u0010\u0019J\u0011\u0010&\u001a\u00020\u001e*\u00020\u0015¢\u0006\u0004\b&\u0010'J\u0011\u0010(\u001a\u00020\u001e*\u00020\u001e¢\u0006\u0004\b(\u0010\u0019J\u0011\u0010)\u001a\u00020\u0015*\u00020\u001e¢\u0006\u0004\b)\u0010\u0017J\u0011\u0010*\u001a\u00020\u0015*\u00020\u001e¢\u0006\u0004\b*\u0010\u0017J\u0011\u0010+\u001a\u00020\u0014*\u00020\u0015¢\u0006\u0004\b+\u0010'J\u0011\u0010,\u001a\u00020\u0015*\u00020\u0015¢\u0006\u0004\b,\u0010-J\u0011\u0010.\u001a\u00020\u001e*\u00020\u001e¢\u0006\u0004\b.\u0010\u0019J\u0017\u0010/\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020\u001eH\u0016¢\u0006\u0004\b/\u0010\u0019J \u00103\u001a\u0002022\u0006\u00100\u001a\u00020\u00142\u0006\u00101\u001a\u00020\nH\u0086@¢\u0006\u0004\b3\u00104J\u0018\u00106\u001a\u00020\u00142\u0006\u00105\u001a\u00020\u0014H\u0096@¢\u0006\u0004\b6\u00107J\r\u00108\u001a\u00020\n¢\u0006\u0004\b8\u00109J>\u0010A\u001a\u0002022\b\b\u0002\u0010;\u001a\u00020:2\"\u0010@\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020=\u0012\n\u0012\b\u0012\u0004\u0012\u0002020>\u0012\u0006\u0012\u0004\u0018\u00010?0<H\u0086@¢\u0006\u0004\bA\u0010BJ?\u0010C\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\bC\u0010DJ\r\u0010E\u001a\u00020\n¢\u0006\u0004\bE\u00109R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010LR\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010MR\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR$\u0010Z\u001a\u00020\n2\u0006\u0010X\u001a\u00020\n8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\bY\u0010Q\u001a\u0004\bF\u00109R\u0016\u0010\\\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010*R\u0016\u0010_\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010c\u001a\u00020`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR \u0010g\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001e0d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0014\u0010i\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bh\u00109¨\u0006j"}, d2 = {"Lz0/a3;", "Lz0/g2;", "Lz0/v2;", "scrollableState", "Lw0/g2;", "overscrollEffect", "Lz0/e1;", "flingBehavior", "Lz0/a2;", "orientation", "", "reverseDirection", "Lz3/b;", "nestedScrollDispatcher", "Lz0/z1;", "onScrollChangedDispatcher", "Lkotlin/Function0;", "isScrollableNodeAttached", "<init>", "(Lz0/v2;Lw0/g2;Lz0/e1;Lz0/a2;ZLz3/b;Lz0/z1;Ler/a;)V", "Lc5/y;", "", "F", "(J)F", "E", "(J)J", "newValue", i.f37094u, "(JF)J", "Lz0/h2;", "Lm3/e;", "delta", "Lz3/g;", "source", "x", "(Lz0/h2;JI)J", "scroll", "s", i.f37087n, "(F)J", ip.a.f96138c, "G", "I", "J", "z", "(F)F", "A", "b", "initialVelocity", "isMouseWheel", "Loq/i0;", "w", "(JZLtq/e;)Ljava/lang/Object;", "available", "c", "(JLtq/e;)Ljava/lang/Object;", "C", "()Z", "Lw0/z1;", "scrollPriority", "Lkotlin/Function2;", "Lz0/s1;", "Ltq/e;", "", "block", "B", "(Lw0/z1;Ler/p;Ltq/e;)Ljava/lang/Object;", "K", "(Lz0/v2;Lz0/a2;Lw0/g2;ZLz0/e1;Lz3/b;)Z", "v", "a", "Lz0/v2;", "t", "()Lz0/v2;", "setScrollableState", "(Lz0/v2;)V", "Lw0/g2;", "Lz0/e1;", "d", "Lz0/a2;", "e", "Z", "f", "Lz3/b;", "g", "Lz0/z1;", "h", "Ler/a;", "value", "i", "isFlinging", "j", "latestScrollSource", "k", "Lz0/h2;", "outerStateScope", "z0/a3$c", "l", "Lz0/a3$c;", "nestedScrollScope", "Lkotlin/Function1;", "m", "Ler/l;", "performScrollForOverscroll", "u", "shouldDispatchOverscroll", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a3 implements g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private v2 scrollableState;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private g2 overscrollEffect;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private e1 flingBehavior;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private a2 orientation;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean reverseDirection;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private z3.b nestedScrollDispatcher;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private z1 onScrollChangedDispatcher;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final er.a<Boolean> isScrollableNodeAttached;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean isFlinging;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private int latestScrollSource = g.INSTANCE.b();

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private h2 outerStateScope = n2.f231488b;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final c nestedScrollScope = new c();

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final l<m3.e, m3.e> performScrollForOverscroll = new l() { // from class: z0.z2
        @Override // er.l
        public final Object b(Object obj) {
            return a3.y(this.f231792a, (e) obj);
        }
    };

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f231031d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f231032e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f231034g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f231032e = obj;
            this.f231034g |= PKIFailureInfo.systemUnavail;
            return a3.this.c(0L, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz0/s1;", "Loq/i0;", "<anonymous>", "(Lz0/s1;)V"}, k = 3, mv = {2, 1, 0})
    static final class b extends k implements p<s1, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f231035e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f231036f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        long f231037g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f231038h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f231039j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ o0 f231041l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ long f231042m;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"z0/a3$b$a", "Lz0/h2;", "", "pixels", "d", "(F)F", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a implements h2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ a3 f231043a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ s1 f231044b;

            a(a3 a3Var, s1 s1Var) {
                this.f231043a = a3Var;
                this.f231044b = s1Var;
            }

            @Override // p143z0.h2
            public float d(float pixels) {
                if (Math.abs(pixels) != 0.0f && !((Boolean) this.f231043a.isScrollableNodeAttached.a()).booleanValue()) {
                    throw new f1();
                }
                a3 a3Var = this.f231043a;
                return a3Var.z(a3Var.G(this.f231044b.a(a3Var.A(a3Var.H(pixels)), g.INSTANCE.a())));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(o0 o0Var, long j15, tq.e<? super b> eVar) {
            super(2, eVar);
            this.f231041l = o0Var;
            this.f231042m = j15;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            a3 a3Var;
            o0 o0Var;
            a3 a3Var2;
            long j15;
            Object objE = uq.b.e();
            int i15 = this.f231038h;
            if (i15 == 0) {
                u.b(obj);
                a aVar = new a(a3.this, (s1) this.f231039j);
                a3Var = a3.this;
                o0 o0Var2 = this.f231041l;
                long j16 = this.f231042m;
                e1 e1Var = a3Var.flingBehavior;
                long j17 = o0Var2.f66408a;
                float fZ = a3Var.z(a3Var.F(j16));
                this.f231039j = a3Var;
                this.f231035e = a3Var;
                this.f231036f = o0Var2;
                this.f231037g = j17;
                this.f231038h = 1;
                Object objA = e1Var.a(aVar, fZ, this);
                if (objA == objE) {
                    return objE;
                }
                o0Var = o0Var2;
                obj = objA;
                a3Var2 = a3Var;
                j15 = j17;
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j15 = this.f231037g;
                o0Var = (o0) this.f231036f;
                a3Var = (a3) this.f231035e;
                a3Var2 = (a3) this.f231039j;
                u.b(obj);
            }
            o0Var.f66408a = a3Var.L(j15, a3Var2.z(((Number) obj).floatValue()));
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(s1 s1Var, tq.e<? super i0> eVar) {
            return ((b) v(s1Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            b bVar = a3.this.new b(this.f231041l, this.f231042m, eVar);
            bVar.f231039j = obj;
            return bVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"z0/a3$c", "Lz0/s1;", "Lm3/e;", "offset", "Lz3/g;", "source", "b", "(JI)J", "a", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements s1 {
        c() {
        }

        @Override // p143z0.s1
        public long a(long offset, int source) {
            a3.this.latestScrollSource = source;
            g2 g2Var = a3.this.overscrollEffect;
            if (g2Var != null && a3.this.u()) {
                return g2Var.c(offset, a3.this.latestScrollSource, a3.this.performScrollForOverscroll);
            }
            return a3.this.x(a3.this.outerStateScope, offset, source);
        }

        @Override // p143z0.s1
        public long b(long offset, int source) {
            return a3.this.x(a3.this.outerStateScope, offset, source);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc5/y;", "velocity", "<anonymous>", "(Lc5/y;)Lc5/y;"}, k = 3, mv = {2, 1, 0})
    static final class d extends k implements p<y, tq.e<? super y>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        long f231046e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f231047f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ long f231048g;

        d(tq.e<? super d> eVar) {
            super(2, eVar);
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Object B(y yVar, tq.e<? super y> eVar) {
            return M(yVar.getPackedValue(), eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0085, code lost:
        
            if (r0 == r6) goto L22;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r14) throws java.lang.Throwable {
            /*
                r13 = this;
                java.lang.Object r6 = uq.b.e()
                int r0 = r13.f231047f
                r1 = 3
                r2 = 2
                r3 = 1
                if (r0 == 0) goto L35
                if (r0 == r3) goto L2e
                if (r0 == r2) goto L25
                if (r0 != r1) goto L1d
                long r0 = r13.f231046e
                long r2 = r13.f231048g
                oq.u.b(r14)
                r7 = r2
                r3 = r0
                r0 = r14
                goto L88
            L1d:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L25:
                long r2 = r13.f231046e
                long r7 = r13.f231048g
                oq.u.b(r14)
                r0 = r14
                goto L68
            L2e:
                long r3 = r13.f231048g
                oq.u.b(r14)
                r0 = r14
                goto L4c
            L35:
                oq.u.b(r14)
                long r7 = r13.f231048g
                z0.a3 r0 = p143z0.a3.this
                z3.b r0 = p143z0.a3.g(r0)
                r13.f231048g = r7
                r13.f231047f = r3
                java.lang.Object r0 = r0.c(r7, r13)
                if (r0 != r6) goto L4b
                goto L87
            L4b:
                r3 = r7
            L4c:
                c5.y r0 = (c5.y) r0
                long r7 = r0.getPackedValue()
                long r7 = c5.y.k(r3, r7)
                z0.a3 r0 = p143z0.a3.this
                r13.f231048g = r3
                r13.f231046e = r7
                r13.f231047f = r2
                java.lang.Object r0 = r0.c(r7, r13)
                if (r0 != r6) goto L65
                goto L87
            L65:
                r11 = r7
                r7 = r3
                r2 = r11
            L68:
                c5.y r0 = (c5.y) r0
                long r9 = r0.getPackedValue()
                z0.a3 r0 = p143z0.a3.this
                z3.b r0 = p143z0.a3.g(r0)
                long r2 = c5.y.k(r2, r9)
                r13.f231048g = r7
                r13.f231046e = r9
                r13.f231047f = r1
                r5 = r13
                r1 = r2
                r3 = r9
                java.lang.Object r0 = r0.a(r1, r3, r5)
                if (r0 != r6) goto L88
            L87:
                return r6
            L88:
                c5.y r0 = (c5.y) r0
                long r0 = r0.getPackedValue()
                long r0 = c5.y.k(r3, r0)
                long r0 = c5.y.k(r7, r0)
                c5.y r0 = c5.y.b(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: z0.a3.d.J(java.lang.Object):java.lang.Object");
        }

        public final Object M(long j15, tq.e<? super y> eVar) {
            return ((d) v(y.b(j15), eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            d dVar = a3.this.new d(eVar);
            dVar.f231048g = ((y) obj).getPackedValue();
            return dVar;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz0/h2;", "Loq/i0;", "<anonymous>", "(Lz0/h2;)V"}, k = 3, mv = {2, 1, 0})
    static final class e extends k implements p<h2, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f231050e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f231051f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ p<s1, tq.e<? super i0>, Object> f231053h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(p<? super s1, ? super tq.e<? super i0>, ? extends Object> pVar, tq.e<? super e> eVar) {
            super(2, eVar);
            this.f231053h = pVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f231050e;
            if (i15 == 0) {
                u.b(obj);
                a3.this.outerStateScope = (h2) this.f231051f;
                p<s1, tq.e<? super i0>, Object> pVar = this.f231053h;
                c cVar = a3.this.nestedScrollScope;
                this.f231050e = 1;
                if (pVar.B(cVar, this) == objE) {
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
        public final Object B(h2 h2Var, tq.e<? super i0> eVar) {
            return ((e) v(h2Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            e eVar2 = a3.this.new e(this.f231053h, eVar);
            eVar2.f231051f = obj;
            return eVar2;
        }
    }

    public a3(v2 v2Var, g2 g2Var, e1 e1Var, a2 a2Var, boolean z15, z3.b bVar, z1 z1Var, er.a<Boolean> aVar) {
        this.scrollableState = v2Var;
        this.overscrollEffect = g2Var;
        this.flingBehavior = e1Var;
        this.orientation = a2Var;
        this.reverseDirection = z15;
        this.nestedScrollDispatcher = bVar;
        this.onScrollChangedDispatcher = z1Var;
        this.isScrollableNodeAttached = aVar;
    }

    private final long E(long j15) {
        return this.orientation == a2.Horizontal ? y.e(j15, 0.0f, 0.0f, 1, null) : y.e(j15, 0.0f, 0.0f, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float F(long j15) {
        return this.orientation == a2.Horizontal ? y.h(j15) : y.i(j15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long L(long j15, float f15) {
        return this.orientation == a2.Horizontal ? y.e(j15, f15, 0.0f, 2, null) : y.e(j15, 0.0f, f15, 1, null);
    }

    private final long s(long scroll) {
        return H(z(this.scrollableState.f(z(G(scroll)))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean u() {
        return this.scrollableState.e() || this.scrollableState.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long x(h2 h2Var, long j15, int i15) {
        long jD = this.nestedScrollDispatcher.d(j15, i15);
        long jP = m3.e.p(j15, jD);
        long jA = A(H(h2Var.d(G(A(D(jP))))));
        this.onScrollChangedDispatcher.C0(jA);
        return m3.e.q(m3.e.q(jD, jA), this.nestedScrollDispatcher.b(jA, m3.e.p(jP, jA), i15));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m3.e y(a3 a3Var, m3.e eVar) {
        return m3.e.d(a3Var.x(a3Var.outerStateScope, eVar.getPackedValue(), a3Var.latestScrollSource));
    }

    public final long A(long j15) {
        return this.reverseDirection ? m3.e.r(j15, -1.0f) : j15;
    }

    public final Object B(z1 z1Var, p<? super s1, ? super tq.e<? super i0>, ? extends Object> pVar, tq.e<? super i0> eVar) {
        Object objB = this.scrollableState.b(z1Var, new e(pVar, null), eVar);
        return objB == uq.b.e() ? objB : i0.f148189a;
    }

    public final boolean C() {
        if (this.scrollableState.c()) {
            return true;
        }
        g2 g2Var = this.overscrollEffect;
        return g2Var != null ? g2Var.b() : false;
    }

    public final long D(long j15) {
        return this.orientation == a2.Horizontal ? m3.e.g(j15, 0.0f, 0.0f, 1, null) : m3.e.g(j15, 0.0f, 0.0f, 2, null);
    }

    public final float G(long j15) {
        return Float.intBitsToFloat((int) (this.orientation == a2.Horizontal ? j15 >> 32 : j15 & BodyPartID.bodyIdMax));
    }

    public final long H(float f15) {
        if (f15 == 0.0f) {
            return m3.e.INSTANCE.c();
        }
        if (this.orientation == a2.Horizontal) {
            return m3.e.e((((long) Float.floatToRawIntBits(f15)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & BodyPartID.bodyIdMax));
        }
        return m3.e.e((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f15)) & BodyPartID.bodyIdMax));
    }

    public final float I(long j15) {
        int i15 = (int) (BodyPartID.bodyIdMax & j15);
        int i16 = (int) (j15 >> 32);
        if (((float) Math.atan2(Math.abs(Float.intBitsToFloat(i15)), Math.abs(Float.intBitsToFloat(i16)))) >= 0.7853981633974483d) {
            if (this.orientation == a2.Vertical) {
                return Float.intBitsToFloat(i15);
            }
            return 0.0f;
        }
        if (this.orientation == a2.Horizontal) {
            return Float.intBitsToFloat(i16);
        }
        return 0.0f;
    }

    public final long J(float f15) {
        if (f15 == 0.0f) {
            return y.INSTANCE.a();
        }
        return this.orientation == a2.Horizontal ? z.a(f15, 0.0f) : z.a(0.0f, f15);
    }

    public final boolean K(v2 scrollableState, a2 orientation, g2 overscrollEffect, boolean reverseDirection, e1 flingBehavior, z3.b nestedScrollDispatcher) {
        boolean z15;
        boolean z16 = true;
        if (t.c(this.scrollableState, scrollableState)) {
            z15 = false;
        } else {
            this.scrollableState = scrollableState;
            z15 = true;
        }
        this.overscrollEffect = overscrollEffect;
        if (this.orientation != orientation) {
            this.orientation = orientation;
            z15 = true;
        }
        if (this.reverseDirection != reverseDirection) {
            this.reverseDirection = reverseDirection;
        } else {
            z16 = z15;
        }
        this.flingBehavior = flingBehavior;
        this.nestedScrollDispatcher = nestedScrollDispatcher;
        return z16;
    }

    @Override // p143z0.g2
    /* JADX INFO: renamed from: a, reason: from getter */
    public boolean getIsFlinging() {
        return this.isFlinging;
    }

    @Override // p143z0.g2
    public long b(long scroll) {
        return this.scrollableState.c() ? m3.e.INSTANCE.c() : s(scroll);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p143z0.g2
    public Object c(long j15, tq.e<? super y> eVar) throws Throwable {
        a aVar;
        a3 a3Var;
        Throwable th4;
        o0 o0Var;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f231034g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f231034g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f231032e;
        Object objE = uq.b.e();
        int i16 = aVar.f231034g;
        if (i16 != 0) {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o0Var = (o0) aVar.f231031d;
            try {
                u.b(obj);
                a3Var = this;
                a3Var.isFlinging = false;
                return y.b(o0Var.f66408a);
            } catch (Throwable th5) {
                th4 = th5;
                a3Var = this;
                a3Var.isFlinging = false;
                throw th4;
            }
        }
        u.b(obj);
        o0 o0Var2 = new o0();
        o0Var2.f66408a = j15;
        this.isFlinging = true;
        try {
            z1 z1Var = z1.Default;
            a3Var = this;
            try {
                b bVar = a3Var.new b(o0Var2, j15, null);
                aVar.f231031d = o0Var2;
                aVar.f231034g = 1;
                if (B(z1Var, bVar, aVar) == objE) {
                    return objE;
                }
                o0Var = o0Var2;
                a3Var.isFlinging = false;
                return y.b(o0Var.f66408a);
            } catch (Throwable th6) {
                th = th6;
                th4 = th;
                a3Var.isFlinging = false;
                throw th4;
            }
        } catch (Throwable th7) {
            th = th7;
            a3Var = this;
        }
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final v2 getScrollableState() {
        return this.scrollableState;
    }

    public final boolean v() {
        return this.orientation == a2.Vertical;
    }

    public final Object w(long j15, boolean z15, tq.e<? super i0> eVar) {
        if (z15 && !n2.h(this.flingBehavior)) {
            return i0.f148189a;
        }
        long jE = E(j15);
        d dVar = new d(null);
        g2 g2Var = this.overscrollEffect;
        if (g2Var == null || !u()) {
            Object objB = dVar.B(y.b(jE), eVar);
            return objB == uq.b.e() ? objB : i0.f148189a;
        }
        Object objA = g2Var.a(jE, dVar, eVar);
        return objA == uq.b.e() ? objA : i0.f148189a;
    }

    public final float z(float f15) {
        return this.reverseDirection ? f15 * (-1) : f15;
    }
}
