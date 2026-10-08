package f8;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y f60076a = new y() { // from class: f8.w
        @Override // f8.y
        public final List b(String str, boolean z15, boolean z16) {
            return d0.k(str, z15, z16);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final y f60077b = new y() { // from class: f8.x
        @Override // f8.y
        public final List b(String str, boolean z15, boolean z16) {
            return d0.o(y.f60076a.b(str, z15, z16));
        }
    };

    List<p> b(String str, boolean z15, boolean z16);
}
