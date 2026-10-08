package p143z0;

import a4.PointerInputChange;
import a4.k0;
import java.util.List;
import ju.d2;
import ju.p0;
import ju.q0;
import ju.r0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0088\u0001\u0010\f\u001a\u00020\u0003*\u00020\u00002\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00012*\b\u0002\u0010\n\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00062\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001H\u0086@¢\u0006\u0004\b\f\u0010\r\u001a\u0090\u0001\u0010\u0013\u001a\u00020\u0003*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00012(\u0010\n\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00062\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001H\u0080@¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0014\u0010\u0015\u001a\u00020\u0003*\u00020\u000eH\u0082@¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u0017*\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0017H\u0082@¢\u0006\u0004\b\u0019\u0010\u001a\u001aX\u0010\u001b\u001a\u00020\u0003*\u00020\u00002*\b\u0002\u0010\n\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00062\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001H\u0080@¢\u0006\u0004\b\u001b\u0010\u001c\u001a(\u0010!\u001a\u00020\u0017*\u00020\u000e2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010 \u001a\u00020\u001fH\u0086@¢\u0006\u0004\b!\u0010\"\u001a%\u0010%\u001a\u00020\u001d*\u00020#2\u0006\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010$\u001a\u00020\u001dH\u0000¢\u0006\u0004\b%\u0010&\u001a \u0010'\u001a\u0004\u0018\u00010\u0017*\u00020\u000e2\b\b\u0002\u0010 \u001a\u00020\u001fH\u0086@¢\u0006\u0004\b'\u0010(\u001a\u001e\u0010*\u001a\u00020)*\u00020\u000e2\b\b\u0002\u0010 \u001a\u00020\u001fH\u0080@¢\u0006\u0004\b*\u0010(\u001aI\u00101\u001a\u00020+*\u00020\u000f2\u0006\u0010,\u001a\u00020+2\b\b\u0002\u0010.\u001a\u00020-2\"\u00100\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t0/H\u0002¢\u0006\u0004\b1\u00102\"6\u00105\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u00066"}, d2 = {"La4/k0;", "Lkotlin/Function1;", "Lm3/e;", "Loq/i0;", "onDoubleTap", "onLongPress", "Lkotlin/Function3;", "Lz0/b2;", "Ltq/e;", "", "onPress", "onTap", "h", "(La4/k0;Ler/l;Ler/l;Ler/q;Ler/l;Ltq/e;)Ljava/lang/Object;", "La4/c;", "Lju/p0;", "scope", "Lz0/c2;", "pressScope", "n", "(La4/c;Lju/p0;Lz0/c2;Ler/l;Ler/l;Ler/q;Ler/l;Ltq/e;)Ljava/lang/Object;", "f", "(La4/c;Ltq/e;)Ljava/lang/Object;", "La4/b0;", "firstUp", "e", "(La4/c;La4/b0;Ltq/e;)Ljava/lang/Object;", "g", "(La4/k0;Ler/q;Ler/l;Ltq/e;)Ljava/lang/Object;", "", "requireUnconsumed", "La4/q;", "pass", "c", "(La4/c;ZLa4/q;Ltq/e;)Ljava/lang/Object;", "La4/o;", "onlyPrimaryMouseButton", "j", "(La4/o;ZZ)Z", "q", "(La4/c;La4/q;Ltq/e;)Ljava/lang/Object;", "Lz0/m1;", "o", "Lju/d2;", "resetJob", "Lju/r0;", "start", "Lkotlin/Function2;", "block", "l", "(Lju/p0;Lju/d2;Lju/r0;Ler/p;)Lju/d2;", "a", "Ler/q;", "NoPressGesture", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class b3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final er.q<b2, m3.e, tq.e<? super i0>, Object> f231080a = new a(null);

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lz0/b2;", "Lm3/e;", "it", "Loq/i0;", "<anonymous>", "(Lz0/b2;Lm3/e;)V"}, k = 3, mv = {2, 1, 0})
    static final class a extends vq.k implements er.q<b2, m3.e, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f231081e;

        a(tq.e<? super a> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f231081e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return i0.f148189a;
        }

        public final Object M(b2 b2Var, long j15, tq.e<? super i0> eVar) {
            return new a(eVar).J(i0.f148189a);
        }

        @Override // er.q
        public /* bridge */ /* synthetic */ Object w(b2 b2Var, m3.e eVar, tq.e<? super i0> eVar2) {
            return M(b2Var, eVar.getPackedValue(), eVar2);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f231082d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f231083e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f231084f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f231085g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f231086h;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f231085g = obj;
            this.f231086h |= PKIFailureInfo.systemUnavail;
            return b3.c(null, false, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"La4/c;", "La4/b0;", "<anonymous>", "(La4/c;)La4/b0;"}, k = 3, mv = {2, 1, 0})
    static final class c extends vq.i implements er.p<a4.c, tq.e<? super PointerInputChange>, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f231087c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f231088d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f231089e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ PointerInputChange f231090f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(PointerInputChange pointerInputChange, tq.e<? super c> eVar) {
            super(2, eVar);
            this.f231090f = pointerInputChange;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0046 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:14:0x0051 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0044 -> B:12:0x0047). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // vq.a
        public final java.lang.Object J(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r11.f231088d
                r2 = 1
                if (r1 == 0) goto L1e
                if (r1 != r2) goto L16
                long r3 = r11.f231087c
                java.lang.Object r1 = r11.f231089e
                a4.c r1 = (a4.c) r1
                oq.u.b(r12)
                r5 = r1
                goto L47
            L16:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1e:
                oq.u.b(r12)
                java.lang.Object r12 = r11.f231089e
                a4.c r12 = (a4.c) r12
                a4.b0 r1 = r11.f231090f
                long r3 = r1.getUptimeMillis()
                androidx.compose.ui.platform.f3 r1 = r12.getViewConfiguration()
                long r5 = r1.b()
                long r3 = r3 + r5
                r5 = r12
            L35:
                r11.f231089e = r5
                r11.f231087c = r3
                r11.f231088d = r2
                r6 = 0
                r7 = 0
                r9 = 3
                r10 = 0
                r8 = r11
                java.lang.Object r12 = p143z0.b3.d(r5, r6, r7, r8, r9, r10)
                if (r12 != r0) goto L47
                return r0
            L47:
                a4.b0 r12 = (a4.PointerInputChange) r12
                long r6 = r12.getUptimeMillis()
                int r1 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
                if (r1 < 0) goto L35
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: z0.b3.c.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
        public final Object B(a4.c cVar, tq.e<? super PointerInputChange> eVar) {
            return ((c) v(cVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            c cVar = new c(this.f231090f, eVar);
            cVar.f231089e = obj;
            return cVar;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f231091d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f231092e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f231093f;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f231092e = obj;
            this.f231093f |= PKIFailureInfo.systemUnavail;
            return b3.f(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class e extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f231094e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f231095f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ k0 f231096g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ er.q<b2, m3.e, tq.e<? super i0>, Object> f231097h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ er.l<m3.e, i0> f231098j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ c2 f231099k;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"La4/c;", "Loq/i0;", "<anonymous>", "(La4/c;)V"}, k = 3, mv = {2, 1, 0})
        static final class a extends vq.i implements er.p<a4.c, tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            Object f231100c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f231101d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private /* synthetic */ Object f231102e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ p0 f231103f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ er.q<b2, m3.e, tq.e<? super i0>, Object> f231104g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ er.l<m3.e, i0> f231105h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ c2 f231106j;

            /* JADX INFO: renamed from: z0.b3$e$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
            static final class C6217a extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f231107e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                final /* synthetic */ er.q<b2, m3.e, tq.e<? super i0>, Object> f231108f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                final /* synthetic */ c2 f231109g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                final /* synthetic */ PointerInputChange f231110h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C6217a(er.q<? super b2, ? super m3.e, ? super tq.e<? super i0>, ? extends Object> qVar, c2 c2Var, PointerInputChange pointerInputChange, tq.e<? super C6217a> eVar) {
                    super(2, eVar);
                    this.f231108f = qVar;
                    this.f231109g = c2Var;
                    this.f231110h = pointerInputChange;
                }

                @Override // vq.a
                public final Object J(Object obj) throws Throwable {
                    Object objE = uq.b.e();
                    int i15 = this.f231107e;
                    if (i15 == 0) {
                        oq.u.b(obj);
                        er.q<b2, m3.e, tq.e<? super i0>, Object> qVar = this.f231108f;
                        c2 c2Var = this.f231109g;
                        m3.e eVarD = m3.e.d(this.f231110h.getPosition());
                        this.f231107e = 1;
                        if (qVar.w(c2Var, eVarD, this) == objE) {
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
                    return ((C6217a) v(p0Var, eVar)).J(i0.f148189a);
                }

                @Override // vq.a
                public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                    return new C6217a(this.f231108f, this.f231109g, this.f231110h, eVar);
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
            static final class b extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f231111e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                final /* synthetic */ c2 f231112f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(c2 c2Var, tq.e<? super b> eVar) {
                    super(2, eVar);
                    this.f231112f = c2Var;
                }

                @Override // vq.a
                public final Object J(Object obj) throws Throwable {
                    uq.b.e();
                    if (this.f231111e != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                    this.f231112f.c();
                    return i0.f148189a;
                }

                @Override // er.p
                /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
                public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
                    return ((b) v(p0Var, eVar)).J(i0.f148189a);
                }

                @Override // vq.a
                public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                    return new b(this.f231112f, eVar);
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
            static final class c extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f231113e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                final /* synthetic */ c2 f231114f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(c2 c2Var, tq.e<? super c> eVar) {
                    super(2, eVar);
                    this.f231114f = c2Var;
                }

                @Override // vq.a
                public final Object J(Object obj) throws Throwable {
                    uq.b.e();
                    if (this.f231113e != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                    this.f231114f.e();
                    return i0.f148189a;
                }

                @Override // er.p
                /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
                public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
                    return ((c) v(p0Var, eVar)).J(i0.f148189a);
                }

                @Override // vq.a
                public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                    return new c(this.f231114f, eVar);
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
            static final class d extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f231115e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                final /* synthetic */ c2 f231116f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                d(c2 c2Var, tq.e<? super d> eVar) {
                    super(2, eVar);
                    this.f231116f = c2Var;
                }

                @Override // vq.a
                public final Object J(Object obj) throws Throwable {
                    Object objE = uq.b.e();
                    int i15 = this.f231115e;
                    if (i15 == 0) {
                        oq.u.b(obj);
                        c2 c2Var = this.f231116f;
                        this.f231115e = 1;
                        if (c2Var.h(this) == objE) {
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
                    return ((d) v(p0Var, eVar)).J(i0.f148189a);
                }

                @Override // vq.a
                public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                    return new d(this.f231116f, eVar);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(p0 p0Var, er.q<? super b2, ? super m3.e, ? super tq.e<? super i0>, ? extends Object> qVar, er.l<? super m3.e, i0> lVar, c2 c2Var, tq.e<? super a> eVar) {
                super(2, eVar);
                this.f231103f = p0Var;
                this.f231104g = qVar;
                this.f231105h = lVar;
                this.f231106j = c2Var;
            }

            /* JADX WARN: Code restructure failed: missing block: B:18:0x0087, code lost:
            
                if (r0 == r6) goto L19;
             */
            @Override // vq.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object J(java.lang.Object r17) throws java.lang.Throwable {
                /*
                    r16 = this;
                    r3 = r16
                    java.lang.Object r6 = uq.b.e()
                    int r0 = r3.f231101d
                    r7 = 2
                    r8 = 1
                    r9 = 0
                    if (r0 == 0) goto L34
                    if (r0 == r8) goto L24
                    if (r0 != r7) goto L1c
                    java.lang.Object r0 = r3.f231102e
                    ju.d2 r0 = (ju.d2) r0
                    oq.u.b(r17)
                    r11 = r0
                    r0 = r17
                    goto L8a
                L1c:
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                    r0.<init>(r1)
                    throw r0
                L24:
                    java.lang.Object r0 = r3.f231100c
                    ju.d2 r0 = (ju.d2) r0
                    java.lang.Object r1 = r3.f231102e
                    a4.c r1 = (a4.c) r1
                    oq.u.b(r17)
                    r11 = r0
                    r0 = r1
                    r1 = r17
                    goto L5f
                L34:
                    oq.u.b(r17)
                    java.lang.Object r0 = r3.f231102e
                    a4.c r0 = (a4.c) r0
                    ju.p0 r10 = r3.f231103f
                    ju.r0 r12 = ju.r0.UNDISPATCHED
                    z0.b3$e$a$d r13 = new z0.b3$e$a$d
                    z0.c2 r1 = r3.f231106j
                    r13.<init>(r1, r9)
                    r14 = 1
                    r15 = 0
                    r11 = 0
                    ju.d2 r10 = ju.i.d(r10, r11, r12, r13, r14, r15)
                    r3.f231102e = r0
                    r3.f231100c = r10
                    r3.f231101d = r8
                    r1 = 0
                    r2 = 0
                    r4 = 3
                    r5 = 0
                    java.lang.Object r1 = p143z0.b3.d(r0, r1, r2, r3, r4, r5)
                    if (r1 != r6) goto L5e
                    goto L89
                L5e:
                    r11 = r10
                L5f:
                    a4.b0 r1 = (a4.PointerInputChange) r1
                    r1.a()
                    er.q<z0.b2, m3.e, tq.e<? super oq.i0>, java.lang.Object> r2 = r3.f231104g
                    er.q r4 = p143z0.b3.b()
                    if (r2 == r4) goto L7d
                    ju.p0 r10 = r3.f231103f
                    z0.b3$e$a$a r13 = new z0.b3$e$a$a
                    er.q<z0.b2, m3.e, tq.e<? super oq.i0>, java.lang.Object> r2 = r3.f231104g
                    z0.c2 r4 = r3.f231106j
                    r13.<init>(r2, r4, r1, r9)
                    r14 = 2
                    r15 = 0
                    r12 = 0
                    p143z0.b3.m(r10, r11, r12, r13, r14, r15)
                L7d:
                    r3.f231102e = r11
                    r3.f231100c = r9
                    r3.f231101d = r7
                    java.lang.Object r0 = p143z0.b3.r(r0, r9, r3, r8, r9)
                    if (r0 != r6) goto L8a
                L89:
                    return r6
                L8a:
                    a4.b0 r0 = (a4.PointerInputChange) r0
                    if (r0 != 0) goto L9e
                    ju.p0 r10 = r3.f231103f
                    z0.b3$e$a$b r13 = new z0.b3$e$a$b
                    z0.c2 r0 = r3.f231106j
                    r13.<init>(r0, r9)
                    r14 = 2
                    r15 = 0
                    r12 = 0
                    p143z0.b3.m(r10, r11, r12, r13, r14, r15)
                    goto Lbf
                L9e:
                    r0.a()
                    ju.p0 r10 = r3.f231103f
                    z0.b3$e$a$c r13 = new z0.b3$e$a$c
                    z0.c2 r1 = r3.f231106j
                    r13.<init>(r1, r9)
                    r14 = 2
                    r15 = 0
                    r12 = 0
                    p143z0.b3.m(r10, r11, r12, r13, r14, r15)
                    er.l<m3.e, oq.i0> r1 = r3.f231105h
                    if (r1 == 0) goto Lbf
                    long r4 = r0.getPosition()
                    m3.e r0 = m3.e.d(r4)
                    r1.b(r0)
                Lbf:
                    oq.i0 r0 = oq.i0.f148189a
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: z0.b3.e.a.J(java.lang.Object):java.lang.Object");
            }

            @Override // er.p
            /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
            public final Object B(a4.c cVar, tq.e<? super i0> eVar) {
                return ((a) v(cVar, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                a aVar = new a(this.f231103f, this.f231104g, this.f231105h, this.f231106j, eVar);
                aVar.f231102e = obj;
                return aVar;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(k0 k0Var, er.q<? super b2, ? super m3.e, ? super tq.e<? super i0>, ? extends Object> qVar, er.l<? super m3.e, i0> lVar, c2 c2Var, tq.e<? super e> eVar) {
            super(2, eVar);
            this.f231096g = k0Var;
            this.f231097h = qVar;
            this.f231098j = lVar;
            this.f231099k = c2Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f231094e;
            if (i15 == 0) {
                oq.u.b(obj);
                p0 p0Var = (p0) this.f231095f;
                k0 k0Var = this.f231096g;
                a aVar = new a(p0Var, this.f231097h, this.f231098j, this.f231099k, null);
                this.f231094e = 1;
                if (g1.d(k0Var, aVar, this) == objE) {
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
            return ((e) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            e eVar2 = new e(this.f231096g, this.f231097h, this.f231098j, this.f231099k, eVar);
            eVar2.f231095f = obj;
            return eVar2;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class f extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f231117e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f231118f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ k0 f231119g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ er.l<m3.e, i0> f231120h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ er.l<m3.e, i0> f231121j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ er.q<b2, m3.e, tq.e<? super i0>, Object> f231122k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ er.l<m3.e, i0> f231123l;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"La4/c;", "Loq/i0;", "<anonymous>", "(La4/c;)V"}, k = 3, mv = {2, 1, 0})
        static final class a extends vq.i implements er.p<a4.c, tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int f231124c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private /* synthetic */ Object f231125d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ p0 f231126e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ c2 f231127f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ er.l<m3.e, i0> f231128g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ er.l<m3.e, i0> f231129h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ er.q<b2, m3.e, tq.e<? super i0>, Object> f231130j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ er.l<m3.e, i0> f231131k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(p0 p0Var, c2 c2Var, er.l<? super m3.e, i0> lVar, er.l<? super m3.e, i0> lVar2, er.q<? super b2, ? super m3.e, ? super tq.e<? super i0>, ? extends Object> qVar, er.l<? super m3.e, i0> lVar3, tq.e<? super a> eVar) {
                super(2, eVar);
                this.f231126e = p0Var;
                this.f231127f = c2Var;
                this.f231128g = lVar;
                this.f231129h = lVar2;
                this.f231130j = qVar;
                this.f231131k = lVar3;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f231124c;
                if (i15 == 0) {
                    oq.u.b(obj);
                    a4.c cVar = (a4.c) this.f231125d;
                    p0 p0Var = this.f231126e;
                    c2 c2Var = this.f231127f;
                    er.l<m3.e, i0> lVar = this.f231128g;
                    er.l<m3.e, i0> lVar2 = this.f231129h;
                    er.q<b2, m3.e, tq.e<? super i0>, Object> qVar = this.f231130j;
                    er.l<m3.e, i0> lVar3 = this.f231131k;
                    this.f231124c = 1;
                    if (b3.n(cVar, p0Var, c2Var, lVar, lVar2, qVar, lVar3, this) == objE) {
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
            /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
            public final Object B(a4.c cVar, tq.e<? super i0> eVar) {
                return ((a) v(cVar, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                a aVar = new a(this.f231126e, this.f231127f, this.f231128g, this.f231129h, this.f231130j, this.f231131k, eVar);
                aVar.f231125d = obj;
                return aVar;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(k0 k0Var, er.l<? super m3.e, i0> lVar, er.l<? super m3.e, i0> lVar2, er.q<? super b2, ? super m3.e, ? super tq.e<? super i0>, ? extends Object> qVar, er.l<? super m3.e, i0> lVar3, tq.e<? super f> eVar) {
            super(2, eVar);
            this.f231119g = k0Var;
            this.f231120h = lVar;
            this.f231121j = lVar2;
            this.f231122k = qVar;
            this.f231123l = lVar3;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f231117e;
            if (i15 == 0) {
                oq.u.b(obj);
                p0 p0Var = (p0) this.f231118f;
                c2 c2Var = new c2(this.f231119g);
                k0 k0Var = this.f231119g;
                a aVar = new a(p0Var, c2Var, this.f231120h, this.f231121j, this.f231122k, this.f231123l, null);
                this.f231117e = 1;
                if (g1.d(k0Var, aVar, this) == objE) {
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
            return ((f) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            f fVar = new f(this.f231119g, this.f231120h, this.f231121j, this.f231122k, this.f231123l, eVar);
            fVar.f231118f = obj;
            return fVar;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class g extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f231132e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f231133f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ d2 f231134g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ er.p<p0, tq.e<? super i0>, Object> f231135h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(d2 d2Var, er.p<? super p0, ? super tq.e<? super i0>, ? extends Object> pVar, tq.e<? super g> eVar) {
            super(2, eVar);
            this.f231134g = d2Var;
            this.f231135h = pVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
        
            if (r5.B(r1, r4) == r0) goto L15;
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
                int r1 = r4.f231132e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                oq.u.b(r5)
                goto L45
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                java.lang.Object r1 = r4.f231133f
                ju.p0 r1 = (ju.p0) r1
                oq.u.b(r5)
                goto L37
            L22:
                oq.u.b(r5)
                java.lang.Object r5 = r4.f231133f
                r1 = r5
                ju.p0 r1 = (ju.p0) r1
                ju.d2 r5 = r4.f231134g
                r4.f231133f = r1
                r4.f231132e = r3
                java.lang.Object r5 = r5.T0(r4)
                if (r5 != r0) goto L37
                goto L44
            L37:
                er.p<ju.p0, tq.e<? super oq.i0>, java.lang.Object> r5 = r4.f231135h
                r3 = 0
                r4.f231133f = r3
                r4.f231132e = r2
                java.lang.Object r5 = r5.B(r1, r4)
                if (r5 != r0) goto L45
            L44:
                return r0
            L45:
                oq.i0 r5 = oq.i0.f148189a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: z0.b3.g.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((g) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            g gVar = new g(this.f231134g, this.f231135h, eVar);
            gVar.f231133f = obj;
            return gVar;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class h extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f231136d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f231137e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f231138f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f231139g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f231140h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f231141j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f231142k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f231143l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f231144m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f231145n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f231146p;

        h(tq.e<? super h> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f231145n = obj;
            this.f231146p |= PKIFailureInfo.systemUnavail;
            return b3.n(null, null, null, null, null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class i extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f231147e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ er.q<b2, m3.e, tq.e<? super i0>, Object> f231148f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ c2 f231149g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ PointerInputChange f231150h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        i(er.q<? super b2, ? super m3.e, ? super tq.e<? super i0>, ? extends Object> qVar, c2 c2Var, PointerInputChange pointerInputChange, tq.e<? super i> eVar) {
            super(2, eVar);
            this.f231148f = qVar;
            this.f231149g = c2Var;
            this.f231150h = pointerInputChange;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f231147e;
            if (i15 == 0) {
                oq.u.b(obj);
                er.q<b2, m3.e, tq.e<? super i0>, Object> qVar = this.f231148f;
                c2 c2Var = this.f231149g;
                m3.e eVarD = m3.e.d(this.f231150h.getPosition());
                this.f231147e = 1;
                if (qVar.w(c2Var, eVarD, this) == objE) {
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
            return ((i) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new i(this.f231148f, this.f231149g, this.f231150h, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class j extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f231151e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ c2 f231152f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(c2 c2Var, tq.e<? super j> eVar) {
            super(2, eVar);
            this.f231152f = c2Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f231151e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            this.f231152f.e();
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((j) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new j(this.f231152f, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class k extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f231153e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ c2 f231154f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(c2 c2Var, tq.e<? super k> eVar) {
            super(2, eVar);
            this.f231154f = c2Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f231153e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            this.f231154f.c();
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((k) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new k(this.f231154f, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class l extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f231155e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ c2 f231156f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(c2 c2Var, tq.e<? super l> eVar) {
            super(2, eVar);
            this.f231156f = c2Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f231155e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            this.f231156f.e();
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((l) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new l(this.f231156f, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class m extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f231157e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ d2 f231158f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ c2 f231159g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(d2 d2Var, c2 c2Var, tq.e<? super m> eVar) {
            super(2, eVar);
            this.f231158f = d2Var;
            this.f231159g = c2Var;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
        
            if (r5.h(r4) == r0) goto L15;
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
                int r1 = r4.f231157e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                oq.u.b(r5)
                goto L37
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                oq.u.b(r5)
                goto L2c
            L1e:
                oq.u.b(r5)
                ju.d2 r5 = r4.f231158f
                r4.f231157e = r3
                java.lang.Object r5 = r5.T0(r4)
                if (r5 != r0) goto L2c
                goto L36
            L2c:
                z0.c2 r5 = r4.f231159g
                r4.f231157e = r2
                java.lang.Object r5 = r5.h(r4)
                if (r5 != r0) goto L37
            L36:
                return r0
            L37:
                oq.i0 r5 = oq.i0.f148189a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: z0.b3.m.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((m) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new m(this.f231158f, this.f231159g, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class n extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f231160e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ er.q<b2, m3.e, tq.e<? super i0>, Object> f231161f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ c2 f231162g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ PointerInputChange f231163h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        n(er.q<? super b2, ? super m3.e, ? super tq.e<? super i0>, ? extends Object> qVar, c2 c2Var, PointerInputChange pointerInputChange, tq.e<? super n> eVar) {
            super(2, eVar);
            this.f231161f = qVar;
            this.f231162g = c2Var;
            this.f231163h = pointerInputChange;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f231160e;
            if (i15 == 0) {
                oq.u.b(obj);
                er.q<b2, m3.e, tq.e<? super i0>, Object> qVar = this.f231161f;
                c2 c2Var = this.f231162g;
                m3.e eVarD = m3.e.d(this.f231163h.getPosition());
                this.f231160e = 1;
                if (qVar.w(c2Var, eVarD, this) == objE) {
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
            return ((n) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new n(this.f231161f, this.f231162g, this.f231163h, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class o extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f231164e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ c2 f231165f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(c2 c2Var, tq.e<? super o> eVar) {
            super(2, eVar);
            this.f231165f = c2Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f231164e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            this.f231165f.e();
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((o) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new o(this.f231165f, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class p extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f231166e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ c2 f231167f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(c2 c2Var, tq.e<? super p> eVar) {
            super(2, eVar);
            this.f231167f = c2Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f231166e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            this.f231167f.c();
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((p) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new p(this.f231167f, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class q extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f231168e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ c2 f231169f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(c2 c2Var, tq.e<? super q> eVar) {
            super(2, eVar);
            this.f231169f = c2Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f231168e;
            if (i15 == 0) {
                oq.u.b(obj);
                c2 c2Var = this.f231169f;
                this.f231168e = 1;
                if (c2Var.h(this) == objE) {
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
            return ((q) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new q(this.f231169f, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class r extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f231170e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ c2 f231171f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(c2 c2Var, tq.e<? super r> eVar) {
            super(2, eVar);
            this.f231171f = c2Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f231170e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            this.f231171f.e();
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((r) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new r(this.f231171f, eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class s extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f231172d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f231173e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f231174f;

        s(tq.e<? super s> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f231173e = obj;
            this.f231174f |= PKIFailureInfo.systemUnavail;
            return b3.o(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"La4/c;", "Loq/i0;", "<anonymous>", "(La4/c;)V"}, k = 3, mv = {2, 1, 0})
    static final class t extends vq.i implements er.p<a4.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f231175c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f231176d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ a4.q f231177e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ fr.p0<m1> f231178f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(a4.q qVar, fr.p0<m1> p0Var, tq.e<? super t> eVar) {
            super(2, eVar);
            this.f231177e = qVar;
            this.f231178f = p0Var;
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0050  */
        /* JADX WARN: Code duplicated, block: B:21:0x0062  */
        /* JADX WARN: Code duplicated, block: B:22:0x006a  */
        /* JADX WARN: Code duplicated, block: B:26:0x0084  */
        /* JADX WARN: Code duplicated, block: B:41:0x00d3 A[LOOP:1: B:16:0x004e->B:41:0x00d3, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:47:0x00d7 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:48:0x005c A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:50:0x0096 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r0v2, types: [T, z0.m1$a] */
        /* JADX WARN: Type inference failed for: r0v3, types: [T, z0.m1$c] */
        /* JADX WARN: Type inference failed for: r0v4, types: [T, z0.m1$a] */
        /* JADX WARN: Type inference failed for: r1v2, types: [T, z0.m1$b] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00a7 -> B:34:0x00aa). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // vq.a
        public final java.lang.Object J(java.lang.Object r14) {
            /*
                Method dump skipped, instruction units count: 237
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: z0.b3.t.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
        public final Object B(a4.c cVar, tq.e<? super i0> eVar) {
            return ((t) v(cVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            t tVar = new t(this.f231177e, this.f231178f, eVar);
            tVar.f231176d = obj;
            return tVar;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class u extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f231179d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f231180e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f231181f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f231182g;

        u(tq.e<? super u> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f231181f = obj;
            this.f231182g |= PKIFailureInfo.systemUnavail;
            return b3.q(null, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0050 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x005c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004e -> B:18:0x0051). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object c(a4.c r7, boolean r8, a4.q r9, tq.e<? super a4.PointerInputChange> r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof z0.b3.b
            if (r0 == 0) goto L13
            r0 = r10
            z0.b3$b r0 = (z0.b3.b) r0
            int r1 = r0.f231086h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f231086h = r1
            goto L18
        L13:
            z0.b3$b r0 = new z0.b3$b
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f231085g
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f231086h
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            boolean r7 = r0.f231084f
            java.lang.Object r8 = r0.f231083e
            a4.q r8 = (a4.q) r8
            java.lang.Object r9 = r0.f231082d
            a4.c r9 = (a4.c) r9
            oq.u.b(r10)
            r6 = r8
            r8 = r7
            r7 = r9
            r9 = r6
            goto L51
        L37:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3f:
            oq.u.b(r10)
        L42:
            r0.f231082d = r7
            r0.f231083e = r9
            r0.f231084f = r8
            r0.f231086h = r3
            java.lang.Object r10 = r7.k2(r9, r0)
            if (r10 != r1) goto L51
            return r1
        L51:
            a4.o r10 = (a4.o) r10
            r2 = 2
            r4 = 0
            r5 = 0
            boolean r2 = k(r10, r8, r5, r2, r4)
            if (r2 == 0) goto L42
            java.util.List r7 = r10.c()
            java.lang.Object r7 = r7.get(r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p143z0.b3.c(a4.c, boolean, a4.q, tq.e):java.lang.Object");
    }

    public static /* synthetic */ Object d(a4.c cVar, boolean z15, a4.q qVar, tq.e eVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            z15 = true;
        }
        if ((i15 & 2) != 0) {
            qVar = a4.q.Main;
        }
        return c(cVar, z15, qVar, eVar);
    }

    private static final Object e(a4.c cVar, PointerInputChange pointerInputChange, tq.e<? super PointerInputChange> eVar) {
        return cVar.z1(cVar.getViewConfiguration().a(), new c(pointerInputChange, null), eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x0043 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0055 A[LOOP:0: B:19:0x0053->B:20:0x0055, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:23:0x006e  */
    /* JADX WARN: Code duplicated, block: B:26:0x007b A[LOOP:1: B:22:0x006c->B:26:0x007b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x0038 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0041 -> B:18:0x0044). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:23:0x006e
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object f(a4.c r8, tq.e<? super oq.i0> r9) {
        /*
            boolean r0 = r9 instanceof z0.b3.d
            if (r0 == 0) goto L13
            r0 = r9
            z0.b3$d r0 = (z0.b3.d) r0
            int r1 = r0.f231093f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f231093f = r1
            goto L18
        L13:
            z0.b3$d r0 = new z0.b3$d
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f231092e
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f231093f
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r8 = r0.f231091d
            a4.c r8 = (a4.c) r8
            oq.u.b(r9)
            goto L44
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            oq.u.b(r9)
        L38:
            r0.f231091d = r8
            r0.f231093f = r3
            r9 = 0
            java.lang.Object r9 = a4.c.Q0(r8, r9, r0, r3, r9)
            if (r9 != r1) goto L44
            return r1
        L44:
            a4.o r9 = (a4.o) r9
            java.util.List r2 = r9.c()
            r4 = r2
            java.util.Collection r4 = (java.util.Collection) r4
            int r4 = r4.size()
            r5 = 0
            r6 = r5
        L53:
            if (r6 >= r4) goto L61
            java.lang.Object r7 = r2.get(r6)
            a4.b0 r7 = (a4.PointerInputChange) r7
            r7.a()
            int r6 = r6 + 1
            goto L53
        L61:
            java.util.List r9 = r9.c()
            r2 = r9
            java.util.Collection r2 = (java.util.Collection) r2
            int r2 = r2.size()
        L6c:
            if (r5 >= r2) goto L7e
            java.lang.Object r4 = r9.get(r5)
            a4.b0 r4 = (a4.PointerInputChange) r4
            boolean r4 = r4.getPressed()
            if (r4 == 0) goto L7b
            goto L38
        L7b:
            int r5 = r5 + 1
            goto L6c
        L7e:
            oq.i0 r8 = oq.i0.f148189a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p143z0.b3.f(a4.c, tq.e):java.lang.Object");
    }

    public static final Object g(k0 k0Var, er.q<? super b2, ? super m3.e, ? super tq.e<? super i0>, ? extends Object> qVar, er.l<? super m3.e, i0> lVar, tq.e<? super i0> eVar) {
        Object objE = q0.e(new e(k0Var, qVar, lVar, new c2(k0Var), null), eVar);
        return objE == uq.b.e() ? objE : i0.f148189a;
    }

    public static final Object h(k0 k0Var, er.l<? super m3.e, i0> lVar, er.l<? super m3.e, i0> lVar2, er.q<? super b2, ? super m3.e, ? super tq.e<? super i0>, ? extends Object> qVar, er.l<? super m3.e, i0> lVar3, tq.e<? super i0> eVar) {
        Object objE = q0.e(new f(k0Var, lVar, lVar2, qVar, lVar3, null), eVar);
        return objE == uq.b.e() ? objE : i0.f148189a;
    }

    public static /* synthetic */ Object i(k0 k0Var, er.l lVar, er.l lVar2, er.q qVar, er.l lVar3, tq.e eVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            lVar = null;
        }
        if ((i15 & 2) != 0) {
            lVar2 = null;
        }
        if ((i15 & 4) != 0) {
            qVar = f231080a;
        }
        if ((i15 & 8) != 0) {
            lVar3 = null;
        }
        return h(k0Var, lVar, lVar2, qVar, lVar3, eVar);
    }

    public static final boolean j(a4.o oVar, boolean z15, boolean z16) {
        if (z16) {
            List<PointerInputChange> listC = oVar.c();
            int size = listC.size();
            int i15 = 0;
            while (true) {
                if (i15 >= size) {
                    if (a4.t.b(oVar.getButtons())) {
                        break;
                    }
                    return false;
                }
                if (!a4.p0.i(listC.get(i15).getType(), a4.p0.INSTANCE.b())) {
                    break;
                }
                i15++;
            }
        }
        List<PointerInputChange> listC2 = oVar.c();
        int size2 = listC2.size();
        for (int i16 = 0; i16 < size2; i16++) {
            PointerInputChange pointerInputChange = listC2.get(i16);
            if (!(z15 ? a4.p.a(pointerInputChange) : a4.p.b(pointerInputChange))) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean k(a4.o oVar, boolean z15, boolean z16, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            z16 = c3.a();
        }
        return j(oVar, z15, z16);
    }

    private static final d2 l(p0 p0Var, d2 d2Var, r0 r0Var, er.p<? super p0, ? super tq.e<? super i0>, ? extends Object> pVar) {
        return ju.k.d(p0Var, null, r0Var, new g(d2Var, pVar, null), 1, null);
    }

    static /* synthetic */ d2 m(p0 p0Var, d2 d2Var, r0 r0Var, er.p pVar, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            r0Var = r0.UNDISPATCHED;
        }
        return l(p0Var, d2Var, r0Var, pVar);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0427  */
    /* JADX WARN: Code duplicated, block: B:102:0x0433  */
    /* JADX WARN: Code duplicated, block: B:106:0x043c  */
    /* JADX WARN: Code duplicated, block: B:27:0x019e  */
    /* JADX WARN: Code duplicated, block: B:28:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:30:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:33:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:35:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:38:0x0200  */
    /* JADX WARN: Code duplicated, block: B:41:0x0211  */
    /* JADX WARN: Code duplicated, block: B:44:0x0239  */
    /* JADX WARN: Code duplicated, block: B:47:0x0256  */
    /* JADX WARN: Code duplicated, block: B:49:0x025a  */
    /* JADX WARN: Code duplicated, block: B:50:0x0261  */
    /* JADX WARN: Code duplicated, block: B:52:0x0265  */
    /* JADX WARN: Code duplicated, block: B:55:0x0270  */
    /* JADX WARN: Code duplicated, block: B:56:0x028a  */
    /* JADX WARN: Code duplicated, block: B:58:0x02a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x02aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:61:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:64:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:67:0x02e8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:69:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:71:0x0317  */
    /* JADX WARN: Code duplicated, block: B:73:0x0331  */
    /* JADX WARN: Code duplicated, block: B:76:0x034e  */
    /* JADX WARN: Code duplicated, block: B:78:0x0356  */
    /* JADX WARN: Code duplicated, block: B:81:0x0372  */
    /* JADX WARN: Code duplicated, block: B:84:0x0387  */
    /* JADX WARN: Code duplicated, block: B:87:0x03af  */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Code duplicated, block: B:90:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:92:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:94:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:96:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:98:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:99:0x040d  */
    public static final Object n(a4.c cVar, p0 p0Var, c2 c2Var, er.l<? super m3.e, i0> lVar, er.l<? super m3.e, i0> lVar2, er.q<? super b2, ? super m3.e, ? super tq.e<? super i0>, ? extends Object> qVar, er.l<? super m3.e, i0> lVar3, tq.e<? super i0> eVar) throws Throwable {
        h hVar;
        er.l<? super m3.e, i0> lVar4;
        er.q<? super b2, ? super m3.e, ? super tq.e<? super i0>, ? extends Object> qVar2;
        er.l<? super m3.e, i0> lVar5;
        c2 c2Var2;
        er.l<? super m3.e, i0> lVar6;
        a4.c cVar2;
        p0 p0Var2;
        PointerInputChange pointerInputChange;
        d2 d2VarD;
        d2 d2Var;
        er.l<? super m3.e, i0> lVar7;
        er.q<? super b2, ? super m3.e, ? super tq.e<? super i0>, ? extends Object> qVar3;
        a4.c cVar3;
        c2 c2Var3;
        er.l<? super m3.e, i0> lVar8;
        er.l<? super m3.e, i0> lVar9;
        er.l<? super m3.e, i0> lVar10;
        er.l<? super m3.e, i0> lVar11;
        a4.c cVar4;
        p0 p0Var3;
        c2 c2Var4;
        er.q<? super b2, ? super m3.e, ? super tq.e<? super i0>, ? extends Object> qVar4;
        er.l<? super m3.e, i0> lVar12;
        PointerInputChange finalUpChange;
        d2 d2VarM;
        Object objE;
        PointerInputChange pointerInputChange2;
        a4.c cVar5;
        p0 p0Var4;
        er.l<? super m3.e, i0> lVar13;
        er.l<? super m3.e, i0> lVar14;
        er.l<? super m3.e, i0> lVar15;
        c2 c2Var5;
        m1 m1Var;
        d2 d2Var2;
        p0 p0Var5;
        c2 c2Var6;
        PointerInputChange pointerInputChange3;
        d2 d2VarD2;
        Object objP;
        PointerInputChange pointerInputChange4;
        PointerInputChange pointerInputChange5;
        c2 c2Var7;
        er.l<? super m3.e, i0> lVar16;
        er.l<? super m3.e, i0> lVar17;
        er.l<? super m3.e, i0> lVar18;
        p0 p0Var6;
        a4.c cVar6;
        p0 p0Var7;
        PointerInputChange finalUpChange2;
        m1 m1Var2;
        d2 d2Var3;
        c2 c2Var8;
        p0 p0Var8;
        if (eVar instanceof h) {
            hVar = (h) eVar;
            int i15 = hVar.f231146p;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                hVar.f231146p = i15 - PKIFailureInfo.systemUnavail;
            } else {
                hVar = new h(eVar);
            }
        } else {
            hVar = new h(eVar);
        }
        h hVar2 = hVar;
        Object objP2 = hVar2.f231145n;
        Object objE2 = uq.b.e();
        switch (hVar2.f231146p) {
            case 0:
                oq.u.b(objP2);
                hVar2.f231136d = cVar;
                hVar2.f231137e = p0Var;
                hVar2.f231138f = c2Var;
                hVar2.f231139g = lVar;
                lVar4 = lVar2;
                hVar2.f231140h = lVar4;
                qVar2 = qVar;
                hVar2.f231141j = qVar2;
                lVar5 = lVar3;
                hVar2.f231142k = lVar5;
                hVar2.f231146p = 1;
                Object objD = d(cVar, false, null, hVar2, 3, null);
                if (objD != objE2) {
                    c2Var2 = c2Var;
                    lVar6 = lVar;
                    cVar2 = cVar;
                    p0Var2 = p0Var;
                    objP2 = objD;
                    pointerInputChange = (PointerInputChange) objP2;
                    pointerInputChange.a();
                    d2VarD = ju.k.d(p0Var2, null, r0.UNDISPATCHED, new q(c2Var2, null), 1, null);
                    if (qVar2 != f231080a) {
                        m(p0Var2, d2VarD, null, new i(qVar2, c2Var2, pointerInputChange, null), 2, null);
                        d2Var = d2VarD;
                    } else {
                        d2Var = d2VarD;
                    }
                    if (lVar4 == null) {
                        hVar2.f231136d = cVar2;
                        hVar2.f231137e = p0Var2;
                        hVar2.f231138f = c2Var2;
                        hVar2.f231139g = lVar6;
                        hVar2.f231140h = lVar4;
                        hVar2.f231141j = qVar2;
                        hVar2.f231142k = lVar5;
                        hVar2.f231143l = d2Var;
                        hVar2.f231146p = 2;
                        objP2 = r(cVar2, null, hVar2, 1, null);
                        if (objP2 != objE2) {
                            c2 c2Var9 = c2Var2;
                            lVar10 = lVar6;
                            lVar11 = lVar4;
                            cVar4 = cVar2;
                            p0Var3 = p0Var2;
                            c2Var4 = c2Var9;
                            qVar4 = qVar2;
                            lVar12 = lVar5;
                            finalUpChange = (PointerInputChange) objP2;
                            if (finalUpChange == null) {
                                d2VarM = m(p0Var3, d2Var, null, new k(c2Var4, null), 2, null);
                            } else {
                                finalUpChange.a();
                                d2VarM = m(p0Var3, d2Var, null, new l(c2Var4, null), 2, null);
                            }
                            if (finalUpChange != null) {
                                if (lVar10 == null) {
                                    hVar2.f231136d = cVar4;
                                    hVar2.f231137e = p0Var3;
                                    hVar2.f231138f = c2Var4;
                                    hVar2.f231139g = lVar10;
                                    hVar2.f231140h = lVar11;
                                    hVar2.f231141j = qVar4;
                                    hVar2.f231142k = lVar12;
                                    hVar2.f231143l = finalUpChange;
                                    hVar2.f231144m = d2VarM;
                                    hVar2.f231146p = 5;
                                    objE = e(cVar4, finalUpChange, hVar2);
                                    if (objE != objE2) {
                                        er.l<? super m3.e, i0> lVar19 = lVar12;
                                        pointerInputChange2 = finalUpChange;
                                        objP2 = objE;
                                        cVar5 = cVar4;
                                        p0Var4 = p0Var3;
                                        lVar13 = lVar10;
                                        lVar14 = lVar19;
                                        c2 c2Var10 = c2Var4;
                                        lVar15 = lVar11;
                                        c2Var5 = c2Var10;
                                        pointerInputChange3 = (PointerInputChange) objP2;
                                        if (pointerInputChange3 != null) {
                                            d2VarD2 = ju.k.d(p0Var4, null, r0.UNDISPATCHED, new m(d2VarM, c2Var5, null), 1, null);
                                            if (qVar4 != f231080a) {
                                                m(p0Var4, d2VarD2, null, new n(qVar4, c2Var5, pointerInputChange3, null), 2, null);
                                            }
                                            if (lVar15 == null) {
                                                hVar2.f231136d = p0Var4;
                                                hVar2.f231137e = c2Var5;
                                                hVar2.f231138f = lVar13;
                                                hVar2.f231139g = lVar14;
                                                hVar2.f231140h = d2VarD2;
                                                hVar2.f231141j = pointerInputChange2;
                                                hVar2.f231142k = null;
                                                hVar2.f231143l = null;
                                                hVar2.f231144m = null;
                                                hVar2.f231146p = 6;
                                                objP2 = r(cVar5, null, hVar2, 1, null);
                                                if (objP2 != objE2) {
                                                    pointerInputChange5 = pointerInputChange2;
                                                    lVar16 = lVar14;
                                                    lVar18 = lVar13;
                                                    p0Var7 = p0Var4;
                                                    finalUpChange2 = (PointerInputChange) objP2;
                                                    if (finalUpChange2 != null) {
                                                        finalUpChange2.a();
                                                        m(p0Var7, d2VarD2, null, new o(c2Var5, null), 2, null);
                                                        lVar18.b(m3.e.d(finalUpChange2.getPosition()));
                                                    } else {
                                                        m(p0Var7, d2VarD2, null, new p(c2Var5, null), 2, null);
                                                        if (lVar16 != null) {
                                                            lVar16.b(m3.e.d(pointerInputChange5.getPosition()));
                                                        }
                                                    }
                                                }
                                            } else {
                                                hVar2.f231136d = cVar5;
                                                hVar2.f231137e = p0Var4;
                                                hVar2.f231138f = c2Var5;
                                                hVar2.f231139g = lVar13;
                                                hVar2.f231140h = lVar15;
                                                hVar2.f231141j = lVar14;
                                                hVar2.f231142k = d2VarD2;
                                                hVar2.f231143l = pointerInputChange2;
                                                hVar2.f231144m = pointerInputChange3;
                                                hVar2.f231146p = 7;
                                                objP = p(cVar5, null, hVar2, 1, null);
                                                if (objP != objE2) {
                                                    PointerInputChange pointerInputChange6 = pointerInputChange2;
                                                    pointerInputChange4 = pointerInputChange3;
                                                    objP2 = objP;
                                                    pointerInputChange5 = pointerInputChange6;
                                                    er.l<? super m3.e, i0> lVar20 = lVar15;
                                                    c2Var7 = c2Var5;
                                                    lVar16 = lVar14;
                                                    lVar17 = lVar20;
                                                    lVar18 = lVar13;
                                                    p0Var6 = p0Var4;
                                                    cVar6 = cVar5;
                                                    m1Var2 = (m1) objP2;
                                                    if (!fr.t.c(m1Var2, m1.c.f231456a)) {
                                                        lVar17.b(m3.e.d(pointerInputChange4.getPosition()));
                                                        hVar2.f231136d = p0Var6;
                                                        hVar2.f231137e = c2Var7;
                                                        hVar2.f231138f = d2VarD2;
                                                        hVar2.f231139g = null;
                                                        hVar2.f231140h = null;
                                                        hVar2.f231141j = null;
                                                        hVar2.f231142k = null;
                                                        hVar2.f231143l = null;
                                                        hVar2.f231144m = null;
                                                        hVar2.f231146p = 8;
                                                        if (f(cVar6, hVar2) != objE2) {
                                                            d2Var3 = d2VarD2;
                                                            c2Var8 = c2Var7;
                                                            p0Var8 = p0Var6;
                                                            m(p0Var8, d2Var3, null, new r(c2Var8, null), 2, null);
                                                            return i0.f148189a;
                                                        }
                                                    } else {
                                                        if (m1Var2 instanceof m1.b) {
                                                            finalUpChange2 = ((m1.b) m1Var2).getFinalUpChange();
                                                        } else {
                                                            if (m1Var2 instanceof m1.a) {
                                                                throw new oq.p();
                                                            }
                                                            finalUpChange2 = null;
                                                        }
                                                        c2Var5 = c2Var7;
                                                        p0Var7 = p0Var6;
                                                        if (finalUpChange2 != null) {
                                                            finalUpChange2.a();
                                                            m(p0Var7, d2VarD2, null, new o(c2Var5, null), 2, null);
                                                            lVar18.b(m3.e.d(finalUpChange2.getPosition()));
                                                        } else {
                                                            m(p0Var7, d2VarD2, null, new p(c2Var5, null), 2, null);
                                                            if (lVar16 != null) {
                                                                lVar16.b(m3.e.d(pointerInputChange5.getPosition()));
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (lVar14 != null) {
                                            lVar14.b(m3.e.d(pointerInputChange2.getPosition()));
                                        }
                                    }
                                } else if (lVar12 != null) {
                                    lVar12.b(m3.e.d(finalUpChange.getPosition()));
                                }
                            }
                            return i0.f148189a;
                        }
                    } else {
                        hVar2.f231136d = cVar2;
                        hVar2.f231137e = p0Var2;
                        hVar2.f231138f = c2Var2;
                        hVar2.f231139g = lVar6;
                        hVar2.f231140h = lVar4;
                        hVar2.f231141j = qVar2;
                        hVar2.f231142k = lVar5;
                        hVar2.f231143l = pointerInputChange;
                        hVar2.f231144m = d2Var;
                        hVar2.f231146p = 3;
                        objP2 = p(cVar2, null, hVar2, 1, null);
                        if (objP2 != objE2) {
                            er.l<? super m3.e, i0> lVar21 = lVar4;
                            lVar7 = lVar6;
                            qVar3 = qVar2;
                            cVar3 = cVar2;
                            c2Var3 = c2Var2;
                            lVar8 = lVar21;
                            lVar9 = lVar5;
                            m1Var = (m1) objP2;
                            if (!fr.t.c(m1Var, m1.c.f231456a)) {
                                if (m1Var instanceof m1.b) {
                                    finalUpChange = ((m1.b) m1Var).getFinalUpChange();
                                } else {
                                    if (!(m1Var instanceof m1.a)) {
                                        throw new oq.p();
                                    }
                                    finalUpChange = null;
                                }
                                c2 c2Var11 = c2Var3;
                                p0Var3 = p0Var2;
                                c2Var4 = c2Var11;
                                lVar12 = lVar9;
                                qVar4 = qVar3;
                                lVar11 = lVar8;
                                lVar10 = lVar7;
                                cVar4 = cVar3;
                                if (finalUpChange == null) {
                                    d2VarM = m(p0Var3, d2Var, null, new k(c2Var4, null), 2, null);
                                } else {
                                    finalUpChange.a();
                                    d2VarM = m(p0Var3, d2Var, null, new l(c2Var4, null), 2, null);
                                }
                                if (finalUpChange != null) {
                                    if (lVar10 == null) {
                                        hVar2.f231136d = cVar4;
                                        hVar2.f231137e = p0Var3;
                                        hVar2.f231138f = c2Var4;
                                        hVar2.f231139g = lVar10;
                                        hVar2.f231140h = lVar11;
                                        hVar2.f231141j = qVar4;
                                        hVar2.f231142k = lVar12;
                                        hVar2.f231143l = finalUpChange;
                                        hVar2.f231144m = d2VarM;
                                        hVar2.f231146p = 5;
                                        objE = e(cVar4, finalUpChange, hVar2);
                                        if (objE != objE2) {
                                            er.l<? super m3.e, i0> lVar110 = lVar12;
                                            pointerInputChange2 = finalUpChange;
                                            objP2 = objE;
                                            cVar5 = cVar4;
                                            p0Var4 = p0Var3;
                                            lVar13 = lVar10;
                                            lVar14 = lVar110;
                                            c2 c2Var12 = c2Var4;
                                            lVar15 = lVar11;
                                            c2Var5 = c2Var12;
                                            pointerInputChange3 = (PointerInputChange) objP2;
                                            if (pointerInputChange3 != null) {
                                                d2VarD2 = ju.k.d(p0Var4, null, r0.UNDISPATCHED, new m(d2VarM, c2Var5, null), 1, null);
                                                if (qVar4 != f231080a) {
                                                    m(p0Var4, d2VarD2, null, new n(qVar4, c2Var5, pointerInputChange3, null), 2, null);
                                                }
                                                if (lVar15 == null) {
                                                    hVar2.f231136d = p0Var4;
                                                    hVar2.f231137e = c2Var5;
                                                    hVar2.f231138f = lVar13;
                                                    hVar2.f231139g = lVar14;
                                                    hVar2.f231140h = d2VarD2;
                                                    hVar2.f231141j = pointerInputChange2;
                                                    hVar2.f231142k = null;
                                                    hVar2.f231143l = null;
                                                    hVar2.f231144m = null;
                                                    hVar2.f231146p = 6;
                                                    objP2 = r(cVar5, null, hVar2, 1, null);
                                                    if (objP2 != objE2) {
                                                        pointerInputChange5 = pointerInputChange2;
                                                        lVar16 = lVar14;
                                                        lVar18 = lVar13;
                                                        p0Var7 = p0Var4;
                                                        finalUpChange2 = (PointerInputChange) objP2;
                                                        if (finalUpChange2 != null) {
                                                            finalUpChange2.a();
                                                            m(p0Var7, d2VarD2, null, new o(c2Var5, null), 2, null);
                                                            lVar18.b(m3.e.d(finalUpChange2.getPosition()));
                                                        } else {
                                                            m(p0Var7, d2VarD2, null, new p(c2Var5, null), 2, null);
                                                            if (lVar16 != null) {
                                                                lVar16.b(m3.e.d(pointerInputChange5.getPosition()));
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    hVar2.f231136d = cVar5;
                                                    hVar2.f231137e = p0Var4;
                                                    hVar2.f231138f = c2Var5;
                                                    hVar2.f231139g = lVar13;
                                                    hVar2.f231140h = lVar15;
                                                    hVar2.f231141j = lVar14;
                                                    hVar2.f231142k = d2VarD2;
                                                    hVar2.f231143l = pointerInputChange2;
                                                    hVar2.f231144m = pointerInputChange3;
                                                    hVar2.f231146p = 7;
                                                    objP = p(cVar5, null, hVar2, 1, null);
                                                    if (objP != objE2) {
                                                        PointerInputChange pointerInputChange7 = pointerInputChange2;
                                                        pointerInputChange4 = pointerInputChange3;
                                                        objP2 = objP;
                                                        pointerInputChange5 = pointerInputChange7;
                                                        er.l<? super m3.e, i0> lVar22 = lVar15;
                                                        c2Var7 = c2Var5;
                                                        lVar16 = lVar14;
                                                        lVar17 = lVar22;
                                                        lVar18 = lVar13;
                                                        p0Var6 = p0Var4;
                                                        cVar6 = cVar5;
                                                        m1Var2 = (m1) objP2;
                                                        if (!fr.t.c(m1Var2, m1.c.f231456a)) {
                                                            lVar17.b(m3.e.d(pointerInputChange4.getPosition()));
                                                            hVar2.f231136d = p0Var6;
                                                            hVar2.f231137e = c2Var7;
                                                            hVar2.f231138f = d2VarD2;
                                                            hVar2.f231139g = null;
                                                            hVar2.f231140h = null;
                                                            hVar2.f231141j = null;
                                                            hVar2.f231142k = null;
                                                            hVar2.f231143l = null;
                                                            hVar2.f231144m = null;
                                                            hVar2.f231146p = 8;
                                                            if (f(cVar6, hVar2) != objE2) {
                                                                d2Var3 = d2VarD2;
                                                                c2Var8 = c2Var7;
                                                                p0Var8 = p0Var6;
                                                                m(p0Var8, d2Var3, null, new r(c2Var8, null), 2, null);
                                                                return i0.f148189a;
                                                            }
                                                        } else {
                                                            if (m1Var2 instanceof m1.b) {
                                                                finalUpChange2 = ((m1.b) m1Var2).getFinalUpChange();
                                                            } else {
                                                                if (m1Var2 instanceof m1.a) {
                                                                    throw new oq.p();
                                                                }
                                                                finalUpChange2 = null;
                                                            }
                                                            c2Var5 = c2Var7;
                                                            p0Var7 = p0Var6;
                                                            if (finalUpChange2 != null) {
                                                                finalUpChange2.a();
                                                                m(p0Var7, d2VarD2, null, new o(c2Var5, null), 2, null);
                                                                lVar18.b(m3.e.d(finalUpChange2.getPosition()));
                                                            } else {
                                                                m(p0Var7, d2VarD2, null, new p(c2Var5, null), 2, null);
                                                                if (lVar16 != null) {
                                                                    lVar16.b(m3.e.d(pointerInputChange5.getPosition()));
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } else if (lVar14 != null) {
                                                lVar14.b(m3.e.d(pointerInputChange2.getPosition()));
                                            }
                                        }
                                    } else if (lVar12 != null) {
                                        lVar12.b(m3.e.d(finalUpChange.getPosition()));
                                    }
                                }
                                return i0.f148189a;
                            }
                            lVar8.b(m3.e.d(pointerInputChange.getPosition()));
                            hVar2.f231136d = p0Var2;
                            hVar2.f231137e = c2Var3;
                            hVar2.f231138f = d2Var;
                            hVar2.f231139g = null;
                            hVar2.f231140h = null;
                            hVar2.f231141j = null;
                            hVar2.f231142k = null;
                            hVar2.f231143l = null;
                            hVar2.f231144m = null;
                            hVar2.f231146p = 4;
                            if (f(cVar3, hVar2) != objE2) {
                                d2Var2 = d2Var;
                                p0Var5 = p0Var2;
                                c2Var6 = c2Var3;
                                m(p0Var5, d2Var2, null, new j(c2Var6, null), 2, null);
                                return i0.f148189a;
                            }
                        }
                    }
                }
                return objE2;
            case 1:
                er.l<? super m3.e, i0> lVar23 = (er.l) hVar2.f231142k;
                er.q<? super b2, ? super m3.e, ? super tq.e<? super i0>, ? extends Object> qVar5 = (er.q) hVar2.f231141j;
                er.l<? super m3.e, i0> lVar24 = (er.l) hVar2.f231140h;
                lVar6 = (er.l) hVar2.f231139g;
                c2Var2 = (c2) hVar2.f231138f;
                p0Var2 = (p0) hVar2.f231137e;
                cVar2 = (a4.c) hVar2.f231136d;
                oq.u.b(objP2);
                lVar5 = lVar23;
                qVar2 = qVar5;
                lVar4 = lVar24;
                pointerInputChange = (PointerInputChange) objP2;
                pointerInputChange.a();
                d2VarD = ju.k.d(p0Var2, null, r0.UNDISPATCHED, new q(c2Var2, null), 1, null);
                if (qVar2 != f231080a) {
                    m(p0Var2, d2VarD, null, new i(qVar2, c2Var2, pointerInputChange, null), 2, null);
                    d2Var = d2VarD;
                } else {
                    d2Var = d2VarD;
                }
                if (lVar4 == null) {
                    hVar2.f231136d = cVar2;
                    hVar2.f231137e = p0Var2;
                    hVar2.f231138f = c2Var2;
                    hVar2.f231139g = lVar6;
                    hVar2.f231140h = lVar4;
                    hVar2.f231141j = qVar2;
                    hVar2.f231142k = lVar5;
                    hVar2.f231143l = d2Var;
                    hVar2.f231146p = 2;
                    objP2 = r(cVar2, null, hVar2, 1, null);
                    if (objP2 != objE2) {
                        c2 c2Var13 = c2Var2;
                        lVar10 = lVar6;
                        lVar11 = lVar4;
                        cVar4 = cVar2;
                        p0Var3 = p0Var2;
                        c2Var4 = c2Var13;
                        qVar4 = qVar2;
                        lVar12 = lVar5;
                        finalUpChange = (PointerInputChange) objP2;
                        if (finalUpChange == null) {
                            d2VarM = m(p0Var3, d2Var, null, new k(c2Var4, null), 2, null);
                        } else {
                            finalUpChange.a();
                            d2VarM = m(p0Var3, d2Var, null, new l(c2Var4, null), 2, null);
                        }
                        if (finalUpChange != null) {
                            if (lVar10 == null) {
                                hVar2.f231136d = cVar4;
                                hVar2.f231137e = p0Var3;
                                hVar2.f231138f = c2Var4;
                                hVar2.f231139g = lVar10;
                                hVar2.f231140h = lVar11;
                                hVar2.f231141j = qVar4;
                                hVar2.f231142k = lVar12;
                                hVar2.f231143l = finalUpChange;
                                hVar2.f231144m = d2VarM;
                                hVar2.f231146p = 5;
                                objE = e(cVar4, finalUpChange, hVar2);
                                if (objE != objE2) {
                                    er.l<? super m3.e, i0> lVar111 = lVar12;
                                    pointerInputChange2 = finalUpChange;
                                    objP2 = objE;
                                    cVar5 = cVar4;
                                    p0Var4 = p0Var3;
                                    lVar13 = lVar10;
                                    lVar14 = lVar111;
                                    c2 c2Var14 = c2Var4;
                                    lVar15 = lVar11;
                                    c2Var5 = c2Var14;
                                    pointerInputChange3 = (PointerInputChange) objP2;
                                    if (pointerInputChange3 != null) {
                                        d2VarD2 = ju.k.d(p0Var4, null, r0.UNDISPATCHED, new m(d2VarM, c2Var5, null), 1, null);
                                        if (qVar4 != f231080a) {
                                            m(p0Var4, d2VarD2, null, new n(qVar4, c2Var5, pointerInputChange3, null), 2, null);
                                        }
                                        if (lVar15 == null) {
                                            hVar2.f231136d = p0Var4;
                                            hVar2.f231137e = c2Var5;
                                            hVar2.f231138f = lVar13;
                                            hVar2.f231139g = lVar14;
                                            hVar2.f231140h = d2VarD2;
                                            hVar2.f231141j = pointerInputChange2;
                                            hVar2.f231142k = null;
                                            hVar2.f231143l = null;
                                            hVar2.f231144m = null;
                                            hVar2.f231146p = 6;
                                            objP2 = r(cVar5, null, hVar2, 1, null);
                                            if (objP2 != objE2) {
                                                pointerInputChange5 = pointerInputChange2;
                                                lVar16 = lVar14;
                                                lVar18 = lVar13;
                                                p0Var7 = p0Var4;
                                                finalUpChange2 = (PointerInputChange) objP2;
                                                if (finalUpChange2 != null) {
                                                    finalUpChange2.a();
                                                    m(p0Var7, d2VarD2, null, new o(c2Var5, null), 2, null);
                                                    lVar18.b(m3.e.d(finalUpChange2.getPosition()));
                                                } else {
                                                    m(p0Var7, d2VarD2, null, new p(c2Var5, null), 2, null);
                                                    if (lVar16 != null) {
                                                        lVar16.b(m3.e.d(pointerInputChange5.getPosition()));
                                                    }
                                                }
                                            }
                                        } else {
                                            hVar2.f231136d = cVar5;
                                            hVar2.f231137e = p0Var4;
                                            hVar2.f231138f = c2Var5;
                                            hVar2.f231139g = lVar13;
                                            hVar2.f231140h = lVar15;
                                            hVar2.f231141j = lVar14;
                                            hVar2.f231142k = d2VarD2;
                                            hVar2.f231143l = pointerInputChange2;
                                            hVar2.f231144m = pointerInputChange3;
                                            hVar2.f231146p = 7;
                                            objP = p(cVar5, null, hVar2, 1, null);
                                            if (objP != objE2) {
                                                PointerInputChange pointerInputChange8 = pointerInputChange2;
                                                pointerInputChange4 = pointerInputChange3;
                                                objP2 = objP;
                                                pointerInputChange5 = pointerInputChange8;
                                                er.l<? super m3.e, i0> lVar25 = lVar15;
                                                c2Var7 = c2Var5;
                                                lVar16 = lVar14;
                                                lVar17 = lVar25;
                                                lVar18 = lVar13;
                                                p0Var6 = p0Var4;
                                                cVar6 = cVar5;
                                                m1Var2 = (m1) objP2;
                                                if (!fr.t.c(m1Var2, m1.c.f231456a)) {
                                                    lVar17.b(m3.e.d(pointerInputChange4.getPosition()));
                                                    hVar2.f231136d = p0Var6;
                                                    hVar2.f231137e = c2Var7;
                                                    hVar2.f231138f = d2VarD2;
                                                    hVar2.f231139g = null;
                                                    hVar2.f231140h = null;
                                                    hVar2.f231141j = null;
                                                    hVar2.f231142k = null;
                                                    hVar2.f231143l = null;
                                                    hVar2.f231144m = null;
                                                    hVar2.f231146p = 8;
                                                    if (f(cVar6, hVar2) != objE2) {
                                                        d2Var3 = d2VarD2;
                                                        c2Var8 = c2Var7;
                                                        p0Var8 = p0Var6;
                                                        m(p0Var8, d2Var3, null, new r(c2Var8, null), 2, null);
                                                        return i0.f148189a;
                                                    }
                                                } else {
                                                    if (m1Var2 instanceof m1.b) {
                                                        finalUpChange2 = ((m1.b) m1Var2).getFinalUpChange();
                                                    } else {
                                                        if (m1Var2 instanceof m1.a) {
                                                            throw new oq.p();
                                                        }
                                                        finalUpChange2 = null;
                                                    }
                                                    c2Var5 = c2Var7;
                                                    p0Var7 = p0Var6;
                                                    if (finalUpChange2 != null) {
                                                        finalUpChange2.a();
                                                        m(p0Var7, d2VarD2, null, new o(c2Var5, null), 2, null);
                                                        lVar18.b(m3.e.d(finalUpChange2.getPosition()));
                                                    } else {
                                                        m(p0Var7, d2VarD2, null, new p(c2Var5, null), 2, null);
                                                        if (lVar16 != null) {
                                                            lVar16.b(m3.e.d(pointerInputChange5.getPosition()));
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else if (lVar14 != null) {
                                        lVar14.b(m3.e.d(pointerInputChange2.getPosition()));
                                    }
                                }
                            } else if (lVar12 != null) {
                                lVar12.b(m3.e.d(finalUpChange.getPosition()));
                            }
                        }
                        return i0.f148189a;
                    }
                } else {
                    hVar2.f231136d = cVar2;
                    hVar2.f231137e = p0Var2;
                    hVar2.f231138f = c2Var2;
                    hVar2.f231139g = lVar6;
                    hVar2.f231140h = lVar4;
                    hVar2.f231141j = qVar2;
                    hVar2.f231142k = lVar5;
                    hVar2.f231143l = pointerInputChange;
                    hVar2.f231144m = d2Var;
                    hVar2.f231146p = 3;
                    objP2 = p(cVar2, null, hVar2, 1, null);
                    if (objP2 != objE2) {
                        er.l<? super m3.e, i0> lVar26 = lVar4;
                        lVar7 = lVar6;
                        qVar3 = qVar2;
                        cVar3 = cVar2;
                        c2Var3 = c2Var2;
                        lVar8 = lVar26;
                        lVar9 = lVar5;
                        m1Var = (m1) objP2;
                        if (!fr.t.c(m1Var, m1.c.f231456a)) {
                            if (m1Var instanceof m1.b) {
                                finalUpChange = ((m1.b) m1Var).getFinalUpChange();
                            } else {
                                if (!(m1Var instanceof m1.a)) {
                                    throw new oq.p();
                                }
                                finalUpChange = null;
                            }
                            c2 c2Var15 = c2Var3;
                            p0Var3 = p0Var2;
                            c2Var4 = c2Var15;
                            lVar12 = lVar9;
                            qVar4 = qVar3;
                            lVar11 = lVar8;
                            lVar10 = lVar7;
                            cVar4 = cVar3;
                            if (finalUpChange == null) {
                                d2VarM = m(p0Var3, d2Var, null, new k(c2Var4, null), 2, null);
                            } else {
                                finalUpChange.a();
                                d2VarM = m(p0Var3, d2Var, null, new l(c2Var4, null), 2, null);
                            }
                            if (finalUpChange != null) {
                                if (lVar10 == null) {
                                    hVar2.f231136d = cVar4;
                                    hVar2.f231137e = p0Var3;
                                    hVar2.f231138f = c2Var4;
                                    hVar2.f231139g = lVar10;
                                    hVar2.f231140h = lVar11;
                                    hVar2.f231141j = qVar4;
                                    hVar2.f231142k = lVar12;
                                    hVar2.f231143l = finalUpChange;
                                    hVar2.f231144m = d2VarM;
                                    hVar2.f231146p = 5;
                                    objE = e(cVar4, finalUpChange, hVar2);
                                    if (objE != objE2) {
                                        er.l<? super m3.e, i0> lVar112 = lVar12;
                                        pointerInputChange2 = finalUpChange;
                                        objP2 = objE;
                                        cVar5 = cVar4;
                                        p0Var4 = p0Var3;
                                        lVar13 = lVar10;
                                        lVar14 = lVar112;
                                        c2 c2Var16 = c2Var4;
                                        lVar15 = lVar11;
                                        c2Var5 = c2Var16;
                                        pointerInputChange3 = (PointerInputChange) objP2;
                                        if (pointerInputChange3 != null) {
                                            d2VarD2 = ju.k.d(p0Var4, null, r0.UNDISPATCHED, new m(d2VarM, c2Var5, null), 1, null);
                                            if (qVar4 != f231080a) {
                                                m(p0Var4, d2VarD2, null, new n(qVar4, c2Var5, pointerInputChange3, null), 2, null);
                                            }
                                            if (lVar15 == null) {
                                                hVar2.f231136d = p0Var4;
                                                hVar2.f231137e = c2Var5;
                                                hVar2.f231138f = lVar13;
                                                hVar2.f231139g = lVar14;
                                                hVar2.f231140h = d2VarD2;
                                                hVar2.f231141j = pointerInputChange2;
                                                hVar2.f231142k = null;
                                                hVar2.f231143l = null;
                                                hVar2.f231144m = null;
                                                hVar2.f231146p = 6;
                                                objP2 = r(cVar5, null, hVar2, 1, null);
                                                if (objP2 != objE2) {
                                                    pointerInputChange5 = pointerInputChange2;
                                                    lVar16 = lVar14;
                                                    lVar18 = lVar13;
                                                    p0Var7 = p0Var4;
                                                    finalUpChange2 = (PointerInputChange) objP2;
                                                    if (finalUpChange2 != null) {
                                                        finalUpChange2.a();
                                                        m(p0Var7, d2VarD2, null, new o(c2Var5, null), 2, null);
                                                        lVar18.b(m3.e.d(finalUpChange2.getPosition()));
                                                    } else {
                                                        m(p0Var7, d2VarD2, null, new p(c2Var5, null), 2, null);
                                                        if (lVar16 != null) {
                                                            lVar16.b(m3.e.d(pointerInputChange5.getPosition()));
                                                        }
                                                    }
                                                }
                                            } else {
                                                hVar2.f231136d = cVar5;
                                                hVar2.f231137e = p0Var4;
                                                hVar2.f231138f = c2Var5;
                                                hVar2.f231139g = lVar13;
                                                hVar2.f231140h = lVar15;
                                                hVar2.f231141j = lVar14;
                                                hVar2.f231142k = d2VarD2;
                                                hVar2.f231143l = pointerInputChange2;
                                                hVar2.f231144m = pointerInputChange3;
                                                hVar2.f231146p = 7;
                                                objP = p(cVar5, null, hVar2, 1, null);
                                                if (objP != objE2) {
                                                    PointerInputChange pointerInputChange9 = pointerInputChange2;
                                                    pointerInputChange4 = pointerInputChange3;
                                                    objP2 = objP;
                                                    pointerInputChange5 = pointerInputChange9;
                                                    er.l<? super m3.e, i0> lVar27 = lVar15;
                                                    c2Var7 = c2Var5;
                                                    lVar16 = lVar14;
                                                    lVar17 = lVar27;
                                                    lVar18 = lVar13;
                                                    p0Var6 = p0Var4;
                                                    cVar6 = cVar5;
                                                    m1Var2 = (m1) objP2;
                                                    if (!fr.t.c(m1Var2, m1.c.f231456a)) {
                                                        lVar17.b(m3.e.d(pointerInputChange4.getPosition()));
                                                        hVar2.f231136d = p0Var6;
                                                        hVar2.f231137e = c2Var7;
                                                        hVar2.f231138f = d2VarD2;
                                                        hVar2.f231139g = null;
                                                        hVar2.f231140h = null;
                                                        hVar2.f231141j = null;
                                                        hVar2.f231142k = null;
                                                        hVar2.f231143l = null;
                                                        hVar2.f231144m = null;
                                                        hVar2.f231146p = 8;
                                                        if (f(cVar6, hVar2) != objE2) {
                                                            d2Var3 = d2VarD2;
                                                            c2Var8 = c2Var7;
                                                            p0Var8 = p0Var6;
                                                            m(p0Var8, d2Var3, null, new r(c2Var8, null), 2, null);
                                                            return i0.f148189a;
                                                        }
                                                    } else {
                                                        if (m1Var2 instanceof m1.b) {
                                                            finalUpChange2 = ((m1.b) m1Var2).getFinalUpChange();
                                                        } else {
                                                            if (m1Var2 instanceof m1.a) {
                                                                throw new oq.p();
                                                            }
                                                            finalUpChange2 = null;
                                                        }
                                                        c2Var5 = c2Var7;
                                                        p0Var7 = p0Var6;
                                                        if (finalUpChange2 != null) {
                                                            finalUpChange2.a();
                                                            m(p0Var7, d2VarD2, null, new o(c2Var5, null), 2, null);
                                                            lVar18.b(m3.e.d(finalUpChange2.getPosition()));
                                                        } else {
                                                            m(p0Var7, d2VarD2, null, new p(c2Var5, null), 2, null);
                                                            if (lVar16 != null) {
                                                                lVar16.b(m3.e.d(pointerInputChange5.getPosition()));
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (lVar14 != null) {
                                            lVar14.b(m3.e.d(pointerInputChange2.getPosition()));
                                        }
                                    }
                                } else if (lVar12 != null) {
                                    lVar12.b(m3.e.d(finalUpChange.getPosition()));
                                }
                            }
                            return i0.f148189a;
                        }
                        lVar8.b(m3.e.d(pointerInputChange.getPosition()));
                        hVar2.f231136d = p0Var2;
                        hVar2.f231137e = c2Var3;
                        hVar2.f231138f = d2Var;
                        hVar2.f231139g = null;
                        hVar2.f231140h = null;
                        hVar2.f231141j = null;
                        hVar2.f231142k = null;
                        hVar2.f231143l = null;
                        hVar2.f231144m = null;
                        hVar2.f231146p = 4;
                        if (f(cVar3, hVar2) != objE2) {
                            d2Var2 = d2Var;
                            p0Var5 = p0Var2;
                            c2Var6 = c2Var3;
                            m(p0Var5, d2Var2, null, new j(c2Var6, null), 2, null);
                            return i0.f148189a;
                        }
                    }
                }
                return objE2;
            case 2:
                d2Var = (d2) hVar2.f231143l;
                lVar12 = (er.l) hVar2.f231142k;
                qVar4 = (er.q) hVar2.f231141j;
                lVar11 = (er.l) hVar2.f231140h;
                lVar10 = (er.l) hVar2.f231139g;
                c2Var4 = (c2) hVar2.f231138f;
                p0Var3 = (p0) hVar2.f231137e;
                cVar4 = (a4.c) hVar2.f231136d;
                oq.u.b(objP2);
                finalUpChange = (PointerInputChange) objP2;
                if (finalUpChange == null) {
                    d2VarM = m(p0Var3, d2Var, null, new k(c2Var4, null), 2, null);
                } else {
                    finalUpChange.a();
                    d2VarM = m(p0Var3, d2Var, null, new l(c2Var4, null), 2, null);
                }
                if (finalUpChange != null) {
                    if (lVar10 == null) {
                        hVar2.f231136d = cVar4;
                        hVar2.f231137e = p0Var3;
                        hVar2.f231138f = c2Var4;
                        hVar2.f231139g = lVar10;
                        hVar2.f231140h = lVar11;
                        hVar2.f231141j = qVar4;
                        hVar2.f231142k = lVar12;
                        hVar2.f231143l = finalUpChange;
                        hVar2.f231144m = d2VarM;
                        hVar2.f231146p = 5;
                        objE = e(cVar4, finalUpChange, hVar2);
                        if (objE != objE2) {
                            er.l<? super m3.e, i0> lVar113 = lVar12;
                            pointerInputChange2 = finalUpChange;
                            objP2 = objE;
                            cVar5 = cVar4;
                            p0Var4 = p0Var3;
                            lVar13 = lVar10;
                            lVar14 = lVar113;
                            c2 c2Var17 = c2Var4;
                            lVar15 = lVar11;
                            c2Var5 = c2Var17;
                            pointerInputChange3 = (PointerInputChange) objP2;
                            if (pointerInputChange3 != null) {
                                d2VarD2 = ju.k.d(p0Var4, null, r0.UNDISPATCHED, new m(d2VarM, c2Var5, null), 1, null);
                                if (qVar4 != f231080a) {
                                    m(p0Var4, d2VarD2, null, new n(qVar4, c2Var5, pointerInputChange3, null), 2, null);
                                }
                                if (lVar15 == null) {
                                    hVar2.f231136d = p0Var4;
                                    hVar2.f231137e = c2Var5;
                                    hVar2.f231138f = lVar13;
                                    hVar2.f231139g = lVar14;
                                    hVar2.f231140h = d2VarD2;
                                    hVar2.f231141j = pointerInputChange2;
                                    hVar2.f231142k = null;
                                    hVar2.f231143l = null;
                                    hVar2.f231144m = null;
                                    hVar2.f231146p = 6;
                                    objP2 = r(cVar5, null, hVar2, 1, null);
                                    if (objP2 != objE2) {
                                        pointerInputChange5 = pointerInputChange2;
                                        lVar16 = lVar14;
                                        lVar18 = lVar13;
                                        p0Var7 = p0Var4;
                                        finalUpChange2 = (PointerInputChange) objP2;
                                        if (finalUpChange2 != null) {
                                            finalUpChange2.a();
                                            m(p0Var7, d2VarD2, null, new o(c2Var5, null), 2, null);
                                            lVar18.b(m3.e.d(finalUpChange2.getPosition()));
                                        } else {
                                            m(p0Var7, d2VarD2, null, new p(c2Var5, null), 2, null);
                                            if (lVar16 != null) {
                                                lVar16.b(m3.e.d(pointerInputChange5.getPosition()));
                                            }
                                        }
                                    }
                                } else {
                                    hVar2.f231136d = cVar5;
                                    hVar2.f231137e = p0Var4;
                                    hVar2.f231138f = c2Var5;
                                    hVar2.f231139g = lVar13;
                                    hVar2.f231140h = lVar15;
                                    hVar2.f231141j = lVar14;
                                    hVar2.f231142k = d2VarD2;
                                    hVar2.f231143l = pointerInputChange2;
                                    hVar2.f231144m = pointerInputChange3;
                                    hVar2.f231146p = 7;
                                    objP = p(cVar5, null, hVar2, 1, null);
                                    if (objP != objE2) {
                                        PointerInputChange pointerInputChange10 = pointerInputChange2;
                                        pointerInputChange4 = pointerInputChange3;
                                        objP2 = objP;
                                        pointerInputChange5 = pointerInputChange10;
                                        er.l<? super m3.e, i0> lVar28 = lVar15;
                                        c2Var7 = c2Var5;
                                        lVar16 = lVar14;
                                        lVar17 = lVar28;
                                        lVar18 = lVar13;
                                        p0Var6 = p0Var4;
                                        cVar6 = cVar5;
                                        m1Var2 = (m1) objP2;
                                        if (!fr.t.c(m1Var2, m1.c.f231456a)) {
                                            lVar17.b(m3.e.d(pointerInputChange4.getPosition()));
                                            hVar2.f231136d = p0Var6;
                                            hVar2.f231137e = c2Var7;
                                            hVar2.f231138f = d2VarD2;
                                            hVar2.f231139g = null;
                                            hVar2.f231140h = null;
                                            hVar2.f231141j = null;
                                            hVar2.f231142k = null;
                                            hVar2.f231143l = null;
                                            hVar2.f231144m = null;
                                            hVar2.f231146p = 8;
                                            if (f(cVar6, hVar2) != objE2) {
                                                d2Var3 = d2VarD2;
                                                c2Var8 = c2Var7;
                                                p0Var8 = p0Var6;
                                                m(p0Var8, d2Var3, null, new r(c2Var8, null), 2, null);
                                                return i0.f148189a;
                                            }
                                        } else {
                                            if (m1Var2 instanceof m1.b) {
                                                finalUpChange2 = ((m1.b) m1Var2).getFinalUpChange();
                                            } else {
                                                if (m1Var2 instanceof m1.a) {
                                                    throw new oq.p();
                                                }
                                                finalUpChange2 = null;
                                            }
                                            c2Var5 = c2Var7;
                                            p0Var7 = p0Var6;
                                            if (finalUpChange2 != null) {
                                                finalUpChange2.a();
                                                m(p0Var7, d2VarD2, null, new o(c2Var5, null), 2, null);
                                                lVar18.b(m3.e.d(finalUpChange2.getPosition()));
                                            } else {
                                                m(p0Var7, d2VarD2, null, new p(c2Var5, null), 2, null);
                                                if (lVar16 != null) {
                                                    lVar16.b(m3.e.d(pointerInputChange5.getPosition()));
                                                }
                                            }
                                        }
                                    }
                                }
                            } else if (lVar14 != null) {
                                lVar14.b(m3.e.d(pointerInputChange2.getPosition()));
                            }
                        }
                        return objE2;
                    }
                    if (lVar12 != null) {
                        lVar12.b(m3.e.d(finalUpChange.getPosition()));
                    }
                }
                return i0.f148189a;
            case 3:
                d2Var = (d2) hVar2.f231144m;
                pointerInputChange = (PointerInputChange) hVar2.f231143l;
                lVar9 = (er.l) hVar2.f231142k;
                qVar3 = (er.q) hVar2.f231141j;
                lVar8 = (er.l) hVar2.f231140h;
                er.l<? super m3.e, i0> lVar29 = (er.l) hVar2.f231139g;
                c2Var3 = (c2) hVar2.f231138f;
                p0 p0Var9 = (p0) hVar2.f231137e;
                cVar3 = (a4.c) hVar2.f231136d;
                oq.u.b(objP2);
                lVar7 = lVar29;
                p0Var2 = p0Var9;
                m1Var = (m1) objP2;
                if (!fr.t.c(m1Var, m1.c.f231456a)) {
                    if (m1Var instanceof m1.b) {
                        finalUpChange = ((m1.b) m1Var).getFinalUpChange();
                    } else {
                        if (!(m1Var instanceof m1.a)) {
                            throw new oq.p();
                        }
                        finalUpChange = null;
                    }
                    c2 c2Var18 = c2Var3;
                    p0Var3 = p0Var2;
                    c2Var4 = c2Var18;
                    lVar12 = lVar9;
                    qVar4 = qVar3;
                    lVar11 = lVar8;
                    lVar10 = lVar7;
                    cVar4 = cVar3;
                    if (finalUpChange == null) {
                        d2VarM = m(p0Var3, d2Var, null, new k(c2Var4, null), 2, null);
                    } else {
                        finalUpChange.a();
                        d2VarM = m(p0Var3, d2Var, null, new l(c2Var4, null), 2, null);
                    }
                    if (finalUpChange != null) {
                        if (lVar10 == null) {
                            hVar2.f231136d = cVar4;
                            hVar2.f231137e = p0Var3;
                            hVar2.f231138f = c2Var4;
                            hVar2.f231139g = lVar10;
                            hVar2.f231140h = lVar11;
                            hVar2.f231141j = qVar4;
                            hVar2.f231142k = lVar12;
                            hVar2.f231143l = finalUpChange;
                            hVar2.f231144m = d2VarM;
                            hVar2.f231146p = 5;
                            objE = e(cVar4, finalUpChange, hVar2);
                            if (objE != objE2) {
                                er.l<? super m3.e, i0> lVar114 = lVar12;
                                pointerInputChange2 = finalUpChange;
                                objP2 = objE;
                                cVar5 = cVar4;
                                p0Var4 = p0Var3;
                                lVar13 = lVar10;
                                lVar14 = lVar114;
                                c2 c2Var19 = c2Var4;
                                lVar15 = lVar11;
                                c2Var5 = c2Var19;
                                pointerInputChange3 = (PointerInputChange) objP2;
                                if (pointerInputChange3 != null) {
                                    d2VarD2 = ju.k.d(p0Var4, null, r0.UNDISPATCHED, new m(d2VarM, c2Var5, null), 1, null);
                                    if (qVar4 != f231080a) {
                                        m(p0Var4, d2VarD2, null, new n(qVar4, c2Var5, pointerInputChange3, null), 2, null);
                                    }
                                    if (lVar15 == null) {
                                        hVar2.f231136d = p0Var4;
                                        hVar2.f231137e = c2Var5;
                                        hVar2.f231138f = lVar13;
                                        hVar2.f231139g = lVar14;
                                        hVar2.f231140h = d2VarD2;
                                        hVar2.f231141j = pointerInputChange2;
                                        hVar2.f231142k = null;
                                        hVar2.f231143l = null;
                                        hVar2.f231144m = null;
                                        hVar2.f231146p = 6;
                                        objP2 = r(cVar5, null, hVar2, 1, null);
                                        if (objP2 != objE2) {
                                            pointerInputChange5 = pointerInputChange2;
                                            lVar16 = lVar14;
                                            lVar18 = lVar13;
                                            p0Var7 = p0Var4;
                                            finalUpChange2 = (PointerInputChange) objP2;
                                            if (finalUpChange2 != null) {
                                                finalUpChange2.a();
                                                m(p0Var7, d2VarD2, null, new o(c2Var5, null), 2, null);
                                                lVar18.b(m3.e.d(finalUpChange2.getPosition()));
                                            } else {
                                                m(p0Var7, d2VarD2, null, new p(c2Var5, null), 2, null);
                                                if (lVar16 != null) {
                                                    lVar16.b(m3.e.d(pointerInputChange5.getPosition()));
                                                }
                                            }
                                        }
                                    } else {
                                        hVar2.f231136d = cVar5;
                                        hVar2.f231137e = p0Var4;
                                        hVar2.f231138f = c2Var5;
                                        hVar2.f231139g = lVar13;
                                        hVar2.f231140h = lVar15;
                                        hVar2.f231141j = lVar14;
                                        hVar2.f231142k = d2VarD2;
                                        hVar2.f231143l = pointerInputChange2;
                                        hVar2.f231144m = pointerInputChange3;
                                        hVar2.f231146p = 7;
                                        objP = p(cVar5, null, hVar2, 1, null);
                                        if (objP != objE2) {
                                            PointerInputChange pointerInputChange11 = pointerInputChange2;
                                            pointerInputChange4 = pointerInputChange3;
                                            objP2 = objP;
                                            pointerInputChange5 = pointerInputChange11;
                                            er.l<? super m3.e, i0> lVar210 = lVar15;
                                            c2Var7 = c2Var5;
                                            lVar16 = lVar14;
                                            lVar17 = lVar210;
                                            lVar18 = lVar13;
                                            p0Var6 = p0Var4;
                                            cVar6 = cVar5;
                                            m1Var2 = (m1) objP2;
                                            if (!fr.t.c(m1Var2, m1.c.f231456a)) {
                                                lVar17.b(m3.e.d(pointerInputChange4.getPosition()));
                                                hVar2.f231136d = p0Var6;
                                                hVar2.f231137e = c2Var7;
                                                hVar2.f231138f = d2VarD2;
                                                hVar2.f231139g = null;
                                                hVar2.f231140h = null;
                                                hVar2.f231141j = null;
                                                hVar2.f231142k = null;
                                                hVar2.f231143l = null;
                                                hVar2.f231144m = null;
                                                hVar2.f231146p = 8;
                                                if (f(cVar6, hVar2) != objE2) {
                                                    d2Var3 = d2VarD2;
                                                    c2Var8 = c2Var7;
                                                    p0Var8 = p0Var6;
                                                    m(p0Var8, d2Var3, null, new r(c2Var8, null), 2, null);
                                                    return i0.f148189a;
                                                }
                                            } else {
                                                if (m1Var2 instanceof m1.b) {
                                                    finalUpChange2 = ((m1.b) m1Var2).getFinalUpChange();
                                                } else {
                                                    if (m1Var2 instanceof m1.a) {
                                                        throw new oq.p();
                                                    }
                                                    finalUpChange2 = null;
                                                }
                                                c2Var5 = c2Var7;
                                                p0Var7 = p0Var6;
                                                if (finalUpChange2 != null) {
                                                    finalUpChange2.a();
                                                    m(p0Var7, d2VarD2, null, new o(c2Var5, null), 2, null);
                                                    lVar18.b(m3.e.d(finalUpChange2.getPosition()));
                                                } else {
                                                    m(p0Var7, d2VarD2, null, new p(c2Var5, null), 2, null);
                                                    if (lVar16 != null) {
                                                        lVar16.b(m3.e.d(pointerInputChange5.getPosition()));
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else if (lVar14 != null) {
                                    lVar14.b(m3.e.d(pointerInputChange2.getPosition()));
                                }
                            }
                        } else if (lVar12 != null) {
                            lVar12.b(m3.e.d(finalUpChange.getPosition()));
                        }
                    }
                    return i0.f148189a;
                }
                lVar8.b(m3.e.d(pointerInputChange.getPosition()));
                hVar2.f231136d = p0Var2;
                hVar2.f231137e = c2Var3;
                hVar2.f231138f = d2Var;
                hVar2.f231139g = null;
                hVar2.f231140h = null;
                hVar2.f231141j = null;
                hVar2.f231142k = null;
                hVar2.f231143l = null;
                hVar2.f231144m = null;
                hVar2.f231146p = 4;
                if (f(cVar3, hVar2) != objE2) {
                    d2Var2 = d2Var;
                    p0Var5 = p0Var2;
                    c2Var6 = c2Var3;
                    m(p0Var5, d2Var2, null, new j(c2Var6, null), 2, null);
                    return i0.f148189a;
                }
                return objE2;
            case 4:
                d2Var2 = (d2) hVar2.f231138f;
                c2Var6 = (c2) hVar2.f231137e;
                p0Var5 = (p0) hVar2.f231136d;
                oq.u.b(objP2);
                m(p0Var5, d2Var2, null, new j(c2Var6, null), 2, null);
                return i0.f148189a;
            case 5:
                d2VarM = (d2) hVar2.f231144m;
                pointerInputChange2 = (PointerInputChange) hVar2.f231143l;
                er.l<? super m3.e, i0> lVar30 = (er.l) hVar2.f231142k;
                er.q<? super b2, ? super m3.e, ? super tq.e<? super i0>, ? extends Object> qVar6 = (er.q) hVar2.f231141j;
                er.l<? super m3.e, i0> lVar31 = (er.l) hVar2.f231140h;
                er.l<? super m3.e, i0> lVar32 = (er.l) hVar2.f231139g;
                c2 c2Var20 = (c2) hVar2.f231138f;
                p0Var4 = (p0) hVar2.f231137e;
                cVar5 = (a4.c) hVar2.f231136d;
                oq.u.b(objP2);
                lVar14 = lVar30;
                qVar4 = qVar6;
                c2Var5 = c2Var20;
                lVar13 = lVar32;
                lVar15 = lVar31;
                pointerInputChange3 = (PointerInputChange) objP2;
                if (pointerInputChange3 != null) {
                    d2VarD2 = ju.k.d(p0Var4, null, r0.UNDISPATCHED, new m(d2VarM, c2Var5, null), 1, null);
                    if (qVar4 != f231080a) {
                        m(p0Var4, d2VarD2, null, new n(qVar4, c2Var5, pointerInputChange3, null), 2, null);
                    }
                    if (lVar15 == null) {
                        hVar2.f231136d = p0Var4;
                        hVar2.f231137e = c2Var5;
                        hVar2.f231138f = lVar13;
                        hVar2.f231139g = lVar14;
                        hVar2.f231140h = d2VarD2;
                        hVar2.f231141j = pointerInputChange2;
                        hVar2.f231142k = null;
                        hVar2.f231143l = null;
                        hVar2.f231144m = null;
                        hVar2.f231146p = 6;
                        objP2 = r(cVar5, null, hVar2, 1, null);
                        if (objP2 != objE2) {
                            pointerInputChange5 = pointerInputChange2;
                            lVar16 = lVar14;
                            lVar18 = lVar13;
                            p0Var7 = p0Var4;
                            finalUpChange2 = (PointerInputChange) objP2;
                            if (finalUpChange2 != null) {
                                finalUpChange2.a();
                                m(p0Var7, d2VarD2, null, new o(c2Var5, null), 2, null);
                                lVar18.b(m3.e.d(finalUpChange2.getPosition()));
                            } else {
                                m(p0Var7, d2VarD2, null, new p(c2Var5, null), 2, null);
                                if (lVar16 != null) {
                                    lVar16.b(m3.e.d(pointerInputChange5.getPosition()));
                                }
                            }
                        }
                    } else {
                        hVar2.f231136d = cVar5;
                        hVar2.f231137e = p0Var4;
                        hVar2.f231138f = c2Var5;
                        hVar2.f231139g = lVar13;
                        hVar2.f231140h = lVar15;
                        hVar2.f231141j = lVar14;
                        hVar2.f231142k = d2VarD2;
                        hVar2.f231143l = pointerInputChange2;
                        hVar2.f231144m = pointerInputChange3;
                        hVar2.f231146p = 7;
                        objP = p(cVar5, null, hVar2, 1, null);
                        if (objP != objE2) {
                            PointerInputChange pointerInputChange12 = pointerInputChange2;
                            pointerInputChange4 = pointerInputChange3;
                            objP2 = objP;
                            pointerInputChange5 = pointerInputChange12;
                            er.l<? super m3.e, i0> lVar211 = lVar15;
                            c2Var7 = c2Var5;
                            lVar16 = lVar14;
                            lVar17 = lVar211;
                            lVar18 = lVar13;
                            p0Var6 = p0Var4;
                            cVar6 = cVar5;
                            m1Var2 = (m1) objP2;
                            if (!fr.t.c(m1Var2, m1.c.f231456a)) {
                                lVar17.b(m3.e.d(pointerInputChange4.getPosition()));
                                hVar2.f231136d = p0Var6;
                                hVar2.f231137e = c2Var7;
                                hVar2.f231138f = d2VarD2;
                                hVar2.f231139g = null;
                                hVar2.f231140h = null;
                                hVar2.f231141j = null;
                                hVar2.f231142k = null;
                                hVar2.f231143l = null;
                                hVar2.f231144m = null;
                                hVar2.f231146p = 8;
                                if (f(cVar6, hVar2) != objE2) {
                                    d2Var3 = d2VarD2;
                                    c2Var8 = c2Var7;
                                    p0Var8 = p0Var6;
                                    m(p0Var8, d2Var3, null, new r(c2Var8, null), 2, null);
                                    return i0.f148189a;
                                }
                            } else {
                                if (m1Var2 instanceof m1.b) {
                                    finalUpChange2 = ((m1.b) m1Var2).getFinalUpChange();
                                } else {
                                    if (m1Var2 instanceof m1.a) {
                                        throw new oq.p();
                                    }
                                    finalUpChange2 = null;
                                }
                                c2Var5 = c2Var7;
                                p0Var7 = p0Var6;
                                if (finalUpChange2 != null) {
                                    finalUpChange2.a();
                                    m(p0Var7, d2VarD2, null, new o(c2Var5, null), 2, null);
                                    lVar18.b(m3.e.d(finalUpChange2.getPosition()));
                                } else {
                                    m(p0Var7, d2VarD2, null, new p(c2Var5, null), 2, null);
                                    if (lVar16 != null) {
                                        lVar16.b(m3.e.d(pointerInputChange5.getPosition()));
                                    }
                                }
                            }
                        }
                    }
                    return objE2;
                }
                if (lVar14 != null) {
                    lVar14.b(m3.e.d(pointerInputChange2.getPosition()));
                }
                return i0.f148189a;
            case 6:
                pointerInputChange5 = (PointerInputChange) hVar2.f231141j;
                d2VarD2 = (d2) hVar2.f231140h;
                lVar16 = (er.l) hVar2.f231139g;
                lVar18 = (er.l) hVar2.f231138f;
                c2Var5 = (c2) hVar2.f231137e;
                p0Var7 = (p0) hVar2.f231136d;
                oq.u.b(objP2);
                finalUpChange2 = (PointerInputChange) objP2;
                if (finalUpChange2 != null) {
                    finalUpChange2.a();
                    m(p0Var7, d2VarD2, null, new o(c2Var5, null), 2, null);
                    lVar18.b(m3.e.d(finalUpChange2.getPosition()));
                } else {
                    m(p0Var7, d2VarD2, null, new p(c2Var5, null), 2, null);
                    if (lVar16 != null) {
                        lVar16.b(m3.e.d(pointerInputChange5.getPosition()));
                    }
                }
                return i0.f148189a;
            case 7:
                PointerInputChange pointerInputChange13 = (PointerInputChange) hVar2.f231144m;
                PointerInputChange pointerInputChange14 = (PointerInputChange) hVar2.f231143l;
                d2 d2Var4 = (d2) hVar2.f231142k;
                lVar16 = (er.l) hVar2.f231141j;
                lVar17 = (er.l) hVar2.f231140h;
                lVar18 = (er.l) hVar2.f231139g;
                c2Var7 = (c2) hVar2.f231138f;
                p0Var6 = (p0) hVar2.f231137e;
                cVar6 = (a4.c) hVar2.f231136d;
                oq.u.b(objP2);
                pointerInputChange4 = pointerInputChange13;
                d2VarD2 = d2Var4;
                pointerInputChange5 = pointerInputChange14;
                m1Var2 = (m1) objP2;
                if (!fr.t.c(m1Var2, m1.c.f231456a)) {
                    if (m1Var2 instanceof m1.b) {
                        finalUpChange2 = ((m1.b) m1Var2).getFinalUpChange();
                    } else {
                        if (m1Var2 instanceof m1.a) {
                            throw new oq.p();
                        }
                        finalUpChange2 = null;
                    }
                    c2Var5 = c2Var7;
                    p0Var7 = p0Var6;
                    if (finalUpChange2 != null) {
                        finalUpChange2.a();
                        m(p0Var7, d2VarD2, null, new o(c2Var5, null), 2, null);
                        lVar18.b(m3.e.d(finalUpChange2.getPosition()));
                    } else {
                        m(p0Var7, d2VarD2, null, new p(c2Var5, null), 2, null);
                        if (lVar16 != null) {
                            lVar16.b(m3.e.d(pointerInputChange5.getPosition()));
                        }
                    }
                    return i0.f148189a;
                }
                lVar17.b(m3.e.d(pointerInputChange4.getPosition()));
                hVar2.f231136d = p0Var6;
                hVar2.f231137e = c2Var7;
                hVar2.f231138f = d2VarD2;
                hVar2.f231139g = null;
                hVar2.f231140h = null;
                hVar2.f231141j = null;
                hVar2.f231142k = null;
                hVar2.f231143l = null;
                hVar2.f231144m = null;
                hVar2.f231146p = 8;
                if (f(cVar6, hVar2) != objE2) {
                    d2Var3 = d2VarD2;
                    c2Var8 = c2Var7;
                    p0Var8 = p0Var6;
                    m(p0Var8, d2Var3, null, new r(c2Var8, null), 2, null);
                    return i0.f148189a;
                }
                return objE2;
            case 8:
                d2Var3 = (d2) hVar2.f231138f;
                c2Var8 = (c2) hVar2.f231137e;
                p0Var8 = (p0) hVar2.f231136d;
                oq.u.b(objP2);
                m(p0Var8, d2Var3, null, new r(c2Var8, null), 2, null);
                return i0.f148189a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, z0.m1$a] */
    public static final Object o(a4.c cVar, a4.q qVar, tq.e<? super m1> eVar) throws Throwable {
        s sVar;
        fr.p0 p0Var;
        if (eVar instanceof s) {
            sVar = (s) eVar;
            int i15 = sVar.f231174f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                sVar.f231174f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                sVar = new s(eVar);
            }
        } else {
            sVar = new s(eVar);
        }
        Object obj = sVar.f231173e;
        Object objE = uq.b.e();
        int i16 = sVar.f231174f;
        try {
            if (i16 == 0) {
                oq.u.b(obj);
                fr.p0 p0Var2 = new fr.p0();
                p0Var2.f66410a = m1.a.f231454a;
                long jC = cVar.getViewConfiguration().c();
                t tVar = new t(qVar, p0Var2, null);
                sVar.f231172d = p0Var2;
                sVar.f231174f = 1;
                if (cVar.s2(jC, tVar, sVar) == objE) {
                    return objE;
                }
                p0Var = p0Var2;
            } else {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p0Var = (fr.p0) sVar.f231172d;
                oq.u.b(obj);
            }
            return p0Var.f66410a;
        } catch (a4.r unused) {
            return m1.c.f231456a;
        }
    }

    public static /* synthetic */ Object p(a4.c cVar, a4.q qVar, tq.e eVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            qVar = a4.q.Main;
        }
        return o(cVar, qVar, eVar);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0081  */
    /* JADX WARN: Code duplicated, block: B:28:0x009b  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ec A[LOOP:1: B:23:0x007f->B:45:0x00ec, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:51:0x008d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x00b9 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00c6 -> B:13:0x0037). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object q(a4.c r17, a4.q r18, tq.e<? super a4.PointerInputChange> r19) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p143z0.b3.q(a4.c, a4.q, tq.e):java.lang.Object");
    }

    public static /* synthetic */ Object r(a4.c cVar, a4.q qVar, tq.e eVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            qVar = a4.q.Main;
        }
        return q(cVar, qVar, eVar);
    }
}
