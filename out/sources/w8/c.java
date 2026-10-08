package w8;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f210893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<a> f210894b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f210895a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f210896b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f210897c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f210898d;

        public a(String str, String str2, long j15, long j16) {
            this.f210895a = str;
            this.f210896b = str2;
            this.f210897c = j15;
            this.f210898d = j16;
        }
    }

    public c(long j15, List<a> list) {
        this.f210893a = j15;
        this.f210894b = list;
    }

    public x8.c a(long j15) {
        long j16;
        x8.c cVar = null;
        if (this.f210894b.size() < 2) {
            return null;
        }
        boolean z15 = true;
        int size = this.f210894b.size() - 1;
        long j17 = j15;
        long j18 = -1;
        long j19 = -1;
        long j25 = -1;
        long j26 = -1;
        while (size >= 0) {
            a aVar = this.f210894b.get(size);
            boolean z16 = (aVar.f210895a.equals("video/mp4") || aVar.f210895a.equals("video/quicktime")) ? z15 : false;
            if (size == 0) {
                j17 -= aVar.f210898d;
                j16 = 0;
            } else {
                j16 = j17 - aVar.f210897c;
            }
            long j27 = j17;
            j17 = j16;
            if (z16 && j17 != j27) {
                j26 = j27 - j17;
                j25 = j17;
            }
            if (size == 0) {
                j19 = j27;
                j18 = j17;
            }
            size--;
            cVar = cVar;
            z15 = true;
        }
        return (j25 == -1 || j26 == -1 || j18 == -1 || j19 == -1) ? cVar : new x8.c(j18, j19, this.f210893a, j25, j26);
    }
}
