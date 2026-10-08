package ft;

import st.e1;
import vr.i0;

/* JADX INFO: loaded from: classes4.dex */
public final class x extends r<Short> {
    public x(short s15) {
        super(Short.valueOf(s15));
    }

    @Override // ft.g
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public e1 a(i0 i0Var) {
        return i0Var.i().U();
    }

    @Override // ft.g
    public String toString() {
        return b().intValue() + ".toShort()";
    }
}
