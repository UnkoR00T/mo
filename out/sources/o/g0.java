package o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g0 {

    static final class a implements v.m1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final List<v.o1> f139961a;

        a(List<v.o1> list) {
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException("Cannot set an empty CaptureStage list.");
            }
            this.f139961a = Collections.unmodifiableList(new ArrayList(list));
        }

        @Override // v.m1
        public List<v.o1> a() {
            return this.f139961a;
        }
    }

    static v.m1 a(v.o1... o1VarArr) {
        return new a(Arrays.asList(o1VarArr));
    }

    public static v.m1 b() {
        return a(new v.o1.a());
    }
}
