package bu3;

import hz.g;
import java.util.Map;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.v0;
import st3.AddressFormVMSSetupData;
import xt3.i;
import zt3.AddressState;
import zt3.m1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0011J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0019¨\u0006\u001a"}, d2 = {"Lbu3/c;", "Lbu3/a;", "Lst3/i$b$a;", "mode", "Lxt3/i;", "validateCorrespondenceAddressUseCase", "<init>", "(Lst3/i$b$a;Lxt3/i;)V", "Lzt3/b;", "addressState", "", "Lzt3/m1;", "Lhz/g;", "a", "(Lzt3/b;Ltq/e;)Ljava/lang/Object;", "", "b", "()Ljava/lang/Integer;", "f", "d", "c", "", "e", "()Z", "Lst3/i$b$a;", "Lxt3/i;", "addressform_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements bu3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AddressFormVMSSetupData.b.Custom mode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final i validateCorrespondenceAddressUseCase;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f21736d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f21737e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f21739g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f21737e = obj;
            this.f21739g |= PKIFailureInfo.systemUnavail;
            return c.this.a(null, this);
        }
    }

    public c(AddressFormVMSSetupData.b.Custom custom, i iVar) {
        this.mode = custom;
        this.validateCorrespondenceAddressUseCase = iVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // bu3.a
    public Object a(AddressState addressState, tq.e<? super Map<m1, ? extends g>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f21739g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f21739g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objC = aVar.f21737e;
        Object objE = uq.b.e();
        int i16 = aVar.f21739g;
        if (i16 == 0) {
            u.b(objC);
            i iVar = this.validateCorrespondenceAddressUseCase;
            i.Params params = new i.Params(addressState.getProvince().getState(), addressState.getCounty().getState(), addressState.getCommunity().getState(), addressState.getCity().getState(), new i.Params.StringParam(addressState.getPostalCode().getValue(), true), addressState.getStreet().getState(), null, null);
            aVar.f21736d = addressState;
            aVar.f21739g = 1;
            objC = iVar.c(params, aVar);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            addressState = (AddressState) aVar.f21736d;
            u.b(objC);
        }
        Map mapW = v0.w((Map) objC);
        mapW.put(m1.BUILDING_NUMBER, this.mode.a().b(addressState.getBuildingNumber().getValue()));
        mapW.put(m1.APARTMENT_NUMBER, this.mode.a().b(addressState.getApartmentNumber().getValue()));
        return mapW;
    }

    @Override // bu3.a
    public Integer b() {
        return Integer.valueOf(rt3.a.f176112o);
    }

    @Override // bu3.a
    public Integer c() {
        return Integer.valueOf(rt3.a.f176098a);
    }

    @Override // bu3.a
    public Integer d() {
        return Integer.valueOf(rt3.a.f176100c);
    }

    @Override // bu3.a
    public boolean e() {
        return true;
    }

    @Override // bu3.a
    public Integer f() {
        return Integer.valueOf(rt3.a.f176118u);
    }
}
