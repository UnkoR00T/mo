package v;

/* JADX INFO: loaded from: classes.dex */
public final class e1 implements i3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final o.o1 f202553d;

    class a implements o.o1 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f202554d;

        a(long j15) {
            this.f202554d = j15;
        }

        @Override // o.o1
        public long b() {
            return this.f202554d;
        }

        @Override // o.o1
        public o.o1.c e(o.o1.b bVar) {
            return bVar.b() == 1 ? o.o1.c.f140092d : o.o1.c.f140093e;
        }
    }

    public static final class b implements i3 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final o.o1 f202556d;

        public b(long j15) {
            this.f202556d = new e1(j15);
        }

        @Override // o.o1
        public long b() {
            return this.f202556d.b();
        }

        @Override // v.i3
        public o.o1 c(long j15) {
            return new b(j15);
        }

        @Override // o.o1
        public o.o1.c e(o.o1.b bVar) {
            if (this.f202556d.e(bVar).d()) {
                return o.o1.c.f140093e;
            }
            Throwable cause = bVar.getCause();
            if (cause instanceof k1.a) {
                o.e1.c("CameraX", "The device might underreport the amount of the cameras. Finish the initialize task since we are already reaching the maximum number of retries.");
                if (((k1.a) cause).getAvailableCameraCount() > 0) {
                    return o.o1.c.f140095g;
                }
            }
            return o.o1.c.f140092d;
        }
    }

    public e1(long j15) {
        this.f202553d = new u3(j15, new a(j15));
    }

    @Override // o.o1
    public long b() {
        return this.f202553d.b();
    }

    @Override // v.i3
    public o.o1 c(long j15) {
        return new e1(j15);
    }

    @Override // o.o1
    public o.o1.c e(o.o1.b bVar) {
        return this.f202553d.e(bVar);
    }
}
