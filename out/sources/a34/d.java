package a34;

import android.content.SharedPreferences;
import ay.j;
import fr.q0;
import jz3.LogListDto;
import p071kotlin.Metadata;
import t10.k;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\rB\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011¨\u0006\u0014"}, d2 = {"La34/d;", "", "Lt10/k;", "sharedPreferencesFactory", "Lay/j;", "jsonSerializer", "<init>", "(Lt10/k;Lay/j;)V", "Ljz3/b;", "logListDto", "Loq/i0;", "b", "(Ljz3/b;)V", "a", "()Ljz3/b;", "Lay/j;", "Landroid/content/SharedPreferences;", "Landroid/content/SharedPreferences;", "sharedPreferences", "c", "ct_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final j jsonSerializer;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final SharedPreferences sharedPreferences;

    public d(k kVar, j jVar) {
        this.jsonSerializer = jVar;
        this.sharedPreferences = k.b(kVar, "shared_prefs_ct_log_list", null, 2, null);
    }

    public final LogListDto a() {
        String string = this.sharedPreferences.getString("shared_prefs_ct_log_list_key", null);
        if (string != null) {
            try {
                return (LogListDto) this.jsonSerializer.a(string, q0.n(LogListDto.class));
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public final void b(LogListDto logListDto) {
        this.sharedPreferences.edit().putString("shared_prefs_ct_log_list_key", this.jsonSerializer.b(logListDto, q0.n(LogListDto.class))).commit();
    }
}
