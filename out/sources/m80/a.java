package m80;

import ht3.CertificateDto;
import ht3.GetVerificationCertificateResponseDto;
import ht3.GetVerificationSessionByCodeResponseDto;
import ht3.GetVerificationSessionStatusResponseDto;
import ht3.SendVerificationDataRequestDto;
import ht3.f;
import k80.Certificate;
import k80.GetVerificationSessionStatusResponse;
import k80.QrCode;
import k80.SecondDocument;
import k80.SendVerificationDataRequest;
import k80.UserDataRequest;
import k80.VerificationCertificate;
import k80.k;
import p071kotlin.Metadata;
import pl.gov.coi.mjunior.backend.documentverificationservice.data.model.SecondDocumentDto;
import pl.gov.coi.mjunior.backend.documentverificationservice.data.model.UserDataRequestDto;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\n\u001a\u00020\t*\u00020\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u0011\u0010\u000e\u001a\u00020\r*\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0011\u0010\u0012\u001a\u00020\u0011*\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0011\u0010\u0016\u001a\u00020\u0015*\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0011\u0010\u001a\u001a\u00020\u0019*\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0011\u0010\u001e\u001a\u00020\u001d*\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lht3/b;", "Lk80/j;", "d", "(Lht3/b;)Lk80/j;", "Lht3/a;", "Lk80/a;", "a", "(Lht3/a;)Lk80/a;", "Lht3/c;", "Lk80/c;", "c", "(Lht3/c;)Lk80/c;", "Lk80/h;", "Lht3/e;", "f", "(Lk80/h;)Lht3/e;", "Lht3/d;", "Lk80/b;", "b", "(Lht3/d;)Lk80/b;", "Lht3/f;", "Lk80/k;", "e", "(Lht3/f;)Lk80/k;", "Lk80/i;", "Lpl/gov/coi/mjunior/backend/documentverificationservice/data/model/UserDataRequestDto;", "h", "(Lk80/i;)Lpl/gov/coi/mjunior/backend/documentverificationservice/data/model/UserDataRequestDto;", "Lk80/g;", "Lpl/gov/coi/mjunior/backend/documentverificationservice/data/model/SecondDocumentDto;", "g", "(Lk80/g;)Lpl/gov/coi/mjunior/backend/documentverificationservice/data/model/SecondDocumentDto;", "documentverificationservice_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: m80.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C3052a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f124505a;

        static {
            int[] iArr = new int[f.values().length];
            try {
                iArr[f.VERIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f.PENDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f124505a = iArr;
        }
    }

    public static final Certificate a(CertificateDto certificateDto) {
        return new Certificate(certificateDto.getAlgorithm(), certificateDto.getEncoded());
    }

    public static final GetVerificationSessionStatusResponse b(GetVerificationSessionStatusResponseDto getVerificationSessionStatusResponseDto) {
        return new GetVerificationSessionStatusResponse(e(getVerificationSessionStatusResponseDto.getVerificationStatus()));
    }

    public static final QrCode c(GetVerificationSessionByCodeResponseDto getVerificationSessionByCodeResponseDto) {
        return new QrCode(getVerificationSessionByCodeResponseDto.getQrCode());
    }

    public static final VerificationCertificate d(GetVerificationCertificateResponseDto getVerificationCertificateResponseDto) {
        return new VerificationCertificate(a(getVerificationCertificateResponseDto.getCertificate()));
    }

    public static final k e(f fVar) {
        int i15 = C3052a.f124505a[fVar.ordinal()];
        if (i15 != 1) {
            return i15 != 2 ? k.UNKNOWN : k.PENDING;
        }
        return k.VERIFIED;
    }

    public static final SendVerificationDataRequestDto f(SendVerificationDataRequest sendVerificationDataRequest) {
        return new SendVerificationDataRequestDto(sendVerificationDataRequest.getEncryptedData());
    }

    public static final SecondDocumentDto g(SecondDocument secondDocument) {
        return new SecondDocumentDto(secondDocument.getData(), secondDocument.getScope());
    }

    public static final UserDataRequestDto h(UserDataRequest userDataRequest) {
        String serviceIdentifier = userDataRequest.getServiceIdentifier();
        int scope = userDataRequest.getScope();
        int scopeType = userDataRequest.getScopeType();
        String citizenData = userDataRequest.getCitizenData();
        long sendDataTimestampUTC = userDataRequest.getSendDataTimestampUTC();
        long expirationTimestampUTC = userDataRequest.getExpirationTimestampUTC();
        SecondDocument pictureData = userDataRequest.getPictureData();
        return new UserDataRequestDto(serviceIdentifier, scope, scopeType, citizenData, sendDataTimestampUTC, expirationTimestampUTC, pictureData != null ? g(pictureData) : null, userDataRequest.getSchemaId());
    }
}
