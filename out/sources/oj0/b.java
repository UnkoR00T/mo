package oj0;

import ge4.x;
import nj0.MyCaseAdditionalDataDto;
import nj0.MyCasesResponseDto;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.w;
import vi0.MyCaseAdditionalData;
import vi0.MyCasesPage;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00100\n2\u0006\u0010\u000f\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u0011\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0017\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Loj0/b;", "Lrj0/a;", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "<init>", "(Lpl/gov/coi/common/network/g0;Lpl/gov/coi/common/network/w;)V", "", "pageId", "Ldx/i;", "Ldx/b;", "Lvi0/d;", "b", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "caseId", "Lvi0/c;", "a", "Lpl/gov/coi/common/network/g0;", "Llj0/e;", "Loq/k;", "f", "()Llj0/e;", "client", "citizenservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements rj0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g0 networkCallMediator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final oq.k client;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f146091d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f146092e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f146094g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f146092e = obj;
            this.f146094g |= PKIFailureInfo.systemUnavail;
            return b.this.a(null, this);
        }
    }

    /* JADX INFO: renamed from: oj0.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lnj0/c0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class C3634b extends vq.k implements er.l<tq.e<? super x<MyCaseAdditionalDataDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f146095e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f146097g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3634b(String str, tq.e<? super C3634b> eVar) {
            super(1, eVar);
            this.f146097g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f146095e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            lj0.e eVarF = b.this.f();
            String str = this.f146097g;
            this.f146095e = 1;
            Object objB = eVarF.b(str, this);
            return objB == objE ? objE : objB;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return b.this.new C3634b(this.f146097g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<MyCaseAdditionalDataDto>> eVar) {
            return ((C3634b) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f146098d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f146099e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f146101g;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f146099e = obj;
            this.f146101g |= PKIFailureInfo.systemUnavail;
            return b.this.b(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lnj0/e0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.l<tq.e<? super x<MyCasesResponseDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f146102e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f146104g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, tq.e<? super d> eVar) {
            super(1, eVar);
            this.f146104g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f146102e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            lj0.e eVarF = b.this.f();
            String str = this.f146104g;
            this.f146102e = 1;
            Object objA = eVarF.a(str, this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return b.this.new d(this.f146104g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<MyCasesResponseDto>> eVar) {
            return ((d) M(eVar)).J(i0.f148189a);
        }
    }

    public b(g0 g0Var, final w wVar) {
        this.networkCallMediator = g0Var;
        this.client = oq.l.a(new er.a() { // from class: oj0.a
            @Override // er.a
            public final Object a() {
                return b.e(wVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final lj0.e e(w wVar) {
        return (lj0.e) w.b(wVar, null, lj0.e.class, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final lj0.e f() {
        return (lj0.e) this.client.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // rj0.a
    public Object a(String str, tq.e<? super dx.i<? extends dx.b, MyCaseAdditionalData>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f146094g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f146094g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objB = aVar.f146092e;
        Object objE = uq.b.e();
        int i16 = aVar.f146094g;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            C3634b c3634b = new C3634b(str, null);
            aVar.f146091d = vq.j.a(str);
            aVar.f146094g = 1;
            objB = g0Var.b(c3634b, aVar);
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
            return new dx.i.Right(mj0.a.d((MyCaseAdditionalDataDto) ((dx.i.Right) iVar).b()));
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // rj0.a
    public Object b(String str, tq.e<? super dx.i<? extends dx.b, MyCasesPage>> eVar) throws Throwable {
        c cVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f146101g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f146101g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objB = cVar.f146099e;
        Object objE = uq.b.e();
        int i16 = cVar.f146101g;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            d dVar = new d(str, null);
            cVar.f146098d = vq.j.a(str);
            cVar.f146101g = 1;
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
        dx.i iVar = (dx.i) objB;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return new dx.i.Right(mj0.a.e((MyCasesResponseDto) ((dx.i.Right) iVar).b()));
        }
        throw new oq.p();
    }
}
