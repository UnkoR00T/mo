package ku1;

import cz.c;
import cz.d;
import oq.i0;
import oq.k;
import oq.l;
import p071kotlin.Metadata;
import tq.e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\fR\u001b\u0010\u0011\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lku1/b;", "Lmu1/a;", "Lcz/c;", "storageFactory", "<init>", "(Lcz/c;)V", "", "show", "Loq/i0;", "b", "(ZLtq/e;)Ljava/lang/Object;", "a", "(Ltq/e;)Ljava/lang/Object;", "Lcz/b;", "Loq/k;", "d", "()Lcz/b;", "storage", "drivinglicence_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements mu1.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f112706b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f112707c = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f112708d = cz.b.a.b("SHARED_PREFERENCES_TEMPORARY_DRIVERS_LICENCE_SHOW_TOAST_KEY");

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final k storage;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lku1/b$a;", "", "<init>", "()V", "", "SHARED_PREFERENCES_FILE_NAME", "Ljava/lang/String;", "drivinglicence_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        private a() {
        }
    }

    public b(final c cVar) {
        this.storage = l.a(new er.a() { // from class: ku1.a
            @Override // er.a
            public final Object a() {
                return b.e(cVar);
            }
        });
    }

    private final cz.b d() {
        return (cz.b) this.storage.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final cz.b e(c cVar) {
        return cVar.a("shared_prefs_temporary_drivers_licence_show_toast", d.PLAIN);
    }

    @Override // mu1.a
    public Object a(e<? super Boolean> eVar) {
        return d().h(f112708d, true, eVar);
    }

    @Override // mu1.a
    public Object b(boolean z15, e<? super i0> eVar) {
        Object objC = d().c(f112708d, z15, eVar);
        return objC == uq.b.e() ? objC : i0.f148189a;
    }
}
