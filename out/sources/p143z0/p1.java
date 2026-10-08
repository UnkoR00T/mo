package p143z0;

import a4.PointerInputChange;
import a4.q;
import a4.s;
import c5.y;
import er.l;
import er.p;
import fr.k;
import fr.l0;
import fr.m0;
import fr.p0;
import ip.a;
import java.util.List;
import ju.d2;
import ju.g3;
import lu.g;
import lu.j;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.v;
import u0.AnimationState;
import u0.e2;
import u0.m;
import u0.o;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001EBC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\"\u0010\u000b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0006\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0019\u001a\u0004\u0018\u00010\u0018*\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001d\u001a\u00020\u0014*\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001f\u0010 J,\u0010$\u001a\u00020\t*\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!H\u0082@¢\u0006\u0004\b$\u0010%JL\u0010/\u001a\u00020\t*\u00020&2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020(0'2\u0006\u0010*\u001a\u00020!2\u0006\u0010,\u001a\u00020+2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00140-H\u0082@¢\u0006\u0004\b/\u00100J\u001b\u00102\u001a\u00020!*\u00020&2\u0006\u00101\u001a\u00020!H\u0002¢\u0006\u0004\b2\u00103J'\u00106\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u00105\u001a\u0002042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b6\u00107J\u0017\u0010:\u001a\u00020\t2\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\b:\u0010;R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010D\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010C¨\u0006F"}, d2 = {"Lz0/p1;", "Lz0/t1;", "Lz0/a3;", "scrollingLogic", "Lz0/d2;", "mouseWheelScrollConfig", "Lkotlin/Function2;", "Lc5/y;", "Ltq/e;", "Loq/i0;", "", "onScrollStopped", "Lc5/d;", "density", "<init>", "(Lz0/a3;Lz0/d2;Ler/p;Lc5/d;)V", "La4/o;", "pointerEvent", "Lc5/r;", "bounds", "", "y", "(La4/o;J)Z", "Llu/g;", "Lz0/p1$a;", "B", "(Llu/g;)Lz0/p1$a;", "Lm3/e;", "scrollDelta", "u", "(Lz0/a3;J)Z", a.f96138c, "(Lz0/p1$a;)V", "", "threshold", "speed", "w", "(Lz0/a3;Lz0/p1$a;FFLtq/e;)Ljava/lang/Object;", "Lz0/s1;", "Lu0/n;", "Lu0/p;", "animationState", "targetValue", "", "durationMillis", "Lkotlin/Function1;", "shouldCancelAnimation", "s", "(Lz0/s1;Lu0/n;FILer/l;Ltq/e;)Ljava/lang/Object;", "delta", "v", "(Lz0/s1;F)F", "La4/q;", "pass", "z", "(La4/o;La4/q;J)V", "Lju/p0;", "coroutineScope", "A", "(Lju/p0;)V", "f", "Lz0/d2;", "g", "Llu/g;", "channel", "Lju/d2;", "h", "Lju/d2;", "receivingMouseWheelEventsJob", "a", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class p1 extends t1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final d2 mouseWheelScrollConfig;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final g<MouseWheelScrollDelta> channel;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private d2 receivingMouseWheelEventsJob;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0.p1$a, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fJ.\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0015\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e¨\u0006\u001f"}, d2 = {"Lz0/p1$a;", "", "Lm3/e;", "value", "", "timeMillis", "", "shouldApplyImmediately", "<init>", "(JJZLfr/k;)V", "other", "f", "(Lz0/p1$a;)Lz0/p1$a;", "a", "(JJZ)Lz0/p1$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "equals", "(Ljava/lang/Object;)Z", "J", "e", "()J", "b", "d", "c", "Z", "()Z", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final /* data */ class MouseWheelScrollDelta {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final long value;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final long timeMillis;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean shouldApplyImmediately;

        public /* synthetic */ MouseWheelScrollDelta(long j15, long j16, boolean z15, k kVar) {
            this(j15, j16, z15);
        }

        public static /* synthetic */ MouseWheelScrollDelta b(MouseWheelScrollDelta mouseWheelScrollDelta, long j15, long j16, boolean z15, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                j15 = mouseWheelScrollDelta.value;
            }
            long j17 = j15;
            if ((i15 & 2) != 0) {
                j16 = mouseWheelScrollDelta.timeMillis;
            }
            long j18 = j16;
            if ((i15 & 4) != 0) {
                z15 = mouseWheelScrollDelta.shouldApplyImmediately;
            }
            return mouseWheelScrollDelta.a(j17, j18, z15);
        }

        public final MouseWheelScrollDelta a(long value, long timeMillis, boolean shouldApplyImmediately) {
            return new MouseWheelScrollDelta(value, timeMillis, shouldApplyImmediately, null);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getShouldApplyImmediately() {
            return this.shouldApplyImmediately;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final long getTimeMillis() {
            return this.timeMillis;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final long getValue() {
            return this.value;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MouseWheelScrollDelta)) {
                return false;
            }
            MouseWheelScrollDelta mouseWheelScrollDelta = (MouseWheelScrollDelta) other;
            return m3.e.j(this.value, mouseWheelScrollDelta.value) && this.timeMillis == mouseWheelScrollDelta.timeMillis && this.shouldApplyImmediately == mouseWheelScrollDelta.shouldApplyImmediately;
        }

        public final MouseWheelScrollDelta f(MouseWheelScrollDelta other) {
            return new MouseWheelScrollDelta(m3.e.q(this.value, other.value), Math.max(this.timeMillis, other.timeMillis), this.shouldApplyImmediately, null);
        }

        public int hashCode() {
            return (((m3.e.o(this.value) * 31) + Long.hashCode(this.timeMillis)) * 31) + Boolean.hashCode(this.shouldApplyImmediately);
        }

        public String toString() {
            return "MouseWheelScrollDelta(value=" + ((Object) m3.e.s(this.value)) + ", timeMillis=" + this.timeMillis + ", shouldApplyImmediately=" + this.shouldApplyImmediately + ')';
        }

        private MouseWheelScrollDelta(long j15, long j16, boolean z15) {
            this.value = j15;
            this.timeMillis = j16;
            this.shouldApplyImmediately = z15;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f231530d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f231531e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        float f231532f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f231533g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f231535j;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f231533g = obj;
            this.f231535j |= PKIFailureInfo.systemUnavail;
            return p1.this.w(null, null, 0.0f, 0.0f, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz0/s1;", "Loq/i0;", "<anonymous>", "(Lz0/s1;)V"}, k = 3, mv = {2, 1, 0})
    static final class c extends vq.k implements p<s1, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f231536e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f231537f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f231538g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f231539h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f231540j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ m0 f231541k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ p0<AnimationState<Float, u0.p>> f231542l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ p0<MouseWheelScrollDelta> f231543m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ float f231544n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ p1 f231545p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ float f231546q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ a3 f231547r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(m0 m0Var, p0<AnimationState<Float, u0.p>> p0Var, p0<MouseWheelScrollDelta> p0Var2, float f15, p1 p1Var, float f16, a3 a3Var, tq.e<? super c> eVar) {
            super(2, eVar);
            this.f231541k = m0Var;
            this.f231542l = p0Var;
            this.f231543m = p0Var2;
            this.f231544n = f15;
            this.f231545p = p1Var;
            this.f231546q = f16;
            this.f231547r = a3Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v4, types: [T, z0.p1$a] */
        public static final boolean O(p1 p1Var, p0 p0Var, m0 m0Var, a3 a3Var, l0 l0Var, float f15) {
            MouseWheelScrollDelta mouseWheelScrollDeltaB = p1Var.B(p1Var.channel);
            if (mouseWheelScrollDeltaB != null) {
                p1Var.D(mouseWheelScrollDeltaB);
                ?? F = ((MouseWheelScrollDelta) p0Var.f66410a).f(mouseWheelScrollDeltaB);
                p0Var.f66410a = F;
                float fI = a3Var.I(a3Var.A(F.getValue()));
                m0Var.f66406a = fI;
                l0Var.f66404a = !r1.d(fI - f15);
            }
            return mouseWheelScrollDeltaB != null;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x006b  */
        /* JADX WARN: Code duplicated, block: B:17:0x008f  */
        /* JADX WARN: Code duplicated, block: B:36:0x0181  */
        /* JADX WARN: Type inference failed for: r2v12, types: [T, u0.n] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x014f -> B:30:0x0151). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x015d -> B:13:0x0067). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // vq.a
        public final java.lang.Object J(java.lang.Object r24) {
            /*
                Method dump skipped, instruction units count: 401
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: z0.p1.c.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(s1 s1Var, tq.e<? super i0> eVar) {
            return ((c) v(s1Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            c cVar = new c(this.f231541k, this.f231542l, this.f231543m, this.f231544n, this.f231545p, this.f231546q, this.f231547r, eVar);
            cVar.f231540j = obj;
            return cVar;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f231548d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f231549e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f231550f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f231551g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f231552h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f231553j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f231554k;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f231553j = obj;
            this.f231554k |= PKIFailureInfo.systemUnavail;
            return p1.x(null, null, null, null, null, 0L, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Lz0/p1$a;", "<anonymous>", "(Lju/p0;)Lz0/p1$a;"}, k = 3, mv = {2, 1, 0})
    static final class e extends vq.k implements p<ju.p0, tq.e<? super MouseWheelScrollDelta>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f231555e;

        e(tq.e<? super e> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f231555e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            g gVar = p1.this.channel;
            this.f231555e = 1;
            Object objA = v1.a(gVar, this);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super MouseWheelScrollDelta> eVar) {
            return ((e) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return p1.this.new e(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class f extends vq.k implements p<ju.p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f231557e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f231558f;

        f(tq.e<? super f> eVar) {
            super(2, eVar);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x003f A[Catch: all -> 0x0088, TryCatch #1 {all -> 0x0088, blocks: (B:18:0x0035, B:20:0x003f, B:24:0x0054), top: B:39:0x0035 }] */
        /* JADX WARN: Code duplicated, block: B:22:0x004f  */
        /* JADX WARN: Code duplicated, block: B:23:0x0051  */
        /* JADX WARN: Code duplicated, block: B:9:0x0017  */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // vq.a
        public final java.lang.Object J(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r12.f231557e
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2e
                if (r1 == r4) goto L26
                if (r1 != r3) goto L1e
                java.lang.Object r1 = r12.f231558f
                ju.p0 r1 = (ju.p0) r1
                oq.u.b(r13)     // Catch: java.lang.Throwable -> L19
                r10 = r12
            L17:
                r13 = r1
                goto L35
            L19:
                r0 = move-exception
                r13 = r0
                r10 = r12
                goto L94
            L1e:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L26:
                java.lang.Object r1 = r12.f231558f
                ju.p0 r1 = (ju.p0) r1
                oq.u.b(r13)     // Catch: java.lang.Throwable -> L19
                goto L54
            L2e:
                oq.u.b(r13)
                java.lang.Object r13 = r12.f231558f
                ju.p0 r13 = (ju.p0) r13
            L35:
                tq.i r1 = r13.getCoroutineContext()     // Catch: java.lang.Throwable -> L88
                boolean r1 = ju.g2.n(r1)     // Catch: java.lang.Throwable -> L88
                if (r1 == 0) goto L8b
                z0.p1 r1 = p143z0.p1.this     // Catch: java.lang.Throwable -> L88
                lu.g r1 = p143z0.p1.o(r1)     // Catch: java.lang.Throwable -> L88
                r12.f231558f = r13     // Catch: java.lang.Throwable -> L88
                r12.f231557e = r4     // Catch: java.lang.Throwable -> L88
                java.lang.Object r1 = r1.a(r12)     // Catch: java.lang.Throwable -> L88
                if (r1 != r0) goto L51
                r10 = r12
                goto L84
            L51:
                r11 = r1
                r1 = r13
                r13 = r11
            L54:
                r7 = r13
                z0.p1$a r7 = (p143z0.p1.MouseWheelScrollDelta) r7     // Catch: java.lang.Throwable -> L88
                z0.p1 r13 = p143z0.p1.this     // Catch: java.lang.Throwable -> L88
                c5.d r13 = r13.getDensity()     // Catch: java.lang.Throwable -> L88
                float r5 = p143z0.r1.b()     // Catch: java.lang.Throwable -> L88
                float r8 = r13.l2(r5)     // Catch: java.lang.Throwable -> L88
                z0.p1 r13 = p143z0.p1.this     // Catch: java.lang.Throwable -> L88
                c5.d r13 = r13.getDensity()     // Catch: java.lang.Throwable -> L88
                float r5 = p143z0.r1.a()     // Catch: java.lang.Throwable -> L88
                float r9 = r13.l2(r5)     // Catch: java.lang.Throwable -> L88
                z0.p1 r5 = p143z0.p1.this     // Catch: java.lang.Throwable -> L88
                z0.a3 r6 = r5.getScrollingLogic()     // Catch: java.lang.Throwable -> L88
                r12.f231558f = r1     // Catch: java.lang.Throwable -> L88
                r12.f231557e = r3     // Catch: java.lang.Throwable -> L88
                r10 = r12
                java.lang.Object r13 = p143z0.p1.m(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L85
                if (r13 != r0) goto L17
            L84:
                return r0
            L85:
                r0 = move-exception
            L86:
                r13 = r0
                goto L94
            L88:
                r0 = move-exception
                r10 = r12
                goto L86
            L8b:
                r10 = r12
                z0.p1 r13 = p143z0.p1.this
                p143z0.p1.p(r13, r2)
                oq.i0 r13 = oq.i0.f148189a
                return r13
            L94:
                z0.p1 r0 = p143z0.p1.this
                p143z0.p1.p(r0, r2)
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: z0.p1.f.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super i0> eVar) {
            return ((f) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            f fVar = p1.this.new f(eVar);
            fVar.f231558f = obj;
            return fVar;
        }
    }

    public p1(a3 a3Var, d2 d2Var, p<? super y, ? super tq.e<? super i0>, ? extends Object> pVar, c5.d dVar) {
        super(a3Var, pVar, dVar);
        this.mouseWheelScrollConfig = d2Var;
        this.channel = j.b(Integer.MAX_VALUE, null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MouseWheelScrollDelta B(final g<MouseWheelScrollDelta> gVar) {
        MouseWheelScrollDelta mouseWheelScrollDeltaF = null;
        for (MouseWheelScrollDelta mouseWheelScrollDelta : v1.b(new er.a() { // from class: z0.n1
            @Override // er.a
            public final Object a() {
                return p1.C(gVar);
            }
        })) {
            mouseWheelScrollDeltaF = mouseWheelScrollDeltaF == null ? mouseWheelScrollDelta : mouseWheelScrollDeltaF.f(mouseWheelScrollDelta);
        }
        return mouseWheelScrollDeltaF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MouseWheelScrollDelta C(g gVar) {
        return (MouseWheelScrollDelta) lu.k.f(gVar.k());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D(MouseWheelScrollDelta scrollDelta) {
        getVelocityTracker().a(scrollDelta.getTimeMillis(), scrollDelta.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object s(final s1 s1Var, AnimationState<Float, u0.p> animationState, float f15, int i15, final l<? super Float, Boolean> lVar, tq.e<? super i0> eVar) throws Throwable {
        final m0 m0Var = new m0();
        m0Var.f66406a = animationState.getValue().floatValue();
        Object objX = e2.x(animationState, vq.b.d(f15), m.l(i15, 0, u0.i0.e(), 2, null), true, new l() { // from class: z0.o1
            @Override // er.l
            public final Object b(Object obj) {
                return p1.t(m0Var, this, s1Var, lVar, (u0.k) obj);
            }
        }, eVar);
        return objX == uq.b.e() ? objX : i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t(m0 m0Var, p1 p1Var, s1 s1Var, l lVar, u0.k kVar) {
        float fFloatValue = ((Number) kVar.e()).floatValue() - m0Var.f66406a;
        if (!r1.d(fFloatValue)) {
            if (!r1.d(fFloatValue - p1Var.v(s1Var, fFloatValue))) {
                kVar.a();
                return i0.f148189a;
            }
            m0Var.f66406a += fFloatValue;
        }
        if (((Boolean) lVar.b(Float.valueOf(m0Var.f66406a))).booleanValue()) {
            kVar.a();
        }
        return i0.f148189a;
    }

    private final boolean u(a3 a3Var, long j15) {
        float fI = a3Var.I(a3Var.A(j15));
        if (fI == 0.0f) {
            return false;
        }
        return fI > 0.0f ? a3Var.getScrollableState().e() : a3Var.getScrollableState().d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float v(s1 s1Var, float f15) {
        a3 scrollingLogic = getScrollingLogic();
        return scrollingLogic.G(scrollingLogic.A(s1Var.b(scrollingLogic.H(scrollingLogic.z(f15)), z3.g.INSTANCE.b())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x010b, code lost:
    
        if (r0.B(r1, r9) == r10) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [T, z0.p1$a] */
    /* JADX WARN: Type inference failed for: r0v7, types: [T, u0.n] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(p143z0.a3 r23, p143z0.p1.MouseWheelScrollDelta r24, float r25, float r26, tq.e<? super oq.i0> r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p143z0.p1.w(z0.a3, z0.p1$a, float, float, tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r1v4, types: [T, z0.p1$a] */
    /* JADX WARN: Type inference failed for: r1v8, types: [T, u0.n] */
    public static final Object x(p1 p1Var, p0<MouseWheelScrollDelta> p0Var, m0 m0Var, a3 a3Var, p0<AnimationState<Float, u0.p>> p0Var2, long j15, tq.e<? super Boolean> eVar) throws Throwable {
        d dVar;
        m0 m0Var2;
        a3 a3Var2;
        p0<AnimationState<Float, u0.p>> p0Var3;
        p0<MouseWheelScrollDelta> p0Var4;
        p1 p1Var2 = p1Var;
        if (eVar instanceof d) {
            dVar = (d) eVar;
            int i15 = dVar.f231554k;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                dVar.f231554k = i15 - PKIFailureInfo.systemUnavail;
            } else {
                dVar = new d(eVar);
            }
        } else {
            dVar = new d(eVar);
        }
        Object objE = dVar.f231553j;
        Object objE2 = uq.b.e();
        int i16 = dVar.f231554k;
        boolean z15 = false;
        if (i16 == 0) {
            u.b(objE);
            if (j15 < 0) {
                return vq.b.a(false);
            }
            e eVar2 = p1Var2.new e(null);
            dVar.f231548d = p1Var2;
            dVar.f231549e = p0Var;
            m0Var2 = m0Var;
            dVar.f231550f = m0Var2;
            a3Var2 = a3Var;
            dVar.f231551g = a3Var2;
            p0Var3 = p0Var2;
            dVar.f231552h = p0Var3;
            dVar.f231554k = 1;
            objE = g3.e(j15, eVar2, dVar);
            if (objE == objE2) {
                return objE2;
            }
            p0Var4 = p0Var;
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p0<AnimationState<Float, u0.p>> p0Var5 = (p0) dVar.f231552h;
            a3 a3Var3 = (a3) dVar.f231551g;
            m0 m0Var3 = (m0) dVar.f231550f;
            p0Var4 = (p0) dVar.f231549e;
            p1 p1Var3 = (p1) dVar.f231548d;
            u.b(objE);
            p0Var3 = p0Var5;
            a3Var2 = a3Var3;
            m0Var2 = m0Var3;
            p1Var2 = p1Var3;
        }
        MouseWheelScrollDelta mouseWheelScrollDelta = (MouseWheelScrollDelta) objE;
        if (mouseWheelScrollDelta != null) {
            ?? B = MouseWheelScrollDelta.b(mouseWheelScrollDelta, 0L, 0L, p0Var4.f66410a.getShouldApplyImmediately(), 3, null);
            p0Var4.f66410a = B;
            m0Var2.f66406a = a3Var2.I(a3Var2.A(B.getValue()));
            p0Var3.f66410a = o.c(0.0f, 0.0f, 0L, 0L, false, 30, null);
            p1Var2.D(mouseWheelScrollDelta);
            z15 = !r1.d(m0Var2.f66406a);
        }
        return vq.b.a(z15);
    }

    private final boolean y(a4.o pointerEvent, long bounds) {
        long jC = this.mouseWheelScrollConfig.c(getDensity(), pointerEvent, bounds);
        if (u(getScrollingLogic(), jC)) {
            return lu.k.j(this.channel.d(new MouseWheelScrollDelta(jC, ((PointerInputChange) v.l0(pointerEvent.c())).getUptimeMillis(), !this.mouseWheelScrollConfig.b() || this.mouseWheelScrollConfig.a(pointerEvent), null)));
        }
        return getIsScrolling();
    }

    public void A(ju.p0 coroutineScope) {
        if (this.receivingMouseWheelEventsJob == null) {
            this.receivingMouseWheelEventsJob = ju.k.d(coroutineScope, null, null, new f(null), 3, null);
        }
    }

    public void z(a4.o pointerEvent, q pass, long bounds) {
        if (s.o(pointerEvent.getType(), s.INSTANCE.l())) {
            List<PointerInputChange> listC = pointerEvent.c();
            int size = listC.size();
            for (int i15 = 0; i15 < size; i15++) {
                if (listC.get(i15).q()) {
                    return;
                }
            }
            if (pass == q.Initial && getIsScrolling()) {
                y(pointerEvent, bounds);
                a(pointerEvent);
            }
            if (pass == q.Main && !getIsScrolling() && y(pointerEvent, bounds)) {
                a(pointerEvent);
            }
        }
    }
}
