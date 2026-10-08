package t10;

import android.content.Context;
import android.content.SharedPreferences;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lt10/k;", "", "Landroid/content/Context;", "context", "Lt10/m;", "sharedPreferencesRegistry", "<init>", "(Landroid/content/Context;Lt10/m;)V", "", "fileName", "Landroid/content/SharedPreferences;", "c", "(Ljava/lang/String;)Landroid/content/SharedPreferences;", "masterKeyAlias", "a", "(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences;", "Landroid/content/Context;", "b", "Lt10/m;", "storage_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final m sharedPreferencesRegistry;

    public k(Context context, m mVar) {
        this.context = context;
        this.sharedPreferencesRegistry = mVar;
    }

    public static /* synthetic */ SharedPreferences b(k kVar, String str, String str2, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            str2 = xa.b.c(xa.b.f217734a);
        }
        return kVar.a(str, str2);
    }

    public final SharedPreferences a(String fileName, String masterKeyAlias) {
        SharedPreferences sharedPreferencesA = xa.a.a(fileName, masterKeyAlias, this.context, xa.a.c.AES256_SIV, xa.a.d.AES256_GCM);
        this.sharedPreferencesRegistry.g(fileName);
        return sharedPreferencesA;
    }

    public final SharedPreferences c(String fileName) {
        SharedPreferences sharedPreferences = this.context.getSharedPreferences(fileName, 0);
        this.sharedPreferencesRegistry.g(fileName);
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        throw new IllegalStateException(("Failed to create shared preferences with name: " + fileName).toString());
    }
}
