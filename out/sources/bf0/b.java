package bf0;

import dg0.UutDataContainer;
import ie0.MnemonicHeader;
import ie0.UutCardData;
import ie0.UutCardDocument;
import ie0.UutCardParentDocument;
import ie0.UutCardScope;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me0.DocumentPhotoData;
import me0.ItemData;
import me0.VerificationUutCardData;
import mx.Label;
import oq.p;
import p071kotlin.Metadata;
import pe0.AdditionalSectionData;
import pe0.VerificationDocumentData;
import pe0.e;
import pq.v;
import vf0.MnemonicHeaderContainer;
import vf0.c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\n\u001a\u00020\t*\u00020\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u0011\u0010\u000e\u001a\u00020\r*\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0011\u0010\u0012\u001a\u00020\u0011*\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0011\u0010\u0016\u001a\u00020\u0015*\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0011\u0010\u001a\u001a\u00020\u0019*\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0011\u0010\u001e\u001a\u00020\u001d*\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0011\u0010\"\u001a\u00020!*\u00020 ¢\u0006\u0004\b\"\u0010#\u001a\u0011\u0010&\u001a\u00020%*\u00020$¢\u0006\u0004\b&\u0010'¨\u0006("}, d2 = {"Ldg0/b;", "Lie0/e;", "d", "(Ldg0/b;)Lie0/e;", "Ldg0/a;", "Lie0/d;", "c", "(Ldg0/a;)Lie0/d;", "Lvf0/c;", "Lie0/a;", "a", "(Lvf0/c;)Lie0/a;", "Ldg0/c;", "Lie0/f;", "e", "(Ldg0/c;)Lie0/f;", "Lvf0/f;", "Lie0/b;", "b", "(Lvf0/f;)Lie0/b;", "Ldg0/d;", "Lie0/c;", "f", "(Ldg0/d;)Lie0/c;", "Lme0/f;", "Lpe0/d;", "h", "(Lme0/f;)Lpe0/d;", "Lme0/b;", "Lpe0/b;", "i", "(Lme0/b;)Lpe0/b;", "Lme0/c;", "Lpe0/c;", "j", "(Lme0/c;)Lpe0/c;", "Lme0/a;", "Lpe0/a;", "g", "(Lme0/a;)Lpe0/a;", "app_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19117a;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.INACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c.TO_UPDATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f19117a = iArr;
        }
    }

    public static final ie0.a a(c cVar) {
        int i15 = a.f19117a[cVar.ordinal()];
        if (i15 == 1) {
            return ie0.a.ACTIVE;
        }
        if (i15 == 2) {
            return ie0.a.INACTIVE;
        }
        if (i15 == 3) {
            return ie0.a.TO_UPDATE;
        }
        throw new p();
    }

    public static final MnemonicHeader b(MnemonicHeaderContainer mnemonicHeaderContainer) {
        return new MnemonicHeader(mnemonicHeaderContainer.getTp(), mnemonicHeaderContainer.getVer(), mnemonicHeaderContainer.getDn(), mnemonicHeaderContainer.getSn(), mnemonicHeaderContainer.getIsr(), mnemonicHeaderContainer.getTs(), mnemonicHeaderContainer.getIid(), mnemonicHeaderContainer.getPe(), mnemonicHeaderContainer.getStp(), mnemonicHeaderContainer.getRId(), mnemonicHeaderContainer.getIn(), mnemonicHeaderContainer.getId());
    }

    public static final UutCardDocument c(dg0.UutCardDocument uutCardDocument) {
        return new UutCardDocument(uutCardDocument.getDocumentId(), a(uutCardDocument.getDocumentStatus()), uutCardDocument.getScopeName(), e(uutCardDocument.getScopeData()));
    }

    public static final UutCardParentDocument d(dg0.UutCardParentDocument uutCardParentDocument) {
        String documentId = uutCardParentDocument.getDocumentId();
        List<dg0.UutCardDocument> listA = uutCardParentDocument.a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(c((dg0.UutCardDocument) it.next()));
        }
        return new UutCardParentDocument(documentId, arrayList);
    }

    public static final UutCardScope e(dg0.UutCardScope uutCardScope) {
        return new UutCardScope(b(uutCardScope.getHeader()), f(uutCardScope.getData()));
    }

    public static final UutCardData f(UutDataContainer uutDataContainer) {
        return new UutCardData(uutDataContainer.getOt(), uutDataContainer.getCh(), uutDataContainer.getSr(), uutDataContainer.getNo(), uutDataContainer.getN(), uutDataContainer.getTi(), uutDataContainer.getOc(), uutDataContainer.getKl(), uutDataContainer.getST(), uutDataContainer.getCC(), uutDataContainer.getID(), uutDataContainer.getED(), uutDataContainer.getQrC(), uutDataContainer.getS(), uutDataContainer.getSu(), uutDataContainer.getP(), uutDataContainer.getAD(), uutDataContainer.getADi());
    }

    public static final AdditionalSectionData g(me0.AdditionalSectionData additionalSectionData) {
        Label header = additionalSectionData.getHeader();
        List<ItemData> listB = additionalSectionData.b();
        ArrayList arrayList = new ArrayList(v.y(listB, 10));
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(j((ItemData) it.next()));
        }
        return new AdditionalSectionData(header, arrayList);
    }

    public static final VerificationDocumentData h(VerificationUutCardData verificationUutCardData) {
        String documentId = verificationUutCardData.getDocumentId();
        e eVar = e.UUT_CARD;
        Label documentTypeName = verificationUutCardData.getDocumentTypeName();
        int documentTypeIcon = verificationUutCardData.getDocumentTypeIcon();
        String scopeName = verificationUutCardData.getScopeName();
        DocumentPhotoData photoData = verificationUutCardData.getPhotoData();
        ArrayList arrayList = null;
        pe0.DocumentPhotoData documentPhotoDataI = photoData != null ? i(photoData) : null;
        List<ItemData> listG = verificationUutCardData.g();
        ArrayList arrayList2 = new ArrayList(v.y(listG, 10));
        Iterator<T> it = listG.iterator();
        while (it.hasNext()) {
            arrayList2.add(j((ItemData) it.next()));
        }
        List<me0.AdditionalSectionData> listA = verificationUutCardData.a();
        if (listA != null) {
            List<me0.AdditionalSectionData> list = listA;
            arrayList = new ArrayList(v.y(list, 10));
            Iterator<T> it4 = list.iterator();
            while (it4.hasNext()) {
                arrayList.add(g((me0.AdditionalSectionData) it4.next()));
            }
        }
        return new VerificationDocumentData(documentId, eVar, documentTypeName, documentTypeIcon, scopeName, documentPhotoDataI, arrayList2, null, arrayList, 128, null);
    }

    public static final pe0.DocumentPhotoData i(DocumentPhotoData documentPhotoData) {
        return new pe0.DocumentPhotoData(documentPhotoData.getPhoto(), documentPhotoData.getDocumentId(), documentPhotoData.getScopeName());
    }

    public static final pe0.ItemData j(ItemData itemData) {
        return new pe0.ItemData(itemData.getLabel(), itemData.getValue());
    }
}
