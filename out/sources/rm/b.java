package rm;

import java.util.concurrent.Executor;
import jg.r;

/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f174847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f174848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f174849c;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f174850a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f174851b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Executor f174852c;

        public b a() {
            return new b(this.f174850a, this.f174851b, this.f174852c, null, null);
        }

        public a b(int i15, int... iArr) {
            this.f174850a = i15;
            if (iArr != null) {
                for (int i16 : iArr) {
                    this.f174850a = i16 | this.f174850a;
                }
            }
            return this;
        }
    }

    /* synthetic */ b(int i15, boolean z15, Executor executor, d dVar, e eVar) {
        this.f174847a = i15;
        this.f174848b = z15;
        this.f174849c = executor;
    }

    public final int a() {
        return this.f174847a;
    }

    public final d b() {
        return null;
    }

    public final Executor c() {
        return this.f174849c;
    }

    public final boolean d() {
        return this.f174848b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f174847a == bVar.f174847a && this.f174848b == bVar.f174848b && r.a(this.f174849c, bVar.f174849c) && r.a(null, null);
    }

    public int hashCode() {
        return r.b(Integer.valueOf(this.f174847a), Boolean.valueOf(this.f174848b), this.f174849c, null);
    }
}
