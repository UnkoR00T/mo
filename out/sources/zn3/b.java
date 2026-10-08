package zn3;

import cz.c;
import cz.d;
import oq.k;
import oq.l;
import p071kotlin.Metadata;
import tq.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\nB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\n\u0010\u000bR\u001b\u0010\u0010\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lzn3/b;", "Lfo3/a;", "Lcz/c;", "storageFactory", "<init>", "(Lcz/c;)V", "", "value", "b", "(ZLtq/e;)Ljava/lang/Object;", "a", "(Ltq/e;)Ljava/lang/Object;", "Lcz/b;", "Loq/k;", "d", "()Lcz/b;", "storage", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements fo3.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f235774c = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f235775d = cz.b.a.b("SHARED_PREFERENCES_INTRO_SCANNER_KEY");

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final k storage;

    public b(final c cVar) {
        this.storage = l.a(new er.a() { // from class: zn3.a
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
        return cVar.a("shared_prefs_verification_scan_intro", d.PLAIN);
    }

    @Override // fo3.a
    public Object a(e<? super Boolean> eVar) {
        return d().h(f235775d, false, eVar);
    }

    @Override // fo3.a
    public Object b(boolean z15, e<? super Boolean> eVar) {
        return d().c(f235775d, z15, eVar);
    }
}
