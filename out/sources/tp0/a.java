package tp0;

import gu.d;
import gu.e;
import iy.c0;
import java.util.List;
import oq.p;
import p071kotlin.Metadata;
import qp0.JWSSigningParams;
import qp0.b;
import up0.InitAuthenticationByMobileSignatureResponseDto;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lup0/a;", "Lqp0/a;", "a", "(Lup0/a;)Lqp0/a;", "Lqp0/b;", "Lup0/b;", "b", "(Lqp0/b;)Lup0/b;", "identitysrv_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: tp0.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C5003a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f191384a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.ACTIVATION_BY_PERSONAL_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.CONTACT_CHANGES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.PASSPORT_INVALIDATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b.ELECTRONIC_DELIVERY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f191384a = iArr;
        }
    }

    public static final JWSSigningParams a(InitAuthenticationByMobileSignatureResponseDto initAuthenticationByMobileSignatureResponseDto) {
        String challenge = initAuthenticationByMobileSignatureResponseDto.getChallenge();
        List<String> listD = initAuthenticationByMobileSignatureResponseDto.d();
        gu.b.Companion companion = gu.b.INSTANCE;
        return new JWSSigningParams(challenge, listD, d.r(initAuthenticationByMobileSignatureResponseDto.getTokenTtlInSeconds(), e.SECONDS), c0.g(initAuthenticationByMobileSignatureResponseDto.getEncryptionKey()), c0.g(initAuthenticationByMobileSignatureResponseDto.getEncryptionKeyId()), null);
    }

    public static final up0.b b(b bVar) {
        int i15 = C5003a.f191384a[bVar.ordinal()];
        if (i15 == 1) {
            return up0.b.ACTIVATION_BY_PERSONAL_ID;
        }
        if (i15 == 2) {
            return up0.b.CONTACT_CHANGES;
        }
        if (i15 == 3) {
            return up0.b.PASSPORT_INVALIDATION;
        }
        if (i15 == 4) {
            return up0.b.ELECTRONIC_DELIVERY;
        }
        throw new p();
    }
}
