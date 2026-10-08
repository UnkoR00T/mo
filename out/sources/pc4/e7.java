package pc4;

import p071kotlin.Metadata;
import ws1.Document;
import ws1.RefugeeCardData;
import ws1.RefugeeCardScope;
import ws1.RefugeeMnemonicHeader;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0001*\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Li24/o0;", "Lws1/d;", "c", "(Li24/o0;)Lws1/d;", "Lo34/c;", "d", "(Lo34/c;)Lws1/d;", "mObywatel_prodRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class e7 {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f154566a;

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
            f154566a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RefugeeCardData c(i24.RefugeeCardData refugeeCardData) {
        ws1.b bVar;
        String documentId = refugeeCardData.getDocument().getDocumentId();
        int parentCertificateId = refugeeCardData.getDocument().getParentCertificateId();
        int i15 = a.f154566a[refugeeCardData.getDocument().getDocumentStatus().ordinal()];
        if (i15 == 1) {
            bVar = ws1.b.ACTIVE;
        } else if (i15 == 2) {
            bVar = ws1.b.INACTIVE;
        } else if (i15 == 3) {
            bVar = ws1.b.EXPIRED;
        } else {
            if (i15 != 4) {
                throw new oq.p();
            }
            bVar = ws1.b.REVOKED;
        }
        return new RefugeeCardData(new Document(documentId, parentCertificateId, bVar, refugeeCardData.getDocument().getExpirationDate(), refugeeCardData.getDocument().getLastUpdateTimestamp(), refugeeCardData.getDocument().getIsChild()), new RefugeeCardScope(new RefugeeMnemonicHeader(refugeeCardData.getScope().getDataHeader().getTp(), refugeeCardData.getScope().getDataHeader().getStp(), refugeeCardData.getScope().getDataHeader().getVer(), refugeeCardData.getScope().getDataHeader().getDn(), refugeeCardData.getScope().getDataHeader().getSn(), refugeeCardData.getScope().getDataHeader().getIsr(), refugeeCardData.getScope().getDataHeader().getTs(), refugeeCardData.getScope().getDataHeader().getRId(), refugeeCardData.getScope().getDataHeader().getIid(), refugeeCardData.getScope().getDataHeader().getPe(), refugeeCardData.getScope().getDataHeader().getIn(), refugeeCardData.getScope().getDataHeader().getId()), new ws1.c(refugeeCardData.getScope().getData().getBirthDate(), refugeeCardData.getScope().getData().getBirthPlace(), refugeeCardData.getScope().getData().getBirthCountry(), refugeeCardData.getScope().getData().getSex(), refugeeCardData.getScope().getData().getNationality(), refugeeCardData.getScope().getData().getExpiryDate(), refugeeCardData.getScope().getData().getRefugeeStatus(), refugeeCardData.getScope().getData().getPicture(), refugeeCardData.getScope().getData().getFirstName(), refugeeCardData.getScope().getData().getSecondName(), refugeeCardData.getScope().getData().getSurname(), refugeeCardData.getScope().getData().getId(), refugeeCardData.getScope().getData().getFamilyName(), refugeeCardData.getScope().getData().getPesel())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RefugeeCardData d(o34.c cVar) {
        return new RefugeeCardData(null, new RefugeeCardScope(new RefugeeMnemonicHeader(cVar.getDataHeader().getTp(), cVar.getDataHeader().getStp(), cVar.getDataHeader().getVer(), cVar.getDataHeader().getDn(), cVar.getDataHeader().getSn(), cVar.getDataHeader().getIsr(), cVar.getDataHeader().getTs(), cVar.getDataHeader().getRId(), cVar.getDataHeader().getIid(), cVar.getDataHeader().getPesel(), cVar.getDataHeader().getInstitutionId(), cVar.getDataHeader().getId()), new ws1.c(cVar.getDataContainer().getBirthDate(), cVar.getDataContainer().getBirthPlace(), cVar.getDataContainer().getBirthCountry(), cVar.getDataContainer().getSex(), cVar.getDataContainer().getNationality(), cVar.getDataContainer().getExpiryDate(), cVar.getDataContainer().getRefugeeStatus(), cVar.getDataContainer().getPicture(), cVar.getDataContainer().getFirstName(), cVar.getDataContainer().getSecondName(), cVar.getDataContainer().getSurname(), cVar.getDataContainer().getId(), cVar.getDataContainer().getFamilyName(), cVar.getDataContainer().getPesel())));
    }
}
