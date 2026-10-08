package ys0;

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
import ts0.RestrictionsVerificationList;
import ts0.s;
import vq.j;
import xs0.RestrictionsVerificationListDto;
import xs0.VerifyPeselRequest;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lys0/f;", "Lat0/c;", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "<init>", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;)V", "Lts0/s;", "verifyPeselRequest", "Ldx/i;", "Ldx/b;", "Lts0/r;", "a", "(Lts0/s;Ltq/e;)Ljava/lang/Object;", "Lpl/gov/coi/common/network/g0;", "Lvs0/c;", "b", "Loq/k;", "e", "()Lvs0/c;", "client", "peselrestrictionservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements at0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g0 networkCallMediator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k client;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f229182d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f229183e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f229185g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f229183e = obj;
            this.f229185g |= PKIFailureInfo.systemUnavail;
            return f.this.a(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lxs0/p;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements l<tq.e<? super x<RestrictionsVerificationListDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f229186e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ s f229188g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(s sVar, tq.e<? super b> eVar) {
            super(1, eVar);
            this.f229188g = sVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f229186e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            vs0.c cVarE = f.this.e();
            VerifyPeselRequest verifyPeselRequestV = ws0.a.v(this.f229188g);
            this.f229186e = 1;
            Object objA = cVarE.a(verifyPeselRequestV, this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return f.this.new b(this.f229188g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<RestrictionsVerificationListDto>> eVar) {
            return ((b) M(eVar)).J(i0.f148189a);
        }
    }

    public f(final w wVar, g0 g0Var) {
        this.networkCallMediator = g0Var;
        this.client = oq.l.a(new er.a() { // from class: ys0.e
            @Override // er.a
            public final Object a() {
                return f.d(wVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vs0.c d(w wVar) {
        return (vs0.c) w.b(wVar, null, vs0.c.class, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final vs0.c e() {
        return (vs0.c) this.client.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // at0.c
    public Object a(s sVar, tq.e<? super i<? extends dx.b, RestrictionsVerificationList>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f229185g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f229185g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objB = aVar.f229183e;
        Object objE = uq.b.e();
        int i16 = aVar.f229185g;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            b bVar = new b(sVar, null);
            aVar.f229182d = j.a(sVar);
            aVar.f229185g = 1;
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
            return new i.Right(ws0.a.s((RestrictionsVerificationListDto) ((i.Right) iVar).b()));
        }
        throw new p();
    }
}
