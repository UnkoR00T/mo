package gj2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k34.WruDocumentData;
import k34.WruDocumentItem;
import k34.d0;
import kj2.LocalDocumentDataContainerItem;
import kj2.LocalDocumentDataWrapped;
import mx.Label;
import mx.b;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkj2/c;", "Lk34/k0;", "a", "(Lkj2/c;)Lk34/k0;", "legacy_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {
    public static final WruDocumentData a(LocalDocumentDataWrapped localDocumentDataWrapped) {
        String strE = localDocumentDataWrapped.getDataHeader().e();
        int iP = localDocumentDataWrapped.getDataHeader().p();
        String strT = localDocumentDataWrapped.getDataHeader().t();
        if (strT == null) {
            strT = new String();
        }
        String str = strT;
        long jR = localDocumentDataWrapped.getDataHeader().r();
        d0 d0VarA = d0.INSTANCE.a(localDocumentDataWrapped.getDataContainer().getTemplateType());
        String documentName = localDocumentDataWrapped.getDataContainer().getDocumentName();
        String documentLogo = localDocumentDataWrapped.getDataContainer().getDocumentLogo();
        String additionalDescription = localDocumentDataWrapped.getDataContainer().getAdditionalDescription();
        List<LocalDocumentDataContainerItem> listC = localDocumentDataWrapped.getDataContainer().c();
        ArrayList arrayList = new ArrayList(v.y(listC, 10));
        Iterator<T> it = listC.iterator();
        int i15 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            LocalDocumentDataContainerItem localDocumentDataContainerItem = (LocalDocumentDataContainerItem) next;
            String dataType = localDocumentDataContainerItem.getDataType();
            if (dataType == null) {
                dataType = new String();
            }
            String value = localDocumentDataContainerItem.getValue();
            if (value == null) {
                value = new String();
            }
            String label = localDocumentDataContainerItem.getLabel();
            Label labelB = b.b(label != null ? label : "", "wruDocumentItemLabel_" + i15);
            String type = localDocumentDataContainerItem.getType();
            if (type == null) {
                type = new String();
            }
            String str2 = type;
            Boolean share = localDocumentDataContainerItem.getShare();
            arrayList.add(new WruDocumentItem(dataType, value, labelB, str2, share != null ? share.booleanValue() : false));
            i15 = i16;
        }
        List<LocalDocumentDataContainerItem> listA = localDocumentDataWrapped.getDataContainer().a();
        ArrayList arrayList2 = new ArrayList(v.y(listA, 10));
        Iterator it4 = listA.iterator();
        int i17 = 0;
        while (it4.hasNext()) {
            Object next2 = it4.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                v.x();
            }
            LocalDocumentDataContainerItem localDocumentDataContainerItem2 = (LocalDocumentDataContainerItem) next2;
            String dataType2 = localDocumentDataContainerItem2.getDataType();
            if (dataType2 == null) {
                dataType2 = new String();
            }
            String value2 = localDocumentDataContainerItem2.getValue();
            if (value2 == null) {
                value2 = new String();
            }
            String label2 = localDocumentDataContainerItem2.getLabel();
            if (label2 == null) {
                label2 = new String();
            }
            Iterator it5 = it4;
            String str3 = strE;
            Label labelB2 = b.b(label2, "wruAdditionalDocumentItemLabel_" + i17);
            String type2 = localDocumentDataContainerItem2.getType();
            if (type2 == null) {
                type2 = new String();
            }
            String str4 = type2;
            Boolean share2 = localDocumentDataContainerItem2.getShare();
            arrayList2.add(new WruDocumentItem(dataType2, value2, labelB2, str4, share2 != null ? share2.booleanValue() : false));
            i17 = i18;
            it4 = it5;
            strE = str3;
        }
        String str5 = strE;
        String strJ = localDocumentDataWrapped.getDataHeader().j();
        return new WruDocumentData(str5, strJ == null ? "" : strJ, iP, str, jR, d0VarA, documentName, documentLogo, additionalDescription, arrayList, arrayList2, localDocumentDataWrapped.getDataHeader().b());
    }
}
