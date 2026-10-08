package pc;

import ed.l;
import ed.m;
import p071kotlin.Metadata;
import tq.i;
import tq.j;
import vv.b0;
import vv.k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0003\u000e\u0005\bJ\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Lpc/a;", "", "", "key", "Lpc/a$c;", "b", "(Ljava/lang/String;)Lpc/a$c;", "Lpc/a$b;", "a", "(Ljava/lang/String;)Lpc/a$b;", "Lvv/k;", "getFileSystem", "()Lvv/k;", "fileSystem", "c", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface a {

    /* JADX INFO: renamed from: pc.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0015R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lpc/a$a;", "", "<init>", "()V", "Lvv/b0;", "directory", "b", "(Lvv/b0;)Lpc/a$a;", "Lpc/a;", "a", "()Lpc/a;", "Lvv/b0;", "Lvv/k;", "Lvv/k;", "fileSystem", "", "c", ip.a.f96138c, "maxSizePercent", "", "d", "J", "minimumMaxSizeBytes", "e", "maximumMaxSizeBytes", "f", "maxSizeBytes", "Ltq/i;", "g", "Ltq/i;", "cleanupCoroutineContext", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C3816a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private b0 directory;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private long maxSizeBytes;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private k fileSystem = m.a();

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private double maxSizePercent = 0.02d;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private long minimumMaxSizeBytes = 10485760;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private long maximumMaxSizeBytes = 262144000;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private i cleanupCoroutineContext = j.f191408a;

        public final a a() {
            long jO;
            b0 b0Var = this.directory;
            if (b0Var == null) {
                throw new IllegalStateException("directory == null");
            }
            double d15 = this.maxSizePercent;
            if (d15 > 0.0d) {
                try {
                    jO = lr.m.o((long) (d15 * l.a(this.fileSystem, b0Var)), this.minimumMaxSizeBytes, this.maximumMaxSizeBytes);
                } catch (Exception unused) {
                    jO = this.minimumMaxSizeBytes;
                }
            } else {
                jO = this.maxSizeBytes;
            }
            return new e(jO, b0Var, this.fileSystem, this.cleanupCoroutineContext);
        }

        public final C3816a b(b0 directory) {
            this.directory = directory;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lpc/a$b;", "", "Lpc/a$c;", "a", "()Lpc/a$c;", "Loq/i0;", "b", "()V", "Lvv/b0;", "e", "()Lvv/b0;", "metadata", "getData", "data", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface b {
        c a();

        void b();

        b0 e();

        b0 getData();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00060\u0001j\u0002`\u0002J\u0011\u0010\u0004\u001a\u0004\u0018\u00010\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lpc/a$c;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "Lpc/a$b;", "a3", "()Lpc/a$b;", "Lvv/b0;", "e", "()Lvv/b0;", "metadata", "getData", "data", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface c extends AutoCloseable {
        b a3();

        b0 e();

        b0 getData();
    }

    b a(String key);

    c b(String key);

    k getFileSystem();
}
