package lh2;

import oq.k;
import oq.l;
import p071kotlin.Metadata;
import tq.e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\fR\u001b\u0010\u0011\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Llh2/d;", "Lnh2/a;", "Lcz/c;", "persistentStorageFactory", "<init>", "(Lcz/c;)V", "", "a", "(Ltq/e;)Ljava/lang/Object;", "setLanguage", "", "b", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lcz/b;", "Loq/k;", "d", "()Lcz/b;", "persistentStorage", "langswitch_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements nh2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final k persistentStorage;

    public d(final cz.c cVar) {
        this.persistentStorage = l.a(new er.a() { // from class: lh2.c
            @Override // er.a
            public final Object a() {
                return d.e(cVar);
            }
        });
    }

    private final cz.b d() {
        return (cz.b) this.persistentStorage.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final cz.b e(cz.c cVar) {
        return cVar.a("shared_prefs_lang_switch", cz.d.PLAIN);
    }

    @Override // nh2.a
    public Object a(e<? super String> eVar) {
        return d().j(cz.b.a.b("SHARED_PREFS_LANGUAGE"), eVar);
    }

    @Override // nh2.a
    public Object b(String str, e<? super Boolean> eVar) {
        return d().e(cz.b.a.b("SHARED_PREFS_LANGUAGE"), str, eVar);
    }
}
