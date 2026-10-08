package o54;

import fu.r;
import iy.b0;
import iy.c0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lo54/e;", "Lk54/f;", "Lk54/b;", "getElectronicDeliveryOwnerDataUC", "<init>", "(Lk54/b;)V", "Lgz/b$a$a;", "params", "Liy/b0;", "b", "(Lgz/b$a$a;)Liy/b0;", "a", "Lk54/b;", "keycloakauth_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements k54.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final k54.b getElectronicDeliveryOwnerDataUC;

    public e(k54.b bVar) {
        this.getElectronicDeliveryOwnerDataUC = bVar;
    }

    @Override // gz.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public b0 a(gz.b.a.C1792a params) {
        b0 userEdorAddress;
        i54.a aVarA = this.getElectronicDeliveryOwnerDataUC.a(gz.b.a.C1792a.f78542a);
        i54.a.AddressData addressData = aVarA instanceof i54.a.AddressData ? (i54.a.AddressData) aVarA : null;
        if (addressData == null || (userEdorAddress = addressData.getUserEdorAddress()) == null || r.t0(c0.e(userEdorAddress))) {
            return null;
        }
        return userEdorAddress;
    }
}
