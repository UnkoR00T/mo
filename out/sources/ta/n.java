package ta;

import fr.t;
import java.util.ArrayList;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\u0007\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\u0006\u001a\u001f\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lya/d;", "stmt", "", "name", "", "c", "(Lya/d;Ljava/lang/String;)I", "a", "b", "room-runtime"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "androidx/room/util/SQLiteStatementUtil")
final /* synthetic */ class n {
    public static final int a(ya.d dVar, String str) {
        if (dVar instanceof g) {
            return ((g) dVar).getColumnIndex(str);
        }
        int columnCount = dVar.getColumnCount();
        for (int i15 = 0; i15 < columnCount; i15++) {
            if (t.c(str, dVar.getColumnName(i15))) {
                return i15;
            }
        }
        return -1;
    }

    public static final int b(ya.d dVar, String str) {
        return m.a(dVar, str);
    }

    public static final int c(ya.d dVar, String str) {
        int iA = m.a(dVar, str);
        if (iA >= 0) {
            return iA;
        }
        int columnCount = dVar.getColumnCount();
        ArrayList arrayList = new ArrayList(columnCount);
        for (int i15 = 0; i15 < columnCount; i15++) {
            arrayList.add(dVar.getColumnName(i15));
        }
        throw new IllegalArgumentException("Column '" + str + "' does not exist. Available columns: [" + v.v0(arrayList, null, null, null, 0, null, null, 63, null) + ']');
    }
}
