package t10;

import android.content.Context;
import java.io.File;
import ju.g1;
import ju.q0;
import ju.z2;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lt10/c;", "", "Landroid/content/Context;", "context", "Lt10/f;", "dataStoreRegistry", "<init>", "(Landroid/content/Context;Lt10/f;)V", "", "fileName", "Lu6/i;", "Ly6/h;", "c", "(Ljava/lang/String;)Lu6/i;", "a", "Landroid/content/Context;", "b", "Lt10/f;", "storage_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final f dataStoreRegistry;

    public c(Context context, f fVar) {
        this.context = context;
        this.dataStoreRegistry = fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y6.h d(u6.d dVar) {
        return y6.i.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final File e(c cVar, String str) {
        return x6.c.a(cVar.context, str);
    }

    public final u6.i<y6.h> c(final String fileName) {
        u6.i<y6.h> iVarC = y6.g.f224378a.c(new v6.b<>(new er.l() { // from class: t10.a
            @Override // er.l
            public final Object b(Object obj) {
                return c.d((u6.d) obj);
            }
        }), v.e(x6.k.b(this.context, fileName, null, 4, null)), q0.a(g1.b().n0(z2.b(null, 1, null))), new er.a() { // from class: t10.b
            @Override // er.a
            public final Object a() {
                return c.e(this.f186866a, fileName);
            }
        });
        this.dataStoreRegistry.g(fileName);
        return iVarC;
    }
}
