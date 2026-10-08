package ft;

import st.e1;
import vr.i0;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends r<Byte> {
    public d(byte b15) {
        super(Byte.valueOf(b15));
    }

    @Override // ft.g
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public e1 a(i0 i0Var) {
        return i0Var.i().u();
    }

    @Override // ft.g
    public String toString() {
        return b().intValue() + ".toByte()";
    }
}
