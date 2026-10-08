package b34;

import android.content.SharedPreferences;
import ay.j;
import fr.q0;
import java.util.Map;
import mr.r;
import p071kotlin.Metadata;
import pl.gov.coi.mobywatel.technical.ct.data.crl.CachedCrlEntryDto;
import pq.v0;
import px.c;
import px.f;
import t10.k;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00152\u00020\u0001:\u0001\u000fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\r\u001a\u00020\f2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0013¨\u0006\u0016"}, d2 = {"Lb34/b;", "", "Lt10/k;", "sharedPreferencesFactory", "Lay/j;", "jsonSerializer", "<init>", "(Lt10/k;Lay/j;)V", "", "", "Lpl/gov/coi/mobywatel/technical/ct/data/crl/CachedCrlEntryDto;", "entries", "Loq/i0;", "b", "(Ljava/util/Map;)V", "a", "()Ljava/util/Map;", "Lay/j;", "Landroid/content/SharedPreferences;", "Landroid/content/SharedPreferences;", "sharedPreferences", "c", "ct_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final j jsonSerializer;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final SharedPreferences sharedPreferences;

    public b(k kVar, j jVar) {
        this.jsonSerializer = jVar;
        this.sharedPreferences = k.b(kVar, "shared_prefs_crl_cache", null, 2, null);
    }

    public final Map<String, CachedCrlEntryDto> a() {
        Map<String, CachedCrlEntryDto> map = null;
        String string = this.sharedPreferences.getString("shared_prefs_crl_cache_key", null);
        if (string != null) {
            try {
                j jVar = this.jsonSerializer;
                r.Companion companion = r.INSTANCE;
                Map<String, CachedCrlEntryDto> map2 = (Map) jVar.a(string, q0.p(Map.class, companion.d(q0.n(String.class)), companion.d(q0.n(CachedCrlEntryDto.class))));
                f.f163100a.b("CrlStorageCache: retrieved " + map2.size() + " entries from storage cache", c.a(this));
                map = map2;
            } catch (Exception unused) {
            }
            if (map != null) {
                return map;
            }
        }
        return v0.i();
    }

    public final void b(Map<String, CachedCrlEntryDto> entries) {
        j jVar = this.jsonSerializer;
        r.Companion companion = r.INSTANCE;
        this.sharedPreferences.edit().putString("shared_prefs_crl_cache_key", jVar.b(entries, q0.p(Map.class, companion.d(q0.n(String.class)), companion.d(q0.n(CachedCrlEntryDto.class))))).commit();
    }
}
