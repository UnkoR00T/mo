package pc4;

import k34.PensionerCardDocumentData;
import ns2.DataHeaderStandard;
import ns2.Document;
import ns2.PensionerCardContainerData;
import ns2.PensionerCardData;
import ns2.PensionerCardScope;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0001*\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\t\u001a\u00020\b*\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\n\u001a#\u0010\u0010\u001a\u00020\u000f*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a#\u0010\u0013\u001a\u00020\u000f*\u00020\u00122\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Ler0/h;", "Lns2/c;", "h", "(Ler0/h;)Lns2/c;", "Lf24/h;", "i", "(Lf24/h;)Lns2/c;", "Lf24/e;", "Lns2/b;", "e", "(Lf24/e;)Lns2/b;", "Li24/d0;", "status", "", "photo", "Lns2/e;", "f", "(Li24/d0;Lns2/c;Ljava/lang/String;)Lns2/e;", "Lk34/x;", "g", "(Lk34/x;Lns2/c;Ljava/lang/String;)Lns2/e;", "mObywatel_prodRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class t6 {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f156392a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f156393b;

        static {
            int[] iArr = new int[er0.h.values().length];
            try {
                iArr[er0.h.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[er0.h.INACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[er0.h.EXPIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[er0.h.REVOKED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[er0.h.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f156392a = iArr;
            int[] iArr2 = new int[f24.h.values().length];
            try {
                iArr2[f24.h.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[f24.h.INACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[f24.h.EXPIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[f24.h.REVOKED.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            f156393b = iArr2;
        }
    }

    private static final Document e(f24.Document document) {
        return new Document(document.getDocumentId(), document.getParentCertificateId(), i(document.getDocumentStatus()), document.getExpirationDate(), document.getLastUpdateTimestamp());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PensionerCardData f(i24.PensionerCardData pensionerCardData, ns2.c cVar, String str) {
        return new PensionerCardData(e(pensionerCardData.getDocument()), new PensionerCardScope(new DataHeaderStandard(pensionerCardData.getScope().getDataHeader().getDn(), pensionerCardData.getScope().getDataHeader().getSn(), pensionerCardData.getScope().getDataHeader().getIsr(), pensionerCardData.getScope().getDataHeader().getTs(), pensionerCardData.getScope().getDataHeader().getRId(), pensionerCardData.getScope().getDataHeader().getTp(), pensionerCardData.getScope().getDataHeader().getStp(), pensionerCardData.getScope().getDataHeader().getVer(), pensionerCardData.getScope().getDataHeader().getIid(), pensionerCardData.getScope().getDataHeader().getPesel(), pensionerCardData.getScope().getDataHeader().getIn(), pensionerCardData.getScope().getDataHeader().getId()), new PensionerCardContainerData(pensionerCardData.getScope().getData().getNumber(), pensionerCardData.getScope().getData().getFirstName(), pensionerCardData.getScope().getData().getSecondName(), pensionerCardData.getScope().getData().getLastName(), pensionerCardData.getScope().getData().getPesel(), pensionerCardData.getScope().getData().getType(), pensionerCardData.getScope().getData().getExpiredDate(), pensionerCardData.getScope().getData().getDepartment(), str)), cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PensionerCardData g(PensionerCardDocumentData pensionerCardDocumentData, ns2.c cVar, String str) {
        return new PensionerCardData(null, new PensionerCardScope(new DataHeaderStandard(pensionerCardDocumentData.getDataHeaderStandardModel().getDn(), pensionerCardDocumentData.getDataHeaderStandardModel().getSn(), pensionerCardDocumentData.getDataHeaderStandardModel().getIsr(), pensionerCardDocumentData.getDataHeaderStandardModel().getTs(), pensionerCardDocumentData.getDataHeaderStandardModel().getRId(), pensionerCardDocumentData.getDataHeaderStandardModel().getTp(), pensionerCardDocumentData.getDataHeaderStandardModel().getStp(), pensionerCardDocumentData.getDataHeaderStandardModel().getVer(), pensionerCardDocumentData.getDataHeaderStandardModel().getIid(), pensionerCardDocumentData.getDataHeaderStandardModel().getPesel(), pensionerCardDocumentData.getDataHeaderStandardModel().getIn(), pensionerCardDocumentData.getDataHeaderStandardModel().getId()), new PensionerCardContainerData(pensionerCardDocumentData.getPensionerCardDataModel().getNumber(), pensionerCardDocumentData.getPensionerCardDataModel().getFirstName(), pensionerCardDocumentData.getPensionerCardDataModel().getSecondName(), pensionerCardDocumentData.getPensionerCardDataModel().getLastName(), pensionerCardDocumentData.getPensionerCardDataModel().getPesel(), pensionerCardDocumentData.getPensionerCardDataModel().getType(), pensionerCardDocumentData.getPensionerCardDataModel().getExpiredData(), pensionerCardDocumentData.getPensionerCardDataModel().getDepartment(), str)), cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ns2.c h(er0.h hVar) {
        int i15 = a.f156392a[hVar.ordinal()];
        if (i15 == 1) {
            return ns2.c.ACTIVE;
        }
        if (i15 == 2) {
            return ns2.c.INACTIVE;
        }
        if (i15 == 3) {
            return ns2.c.EXPIRED;
        }
        if (i15 == 4) {
            return ns2.c.REVOKED;
        }
        if (i15 == 5) {
            return ns2.c.ACTIVE;
        }
        throw new oq.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ns2.c i(f24.h hVar) {
        int i15 = a.f156393b[hVar.ordinal()];
        if (i15 == 1) {
            return ns2.c.ACTIVE;
        }
        if (i15 == 2) {
            return ns2.c.INACTIVE;
        }
        if (i15 == 3) {
            return ns2.c.EXPIRED;
        }
        if (i15 == 4) {
            return ns2.c.REVOKED;
        }
        throw new oq.p();
    }
}
