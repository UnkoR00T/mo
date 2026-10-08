package ze;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o {

    public static abstract class a {
        public abstract o a();

        public abstract a b(q qVar);

        public abstract a c(b bVar);
    }

    public enum b {
        NOT_SET(0),
        EVENT_OVERRIDE(5);


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final SparseArray<b> f234574d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f234576a;

        static {
            b bVar = NOT_SET;
            b bVar2 = EVENT_OVERRIDE;
            SparseArray<b> sparseArray = new SparseArray<>();
            f234574d = sparseArray;
            sparseArray.put(0, bVar);
            sparseArray.put(5, bVar2);
        }

        b(int i15) {
            this.f234576a = i15;
        }
    }

    public static a a() {
        return new f.b();
    }

    public abstract q b();

    public abstract b c();
}
