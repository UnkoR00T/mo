package ko0;

import eo0.BEDictionaryAdditionalInformation;
import ge4.x;
import java.util.List;
import jo0.AdditionalInformationResponseDto;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.w;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\bH\u0096@¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lko0/b;", "Lmo0/a;", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "<init>", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;)V", "Ldx/i;", "Ldx/b;", "", "Leo0/h;", "a", "(Ltq/e;)Ljava/lang/Object;", "Lpl/gov/coi/common/network/g0;", "Lho0/c;", "b", "Loq/k;", "e", "()Lho0/c;", "client", "electronicdeliveryservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements mo0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g0 networkCallMediator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final oq.k client;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f111726d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f111728f;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f111726d = obj;
            this.f111728f |= PKIFailureInfo.systemUnavail;
            return b.this.a(this);
        }
    }

    /* JADX INFO: renamed from: ko0.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Ljo0/b;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class C2703b extends vq.k implements er.l<tq.e<? super x<AdditionalInformationResponseDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f111729e;

        C2703b(tq.e<? super C2703b> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f111729e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ho0.c cVarE = b.this.e();
            this.f111729e = 1;
            Object objA = cVarE.a(this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return b.this.new C2703b(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<AdditionalInformationResponseDto>> eVar) {
            return ((C2703b) M(eVar)).J(i0.f148189a);
        }
    }

    public b(final w wVar, g0 g0Var) {
        this.networkCallMediator = g0Var;
        this.client = oq.l.a(new er.a() { // from class: ko0.a
            @Override // er.a
            public final Object a() {
                return b.d(wVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ho0.c d(w wVar) {
        return (ho0.c) w.b(wVar, null, ho0.c.class, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ho0.c e() {
        return (ho0.c) this.client.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mo0.a
    public Object a(tq.e<? super dx.i<? extends dx.b, ? extends List<BEDictionaryAdditionalInformation>>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f111728f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f111728f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objB = aVar.f111726d;
        Object objE = uq.b.e();
        int i16 = aVar.f111728f;
        if (i16 == 0) {
            oq.u.b(objB);
            g0 g0Var = this.networkCallMediator;
            C2703b c2703b = new C2703b(null);
            aVar.f111728f = 1;
            objB = g0Var.b(c2703b, aVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objB);
        }
        dx.i iVar = (dx.i) objB;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return new dx.i.Right(io0.a.N((AdditionalInformationResponseDto) ((dx.i.Right) iVar).b()));
        }
        throw new oq.p();
    }
}
