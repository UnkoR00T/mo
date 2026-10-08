package y00;

import android.content.Context;
import android.os.Build;
import java.io.File;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p071kotlin.Metadata;
import pq.v0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \u00072\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\bJ\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\bJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\bR\u001c\u0010\u0014\u001a\n \u0012*\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013¨\u0006\u0015"}, d2 = {"Ly00/q;", "Liy/n;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "b", "()Z", "d", "e", "c", "f", "", "property", "g", "(Ljava/lang/String;)Ljava/lang/String;", "a", "kotlin.jvm.PlatformType", "Landroid/content/Context;", "appContext", "security_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q implements iy.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f222833b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context appContext;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ly00/q$a;", "", "<init>", "()V", "", "EMULATOR_PROPERTY_THRESHOLD", "I", "security_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        private a() {
        }
    }

    public q(Context context) {
        this.appContext = context.getApplicationContext();
    }

    private final boolean b() {
        if (!fu.r.V(Build.FINGERPRINT, "generic", false, 2, null)) {
            String str = Build.MODEL;
            if (!fu.r.d0(str, "google_sdk", false, 2, null) && !fu.r.b0(str, "droid4x", true) && !fu.r.d0(str, "Emulator", false, 2, null) && !fu.r.d0(str, "Android SDK built for x86", false, 2, null) && !fu.r.d0(Build.MANUFACTURER, "Genymotion", false, 2, null)) {
                String str2 = Build.HARDWARE;
                if (!fr.t.c(str2, "goldfish") && !fr.t.c(str2, "vbox86")) {
                    String str3 = Build.PRODUCT;
                    if (!fr.t.c(str3, "sdk") && !fr.t.c(str3, "google_sdk") && !fr.t.c(str3, "sdk_x86") && !fr.t.c(str3, "vbox86p") && !fu.r.b0(Build.BOARD, "nox", true) && !fu.r.b0(Build.BOOTLOADER, "nox", true) && !fu.r.b0(str2, "nox", true) && !fu.r.b0(str3, "nox", true) && (!fu.r.V(Build.BRAND, "generic", false, 2, null) || !fu.r.V(Build.DEVICE, "generic", false, 2, null))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private final boolean c() {
        List listQ = pq.v.q("/dev/socket/genyd", "/dev/socket/baseband_genyd", "/dev/socket/qemud", "/dev/qemu_pipe", "/fstab.andy", "/ueventd.andy.rc", "/fstab.nox", "/init.nox.rc", "/ueventd.nox.rc");
        if ((listQ instanceof Collection) && listQ.isEmpty()) {
            return false;
        }
        Iterator it = listQ.iterator();
        while (it.hasNext()) {
            if (new File((String) it.next()).exists()) {
                return true;
            }
        }
        return false;
    }

    private final boolean d() {
        List listQ = pq.v.q("com.google.android.launcher.layouts.genymotion", "com.bluestacks", "com.bignox.app");
        if ((listQ instanceof Collection) && listQ.isEmpty()) {
            return false;
        }
        Iterator it = listQ.iterator();
        while (it.hasNext()) {
            if (this.appContext.getPackageManager().getLaunchIntentForPackage((String) it.next()) != null) {
                return true;
            }
        }
        return false;
    }

    private final boolean e() {
        List<File> listQ = pq.v.q(new File("/proc/tty/drivers"), new File("/proc/cpuinfo"));
        if ((listQ instanceof Collection) && listQ.isEmpty()) {
            return false;
        }
        for (File file : listQ) {
            if (file.exists() && file.canRead() && fu.r.d0(ar.d.e(file, null, 1, null), "goldfish", false, 2, null)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x00a8  */
    private final boolean f() {
        int i15;
        boolean zD0;
        Map mapL = v0.l(oq.y.a("init.svc.qemud", null), oq.y.a("init.svc.qemu-props", null), oq.y.a("qemu.hw.mainkeys", null), oq.y.a("qemu.sf.fake_camera", null), oq.y.a("qemu.sf.lcd_density", null), oq.y.a("ro.bootloader", "unknown"), oq.y.a("ro.bootmode", "unknown"), oq.y.a("ro.hardware", "goldfish"), oq.y.a("ro.kernel.android.qemud", null), oq.y.a("ro.kernel.qemu.gles", null), oq.y.a("ro.kernel.qemu", "1"), oq.y.a("ro.product.device", "generic"), oq.y.a("ro.product.model", "sdk"), oq.y.a("ro.product.name", "sdk"), oq.y.a("ro.serialno", null));
        if (mapL.isEmpty()) {
            i15 = 0;
        } else {
            i15 = 0;
            for (Map.Entry entry : mapL.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                String strG = g(str);
                if (str2 == null) {
                    if (strG != null) {
                        zD0 = true;
                    } else {
                        zD0 = false;
                    }
                } else if (strG != null) {
                    zD0 = fu.r.d0(strG, str2, false, 2, null);
                } else {
                    zD0 = false;
                }
                if (zD0) {
                    i15++;
                }
            }
        }
        return i15 >= 5;
    }

    private final String g(String property) {
        Object objB;
        try {
            oq.t.Companion companion = oq.t.INSTANCE;
            Class<?> clsLoadClass = this.appContext.getClassLoader().loadClass("android.os.SystemProperties");
            Object objInvoke = clsLoadClass.getMethod("get", String.class, String.class).invoke(clsLoadClass, property, null);
            String str = objInvoke instanceof String ? (String) objInvoke : null;
            if (str == null || str.length() <= 0) {
                str = null;
            }
            objB = oq.t.b(str);
        } catch (Throwable th4) {
            oq.t.Companion companion2 = oq.t.INSTANCE;
            objB = oq.t.b(oq.u.a(th4));
        }
        return (String) (oq.t.f(objB) ? null : objB);
    }

    @Override // iy.n
    public boolean a() {
        return b() || c() || e() || f() || d();
    }
}
