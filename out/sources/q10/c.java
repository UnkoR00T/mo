package q10;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.Set;
import oq.k;
import oq.l;
import p071kotlin.Metadata;
import pq.e1;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\f\u0010\u000bJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\tH\u0017¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0013R\u001b\u0010\u0018\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u000f¨\u0006\u001b"}, d2 = {"Lq10/c;", "Lq10/a;", "Landroid/content/Context;", "context", "", "registryFileName", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "databaseName", "Loq/i0;", "c", "(Ljava/lang/String;)V", "a", "", "d", "()Ljava/util/Set;", "b", "()V", "Landroid/content/Context;", "Ljava/lang/String;", "Landroid/content/SharedPreferences;", "Loq/k;", "g", "()Landroid/content/SharedPreferences;", "databaseRegistry", "h", "nameSet", "storage_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String registryFileName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final k databaseRegistry;

    public c(Context context, String str) {
        this.context = context;
        this.registryFileName = str;
        this.databaseRegistry = l.a(new er.a() { // from class: q10.b
            @Override // er.a
            public final Object a() {
                return c.f(this.f163568a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SharedPreferences f(c cVar) {
        SharedPreferences sharedPreferences = cVar.context.getSharedPreferences(cVar.registryFileName, 0);
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        throw new IllegalStateException(("Failed to create database registry with name: " + cVar.registryFileName).toString());
    }

    private final SharedPreferences g() {
        return (SharedPreferences) this.databaseRegistry.getValue();
    }

    private final Set<String> h() {
        Set<String> stringSet = g().getStringSet("database_registry_set", e1.e());
        return stringSet == null ? e1.e() : stringSet;
    }

    @Override // q10.a
    @SuppressLint({"ApplySharedPref"})
    public void a(String databaseName) {
        Set<String> setK = e1.k(h(), databaseName);
        SharedPreferences.Editor editorEdit = g().edit();
        editorEdit.putStringSet("database_registry_set", setK);
        editorEdit.commit();
    }

    @Override // q10.a
    @SuppressLint({"ApplySharedPref"})
    public void b() {
        g().edit().clear().commit();
    }

    @Override // q10.a
    @SuppressLint({"ApplySharedPref"})
    public void c(String databaseName) {
        g().edit().putStringSet("database_registry_set", e1.m(h(), databaseName)).commit();
    }

    @Override // q10.a
    public Set<String> d() {
        return h();
    }

    public /* synthetic */ c(Context context, String str, int i15, fr.k kVar) {
        this(context, (i15 & 2) != 0 ? "database_registry" : str);
    }
}
