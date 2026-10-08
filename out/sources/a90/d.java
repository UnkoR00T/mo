package a90;

import dx.i;
import er.l;
import ge4.x;
import java.util.Set;
import lt3.DocumentAndCertificateStatusResponse;
import lt3.DocumentStatusesRequest;
import oq.i0;
import oq.k;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.w;
import vq.j;
import x80.BEDocumentsStatusesResponse;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"La90/d;", "Lc90/b;", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "<init>", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;)V", "", "", "documentIds", "Ldx/i;", "Ldx/b;", "Lx80/b;", "a", "(Ljava/util/Set;Ltq/e;)Ljava/lang/Object;", "Lpl/gov/coi/common/network/g0;", "Lkt3/b;", "b", "Loq/k;", "d", "()Lkt3/b;", "httpService", "juniorservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements c90.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g0 networkCallMediator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k httpService;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f4962d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f4963e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f4965g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f4963e = obj;
            this.f4965g |= PKIFailureInfo.systemUnavail;
            return d.this.a(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Llt3/a;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements l<tq.e<? super x<DocumentAndCertificateStatusResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f4966e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Set<String> f4968g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Set<String> set, tq.e<? super b> eVar) {
            super(1, eVar);
            this.f4968g = set;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f4966e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            kt3.b bVarD = d.this.d();
            DocumentStatusesRequest documentStatusesRequest = new DocumentStatusesRequest(this.f4968g);
            this.f4966e = 1;
            Object objA = bVarD.a(documentStatusesRequest, this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return d.this.new b(this.f4968g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<DocumentAndCertificateStatusResponse>> eVar) {
            return ((b) M(eVar)).J(i0.f148189a);
        }
    }

    public d(final w wVar, g0 g0Var) {
        this.networkCallMediator = g0Var;
        this.httpService = oq.l.a(new er.a() { // from class: a90.c
            @Override // er.a
            public final Object a() {
                return d.e(wVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kt3.b d() {
        return (kt3.b) this.httpService.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kt3.b e(w wVar) {
        return (kt3.b) w.b(wVar, null, kt3.b.class, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // c90.b
    public Object a(Set<String> set, tq.e<? super i<? extends dx.b, BEDocumentsStatusesResponse>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f4965g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f4965g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objB = aVar.f4963e;
        Object objE = uq.b.e();
        int i16 = aVar.f4965g;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            b bVar = new b(set, null);
            aVar.f4962d = j.a(set);
            aVar.f4965g = 1;
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
        i iVar = (i) objB;
        if (iVar instanceof i.Left) {
            return iVar;
        }
        if (iVar instanceof i.Right) {
            return new i.Right(z80.a.a((DocumentAndCertificateStatusResponse) ((i.Right) iVar).b()));
        }
        throw new p();
    }
}
