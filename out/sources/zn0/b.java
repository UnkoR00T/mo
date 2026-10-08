package zn0;

import dx.i;
import er.l;
import ge4.x;
import oq.i0;
import oq.k;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.w;
import pl.gov.coi.common.network.y;
import un0.AvailableElectionSupports;
import un0.ElectionActionEligibility;
import un0.ElectionSupportsHistory;
import vq.j;
import yn0.AvailableElectionSupportsRequest;
import yn0.AvailableElectionSupportsResponse;
import yn0.ElectionActionEligibilityResponse;
import yn0.ElectionSupportsHistoryRequest;
import yn0.ElectionSupportsHistoryResponse;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0096@¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000f0\b2\u0006\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00130\b2\u0006\u0010\u000e\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0014\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001a\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lzn0/b;", "Lco0/a;", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "<init>", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;)V", "Ldx/i;", "Ldx/b;", "Lun0/c;", "b", "(Ltq/e;)Ljava/lang/Object;", "Lbo0/a;", "request", "Lun0/b;", "c", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lbo0/b;", "Lun0/k;", "a", "Lpl/gov/coi/common/network/g0;", "Lwn0/a;", "Loq/k;", "g", "()Lwn0/a;", "client", "electoralsupportservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements co0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g0 networkCallMediator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k client;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f235684d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f235685e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f235687g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f235685e = obj;
            this.f235687g |= PKIFailureInfo.systemUnavail;
            return b.this.c(null, this);
        }
    }

    /* JADX INFO: renamed from: zn0.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lyn0/b;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class C6363b extends vq.k implements l<tq.e<? super x<AvailableElectionSupportsResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f235688e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f235690g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C6363b(String str, tq.e<? super C6363b> eVar) {
            super(1, eVar);
            this.f235690g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f235688e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            wn0.a aVarG = b.this.g();
            AvailableElectionSupportsRequest availableElectionSupportsRequestP = xn0.a.p(this.f235690g);
            this.f235688e = 1;
            Object objA = aVarG.a(availableElectionSupportsRequestP, this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return b.this.new C6363b(this.f235690g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<AvailableElectionSupportsResponse>> eVar) {
            return ((C6363b) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f235691d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f235693f;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f235691d = obj;
            this.f235693f |= PKIFailureInfo.systemUnavail;
            return b.this.b(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lyn0/d;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements l<tq.e<? super x<ElectionActionEligibilityResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f235694e;

        d(tq.e<? super d> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f235694e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            wn0.a aVarG = b.this.g();
            this.f235694e = 1;
            Object objC = aVarG.c(this);
            return objC == objE ? objE : objC;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return b.this.new d(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<ElectionActionEligibilityResponse>> eVar) {
            return ((d) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f235696d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f235697e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f235699g;

        e(tq.e<? super e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f235697e = obj;
            this.f235699g |= PKIFailureInfo.systemUnavail;
            return b.this.a(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lyn0/n;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements l<tq.e<? super x<ElectionSupportsHistoryResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f235700e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f235702g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, tq.e<? super f> eVar) {
            super(1, eVar);
            this.f235702g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f235700e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            wn0.a aVarG = b.this.g();
            ElectionSupportsHistoryRequest electionSupportsHistoryRequestQ = xn0.a.q(this.f235702g);
            this.f235700e = 1;
            Object objB = aVarG.b(electionSupportsHistoryRequestQ, this);
            return objB == objE ? objE : objB;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return b.this.new f(this.f235702g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<ElectionSupportsHistoryResponse>> eVar) {
            return ((f) M(eVar)).J(i0.f148189a);
        }
    }

    public b(final w wVar, g0 g0Var) {
        this.networkCallMediator = g0Var;
        this.client = oq.l.a(new er.a() { // from class: zn0.a
            @Override // er.a
            public final Object a() {
                return b.f(wVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wn0.a f(w wVar) {
        return (wn0.a) wVar.a(new y.Backend(null, 1, null), wn0.a.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final wn0.a g() {
        return (wn0.a) this.client.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // co0.a
    public Object a(String str, tq.e<? super i<? extends dx.b, ElectionSupportsHistory>> eVar) throws Throwable {
        e eVar2;
        if (eVar instanceof e) {
            eVar2 = (e) eVar;
            int i15 = eVar2.f235699g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                eVar2.f235699g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                eVar2 = new e(eVar);
            }
        } else {
            eVar2 = new e(eVar);
        }
        Object objB = eVar2.f235697e;
        Object objE = uq.b.e();
        int i16 = eVar2.f235699g;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            f fVar = new f(str, null);
            eVar2.f235696d = j.a(str);
            eVar2.f235699g = 1;
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
        i iVar = (i) objB;
        if (iVar instanceof i.Left) {
            return iVar;
        }
        if (iVar instanceof i.Right) {
            return new i.Right(xn0.a.k((ElectionSupportsHistoryResponse) ((i.Right) iVar).b()));
        }
        throw new p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // co0.a
    public Object b(tq.e<? super i<? extends dx.b, ElectionActionEligibility>> eVar) throws Throwable {
        c cVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f235693f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f235693f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objB = cVar.f235691d;
        Object objE = uq.b.e();
        int i16 = cVar.f235693f;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            d dVar = new d(null);
            cVar.f235693f = 1;
            objB = g0Var.b(dVar, cVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objB);
        }
        i iVar = (i) objB;
        if (iVar instanceof i.Left) {
            return iVar;
        }
        if (iVar instanceof i.Right) {
            return new i.Right(xn0.a.c((ElectionActionEligibilityResponse) ((i.Right) iVar).b()));
        }
        throw new p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // co0.a
    public Object c(String str, tq.e<? super i<? extends dx.b, AvailableElectionSupports>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f235687g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f235687g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objB = aVar.f235685e;
        Object objE = uq.b.e();
        int i16 = aVar.f235687g;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            C6363b c6363b = new C6363b(str, null);
            aVar.f235684d = j.a(str);
            aVar.f235687g = 1;
            objB = g0Var.b(c6363b, aVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objB);
        }
        i iVar = (i) objB;
        if (iVar instanceof i.Left) {
            return iVar;
        }
        if (iVar instanceof i.Right) {
            return new i.Right(xn0.a.b((AvailableElectionSupportsResponse) ((i.Right) iVar).b()));
        }
        throw new p();
    }
}
