package dk0;

import ck0.OrderApplicationRequest;
import ck0.OrderApplicationResponse;
import fk0.BEOrderApplicationResponse;
import ge4.x;
import oq.i0;
import oq.k;
import oq.l;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.w;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000f\u0010\u000eJ$\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0012R\u001b\u0010\u0017\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Ldk0/d;", "Lgk0/b;", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "<init>", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;)V", "", "cmsSignedData", "Ldx/i;", "Ldx/b;", "Lfk0/z0;", "b", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "a", "c", "Lpl/gov/coi/common/network/w;", "Lpl/gov/coi/common/network/g0;", "Lak0/c;", "Loq/k;", "g", "()Lak0/c;", "companyOrderApplicationControllerApi", "companyservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements gk0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final w httpServiceFactory;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final g0 networkCallMediator;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final k companyOrderApplicationControllerApi = l.a(new er.a() { // from class: dk0.c
        @Override // er.a
        public final Object a() {
            return d.f(this.f43039a);
        }
    });

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f43043d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f43044e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f43046g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f43044e = obj;
            this.f43046g |= PKIFailureInfo.systemUnavail;
            return d.this.b(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lck0/j1;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.l<tq.e<? super x<OrderApplicationResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f43047e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f43049g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, tq.e<? super b> eVar) {
            super(1, eVar);
            this.f43049g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f43047e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            ak0.c cVarG = d.this.g();
            OrderApplicationRequest orderApplicationRequestM0 = bk0.a.m0(this.f43049g);
            this.f43047e = 1;
            Object objA = cVarG.a(orderApplicationRequestM0, this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return d.this.new b(this.f43049g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<OrderApplicationResponse>> eVar) {
            return ((b) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f43050d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f43051e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f43053g;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f43051e = obj;
            this.f43053g |= PKIFailureInfo.systemUnavail;
            return d.this.a(null, this);
        }
    }

    /* JADX INFO: renamed from: dk0.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lck0/j1;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class C0952d extends vq.k implements er.l<tq.e<? super x<OrderApplicationResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f43054e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f43056g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0952d(String str, tq.e<? super C0952d> eVar) {
            super(1, eVar);
            this.f43056g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f43054e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            ak0.c cVarG = d.this.g();
            OrderApplicationRequest orderApplicationRequestM0 = bk0.a.m0(this.f43056g);
            this.f43054e = 1;
            Object objC = cVarG.c(orderApplicationRequestM0, this);
            return objC == objE ? objE : objC;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return d.this.new C0952d(this.f43056g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<OrderApplicationResponse>> eVar) {
            return ((C0952d) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f43057d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f43058e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f43060g;

        e(tq.e<? super e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f43058e = obj;
            this.f43060g |= PKIFailureInfo.systemUnavail;
            return d.this.c(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lck0/j1;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.l<tq.e<? super x<OrderApplicationResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f43061e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f43063g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, tq.e<? super f> eVar) {
            super(1, eVar);
            this.f43063g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f43061e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            ak0.c cVarG = d.this.g();
            OrderApplicationRequest orderApplicationRequestM0 = bk0.a.m0(this.f43063g);
            this.f43061e = 1;
            Object objB = cVarG.b(orderApplicationRequestM0, this);
            return objB == objE ? objE : objB;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return d.this.new f(this.f43063g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<OrderApplicationResponse>> eVar) {
            return ((f) M(eVar)).J(i0.f148189a);
        }
    }

    public d(w wVar, g0 g0Var) {
        this.httpServiceFactory = wVar;
        this.networkCallMediator = g0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ak0.c f(d dVar) {
        return (ak0.c) w.b(dVar.httpServiceFactory, null, ak0.c.class, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ak0.c g() {
        return (ak0.c) this.companyOrderApplicationControllerApi.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gk0.b
    public Object a(String str, tq.e<? super dx.i<? extends dx.b, BEOrderApplicationResponse>> eVar) throws Throwable {
        c cVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f43053g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f43053g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objB = cVar.f43051e;
        Object objE = uq.b.e();
        int i16 = cVar.f43053g;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            C0952d c0952d = new C0952d(str, null);
            cVar.f43050d = vq.j.a(str);
            cVar.f43053g = 1;
            objB = g0Var.b(c0952d, cVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objB);
        }
        dx.i iVar = (dx.i) objB;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return new dx.i.Right(bk0.a.A((OrderApplicationResponse) ((dx.i.Right) iVar).b()));
        }
        throw new p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gk0.b
    public Object b(String str, tq.e<? super dx.i<? extends dx.b, BEOrderApplicationResponse>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f43046g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f43046g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objB = aVar.f43044e;
        Object objE = uq.b.e();
        int i16 = aVar.f43046g;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            b bVar = new b(str, null);
            aVar.f43043d = vq.j.a(str);
            aVar.f43046g = 1;
            objB = g0Var.b(bVar, aVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objB);
        }
        dx.i iVar = (dx.i) objB;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return new dx.i.Right(bk0.a.A((OrderApplicationResponse) ((dx.i.Right) iVar).b()));
        }
        throw new p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gk0.b
    public Object c(String str, tq.e<? super dx.i<? extends dx.b, BEOrderApplicationResponse>> eVar) throws Throwable {
        e eVar2;
        if (eVar instanceof e) {
            eVar2 = (e) eVar;
            int i15 = eVar2.f43060g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                eVar2.f43060g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                eVar2 = new e(eVar);
            }
        } else {
            eVar2 = new e(eVar);
        }
        Object objB = eVar2.f43058e;
        Object objE = uq.b.e();
        int i16 = eVar2.f43060g;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            f fVar = new f(str, null);
            eVar2.f43057d = vq.j.a(str);
            eVar2.f43060g = 1;
            objB = g0Var.b(fVar, eVar2);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objB);
        }
        dx.i iVar = (dx.i) objB;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return new dx.i.Right(bk0.a.A((OrderApplicationResponse) ((dx.i.Right) iVar).b()));
        }
        throw new p();
    }
}
