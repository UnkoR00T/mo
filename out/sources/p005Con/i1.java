package p005Con;

import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d;
import fu.a;
import fu.k0;
import fu.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import oq.z;
import pq.v;

/* JADX INFO: loaded from: classes.dex */
public abstract class i1 {
    public static final String a(byte[] bArr) {
        ArrayList<String> arrayList = new ArrayList(bArr.length);
        for (byte b15 : bArr) {
            arrayList.add(k0.a(z.e(b15), 16));
        }
        ArrayList arrayList2 = new ArrayList(v.y(arrayList, 10));
        for (String strConcat : arrayList) {
            if (strConcat.length() == 1) {
                strConcat = d.f37012h1.concat(strConcat);
            }
            arrayList2.add(strConcat);
        }
        return v.v0(arrayList2, "", null, null, 0, null, null, 62, null);
    }

    public static final byte[] b(String str) {
        List<String> listZ1 = r.z1(r.P(str, " ", "", false, 4, null), 2);
        ArrayList arrayList = new ArrayList(v.y(listZ1, 10));
        Iterator<T> it = listZ1.iterator();
        while (it.hasNext()) {
            arrayList.add(Byte.valueOf((byte) Integer.parseInt((String) it.next(), a.a(16))));
        }
        return v.a1(arrayList);
    }
}
