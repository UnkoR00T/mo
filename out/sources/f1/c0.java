package f1;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lf1/b0;", "", "a", "(Lf1/b0;)I", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class c0 {
    public static final int a(b0 b0Var) {
        List<q> listJ = b0Var.j();
        if (listJ.isEmpty()) {
            return 0;
        }
        int size = listJ.size();
        int size2 = 0;
        for (int i15 = 0; i15 < size; i15++) {
            size2 += listJ.get(i15).getSize();
        }
        return (size2 / listJ.size()) + b0Var.h();
    }
}
