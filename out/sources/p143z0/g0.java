package p143z0;

import er.l;
import er.p;
import ju.p0;
import ju.q0;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;
import tq.e;
import vq.k;
import w0.b2;
import w0.z1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J<\u0010\u000f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\"\u0010\u000e\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\nH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lz0/g0;", "Lz0/d1;", "Lkotlin/Function1;", "", "Loq/i0;", "onDelta", "<init>", "(Ler/l;)V", "Lw0/z1;", "dragPriority", "Lkotlin/Function2;", "Lz0/u0;", "Ltq/e;", "", "block", "a", "(Lw0/z1;Ler/p;Ltq/e;)Ljava/lang/Object;", "Ler/l;", "d", "()Ler/l;", "b", "Lz0/u0;", "dragScope", "Lw0/b2;", "c", "Lw0/b2;", "scrollMutex", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class g0 implements d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l<Float, i0> onDelta;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final u0 dragScope = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final b2 scrollMutex = new b2();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class a extends k implements p<p0, e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f231257e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ z1 f231259g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ p<u0, e<? super i0>, Object> f231260h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(z1 z1Var, p<? super u0, ? super e<? super i0>, ? extends Object> pVar, e<? super a> eVar) {
            super(2, eVar);
            this.f231259g = z1Var;
            this.f231260h = pVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f231257e;
            if (i15 == 0) {
                u.b(obj);
                b2 b2Var = g0.this.scrollMutex;
                u0 u0Var = g0.this.dragScope;
                z1 z1Var = this.f231259g;
                p<u0, e<? super i0>, Object> pVar = this.f231260h;
                this.f231257e = 1;
                if (b2Var.f(u0Var, z1Var, pVar, this) == objE) {
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
            return g0.this.new a(this.f231259g, this.f231260h, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"z0/g0$b", "Lz0/u0;", "", "pixels", "Loq/i0;", "a", "(F)V", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements u0 {
        b() {
        }

        @Override // p143z0.u0
        public void a(float pixels) {
            g0.this.d().b(Float.valueOf(pixels));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g0(l<? super Float, i0> lVar) {
        this.onDelta = lVar;
    }

    @Override // p143z0.d1
    public Object a(z1 z1Var, p<? super u0, ? super e<? super i0>, ? extends Object> pVar, e<? super i0> eVar) {
        Object objE = q0.e(new a(z1Var, pVar, null), eVar);
        return objE == uq.b.e() ? objE : i0.f148189a;
    }

    public final l<Float, i0> d() {
        return this.onDelta;
    }
}
