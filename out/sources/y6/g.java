package y6;

import fr.t;
import java.io.File;
import java.util.List;
import ju.p0;
import p071kotlin.Metadata;
import u6.q0;
import u6.x;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JU\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f2\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011JU\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00122\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Ly6/g;", "", "<init>", "()V", "Lv6/b;", "Ly6/h;", "corruptionHandler", "", "Lu6/g;", "migrations", "Lju/p0;", "scope", "Lkotlin/Function0;", "Ljava/io/File;", "produceFile", "Lu6/i;", "c", "(Lv6/b;Ljava/util/List;Lju/p0;Ler/a;)Lu6/i;", "Lu6/q0;", "storage", "b", "(Lu6/q0;Lv6/b;Ljava/util/List;Lju/p0;)Lu6/i;", "datastore-preferences-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f224378a = new g();

    private g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final File d(er.a aVar) {
        File file = (File) aVar.a();
        if (t.c(ar.d.j(file), "preferences_pb")) {
            return file.getAbsoluteFile();
        }
        throw new IllegalStateException(("File extension for file: " + file + " does not match required extension for Preferences file: preferences_pb").toString());
    }

    public final u6.i<h> b(q0<h> storage, v6.b<h> corruptionHandler, List<? extends u6.g<h>> migrations, p0 scope) {
        return new e(u6.j.f195555a.a(storage, corruptionHandler, migrations, scope));
    }

    public final u6.i<h> c(v6.b<h> corruptionHandler, List<? extends u6.g<h>> migrations, p0 scope, final er.a<? extends File> produceFile) {
        return new e(b(new x(j.f224382a, null, new er.a() { // from class: y6.f
            @Override // er.a
            public final Object a() {
                return g.d(produceFile);
            }
        }, 2, null), corruptionHandler, migrations, scope));
    }
}
