package ix3;

import eo0.AddressData;
import eo0.CentralTokens;
import eo0.EmptyState;
import eo0.OwTokens;
import eo0.OwnerAddress;
import eo0.UrlData;
import eo0.c;
import eo0.p;
import i54.b;
import java.text.ParseException;
import java.time.Instant;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0019\u0010\b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t\u001a\u0011\u0010\f\u001a\u00020\u000b*\u00020\n¢\u0006\u0004\b\f\u0010\r\u001a\u0011\u0010\u000e\u001a\u00020\n*\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0011\u0010\u0012\u001a\u00020\u0011*\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0016\u001a\u00020\u0015*\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0013\u0010\u001a\u001a\u00020\u0019*\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0013\u0010\u001e\u001a\u00020\u001d*\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0013\u0010\"\u001a\u00020!*\u00020 H\u0002¢\u0006\u0004\b\"\u0010#\u001a\u0013\u0010&\u001a\u00020%*\u00020$H\u0002¢\u0006\u0004\b&\u0010'¨\u0006("}, d2 = {"Leo0/i0$a;", "Li54/b$a;", "h", "(Leo0/i0$a;)Li54/b$a;", "Leo0/i0$c;", "", "refreshOwTokenUrl", "Li54/b$c;", "j", "(Leo0/i0$c;Ljava/lang/String;)Li54/b$c;", "Leo0/k$a;", "Li54/b$b;", "i", "(Leo0/k$a;)Li54/b$b;", "a", "(Li54/b$b;)Leo0/k$a;", "Leo0/j0;", "Li54/a;", "b", "(Leo0/j0;)Li54/a;", "Leo0/b;", "Li54/a$a;", "c", "(Leo0/b;)Li54/a$a;", "Leo0/p;", "Li54/a$a$b;", "f", "(Leo0/p;)Li54/a$a$b;", "Leo0/c;", "Li54/a$a$a;", "d", "(Leo0/c;)Li54/a$a$a;", "Leo0/z;", "Li54/a$b;", "e", "(Leo0/z;)Li54/a$b;", "Leo0/a1;", "Li54/a$b$a;", "g", "(Leo0/a1;)Li54/a$b$a;", "keycloakauth_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: ix3.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C2296a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f97717a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f97718b;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.RESERVED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[p.CLOSED_RECOVERABLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[p.CLOSED_UNRECOVERABLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[p.STRUCK_OFF.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f97717a = iArr;
            int[] iArr2 = new int[c.values().length];
            try {
                iArr2[c.E_PUAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[c.E_PUAP_AND_E_DELIVERY.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[c.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            f97718b = iArr2;
        }
    }

    public static final CentralTokens.Access a(b.CentralAccess centralAccess) {
        return new CentralTokens.Access(centralAccess.getValue(), centralAccess.getExpiration().getEpochSecond());
    }

    public static final i54.a b(OwnerAddress ownerAddress) throws ParseException {
        i54.a.AddressData addressDataC;
        AddressData addressData = ownerAddress.getAddressData();
        if (addressData != null && (addressDataC = c(addressData)) != null) {
            return addressDataC;
        }
        EmptyState emptyState = ownerAddress.getEmptyState();
        if (emptyState != null) {
            return e(emptyState);
        }
        throw new ParseException("OwnerAddress cannot be empty", 0);
    }

    private static final i54.a.AddressData c(AddressData addressData) {
        return new i54.a.AddressData(addressData.getEdorAddress(), addressData.getEpuapId(), f(addressData.getStatus()), d(addressData.getAddressType()));
    }

    private static final i54.a.AddressData.EnumC2124a d(c cVar) {
        int i15 = C2296a.f97718b[cVar.ordinal()];
        if (i15 == 1) {
            return i54.a.AddressData.EnumC2124a.E_PUAP;
        }
        if (i15 == 2) {
            return i54.a.AddressData.EnumC2124a.E_PUAP_AND_E_DELIVERY;
        }
        if (i15 == 3) {
            return i54.a.AddressData.EnumC2124a.UNKNOWN;
        }
        throw new oq.p();
    }

    private static final i54.a.EmptyState e(EmptyState emptyState) {
        String title = emptyState.getTitle();
        String body = emptyState.getBody();
        UrlData urlData = emptyState.getUrlData();
        return new i54.a.EmptyState(title, body, urlData != null ? g(urlData) : null);
    }

    private static final i54.a.AddressData.b f(p pVar) {
        switch (C2296a.f97717a[pVar.ordinal()]) {
            case 1:
                return i54.a.AddressData.b.ACTIVE;
            case 2:
                return i54.a.AddressData.b.RESERVED;
            case 3:
                return i54.a.AddressData.b.UNKNOWN;
            case 4:
                return i54.a.AddressData.b.CLOSED_RECOVERABLE;
            case 5:
                return i54.a.AddressData.b.CLOSED_UNRECOVERABLE;
            case 6:
                return i54.a.AddressData.b.STRUCK_OFF;
            default:
                throw new oq.p();
        }
    }

    private static final i54.a.EmptyState.UrlData g(UrlData urlData) {
        return new i54.a.EmptyState.UrlData(urlData.getTitle(), urlData.getValue());
    }

    public static final b.Access h(OwTokens.Access access) {
        return new b.Access(access.getValue(), Instant.ofEpochSecond(access.getExpirationTime()));
    }

    public static final b.CentralAccess i(CentralTokens.Access access) {
        return new b.CentralAccess(access.getValue(), Instant.ofEpochSecond(access.getExpirationTimeInSeconds()));
    }

    public static final b.Refresh j(OwTokens.Refresh refresh, String str) {
        return new b.Refresh(str, refresh.getValue(), Instant.ofEpochSecond(refresh.getExpirationTime()));
    }
}
