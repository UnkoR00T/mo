package t10;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.Set;
import p071kotlin.Metadata;
import pq.e1;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0003\u0018\u0000 \u00192\u00020\u0001:\u0001\u0012B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\n0\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u001d¨\u0006\u001f"}, d2 = {"Lt10/m;", "", "Landroid/content/Context;", "context", "Lt10/g;", "externalPreferencesProvider", "Lpx/b;", "logger", "<init>", "(Landroid/content/Context;Lt10/g;Lpx/b;)V", "", "preferencesName", "Loq/i0;", "g", "(Ljava/lang/String;)V", "c", "()V", "b", "a", "Landroid/content/Context;", "Lt10/g;", "Lpx/b;", "Landroid/content/SharedPreferences;", "d", "Loq/k;", "e", "()Landroid/content/SharedPreferences;", "preferencesRegistry", "", "()Ljava/util/Set;", "nameSet", "storage_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final g externalPreferencesProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final px.b logger;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final oq.k preferencesRegistry = oq.l.a(new er.a() { // from class: t10.l
        @Override // er.a
        public final Object a() {
            return m.f(this.f186950a);
        }
    });

    public m(Context context, g gVar, px.b bVar) {
        this.context = context;
        this.externalPreferencesProvider = gVar;
        this.logger = bVar;
        bVar.n7("Current shared preferences set:", px.c.a(this));
        for (String str : d()) {
            this.logger.n7("- " + str, px.c.a(this));
        }
    }

    private final Set<String> d() {
        Set<String> stringSet = e().getStringSet("preferences_registry_set", e1.e());
        return stringSet == null ? e1.e() : stringSet;
    }

    private final SharedPreferences e() {
        return (SharedPreferences) this.preferencesRegistry.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SharedPreferences f(m mVar) {
        SharedPreferences sharedPreferences = mVar.context.getSharedPreferences("preferences_registry", 0);
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        throw new IllegalStateException("Failed to create shared preferences with name: preferences_registry");
    }

    public final void b(String preferencesName) {
        if (d().contains(preferencesName)) {
            this.logger.n7("Deleting shared preferences: " + preferencesName, px.c.a(this));
            Set<String> setD = d();
            Set<String> setK = e1.k(setD, preferencesName);
            this.logger.n7("Sets are different. Old set:", px.c.a(this));
            for (String str : setD) {
                this.logger.n7("- " + str, px.c.a(this));
            }
            this.logger.n7("New set:", px.c.a(this));
            for (String str2 : setK) {
                this.logger.n7("- " + str2, px.c.a(this));
            }
            this.context.deleteSharedPreferences(preferencesName);
            e().edit().putStringSet("preferences_registry_set", setK).commit();
        }
    }

    public final void c() {
        this.logger.n7("Deleting shared preferences:", px.c.a(this));
        for (String str : d()) {
            this.logger.n7("- " + str, px.c.a(this));
            this.context.deleteSharedPreferences(str);
        }
        this.logger.n7("Deleting external shared preferences:", px.c.a(this));
        for (String str2 : this.externalPreferencesProvider.a()) {
            this.logger.n7("- " + str2, px.c.a(this));
            this.context.deleteSharedPreferences(str2);
        }
        this.context.deleteSharedPreferences("preferences_registry");
    }

    @SuppressLint({"ApplySharedPref"})
    public final void g(String preferencesName) {
        this.logger.n7("Register shared preferences: " + preferencesName, px.c.a(this));
        Set<String> setD = d();
        Set<String> setM = e1.m(setD, preferencesName);
        if (setD.containsAll(setM)) {
            this.logger.n7("Sets are equal", px.c.a(this));
        } else {
            this.logger.n7("Sets are different. Old set:", px.c.a(this));
            for (String str : setD) {
                this.logger.n7("- " + str, px.c.a(this));
            }
            this.logger.n7("New set:", px.c.a(this));
            for (String str2 : setM) {
                this.logger.n7("- " + str2, px.c.a(this));
            }
        }
        e().edit().putStringSet("preferences_registry_set", setM).commit();
    }
}
