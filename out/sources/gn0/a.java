package gn0;

import dn0.Certificate;
import dn0.VerificationCertificate;
import hn0.CertificateDto;
import hn0.GetVerificationCertificateResponseDto;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lhn0/b;", "Ldn0/c;", "b", "(Lhn0/b;)Ldn0/c;", "Lhn0/a;", "Ldn0/a;", "a", "(Lhn0/a;)Ldn0/a;", "documentverificationservice_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {
    public static final Certificate a(CertificateDto certificateDto) {
        return new Certificate(certificateDto.getEncoded(), certificateDto.getAlgorithm());
    }

    public static final VerificationCertificate b(GetVerificationCertificateResponseDto getVerificationCertificateResponseDto) {
        return new VerificationCertificate(a(getVerificationCertificateResponseDto.getCertificate()));
    }
}
