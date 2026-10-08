package p036e4;

import c5.c;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bç\u0080\u0001\u0018\u00002\u00020\u0001J)\u0010\b\u001a\u00020\u0006*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ)\u0010\u000b\u001a\u00020\u0006*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\tJ)\u0010\f\u001a\u00020\u0006*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\tJ)\u0010\r\u001a\u00020\u0006*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\tJ)\u0010\u0013\u001a\u00020\u0012*\u00020\u000e2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0013\u0010\u0014ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0003"}, d2 = {"Le4/w0;", "", "Le4/w;", "", "Le4/v;", "measurables", "", "height", "c", "(Le4/w;Ljava/util/List;I)I", "width", "h", "i", "f", "Le4/y0;", "Le4/v0;", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "Le4/x0;", "measure", "(Le4/y0;Ljava/util/List;Lc5/b;)Le4/x0;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface w0 {
    default int c(w wVar, List<? extends v> list, int i15) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i16 = 0; i16 < size; i16++) {
            arrayList.add(new n(list.get(i16), x.Min, y.Width));
        }
        return e(new z(wVar, wVar.getLayoutDirection()), arrayList, c.b(0, 0, 0, i15, 7, null)).getF47486a();
    }

    x0 e(y0 y0Var, List<? extends v0> list, long j15);

    default int f(w wVar, List<? extends v> list, int i15) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i16 = 0; i16 < size; i16++) {
            arrayList.add(new n(list.get(i16), x.Max, y.Height));
        }
        return e(new z(wVar, wVar.getLayoutDirection()), arrayList, c.b(0, i15, 0, 0, 13, null)).getF47487b();
    }

    default int h(w wVar, List<? extends v> list, int i15) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i16 = 0; i16 < size; i16++) {
            arrayList.add(new n(list.get(i16), x.Min, y.Height));
        }
        return e(new z(wVar, wVar.getLayoutDirection()), arrayList, c.b(0, i15, 0, 0, 13, null)).getF47487b();
    }

    default int i(w wVar, List<? extends v> list, int i15) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i16 = 0; i16 < size; i16++) {
            arrayList.add(new n(list.get(i16), x.Max, y.Width));
        }
        return e(new z(wVar, wVar.getLayoutDirection()), arrayList, c.b(0, 0, 0, i15, 7, null)).getF47486a();
    }
}
