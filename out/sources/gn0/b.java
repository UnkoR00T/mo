package gn0;

import dn0.VerificationResponse;
import dn0.f;
import hn0.GetVerificationDataResponseDto;
import hn0.GetVerificationSessionStatusResponseDto;
import hn0.k;
import iy.h;
import java.security.PrivateKey;
import oq.p;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0001*\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0019\u0010\u000b\u001a\u00020\n*\u00020\u00072\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lhn0/f;", "Ldn0/f;", "b", "(Lhn0/f;)Ldn0/f;", "Lhn0/k;", "c", "(Lhn0/k;)Ldn0/f;", "Lhn0/d;", "Ljava/security/PrivateKey;", "privateKey", "Ldn0/d;", "a", "(Lhn0/d;Ljava/security/PrivateKey;)Ldn0/d;", "documentverificationservice_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f75000a;

        static {
            int[] iArr = new int[k.values().length];
            try {
                iArr[k.VERIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k.PENDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[k.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f75000a = iArr;
        }
    }

    public static final VerificationResponse a(GetVerificationDataResponseDto getVerificationDataResponseDto, PrivateKey privateKey) {
        return new VerificationResponse(getVerificationDataResponseDto.getEncryptedData(), getVerificationDataResponseDto.getEncryptedEncryptionKey(), new h.c.Other(getVerificationDataResponseDto.getKeyEncryptionAlgorithm()), getVerificationDataResponseDto.getDataEncryptionAlgorithm(), getVerificationDataResponseDto.getDataEncryptionIv(), getVerificationDataResponseDto.getVerificationDate2(), privateKey);
    }

    public static final f b(GetVerificationSessionStatusResponseDto getVerificationSessionStatusResponseDto) {
        return c(getVerificationSessionStatusResponseDto.getVerificationStatus());
    }

    public static final f c(k kVar) {
        int i15 = a.f75000a[kVar.ordinal()];
        if (i15 == 1) {
            return f.VERIFIED;
        }
        if (i15 == 2) {
            return f.PENDING;
        }
        if (i15 == 3) {
            return f.UNKNOWN;
        }
        throw new p();
    }
}
