package bu3;

import hz.g;
import java.util.Map;
import p071kotlin.Metadata;
import xt3.i;
import zt3.AddressState;
import zt3.m1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u0011\u0010\u0011\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ\u0011\u0010\u0012\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0012\u0010\u000fJ\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016¨\u0006\u0017"}, d2 = {"Lbu3/f;", "Lbu3/a;", "Lxt3/i;", "validateCorrespondenceAddressUseCase", "<init>", "(Lxt3/i;)V", "Lzt3/b;", "addressState", "", "Lzt3/m1;", "Lhz/g;", "a", "(Lzt3/b;Ltq/e;)Ljava/lang/Object;", "", "i", "()Ljava/lang/Void;", "j", "h", "g", "", "e", "()Z", "Lxt3/i;", "addressform_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final i validateCorrespondenceAddressUseCase;

    public f(i iVar) {
        this.validateCorrespondenceAddressUseCase = iVar;
    }

    @Override // bu3.a
    public Object a(AddressState addressState, tq.e<? super Map<m1, ? extends g>> eVar) {
        return this.validateCorrespondenceAddressUseCase.c(new i.Params(addressState.getProvince().getState(), addressState.getCounty().getState(), addressState.getCommunity().getState(), addressState.getCity().getState(), null, null, null, null), eVar);
    }

    @Override // bu3.a
    public /* bridge */ /* synthetic */ Integer b() {
        return (Integer) i();
    }

    @Override // bu3.a
    public /* bridge */ /* synthetic */ Integer c() {
        return (Integer) g();
    }

    @Override // bu3.a
    public /* bridge */ /* synthetic */ Integer d() {
        return (Integer) h();
    }

    @Override // bu3.a
    public boolean e() {
        return false;
    }

    @Override // bu3.a
    public /* bridge */ /* synthetic */ Integer f() {
        return (Integer) j();
    }

    public Void g() {
        return null;
    }

    public Void h() {
        return null;
    }

    public Void i() {
        return null;
    }

    public Void j() {
        return null;
    }
}
