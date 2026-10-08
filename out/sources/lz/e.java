package lz;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.provider.Settings;
import fu.o;
import fu.r;
import java.util.Locale;
import oq.p;
import p071kotlin.Metadata;
import t10.k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u00142\u00020\u0001:\u0001\u0013B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\rJ\u000f\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\rJ\u000f\u0010\u0013\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\rJ\u000f\u0010\u0014\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0014\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0016R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0017¨\u0006\u0018"}, d2 = {"Llz/e;", "Ljx/d;", "Landroid/content/Context;", "context", "Lt10/k;", "sharedPreferencesFactory", "Lkotlin/Function0;", "Ljx/d$a;", "preferencesConf", "<init>", "(Landroid/content/Context;Lt10/k;Ler/a;)V", "", "e", "()Ljava/lang/String;", "Landroid/content/SharedPreferences;", "f", "()Landroid/content/SharedPreferences;", "c", "b", "a", "d", "Landroid/content/Context;", "Lt10/k;", "Ler/a;", "info_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements jx.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k sharedPreferencesFactory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final er.a<jx.d.a> preferencesConf;

    /* JADX WARN: Multi-variable type inference failed */
    public e(Context context, k kVar, er.a<? extends jx.d.a> aVar) {
        this.context = context;
        this.sharedPreferencesFactory = kVar;
        this.preferencesConf = aVar;
    }

    private final String e() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        Locale locale = Locale.ROOT;
        if (r.V(str2.toLowerCase(locale), str.toLowerCase(locale), false, 2, null)) {
            return dz.e.a(str2, Locale.ENGLISH);
        }
        return dz.e.a(str, Locale.ENGLISH) + ' ' + str2;
    }

    private final SharedPreferences f() {
        jx.d.a aVarA = this.preferencesConf.a();
        if (aVarA instanceof jx.d.a.Plain) {
            return this.sharedPreferencesFactory.c(((jx.d.a.Plain) aVarA).getPreferencesName());
        }
        if (aVarA instanceof jx.d.a.Encrypted) {
            return k.b(this.sharedPreferencesFactory, ((jx.d.a.Encrypted) aVarA).getPreferencesName(), null, 2, null);
        }
        throw new p();
    }

    @Override // jx.d
    public String a() {
        return Build.MODEL;
    }

    @Override // jx.d
    public String b() {
        return d();
    }

    @Override // jx.d
    public String c() {
        String strE;
        SharedPreferences sharedPreferencesF = f();
        try {
            if (Build.VERSION.SDK_INT >= 32) {
                String string = Settings.Global.getString(this.context.getContentResolver(), "device_name");
                strE = sharedPreferencesF.getString("DEVICE_NAME", string != null ? new o("[^a-zA-Z0-9 ]+").h(string, "") : null);
            } else {
                String string2 = Settings.Secure.getString(this.context.getContentResolver(), "bluetooth_name");
                strE = sharedPreferencesF.getString("DEVICE_NAME", string2 != null ? new o("[^a-zA-Z0-9 ]+").h(string2, "") : null);
            }
        } catch (Exception unused) {
            strE = e();
        }
        return strE == null ? e() : strE;
    }

    @SuppressLint({"HardwareIds"})
    public final String d() {
        return Settings.Secure.getString(this.context.getContentResolver(), "android_id");
    }
}
