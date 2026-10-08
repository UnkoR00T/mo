package com.google.android.gms.internal.vision;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class y1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile y1 f31333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile y1 f31334c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final y1 f31335d = new y1(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<a, l2.d<?, ?>> f31336a;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f31337a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f31338b;

        a(Object obj, int i15) {
            this.f31337a = obj;
            this.f31338b = i15;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f31337a == aVar.f31337a && this.f31338b == aVar.f31338b;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f31337a) * 65535) + this.f31338b;
        }
    }

    y1() {
        this.f31336a = new HashMap();
    }

    public static y1 b() {
        y1 y1Var;
        y1 y1Var2 = f31333b;
        if (y1Var2 != null) {
            return y1Var2;
        }
        synchronized (y1.class) {
            try {
                y1Var = f31333b;
                if (y1Var == null) {
                    y1Var = f31335d;
                    f31333b = y1Var;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return y1Var;
    }

    public static y1 c() {
        y1 y1Var = f31334c;
        if (y1Var != null) {
            return y1Var;
        }
        synchronized (y1.class) {
            try {
                y1 y1Var2 = f31334c;
                if (y1Var2 != null) {
                    return y1Var2;
                }
                y1 y1VarB = j2.b(y1.class);
                f31334c = y1VarB;
                return y1VarB;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public final <ContainingType extends u3> l2.d<ContainingType, ?> a(ContainingType containingtype, int i15) {
        return (l2.d) this.f31336a.get(new a(containingtype, i15));
    }

    private y1(boolean z15) {
        this.f31336a = Collections.EMPTY_MAP;
    }
}
