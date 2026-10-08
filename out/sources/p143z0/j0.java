package p143z0;

import er.l;
import er.p;
import ju.p0;
import ju.q0;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;
import p076m2.a3;
import p076m2.c6;
import tq.e;
import vq.k;
import w0.b2;
import w0.z1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J<\u0010\u000f\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\"\u0010\u000e\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\tH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R#\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010!R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010!R\u0014\u0010'\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010&¨\u0006("}, d2 = {"Lz0/j0;", "Lz0/v2;", "Lkotlin/Function1;", "", "onDelta", "<init>", "(Ler/l;)V", "Lw0/z1;", "scrollPriority", "Lkotlin/Function2;", "Lz0/h2;", "Ltq/e;", "Loq/i0;", "", "block", "b", "(Lw0/z1;Ler/p;Ltq/e;)Ljava/lang/Object;", "delta", "f", "(F)F", "a", "Ler/l;", "l", "()Ler/l;", "Lz0/h2;", "scrollScope", "Lw0/b2;", "c", "Lw0/b2;", "scrollMutex", "Lm2/a3;", "", "d", "Lm2/a3;", "isScrollingState", "e", "isLastScrollForwardState", "isLastScrollBackwardState", "()Z", "isScrollInProgress", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class j0 implements v2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l<Float, Float> onDelta;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h2 scrollScope = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final b2 scrollMutex = new b2();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final a3<Boolean> isScrollingState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final a3<Boolean> isLastScrollForwardState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final a3<Boolean> isLastScrollBackwardState;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class a extends k implements p<p0, e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f231388e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ z1 f231390g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ p<h2, e<? super i0>, Object> f231391h;

        /* JADX INFO: renamed from: z0.j0$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz0/h2;", "Loq/i0;", "<anonymous>", "(Lz0/h2;)V"}, k = 3, mv = {2, 1, 0})
        static final class C6221a extends k implements p<h2, e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f231392e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private /* synthetic */ Object f231393f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ j0 f231394g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ p<h2, e<? super i0>, Object> f231395h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C6221a(j0 j0Var, p<? super h2, ? super e<? super i0>, ? extends Object> pVar, e<? super C6221a> eVar) {
                super(2, eVar);
                this.f231394g = j0Var;
                this.f231395h = pVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f231392e;
                try {
                    if (i15 == 0) {
                        u.b(obj);
                        h2 h2Var = (h2) this.f231393f;
                        this.f231394g.isScrollingState.setValue(vq.b.a(true));
                        p<h2, e<? super i0>, Object> pVar = this.f231395h;
                        this.f231392e = 1;
                        if (pVar.B(h2Var, this) == objE) {
                            return objE;
                        }
                    } else {
                        if (i15 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        u.b(obj);
                    }
                    this.f231394g.isScrollingState.setValue(vq.b.a(false));
                    return i0.f148189a;
                } catch (Throwable th4) {
                    this.f231394g.isScrollingState.setValue(vq.b.a(false));
                    throw th4;
                }
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(h2 h2Var, e<? super i0> eVar) {
                return ((C6221a) v(h2Var, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final e<i0> v(Object obj, e<?> eVar) {
                C6221a c6221a = new C6221a(this.f231394g, this.f231395h, eVar);
                c6221a.f231393f = obj;
                return c6221a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(z1 z1Var, p<? super h2, ? super e<? super i0>, ? extends Object> pVar, e<? super a> eVar) {
            super(2, eVar);
            this.f231390g = z1Var;
            this.f231391h = pVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f231388e;
            if (i15 == 0) {
                u.b(obj);
                b2 b2Var = j0.this.scrollMutex;
                h2 h2Var = j0.this.scrollScope;
                z1 z1Var = this.f231390g;
                C6221a c6221a = new C6221a(j0.this, this.f231391h, null);
                this.f231388e = 1;
                if (b2Var.f(h2Var, z1Var, c6221a, this) == objE) {
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
        public final Object B(p0 p0Var, e<? super i0> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            return j0.this.new a(this.f231390g, this.f231391h, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"z0/j0$b", "Lz0/h2;", "", "pixels", "d", "(F)F", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements h2 {
        b() {
        }

        @Override // p143z0.h2
        public float d(float pixels) {
            if (Float.isNaN(pixels)) {
                return 0.0f;
            }
            float fFloatValue = j0.this.l().b(Float.valueOf(pixels)).floatValue();
            j0.this.isLastScrollForwardState.setValue(Boolean.valueOf(fFloatValue > 0.0f));
            j0.this.isLastScrollBackwardState.setValue(Boolean.valueOf(fFloatValue < 0.0f));
            return fFloatValue;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j0(l<? super Float, Float> lVar) {
        this.onDelta = lVar;
        Boolean bool = Boolean.FALSE;
        this.isScrollingState = c6.e(bool, null, 2, null);
        this.isLastScrollForwardState = c6.e(bool, null, 2, null);
        this.isLastScrollBackwardState = c6.e(bool, null, 2, null);
    }

    @Override // p143z0.v2
    public Object b(z1 z1Var, p<? super h2, ? super e<? super i0>, ? extends Object> pVar, e<? super i0> eVar) {
        Object objE = q0.e(new a(z1Var, pVar, null), eVar);
        return objE == uq.b.e() ? objE : i0.f148189a;
    }

    @Override // p143z0.v2
    public boolean c() {
        return this.isScrollingState.getValue().booleanValue();
    }

    @Override // p143z0.v2
    public float f(float delta) {
        return this.onDelta.b(Float.valueOf(delta)).floatValue();
    }

    public final l<Float, Float> l() {
        return this.onDelta;
    }
}
