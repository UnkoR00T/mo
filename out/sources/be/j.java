package be;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f18722a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f18723b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f18724c = new c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j f18725d = new d();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final j f18726e = new e();

    class a extends j {
        a() {
        }

        @Override // be.j
        public boolean a() {
            return true;
        }

        @Override // be.j
        public boolean b() {
            return true;
        }

        @Override // be.j
        public boolean c(zd.a aVar) {
            return aVar == zd.a.REMOTE;
        }

        @Override // be.j
        public boolean d(boolean z15, zd.a aVar, zd.c cVar) {
            return (aVar == zd.a.RESOURCE_DISK_CACHE || aVar == zd.a.MEMORY_CACHE) ? false : true;
        }
    }

    class b extends j {
        b() {
        }

        @Override // be.j
        public boolean a() {
            return false;
        }

        @Override // be.j
        public boolean b() {
            return false;
        }

        @Override // be.j
        public boolean c(zd.a aVar) {
            return false;
        }

        @Override // be.j
        public boolean d(boolean z15, zd.a aVar, zd.c cVar) {
            return false;
        }
    }

    class c extends j {
        c() {
        }

        @Override // be.j
        public boolean a() {
            return true;
        }

        @Override // be.j
        public boolean b() {
            return false;
        }

        @Override // be.j
        public boolean c(zd.a aVar) {
            return (aVar == zd.a.DATA_DISK_CACHE || aVar == zd.a.MEMORY_CACHE) ? false : true;
        }

        @Override // be.j
        public boolean d(boolean z15, zd.a aVar, zd.c cVar) {
            return false;
        }
    }

    class d extends j {
        d() {
        }

        @Override // be.j
        public boolean a() {
            return false;
        }

        @Override // be.j
        public boolean b() {
            return true;
        }

        @Override // be.j
        public boolean c(zd.a aVar) {
            return false;
        }

        @Override // be.j
        public boolean d(boolean z15, zd.a aVar, zd.c cVar) {
            return (aVar == zd.a.RESOURCE_DISK_CACHE || aVar == zd.a.MEMORY_CACHE) ? false : true;
        }
    }

    class e extends j {
        e() {
        }

        @Override // be.j
        public boolean a() {
            return true;
        }

        @Override // be.j
        public boolean b() {
            return true;
        }

        @Override // be.j
        public boolean c(zd.a aVar) {
            return aVar == zd.a.REMOTE;
        }

        @Override // be.j
        public boolean d(boolean z15, zd.a aVar, zd.c cVar) {
            return ((z15 && aVar == zd.a.DATA_DISK_CACHE) || aVar == zd.a.LOCAL) && cVar == zd.c.TRANSFORMED;
        }
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c(zd.a aVar);

    public abstract boolean d(boolean z15, zd.a aVar, zd.c cVar);
}
