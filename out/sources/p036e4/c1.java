package p036e4;

import c5.c;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\bç\u0080\u0001\u0018\u00002\u00020\u0001J/\u0010\t\u001a\u00020\b*\u00020\u00022\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00032\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ/\u0010\u000f\u001a\u00020\r*\u00020\u000b2\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00030\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0012\u001a\u00020\r*\u00020\u000b2\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00030\u00032\u0006\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0010J/\u0010\u0013\u001a\u00020\r*\u00020\u000b2\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00030\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0010J/\u0010\u0014\u001a\u00020\r*\u00020\u000b2\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00030\u00032\u0006\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0001"}, d2 = {"Le4/c1;", "", "Le4/y0;", "", "Le4/v0;", "measurables", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "Le4/x0;", "e", "(Le4/y0;Ljava/util/List;J)Le4/x0;", "Le4/w;", "Le4/v;", "", "height", "c", "(Le4/w;Ljava/util/List;I)I", "width", "h", "i", "f", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface c1 {
    default int c(w wVar, List<? extends List<? extends v>> list, int i15) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i16 = 0; i16 < size; i16++) {
            List<? extends v> list2 = list.get(i16);
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i17 = 0; i17 < size2; i17++) {
                arrayList2.add(new n(list2.get(i17), x.Min, y.Width));
            }
            arrayList.add(arrayList2);
        }
        return e(new z(wVar, wVar.getLayoutDirection()), arrayList, c.b(0, 0, 0, i15, 7, null)).getF47486a();
    }

    x0 e(y0 y0Var, List<? extends List<? extends v0>> list, long j15);

    default int f(w wVar, List<? extends List<? extends v>> list, int i15) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i16 = 0; i16 < size; i16++) {
            List<? extends v> list2 = list.get(i16);
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i17 = 0; i17 < size2; i17++) {
                arrayList2.add(new n(list2.get(i17), x.Max, y.Height));
            }
            arrayList.add(arrayList2);
        }
        return e(new z(wVar, wVar.getLayoutDirection()), arrayList, c.b(0, i15, 0, 0, 13, null)).getF47487b();
    }

    default int h(w wVar, List<? extends List<? extends v>> list, int i15) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i16 = 0; i16 < size; i16++) {
            List<? extends v> list2 = list.get(i16);
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i17 = 0; i17 < size2; i17++) {
                arrayList2.add(new n(list2.get(i17), x.Min, y.Height));
            }
            arrayList.add(arrayList2);
        }
        return e(new z(wVar, wVar.getLayoutDirection()), arrayList, c.b(0, i15, 0, 0, 13, null)).getF47487b();
    }

    default int i(w wVar, List<? extends List<? extends v>> list, int i15) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i16 = 0; i16 < size; i16++) {
            List<? extends v> list2 = list.get(i16);
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i17 = 0; i17 < size2; i17++) {
                arrayList2.add(new n(list2.get(i17), x.Max, y.Width));
            }
            arrayList.add(arrayList2);
        }
        return e(new z(wVar, wVar.getLayoutDirection()), arrayList, c.b(0, 0, 0, i15, 7, null)).getF47486a();
    }
}
