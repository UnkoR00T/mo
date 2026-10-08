package c80;

import er.l;
import ge4.x;
import iy.b0;
import iy.c0;
import oq.i0;
import oq.k;
import oq.u;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.w;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0010R\u001b\u0010\u0015\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lc80/b;", "Le80/a;", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "<init>", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;)V", "Liy/b0;", "authToken", "Ldx/i;", "Ldx/b;", "Loq/i0;", "a", "(Liy/b0;Ltq/e;)Ljava/lang/Object;", "b", "Lpl/gov/coi/common/network/g0;", "Ldt3/b;", "Loq/k;", "f", "()Ldt3/b;", "client", "authenticationservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements e80.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g0 networkCallMediator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k client;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Loq/i0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements l<tq.e<? super x<i0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f24470e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ b0 f24472g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(b0 b0Var, tq.e<? super a> eVar) {
            super(1, eVar);
            this.f24472g = b0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f24470e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            dt3.b bVarF = b.this.f();
            String strE = c0.e(this.f24472g);
            this.f24470e = 1;
            Object objB = bVarF.b(strE, this);
            return objB == objE ? objE : objB;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return b.this.new a(this.f24472g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<i0>> eVar) {
            return ((a) M(eVar)).J(i0.f148189a);
        }
    }

    /* JADX INFO: renamed from: c80.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Loq/i0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class C0647b extends vq.k implements l<tq.e<? super x<i0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f24473e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ b0 f24475g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0647b(b0 b0Var, tq.e<? super C0647b> eVar) {
            super(1, eVar);
            this.f24475g = b0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f24473e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            dt3.b bVarF = b.this.f();
            String strE = c0.e(this.f24475g);
            this.f24473e = 1;
            Object objA = bVarF.a(strE, this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return b.this.new C0647b(this.f24475g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<i0>> eVar) {
            return ((C0647b) M(eVar)).J(i0.f148189a);
        }
    }

    public b(final w wVar, g0 g0Var) {
        this.networkCallMediator = g0Var;
        this.client = oq.l.a(new er.a() { // from class: c80.a
            @Override // er.a
            public final Object a() {
                return b.e(wVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dt3.b e(w wVar) {
        return (dt3.b) w.b(wVar, null, dt3.b.class, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dt3.b f() {
        return (dt3.b) this.client.getValue();
    }

    @Override // e80.a
    public Object a(b0 b0Var, tq.e<? super dx.i<? extends dx.b, i0>> eVar) {
        return this.networkCallMediator.b(new a(b0Var, null), eVar);
    }

    @Override // e80.a
    public Object b(b0 b0Var, tq.e<? super dx.i<? extends dx.b, i0>> eVar) {
        return this.networkCallMediator.b(new C0647b(b0Var, null), eVar);
    }
}
