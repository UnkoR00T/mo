package pc4;

import k34.AdvocateDataModel;
import p071kotlin.Metadata;
import vx0.AdvocateCardContainerData;
import vx0.AdvocateCardData;
import vx0.AdvocateCardScope;
import vx0.DataHeaderStandard;
import vx0.Document;
import vx0.UserDocumentData;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0001*\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\t\u001a\u00020\b*\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\n\u001a#\u0010\u0010\u001a\u00020\u000f*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a#\u0010\u0013\u001a\u00020\u000f*\u00020\u00122\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Ler0/h;", "Lvx0/f;", "h", "(Ler0/h;)Lvx0/f;", "Lf24/h;", "i", "(Lf24/h;)Lvx0/f;", "Lf24/e;", "Lvx0/e;", "g", "(Lf24/e;)Lvx0/e;", "Li24/b;", "status", "Lvx0/g;", "userData", "Lvx0/b;", "e", "(Li24/b;Lvx0/f;Lvx0/g;)Lvx0/b;", "Lk34/b;", "f", "(Lk34/b;Lvx0/f;Lvx0/g;)Lvx0/b;", "mObywatel_prodRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class f {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f154567a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f154568b;

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
            f154567a = iArr;
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
            f154568b = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AdvocateCardData e(i24.AdvocateCardData advocateCardData, vx0.f fVar, UserDocumentData userDocumentData) {
        return new AdvocateCardData(g(advocateCardData.getDocument()), new AdvocateCardScope(new DataHeaderStandard(advocateCardData.getScope().getDataHeaderStandard().getDn(), advocateCardData.getScope().getDataHeaderStandard().getSn(), advocateCardData.getScope().getDataHeaderStandard().getIsr(), advocateCardData.getScope().getDataHeaderStandard().getTs(), advocateCardData.getScope().getDataHeaderStandard().getRId(), advocateCardData.getScope().getDataHeaderStandard().getTp(), advocateCardData.getScope().getDataHeaderStandard().getStp(), advocateCardData.getScope().getDataHeaderStandard().getVer(), advocateCardData.getScope().getDataHeaderStandard().getIid(), advocateCardData.getScope().getDataHeaderStandard().getPesel(), advocateCardData.getScope().getDataHeaderStandard().getIn(), advocateCardData.getScope().getDataHeaderStandard().getId()), new AdvocateCardContainerData(advocateCardData.getScope().getData().getNumber(), advocateCardData.getScope().getData().getMemberInstitution(), advocateCardData.getScope().getData().getReleaseDate(), advocateCardData.getScope().getData().getExpiredDate(), advocateCardData.getScope().getData().getPermissionType())), fVar, userDocumentData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AdvocateCardData f(AdvocateDataModel advocateDataModel, vx0.f fVar, UserDocumentData userDocumentData) {
        return new AdvocateCardData(null, new AdvocateCardScope(new DataHeaderStandard(advocateDataModel.getDataHeader().getDn(), advocateDataModel.getDataHeader().getSn(), advocateDataModel.getDataHeader().getIsr(), advocateDataModel.getDataHeader().getTs(), advocateDataModel.getDataHeader().getRId(), advocateDataModel.getDataHeader().getTp(), advocateDataModel.getDataHeader().getStp(), advocateDataModel.getDataHeader().getVer(), advocateDataModel.getDataHeader().getIid(), advocateDataModel.getDataHeader().getPesel(), advocateDataModel.getDataHeader().getIn(), advocateDataModel.getDataHeader().getId()), new AdvocateCardContainerData(advocateDataModel.getAdvocateCardDataModel().getNumber(), advocateDataModel.getAdvocateCardDataModel().getMemberInstitution(), advocateDataModel.getAdvocateCardDataModel().getReleaseDate(), advocateDataModel.getAdvocateCardDataModel().getExpiredData(), advocateDataModel.getAdvocateCardDataModel().getPermissionType())), fVar, userDocumentData);
    }

    private static final Document g(f24.Document document) {
        return new Document(document.getDocumentId(), document.getParentCertificateId(), i(document.getDocumentStatus()), document.getExpirationDate(), document.getLastUpdateTimestamp());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vx0.f h(er0.h hVar) {
        int i15 = a.f154567a[hVar.ordinal()];
        if (i15 == 1) {
            return vx0.f.ACTIVE;
        }
        if (i15 == 2) {
            return vx0.f.INACTIVE;
        }
        if (i15 == 3) {
            return vx0.f.EXPIRED;
        }
        if (i15 == 4) {
            return vx0.f.REVOKED;
        }
        if (i15 == 5) {
            return vx0.f.ACTIVE;
        }
        throw new oq.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vx0.f i(f24.h hVar) {
        int i15 = a.f154568b[hVar.ordinal()];
        if (i15 == 1) {
            return vx0.f.ACTIVE;
        }
        if (i15 == 2) {
            return vx0.f.INACTIVE;
        }
        if (i15 == 3) {
            return vx0.f.EXPIRED;
        }
        if (i15 == 4) {
            return vx0.f.REVOKED;
        }
        throw new oq.p();
    }
}
