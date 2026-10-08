package fd;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f61212a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f61213b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f61214c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static qd.f f61216e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static qd.e f61217f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static volatile qd.h f61218g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static volatile qd.g f61219h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static ThreadLocal<td.g> f61220i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f61222k = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static a f61215d = a.AUTOMATIC;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static kd.b f61221j = new kd.c();

    public static /* synthetic */ File a(Context context) {
        return new File(context.getCacheDir(), "lottie_network_cache");
    }

    public static void b(String str) {
        if (f61212a) {
            g().a(str);
        }
    }

    public static float c(String str) {
        if (f61212a) {
            return g().b(str);
        }
        return 0.0f;
    }

    public static a d() {
        return f61215d;
    }

    public static boolean e() {
        return f61214c;
    }

    public static kd.b f() {
        return f61221j;
    }

    private static td.g g() {
        td.g gVar = f61220i.get();
        if (gVar != null) {
            return gVar;
        }
        td.g gVar2 = new td.g();
        f61220i.set(gVar2);
        return gVar2;
    }

    public static boolean h() {
        return f61212a;
    }

    public static qd.g i(Context context) {
        qd.g gVar;
        if (!f61213b) {
            return null;
        }
        final Context applicationContext = context.getApplicationContext();
        qd.g gVar2 = f61219h;
        if (gVar2 != null) {
            return gVar2;
        }
        synchronized (qd.g.class) {
            try {
                gVar = f61219h;
                if (gVar == null) {
                    qd.e eVar = f61217f;
                    if (eVar == null) {
                        eVar = new qd.e() { // from class: fd.d
                            @Override // qd.e
                            public final File a() {
                                return e.a(applicationContext);
                            }
                        };
                    }
                    gVar = new qd.g(eVar);
                    f61219h = gVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return gVar;
    }

    public static qd.h j(Context context) {
        qd.h hVar;
        qd.h hVar2 = f61218g;
        if (hVar2 != null) {
            return hVar2;
        }
        synchronized (qd.h.class) {
            try {
                hVar = f61218g;
                if (hVar == null) {
                    qd.g gVarI = i(context);
                    qd.f bVar = f61216e;
                    if (bVar == null) {
                        bVar = new qd.b();
                    }
                    hVar = new qd.h(gVarI, bVar);
                    f61218g = hVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return hVar;
    }
}
