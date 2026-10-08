package yn3;

import co3.SecondDocument;
import co3.VerificationDecryptedData;
import fr.t;
import java.time.OffsetDateTime;
import java.util.concurrent.TimeUnit;
import k34.a0;
import oq.p;
import p071kotlin.Metadata;
import pl.gov.coi.mobywatel.feature.verification.data.model.SecondDocumentDto;
import pl.gov.coi.mobywatel.feature.verification.data.model.VerificationDecryptedDataDto;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0019\u0010\f\u001a\u00020\u000b*\u00020\b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r\u001a\u0011\u0010\u0010\u001a\u00020\u000f*\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lco3/f;", "", "c", "(Lco3/f;)Ljava/lang/String;", "Lk34/a0;", "", "d", "(Lk34/a0;)I", "Lpl/gov/coi/mobywatel/feature/verification/data/model/VerificationDecryptedDataDto;", "Ljava/time/OffsetDateTime;", "verificationDateTime", "Lco3/r;", "a", "(Lpl/gov/coi/mobywatel/feature/verification/data/model/VerificationDecryptedDataDto;Ljava/time/OffsetDateTime;)Lco3/r;", "Lco3/j;", "Lpl/gov/coi/mobywatel/feature/verification/data/model/SecondDocumentDto;", "b", "(Lco3/j;)Lpl/gov/coi/mobywatel/feature/verification/data/model/SecondDocumentDto;", "verification_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f228255a;

        static {
            int[] iArr = new int[co3.f.values().length];
            try {
                iArr[co3.f.STATIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[co3.f.DYNAMIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f228255a = iArr;
        }
    }

    public static final VerificationDecryptedData a(VerificationDecryptedDataDto verificationDecryptedDataDto, OffsetDateTime offsetDateTime) {
        return new VerificationDecryptedData(verificationDecryptedDataDto.getScope(), verificationDecryptedDataDto.getCitizenData(), TimeUnit.SECONDS.toMillis(offsetDateTime.toEpochSecond()), verificationDecryptedDataDto.getPicture(), verificationDecryptedDataDto.getPictureData(), verificationDecryptedDataDto.getVerificationSchema());
    }

    public static final SecondDocumentDto b(SecondDocument secondDocument) {
        return new SecondDocumentDto(secondDocument.getData(), secondDocument.getScope());
    }

    public static final String c(co3.f fVar) {
        int i15 = a.f228255a[fVar.ordinal()];
        if (i15 == 1) {
            return ip.a.f96137b;
        }
        if (i15 == 2) {
            return ip.a.f96138c;
        }
        throw new p();
    }

    public static final int d(a0 a0Var) {
        return (t.c(a0Var, a0.m.f107878a) || t.c(a0Var, a0.w.f107898a)) ? 0 : 1;
    }
}
