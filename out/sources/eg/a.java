package eg;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.clearcut.c5;
import com.google.android.gms.internal.clearcut.m5;
import com.google.android.gms.internal.clearcut.p5;
import com.google.android.gms.internal.clearcut.v5;
import com.google.android.gms.internal.clearcut.w2;
import com.google.android.gms.internal.clearcut.x5;
import hg.i;
import io.sentry.android.core.c2;
import java.util.ArrayList;
import java.util.TimeZone;
import jg.s;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final hg.a.g<p5> f49917n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final hg.a.AbstractC1948a<p5, hg.a.d.c> f49918o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Deprecated
    public static final hg.a<hg.a.d.c> f49919p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final qh.a[] f49920q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String[] f49921r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final byte[][] f49922s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f49923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f49924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f49925c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f49926d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f49927e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f49928f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f49929g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f49930h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private c5 f49931i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final eg.c f49932j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final com.google.android.gms.common.util.d f49933k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private d f49934l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final b f49935m;

    /* JADX INFO: renamed from: eg.a$a, reason: collision with other inner class name */
    public class C1196a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f49936a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f49937b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f49938c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f49939d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private c5 f49940e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private ArrayList<Integer> f49941f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private ArrayList<String> f49942g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private ArrayList<Integer> f49943h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private ArrayList<qh.a> f49944i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private ArrayList<byte[]> f49945j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f49946k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final m5 f49947l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f49948m;

        private C1196a(a aVar, byte[] bArr) {
            this(bArr, (c) null);
        }

        public void a() {
            if (this.f49948m) {
                throw new IllegalStateException("do not reuse LogEventBuilder");
            }
            this.f49948m = true;
            f fVar = new f(new x5(a.this.f49924b, a.this.f49925c, this.f49936a, this.f49937b, this.f49938c, this.f49939d, a.this.f49930h, this.f49940e), this.f49947l, null, null, a.f(null), null, a.f(null), null, null, this.f49946k);
            if (a.this.f49935m.a(fVar)) {
                a.this.f49932j.b(fVar);
            } else {
                i.a(Status.f29007f, null);
            }
        }

        public C1196a b(int i15) {
            this.f49947l.f29438g = i15;
            return this;
        }

        private C1196a(byte[] bArr, c cVar) {
            this.f49936a = a.this.f49927e;
            this.f49937b = a.this.f49926d;
            this.f49938c = a.this.f49928f;
            this.f49939d = null;
            this.f49940e = a.this.f49931i;
            this.f49941f = null;
            this.f49942g = null;
            this.f49943h = null;
            this.f49944i = null;
            this.f49945j = null;
            this.f49946k = true;
            m5 m5Var = new m5();
            this.f49947l = m5Var;
            this.f49948m = false;
            this.f49938c = a.this.f49928f;
            this.f49939d = null;
            m5Var.D = com.google.android.gms.internal.clearcut.b.a(a.this.f49923a);
            m5Var.f29434c = a.this.f49933k.a();
            m5Var.f29435d = a.this.f49933k.b();
            d unused = a.this.f49934l;
            m5Var.f29450v = TimeZone.getDefault().getOffset(m5Var.f29434c) / 1000;
            if (bArr != null) {
                m5Var.f29445p = bArr;
            }
        }

        /* synthetic */ C1196a(a aVar, byte[] bArr, eg.b bVar) {
            this(aVar, bArr);
        }
    }

    public interface b {
        boolean a(f fVar);
    }

    public interface c {
    }

    public static class d {
    }

    static {
        hg.a.g<p5> gVar = new hg.a.g<>();
        f49917n = gVar;
        eg.b bVar = new eg.b();
        f49918o = bVar;
        f49919p = new hg.a<>("ClearcutLogger.API", bVar, gVar);
        f49920q = new qh.a[0];
        f49921r = new String[0];
        f49922s = new byte[0][];
    }

    @VisibleForTesting
    private a(Context context, int i15, String str, String str2, String str3, boolean z15, eg.c cVar, com.google.android.gms.common.util.d dVar, d dVar2, b bVar) {
        this.f49927e = -1;
        c5 c5Var = c5.DEFAULT;
        this.f49931i = c5Var;
        this.f49923a = context;
        this.f49924b = context.getPackageName();
        this.f49925c = b(context);
        this.f49927e = -1;
        this.f49926d = str;
        this.f49928f = str2;
        this.f49929g = null;
        this.f49930h = z15;
        this.f49932j = cVar;
        this.f49933k = dVar;
        this.f49934l = new d();
        this.f49931i = c5Var;
        this.f49935m = bVar;
        if (z15) {
            s.b(str2 == null, "can't be anonymous with an upload account");
        }
    }

    private static int b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e15) {
            c2.k("ClearcutLogger", "This can't happen.", e15);
            return 0;
        }
    }

    private static int[] d(ArrayList<Integer> arrayList) {
        if (arrayList == null) {
            return null;
        }
        int[] iArr = new int[arrayList.size()];
        int size = arrayList.size();
        int i15 = 0;
        int i16 = 0;
        while (i15 < size) {
            Integer num = arrayList.get(i15);
            i15++;
            iArr[i16] = num.intValue();
            i16++;
        }
        return iArr;
    }

    static /* synthetic */ int[] f(ArrayList arrayList) {
        return d(null);
    }

    public final C1196a a(byte[] bArr) {
        return new C1196a(this, bArr, (eg.b) null);
    }

    public a(Context context, String str, String str2) {
        this(context, -1, str, str2, null, false, w2.D(context), com.google.android.gms.common.util.f.c(), null, new v5(context));
    }
}
