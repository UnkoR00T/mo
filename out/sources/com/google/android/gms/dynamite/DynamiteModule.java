package com.google.android.gms.dynamite;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.common.util.DynamiteApi;
import io.sentry.android.core.c2;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import jg.r;
import jg.s;

/* JADX INFO: loaded from: classes3.dex */
public final class DynamiteModule {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static Boolean f29080h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static String f29081i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static boolean f29082j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f29083k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static Boolean f29084l;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static n f29090r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static o f29091s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f29092a;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final ThreadLocal f29085m = new ThreadLocal();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final ThreadLocal f29086n = new c();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final b.a f29087o = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f29074b = new e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f29075c = new f();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f29076d = new g();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f29077e = new h();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f29078f = new i();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f29079g = new j();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final b f29088p = new k();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final b f29089q = new com.google.android.gms.dynamite.a();

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    public static class a extends Exception {
        /* synthetic */ a(String str, Throwable th4, byte[] bArr) {
            super(str, th4);
        }

        /* synthetic */ a(String str, byte[] bArr) {
            super(str);
        }
    }

    public interface b {

        public interface a {
            int a(Context context, String str, boolean z15);

            int b(Context context, String str);
        }

        /* JADX INFO: renamed from: com.google.android.gms.dynamite.DynamiteModule$b$b, reason: collision with other inner class name */
        public static class C0742b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f29093a = 0;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f29094b = 0;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f29095c = 0;
        }

