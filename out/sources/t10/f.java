package t10;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;
import java.util.Iterator;
import java.util.Set;
import p071kotlin.Metadata;
import pq.e1;
import pq.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0004\u0018\u0000 \u00172\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\nJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0015\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lt10/f;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "message", "Loq/i0;", "e", "(Ljava/lang/String;)V", "preferencesName", "g", "b", "()V", "a", "Landroid/content/Context;", "Landroid/content/SharedPreferences;", "Loq/k;", "d", "()Landroid/content/SharedPreferences;", "preferencesRegistry", "", "c", "()Ljava/util/Set;", "nameSet", "storage_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final oq.k preferencesRegistry = oq.l.a(new er.a() { // from class: t10.e
        @Override // er.a
        public final Object a() {
            return f.f(this.f186893a);
        }
    });

    public f(Context context) {
        this.context = context;
        e("Current data store preferences set:");
        Iterator<T> it = c().iterator();
        while (it.hasNext()) {
            e("- " + ((String) it.next()));
        }
    }

    private final Set<String> c() {
        Set<String> stringSet = d().getStringSet("data_store_preferences_registry_set", e1.e());
        return stringSet == null ? e1.e() : stringSet;
    }

    private final SharedPreferences d() {
        return (SharedPreferences) this.preferencesRegistry.getValue();
    }

    private final void e(String message) {
        px.f.f163100a.b(message, v.e(new px.a.Class(this)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SharedPreferences f(f fVar) {
        SharedPreferences sharedPreferences = fVar.context.getSharedPreferences("data_store_preferences_registry", 0);
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        throw new IllegalStateException("Failed to create shared preferences with name: data_store_preferences_registry");
    }

    public final void b() {
        e("Deleting shared preferences:");
        for (String str : c()) {
            File fileA = x6.c.a(this.context, str);
            if (fileA.delete()) {
                e("- " + str + ": deleted " + fileA.getPath());
            } else {
                e("- " + str + ": failed to delete");
            }
        }
        this.context.deleteSharedPreferences("data_store_preferences_registry");
    }

    @SuppressLint({"ApplyDataStorePref"})
    public final void g(String preferencesName) {
        e("Register shared preferences: " + preferencesName);
        Set<String> setC = c();
        Set<String> setM = e1.m(setC, preferencesName);
        if (setC.containsAll(setM)) {
            e("Sets are equal");
        } else {
            e("Sets are different. Old set:");
            Iterator<T> it = setC.iterator();
            while (it.hasNext()) {
                e("- " + ((String) it.next()));
            }
            e("- New set:");
            Iterator<T> it4 = setM.iterator();
            while (it4.hasNext()) {
                e("- " + ((String) it4.next()));
            }
        }
        d().edit().putStringSet("data_store_preferences_registry_set", setM).commit();
    }
}
