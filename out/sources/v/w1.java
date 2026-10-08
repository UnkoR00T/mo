package v;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w1 f202897a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<Integer> f202898b = Collections.unmodifiableList(Arrays.asList(13, 10, 8, 11, 6, 5, 4, 9, 3, 7, 2));

    class a implements w1 {
        a() {
        }

        @Override // v.w1
        public boolean a(int i15) {
            return false;
        }

        @Override // v.w1
        public x1 b(int i15) {
            return null;
        }
    }

    boolean a(int i15);

    x1 b(int i15);
}
