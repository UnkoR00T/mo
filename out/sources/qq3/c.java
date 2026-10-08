package qq3;

import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import p071kotlin.Metadata;
import pq.e1;
import t10.k;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 \u00132\u00020\u0001:\u0001\u000fB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R0\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\t\"\u0004\b\u000f\u0010\r¨\u0006\u0015"}, d2 = {"Lqq3/c;", "Lsq3/b;", "Lt10/k;", "sharedPreferencesFactory", "<init>", "(Lt10/k;)V", "", "", "c", "()Ljava/util/Set;", "values", "Loq/i0;", "d", "(Ljava/util/Set;)V", "Landroid/content/SharedPreferences;", "a", "Landroid/content/SharedPreferences;", "sharedPreferences", "value", "b", "displayedAnnouncementsIds", "whatsnew_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements sq3.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f168139c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final SharedPreferences sharedPreferences;

    public c(k kVar) {
        this.sharedPreferences = kVar.c("shared_prefs_whatsnew");
    }

    private final Set<Long> c() {
        Set<String> stringSet = this.sharedPreferences.getStringSet("SHARED_PREFS_DISPLAYED_ANNOUNCEMENT_IDS", null);
        if (stringSet == null) {
            return e1.e();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = stringSet.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(Long.valueOf(Long.parseLong((String) it.next())));
        }
        return linkedHashSet;
    }

    private final void d(Set<Long> values) {
        SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = values.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(String.valueOf(((Number) it.next()).longValue()));
        }
        editorEdit.putStringSet("SHARED_PREFS_DISPLAYED_ANNOUNCEMENT_IDS", linkedHashSet).apply();
    }

    @Override // sq3.b
    public void a(Set<Long> set) {
        d(set);
    }

    @Override // sq3.b
    public Set<Long> b() {
        return c();
    }
}
