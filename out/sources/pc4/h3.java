package pc4;

import do1.DataHeaderStandard;
import do1.DeputyCardContainerData;
import do1.DeputyCardData;
import do1.DeputyCardScope;
import do1.Document;
import k34.DeputyCardModel;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0001*\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\t\u001a\u00020\b*\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\n\u001a#\u0010\u0010\u001a\u00020\u000f*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a#\u0010\u0013\u001a\u00020\u000f*\u00020\u00122\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Ler0/h;", "Ldo1/f;", "h", "(Ler0/h;)Ldo1/f;", "Lf24/h;", "i", "(Lf24/h;)Ldo1/f;", "Lf24/e;", "Ldo1/e;", "g", "(Lf24/e;)Ldo1/e;", "Li24/e;", "status", "", "photo", "Ldo1/c;", "e", "(Li24/e;Ldo1/f;Ljava/lang/String;)Ldo1/c;", "Lk34/e;", "f", "(Lk34/e;Ldo1/f;Ljava/lang/String;)Ldo1/c;", "mObywatel_prodRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class h3 {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f154665a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f154666b;

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
            f154665a = iArr;
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
            f154666b = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeputyCardData e(i24.DeputyCardData deputyCardData, do1.f fVar, String str) {
        return new DeputyCardData(g(deputyCardData.getDocument()), new DeputyCardScope(new DataHeaderStandard(deputyCardData.getScope().getDataHeaderStandard().getDn(), deputyCardData.getScope().getDataHeaderStandard().getSn(), deputyCardData.getScope().getDataHeaderStandard().getIsr(), deputyCardData.getScope().getDataHeaderStandard().getTs(), deputyCardData.getScope().getDataHeaderStandard().getRId(), deputyCardData.getScope().getDataHeaderStandard().getTp(), deputyCardData.getScope().getDataHeaderStandard().getStp(), deputyCardData.getScope().getDataHeaderStandard().getVer(), deputyCardData.getScope().getDataHeaderStandard().getIid(), deputyCardData.getScope().getDataHeaderStandard().getPesel(), deputyCardData.getScope().getDataHeaderStandard().getIn(), deputyCardData.getScope().getDataHeaderStandard().getId()), new DeputyCardContainerData(deputyCardData.getScope().getData().getFirstName(), deputyCardData.getScope().getData().getSecondName(), deputyCardData.getScope().getData().getLastName(), deputyCardData.getScope().getData().getNumber(), deputyCardData.getScope().getData().getNumberOfParliamentCadence(), deputyCardData.getScope().getData().getReleaseDate(), str)), fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeputyCardData f(DeputyCardModel deputyCardModel, do1.f fVar, String str) {
        return new DeputyCardData(null, new DeputyCardScope(new DataHeaderStandard(deputyCardModel.getDataHeader().getDn(), deputyCardModel.getDataHeader().getSn(), deputyCardModel.getDataHeader().getIsr(), deputyCardModel.getDataHeader().getTs(), deputyCardModel.getDataHeader().getRId(), deputyCardModel.getDataHeader().getTp(), deputyCardModel.getDataHeader().getStp(), deputyCardModel.getDataHeader().getVer(), deputyCardModel.getDataHeader().getIid(), deputyCardModel.getDataHeader().getPesel(), deputyCardModel.getDataHeader().getIn(), deputyCardModel.getDataHeader().getId()), new DeputyCardContainerData(deputyCardModel.getDataContainer().getFirstName(), deputyCardModel.getDataContainer().getSecondName(), deputyCardModel.getDataContainer().getLastName(), deputyCardModel.getDataContainer().getNumber(), deputyCardModel.getDataContainer().getNumberOfSeymCadency(), deputyCardModel.getDataContainer().getReleaseDate(), str)), fVar);
    }

    private static final Document g(f24.Document document) {
        return new Document(document.getDocumentId(), document.getParentCertificateId(), i(document.getDocumentStatus()), document.getExpirationDate(), document.getLastUpdateTimestamp());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final do1.f h(er0.h hVar) {
        int i15 = a.f154665a[hVar.ordinal()];
        if (i15 == 1) {
            return do1.f.ACTIVE;
        }
        if (i15 == 2) {
            return do1.f.INACTIVE;
        }
        if (i15 == 3) {
            return do1.f.EXPIRED;
        }
        if (i15 == 4) {
            return do1.f.REVOKED;
        }
        if (i15 == 5) {
            return do1.f.ACTIVE;
        }
        throw new oq.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final do1.f i(f24.h hVar) {
        int i15 = a.f154666b[hVar.ordinal()];
        if (i15 == 1) {
            return do1.f.ACTIVE;
        }
        if (i15 == 2) {
            return do1.f.INACTIVE;
        }
        if (i15 == 3) {
            return do1.f.EXPIRED;
        }
        if (i15 == 4) {
            return do1.f.REVOKED;
        }
        throw new oq.p();
    }
}
