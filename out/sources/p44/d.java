package p44;

import fu.r;
import iy.b0;
import iy.c0;
import j44.AddressData;
import j44.OwnerAddress;
import oq.p;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\r\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u001a\u0010\u0010\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0015¨\u0006\u0016"}, d2 = {"Lp44/d;", "Ll44/e;", "Li44/a;", "interactor", "Ll44/b;", "getEdorOwnerAddressUC", "Lk54/b;", "getElectronicDeliveryOwnerDataFromKeycloakUC", "<init>", "(Li44/a;Ll44/b;Lk54/b;)V", "Liy/b0;", "b", "()Liy/b0;", "c", "Lgz/b$a$a;", "params", "d", "(Lgz/b$a$a;)Liy/b0;", "a", "Li44/a;", "Ll44/b;", "Lk54/b;", "edorauth_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements l44.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final i44.a interactor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final l44.b getEdorOwnerAddressUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final k54.b getElectronicDeliveryOwnerDataFromKeycloakUC;

    public d(i44.a aVar, l44.b bVar, k54.b bVar2) {
        this.interactor = aVar;
        this.getEdorOwnerAddressUC = bVar;
        this.getElectronicDeliveryOwnerDataFromKeycloakUC = bVar2;
    }

    private final b0 b() {
        b0 userEdorAddress;
        i54.a aVarA = this.getElectronicDeliveryOwnerDataFromKeycloakUC.a(gz.b.a.C1792a.f78542a);
        i54.a.AddressData addressData = aVarA instanceof i54.a.AddressData ? (i54.a.AddressData) aVarA : null;
        if (addressData == null || (userEdorAddress = addressData.getUserEdorAddress()) == null || r.t0(c0.e(userEdorAddress))) {
            return null;
        }
        return userEdorAddress;
    }

    private final b0 c() {
        AddressData addressData;
        b0 edorAddress;
        OwnerAddress ownerAddressA = this.getEdorOwnerAddressUC.a(gz.b.a.C1792a.f78542a);
        if (ownerAddressA == null || (addressData = ownerAddressA.getAddressData()) == null || (edorAddress = addressData.getEdorAddress()) == null || r.t0(c0.e(edorAddress))) {
            return null;
        }
        return edorAddress;
    }

    @Override // gz.a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public b0 a(gz.b.a.C1792a params) {
        boolean zL = this.interactor.L();
        if (zL) {
            return c();
        }
        if (zL) {
            throw new p();
        }
        return b();
    }
}
