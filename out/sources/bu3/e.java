package bu3;

import hz.g;
import java.util.Map;
import p071kotlin.Metadata;
import xt3.i;
import zt3.AddressState;
import zt3.m1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u000fJ\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016¨\u0006\u0017"}, d2 = {"Lbu3/e;", "Lbu3/a;", "Lxt3/i;", "validateCorrespondenceAddressUseCase", "<init>", "(Lxt3/i;)V", "Lzt3/b;", "addressState", "", "Lzt3/m1;", "Lhz/g;", "a", "(Lzt3/b;Ltq/e;)Ljava/lang/Object;", "", "b", "()Ljava/lang/Integer;", "f", "d", "c", "", "e", "()Z", "Lxt3/i;", "addressform_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final i validateCorrespondenceAddressUseCase;

    public e(i iVar) {
        this.validateCorrespondenceAddressUseCase = iVar;
    }

    @Override // bu3.a
    public Object a(AddressState addressState, tq.e<? super Map<m1, ? extends g>> eVar) {
        return this.validateCorrespondenceAddressUseCase.c(new i.Params(addressState.getProvince().getState(), addressState.getCounty().getState(), addressState.getCommunity().getState(), addressState.getCity().getState(), new i.Params.StringParam(addressState.getPostalCode().getValue(), false), null, new i.Params.StringParam(addressState.getBuildingNumber().getValue(), false), new i.Params.StringParam(addressState.getApartmentNumber().getValue(), false)), eVar);
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
