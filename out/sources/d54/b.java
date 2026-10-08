package d54;

import android.content.SharedPreferences;
import fr.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import oq.k;
import oq.l;
import oq.r;
import oq.y;
import p071kotlin.Metadata;
import pq.v0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010&\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001f2\u00020\u0001:\u0001\u0012B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ3\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e0\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0019R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Ld54/b;", "Lf54/a;", "Lt10/k;", "sharedPreferencesFactory", "", "Lb54/b;", "localFeatureFlags", "<init>", "(Lt10/k;Ljava/util/List;)V", "", "", "", "entry", "Loq/r;", "", "f", "(Ljava/util/Map$Entry;)Loq/r;", "", "a", "()Ljava/util/Map;", "featureFlag", "enabled", "Loq/i0;", "b", "(Lb54/b;Z)V", "Ljava/util/List;", "Landroid/content/SharedPreferences;", "Loq/k;", "d", "()Landroid/content/SharedPreferences;", "sharedPreferences", "c", "flags_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f54.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a f40027c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<b54.b> localFeatureFlags;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k sharedPreferences;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ld54/b$a;", "", "<init>", "()V", "", "SHARED_PREFERENCES_FILE_NAME", "Ljava/lang/String;", "flags_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(final t10.k kVar, List<? extends b54.b> list) {
        this.localFeatureFlags = list;
        this.sharedPreferences = l.a(new er.a() { // from class: d54.a
            @Override // er.a
            public final Object a() {
                return b.e(kVar);
            }
        });
    }

    private final SharedPreferences d() {
        return (SharedPreferences) this.sharedPreferences.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SharedPreferences e(t10.k kVar) {
        return kVar.c("shared_prefs_local_feature_flags");
    }

    private final r<b54.b, Boolean> f(Map.Entry<String, ? extends Object> entry) {
        Object next;
        Iterator<T> it = this.localFeatureFlags.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!t.c(((b54.b) next).getSerializedName(), entry.getKey()));
        b54.b bVar = (b54.b) next;
        if (bVar != null) {
            return y.a(bVar, (Boolean) entry.getValue());
        }
        return null;
    }

    @Override // f54.a
    public Map<b54.b, Boolean> a() {
        Map<String, ?> all = d().getAll();
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<String, ?>> it = all.entrySet().iterator();
        while (it.hasNext()) {
            r<b54.b, Boolean> rVarF = f(it.next());
            if (rVarF != null) {
                arrayList.add(rVarF);
            }
        }
        return v0.s(arrayList);
    }

    @Override // f54.a
    public void b(b54.b featureFlag, boolean enabled) {
        d().edit().putBoolean(featureFlag.getSerializedName(), enabled).apply();
    }
}
