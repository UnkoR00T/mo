package pc4;

import i24.DrivingLicenceCategory;
import i24.DrivingLicenceStatusChangedReason;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jr0.CategoryContainer;
import jr0.DrivingLicenceScope;
import jr0.StatusChangedReasonContainer;
import k34.DrivingLicenceScopes;
import ou1.Document;
import ou1.DrivingLicenceContainerData;
import ou1.DrivingLicenceData;
import ou1.DrivingLicenceFullData;
import ou1.MnemonicHeader;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\u000b\u001a\u00020\u0003*\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u001b\u0010\u000f\u001a\u00020\u0007*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0013\u0010\u0013\u001a\u00020\u0012*\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0013\u0010\u0015\u001a\u00020\u0012*\u00020\rH\u0002¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Li24/l;", "", "picture", "Lou1/g;", "e", "(Li24/l;Ljava/lang/String;)Lou1/g;", "Li24/k;", "Lou1/f;", "c", "(Li24/k;)Lou1/f;", "Lk34/p;", "f", "(Lk34/p;)Lou1/g;", "Ljr0/d;", "scopeName", "d", "(Ljr0/d;Ljava/lang/String;)Lou1/f;", "Li24/m;", "Lou1/h;", "g", "(Li24/m;)Lou1/h;", "h", "(Ljr0/d;)Lou1/h;", "mObywatel_prodRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class q3 {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f155627a;

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
            f155627a = iArr;
        }
    }

    private static final DrivingLicenceData c(i24.DrivingLicenceData drivingLicenceData) {
        ou1.b bVar;
        String documentId = drivingLicenceData.getDocument().getDocumentId();
        int parentCertificateId = drivingLicenceData.getDocument().getParentCertificateId();
        int i15 = a.f155627a[drivingLicenceData.getDocument().getDocumentStatus().ordinal()];
        if (i15 == 1) {
            bVar = ou1.b.ACTIVE;
        } else if (i15 == 2) {
            bVar = ou1.b.INACTIVE;
        } else if (i15 == 3) {
            bVar = ou1.b.EXPIRED;
        } else {
            if (i15 != 4) {
                throw new oq.p();
            }
            bVar = ou1.b.REVOKED;
        }
        return new DrivingLicenceData(new Document(documentId, parentCertificateId, bVar, drivingLicenceData.getDocument().getExpirationDate(), drivingLicenceData.getDocument().getLastUpdateTimestamp(), drivingLicenceData.getDocument().getIsChild()), drivingLicenceData.getScopeName(), g(drivingLicenceData.getScope()), drivingLicenceData.getDocument().getDocumentId());
    }

    private static final DrivingLicenceData d(DrivingLicenceScope drivingLicenceScope, String str) {
        return new DrivingLicenceData(null, str, h(drivingLicenceScope), drivingLicenceScope.getMnemonicHeaderContainer().getIid());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DrivingLicenceFullData e(i24.DrivingLicenceFullData drivingLicenceFullData, String str) {
        String parentId = drivingLicenceFullData.getParentId();
        List<i24.DrivingLicenceData> listD = drivingLicenceFullData.d();
        ArrayList arrayList = new ArrayList(pq.v.y(listD, 10));
        Iterator<T> it = listD.iterator();
        while (it.hasNext()) {
            arrayList.add(c((i24.DrivingLicenceData) it.next()));
        }
        return new DrivingLicenceFullData(parentId, str, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DrivingLicenceFullData f(DrivingLicenceScopes drivingLicenceScopes) {
        List listC = pq.v.c();
        DrivingLicenceScope drivingLicence = drivingLicenceScopes.getDrivingLicence();
        if (drivingLicence != null) {
            listC.add(d(drivingLicence, "DRIVING_LICENCE"));
        }
        DrivingLicenceScope activeTemporaryDrivingLicence = drivingLicenceScopes.getActiveTemporaryDrivingLicence();
        if (activeTemporaryDrivingLicence != null) {
            listC.add(d(activeTemporaryDrivingLicence, "ACTIVE_TEMPORARY_DRIVING_LICENCE"));
        }
        List<DrivingLicenceScope> listE = drivingLicenceScopes.e();
        if (listE != null) {
            int i15 = 0;
            for (Object obj : listE) {
                int i16 = i15 + 1;
                if (i15 < 0) {
                    pq.v.x();
                }
                listC.add(d((DrivingLicenceScope) obj, "INVALIDATED_TEMPORARY_DRIVING_LICENCE_" + i15));
                i15 = i16;
            }
        }
        List listA = pq.v.a(listC);
        iy.b0 picture = drivingLicenceScopes.getPicture();
        return new DrivingLicenceFullData(null, picture != null ? iy.c0.e(picture) : null, listA);
    }

    private static final ou1.DrivingLicenceScope g(i24.DrivingLicenceScope drivingLicenceScope) {
        ArrayList arrayList;
        MnemonicHeader mnemonicHeader = new MnemonicHeader(drivingLicenceScope.getDataHeader().getTp(), drivingLicenceScope.getDataHeader().getStp(), drivingLicenceScope.getDataHeader().getVer(), drivingLicenceScope.getDataHeader().getDn(), drivingLicenceScope.getDataHeader().getSn(), drivingLicenceScope.getDataHeader().getIsr(), drivingLicenceScope.getDataHeader().getTs(), drivingLicenceScope.getDataHeader().getRId(), drivingLicenceScope.getDataHeader().getIid(), drivingLicenceScope.getDataHeader().getPe(), drivingLicenceScope.getDataHeader().getIn(), drivingLicenceScope.getDataHeader().getId());
        String name = drivingLicenceScope.getData().getName();
        String surname = drivingLicenceScope.getData().getSurname();
        LocalDate birthday = drivingLicenceScope.getData().getBirthday();
        String birthplace = drivingLicenceScope.getData().getBirthplace();
        String documentState = drivingLicenceScope.getData().getDocumentState();
        String documentStateCode = drivingLicenceScope.getData().getDocumentStateCode();
        String longDocumentId = drivingLicenceScope.getData().getLongDocumentId();
        String formNumber = drivingLicenceScope.getData().getFormNumber();
        LocalDate releaseDate = drivingLicenceScope.getData().getReleaseDate();
        List<String> listK = drivingLicenceScope.getData().k();
        List<DrivingLicenceCategory> listC = drivingLicenceScope.getData().c();
        ArrayList arrayList2 = null;
        if (listC != null) {
            List<DrivingLicenceCategory> list = listC;
            arrayList = new ArrayList(pq.v.y(list, 10));
            for (DrivingLicenceCategory drivingLicenceCategory : list) {
                arrayList.add(new ou1.DrivingLicenceCategory(drivingLicenceCategory.getCategoryName(), drivingLicenceCategory.getFormReleaseDate(), drivingLicenceCategory.b(), drivingLicenceCategory.getExpiredDate(), drivingLicenceCategory.getCategoryStatus()));
            }
        } else {
            arrayList = null;
        }
        String secondName = drivingLicenceScope.getData().getSecondName();
        List<DrivingLicenceStatusChangedReason> listM = drivingLicenceScope.getData().m();
        if (listM != null) {
            List<DrivingLicenceStatusChangedReason> list2 = listM;
            arrayList2 = new ArrayList(pq.v.y(list2, 10));
            for (DrivingLicenceStatusChangedReason drivingLicenceStatusChangedReason : list2) {
                arrayList2.add(new ou1.DrivingLicenceStatusChangedReason(drivingLicenceStatusChangedReason.getChangeStatusCode(), drivingLicenceStatusChangedReason.getChangeStatusDescription()));
                secondName = secondName;
                name = name;
            }
        }
        return new ou1.DrivingLicenceScope(mnemonicHeader, new DrivingLicenceContainerData(name, surname, birthday, birthplace, documentState, documentStateCode, longDocumentId, formNumber, releaseDate, listK, arrayList, secondName, arrayList2, drivingLicenceScope.getData().getExpiredDate()));
    }

    private static final ou1.DrivingLicenceScope h(DrivingLicenceScope drivingLicenceScope) {
        ArrayList arrayList;
        MnemonicHeader mnemonicHeader = new MnemonicHeader(drivingLicenceScope.getMnemonicHeaderContainer().getTp(), drivingLicenceScope.getMnemonicHeaderContainer().getStp(), drivingLicenceScope.getMnemonicHeaderContainer().getVer(), drivingLicenceScope.getMnemonicHeaderContainer().getDn(), drivingLicenceScope.getMnemonicHeaderContainer().getSn(), drivingLicenceScope.getMnemonicHeaderContainer().getIsr(), drivingLicenceScope.getMnemonicHeaderContainer().getTs(), drivingLicenceScope.getMnemonicHeaderContainer().getRId(), drivingLicenceScope.getMnemonicHeaderContainer().getIid(), drivingLicenceScope.getMnemonicHeaderContainer().getPe(), drivingLicenceScope.getMnemonicHeaderContainer().getIn(), drivingLicenceScope.getMnemonicHeaderContainer().getId());
        String name = drivingLicenceScope.getDrivingLicenceDataContainer().getName();
        String surname = drivingLicenceScope.getDrivingLicenceDataContainer().getSurname();
        LocalDate birthday = drivingLicenceScope.getDrivingLicenceDataContainer().getBirthday();
        String birthplace = drivingLicenceScope.getDrivingLicenceDataContainer().getBirthplace();
        String documentState = drivingLicenceScope.getDrivingLicenceDataContainer().getDocumentState();
        String documentStateCode = drivingLicenceScope.getDrivingLicenceDataContainer().getDocumentStateCode();
        String longDocumentId = drivingLicenceScope.getDrivingLicenceDataContainer().getLongDocumentId();
        String formNumber = drivingLicenceScope.getDrivingLicenceDataContainer().getFormNumber();
        LocalDate releaseDate = drivingLicenceScope.getDrivingLicenceDataContainer().getReleaseDate();
        List<String> listK = drivingLicenceScope.getDrivingLicenceDataContainer().k();
        List<CategoryContainer> listC = drivingLicenceScope.getDrivingLicenceDataContainer().c();
        ArrayList arrayList2 = null;
        if (listC != null) {
            List<CategoryContainer> list = listC;
            arrayList = new ArrayList(pq.v.y(list, 10));
            for (CategoryContainer categoryContainer : list) {
                arrayList.add(new ou1.DrivingLicenceCategory(categoryContainer.getCategoryName(), categoryContainer.getFormReleaseDate(), categoryContainer.b(), categoryContainer.getExpiredDate(), categoryContainer.getCategoryStatus()));
            }
        } else {
            arrayList = null;
        }
        String secondName = drivingLicenceScope.getDrivingLicenceDataContainer().getSecondName();
        List<StatusChangedReasonContainer> listM = drivingLicenceScope.getDrivingLicenceDataContainer().m();
        if (listM != null) {
            List<StatusChangedReasonContainer> list2 = listM;
            arrayList2 = new ArrayList(pq.v.y(list2, 10));
            for (StatusChangedReasonContainer statusChangedReasonContainer : list2) {
                arrayList2.add(new ou1.DrivingLicenceStatusChangedReason(statusChangedReasonContainer.getChangeStatusCode(), statusChangedReasonContainer.getChangeStatusDescription()));
                secondName = secondName;
                name = name;
            }
        }
        return new ou1.DrivingLicenceScope(mnemonicHeader, new DrivingLicenceContainerData(name, surname, birthday, birthplace, documentState, documentStateCode, longDocumentId, formNumber, releaseDate, listK, arrayList, secondName, arrayList2, drivingLicenceScope.getDrivingLicenceDataContainer().getExpiredDate()));
    }
}
