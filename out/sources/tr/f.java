package tr;

import sr.p;

/* JADX INFO: loaded from: classes4.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zs.c f191720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f191721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f191722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final zs.b f191723d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f191724e;

    public static final class a extends f {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f191725f = new a();

        private a() {
            super(p.B, "Function", false, null, true);
        }
    }

    public static final class b extends f {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f191726f = new b();

        private b() {
            super(p.f183627y, "KFunction", true, null, false);
        }
    }

    public static final class c extends f {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final c f191727f = new c();

        private c() {
            super(p.f183627y, "KSuspendFunction", true, null, false);
        }
    }

    public static final class d extends f {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final d f191728f = new d();

        private d() {
            super(p.f183621s, "SuspendFunction", false, null, true);
        }
    }

    public f(zs.c cVar, String str, boolean z15, zs.b bVar, boolean z16) {
        this.f191720a = cVar;
        this.f191721b = str;
        this.f191722c = z15;
        this.f191723d = bVar;
        this.f191724e = z16;
    }

    public final String a() {
        return this.f191721b;
    }

    public final zs.c b() {
        return this.f191720a;
    }

    public final zs.f c(int i15) {
        return zs.f.l(this.f191721b + i15);
    }

    public String toString() {
        return this.f191720a + '.' + this.f191721b + 'N';
    }
}
