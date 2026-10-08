package mj0;

import nj0.TrustedProfileStatusDto;
import oq.p;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnj0/m0;", "Lbj0/a;", "a", "(Lnj0/m0;)Lbj0/a;", "citizenservice_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class g {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f126729a;

        static {
            int[] iArr = new int[TrustedProfileStatusDto.a.values().length];
            try {
                iArr[TrustedProfileStatusDto.a.AVAILABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TrustedProfileStatusDto.a.UNAVAILABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TrustedProfileStatusDto.a.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f126729a = iArr;
        }
    }

    public static final bj0.a a(TrustedProfileStatusDto trustedProfileStatusDto) {
        int i15 = a.f126729a[trustedProfileStatusDto.getStatus().ordinal()];
        if (i15 == 1) {
            return bj0.a.AVAILABLE;
        }
        if (i15 == 2) {
            return bj0.a.UNAVAILABLE;
        }
        if (i15 == 3) {
            return bj0.a.UNKNOWN;
        }
        throw new p();
    }
}
