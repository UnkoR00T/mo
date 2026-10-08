package bf0;

import bc0.DocumentPhotoData;
import bc0.ItemData;
import bc0.VerificationFamilyCardData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mx.Label;
import p071kotlin.Metadata;
import pe0.AdditionalSectionData;
import pe0.VerificationDocumentData;
import pe0.e;
import pq.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\n\u001a\u00020\t*\u00020\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u0011\u0010\u000e\u001a\u00020\r*\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lbc0/f;", "Lpe0/d;", "b", "(Lbc0/f;)Lpe0/d;", "Lbc0/b;", "Lpe0/b;", "c", "(Lbc0/b;)Lpe0/b;", "Lbc0/e;", "Lpe0/c;", "d", "(Lbc0/e;)Lpe0/c;", "Lbc0/a;", "Lpe0/a;", "a", "(Lbc0/a;)Lpe0/a;", "app_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {
    public static final AdditionalSectionData a(bc0.AdditionalSectionData additionalSectionData) {
        Label header = additionalSectionData.getHeader();
        List<ItemData> listB = additionalSectionData.b();
        ArrayList arrayList = new ArrayList(v.y(listB, 10));
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(d((ItemData) it.next()));
        }
        return new AdditionalSectionData(header, arrayList);
    }

    public static final VerificationDocumentData b(VerificationFamilyCardData verificationFamilyCardData) {
        String documentId = verificationFamilyCardData.getDocumentId();
        e eVar = e.FAMILY_CARD;
        Label documentTypeName = verificationFamilyCardData.getDocumentTypeName();
        int documentTypeIcon = verificationFamilyCardData.getDocumentTypeIcon();
        String scopeName = verificationFamilyCardData.getScopeName();
        DocumentPhotoData photoData = verificationFamilyCardData.getPhotoData();
        ArrayList arrayList = null;
        pe0.DocumentPhotoData documentPhotoDataC = photoData != null ? c(photoData) : null;
        List<ItemData> listG = verificationFamilyCardData.g();
        ArrayList arrayList2 = new ArrayList(v.y(listG, 10));
        Iterator<T> it = listG.iterator();
        while (it.hasNext()) {
            arrayList2.add(d((ItemData) it.next()));
        }
        List<bc0.AdditionalSectionData> listA = verificationFamilyCardData.a();
        if (listA != null) {
            List<bc0.AdditionalSectionData> list = listA;
            arrayList = new ArrayList(v.y(list, 10));
            Iterator<T> it4 = list.iterator();
            while (it4.hasNext()) {
                arrayList.add(a((bc0.AdditionalSectionData) it4.next()));
            }
        }
        return new VerificationDocumentData(documentId, eVar, documentTypeName, documentTypeIcon, scopeName, documentPhotoDataC, arrayList2, null, arrayList, 128, null);
    }

    public static final pe0.DocumentPhotoData c(DocumentPhotoData documentPhotoData) {
        return new pe0.DocumentPhotoData(documentPhotoData.getPhoto(), documentPhotoData.getDocumentId(), documentPhotoData.getScopeName());
    }

    public static final pe0.ItemData d(ItemData itemData) {
        return new pe0.ItemData(itemData.getLabel(), itemData.getValue());
    }
}
