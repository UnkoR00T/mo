package b;

import android.os.Build;
import fu.r;
import java.util.Locale;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\n\u001a\u00020\u0006*\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\rJ\r\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\rJ\r\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\rJ\r\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\rJ\r\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\rJ\r\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\rJ\r\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\rJ\r\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\rJ\r\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\rJ\r\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\rJ\r\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\rJ\r\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\rJ\r\u0010\u001a\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\rJ\r\u0010\u001b\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\rJ\r\u0010\u001c\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\rJ\r\u0010\u001d\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\rJ\r\u0010\u001e\u001a\u00020\u0006¢\u0006\u0004\b\u001e\u0010\rJ\r\u0010\u001f\u001a\u00020\u0006¢\u0006\u0004\b\u001f\u0010\r¨\u0006 "}, d2 = {"Lb/e;", "", "<init>", "()V", "", "vendor", "", "c", "(Ljava/lang/String;)Z", "other", "a", "(Ljava/lang/String;Ljava/lang/String;)Z", "b", "()Z", "e", "f", "g", "d", "h", "i", "j", "k", "m", "n", "o", "p", "q", "r", "u", "t", "l", "s", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f15545a = new e();

    private e() {
    }

    private final boolean a(String str, String str2) {
        return r.G(str, str2, true);
    }

    private final boolean c(String vendor) {
        return a(Build.MANUFACTURER, vendor) || a(Build.BRAND, vendor);
    }

    public final boolean b() {
        return c("Blu");
    }

    public final boolean d() {
        return c("Google");
    }

    public final boolean e() {
        return c("Huawei");
    }

    public final boolean f() {
        return c("Itel");
    }

    public final boolean g() {
        return c("Jio");
    }

    public final boolean h() {
        return c("Motorola");
    }

    public final boolean i() {
        return c("Nokia");
    }

    public final boolean j() {
        return c("OnePlus");
    }

    public final boolean k() {
        return c("Oppo");
    }

    public final boolean l() {
        return c("Poco");
    }

    public final boolean m() {
        return c("Positivo");
    }

    public final boolean n() {
        return c("Realme");
    }

    public final boolean o() {
        return c("Redmi");
    }

    public final boolean p() {
        return c("Samsung");
    }

    public final boolean q() {
        return c("Sony");
    }

    public final boolean r() {
        return c("Tecno") || c("Tecno-mobile");
    }

    public final boolean s() {
        if (Build.VERSION.SDK_INT < 31 || !r.G("Spreadtrum", Build.SOC_MANUFACTURER, true)) {
            String str = Build.HARDWARE;
            Locale locale = Locale.ROOT;
            if (!r.V(str.toLowerCase(locale), "ums", false, 2, null) && (!f() || !r.V(str.toLowerCase(locale), "sp", false, 2, null))) {
                return false;
            }
        }
        return true;
    }

    public final boolean t() {
        return c("Vivo");
    }

    public final boolean u() {
        return c("Xiaomi");
    }
}
