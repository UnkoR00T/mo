package o8;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public interface u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f143202a = new u() { // from class: o8.t
        @Override // o8.u
        public final p[] f() {
            return u.e();
        }
    };

    static /* synthetic */ p[] e() {
        return new p[0];
    }

    default u a(l9.s.a aVar) {
        return this;
    }

    default u b(int i15) {
        return this;
    }

    @Deprecated
    default u c(boolean z15) {
        return this;
    }

    default p[] d(Uri uri, Map<String, List<String>> map) {
        return f();
    }

    p[] f();
}
