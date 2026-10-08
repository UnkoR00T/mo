package rv;

import fr.k;
import gv.d;
import java.io.EOFException;
import p071kotlin.Metadata;
import vv.e;
import vv.g;
import vv.h;
import vv.z;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 \u00112\u00020\u0001:\u0002\u0013\u0015B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\u000e\u001a\u00020\r2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0017¨\u0006\u0019"}, d2 = {"Lrv/b;", "", "Lvv/g;", "source", "Lrv/b$a;", "callback", "<init>", "(Lvv/g;Lrv/b$a;)V", "", "id", "type", "Lvv/e;", "data", "Loq/i0;", "c", "(Ljava/lang/String;Ljava/lang/String;Lvv/e;)V", "", "d", "()Z", "a", "Lvv/g;", "b", "Lrv/b$a;", "Ljava/lang/String;", "lastId", "okhttp-sse"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final z f176327e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final h f176328f;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g source;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final a callback;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private String lastId;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J+\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lrv/b$a;", "", "", "id", "type", "data", "Loq/i0;", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "timeMs", "b", "(J)V", "okhttp-sse"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface a {
        void b(long timeMs);

        void c(String id5, String type, String data);
    }

    /* JADX INFO: renamed from: rv.b$b, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lrv/b$b;", "", "<init>", "()V", "Lvv/g;", "Lvv/e;", "data", "Loq/i0;", "d", "(Lvv/g;Lvv/e;)V", "", "e", "(Lvv/g;)J", "Lvv/z;", "options", "Lvv/z;", "c", "()Lvv/z;", "Lvv/h;", "CRLF", "Lvv/h;", "okhttp-sse"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void d(g gVar, e eVar) {
            eVar.writeByte(10);
            gVar.h2(eVar, gVar.v0(b.f176328f));
            gVar.c1(c());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final long e(g gVar) {
            return d.U(gVar.N1(), -1L);
        }

        public final z c() {
            return b.f176327e;
        }

        private Companion() {
        }
    }

    static {
        z.Companion companion = z.INSTANCE;
        h.Companion companion2 = h.INSTANCE;
        f176327e = companion.d(companion2.d("\r\n"), companion2.d("\r"), companion2.d("\n"), companion2.d("data: "), companion2.d("data:"), companion2.d("data\r\n"), companion2.d("data\r"), companion2.d("data\n"), companion2.d("id: "), companion2.d("id:"), companion2.d("id\r\n"), companion2.d("id\r"), companion2.d("id\n"), companion2.d("event: "), companion2.d("event:"), companion2.d("event\r\n"), companion2.d("event\r"), companion2.d("event\n"), companion2.d("retry: "), companion2.d("retry:"));
        f176328f = companion2.d("\r\n");
    }

    public b(g gVar, a aVar) {
        this.source = gVar;
        this.callback = aVar;
    }

    private final void c(String id5, String type, e data) throws EOFException {
        if (data.getSize() != 0) {
            this.lastId = id5;
            data.skip(1L);
            this.callback.c(id5, type, data.C0());
        }
    }

    public final boolean d() throws EOFException {
        String strN1 = this.lastId;
        e eVar = new e();
        while (true) {
            String strN2 = null;
            while (true) {
                g gVar = this.source;
                z zVar = f176327e;
                int iC1 = gVar.c1(zVar);
                if (iC1 >= 0 && iC1 < 3) {
                    c(strN1, strN2, eVar);
                    return true;
                }
                if (3 <= iC1 && iC1 < 5) {
                    INSTANCE.d(this.source, eVar);
                } else if (5 <= iC1 && iC1 < 8) {
                    eVar.writeByte(10);
                } else if (8 <= iC1 && iC1 < 10) {
                    strN1 = this.source.N1();
                    if (strN1.length() <= 0) {
                        strN1 = null;
                    }
                } else if (10 <= iC1 && iC1 < 13) {
                    strN1 = null;
                } else if (13 <= iC1 && iC1 < 15) {
                    strN2 = this.source.N1();
                    if (strN2.length() <= 0) {
                        break;
                    }
                } else {
                    if (15 <= iC1 && iC1 < 18) {
                        break;
                    }
                    if (18 <= iC1 && iC1 < 20) {
                        long jE = INSTANCE.e(this.source);
                        if (jE != -1) {
                            this.callback.b(jE);
                        }
                    } else {
                        if (iC1 != -1) {
                            throw new AssertionError();
                        }
                        long jV0 = this.source.v0(f176328f);
                        if (jV0 == -1) {
                            return false;
                        }
                        this.source.skip(jV0);
                        this.source.c1(zVar);
                    }
                }
            }
        }
    }
}
