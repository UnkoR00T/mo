package lz;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.FeatureInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.provider.Settings;
import ay.k;
import fr.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import jx.h;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002BO\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u001bH\u0016¢\u0006\u0004\b$\u0010\u001dJ\u000f\u0010%\u001a\u00020\u001bH\u0016¢\u0006\u0004\b%\u0010\u001dJ\u000f\u0010&\u001a\u00020\u001bH\u0016¢\u0006\u0004\b&\u0010\u001dJ\u000f\u0010'\u001a\u00020\u001bH\u0016¢\u0006\u0004\b'\u0010\u001dJ\u000f\u0010(\u001a\u00020\u0017H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020!H\u0016¢\u0006\u0004\b*\u0010#J\u000f\u0010+\u001a\u00020!H\u0016¢\u0006\u0004\b+\u0010#J\u000f\u0010,\u001a\u00020!H\u0016¢\u0006\u0004\b,\u0010#J\u000f\u0010-\u001a\u00020\u001bH\u0016¢\u0006\u0004\b-\u0010\u001dJ\u000f\u0010.\u001a\u00020\u001bH\u0016¢\u0006\u0004\b.\u0010\u001dJ\u000f\u0010/\u001a\u00020!H\u0016¢\u0006\u0004\b/\u0010#J\u000f\u00100\u001a\u00020\u001bH\u0016¢\u0006\u0004\b0\u0010\u001dJ\u000f\u00101\u001a\u00020\u001bH\u0016¢\u0006\u0004\b1\u0010\u001dJ\u000f\u00102\u001a\u00020\u0017H\u0016¢\u0006\u0004\b2\u0010)J\u000f\u00103\u001a\u00020!H\u0016¢\u0006\u0004\b3\u0010#J\u000f\u00104\u001a\u00020!H\u0016¢\u0006\u0004\b4\u0010#J\u000f\u00105\u001a\u00020\u0017H\u0016¢\u0006\u0004\b5\u0010)J\u0017\u00107\u001a\u00020\u001b2\u0006\u00106\u001a\u00020!H\u0016¢\u0006\u0004\b7\u00108J\u000f\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b:\u0010;R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010<R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010=R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010>R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010?R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010@R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010AR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010BR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010CR\u0014\u0010F\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010E¨\u0006G"}, d2 = {"Llz/g;", "Ljx/g;", "Ljx/h;", "Landroid/content/Context;", "context", "Ljx/d;", "deviceInfo", "Lcy/a;", "nfcManager", "Luy/d;", "gpsManager", "Lbx/a;", "bluetoothManager", "Lay/k;", "networkConnectionManager", "Lyw/b;", "accessibilityTalkBackManager", "Lax/e;", "biometricManager", "Lt10/k;", "sharedPreferencesFactory", "<init>", "(Landroid/content/Context;Ljx/d;Lcy/a;Luy/d;Lbx/a;Lay/k;Lyw/b;Lax/e;Lt10/k;)V", "", "glEsVersion", "w", "(I)I", "", "r", "()Z", "", "f", "()J", "", "a", "()Ljava/lang/String;", "u", "t", "l", "p", "j", "()I", "n", "c", "v", "i", "m", "b", "s", "h", "g", "e", "q", "o", "packageName", "k", "(Ljava/lang/String;)Z", "Loq/i0;", "d", "()V", "Landroid/content/Context;", "Ljx/d;", "Lcy/a;", "Luy/d;", "Lbx/a;", "Lay/k;", "Lyw/b;", "Lax/e;", "Landroid/content/SharedPreferences;", "Landroid/content/SharedPreferences;", "sharedPreferences", "info_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements jx.g, h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final jx.d deviceInfo;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final cy.a nfcManager;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final uy.d gpsManager;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final bx.a bluetoothManager;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final k networkConnectionManager;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final yw.b accessibilityTalkBackManager;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ax.e biometricManager;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final SharedPreferences sharedPreferences;

    public g(Context context, jx.d dVar, cy.a aVar, uy.d dVar2, bx.a aVar2, k kVar, yw.b bVar, ax.e eVar, t10.k kVar2) {
        this.context = context;
        this.deviceInfo = dVar;
        this.nfcManager = aVar;
        this.gpsManager = dVar2;
        this.bluetoothManager = aVar2;
        this.networkConnectionManager = kVar;
        this.accessibilityTalkBackManager = bVar;
        this.biometricManager = eVar;
        this.sharedPreferences = kVar2.c("system_info_prefs");
    }

    private final int w(int glEsVersion) {
        return (glEsVersion & (-65536)) >> 16;
    }

    @Override // jx.g
    public String a() {
        return Build.VERSION.SECURITY_PATCH;
    }

    @Override // jx.g
    public String b() {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        ResolveInfo resolveInfoResolveActivity = this.context.getPackageManager().resolveActivity(intent, 0);
        if ((resolveInfoResolveActivity != null ? resolveInfoResolveActivity.activityInfo : null) == null) {
            return "no_home";
        }
        return t.c("android", resolveInfoResolveActivity.activityInfo.packageName) ? "no_default" : resolveInfoResolveActivity.activityInfo.name;
    }

    @Override // jx.g
    public String c() {
        return Build.VERSION.RELEASE;
    }

    @Override // jx.h
    public void d() {
        SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
        editorEdit.putBoolean("shared_prefs_strong_box_issue", true);
        editorEdit.commit();
    }

    @Override // jx.g
    public String e() {
        return String.valueOf(this.biometricManager.c(v.e(ax.d.STRONG)));
    }

    @Override // jx.g
    public long f() throws PackageManager.NameNotFoundException {
        PackageInfo packageInfo = this.context.getPackageManager().getPackageInfo("com.google.android.gms", 0);
        return Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002c  */
    /* JADX WARN: Code duplicated, block: B:14:0x002f A[RETURN] */
    @Override // jx.g
    public int g() {
        for (FeatureInfo featureInfo : this.context.getPackageManager().getSystemAvailableFeatures()) {
            if (t.c("android.hardware.vulkan.level", featureInfo.name) || t.c("android.hardware.vulkan.version", featureInfo.name)) {
                if (featureInfo != null) {
                    return featureInfo.version;
                }
                return 0;
            }
        }
        featureInfo = null;
        if (featureInfo != null) {
            return featureInfo.version;
        }
        return 0;
    }

    @Override // jx.g
    public boolean h() {
        return this.accessibilityTalkBackManager.c();
    }

    @Override // jx.g
    public boolean i() {
        return this.networkConnectionManager.c();
    }

    @Override // jx.g
    public int j() {
        return Build.VERSION.SDK_INT;
    }

    @Override // jx.g
    public boolean k(String packageName) {
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                this.context.getPackageManager().getApplicationInfo(packageName, PackageManager.ApplicationInfoFlags.of(0L));
                return true;
            }
            this.context.getPackageManager().getApplicationInfo(packageName, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    @Override // jx.g
    public boolean l() {
        return this.nfcManager.isEnabled();
    }

    @Override // jx.g
    public boolean m() {
        return this.networkConnectionManager.b();
    }

    @Override // jx.g
    public String n() {
        return Locale.getDefault().getLanguage();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001f  */
    /* JADX WARN: Code duplicated, block: B:14:0x0026 A[RETURN] */
    @Override // jx.g
    public int o() {
        for (FeatureInfo featureInfo : this.context.getPackageManager().getSystemAvailableFeatures()) {
            if (featureInfo.name == null && featureInfo.reqGlEsVersion != 0) {
                if (featureInfo != null) {
                    return w(featureInfo.reqGlEsVersion);
                }
                return 1;
            }
        }
        featureInfo = null;
        if (featureInfo != null) {
            return w(featureInfo.reqGlEsVersion);
        }
        return 1;
    }

    @Override // jx.g
    public boolean p() {
        return this.gpsManager.d();
    }

    @Override // jx.g
    public String q() {
        return String.valueOf(this.context.getResources().getConfiguration().fontScale);
    }

    @Override // jx.g
    public boolean r() {
        return (Settings.Global.getFloat(this.context.getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f && Settings.Global.getFloat(this.context.getContentResolver(), "transition_animation_scale", 1.0f) == 0.0f && Settings.Global.getFloat(this.context.getContentResolver(), "window_animation_scale", 1.0f) == 0.0f) ? false : true;
    }

    @Override // jx.g
    public boolean s() {
        return this.accessibilityTalkBackManager.b();
    }

    @Override // jx.g
    public boolean t() {
        boolean z15 = this.sharedPreferences.getBoolean("shared_prefs_strong_box_issue", false);
        String strA = this.deviceInfo.a();
        String strV = v();
        if (z15) {
            return true;
        }
        wq.a<f> aVarJ = f.j();
        ArrayList arrayList = new ArrayList();
        for (f fVar : aVarJ) {
            f fVar2 = fVar;
            if (fVar2.e().isEmpty() || fVar2.e().contains(strV)) {
                arrayList.add(fVar);
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (t.c(strA, ((f) it.next()).getDeviceModel())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // jx.g
    public boolean u() {
        if (Build.VERSION.SDK_INT >= 28) {
            return this.context.getPackageManager().hasSystemFeature("android.hardware.strongbox_keystore");
        }
        return false;
    }

    public String v() {
        return Build.DISPLAY;
    }
}
