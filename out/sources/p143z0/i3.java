package p143z0;

import a4.HistoricalChange;
import a4.PointerInputChange;
import a4.o;
import a4.q;
import a4.s;
import c5.y;
import er.p;
import fr.k;
import fr.p0;
import java.util.List;
import ju.d2;
import lu.g;
import lu.j;
import m3.e;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.v;
import w0.g0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u00015B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0015\u001a\u0004\u0018\u00010\u0014*\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0019\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001c\u0010\u001d\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010\"\u001a\u00020 *\u00020\u001f2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J'\u0010(\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020\u00072\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00104\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103¨\u00066"}, d2 = {"Lz0/i3;", "Lz0/t1;", "Lz0/a3;", "scrollingLogic", "Lkotlin/Function2;", "Lc5/y;", "Ltq/e;", "Loq/i0;", "", "onScrollStopped", "Lc5/d;", "density", "<init>", "(Lz0/a3;Ler/p;Lc5/d;)V", "La4/o;", "pointerEvent", "", "s", "(La4/o;)Z", "Llu/g;", "Lz0/i3$a;", "v", "(Llu/g;)Lz0/i3$a;", "Lm3/e;", "scrollDelta", "p", "(Lz0/a3;J)Z", "x", "(Lz0/i3$a;)V", "r", "(Lz0/a3;Lz0/i3$a;Ltq/e;)Ljava/lang/Object;", "Lz0/s1;", "", "delta", "q", "(Lz0/s1;F)F", "La4/q;", "pass", "Lc5/r;", "bounds", "t", "(La4/o;La4/q;J)V", "Lju/p0;", "coroutineScope", "u", "(Lju/p0;)V", "f", "Llu/g;", "channel", "Lju/d2;", "g", "Lju/d2;", "receivingPanEventsJob", "a", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i3 extends t1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final g<a> channel;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private d2 receivingPanEventsJob;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000e\u001a\u0004\b\r\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lz0/i3$a;", "", "Lm3/e;", "value", "", "timeMillis", "", "isEnd", "<init>", "(JJZLfr/k;)V", "other", "d", "(Lz0/i3$a;)Lz0/i3$a;", "a", "J", "b", "()J", "c", "Z", "()Z", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final long value;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final long timeMillis;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final boolean isEnd;

        public /* synthetic */ a(long j15, long j16, boolean z15, k kVar) {
            this(j15, j16, z15);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getTimeMillis() {
            return this.timeMillis;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getValue() {
            return this.value;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getIsEnd() {
            return this.isEnd;
        }

        public final a d(a other) {
            return new a(e.q(this.value, other.value), Math.max(this.timeMillis, other.timeMillis), this.isEnd || other.isEnd, null);
        }

        private a(long j15, long j16, boolean z15) {
            this.value = j15;
            this.timeMillis = j16;
            this.isEnd = z15;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f231323d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f231325f;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f231323d = obj;
            this.f231325f |= PKIFailureInfo.systemUnavail;
            return i3.this.r(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz0/s1;", "Loq/i0;", "<anonymous>", "(Lz0/s1;)V"}, k = 3, mv = {2, 1, 0})
    static final class c extends vq.k implements p<s1, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f231326e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f231327f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private /* synthetic */ Object f231328g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ a3 f231330j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ p0<a> f231331k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(a3 a3Var, p0<a> p0Var, tq.e<? super c> eVar) {
            super(2, eVar);
            this.f231330j = a3Var;
            this.f231331k = p0Var;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x004c  */
        /* JADX WARN: Code duplicated, block: B:13:0x0060 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:16:0x007a  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r7v16, types: [T, z0.i3$a] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x005e -> B:14:0x0061). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:11:0x004c
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // vq.a
        public final java.lang.Object J(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r6.f231327f
                r2 = 1
                if (r1 == 0) goto L1f
                if (r1 != r2) goto L17
                java.lang.Object r1 = r6.f231326e
                fr.p0 r1 = (fr.p0) r1
                java.lang.Object r3 = r6.f231328g
                z0.s1 r3 = (p143z0.s1) r3
                oq.u.b(r7)
                goto L61
            L17:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1f:
                oq.u.b(r7)
                java.lang.Object r7 = r6.f231328g
                z0.s1 r7 = (p143z0.s1) r7
                z0.i3 r1 = p143z0.i3.this
                z0.a3 r3 = r6.f231330j
                fr.p0<z0.i3$a> r4 = r6.f231331k
                T r4 = r4.f66410a
                z0.i3$a r4 = (z0.i3.a) r4
                long r4 = r4.getValue()
                long r4 = r3.A(r4)
                float r3 = r3.I(r4)
                p143z0.i3.j(r1, r7, r3)
                r3 = r7
            L40:
                fr.p0<z0.i3$a> r7 = r6.f231331k
                T r7 = r7.f66410a
                z0.i3$a r7 = (z0.i3.a) r7
                boolean r7 = r7.getIsEnd()
                if (r7 != 0) goto La5
                fr.p0<z0.i3$a> r1 = r6.f231331k
                z0.i3 r7 = p143z0.i3.this
                lu.g r7 = p143z0.i3.l(r7)
                r6.f231328g = r3
                r6.f231326e = r1
                r6.f231327f = r2
                java.lang.Object r7 = p143z0.v1.a(r7, r6)
                if (r7 != r0) goto L61
                return r0
            L61:
                r1.f66410a = r7
                z0.i3 r7 = p143z0.i3.this
                fr.p0<z0.i3$a> r1 = r6.f231331k
                T r1 = r1.f66410a
                z0.i3$a r1 = (z0.i3.a) r1
                p143z0.i3.o(r7, r1)
                z0.i3 r7 = p143z0.i3.this
                lu.g r1 = p143z0.i3.l(r7)
                z0.i3$a r7 = p143z0.i3.n(r7, r1)
                if (r7 == 0) goto L8b
                z0.i3 r1 = p143z0.i3.this
                fr.p0<z0.i3$a> r4 = r6.f231331k
                p143z0.i3.o(r1, r7)
                T r1 = r4.f66410a
                z0.i3$a r1 = (z0.i3.a) r1
                z0.i3$a r7 = r1.d(r7)
                r4.f66410a = r7
            L8b:
                z0.i3 r7 = p143z0.i3.this
                z0.a3 r1 = r6.f231330j
                fr.p0<z0.i3$a> r4 = r6.f231331k
                T r4 = r4.f66410a
                z0.i3$a r4 = (z0.i3.a) r4
                long r4 = r4.getValue()
                long r4 = r1.A(r4)
                float r1 = r1.I(r4)
                p143z0.i3.j(r7, r3, r1)
                goto L40
            La5:
                oq.i0 r7 = oq.i0.f148189a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: z0.i3.c.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(s1 s1Var, tq.e<? super i0> eVar) {
            return ((c) v(s1Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            c cVar = i3.this.new c(this.f231330j, this.f231331k, eVar);
            cVar.f231328g = obj;
            return cVar;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class d extends vq.k implements p<ju.p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f231332e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f231333f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f231334g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private /* synthetic */ Object f231335h;

        d(tq.e<? super d> eVar) {
            super(2, eVar);
        }

        /* JADX WARN: Code duplicated, block: B:19:0x0043 A[Catch: all -> 0x0018, TryCatch #0 {all -> 0x0018, blocks: (B:7:0x0013, B:17:0x0039, B:19:0x0043, B:23:0x0061, B:14:0x002e), top: B:31:0x0009 }] */
        /* JADX WARN: Code duplicated, block: B:21:0x005d  */
        /* JADX WARN: Code duplicated, block: B:22:0x005e  */
        /* JADX WARN: Code duplicated, block: B:26:0x0072  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0072 -> B:17:0x0039). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // vq.a
        public final java.lang.Object J(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r8.f231334g
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L32
                if (r1 == r3) goto L22
                if (r1 != r2) goto L1a
                java.lang.Object r1 = r8.f231335h
                ju.p0 r1 = (ju.p0) r1
                oq.u.b(r9)     // Catch: java.lang.Throwable -> L18
                r9 = r1
                goto L39
            L18:
                r9 = move-exception
                goto L7c
            L1a:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L22:
                java.lang.Object r1 = r8.f231333f
                z0.a3 r1 = (p143z0.a3) r1
                java.lang.Object r5 = r8.f231332e
                z0.i3 r5 = (p143z0.i3) r5
                java.lang.Object r6 = r8.f231335h
                ju.p0 r6 = (ju.p0) r6
                oq.u.b(r9)     // Catch: java.lang.Throwable -> L18
                goto L61
            L32:
                oq.u.b(r9)
                java.lang.Object r9 = r8.f231335h
                ju.p0 r9 = (ju.p0) r9
            L39:
                tq.i r1 = r9.getCoroutineContext()     // Catch: java.lang.Throwable -> L18
                boolean r1 = ju.g2.n(r1)     // Catch: java.lang.Throwable -> L18
                if (r1 == 0) goto L74
                z0.i3 r5 = p143z0.i3.this     // Catch: java.lang.Throwable -> L18
                z0.a3 r1 = r5.getScrollingLogic()     // Catch: java.lang.Throwable -> L18
                z0.i3 r6 = p143z0.i3.this     // Catch: java.lang.Throwable -> L18
                lu.g r6 = p143z0.i3.l(r6)     // Catch: java.lang.Throwable -> L18
                r8.f231335h = r9     // Catch: java.lang.Throwable -> L18
                r8.f231332e = r5     // Catch: java.lang.Throwable -> L18
                r8.f231333f = r1     // Catch: java.lang.Throwable -> L18
                r8.f231334g = r3     // Catch: java.lang.Throwable -> L18
                java.lang.Object r6 = r6.a(r8)     // Catch: java.lang.Throwable -> L18
                if (r6 != r0) goto L5e
                goto L71
            L5e:
                r7 = r6
                r6 = r9
                r9 = r7
            L61:
                z0.i3$a r9 = (z0.i3.a) r9     // Catch: java.lang.Throwable -> L18
                r8.f231335h = r6     // Catch: java.lang.Throwable -> L18
                r8.f231332e = r4     // Catch: java.lang.Throwable -> L18
                r8.f231333f = r4     // Catch: java.lang.Throwable -> L18
                r8.f231334g = r2     // Catch: java.lang.Throwable -> L18
                java.lang.Object r9 = p143z0.i3.k(r5, r1, r9, r8)     // Catch: java.lang.Throwable -> L18
                if (r9 != r0) goto L72
            L71:
                return r0
            L72:
                r9 = r6
                goto L39
            L74:
                z0.i3 r9 = p143z0.i3.this
                p143z0.i3.m(r9, r4)
                oq.i0 r9 = oq.i0.f148189a
                return r9
            L7c:
                z0.i3 r0 = p143z0.i3.this
                p143z0.i3.m(r0, r4)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: z0.i3.d.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super i0> eVar) {
            return ((d) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            d dVar = i3.this.new d(eVar);
            dVar.f231335h = obj;
            return dVar;
        }
    }

    public i3(a3 a3Var, p<? super y, ? super tq.e<? super i0>, ? extends Object> pVar, c5.d dVar) {
        super(a3Var, pVar, dVar);
        this.channel = j.b(Integer.MAX_VALUE, null, null, 6, null);
    }

    private final boolean p(a3 a3Var, long j15) {
        return !(a3Var.I(a3Var.A(j15)) == 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float q(s1 s1Var, float f15) {
        a3 scrollingLogic = getScrollingLogic();
        return scrollingLogic.G(scrollingLogic.A(s1Var.a(scrollingLogic.H(scrollingLogic.z(f15)), z3.g.INSTANCE.b())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007f, code lost:
    
        if (r6.B(r7, r0) == r1) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v4, types: [T, z0.i3$a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(p143z0.a3 r6, z0.i3.a r7, tq.e<? super oq.i0> r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof z0.i3.b
            if (r0 == 0) goto L13
            r0 = r8
            z0.i3$b r0 = (z0.i3.b) r0
            int r1 = r0.f231325f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f231325f = r1
            goto L18
        L13:
            z0.i3$b r0 = new z0.i3$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f231323d
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f231325f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            oq.u.b(r8)
            goto L82
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            oq.u.b(r8)
            goto L69
        L38:
            oq.u.b(r8)
            fr.p0 r8 = new fr.p0
            r8.<init>()
            r8.f66410a = r7
            r5.x(r7)
            lu.g<z0.i3$a> r7 = r5.channel
            z0.i3$a r7 = r5.v(r7)
            if (r7 == 0) goto L5a
            r5.x(r7)
            T r2 = r8.f66410a
            z0.i3$a r2 = (z0.i3.a) r2
            z0.i3$a r7 = r2.d(r7)
            r8.f66410a = r7
        L5a:
            z0.i3$c r7 = new z0.i3$c
            r2 = 0
            r7.<init>(r6, r8, r2)
            r0.f231325f = r4
            java.lang.Object r6 = r5.h(r7, r0)
            if (r6 != r1) goto L69
            goto L81
        L69:
            er.p r6 = r5.c()
            z0.k0 r7 = r5.getVelocityTracker()
            long r7 = r7.b()
            c5.y r7 = c5.y.b(r7)
            r0.f231325f = r3
            java.lang.Object r6 = r6.B(r7, r0)
            if (r6 != r1) goto L82
        L81:
            return r1
        L82:
            oq.i0 r6 = oq.i0.f148189a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p143z0.i3.r(z0.a3, z0.i3$a, tq.e):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00a1  */
    private final boolean s(o pointerEvent) {
        boolean z15;
        if (!g0.isTrackpadGestureHandlingEnabled) {
            return false;
        }
        PointerInputChange pointerInputChange = (PointerInputChange) v.n0(pointerEvent.c());
        if (pointerInputChange != null) {
            List<HistoricalChange> listE = pointerInputChange.e();
            int size = listE.size();
            z15 = false;
            for (int i15 = 0; i15 < size; i15++) {
                HistoricalChange historicalChange = listE.get(i15);
                long jE = e.e((-9223372034707292160L) ^ historicalChange.getPanOffset());
                if (p(getScrollingLogic(), jE)) {
                    z15 = lu.k.j(this.channel.d(new a(jE, historicalChange.getUptimeMillis(), false, null))) || z15;
                }
            }
            long jE2 = e.e(pointerInputChange.getPanOffset() ^ (-9223372034707292160L));
            boolean zO = s.o(pointerEvent.getType(), s.INSTANCE.d());
            if (p(getScrollingLogic(), jE2) || zO) {
                if (lu.k.j(this.channel.d(new a(jE2, pointerInputChange.getUptimeMillis(), zO, null))) || z15) {
                    z15 = true;
                } else {
                    z15 = false;
                }
            }
        } else {
            z15 = false;
        }
        return z15 || getIsScrolling();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final a v(final g<a> gVar) {
        a aVarD = null;
        for (a aVar : v1.b(new er.a() { // from class: z0.h3
            @Override // er.a
            public final Object a() {
                return i3.w(gVar);
            }
        })) {
            aVarD = aVarD == null ? aVar : aVarD.d(aVar);
        }
        return aVarD;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a w(g gVar) {
        return (a) lu.k.f(gVar.k());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x(a scrollDelta) {
        getVelocityTracker().a(scrollDelta.getTimeMillis(), scrollDelta.getValue());
    }

    public void t(o pointerEvent, q pass, long bounds) {
        if (g0.isTrackpadGestureHandlingEnabled) {
            int type = pointerEvent.getType();
            s.Companion companion = s.INSTANCE;
            if (s.o(type, companion.f()) || s.o(pointerEvent.getType(), companion.e()) || s.o(pointerEvent.getType(), companion.d())) {
                List<PointerInputChange> listC = pointerEvent.c();
                int size = listC.size();
                for (int i15 = 0; i15 < size; i15++) {
                    if (listC.get(i15).q()) {
                        return;
                    }
                }
                if (pass == q.Initial && getIsScrolling()) {
                    s(pointerEvent);
                    a(pointerEvent);
                }
                if (pass == q.Main && !getIsScrolling() && s(pointerEvent)) {
                    a(pointerEvent);
                }
            }
        }
    }

    public void u(ju.p0 coroutineScope) {
        if (this.receivingPanEventsJob == null) {
            this.receivingPanEventsJob = ju.k.d(coroutineScope, null, null, new d(null), 3, null);
        }
    }
}
