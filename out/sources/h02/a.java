package h02;

import eo0.AddressData;
import eo0.OwnerAddress;
import iy.b0;
import m02.f;
import oq.i0;
import p071kotlin.Metadata;
import tq.e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096@¢\u0006\u0004\b\b\u0010\u0006J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096@¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0096@¢\u0006\u0004\b\u000e\u0010\u0006J\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0018\u0010\u0003R\u0016\u0010\u001b\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lh02/a;", "Lj02/a;", "<init>", "()V", "Liy/b0;", "A", "(Ltq/e;)Ljava/lang/Object;", "", "U", "Leo0/j0;", "ownerAddress", "Loq/i0;", "m", "(Leo0/j0;Ltq/e;)Ljava/lang/Object;", "h", "", "d0", "()Z", "Lm02/f;", "infoResult", "b0", "(Lm02/f;)V", "l", "()Lm02/f;", "clear", "a", "Lm02/f;", "additionalInfoResult", "b", "Leo0/j0;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements j02.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private f additionalInfoResult = f.c.f122036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private OwnerAddress ownerAddress;

    @Override // j02.a
    public Object A(e<? super b0> eVar) {
        AddressData addressData;
        OwnerAddress ownerAddress = this.ownerAddress;
        if (ownerAddress == null || (addressData = ownerAddress.getAddressData()) == null) {
            return null;
        }
        return addressData.getEdorAddress();
    }

    @Override // j02.a
    public Object U(e<? super String> eVar) {
        AddressData addressData;
        OwnerAddress ownerAddress = this.ownerAddress;
        if (ownerAddress == null || (addressData = ownerAddress.getAddressData()) == null) {
            return null;
        }
        return addressData.getEpuapId();
    }

    @Override // j02.a
    public void b0(f infoResult) {
        this.additionalInfoResult = infoResult;
    }

    @Override // wy.c
    public void clear() {
        this.ownerAddress = null;
        this.additionalInfoResult = f.c.f122036a;
    }

    @Override // j02.a
    public boolean d0() {
        OwnerAddress ownerAddress = this.ownerAddress;
        return (ownerAddress != null ? ownerAddress.getEmptyState() : null) == null;
    }

    @Override // j02.a
    public Object h(e<? super OwnerAddress> eVar) {
        return this.ownerAddress;
    }

    @Override // j02.a
    /* JADX INFO: renamed from: l, reason: from getter */
    public f getAdditionalInfoResult() {
        return this.additionalInfoResult;
    }

    @Override // j02.a
    public Object m(OwnerAddress ownerAddress, e<? super i0> eVar) {
        this.ownerAddress = ownerAddress;
        return i0.f148189a;
    }
}
