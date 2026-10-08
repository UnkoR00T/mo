package com.google.crypto.tink.shaded.protobuf;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f36162b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile p f36163c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final p f36164d = new p(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<a, y.e<?, ?>> f36165a;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f36166a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f36167b;

        a(Object obj, int i15) {
            this.f36166a = obj;
            this.f36167b = i15;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f36166a == aVar.f36166a && this.f36167b == aVar.f36167b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f36166a) * 65535) + this.f36167b;
        }
    }

    p() {
        this.f36165a = new HashMap();
    }

    public static p b() {
        p pVarA;
        p pVar = f36163c;
        if (pVar != null) {
            return pVar;
        }
        synchronized (p.class) {
            try {
                pVarA = f36163c;
                if (pVarA == null) {
                    pVarA = f36162b ? o.a() : f36164d;
                    f36163c = pVarA;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return pVarA;
    }

    public <ContainingType extends r0> y.e<ContainingType, ?> a(ContainingType containingtype, int i15) {
        return (y.e) this.f36165a.get(new a(containingtype, i15));
    }

    p(boolean z15) {
        this.f36165a = Collections.EMPTY_MAP;
    }
}
