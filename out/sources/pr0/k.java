package pr0;

import er0.BEDocumentAndCertificateStatuses;
import ge4.x;
import java.util.Set;
import oq.i0;
import oq.p;
import oq.u;
import or0.DocumentAndCertificateStatusesDtoDto;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.w;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JN\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J$\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00150\u000f2\u0006\u0010\u0014\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018R\u001b\u0010\u001d\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lpr0/k;", "Lrr0/e;", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "<init>", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;)V", "", "", "documentIds", "serialNumbers", "vehicleIds", "", "hasVehiclesWithoutId", "Ldx/i;", "Ldx/b;", "Ler0/b;", "a", "(Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;ZLtq/e;)Ljava/lang/Object;", "documentId", "Loq/i0;", "b", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lpl/gov/coi/common/network/g0;", "Lmr0/e;", "Loq/k;", "f", "()Lmr0/e;", "client", "offlinedocumentsservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k implements rr0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g0 networkCallMediator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final oq.k client;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Loq/i0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.l<tq.e<? super x<i0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f162085e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f162087g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, tq.e<? super a> eVar) {
            super(1, eVar);
            this.f162087g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f162085e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            mr0.e eVarF = k.this.f();
            String str = this.f162087g;
            this.f162085e = 1;
            Object objB = eVarF.b(str, this);
            return objB == objE ? objE : objB;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return k.this.new a(this.f162087g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<i0>> eVar) {
            return ((a) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f162088d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f162089e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f162090f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f162091g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f162092h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f162094k;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f162092h = obj;
            this.f162094k |= PKIFailureInfo.systemUnavail;
            return k.this.a(null, null, null, false, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lor0/l;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.l<tq.e<? super x<DocumentAndCertificateStatusesDtoDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f162095e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Set<String> f162097g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Set<String> f162098h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ Set<String> f162099j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ boolean f162100k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Set<String> set, Set<String> set2, Set<String> set3, boolean z15, tq.e<? super c> eVar) {
            super(1, eVar);
            this.f162097g = set;
            this.f162098h = set2;
            this.f162099j = set3;
            this.f162100k = z15;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f162095e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            mr0.e eVarF = k.this.f();
            Set<String> set = this.f162097g;
            Set<String> set2 = this.f162098h;
            Set<String> set3 = this.f162099j;
            Boolean boolA = vq.b.a(this.f162100k);
            this.f162095e = 1;
            Object objA = eVarF.a(set, set2, set3, boolA, this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return k.this.new c(this.f162097g, this.f162098h, this.f162099j, this.f162100k, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<DocumentAndCertificateStatusesDtoDto>> eVar) {
            return ((c) M(eVar)).J(i0.f148189a);
        }
    }

    public k(final w wVar, g0 g0Var) {
        this.networkCallMediator = g0Var;
        this.client = oq.l.a(new er.a() { // from class: pr0.j
            @Override // er.a
            public final Object a() {
                return k.e(wVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mr0.e e(w wVar) {
        return (mr0.e) w.b(wVar, null, mr0.e.class, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final mr0.e f() {
        return (mr0.e) this.client.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    @Override // rr0.e
    public Object a(Set<String> set, Set<String> set2, Set<String> set3, boolean z15, tq.e<? super dx.i<? extends dx.b, BEDocumentAndCertificateStatuses>> eVar) throws Throwable {
        b bVar;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f162094k;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f162094k = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        b bVar2 = bVar;
        Object objB = bVar2.f162092h;
        Object objE = uq.b.e();
        int i16 = bVar2.f162094k;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            c cVar = new c(set, set2, set3, z15, null);
            bVar2.f162088d = vq.j.a(set);
            bVar2.f162089e = vq.j.a(set2);
            bVar2.f162090f = vq.j.a(set3);
            bVar2.f162091g = z15;
            bVar2.f162094k = 1;
            objB = g0Var.b(cVar, bVar2);
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
            return new dx.i.Right(nr0.g.a((DocumentAndCertificateStatusesDtoDto) ((dx.i.Right) iVar).b()));
        }
        throw new p();
    }

    @Override // rr0.e
    public Object b(String str, tq.e<? super dx.i<? extends dx.b, i0>> eVar) {
        return this.networkCallMediator.b(new a(str, null), eVar);
    }
}
