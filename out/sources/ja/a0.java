package ja;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH\u0086@¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lja/a0;", "", "T", "Lju/p0;", "scope", "Lja/n0;", "parent", "Lja/a;", "tracker", "<init>", "(Lju/p0;Lja/n0;Lja/a;)V", "b", "()Lja/n0;", "Loq/i0;", "d", "(Ltq/e;)Ljava/lang/Object;", "a", "Lju/p0;", "getScope", "()Lju/p0;", "Lja/n0;", "getParent", "Lja/c;", "c", "Lja/c;", "accumulated", "Lja/a;", "e", "()Lja/a;", "paging-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class a0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ju.p0 scope;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final n0<T> parent;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final c<T> accumulated;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "Lmu/h;", "Lja/f0;", "Loq/i0;", "<anonymous>", "(Lmu/h;)V"}, k = 3, mv = {2, 0, 0})
    static final class a extends vq.k implements er.p<mu.h<? super f0<T>>, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f100563e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ a0<T> f100564f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(a0<T> a0Var, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f100564f = a0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            int i15 = this.f100563e;
            if (i15 == 0) {
                oq.u.b(obj);
                this.f100564f.e();
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(mu.h<? super f0<T>> hVar, tq.e<? super oq.i0> eVar) {
            return ((a) v(hVar, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return new a(this.f100564f, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "T", "Lmu/h;", "Lja/f0;", "", "it", "Loq/i0;", "<anonymous>", "(Lmu/h;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0})
    static final class b extends vq.k implements er.q<mu.h<? super f0<T>>, Throwable, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f100565e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ a0<T> f100566f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(a0<T> a0Var, tq.e<? super b> eVar) {
            super(3, eVar);
            this.f100566f = a0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            int i15 = this.f100565e;
            if (i15 == 0) {
                oq.u.b(obj);
                this.f100566f.e();
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(mu.h<? super f0<T>> hVar, Throwable th4, tq.e<? super oq.i0> eVar) {
            return new b(this.f100566f, eVar).J(oq.i0.f148189a);
        }
    }

    public a0(ju.p0 p0Var, n0<T> n0Var, ja.a aVar) {
        this.scope = p0Var;
        this.parent = n0Var;
        this.accumulated = new c<>(n0Var.d(), p0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0.b c(a0 a0Var) {
        return a0Var.accumulated.g();
    }

    public final n0<T> b() {
        return new n0<>(mu.i.R(mu.i.U(this.accumulated.h(), new a(this, null)), new b(this, null)), this.parent.getUiReceiver(), this.parent.getHintReceiver(), new er.a() { // from class: ja.z
            @Override // er.a
            public final Object a() {
                return a0.c(this.f101242a);
            }
        });
    }

    public final Object d(tq.e<? super oq.i0> eVar) {
        this.accumulated.f();
        return oq.i0.f148189a;
    }

    public final ja.a e() {
        return null;
    }
}
