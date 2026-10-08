package bu3;

import fr.t;
import oq.p;
import p071kotlin.Metadata;
import st3.AddressFormVMSSetupData;
import xt3.i;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Lbu3/b;", "", "Lxt3/i;", "validateCorrespondenceAddressUseCase", "<init>", "(Lxt3/i;)V", "Lst3/i$b;", "mode", "Lbu3/a;", "a", "(Lst3/i$b;)Lbu3/a;", "Lxt3/i;", "addressform_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final i validateCorrespondenceAddressUseCase;

    public b(i iVar) {
        this.validateCorrespondenceAddressUseCase = iVar;
    }

    public final a a(AddressFormVMSSetupData.b mode) {
        if (t.c(mode, AddressFormVMSSetupData.b.C4761b.f184325a)) {
            return new d(this.validateCorrespondenceAddressUseCase);
        }
        if (t.c(mode, AddressFormVMSSetupData.b.d.f184327a)) {
            return new f(this.validateCorrespondenceAddressUseCase);
        }
        if (t.c(mode, AddressFormVMSSetupData.b.c.f184326a)) {
            return new e(this.validateCorrespondenceAddressUseCase);
        }
        if (mode instanceof AddressFormVMSSetupData.b.Custom) {
            return new c((AddressFormVMSSetupData.b.Custom) mode, this.validateCorrespondenceAddressUseCase);
        }
        throw new p();
    }
}
