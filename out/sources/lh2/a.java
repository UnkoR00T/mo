package lh2;

import android.content.Context;
import android.content.res.Configuration;
import e6.h;
import fr.t;
import java.util.Locale;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Llh2/a;", "", "<init>", "()V", "", "a", "()Ljava/lang/String;", "Landroid/content/Context;", "context", "b", "(Landroid/content/Context;)Ljava/lang/String;", "c", "(Landroid/content/Context;)Landroid/content/Context;", "langswitch_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f118282a = new a();

    private a() {
    }

    private final String a() {
        String language = Locale.getDefault().getLanguage();
        return language == null ? "pl" : language;
    }

    private final String b(Context context) {
        return context.getSharedPreferences("shared_prefs_lang_switch", 0).getString("SHARED_PREFS_LANGUAGE", null);
    }

    public final Context c(Context context) {
        String strA = a();
        String strB = b(context);
        if (strB == null) {
            strB = strA;
        }
        if (t.c(strB, strA)) {
            return context;
        }
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.setLocale(new Locale(h.b(strB).h()));
        return context.createConfigurationContext(configuration);
    }
}
