package k8;

import h8.a0;
import h8.x;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public interface j {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final x f109095a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a0 f109096b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final IOException f109097c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f109098d;

        public a(x xVar, a0 a0Var, IOException iOException, int i15) {
            this.f109095a = xVar;
            this.f109096b = a0Var;
            this.f109097c = iOException;
            this.f109098d = i15;
        }
    }

    long a(a aVar);

    int b(int i15);

    default void c(long j15) {
    }
}
