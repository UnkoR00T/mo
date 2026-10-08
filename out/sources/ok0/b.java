package ok0;

import dx.i;
import er.l;
import ge4.x;
import iy.b0;
import iy.c0;
import nk0.PersonalCertificateStatusRequestDto;
import nk0.PersonalCertificateStatusResponseDto;
import oq.i0;
import oq.k;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.w;
import tq.e;
import vq.j;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lok0/b;", "Lqk0/a;", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "<init>", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;)V", "Liy/b0;", "certificate", "Ldx/i;", "Ldx/b;", "Ljk0/l;", "a", "(Liy/b0;Ltq/e;)Ljava/lang/Object;", "Lpl/gov/coi/common/network/g0;", "Llk0/b;", "b", "Loq/k;", "d", "()Llk0/b;", "personalSignatureControllerApi", "digitalservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements qk0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g0 networkCallMediator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k personalSignatureControllerApi;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f146465d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f146466e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f146468g;

        a(e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f146466e = obj;
            this.f146468g |= PKIFailureInfo.systemUnavail;
            return b.this.a(null, this);
        }
    }

    /* JADX INFO: renamed from: ok0.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lnk0/r;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class C3640b extends vq.k implements l<e<? super x<PersonalCertificateStatusResponseDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f146469e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ b0 f146471g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3640b(b0 b0Var, e<? super C3640b> eVar) {
            super(1, eVar);
            this.f146471g = b0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f146469e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            lk0.b bVarD = b.this.d();
            PersonalCertificateStatusRequestDto personalCertificateStatusRequestDto = new PersonalCertificateStatusRequestDto(c0.e(this.f146471g));
            this.f146469e = 1;
            Object objA = bVarD.a(personalCertificateStatusRequestDto, this);
            return objA == objE ? objE : objA;
        }

        public final e<i0> M(e<?> eVar) {
            return b.this.new C3640b(this.f146471g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(e<? super x<PersonalCertificateStatusResponseDto>> eVar) {
            return ((C3640b) M(eVar)).J(i0.f148189a);
        }
    }

    public b(final w wVar, g0 g0Var) {
        this.networkCallMediator = g0Var;
        this.personalSignatureControllerApi = oq.l.a(new er.a() { // from class: ok0.a
            @Override // er.a
            public final Object a() {
                return b.e(wVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final lk0.b d() {
        return (lk0.b) this.personalSignatureControllerApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final lk0.b e(w wVar) {
        return (lk0.b) w.b(wVar, null, lk0.b.class, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // qk0.a
    public Object a(b0 b0Var, e<? super i<? extends dx.b, ? extends jk0.l>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f146468g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f146468g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objB = aVar.f146466e;
        Object objE = uq.b.e();
        int i16 = aVar.f146468g;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            C3640b c3640b = new C3640b(b0Var, null);
            aVar.f146465d = j.a(b0Var);
            aVar.f146468g = 1;
            objB = g0Var.b(c3640b, aVar);
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
            return new i.Right(mk0.b.a(((PersonalCertificateStatusResponseDto) ((i.Right) iVar).b()).getStatus()));
        }
        throw new p();
    }
}
