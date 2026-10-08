package c8;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i f24237d = new b().d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f24238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f24239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f24240c;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f24241a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f24242b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f24243c;

        public i d() {
            if (this.f24241a || !(this.f24242b || this.f24243c)) {
                return new i(this);
            }
            throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
        }

        public b e(boolean z15) {
            this.f24241a = z15;
            return this;
        }

        public b f(boolean z15) {
            this.f24242b = z15;
            return this;
        }

        public b g(boolean z15) {
            this.f24243c = z15;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            i iVar = (i) obj;
            if (this.f24238a == iVar.f24238a && this.f24239b == iVar.f24239b && this.f24240c == iVar.f24240c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f24238a ? 1 : 0) << 2) + ((this.f24239b ? 1 : 0) << 1) + (this.f24240c ? 1 : 0);
    }

    private i(b bVar) {
        this.f24238a = bVar.f24241a;
        this.f24239b = bVar.f24242b;
        this.f24240c = bVar.f24243c;
    }
}
