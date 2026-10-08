package io.sentry.util;

import io.sentry.r6;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class e {
    public static boolean a(List<io.sentry.h0> list, r6 r6Var) {
        if (r6Var != null && list != null && !list.isEmpty()) {
            HashSet hashSet = new HashSet();
            io.sentry.protocol.k kVarS0 = r6Var.s0();
            if (kVarS0 != null) {
                String strE = kVarS0.e();
                if (strE != null) {
                    hashSet.add(strE);
                }
                String strD = kVarS0.d();
                if (strD != null) {
                    hashSet.add(strD);
                }
            }
            Throwable thO = r6Var.O();
            if (thO != null) {
                hashSet.add(thO.toString());
            }
            Iterator<io.sentry.h0> it = list.iterator();
            while (it.hasNext()) {
                if (hashSet.contains(it.next().a())) {
                    return true;
                }
            }
            for (io.sentry.h0 h0Var : list) {
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    if (h0Var.b((String) it4.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
