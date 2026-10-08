package p143z0;

import a4.PointerInputChange;
import a4.a0;
import a4.k0;
import a4.o;
import a4.r;
import androidx.compose.ui.platform.f3;
import er.l;
import er.p;
import er.q;
import fr.l0;
import fr.p0;
import java.util.List;
import java.util.concurrent.CancellationException;
import m3.e;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import vq.i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a8\u0010\b\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0003H\u0086@¢\u0006\u0004\b\b\u0010\t\u001a0\u0010\r\u001a\u00020\f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\nH\u0086@¢\u0006\u0004\b\r\u0010\u000e\u001a\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@¢\u0006\u0004\b\u000f\u0010\u0010\u001ad\u0010\u0016\u001a\u00020\u0006*\u00020\u00112\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\n2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u00132\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u00132\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0003H\u0086@¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0090\u0001\u0010\u001c\u001a\u00020\u0006*\u00020\u00112\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182 \b\u0002\u0010\u0012\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u001a2\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\n2\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u00132\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\u00132\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0003H\u0086@¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0090\u0001\u0010\u001f\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u00042\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\u00132\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u001e\u0010\u0012\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u001a2\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00032\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\nH\u0080@¢\u0006\u0004\b\u001f\u0010 \u001ad\u0010!\u001a\u00020\u0006*\u00020\u00112\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\n2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u00132\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u00132\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0003H\u0086@¢\u0006\u0004\b!\u0010\u0017\u001a\u001e\u0010\"\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@¢\u0006\u0004\b\"\u0010\u0010\u001a\u001b\u0010$\u001a\u00020\f*\u00020#2\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b$\u0010%\u001a\u001b\u0010*\u001a\u00020)*\u00020&2\u0006\u0010(\u001a\u00020'H\u0000¢\u0006\u0004\b*\u0010+\"\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.\"\u0014\u00101\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010.\"\u0014\u00103\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010.¨\u00064"}, d2 = {"La4/c;", "La4/a0;", "pointerId", "Lkotlin/Function2;", "La4/b0;", "Lm3/e;", "Loq/i0;", "onTouchSlopReached", "g", "(La4/c;JLer/p;Ltq/e;)Ljava/lang/Object;", "Lkotlin/Function1;", "onDrag", "", "n", "(La4/c;JLer/l;Ltq/e;)Ljava/lang/Object;", "e", "(La4/c;JLtq/e;)Ljava/lang/Object;", "La4/k0;", "onDragStart", "Lkotlin/Function0;", "onDragEnd", "onDragCancel", "h", "(La4/k0;Ler/l;Ler/a;Ler/a;Ler/p;Ltq/e;)Ljava/lang/Object;", "Lz0/a2;", "orientationLock", "Lkotlin/Function3;", "shouldAwaitTouchSlop", "i", "(La4/k0;Lz0/a2;Ler/q;Ler/l;Ler/a;Ler/a;Ler/p;Ltq/e;)Ljava/lang/Object;", "initialDown", "q", "(La4/c;La4/b0;Ler/a;Lz0/a2;Ler/q;Ler/p;Ler/a;Ler/l;Ltq/e;)Ljava/lang/Object;", "m", "f", "La4/o;", "o", "(La4/o;J)Z", "Landroidx/compose/ui/platform/f3;", "La4/p0;", "pointerType", "", "p", "(Landroidx/compose/ui/platform/f3;I)F", "Lc5/h;", "a", "F", "mouseSlop", "b", "defaultTouchSlop", "c", "mouseToTouchSlopRatio", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f231567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f231568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f231569c;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f231570d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f231571e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f231572f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f231573g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f231572f = obj;
            this.f231573g |= PKIFailureInfo.systemUnavail;
            return q0.e(null, 0L, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f231574d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f231575e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f231576f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f231577g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f231578h;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f231577g = obj;
            this.f231578h |= PKIFailureInfo.systemUnavail;
            return q0.f(null, 0L, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"La4/c;", "Loq/i0;", "<anonymous>", "(La4/c;)V"}, k = 3, mv = {2, 1, 0})
    static final class c extends i implements p<a4.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f231579c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f231580d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f231581e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f231582f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ l0 f231583g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ p0<PointerInputChange> f231584h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ p0<PointerInputChange> f231585j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(l0 l0Var, p0<PointerInputChange> p0Var, p0<PointerInputChange> p0Var2, tq.e<? super c> eVar) {
            super(2, eVar);
            this.f231583g = l0Var;
            this.f231584h = p0Var;
            this.f231585j = p0Var2;
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0063  */
        /* JADX WARN: Code duplicated, block: B:20:0x0070 A[LOOP:2: B:16:0x0061->B:20:0x0070, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:72:0x0073 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:73:0x0074 A[EDGE_INSN: B:73:0x0074->B:22:0x0074 BREAK  A[LOOP:2: B:16:0x0061->B:20:0x0070], SYNTHETIC] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v6 */
        /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r9v9, types: [T, a4.b0] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00be -> B:38:0x00c1). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // vq.a
        public final java.lang.Object J(java.lang.Object r17) {
            /*
                Method dump skipped, instruction units count: 355
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: z0.q0.c.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
        public final Object B(a4.c cVar, tq.e<? super i0> eVar) {
            return ((c) v(cVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            c cVar = new c(this.f231583g, this.f231584h, this.f231585j, eVar);
            cVar.f231582f = obj;
            return cVar;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f231586d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f231587e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f231588f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f231589g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f231590h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        float f231591j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f231592k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f231593l;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f231592k = obj;
            this.f231593l |= PKIFailureInfo.systemUnavail;
            return q0.g(null, 0L, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"La4/c;", "Loq/i0;", "<anonymous>", "(La4/c;)V"}, k = 3, mv = {2, 1, 0})
    static final class e extends i implements p<a4.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f231594c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f231595d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ er.a<Boolean> f231596e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ a2 f231597f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ q<PointerInputChange, PointerInputChange, m3.e, i0> f231598g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ p<PointerInputChange, m3.e, i0> f231599h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ er.a<i0> f231600j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ l<PointerInputChange, i0> f231601k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(er.a<Boolean> aVar, a2 a2Var, q<? super PointerInputChange, ? super PointerInputChange, ? super m3.e, i0> qVar, p<? super PointerInputChange, ? super m3.e, i0> pVar, er.a<i0> aVar2, l<? super PointerInputChange, i0> lVar, tq.e<? super e> eVar) {
            super(2, eVar);
            this.f231596e = aVar;
            this.f231597f = a2Var;
            this.f231598g = qVar;
            this.f231599h = pVar;
            this.f231600j = aVar2;
            this.f231601k = lVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0052, code lost:
        
            if (p143z0.q0.q(r3, (a4.PointerInputChange) r13, r5, r6, r7, r8, r9, r10, r12) == r0) goto L16;
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
                int r1 = r12.f231594c
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L23
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                oq.u.b(r13)
                goto L55
            L12:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L1a:
                java.lang.Object r1 = r12.f231595d
                a4.c r1 = (a4.c) r1
                oq.u.b(r13)
            L21:
                r3 = r1
                goto L39
            L23:
                oq.u.b(r13)
                java.lang.Object r13 = r12.f231595d
                r1 = r13
                a4.c r1 = (a4.c) r1
                a4.q r13 = a4.q.Initial
                r12.f231595d = r1
                r12.f231594c = r3
                r3 = 0
                java.lang.Object r13 = p143z0.b3.c(r1, r3, r13, r12)
                if (r13 != r0) goto L21
                goto L54
            L39:
                r4 = r13
                a4.b0 r4 = (a4.PointerInputChange) r4
                er.a<java.lang.Boolean> r5 = r12.f231596e
                z0.a2 r6 = r12.f231597f
                er.q<a4.b0, a4.b0, m3.e, oq.i0> r7 = r12.f231598g
                er.p<a4.b0, m3.e, oq.i0> r8 = r12.f231599h
                er.a<oq.i0> r9 = r12.f231600j
                er.l<a4.b0, oq.i0> r10 = r12.f231601k
                r13 = 0
                r12.f231595d = r13
                r12.f231594c = r2
                r11 = r12
                java.lang.Object r13 = p143z0.q0.q(r3, r4, r5, r6, r7, r8, r9, r10, r11)
                if (r13 != r0) goto L55
            L54:
                return r0
            L55:
                oq.i0 r13 = oq.i0.f148189a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: z0.q0.e.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
        public final Object B(a4.c cVar, tq.e<? super i0> eVar) {
            return ((e) v(cVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            e eVar2 = new e(this.f231596e, this.f231597f, this.f231598g, this.f231599h, this.f231600j, this.f231601k, eVar);
            eVar2.f231595d = obj;
            return eVar2;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"La4/c;", "Loq/i0;", "<anonymous>", "(La4/c;)V"}, k = 3, mv = {2, 1, 0})
    static final class f extends i implements p<a4.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f231602c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f231603d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ l<m3.e, i0> f231604e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ er.a<i0> f231605f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ er.a<i0> f231606g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ p<PointerInputChange, m3.e, i0> f231607h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(l<? super m3.e, i0> lVar, er.a<i0> aVar, er.a<i0> aVar2, p<? super PointerInputChange, ? super m3.e, i0> pVar, tq.e<? super f> eVar) {
            super(2, eVar);
            this.f231604e = lVar;
            this.f231605f = aVar;
            this.f231606g = aVar2;
            this.f231607h = pVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 N(p pVar, PointerInputChange pointerInputChange) {
            pVar.B(pointerInputChange, m3.e.d(a4.p.g(pointerInputChange)));
            pointerInputChange.a();
            return i0.f148189a;
        }

        /* JADX WARN: Code duplicated, block: B:29:0x0063  */
        /* JADX WARN: Code duplicated, block: B:30:0x0064 A[Catch: CancellationException -> 0x00b6, PHI: r1 r8 r12
          0x0064: PHI (r1v8 a4.c) = (r1v4 a4.c), (r1v9 a4.c) binds: [B:16:0x002f, B:28:0x0061] A[DONT_GENERATE, DONT_INLINE]
          0x0064: PHI (r8v6 z0.q0$f) = (r8v2 z0.q0$f), (r8v7 z0.q0$f) binds: [B:16:0x002f, B:28:0x0061] A[DONT_GENERATE, DONT_INLINE]
          0x0064: PHI (r12v12 java.lang.Object) = (r12v0 java.lang.Object), (r12v18 java.lang.Object) binds: [B:16:0x002f, B:28:0x0061] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {CancellationException -> 0x00b6, blocks: (B:36:0x008c, B:38:0x0094, B:40:0x00a6, B:42:0x00b2, B:45:0x00b9, B:46:0x00bc, B:47:0x00c2, B:30:0x0064, B:32:0x0068, B:27:0x0053, B:23:0x004b), top: B:57:0x004b }] */
        /* JADX WARN: Code duplicated, block: B:32:0x0068 A[Catch: CancellationException -> 0x00b6, TryCatch #2 {CancellationException -> 0x00b6, blocks: (B:36:0x008c, B:38:0x0094, B:40:0x00a6, B:42:0x00b2, B:45:0x00b9, B:46:0x00bc, B:47:0x00c2, B:30:0x0064, B:32:0x0068, B:27:0x0053, B:23:0x004b), top: B:57:0x004b }] */
        /* JADX WARN: Code duplicated, block: B:35:0x008b  */
        /* JADX WARN: Code duplicated, block: B:38:0x0094 A[Catch: CancellationException -> 0x00b6, TryCatch #2 {CancellationException -> 0x00b6, blocks: (B:36:0x008c, B:38:0x0094, B:40:0x00a6, B:42:0x00b2, B:45:0x00b9, B:46:0x00bc, B:47:0x00c2, B:30:0x0064, B:32:0x0068, B:27:0x0053, B:23:0x004b), top: B:57:0x004b }] */
        /* JADX WARN: Code duplicated, block: B:40:0x00a6 A[Catch: CancellationException -> 0x00b6, TryCatch #2 {CancellationException -> 0x00b6, blocks: (B:36:0x008c, B:38:0x0094, B:40:0x00a6, B:42:0x00b2, B:45:0x00b9, B:46:0x00bc, B:47:0x00c2, B:30:0x0064, B:32:0x0068, B:27:0x0053, B:23:0x004b), top: B:57:0x004b }] */
        /* JADX WARN: Code duplicated, block: B:42:0x00b2 A[Catch: CancellationException -> 0x00b6, TryCatch #2 {CancellationException -> 0x00b6, blocks: (B:36:0x008c, B:38:0x0094, B:40:0x00a6, B:42:0x00b2, B:45:0x00b9, B:46:0x00bc, B:47:0x00c2, B:30:0x0064, B:32:0x0068, B:27:0x0053, B:23:0x004b), top: B:57:0x004b }] */
        /* JADX WARN: Code duplicated, block: B:47:0x00c2 A[Catch: CancellationException -> 0x00b6, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x00b6, blocks: (B:36:0x008c, B:38:0x0094, B:40:0x00a6, B:42:0x00b2, B:45:0x00b9, B:46:0x00bc, B:47:0x00c2, B:30:0x0064, B:32:0x0068, B:27:0x0053, B:23:0x004b), top: B:57:0x004b }] */
        /* JADX WARN: Code duplicated, block: B:59:0x00b9 A[SYNTHETIC] */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            CancellationException cancellationException;
            f fVar;
            a4.c cVar;
            a4.c cVar2;
            List<PointerInputChange> listC;
            int size;
            int i15;
            PointerInputChange pointerInputChange;
            PointerInputChange pointerInputChange2;
            Object objE = uq.b.e();
            int i16 = this.f231602c;
            if (i16 != 0) {
                try {
                    if (i16 == 1) {
                        cVar = (a4.c) this.f231603d;
                        u.b(obj);
                        fVar = this;
                        long id5 = ((PointerInputChange) obj).getId();
                        fVar.f231603d = cVar;
                        fVar.f231602c = 2;
                        obj = q0.f(cVar, id5, this);
                        if (obj == objE) {
                            pointerInputChange2 = (PointerInputChange) obj;
                            if (pointerInputChange2 != null) {
                                fVar.f231604e.b(m3.e.d(pointerInputChange2.getPosition()));
                                long id6 = pointerInputChange2.getId();
                                final p<PointerInputChange, m3.e, i0> pVar = fVar.f231607h;
                                l lVar = new l() { // from class: z0.r0
                                    @Override // er.l
                                    public final Object b(Object obj2) {
                                        return q0.f.N(pVar, (PointerInputChange) obj2);
                                    }
                                };
                                fVar.f231603d = cVar;
                                fVar.f231602c = 3;
                                obj = q0.n(cVar, id6, lVar, this);
                                if (obj != objE) {
                                    cVar2 = cVar;
                                }
                            }
                        }
                        return objE;
                    }
                    if (i16 == 2) {
                        cVar = (a4.c) this.f231603d;
                        u.b(obj);
                        fVar = this;
                        pointerInputChange2 = (PointerInputChange) obj;
                        if (pointerInputChange2 != null) {
                            fVar.f231604e.b(m3.e.d(pointerInputChange2.getPosition()));
                            long id7 = pointerInputChange2.getId();
                            final p pVar2 = fVar.f231607h;
                            l lVar2 = new l() { // from class: z0.r0
                                @Override // er.l
                                public final Object b(Object obj2) {
                                    return q0.f.N(pVar2, (PointerInputChange) obj2);
                                }
                            };
                            fVar.f231603d = cVar;
                            fVar.f231602c = 3;
                            obj = q0.n(cVar, id7, lVar2, this);
                            if (obj != objE) {
                                cVar2 = cVar;
                            }
                            return objE;
                        }
                    } else {
                        if (i16 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        cVar2 = (a4.c) this.f231603d;
                        u.b(obj);
                        fVar = this;
                    }
                    if (((Boolean) obj).booleanValue()) {
                        listC = cVar2.A1().c();
                        size = listC.size();
                        for (i15 = 0; i15 < size; i15++) {
                            pointerInputChange = listC.get(i15);
                            if (a4.p.c(pointerInputChange)) {
                                pointerInputChange.a();
                            }
                        }
                        fVar.f231605f.a();
                    } else {
                        fVar.f231606g.a();
                    }
                } catch (CancellationException e15) {
                    cancellationException = e15;
                    fVar = this;
                    fVar.f231606g.a();
                    throw cancellationException;
                }
            } else {
                u.b(obj);
                a4.c cVar3 = (a4.c) this.f231603d;
                try {
                    this.f231603d = cVar3;
                    this.f231602c = 1;
                    fVar = this;
                    try {
                        obj = b3.d(cVar3, false, null, fVar, 2, null);
                        if (obj != objE) {
                            cVar = cVar3;
                            long id8 = ((PointerInputChange) obj).getId();
                            fVar.f231603d = cVar;
                            fVar.f231602c = 2;
                            obj = q0.f(cVar, id8, this);
                            if (obj == objE) {
                                pointerInputChange2 = (PointerInputChange) obj;
                                if (pointerInputChange2 != null) {
                                    fVar.f231604e.b(m3.e.d(pointerInputChange2.getPosition()));
                                    long id9 = pointerInputChange2.getId();
                                    final p pVar3 = fVar.f231607h;
                                    l lVar3 = new l() { // from class: z0.r0
                                        @Override // er.l
                                        public final Object b(Object obj2) {
                                            return q0.f.N(pVar3, (PointerInputChange) obj2);
                                        }
                                    };
                                    fVar.f231603d = cVar;
                                    fVar.f231602c = 3;
                                    obj = q0.n(cVar, id9, lVar3, this);
                                    if (obj != objE) {
                                        cVar2 = cVar;
                                        if (((Boolean) obj).booleanValue()) {
                                            listC = cVar2.A1().c();
                                            size = listC.size();
                                            while (i15 < size) {
                                                pointerInputChange = listC.get(i15);
                                                if (a4.p.c(pointerInputChange)) {
                                                    pointerInputChange.a();
                                                }
                                            }
                                            fVar.f231605f.a();
                                        } else {
                                            fVar.f231606g.a();
                                        }
                                    }
                                }
                            }
                        }
                        return objE;
                    } catch (CancellationException e16) {
                        e = e16;
                        cancellationException = e;
                        fVar.f231606g.a();
                        throw cancellationException;
                    }
                } catch (CancellationException e17) {
                    e = e17;
                    fVar = this;
                }
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(a4.c cVar, tq.e<? super i0> eVar) {
            return ((f) v(cVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            f fVar = new f(this.f231604e, this.f231605f, this.f231606g, this.f231607h, eVar);
            fVar.f231603d = obj;
            return fVar;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class g extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f231608d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f231609e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f231610f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f231611g;

        g(tq.e<? super g> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f231610f = obj;
            this.f231611g |= PKIFailureInfo.systemUnavail;
            return q0.n(null, 0L, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class h extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f231612d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f231613e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f231614f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f231615g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f231616h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f231617j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f231618k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f231619l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f231620m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f231621n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f231622p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f231623q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        boolean f231624r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        float f231625s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f231626t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f231627v;

        h(tq.e<? super h> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f231626t = obj;
            this.f231627v |= PKIFailureInfo.systemUnavail;
            return q0.q(null, null, null, null, null, null, null, null, this);
        }
    }

    static {
        float fN = c5.h.n((float) 0.125d);
        f231567a = fN;
        float fN2 = c5.h.n(18);
        f231568b = fN2;
        f231569c = fN / fN2;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x007d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0091 A[LOOP:0: B:23:0x007b->B:27:0x0091, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x0095 A[EDGE_INSN: B:54:0x0095->B:29:0x0095 BREAK  A[LOOP:0: B:23:0x007b->B:27:0x0091], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0067 -> B:22:0x006c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object e(a4.c r17, long r18, tq.e<? super a4.PointerInputChange> r20) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p143z0.q0.e(a4.c, long, tq.e):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [fr.p0] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r11v3, types: [T, a4.b0, java.lang.Object] */
    public static final Object f(a4.c cVar, long j15, tq.e<? super PointerInputChange> eVar) {
        b bVar;
        PointerInputChange pointerInputChange;
        l0 l0Var;
        Object obj;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f231578h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f231578h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object obj2 = bVar.f231577g;
        Object objE = uq.b.e();
        int i16 = bVar.f231578h;
        try {
            if (i16 == 0) {
                u.b(obj2);
                if (o(cVar.A1(), j15)) {
                    return null;
                }
                List<PointerInputChange> listC = cVar.A1().c();
                int size = listC.size();
                int i17 = 0;
                while (true) {
                    if (i17 >= size) {
                        pointerInputChange = null;
                        break;
                    }
                    pointerInputChange = listC.get(i17);
                    if (a0.b(pointerInputChange.getId(), j15)) {
                        break;
                    }
                    i17++;
                }
                PointerInputChange pointerInputChange2 = pointerInputChange;
                if (pointerInputChange2 == 0) {
                    return null;
                }
                p0 p0Var = new p0();
                p0 p0Var2 = new p0();
                p0Var2.f66410a = pointerInputChange2;
                long jC = cVar.getViewConfiguration().c();
                l0 l0Var2 = new l0();
                c cVar2 = new c(l0Var2, p0Var2, p0Var, null);
                bVar.f231574d = pointerInputChange2;
                bVar.f231575e = p0Var;
                bVar.f231576f = l0Var2;
                bVar.f231578h = 1;
                if (cVar.s2(jC, cVar2, bVar) == objE) {
                    return objE;
                }
                l0Var = l0Var2;
                j15 = p0Var;
                obj = pointerInputChange2;
            } else {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                l0Var = (l0) bVar.f231576f;
                p0 p0Var3 = (p0) bVar.f231575e;
                PointerInputChange pointerInputChange3 = (PointerInputChange) bVar.f231574d;
                u.b(obj2);
                j15 = p0Var3;
                obj = pointerInputChange3;
            }
            if (!l0Var.f66404a) {
                return null;
            }
            PointerInputChange pointerInputChange4 = (PointerInputChange) j15.f66410a;
            return pointerInputChange4 == null ? obj : pointerInputChange4;
        } catch (r unused) {
            PointerInputChange pointerInputChange5 = (PointerInputChange) j15.f66410a;
            return pointerInputChange5 == null ? obj : pointerInputChange5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:29:0x00e9 A[LOOP:0: B:25:0x00d0->B:29:0x00e9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:67:0x00ef A[EDGE_INSN: B:67:0x00ef->B:31:0x00ef BREAK  A[LOOP:0: B:25:0x00d0->B:29:0x00e9], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x017e -> B:61:0x0183). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object g(a4.c r18, long r19, er.p<? super a4.PointerInputChange, ? super m3.e, oq.i0> r21, tq.e<? super a4.PointerInputChange> r22) {
        /*
            Method dump skipped, instruction units count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p143z0.q0.g(a4.c, long, er.p, tq.e):java.lang.Object");
    }

    public static final Object h(k0 k0Var, final l<? super m3.e, i0> lVar, final er.a<i0> aVar, er.a<i0> aVar2, p<? super PointerInputChange, ? super m3.e, i0> pVar, tq.e<? super i0> eVar) {
        Object objI = i(k0Var, null, new q() { // from class: z0.n0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return q0.j(lVar, (PointerInputChange) obj, (PointerInputChange) obj2, (e) obj3);
            }
        }, new l() { // from class: z0.o0
            @Override // er.l
            public final Object b(Object obj) {
                return q0.k(aVar, (PointerInputChange) obj);
            }
        }, aVar2, new er.a() { // from class: z0.p0
            @Override // er.a
            public final Object a() {
                return Boolean.valueOf(q0.l());
            }
        }, pVar, eVar);
        return objI == uq.b.e() ? objI : i0.f148189a;
    }

    public static final Object i(k0 k0Var, a2 a2Var, q<? super PointerInputChange, ? super PointerInputChange, ? super m3.e, i0> qVar, l<? super PointerInputChange, i0> lVar, er.a<i0> aVar, er.a<Boolean> aVar2, p<? super PointerInputChange, ? super m3.e, i0> pVar, tq.e<? super i0> eVar) {
        Object objD = g1.d(k0Var, new e(aVar2, a2Var, qVar, pVar, aVar, lVar, null), eVar);
        return objD == uq.b.e() ? objD : i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(l lVar, PointerInputChange pointerInputChange, PointerInputChange pointerInputChange2, m3.e eVar) {
        lVar.b(m3.e.d(pointerInputChange2.getPosition()));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(er.a aVar, PointerInputChange pointerInputChange) {
        aVar.a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean l() {
        return true;
    }

    public static final Object m(k0 k0Var, l<? super m3.e, i0> lVar, er.a<i0> aVar, er.a<i0> aVar2, p<? super PointerInputChange, ? super m3.e, i0> pVar, tq.e<? super i0> eVar) {
        Object objD = g1.d(k0Var, new f(lVar, aVar, aVar2, pVar, null), eVar);
        return objD == uq.b.e() ? objD : i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x0055  */
    /* JADX WARN: Code duplicated, block: B:24:0x005b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0060  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0048 -> B:18:0x004b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object n(a4.c r4, long r5, er.l<? super a4.PointerInputChange, oq.i0> r7, tq.e<? super java.lang.Boolean> r8) {
        /*
            boolean r0 = r8 instanceof z0.q0.g
            if (r0 == 0) goto L13
            r0 = r8
            z0.q0$g r0 = (z0.q0.g) r0
            int r1 = r0.f231611g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f231611g = r1
            goto L18
        L13:
            z0.q0$g r0 = new z0.q0$g
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f231610f
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f231611g
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f231609e
            er.l r4 = (er.l) r4
            java.lang.Object r5 = r0.f231608d
            a4.c r5 = (a4.c) r5
            oq.u.b(r8)
            r7 = r4
            r4 = r5
            goto L4b
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            oq.u.b(r8)
        L3e:
            r0.f231608d = r4
            r0.f231609e = r7
            r0.f231611g = r3
            java.lang.Object r8 = e(r4, r5, r0)
            if (r8 != r1) goto L4b
            return r1
        L4b:
            a4.b0 r8 = (a4.PointerInputChange) r8
            if (r8 != 0) goto L55
            r4 = 0
            java.lang.Boolean r4 = vq.b.a(r4)
            return r4
        L55:
            boolean r5 = a4.p.d(r8)
            if (r5 == 0) goto L60
            java.lang.Boolean r4 = vq.b.a(r3)
            return r4
        L60:
            r7.b(r8)
            long r5 = r8.getId()
            goto L3e
        */
        throw new UnsupportedOperationException("Method not decompiled: p143z0.q0.n(a4.c, long, er.l, tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean o(o oVar, long j15) {
        PointerInputChange pointerInputChange;
        List<PointerInputChange> listC = oVar.c();
        int size = listC.size();
        boolean z15 = false;
        int i15 = 0;
        while (true) {
            if (i15 >= size) {
                pointerInputChange = null;
                break;
            }
            pointerInputChange = listC.get(i15);
            if (a0.b(pointerInputChange.getId(), j15)) {
                break;
            }
            i15++;
        }
        PointerInputChange pointerInputChange2 = pointerInputChange;
        if (pointerInputChange2 != null && pointerInputChange2.getPressed()) {
            z15 = true;
        }
        return true ^ z15;
    }

    public static final float p(f3 f3Var, int i15) {
        return a4.p0.i(i15, a4.p0.INSTANCE.b()) ? f3Var.g() * f231569c : f3Var.g();
    }

    /* JADX WARN: Code duplicated, block: B:239:0x02d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:42:0x02da A[LOOP:8: B:38:0x02b9->B:42:0x02da, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:101:0x0447 -> B:91:0x03ed). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:115:0x049b -> B:116:0x04a3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:159:0x05fd -> B:160:0x0605). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:166:0x0624 -> B:85:0x03c4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:174:0x068a -> B:176:0x068d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0256 -> B:78:0x03a9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x02ec -> B:47:0x02f0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x0359 -> B:78:0x03a9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x039e -> B:75:0x03a0). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object q(a4.c r27, a4.PointerInputChange r28, er.a<java.lang.Boolean> r29, p143z0.a2 r30, er.q<? super a4.PointerInputChange, ? super a4.PointerInputChange, ? super m3.e, oq.i0> r31, er.p<? super a4.PointerInputChange, ? super m3.e, oq.i0> r32, er.a<oq.i0> r33, er.l<? super a4.PointerInputChange, oq.i0> r34, tq.e<? super oq.i0> r35) {
        /*
            Method dump skipped, instruction units count: 1882
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p143z0.q0.q(a4.c, a4.b0, er.a, z0.a2, er.q, er.p, er.a, er.l, tq.e):java.lang.Object");
    }
}
