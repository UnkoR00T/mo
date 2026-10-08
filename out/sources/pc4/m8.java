package pc4;

import k34.StudentCardDocumentData;
import k73.Document;
import k73.StudentCardContainerData;
import k73.StudentCardData;
import k73.StudentCardHeader;
import k73.StudentCardScope;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0001*\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Li24/s0;", "Lk73/d;", "c", "(Li24/s0;)Lk73/d;", "Lk34/c0;", "d", "(Lk34/c0;)Lk73/d;", "mObywatel_prodRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class m8 {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f155290a;

        static {
            int[] iArr = new int[f24.h.values().length];
            try {
                iArr[f24.h.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f24.h.INACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[f24.h.EXPIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[f24.h.REVOKED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f155290a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StudentCardData c(i24.StudentCardData studentCardData) {
        k73.b bVar;
        String documentId = studentCardData.getDocument().getDocumentId();
        int parentCertificateId = studentCardData.getDocument().getParentCertificateId();
        int i15 = a.f155290a[studentCardData.getDocument().getDocumentStatus().ordinal()];
        if (i15 == 1) {
            bVar = k73.b.ACTIVE;
        } else if (i15 == 2) {
            bVar = k73.b.INACTIVE;
        } else if (i15 == 3) {
            bVar = k73.b.EXPIRED;
        } else {
            if (i15 != 4) {
                throw new oq.p();
            }
            bVar = k73.b.REVOKED;
        }
        return new StudentCardData(new Document(documentId, parentCertificateId, bVar, studentCardData.getDocument().getExpirationDate(), studentCardData.getDocument().getLastUpdateTimestamp(), studentCardData.getDocument().getIsChild()), new StudentCardScope(new StudentCardHeader(studentCardData.getScope().getDataHeader().getDn(), studentCardData.getScope().getDataHeader().getSerialNumber(), studentCardData.getScope().getDataHeader().getIssuer(), studentCardData.getScope().getDataHeader().getSignDate(), studentCardData.getScope().getDataHeader().getTimestamp()), new StudentCardContainerData(studentCardData.getScope().getData().getName(), studentCardData.getScope().getData().getSecondName(), studentCardData.getScope().getData().getSurname(), studentCardData.getScope().getData().getCardNumber(), studentCardData.getScope().getData().getExpireDate(), studentCardData.getScope().getData().getPesel(), studentCardData.getScope().getData().getPictureWithWatermark(), studentCardData.getScope().getData().getPicture(), studentCardData.getScope().getData().getBirthday(), studentCardData.getScope().getData().getAddress(), studentCardData.getScope().getData().getUniversityName(), studentCardData.getScope().getData().getUniversityAddress(), studentCardData.getScope().getData().getDistributionDate(), studentCardData.getScope().getData().getGroup(), studentCardData.getScope().getData().getDirector(), studentCardData.getScope().getData().getUniversityPhoneNo(), studentCardData.getScope().getData().getEditionNumber(), studentCardData.getScope().getData().getDisability())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StudentCardData d(StudentCardDocumentData studentCardDocumentData) {
        return new StudentCardData(null, new StudentCardScope(new StudentCardHeader(studentCardDocumentData.getDataHeader().getDn(), studentCardDocumentData.getDataHeader().getSerialNumber(), studentCardDocumentData.getDataHeader().getIssuer(), studentCardDocumentData.getDataHeader().getSignDate(), studentCardDocumentData.getDataHeader().getTimestamp()), new StudentCardContainerData(studentCardDocumentData.getName(), studentCardDocumentData.getSecondName(), studentCardDocumentData.getSurname(), studentCardDocumentData.getCardNumber(), studentCardDocumentData.getExpireDate(), studentCardDocumentData.getPesel(), studentCardDocumentData.getPictureWithWatermark(), studentCardDocumentData.getPicture(), studentCardDocumentData.getBirthday(), studentCardDocumentData.getAddress(), studentCardDocumentData.getUniversityName(), studentCardDocumentData.getUniversityAddress(), studentCardDocumentData.getDistributionDate(), studentCardDocumentData.getGroup(), studentCardDocumentData.getDirector(), studentCardDocumentData.getUniversityPhoneNo(), studentCardDocumentData.getEditionNumber(), studentCardDocumentData.getDisability())));
    }
}
