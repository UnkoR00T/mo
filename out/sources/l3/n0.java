package l3;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0001\u0001\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Ll3/n0;", "Lg4/g;", "Ll3/g;", "focusDirection", "", "Q", "(I)Z", "Ll3/l0;", "d0", "()Ll3/l0;", "focusState", "Ll3/p0;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface n0 extends g4.g {
    static /* synthetic */ boolean X1(n0 n0Var, int i15, int i16, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestFocus-3ESFkO8");
        }
        if ((i16 & 1) != 0) {
            i15 = g.INSTANCE.b();
        }
        return n0Var.Q(i15);
    }

    boolean Q(int focusDirection);

    l0 d0();
}
