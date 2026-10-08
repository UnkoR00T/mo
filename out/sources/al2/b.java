package al2;

import cz.c;
import cz.d;
import oq.i0;
import oq.k;
import oq.l;
import p071kotlin.Metadata;
import tq.e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \n2\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\n\u0010\bR\u001b\u0010\u000f\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lal2/b;", "Lcl2/a;", "Lcz/c;", "persistentStorageFactory", "<init>", "(Lcz/c;)V", "Loq/i0;", "a", "(Ltq/e;)Ljava/lang/Object;", "", "b", "Lcz/b;", "Loq/k;", "d", "()Lcz/b;", "storage", "myikp_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements cl2.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f7723c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final k storage;

    public b(final c cVar) {
        this.storage = l.a(new er.a() { // from class: al2.a
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
        return cVar.a("shared_prefs_my_ikp_show_info_alert", d.ENCRYPTED);
    }

    @Override // cl2.a
    public Object a(e<? super i0> eVar) {
        Object objC = d().c(cz.b.a.b("SHARED_PREFERENCES_My_IKP_SHOW_INFO_ALERT_KEY"), false, eVar);
        return objC == uq.b.e() ? objC : i0.f148189a;
    }

    @Override // cl2.a
    public Object b(e<? super Boolean> eVar) {
        return d().h(cz.b.a.b("SHARED_PREFERENCES_My_IKP_SHOW_INFO_ALERT_KEY"), true, eVar);
    }
}
