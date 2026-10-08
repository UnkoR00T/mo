package vk0;

import dx.i;
import ge4.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import oq.i0;
import oq.k;
import oq.l;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.w;
import pq.v;
import tq.e;
import uk0.HydroWarningAreaDto;
import uk0.HydroWarningDto;
import xk0.BEHydroWarning;
import xk0.BEHydroWarningArea;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\bH\u0096@¢\u0006\u0004\b\f\u0010\rJ\"\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\n0\bH\u0096@¢\u0006\u0004\b\u000f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lvk0/b;", "Lyk0/a;", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "<init>", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;)V", "Ldx/i;", "Ldx/b;", "", "Lxk0/a;", "a", "(Ltq/e;)Ljava/lang/Object;", "Lxk0/b;", "b", "Lpl/gov/coi/common/network/w;", "Lpl/gov/coi/common/network/g0;", "Lsk0/a;", "c", "Loq/k;", "e", "()Lsk0/a;", "hydroWarningsApi", "disasteralertservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements yk0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final w httpServiceFactory;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final g0 networkCallMediator;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final k hydroWarningsApi = l.a(new er.a() { // from class: vk0.a
        @Override // er.a
        public final Object a() {
            return b.f(this.f207157a);
        }
    });

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f207161d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f207163f;

        a(e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f207161d = obj;
            this.f207163f |= PKIFailureInfo.systemUnavail;
            return b.this.b(this);
        }
    }

    /* JADX INFO: renamed from: vk0.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lge4/x;", "", "Luk0/a;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class C5422b extends vq.k implements er.l<e<? super x<List<? extends HydroWarningAreaDto>>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f207164e;

        C5422b(e<? super C5422b> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f207164e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            sk0.a aVarE = b.this.e();
            this.f207164e = 1;
            Object objB = aVarE.b(this);
            return objB == objE ? objE : objB;
        }

        public final e<i0> M(e<?> eVar) {
            return b.this.new C5422b(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(e<? super x<List<HydroWarningAreaDto>>> eVar) {
            return ((C5422b) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f207166d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f207168f;

        c(e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f207166d = obj;
            this.f207168f |= PKIFailureInfo.systemUnavail;
            return b.this.a(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lge4/x;", "", "Luk0/b;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.l<e<? super x<List<? extends HydroWarningDto>>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f207169e;

        d(e<? super d> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f207169e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            sk0.a aVarE = b.this.e();
            this.f207169e = 1;
            Object objA = aVarE.a(this);
            return objA == objE ? objE : objA;
        }

        public final e<i0> M(e<?> eVar) {
            return b.this.new d(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(e<? super x<List<HydroWarningDto>>> eVar) {
            return ((d) M(eVar)).J(i0.f148189a);
        }
    }

    public b(w wVar, g0 g0Var) {
        this.httpServiceFactory = wVar;
        this.networkCallMediator = g0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final sk0.a e() {
        return (sk0.a) this.hydroWarningsApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final sk0.a f(b bVar) {
        return (sk0.a) w.b(bVar.httpServiceFactory, null, sk0.a.class, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // yk0.a
    public Object a(e<? super i<? extends dx.b, ? extends List<BEHydroWarning>>> eVar) throws Throwable {
        c cVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f207168f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f207168f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objB = cVar.f207166d;
        Object objE = uq.b.e();
        int i16 = cVar.f207168f;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            d dVar = new d(null);
            cVar.f207168f = 1;
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
        if (!(iVar instanceof i.Right)) {
            throw new p();
        }
        List list = (List) ((i.Right) iVar).b();
        ArrayList arrayList = new ArrayList(v.y(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(tk0.a.a((HydroWarningDto) it.next()));
        }
        return new i.Right(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // yk0.a
    public Object b(e<? super i<? extends dx.b, ? extends List<BEHydroWarningArea>>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f207163f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f207163f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objB = aVar.f207161d;
        Object objE = uq.b.e();
        int i16 = aVar.f207163f;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            C5422b c5422b = new C5422b(null);
            aVar.f207163f = 1;
            objB = g0Var.b(c5422b, aVar);
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
        if (!(iVar instanceof i.Right)) {
            throw new p();
        }
        List list = (List) ((i.Right) iVar).b();
        ArrayList arrayList = new ArrayList(v.y(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(tk0.a.b((HydroWarningAreaDto) it.next()));
        }
        return new i.Right(arrayList);
    }
}
