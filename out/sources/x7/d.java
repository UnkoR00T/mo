package x7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import w7.c0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f217150a;

    public static final class b extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f217151b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<c> f217152c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List<b> f217153d;

        public b(int i15, long j15) {
            super(i15);
            this.f217151b = j15;
            this.f217152c = new ArrayList();
            this.f217153d = new ArrayList();
        }

        public void b(b bVar) {
            this.f217153d.add(bVar);
        }

        public void c(c cVar) {
            this.f217152c.add(cVar);
        }

        public b d(int i15) {
            int size = this.f217153d.size();
            for (int i16 = 0; i16 < size; i16++) {
                b bVar = this.f217153d.get(i16);
                if (bVar.f217150a == i15) {
                    return bVar;
                }
            }
            return null;
        }

        public c e(int i15) {
            int size = this.f217152c.size();
            for (int i16 = 0; i16 < size; i16++) {
                c cVar = this.f217152c.get(i16);
                if (cVar.f217150a == i15) {
                    return cVar;
                }
            }
            return null;
        }

        @Override // x7.d
        public String toString() {
            return d.a(this.f217150a) + " leaves: " + Arrays.toString(this.f217152c.toArray()) + " containers: " + Arrays.toString(this.f217153d.toArray());
        }
    }

    public static final class c extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c0 f217154b;

        public c(int i15, c0 c0Var) {
            super(i15);
            this.f217154b = c0Var;
        }
    }

    public static String a(int i15) {
        return "" + ((char) ((i15 >> 24) & GF2Field.MASK)) + ((char) ((i15 >> 16) & GF2Field.MASK)) + ((char) ((i15 >> 8) & GF2Field.MASK)) + ((char) (i15 & GF2Field.MASK));
    }

    public String toString() {
        return a(this.f217150a);
    }

    private d(int i15) {
        this.f217150a = i15;
    }
}
