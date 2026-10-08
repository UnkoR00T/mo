package w01;

import iy.c0;
import jo2.AuthorizationStatusResponseDto;
import jo2.SignedAuthorizationParameters;
import jo2.SignedAuthorizationRequestDto;
import oq.p;
import p071kotlin.Metadata;
import y01.TrustedProfileAuthorizationRequest;
import y01.TrustedProfileAuthorizationStatusResponse;
import y01.d;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0011\u0010\u0007\u001a\u00020\u0006*\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b\u001a\u0011\u0010\u000b\u001a\u00020\n*\u00020\t¢\u0006\u0004\b\u000b\u0010\f\u001a\u0011\u0010\u000f\u001a\u00020\u000e*\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Ly01/a;", "Ljo2/c;", "c", "(Ly01/a;)Ljo2/c;", "e", "Ly01/c;", "Ljo2/f;", "d", "(Ly01/c;)Ljo2/f;", "Ljo2/b;", "Ly01/e;", "b", "(Ljo2/b;)Ly01/e;", "Ljo2/a;", "Ly01/d;", "a", "(Ljo2/a;)Ly01/d;", "notifications_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: w01.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C5496a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f209139a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f209140b;

        static {
            int[] iArr = new int[y01.a.values().length];
            try {
                iArr[y01.a.CONFIRM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[y01.a.REJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f209139a = iArr;
            int[] iArr2 = new int[jo2.a.values().length];
            try {
                iArr2[jo2.a.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[jo2.a.NOT_PRESENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[jo2.a.CONFIRMED.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[jo2.a.REJECTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[jo2.a.EXPIRED.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[jo2.a.UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            f209140b = iArr2;
        }
    }

    public static final d a(jo2.a aVar) {
        switch (C5496a.f209140b[aVar.ordinal()]) {
            case 1:
                return d.ACTIVE;
            case 2:
                return d.NOT_PRESENT;
            case 3:
                return d.CONFIRMED;
            case 4:
                return d.REJECTED;
            case 5:
                return d.EXPIRED;
            case 6:
                return d.UNKNOWN;
            default:
                throw new p();
        }
    }

    public static final TrustedProfileAuthorizationStatusResponse b(AuthorizationStatusResponseDto authorizationStatusResponseDto) {
        return new TrustedProfileAuthorizationStatusResponse(a(authorizationStatusResponseDto.getStatus()), authorizationStatusResponseDto.getExpirationDateTime());
    }

    public static final jo2.c c(y01.a aVar) {
        int i15 = C5496a.f209139a[aVar.ordinal()];
        if (i15 == 1) {
            return jo2.c.CONFIRM;
        }
        if (i15 == 2) {
            return jo2.c.REJECT;
        }
        throw new p();
    }

    public static final SignedAuthorizationRequestDto d(TrustedProfileAuthorizationRequest trustedProfileAuthorizationRequest) {
        return new SignedAuthorizationRequestDto(c0.e(trustedProfileAuthorizationRequest.getChallenge()), new SignedAuthorizationParameters(e(trustedProfileAuthorizationRequest.getValue().getAction()), trustedProfileAuthorizationRequest.getValue().getAuthorizationId()));
    }

    public static final jo2.c e(y01.a aVar) {
        int i15 = C5496a.f209139a[aVar.ordinal()];
        if (i15 == 1) {
            return jo2.c.CONFIRM;
        }
        if (i15 == 2) {
            return jo2.c.REJECT;
        }
        throw new p();
    }
}
