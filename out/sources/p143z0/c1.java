package p143z0;

import c5.y;
import er.l;
import er.p;
import er.q;
import fr.t;
import ju.p0;
import ju.r0;
import m3.e;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;
import vq.k;
import w0.z1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0001\u0018\u00002\u00020\u0001B¡\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012(\u0010\u0014\u001a$\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u000e\u0012(\u0010\u0016\u001a$\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u000e\u0012\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001b\u001a\u00020\u001a*\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u0010*\u00020\u0010H\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ@\u0010!\u001a\u00020\u00122.\u0010 \u001a*\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00120\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u001eH\u0096@¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u0010H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\u00122\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0006H\u0016¢\u0006\u0004\b*\u0010+J§\u0001\u0010,\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u00062(\u0010\u0014\u001a$\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u000e2(\u0010\u0016\u001a$\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u000e2\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b,\u0010\u0019R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u0010\r\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00101R8\u0010\u0014\u001a$\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R8\u0010\u0016\u001a$\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00103R\u0016\u0010\u0017\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00101¨\u00066"}, d2 = {"Lz0/c1;", "Lz0/t0;", "Lz0/d1;", "state", "Lkotlin/Function1;", "La4/p0;", "", "canDrag", "Lz0/a2;", "orientation", "enabled", "Lb1/l;", "interactionSource", "startDragImmediately", "Lkotlin/Function3;", "Lju/p0;", "Lm3/e;", "Ltq/e;", "Loq/i0;", "", "onDragStarted", "", "onDragStopped", "reverseDirection", "<init>", "(Lz0/d1;Ler/l;Lz0/a2;ZLb1/l;ZLer/q;Ler/q;Z)V", "Lc5/y;", "r4", "(J)J", "s4", "Lkotlin/Function2;", "Lz0/m0$b;", "forEachDelta", "A3", "(Ler/p;Ltq/e;)Ljava/lang/Object;", "startedPosition", "Q3", "(J)V", "Lz0/m0$d;", "event", "R3", "(Lz0/m0$d;)V", "i4", "()Z", "t4", "X", "Lz0/d1;", "Y", "Lz0/a2;", "Z", "h0", "Ler/q;", "q0", "r0", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c1 extends t0 {

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    private d1 state;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    private a2 orientation;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    private boolean startDragImmediately;

    /* JADX INFO: renamed from: h0, reason: collision with root package name and from kotlin metadata */
    private q<? super p0, ? super e, ? super tq.e<? super i0>, ? extends Object> onDragStarted;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    private q<? super p0, ? super Float, ? super tq.e<? super i0>, ? extends Object> onDragStopped;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    private boolean reverseDirection;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz0/u0;", "Loq/i0;", "<anonymous>", "(Lz0/u0;)V"}, k = 3, mv = {2, 1, 0})
    static final class a extends k implements p<u0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f231190e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f231191f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ p<l<? super m0.b, i0>, tq.e<? super i0>, Object> f231192g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ c1 f231193h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(p<? super l<? super m0.b, i0>, ? super tq.e<? super i0>, ? extends Object> pVar, c1 c1Var, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f231192g = pVar;
            this.f231193h = c1Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(u0 u0Var, c1 c1Var, m0.b bVar) {
            u0Var.a(Function1.j(c1Var.s4(bVar.getDelta()), c1Var.orientation));
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f231190e;
            if (i15 == 0) {
                u.b(obj);
                final u0 u0Var = (u0) this.f231191f;
                p<l<? super m0.b, i0>, tq.e<? super i0>, Object> pVar = this.f231192g;
                final c1 c1Var = this.f231193h;
                l<? super m0.b, i0> lVar = new l() { // from class: z0.b1
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return c1.a.O(u0Var, c1Var, (m0.b) obj2);
                    }
                };
                this.f231190e = 1;
                if (pVar.B(lVar, this) == objE) {
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
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(u0 u0Var, tq.e<? super i0> eVar) {
            return ((a) v(u0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            a aVar = new a(this.f231192g, this.f231193h, eVar);
            aVar.f231191f = obj;
            return aVar;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class b extends k implements p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f231194e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f231195f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f231197h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(long j15, tq.e<? super b> eVar) {
            super(2, eVar);
            this.f231197h = j15;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f231194e;
            if (i15 == 0) {
                u.b(obj);
                p0 p0Var = (p0) this.f231195f;
                q qVar = c1.this.onDragStarted;
                e eVarD = e.d(this.f231197h);
                this.f231194e = 1;
                if (qVar.w(p0Var, eVarD, this) == objE) {
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
            b bVar = c1.this.new b(this.f231197h, eVar);
            bVar.f231195f = obj;
            return bVar;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class c extends k implements p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f231198e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f231199f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ m0.d f231201h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(m0.d dVar, tq.e<? super c> eVar) {
            super(2, eVar);
            this.f231201h = dVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f231198e;
            if (i15 == 0) {
                u.b(obj);
                p0 p0Var = (p0) this.f231199f;
                q qVar = c1.this.onDragStopped;
                Float fD = vq.b.d(Function1.k(c1.this.r4(this.f231201h.getVelocity()), c1.this.orientation));
                this.f231198e = 1;
                if (qVar.w(p0Var, fD, this) == objE) {
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
            return ((c) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            c cVar = c1.this.new c(this.f231201h, eVar);
            cVar.f231199f = obj;
            return cVar;
        }
    }

    public c1(d1 d1Var, l<? super a4.p0, Boolean> lVar, a2 a2Var, boolean z15, b1.l lVar2, boolean z16, q<? super p0, ? super e, ? super tq.e<? super i0>, ? extends Object> qVar, q<? super p0, ? super Float, ? super tq.e<? super i0>, ? extends Object> qVar2, boolean z17) {
        super(lVar, z15, lVar2, a2Var);
        this.state = d1Var;
        this.orientation = a2Var;
        this.startDragImmediately = z16;
        this.onDragStarted = qVar;
        this.onDragStopped = qVar2;
        this.reverseDirection = z17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long r4(long j15) {
        return y.m(j15, this.reverseDirection ? -1.0f : 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long s4(long j15) {
        return e.r(j15, this.reverseDirection ? -1.0f : 1.0f);
    }

    @Override // p143z0.t0
    public Object A3(p<? super l<? super m0.b, i0>, ? super tq.e<? super i0>, ? extends Object> pVar, tq.e<? super i0> eVar) {
        Object objA = this.state.a(z1.UserInput, new a(pVar, this, null), eVar);
        return objA == uq.b.e() ? objA : i0.f148189a;
    }

    @Override // p143z0.t0
    public void Q3(long startedPosition) {
        if (!getIsAttached() || t.c(this.onDragStarted, Function1.f231010a)) {
            return;
        }
        ju.k.d(M2(), null, r0.UNDISPATCHED, new b(startedPosition, null), 1, null);
    }

    @Override // p143z0.t0
    public void R3(m0.d event) {
        if (!getIsAttached() || t.c(this.onDragStopped, Function1.f231011b)) {
            return;
        }
        ju.k.d(M2(), null, r0.UNDISPATCHED, new c(event, null), 1, null);
    }

    @Override // p143z0.t0
    /* JADX INFO: renamed from: i4, reason: from getter */
    public boolean getStartDragImmediately() {
        return this.startDragImmediately;
    }

    public final void t4(d1 state, l<? super a4.p0, Boolean> canDrag, a2 orientation, boolean enabled, b1.l interactionSource, boolean startDragImmediately, q<? super p0, ? super e, ? super tq.e<? super i0>, ? extends Object> onDragStarted, q<? super p0, ? super Float, ? super tq.e<? super i0>, ? extends Object> onDragStopped, boolean reverseDirection) {
        boolean z15;
        boolean z16 = true;
        if (t.c(this.state, state)) {
            z15 = false;
        } else {
            this.state = state;
            z15 = true;
        }
        if (this.orientation != orientation) {
            this.orientation = orientation;
            z15 = true;
        }
        if (this.reverseDirection != reverseDirection) {
            this.reverseDirection = reverseDirection;
        } else {
            z16 = z15;
        }
        this.onDragStarted = onDragStarted;
        this.onDragStopped = onDragStopped;
        this.startDragImmediately = startDragImmediately;
        k4(canDrag, enabled, interactionSource, orientation, z16);
    }
}
