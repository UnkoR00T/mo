package wr;

import java.util.Map;
import st.t0;
import vr.h1;

/* JADX INFO: loaded from: classes4.dex */
public interface c {

    public static final class a {
        public static zs.c a(c cVar) {
            vr.e eVarL = ht.e.l(cVar);
            if (eVarL != null) {
                if (ut.l.m(eVarL)) {
                    eVarL = null;
                }
                if (eVarL != null) {
                    return ht.e.k(eVarL);
                }
            }
            return null;
        }
    }

    Map<zs.f, ft.g<?>> a();

    zs.c g();

    t0 getType();

    h1 m();
}
