package tv;

import java.io.EOFException;
import lr.m;
import p071kotlin.Metadata;
import vv.e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvv/e;", "", "a", "(Lvv/e;)Z", "okhttp-logging-interceptor"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class b {
    public static final boolean a(e eVar) {
        try {
            e eVar2 = new e();
            eVar.H(eVar2, 0L, m.k(eVar.getSize(), 64L));
            for (int i15 = 0; i15 < 16 && !eVar2.K2(); i15++) {
                int iT0 = eVar2.T0();
                if (Character.isISOControl(iT0) && !Character.isWhitespace(iT0)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
