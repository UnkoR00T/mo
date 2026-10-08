package u4;

import java.util.ArrayList;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lu4/x;", "", "<init>", "()V", "", "Lu4/k;", "fontList", "Lu4/d0;", "fontWeight", "Lu4/y;", "fontStyle", "a", "(Ljava/util/List;Lu4/d0;I)Ljava/util/List;", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class x {
    public final List<k> a(List<? extends k> fontList, FontWeight fontWeight, int fontStyle) {
        ArrayList arrayList = new ArrayList(fontList.size());
        List<? extends k> list = fontList;
        int size = list.size();
        int i15 = 0;
        for (int i16 = 0; i16 < size; i16++) {
            k kVar = fontList.get(i16);
            k kVar2 = kVar;
            if (fr.t.c(kVar2.b(), fontWeight) && y.f(kVar2.c(), fontStyle)) {
                arrayList.add(kVar);
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(fontList.size());
        int size2 = list.size();
        for (int i17 = 0; i17 < size2; i17++) {
            k kVar3 = fontList.get(i17);
            if (y.f(kVar3.c(), fontStyle)) {
                arrayList2.add(kVar3);
            }
        }
        if (!arrayList2.isEmpty()) {
            fontList = arrayList2;
        }
        List<? extends k> list2 = fontList;
        FontWeight.Companion companion = FontWeight.INSTANCE;
        FontWeight fontWeight2 = null;
        if (fontWeight.compareTo(companion.e()) < 0) {
            List<? extends k> list3 = list2;
            int size3 = list3.size();
            FontWeight fontWeight3 = null;
            for (int i18 = 0; i18 < size3; i18++) {
                FontWeight fontWeightB = list2.get(i18).b();
                if (fontWeightB.compareTo(fontWeight) >= 0) {
                    if (fontWeightB.compareTo(fontWeight) <= 0) {
                        fontWeight2 = fontWeightB;
                        fontWeight3 = fontWeight2;
                        break;
                    }
                    if (fontWeight3 == null || fontWeightB.compareTo(fontWeight3) < 0) {
                        fontWeight3 = fontWeightB;
                    }
                } else if (fontWeight2 == null || fontWeightB.compareTo(fontWeight2) > 0) {
                    fontWeight2 = fontWeightB;
                }
            }
            if (fontWeight2 == null) {
                fontWeight2 = fontWeight3;
            }
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size4 = list3.size();
            while (i15 < size4) {
                k kVar4 = list2.get(i15);
                if (fr.t.c(kVar4.b(), fontWeight2)) {
                    arrayList3.add(kVar4);
                }
                i15++;
            }
            return arrayList3;
        }
        if (fontWeight.compareTo(companion.f()) > 0) {
            List<? extends k> list4 = list2;
            int size5 = list4.size();
            FontWeight fontWeight4 = null;
            for (int i19 = 0; i19 < size5; i19++) {
                FontWeight fontWeightB2 = list2.get(i19).b();
                if (fontWeightB2.compareTo(fontWeight) >= 0) {
                    if (fontWeightB2.compareTo(fontWeight) <= 0) {
                        fontWeight2 = fontWeightB2;
                        fontWeight4 = fontWeight2;
                        break;
                    }
                    if (fontWeight4 == null || fontWeightB2.compareTo(fontWeight4) < 0) {
                        fontWeight4 = fontWeightB2;
                    }
                } else if (fontWeight2 == null || fontWeightB2.compareTo(fontWeight2) > 0) {
                    fontWeight2 = fontWeightB2;
                }
            }
            if (fontWeight4 != null) {
                fontWeight2 = fontWeight4;
            }
            ArrayList arrayList4 = new ArrayList(list2.size());
            int size6 = list4.size();
            while (i15 < size6) {
                k kVar5 = list2.get(i15);
                if (fr.t.c(kVar5.b(), fontWeight2)) {
                    arrayList4.add(kVar5);
                }
                i15++;
            }
            return arrayList4;
        }
        FontWeight fontWeightF = companion.f();
        List<? extends k> list5 = list2;
        int size7 = list5.size();
        FontWeight fontWeight5 = null;
        FontWeight fontWeight6 = null;
        for (int i25 = 0; i25 < size7; i25++) {
            FontWeight fontWeightB3 = list2.get(i25).b();
            if (fontWeightF == null || fontWeightB3.compareTo(fontWeightF) <= 0) {
                if (fontWeightB3.compareTo(fontWeight) >= 0) {
                    if (fontWeightB3.compareTo(fontWeight) <= 0) {
                        fontWeight5 = fontWeightB3;
                        fontWeight6 = fontWeight5;
                        break;
                    }
                    if (fontWeight6 == null || fontWeightB3.compareTo(fontWeight6) < 0) {
                        fontWeight6 = fontWeightB3;
                    }
                } else if (fontWeight5 == null || fontWeightB3.compareTo(fontWeight5) > 0) {
                    fontWeight5 = fontWeightB3;
                }
            }
        }
        if (fontWeight6 != null) {
            fontWeight5 = fontWeight6;
        }
        ArrayList arrayList5 = new ArrayList(list2.size());
        int size8 = list5.size();
        for (int i26 = 0; i26 < size8; i26++) {
            k kVar6 = list2.get(i26);
            if (fr.t.c(kVar6.b(), fontWeight5)) {
                arrayList5.add(kVar6);
            }
        }
        if (!arrayList5.isEmpty()) {
            return arrayList5;
        }
        FontWeight fontWeightF2 = FontWeight.INSTANCE.f();
        int size9 = list5.size();
        FontWeight fontWeight7 = null;
        for (int i27 = 0; i27 < size9; i27++) {
            FontWeight fontWeightB4 = list2.get(i27).b();
            if (fontWeightF2 == null || fontWeightB4.compareTo(fontWeightF2) >= 0) {
                if (fontWeightB4.compareTo(fontWeight) >= 0) {
                    if (fontWeightB4.compareTo(fontWeight) <= 0) {
                        fontWeight2 = fontWeightB4;
                        fontWeight7 = fontWeight2;
                        break;
                    }
                    if (fontWeight7 == null || fontWeightB4.compareTo(fontWeight7) < 0) {
                        fontWeight7 = fontWeightB4;
                    }
                } else if (fontWeight2 == null || fontWeightB4.compareTo(fontWeight2) > 0) {
                    fontWeight2 = fontWeightB4;
                }
            }
        }
        if (fontWeight7 != null) {
            fontWeight2 = fontWeight7;
        }
        ArrayList arrayList6 = new ArrayList(list2.size());
        int size10 = list5.size();
        while (i15 < size10) {
            k kVar7 = list2.get(i15);
            if (fr.t.c(kVar7.b(), fontWeight2)) {
                arrayList6.add(kVar7);
            }
            i15++;
        }
        return arrayList6;
    }
}
