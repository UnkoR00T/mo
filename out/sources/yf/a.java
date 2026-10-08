package yf;

import ak.n0;
import bg.c;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f226677b = c.c(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f226678c = c.c(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final nf.a<a> f226679d = new nf.c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0<Integer> f226680a;

    public a(qf.c cVar, List<Integer> list) {
        if (list.isEmpty()) {
            this.f226680a = n0.v(list);
        } else {
            if (((Integer) Collections.min(list)).intValue() < 0) {
                throw new IndexOutOfBoundsException();
            }
            ((Integer) Collections.max(list)).intValue();
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        throw null;
    }
}
