package pc4;

import j62.DataHeaderStandard;
import j62.Document;
import j62.FamilyCardContainerData;
import j62.FamilyCardData;
import j62.FamilyCardScope;
import j62.UserDocumentData;
import k34.FamilyDataModel;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\t\u001a\u00020\u0003*\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\f\u001a\u00020\u0003*\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\r\u001a#\u0010\u000f\u001a\u00020\u0005*\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Li24/s;", "Lj62/h;", "userData", "Lj62/c;", "documentStatus", "Lj62/e;", "e", "(Li24/s;Lj62/h;Lj62/c;)Lj62/e;", "Ler0/h;", "g", "(Ler0/h;)Lj62/c;", "Lf24/h;", "h", "(Lf24/h;)Lj62/c;", "Lk34/r;", "f", "(Lk34/r;Lj62/h;Lj62/c;)Lj62/e;", "mObywatel_prodRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b5 {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f154394a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f154395b;

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
            f154394a = iArr;
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
            f154395b = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FamilyCardData e(i24.FamilyCardData familyCardData, UserDocumentData userDocumentData, j62.c cVar) {
        return new FamilyCardData(new Document(familyCardData.getDocument().getDocumentId(), familyCardData.getDocument().getParentCertificateId(), cVar, familyCardData.getDocument().getExpirationDate(), familyCardData.getDocument().getLastUpdateTimestamp()), new FamilyCardScope(new DataHeaderStandard(familyCardData.getScope().getDataHeader().getDn(), familyCardData.getScope().getDataHeader().getSn(), familyCardData.getScope().getDataHeader().getIsr(), familyCardData.getScope().getDataHeader().getTs(), familyCardData.getScope().getDataHeader().getRId(), familyCardData.getScope().getDataHeader().getTp(), familyCardData.getScope().getDataHeader().getStp(), familyCardData.getScope().getDataHeader().getVer(), familyCardData.getScope().getDataHeader().getIid(), familyCardData.getScope().getDataHeader().getPesel(), familyCardData.getScope().getDataHeader().getIn(), familyCardData.getScope().getDataHeader().getId()), new FamilyCardContainerData(familyCardData.getScope().getData().getCardRelation(), familyCardData.getScope().getData().getHolderType(), familyCardData.getScope().getData().getFirstName(), familyCardData.getScope().getData().getSecondName(), familyCardData.getScope().getData().getLastName(), familyCardData.getScope().getData().getP(), familyCardData.getScope().getData().getIcn(), familyCardData.getScope().getData().getNumber(), familyCardData.getScope().getData().getED(), fr.t.c(familyCardData.getScope().getData().getP(), userDocumentData.getPesel()) ? userDocumentData.getPhoto() : null)), cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FamilyCardData f(FamilyDataModel familyDataModel, UserDocumentData userDocumentData, j62.c cVar) {
        return new FamilyCardData(null, new FamilyCardScope(new DataHeaderStandard(familyDataModel.getDataHeader().getDn(), familyDataModel.getDataHeader().getSn(), familyDataModel.getDataHeader().getIsr(), familyDataModel.getDataHeader().getTs(), familyDataModel.getDataHeader().getRId(), familyDataModel.getDataHeader().getTp(), familyDataModel.getDataHeader().getStp(), familyDataModel.getDataHeader().getVer(), familyDataModel.getDataHeader().getIid(), familyDataModel.getDataHeader().getPesel(), familyDataModel.getDataHeader().getIn(), familyDataModel.getDataHeader().getId()), new FamilyCardContainerData(familyDataModel.getDataContainer().getCardRelation(), familyDataModel.getDataContainer().getHolderType(), familyDataModel.getDataContainer().getFirstName(), familyDataModel.getDataContainer().getSecondName(), familyDataModel.getDataContainer().getLastName(), familyDataModel.getDataContainer().getP(), familyDataModel.getDataContainer().getIcn(), familyDataModel.getDataContainer().getNumber(), familyDataModel.getDataContainer().getED(), fr.t.c(familyDataModel.getDataContainer().getP(), userDocumentData.getPesel()) ? userDocumentData.getPhoto() : null)), cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j62.c g(er0.h hVar) {
        int i15 = a.f154394a[hVar.ordinal()];
        if (i15 == 1) {
            return j62.c.ACTIVE;
        }
        if (i15 == 2) {
            return j62.c.INACTIVE;
        }
        if (i15 == 3) {
            return j62.c.EXPIRED;
        }
        if (i15 == 4) {
            return j62.c.REVOKED;
        }
        if (i15 == 5) {
            return j62.c.ACTIVE;
        }
        throw new oq.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j62.c h(f24.h hVar) {
        int i15 = a.f154395b[hVar.ordinal()];
        if (i15 == 1) {
            return j62.c.ACTIVE;
        }
        if (i15 == 2) {
            return j62.c.INACTIVE;
        }
        if (i15 == 3) {
            return j62.c.EXPIRED;
        }
        if (i15 == 4) {
            return j62.c.REVOKED;
        }
        throw new oq.p();
    }
}
