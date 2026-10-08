package d44;

import android.content.SharedPreferences;
import fv.v;
import oq.k;
import oq.l;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0010R\u001b\u0010\u0015\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Ld44/b;", "Lg44/a;", "Lt10/k;", "sharedPreferencesFactory", "Ly04/a;", "buildConfigRepository", "<init>", "(Lt10/k;Ly04/a;)V", "", "a", "()Ljava/lang/String;", "url", "Loq/i0;", "c", "(Ljava/lang/String;)V", "b", "Ly04/a;", "Landroid/content/SharedPreferences;", "Loq/k;", "e", "()Landroid/content/SharedPreferences;", "sharedPreferences", "dynamicbaseurl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements g44.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a f40003c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final y04.a buildConfigRepository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k sharedPreferences;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Ld44/b$a;", "", "<init>", "()V", "", "SHARED_PREFERENCES_FILE_NAME", "Ljava/lang/String;", "SHARED_PREFERENCES_URL_KEY", "dynamicbaseurl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        private a() {
        }
    }

    public b(final t10.k kVar, y04.a aVar) {
        this.buildConfigRepository = aVar;
        this.sharedPreferences = l.a(new er.a() { // from class: d44.a
            @Override // er.a
            public final Object a() {
                return b.f(kVar);
            }
        });
    }

    private final SharedPreferences e() {
        return (SharedPreferences) this.sharedPreferences.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SharedPreferences f(t10.k kVar) {
        return t10.k.b(kVar, "shared_prefs_dynamic_url", null, 2, null);
    }

    @Override // g44.a
    public String a() {
        String string = e().getString("shared_prefs_base_url", null);
        return string == null ? b() : string;
    }

    @Override // g44.a
    public String b() {
        return new v.a().s(this.buildConfigRepository.getServerScheme()).i(this.buildConfigRepository.getServerHost()).d().getUrl();
    }

    @Override // g44.a
    public void c(String url) {
        SharedPreferences.Editor editorEdit = e().edit();
        editorEdit.putString("shared_prefs_base_url", url);
        editorEdit.apply();
    }
}