        C0742b a(Context context, String str, a aVar);
    }

    private DynamiteModule(Context context) {
        s.l(context);
        this.f29092a = context;
    }

    public static int a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb5 = new StringBuilder(String.valueOf(str).length() + 61);
            sb5.append("com.google.android.gms.dynamite.descriptors.");
            sb5.append(str);
            sb5.append(".ModuleDescriptor");
            Class<?> clsLoadClass = classLoader.loadClass(sb5.toString());
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (r.a(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            String strValueOf = String.valueOf(declaredField.get(null));
            StringBuilder sb6 = new StringBuilder(strValueOf.length() + 50 + String.valueOf(str).length() + 1);
            sb6.append("Module descriptor id '");
            sb6.append(strValueOf);
            sb6.append("' didn't match expected id '");
            sb6.append(str);
            sb6.append("'");
            c2.e("DynamiteModule", sb6.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb7 = new StringBuilder(String.valueOf(str).length() + 45);
            sb7.append("Local module descriptor class for ");
            sb7.append(str);
            sb7.append(" not found.");
            c2.g("DynamiteModule", sb7.toString());
            return 0;
        } catch (Exception e15) {
            c2.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e15.getMessage())));
            return 0;
        }
    }

    public static int c(Context context, String str) {
        return f(context, str, false);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01f9 A[Catch: all -> 0x0125, a -> 0x0128, RemoteException -> 0x012b, TryCatch #7 {RemoteException -> 0x012b, a -> 0x0128, all -> 0x0125, blocks: (B:34:0x00c3, B:40:0x00cf, B:42:0x00d6, B:43:0x00f0, B:47:0x00f6, B:49:0x00fe, B:51:0x0102, B:52:0x010d, B:59:0x0118, B:67:0x0141, B:69:0x0149, B:70:0x0150, B:71:0x0159, B:66:0x012e, B:74:0x015c, B:75:0x015d, B:76:0x0165, B:77:0x0166, B:78:0x016e, B:81:0x0171, B:82:0x0172, B:84:0x0190, B:86:0x0197, B:88:0x019f, B:94:0x01d8, B:96:0x01de, B:97:0x01e7, B:98:0x01ef, B:89:0x01ae, B:90:0x01b6, B:92:0x01b9, B:93:0x01c9, B:99:0x01f0, B:100:0x01f8, B:101:0x01f9, B:102:0x0201, B:108:0x020e), top: B:154:0x00c3 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x0204 A[Catch: all -> 0x0202, TRY_ENTER, TryCatch #1 {, blocks: (B:35:0x00c4, B:37:0x00ca, B:38:0x00cc, B:105:0x0204, B:106:0x020c), top: B:148:0x00c4 }] */
    /* JADX WARN: Code duplicated, block: B:123:0x0264  */
    /* JADX WARN: Code duplicated, block: B:124:0x026a  */
    /* JADX WARN: Code duplicated, block: B:127:0x0273  */
    /* JADX WARN: Code duplicated, block: B:132:0x0285 A[Catch: all -> 0x0096, TryCatch #4 {all -> 0x0096, blocks: (B:5:0x0037, B:9:0x008f, B:16:0x009b, B:20:0x00a2, B:32:0x00bf, B:109:0x020f, B:110:0x021a, B:113:0x021d, B:114:0x021e, B:115:0x0226, B:132:0x0285, B:133:0x02a4, B:116:0x0227, B:118:0x024d, B:120:0x025c, B:130:0x027c, B:131:0x0284, B:134:0x02a5, B:135:0x02f3), top: B:149:0x0037, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:147:0x00bf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:148:0x00c4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:152:0x00f1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x00a2 A[Catch: all -> 0x0096, TRY_LEAVE, TryCatch #4 {all -> 0x0096, blocks: (B:5:0x0037, B:9:0x008f, B:16:0x009b, B:20:0x00a2, B:32:0x00bf, B:109:0x020f, B:110:0x021a, B:113:0x021d, B:114:0x021e, B:115:0x0226, B:132:0x0285, B:133:0x02a4, B:116:0x0227, B:118:0x024d, B:120:0x025c, B:130:0x027c, B:131:0x0284, B:134:0x02a5, B:135:0x02f3), top: B:149:0x0037, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:24:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:30:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ca A[Catch: all -> 0x0202, TryCatch #1 {, blocks: (B:35:0x00c4, B:37:0x00ca, B:38:0x00cc, B:105:0x0204, B:106:0x020c), top: B:148:0x00c4 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00cf A[Catch: all -> 0x0125, a -> 0x0128, RemoteException -> 0x012b, TRY_ENTER, TryCatch #7 {RemoteException -> 0x012b, a -> 0x0128, all -> 0x0125, blocks: (B:34:0x00c3, B:40:0x00cf, B:42:0x00d6, B:43:0x00f0, B:47:0x00f6, B:49:0x00fe, B:51:0x0102, B:52:0x010d, B:59:0x0118, B:67:0x0141, B:69:0x0149, B:70:0x0150, B:71:0x0159, B:66:0x012e, B:74:0x015c, B:75:0x015d, B:76:0x0165, B:77:0x0166, B:78:0x016e, B:81:0x0171, B:82:0x0172, B:84:0x0190, B:86:0x0197, B:88:0x019f, B:94:0x01d8, B:96:0x01de, B:97:0x01e7, B:98:0x01ef, B:89:0x01ae, B:90:0x01b6, B:92:0x01b9, B:93:0x01c9, B:99:0x01f0, B:100:0x01f8, B:101:0x01f9, B:102:0x0201, B:108:0x020e), top: B:154:0x00c3 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00d6 A[Catch: all -> 0x0125, a -> 0x0128, RemoteException -> 0x012b, TryCatch #7 {RemoteException -> 0x012b, a -> 0x0128, all -> 0x0125, blocks: (B:34:0x00c3, B:40:0x00cf, B:42:0x00d6, B:43:0x00f0, B:47:0x00f6, B:49:0x00fe, B:51:0x0102, B:52:0x010d, B:59:0x0118, B:67:0x0141, B:69:0x0149, B:70:0x0150, B:71:0x0159, B:66:0x012e, B:74:0x015c, B:75:0x015d, B:76:0x0165, B:77:0x0166, B:78:0x016e, B:81:0x0171, B:82:0x0172, B:84:0x0190, B:86:0x0197, B:88:0x019f, B:94:0x01d8, B:96:0x01de, B:97:0x01e7, B:98:0x01ef, B:89:0x01ae, B:90:0x01b6, B:92:0x01b9, B:93:0x01c9, B:99:0x01f0, B:100:0x01f8, B:101:0x01f9, B:102:0x0201, B:108:0x020e), top: B:154:0x00c3 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00f6 A[Catch: all -> 0x0125, a -> 0x0128, RemoteException -> 0x012b, TRY_ENTER, TryCatch #7 {RemoteException -> 0x012b, a -> 0x0128, all -> 0x0125, blocks: (B:34:0x00c3, B:40:0x00cf, B:42:0x00d6, B:43:0x00f0, B:47:0x00f6, B:49:0x00fe, B:51:0x0102, B:52:0x010d, B:59:0x0118, B:67:0x0141, B:69:0x0149, B:70:0x0150, B:71:0x0159, B:66:0x012e, B:74:0x015c, B:75:0x015d, B:76:0x0165, B:77:0x0166, B:78:0x016e, B:81:0x0171, B:82:0x0172, B:84:0x0190, B:86:0x0197, B:88:0x019f, B:94:0x01d8, B:96:0x01de, B:97:0x01e7, B:98:0x01ef, B:89:0x01ae, B:90:0x01b6, B:92:0x01b9, B:93:0x01c9, B:99:0x01f0, B:100:0x01f8, B:101:0x01f9, B:102:0x0201, B:108:0x020e), top: B:154:0x00c3 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0166 A[Catch: all -> 0x0125, a -> 0x0128, RemoteException -> 0x012b, TryCatch #7 {RemoteException -> 0x012b, a -> 0x0128, all -> 0x0125, blocks: (B:34:0x00c3, B:40:0x00cf, B:42:0x00d6, B:43:0x00f0, B:47:0x00f6, B:49:0x00fe, B:51:0x0102, B:52:0x010d, B:59:0x0118, B:67:0x0141, B:69:0x0149, B:70:0x0150, B:71:0x0159, B:66:0x012e, B:74:0x015c, B:75:0x015d, B:76:0x0165, B:77:0x0166, B:78:0x016e, B:81:0x0171, B:82:0x0172, B:84:0x0190, B:86:0x0197, B:88:0x019f, B:94:0x01d8, B:96:0x01de, B:97:0x01e7, B:98:0x01ef, B:89:0x01ae, B:90:0x01b6, B:92:0x01b9, B:93:0x01c9, B:99:0x01f0, B:100:0x01f8, B:101:0x01f9, B:102:0x0201, B:108:0x020e), top: B:154:0x00c3 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x0172 A[Catch: all -> 0x0125, a -> 0x0128, RemoteException -> 0x012b, TryCatch #7 {RemoteException -> 0x012b, a -> 0x0128, all -> 0x0125, blocks: (B:34:0x00c3, B:40:0x00cf, B:42:0x00d6, B:43:0x00f0, B:47:0x00f6, B:49:0x00fe, B:51:0x0102, B:52:0x010d, B:59:0x0118, B:67:0x0141, B:69:0x0149, B:70:0x0150, B:71:0x0159, B:66:0x012e, B:74:0x015c, B:75:0x015d, B:76:0x0165, B:77:0x0166, B:78:0x016e, B:81:0x0171, B:82:0x0172, B:84:0x0190, B:86:0x0197, B:88:0x019f, B:94:0x01d8, B:96:0x01de, B:97:0x01e7, B:98:0x01ef, B:89:0x01ae, B:90:0x01b6, B:92:0x01b9, B:93:0x01c9, B:99:0x01f0, B:100:0x01f8, B:101:0x01f9, B:102:0x0201, B:108:0x020e), top: B:154:0x00c3 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0190 A[Catch: all -> 0x0125, a -> 0x0128, RemoteException -> 0x012b, TryCatch #7 {RemoteException -> 0x012b, a -> 0x0128, all -> 0x0125, blocks: (B:34:0x00c3, B:40:0x00cf, B:42:0x00d6, B:43:0x00f0, B:47:0x00f6, B:49:0x00fe, B:51:0x0102, B:52:0x010d, B:59:0x0118, B:67:0x0141, B:69:0x0149, B:70:0x0150, B:71:0x0159, B:66:0x012e, B:74:0x015c, B:75:0x015d, B:76:0x0165, B:77:0x0166, B:78:0x016e, B:81:0x0171, B:82:0x0172, B:84:0x0190, B:86:0x0197, B:88:0x019f, B:94:0x01d8, B:96:0x01de, B:97:0x01e7, B:98:0x01ef, B:89:0x01ae, B:90:0x01b6, B:92:0x01b9, B:93:0x01c9, B:99:0x01f0, B:100:0x01f8, B:101:0x01f9, B:102:0x0201, B:108:0x020e), top: B:154:0x00c3 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x0197 A[Catch: all -> 0x0125, a -> 0x0128, RemoteException -> 0x012b, TryCatch #7 {RemoteException -> 0x012b, a -> 0x0128, all -> 0x0125, blocks: (B:34:0x00c3, B:40:0x00cf, B:42:0x00d6, B:43:0x00f0, B:47:0x00f6, B:49:0x00fe, B:51:0x0102, B:52:0x010d, B:59:0x0118, B:67:0x0141, B:69:0x0149, B:70:0x0150, B:71:0x0159, B:66:0x012e, B:74:0x015c, B:75:0x015d, B:76:0x0165, B:77:0x0166, B:78:0x016e, B:81:0x0171, B:82:0x0172, B:84:0x0190, B:86:0x0197, B:88:0x019f, B:94:0x01d8, B:96:0x01de, B:97:0x01e7, B:98:0x01ef, B:89:0x01ae, B:90:0x01b6, B:92:0x01b9, B:93:0x01c9, B:99:0x01f0, B:100:0x01f8, B:101:0x01f9, B:102:0x0201, B:108:0x020e), top: B:154:0x00c3 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x019f A[Catch: all -> 0x0125, a -> 0x0128, RemoteException -> 0x012b, TryCatch #7 {RemoteException -> 0x012b, a -> 0x0128, all -> 0x0125, blocks: (B:34:0x00c3, B:40:0x00cf, B:42:0x00d6, B:43:0x00f0, B:47:0x00f6, B:49:0x00fe, B:51:0x0102, B:52:0x010d, B:59:0x0118, B:67:0x0141, B:69:0x0149, B:70:0x0150, B:71:0x0159, B:66:0x012e, B:74:0x015c, B:75:0x015d, B:76:0x0165, B:77:0x0166, B:78:0x016e, B:81:0x0171, B:82:0x0172, B:84:0x0190, B:86:0x0197, B:88:0x019f, B:94:0x01d8, B:96:0x01de, B:97:0x01e7, B:98:0x01ef, B:89:0x01ae, B:90:0x01b6, B:92:0x01b9, B:93:0x01c9, B:99:0x01f0, B:100:0x01f8, B:101:0x01f9, B:102:0x0201, B:108:0x020e), top: B:154:0x00c3 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x01ae A[Catch: all -> 0x0125, a -> 0x0128, RemoteException -> 0x012b, TryCatch #7 {RemoteException -> 0x012b, a -> 0x0128, all -> 0x0125, blocks: (B:34:0x00c3, B:40:0x00cf, B:42:0x00d6, B:43:0x00f0, B:47:0x00f6, B:49:0x00fe, B:51:0x0102, B:52:0x010d, B:59:0x0118, B:67:0x0141, B:69:0x0149, B:70:0x0150, B:71:0x0159, B:66:0x012e, B:74:0x015c, B:75:0x015d, B:76:0x0165, B:77:0x0166, B:78:0x016e, B:81:0x0171, B:82:0x0172, B:84:0x0190, B:86:0x0197, B:88:0x019f, B:94:0x01d8, B:96:0x01de, B:97:0x01e7, B:98:0x01ef, B:89:0x01ae, B:90:0x01b6, B:92:0x01b9, B:93:0x01c9, B:99:0x01f0, B:100:0x01f8, B:101:0x01f9, B:102:0x0201, B:108:0x020e), top: B:154:0x00c3 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x01b7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x01b9 A[Catch: all -> 0x0125, a -> 0x0128, RemoteException -> 0x012b, TryCatch #7 {RemoteException -> 0x012b, a -> 0x0128, all -> 0x0125, blocks: (B:34:0x00c3, B:40:0x00cf, B:42:0x00d6, B:43:0x00f0, B:47:0x00f6, B:49:0x00fe, B:51:0x0102, B:52:0x010d, B:59:0x0118, B:67:0x0141, B:69:0x0149, B:70:0x0150, B:71:0x0159, B:66:0x012e, B:74:0x015c, B:75:0x015d, B:76:0x0165, B:77:0x0166, B:78:0x016e, B:81:0x0171, B:82:0x0172, B:84:0x0190, B:86:0x0197, B:88:0x019f, B:94:0x01d8, B:96:0x01de, B:97:0x01e7, B:98:0x01ef, B:89:0x01ae, B:90:0x01b6, B:92:0x01b9, B:93:0x01c9, B:99:0x01f0, B:100:0x01f8, B:101:0x01f9, B:102:0x0201, B:108:0x020e), top: B:154:0x00c3 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x01c9 A[Catch: all -> 0x0125, a -> 0x0128, RemoteException -> 0x012b, TryCatch #7 {RemoteException -> 0x012b, a -> 0x0128, all -> 0x0125, blocks: (B:34:0x00c3, B:40:0x00cf, B:42:0x00d6, B:43:0x00f0, B:47:0x00f6, B:49:0x00fe, B:51:0x0102, B:52:0x010d, B:59:0x0118, B:67:0x0141, B:69:0x0149, B:70:0x0150, B:71:0x0159, B:66:0x012e, B:74:0x015c, B:75:0x015d, B:76:0x0165, B:77:0x0166, B:78:0x016e, B:81:0x0171, B:82:0x0172, B:84:0x0190, B:86:0x0197, B:88:0x019f, B:94:0x01d8, B:96:0x01de, B:97:0x01e7, B:98:0x01ef, B:89:0x01ae, B:90:0x01b6, B:92:0x01b9, B:93:0x01c9, B:99:0x01f0, B:100:0x01f8, B:101:0x01f9, B:102:0x0201, B:108:0x020e), top: B:154:0x00c3 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x01de A[Catch: all -> 0x0125, a -> 0x0128, RemoteException -> 0x012b, TryCatch #7 {RemoteException -> 0x012b, a -> 0x0128, all -> 0x0125, blocks: (B:34:0x00c3, B:40:0x00cf, B:42:0x00d6, B:43:0x00f0, B:47:0x00f6, B:49:0x00fe, B:51:0x0102, B:52:0x010d, B:59:0x0118, B:67:0x0141, B:69:0x0149, B:70:0x0150, B:71:0x0159, B:66:0x012e, B:74:0x015c, B:75:0x015d, B:76:0x0165, B:77:0x0166, B:78:0x016e, B:81:0x0171, B:82:0x0172, B:84:0x0190, B:86:0x0197, B:88:0x019f, B:94:0x01d8, B:96:0x01de, B:97:0x01e7, B:98:0x01ef, B:89:0x01ae, B:90:0x01b6, B:92:0x01b9, B:93:0x01c9, B:99:0x01f0, B:100:0x01f8, B:101:0x01f9, B:102:0x0201, B:108:0x020e), top: B:154:0x00c3 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x01e7 A[Catch: all -> 0x0125, a -> 0x0128, RemoteException -> 0x012b, TryCatch #7 {RemoteException -> 0x012b, a -> 0x0128, all -> 0x0125, blocks: (B:34:0x00c3, B:40:0x00cf, B:42:0x00d6, B:43:0x00f0, B:47:0x00f6, B:49:0x00fe, B:51:0x0102, B:52:0x010d, B:59:0x0118, B:67:0x0141, B:69:0x0149, B:70:0x0150, B:71:0x0159, B:66:0x012e, B:74:0x015c, B:75:0x015d, B:76:0x0165, B:77:0x0166, B:78:0x016e, B:81:0x0171, B:82:0x0172, B:84:0x0190, B:86:0x0197, B:88:0x019f, B:94:0x01d8, B:96:0x01de, B:97:0x01e7, B:98:0x01ef, B:89:0x01ae, B:90:0x01b6, B:92:0x01b9, B:93:0x01c9, B:99:0x01f0, B:100:0x01f8, B:101:0x01f9, B:102:0x0201, B:108:0x020e), top: B:154:0x00c3 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x01f0 A[Catch: all -> 0x0125, a -> 0x0128, RemoteException -> 0x012b, TryCatch #7 {RemoteException -> 0x012b, a -> 0x0128, all -> 0x0125, blocks: (B:34:0x00c3, B:40:0x00cf, B:42:0x00d6, B:43:0x00f0, B:47:0x00f6, B:49:0x00fe, B:51:0x0102, B:52:0x010d, B:59:0x0118, B:67:0x0141, B:69:0x0149, B:70:0x0150, B:71:0x0159, B:66:0x012e, B:74:0x015c, B:75:0x015d, B:76:0x0165, B:77:0x0166, B:78:0x016e, B:81:0x0171, B:82:0x0172, B:84:0x0190, B:86:0x0197, B:88:0x019f, B:94:0x01d8, B:96:0x01de, B:97:0x01e7, B:98:0x01ef, B:89:0x01ae, B:90:0x01b6, B:92:0x01b9, B:93:0x01c9, B:99:0x01f0, B:100:0x01f8, B:101:0x01f9, B:102:0x0201, B:108:0x020e), top: B:154:0x00c3 }] */
    public static DynamiteModule e(Context context, b bVar, String str) throws a {
        DynamiteModule dynamiteModuleJ;
        Cursor cursor;
        int i15;
        Boolean bool;
        n nVarL;
        int iO;
        rg.b bVarO3;
        Object objN3;
        l lVar;
        o oVar;
        l lVar2;
        boolean z15;
        rg.b bVarO4;
        Cursor cursor2;
        Context applicationContext = context.getApplicationContext();
        byte[] bArr = null;
        if (applicationContext == null) {
            throw new a("null application Context", null);
        }
        ThreadLocal threadLocal = f29085m;
        l lVar3 = (l) threadLocal.get();
        l lVar4 = new l(null);
        threadLocal.set(lVar4);
        ThreadLocal threadLocal2 = f29086n;
        Long l15 = (Long) threadLocal2.get();
        long jLongValue = l15.longValue();
        try {
            threadLocal2.set(Long.valueOf(SystemClock.uptimeMillis()));
            b.C0742b c0742bA = bVar.a(context, str, f29087o);
            new StringBuilder(String.valueOf(str).length() + 26 + String.valueOf(c0742bA.f29093a).length() + 19 + String.valueOf(str).length() + 1 + String.valueOf(c0742bA.f29094b).length());
            int i16 = c0742bA.f29095c;
            if (i16 != 0) {
                if (i16 != -1) {
                    if (i16 == 1 || c0742bA.f29094b != 0) {
                        if (i16 == -1) {
                            DynamiteModule dynamiteModuleJ2 = j(applicationContext, str);
                            if (jLongValue == 0) {
                                threadLocal2.remove();
                            } else {
                                threadLocal2.set(l15);
                            }
                            cursor2 = lVar4.f29096a;
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            threadLocal.set(lVar3);
                            return dynamiteModuleJ2;
                        }
                        if (i16 == 1) {
                            StringBuilder sb5 = new StringBuilder(String.valueOf(i16).length() + 36);
                            sb5.append("VersionPolicy returned invalid code:");
                            sb5.append(i16);
                            throw new a(sb5.toString(), null);
                        }
                        try {
                            i15 = c0742bA.f29094b;
                            try {
                                synchronized (DynamiteModule.class) {
                                    if (g(context)) {
                                        throw new a("Remote loading disabled", null);
                                    }
                                    bool = f29080h;
                                }
                                if (bool != null) {
                                    throw new a("Failed to determine which loading route to use.", null);
                                }
                                if (bool.booleanValue()) {
                                    new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(i15).length());
                                    synchronized (DynamiteModule.class) {
                                        oVar = f29091s;
                                    }
                                    if (oVar != null) {
                                        throw new a("DynamiteLoaderV2 was not cached.", null);
                                    }
                                    lVar2 = (l) threadLocal.get();
                                    if (lVar2 != null || lVar2.f29096a == null) {
                                        throw new a("No result cursor", null);
                                    }
                                    Context applicationContext2 = context.getApplicationContext();
                                    Cursor cursor3 = lVar2.f29096a;
                                    rg.d.o3(null);
                                    synchronized (DynamiteModule.class) {
                                        z15 = f29083k >= 2;
                                    }
                                    if (z15) {
                                        bVarO4 = oVar.p3(rg.d.o3(applicationContext2), str, i15, rg.d.o3(cursor3));
                                    } else {
                                        c2.g("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                        bVarO4 = oVar.o3(rg.d.o3(applicationContext2), str, i15, rg.d.o3(cursor3));
                                    }
                                    Context context2 = (Context) rg.d.n3(bVarO4);
                                    if (context2 == null) {
                                        throw new a("Failed to get module context", bArr);
                                    }
                                    dynamiteModuleJ = new DynamiteModule(context2);
                                } else {
                                    new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(i15).length());
                                    nVarL = l(context);
                                    if (nVarL != null) {
                                        throw new a("Failed to create IDynamiteLoader.", null);
                                    }
                                    iO = nVarL.o();
                                    if (iO >= 3) {
                                        lVar = (l) threadLocal.get();
                                        if (lVar != null) {
                                            throw new a("No cached result cursor holder", null);
                                        }
                                        bVarO3 = nVarL.t3(rg.d.o3(context), str, i15, rg.d.o3(lVar.f29096a));
                                    } else if (iO == 2) {
                                        c2.g("DynamiteModule", "IDynamite loader version = 2");
                                        bVarO3 = nVarL.q3(rg.d.o3(context), str, i15);
                                    } else {
                                        c2.g("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                        bVarO3 = nVarL.o3(rg.d.o3(context), str, i15);
                                    }
                                    objN3 = rg.d.n3(bVarO3);
                                    if (objN3 != null) {
                                        throw new a("Failed to load remote module.", null);
                                    }
                                    dynamiteModuleJ = new DynamiteModule((Context) objN3);
                                }
                                if (jLongValue == 0) {
                                    f29086n.remove();
                                } else {
                                    f29086n.set(l15);
                                }
                                cursor = lVar4.f29096a;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                f29085m.set(lVar3);
                                return dynamiteModuleJ;
                            } catch (RemoteException e15) {
                                throw new a("Failed to load remote module.", e15, null);
                            } catch (a e16) {
                                throw e16;
                            } catch (Throwable th4) {
                                com.google.android.gms.common.util.e.a(context, th4);
                                throw new a("Failed to load remote module.", th4, null);
                            }
                        } catch (a e17) {
                            String message = e17.getMessage();
                            StringBuilder sb6 = new StringBuilder(String.valueOf(message).length() + 30);
                            sb6.append("Failed to load remote module: ");
                            sb6.append(message);
                            c2.g("DynamiteModule", sb6.toString());
                            int i17 = c0742bA.f29093a;
                            if (i17 == 0 || bVar.a(context, str, new m(i17, 0)).f29095c != -1) {
                                throw new a("Remote load failed. No local fallback found.", e17, null);
                            }
                            dynamiteModuleJ = j(applicationContext, str);
                        }
                    }
                } else if (c0742bA.f29093a != 0) {
                    i16 = -1;
                    if (i16 == 1) {
                    }
                    if (i16 == -1) {
                        DynamiteModule dynamiteModuleJ3 = j(applicationContext, str);
                        if (jLongValue == 0) {
                            threadLocal2.remove();
                        } else {
                            threadLocal2.set(l15);
                        }
                        cursor2 = lVar4.f29096a;
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        threadLocal.set(lVar3);
                        return dynamiteModuleJ3;
                    }
                    if (i16 == 1) {
                        StringBuilder sb7 = new StringBuilder(String.valueOf(i16).length() + 36);
                        sb7.append("VersionPolicy returned invalid code:");
                        sb7.append(i16);
                        throw new a(sb7.toString(), null);
                    }
                    i15 = c0742bA.f29094b;
                    synchronized (DynamiteModule.class) {
                        if (g(context)) {
                            throw new a("Remote loading disabled", null);
                        }
                        bool = f29080h;
                        if (bool != null) {
                            throw new a("Failed to determine which loading route to use.", null);
                        }
                        if (bool.booleanValue()) {
                            new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(i15).length());
                            synchronized (DynamiteModule.class) {
                                oVar = f29091s;
                                if (oVar != null) {
                                    throw new a("DynamiteLoaderV2 was not cached.", null);
                                }
                                lVar2 = (l) threadLocal.get();
                                if (lVar2 != null) {
                                }
                                throw new a("No result cursor", null);
                            }
                        }
                        new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(i15).length());
                        nVarL = l(context);
                        if (nVarL != null) {
                            throw new a("Failed to create IDynamiteLoader.", null);
                        }
                        iO = nVarL.o();
                        if (iO >= 3) {
                            lVar = (l) threadLocal.get();
                            if (lVar != null) {
                                throw new a("No cached result cursor holder", null);
                            }
                            bVarO3 = nVarL.t3(rg.d.o3(context), str, i15, rg.d.o3(lVar.f29096a));
                        } else if (iO == 2) {
                            c2.g("DynamiteModule", "IDynamite loader version = 2");
                            bVarO3 = nVarL.q3(rg.d.o3(context), str, i15);
                        } else {
                            c2.g("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                            bVarO3 = nVarL.o3(rg.d.o3(context), str, i15);
                        }
                        objN3 = rg.d.n3(bVarO3);
                        if (objN3 != null) {
                            throw new a("Failed to load remote module.", null);
                        }
                        dynamiteModuleJ = new DynamiteModule((Context) objN3);
                        if (jLongValue == 0) {
                            f29086n.remove();
                        } else {
                            f29086n.set(l15);
                        }
                        cursor = lVar4.f29096a;
                        if (cursor != null) {
                            cursor.close();
                        }
                        f29085m.set(lVar3);
                        return dynamiteModuleJ;
                    }
                }
            }
            int i18 = c0742bA.f29093a;
            int i19 = c0742bA.f29094b;
            StringBuilder sb8 = new StringBuilder(String.valueOf(str).length() + 46 + String.valueOf(i18).length() + 23 + String.valueOf(i19).length() + 1);
            sb8.append("No acceptable module ");
            sb8.append(str);
            sb8.append(" found. Local version is ");
            sb8.append(i18);
            sb8.append(" and remote version is ");
            sb8.append(i19);
            sb8.append(".");
            throw new a(sb8.toString(), null);
        } catch (Throwable th5) {
            if (jLongValue == 0) {
                f29086n.remove();
            } else {
                f29086n.set(l15);
            }
            Cursor cursor4 = lVar4.f29096a;
            if (cursor4 != null) {
                cursor4.close();
            }
            f29085m.set(lVar3);
            throw th5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x018f A[Catch: all -> 0x00f4, TRY_ENTER, TRY_LEAVE, TryCatch #8 {all -> 0x00f4, blocks: (B:4:0x0006, B:65:0x00e9, B:67:0x00ef, B:75:0x011d, B:103:0x0181, B:107:0x018f, B:125:0x01ec, B:126:0x01ef, B:120:0x01e3, B:73:0x00fa, B:128:0x01f1, B:5:0x0007, B:8:0x000d, B:9:0x0029, B:63:0x00e6, B:22:0x004d, B:46:0x00a5, B:49:0x00a8, B:56:0x00c0, B:64:0x00e8, B:62:0x00c6), top: B:141:0x0006, inners: #7, #9 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00b4 A[Catch: all -> 0x003a, TryCatch #12 {all -> 0x003a, blocks: (B:10:0x002a, B:12:0x0036, B:53:0x00bd, B:17:0x003f, B:19:0x0046, B:21:0x004c, B:26:0x0053, B:28:0x0057, B:32:0x0061, B:34:0x0069, B:37:0x0070, B:44:0x009c, B:45:0x00a4, B:40:0x0077, B:42:0x007d, B:43:0x008e, B:48:0x00a7, B:51:0x00aa, B:52:0x00b4, B:18:0x0042), top: B:144:0x002a, inners: #2 }] */
    public static int f(Context context, String str, boolean z15) {
        Throwable th4;
        RemoteException remoteException;
        Cursor cursor;
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool = f29080h;
                Cursor cursor2 = null;
                int iP3 = 0;
                if (bool == null) {
                    try {
                        Field declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                        synchronized (declaredField.getDeclaringClass()) {
                            try {
                                ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                                if (classLoader == ClassLoader.getSystemClassLoader()) {
                                    bool = Boolean.FALSE;
                                } else if (classLoader != null) {
                                    try {
                                        k(classLoader);
                                    } catch (a unused) {
                                    }
                                    bool = Boolean.TRUE;
                                } else {
                                    if (!g(context)) {
                                        return 0;
                                    }
                                    if (f29082j) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    } else {
                                        Boolean bool2 = Boolean.TRUE;
                                        if (bool2.equals(null)) {
                                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                                            bool = Boolean.FALSE;
                                        } else {
                                            try {
                                                int iH = h(context, str, z15, true);
                                                String str2 = f29081i;
                                                if (str2 != null && !str2.isEmpty()) {
                                                    ClassLoader classLoaderA = sg.d.a();
                                                    if (classLoaderA == null) {
                                                        if (Build.VERSION.SDK_INT >= 29) {
                                                            sg.b.a();
                                                            String str3 = f29081i;
                                                            s.l(str3);
                                                            classLoaderA = sg.a.a(str3, ClassLoader.getSystemClassLoader());
                                                        } else {
                                                            String str4 = f29081i;
                                                            s.l(str4);
                                                            classLoaderA = new com.google.android.gms.dynamite.b(str4, ClassLoader.getSystemClassLoader());
                                                        }
                                                    }
                                                    k(classLoaderA);
                                                    declaredField.set(null, classLoaderA);
                                                    f29080h = bool2;
                                                    return iH;
                                                }
                                                return iH;
                                            } catch (a unused2) {
                                                declaredField.set(null, ClassLoader.getSystemClassLoader());
                                                bool = Boolean.FALSE;
                                            }
                                        }
                                    }
                                }
                                f29080h = bool;
                            } catch (Throwable th5) {
                                throw th5;
                            }
                        }
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e15) {
                        String string = e15.toString();
                        StringBuilder sb5 = new StringBuilder(string.length() + 30);
                        sb5.append("Failed to load module via V2: ");
                        sb5.append(string);
                        c2.g("DynamiteModule", sb5.toString());
                        bool = Boolean.FALSE;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return h(context, str, z15, false);
                    } catch (a e16) {
                        String message = e16.getMessage();
                        StringBuilder sb6 = new StringBuilder(String.valueOf(message).length() + 42);
                        sb6.append("Failed to retrieve remote module version: ");
                        sb6.append(message);
                        c2.g("DynamiteModule", sb6.toString());
                        return 0;
                    }
                }
                n nVarL = l(context);
                if (nVarL != null) {
                    try {
                        try {
                            int iO = nVarL.o();
                            if (iO >= 3) {
                                l lVar = (l) f29085m.get();
                                if (lVar == null || (cursor = lVar.f29096a) == null) {
                                    Cursor cursor3 = (Cursor) rg.d.n3(nVarL.s3(rg.d.o3(context), str, z15, ((Long) f29086n.get()).longValue()));
                                    if (cursor3 != null) {
                                        try {
                                            if (cursor3.moveToFirst()) {
                                                int i15 = cursor3.getInt(0);
                                                cursor2 = (i15 <= 0 || !i(cursor3)) ? cursor3 : null;
                                                if (cursor2 != null) {
                                                    cursor2.close();
                                                }
                                                iP3 = i15;
                                            } else {
                                                c2.g("DynamiteModule", "Failed to retrieve remote module version.");
                                                if (cursor3 != null) {
                                                    cursor3.close();
                                                }
                                            }
                                        } catch (RemoteException e17) {
                                            remoteException = e17;
                                            cursor2 = cursor3;
                                            String message2 = remoteException.getMessage();
                                            StringBuilder sb7 = new StringBuilder(String.valueOf(message2).length() + 42);
                                            sb7.append("Failed to retrieve remote module version: ");
                                            sb7.append(message2);
                                            c2.g("DynamiteModule", sb7.toString());
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                        } catch (Throwable th6) {
                                            th4 = th6;
                                            cursor2 = cursor3;
                                            if (cursor2 == null) {
                                                throw th4;
                                            }
                                            cursor2.close();
                                            throw th4;
                                        }
                                    } else {
                                        c2.g("DynamiteModule", "Failed to retrieve remote module version.");
                                        if (cursor3 != null) {
                                            cursor3.close();
                                        }
                                    }
                                } else {
                                    iP3 = cursor.getInt(0);
                                }
                            } else if (iO == 2) {
                                c2.g("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                                iP3 = nVarL.r3(rg.d.o3(context), str, z15);
                            } else {
                                c2.g("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                                iP3 = nVarL.p3(rg.d.o3(context), str, z15);
                            }
                        } catch (RemoteException e18) {
                            remoteException = e18;
                        }
                    } catch (Throwable th7) {
                        th4 = th7;
                    }
                }
                return iP3;
            }
        } catch (Throwable th8) {
            com.google.android.gms.common.util.e.a(context, th8);
            throw th8;
        }
    }

    private static boolean g(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(f29084l)) {
            return true;
        }
        boolean z15 = false;
        if (f29084l == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", true != com.google.android.gms.common.util.j.f() ? 0 : 268435456);
            if (gg.e.f().h(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                z15 = true;
            }
            f29084l = Boolean.valueOf(z15);
            if (z15 && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                f29082j = true;
            }
        }
        if (!z15) {
            c2.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z15;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0163 A[Catch: all -> 0x0141, TryCatch #0 {all -> 0x0141, blocks: (B:59:0x00ef, B:61:0x00f5, B:64:0x00fd, B:78:0x012a, B:82:0x0133, B:86:0x0139, B:87:0x0140, B:96:0x014f, B:97:0x015d, B:99:0x015f, B:101:0x0163, B:102:0x0185, B:103:0x0186), top: B:108:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:103:0x0186 A[Catch: all -> 0x0141, TRY_LEAVE, TryCatch #0 {all -> 0x0141, blocks: (B:59:0x00ef, B:61:0x00f5, B:64:0x00fd, B:78:0x012a, B:82:0x0133, B:86:0x0139, B:87:0x0140, B:96:0x014f, B:97:0x015d, B:99:0x015f, B:101:0x0163, B:102:0x0185, B:103:0x0186), top: B:108:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x0189  */
    /* JADX WARN: Code duplicated, block: B:126:? A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x0147: MOVE (r2 I:??[OBJECT, ARRAY]) = (r8 I:??[OBJECT, ARRAY]), block:B:92:0x0147 */
    private static int h(Context context, String str, boolean z15, boolean z16) throws Throwable {
        Throwable th4;
        Exception exc;
        Cursor cursor;
        MatrixCursor matrixCursor;
        Cursor cursor2 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        try {
            try {
                boolean z17 = true;
                Uri uriBuild = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(true != z15 ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartUptime", String.valueOf(((Long) f29086n.get()).longValue())).build();
                ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uriBuild);
                boolean z18 = false;
                if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                    matrixCursor = null;
                } else {
                    try {
                        Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uriBuild, null, null, null, null);
                        if (cursorQuery == null) {
                            contentProviderClientAcquireUnstableContentProviderClient.release();
                            matrixCursor = null;
                        } else {
                            try {
                                int count = cursorQuery.getCount();
                                int columnCount = cursorQuery.getColumnCount();
                                matrixCursor = new MatrixCursor(cursorQuery.getColumnNames(), count);
                                for (int i15 = 0; i15 < count; i15++) {
                                    if (!cursorQuery.moveToPosition(i15)) {
                                        throw new RemoteException("Cursor read incomplete (ContentProvider dead?)");
                                    }
                                    Object[] objArr4 = new Object[columnCount];
                                    for (int i16 = 0; i16 < columnCount; i16++) {
                                        int type = cursorQuery.getType(i16);
                                        if (type == 0) {
                                            objArr4[i16] = null;
                                        } else if (type == 1) {
                                            objArr4[i16] = Long.valueOf(cursorQuery.getLong(i16));
                                        } else if (type == 2) {
                                            objArr4[i16] = Double.valueOf(cursorQuery.getDouble(i16));
                                        } else if (type == 3) {
                                            objArr4[i16] = cursorQuery.getString(i16);
                                        } else {
                                            if (type != 4) {
                                                throw new RemoteException("Unknown column type");
                                            }
                                            objArr4[i16] = cursorQuery.getBlob(i16);
                                        }
                                    }
                                    matrixCursor.addRow(objArr4);
                                }
                                cursorQuery.close();
                                contentProviderClientAcquireUnstableContentProviderClient.release();
                            } catch (Throwable th5) {
                                try {
                                    cursorQuery.close();
                                    throw th5;
                                } catch (Throwable th6) {
                                    th5.addSuppressed(th6);
                                    throw th5;
                                }
                            }
                        }
                    } catch (RemoteException unused) {
                    } catch (Throwable th7) {
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        throw th7;
                    }
                }
                if (matrixCursor != null) {
                    try {
                        if (matrixCursor.moveToFirst()) {
                            int i17 = matrixCursor.getInt(0);
                            if (i17 > 0) {
                                synchronized (DynamiteModule.class) {
                                    try {
                                        f29081i = matrixCursor.getString(2);
                                        int columnIndex = matrixCursor.getColumnIndex("loaderVersion");
                                        if (columnIndex >= 0) {
                                            f29083k = matrixCursor.getInt(columnIndex);
                                        }
                                        int columnIndex2 = matrixCursor.getColumnIndex("disableStandaloneDynamiteLoader2");
                                        if (columnIndex2 >= 0) {
                                            if (matrixCursor.getInt(columnIndex2) == 0) {
                                                z17 = false;
                                            }
                                            f29082j = z17;
                                            z18 = z17;
                                        }
                                    } catch (Throwable th8) {
                                        throw th8;
                                    }
                                }
                                if (i(matrixCursor)) {
                                    matrixCursor = null;
                                }
                            }
                            if (z16 && z18) {
                                throw new a("forcing fallback to container DynamiteLoader impl", objArr2 == true ? 1 : 0);
                            }
                            if (matrixCursor != null) {
                                matrixCursor.close();
                            }
                            return i17;
                        }
                    } catch (Exception e15) {
                        exc = e15;
                        if (!(exc instanceof a)) {
                            throw exc;
                        }
                        String message = exc.getMessage();
                        StringBuilder sb5 = new StringBuilder(String.valueOf(message).length() + 25);
                        sb5.append("V2 version check failed: ");
                        sb5.append(message);
                        throw new a(sb5.toString(), exc, objArr == true ? 1 : 0);
                    }
                }
                c2.g("DynamiteModule", "Failed to retrieve remote module version.");
                throw new a("Failed to connect to dynamite module ContentResolver.", objArr3 == true ? 1 : 0);
            } catch (Throwable th9) {
                th4 = th9;
                cursor2 = cursor;
                if (cursor2 != null) {
                    throw th4;
                }
                cursor2.close();
                throw th4;
            }
        } catch (Exception e16) {
            exc = e16;
            if (!(exc instanceof a)) {
                throw exc;
            }
            String message2 = exc.getMessage();
            StringBuilder sb6 = new StringBuilder(String.valueOf(message2).length() + 25);
            sb6.append("V2 version check failed: ");
            sb6.append(message2);
            throw new a(sb6.toString(), exc, objArr == true ? 1 : 0);
        } catch (Throwable th10) {
            th4 = th10;
            if (cursor2 != null) {
                throw th4;
            }
            cursor2.close();
            throw th4;
        }
    }

    private static boolean i(Cursor cursor) {
        l lVar = (l) f29085m.get();
        if (lVar == null || lVar.f29096a != null) {
            return false;
        }
        lVar.f29096a = cursor;
        return true;
    }

    private static DynamiteModule j(Context context, String str) {
        "Selected local version of ".concat(String.valueOf(str));
        return new DynamiteModule(context);
    }

    private static void k(ClassLoader classLoader) throws a {
        o oVar;
        byte[] bArr = null;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder == null) {
                oVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                oVar = iInterfaceQueryLocalInterface instanceof o ? (o) iInterfaceQueryLocalInterface : new o(iBinder);
            }
            f29091s = oVar;
        } catch (ClassNotFoundException e15) {
            e = e15;
            throw new a("Failed to instantiate dynamite loader", e, bArr);
        } catch (IllegalAccessException e16) {
            e = e16;
            throw new a("Failed to instantiate dynamite loader", e, bArr);
        } catch (InstantiationException e17) {
            e = e17;
            throw new a("Failed to instantiate dynamite loader", e, bArr);
        } catch (NoSuchMethodException e18) {
            e = e18;
            throw new a("Failed to instantiate dynamite loader", e, bArr);
        } catch (InvocationTargetException e19) {
            e = e19;
            throw new a("Failed to instantiate dynamite loader", e, bArr);
        }
    }

    private static n l(Context context) {
        n nVar;
        synchronized (DynamiteModule.class) {
            n nVar2 = f29090r;
            if (nVar2 != null) {
                return nVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    nVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    nVar = iInterfaceQueryLocalInterface instanceof n ? (n) iInterfaceQueryLocalInterface : new n(iBinder);
                }
                if (nVar != null) {
                    f29090r = nVar;
                    return nVar;
                }
            } catch (Exception e15) {
                String message = e15.getMessage();
                StringBuilder sb5 = new StringBuilder(String.valueOf(message).length() + 45);
                sb5.append("Failed to load IDynamiteLoader from GmsCore: ");
                sb5.append(message);
                c2.e("DynamiteModule", sb5.toString());
            }
            return null;
        }
    }

    public Context b() {
        return this.f29092a;
    }

    public IBinder d(String str) throws a {
        try {
            return (IBinder) this.f29092a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e15) {
            throw new a("Failed to instantiate module class: ".concat(String.valueOf(str)), e15, null);
        }
    }
}
