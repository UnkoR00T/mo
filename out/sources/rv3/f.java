package rv3;

import j44.AddressData;
import j44.EmptyState;
import j44.OwnerAddress;
import oq.p;
import ov3.UrlData;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0016\u001a\u00020\u0015*\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lov3/h;", "Lj44/h;", "e", "(Lov3/h;)Lj44/h;", "Lov3/a;", "Lj44/a;", "b", "(Lov3/a;)Lj44/a;", "Lov3/e;", "Lj44/e;", "d", "(Lov3/e;)Lj44/e;", "Lov3/b;", "Lj44/b;", "c", "(Lov3/b;)Lj44/b;", "Lov3/d;", "Lj44/d;", "f", "(Lov3/d;)Lj44/d;", "Lov3/i;", "Lj44/i;", "g", "(Lov3/i;)Lj44/i;", "edorauth_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class f {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f176519a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f176520b;

        static {
            int[] iArr = new int[ov3.b.values().length];
            try {
                iArr[ov3.b.E_PUAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ov3.b.E_PUAP_AND_E_DELIVERY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ov3.b.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f176519a = iArr;
            int[] iArr2 = new int[ov3.d.values().length];
            try {
                iArr2[ov3.d.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ov3.d.RESERVED.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ov3.d.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ov3.d.CLOSED_RECOVERABLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ov3.d.CLOSED_UNRECOVERABLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[ov3.d.STRUCK_OFF.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            f176520b = iArr2;
        }
    }

    private static final AddressData b(ov3.AddressData addressData) {
        return new AddressData(addressData.getEdorAddress(), addressData.getEpuapId(), f(addressData.getStatus()), c(addressData.getAddressType()));
    }

    private static final j44.b c(ov3.b bVar) {
        int i15 = a.f176519a[bVar.ordinal()];
        if (i15 == 1) {
            return j44.b.E_PUAP;
        }
        if (i15 == 2) {
            return j44.b.E_PUAP_AND_E_DELIVERY;
        }
        if (i15 == 3) {
            return j44.b.UNKNOWN;
        }
        throw new p();
    }

    private static final EmptyState d(ov3.EmptyState emptyState) {
        String title = emptyState.getTitle();
        String body = emptyState.getBody();
        UrlData urlData = emptyState.getUrlData();
        return new EmptyState(title, body, urlData != null ? g(urlData) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OwnerAddress e(ov3.OwnerAddress ownerAddress) {
        if (ownerAddress == null) {
            return null;
        }
        ov3.AddressData addressData = ownerAddress.getAddressData();
        AddressData addressDataB = addressData != null ? b(addressData) : null;
        ov3.EmptyState emptyState = ownerAddress.getEmptyState();
        return new OwnerAddress(addressDataB, emptyState != null ? d(emptyState) : null);
    }

    private static final j44.d f(ov3.d dVar) {
        switch (a.f176520b[dVar.ordinal()]) {
            case 1:
                return j44.d.ACTIVE;
            case 2:
                return j44.d.RESERVED;
            case 3:
                return j44.d.UNKNOWN;
            case 4:
                return j44.d.CLOSED_RECOVERABLE;
            case 5:
                return j44.d.CLOSED_UNRECOVERABLE;
            case 6:
                return j44.d.STRUCK_OFF;
            default:
                throw new p();
        }
    }

    private static final j44.UrlData g(UrlData urlData) {
        return new j44.UrlData(urlData.getTitle(), urlData.getValue());
    }
}
