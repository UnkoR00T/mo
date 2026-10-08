package o10;

import android.content.Context;
import dx.i;
import dx.j;
import ex.d;
import iy.a0;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import net.zetetic.database.sqlcipher.SupportOpenHelperFactory;
import oa.n;
import oa.u;
import oq.g;
import oq.p;
import p071kotlin.Metadata;
import px.f;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JW\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00028\u00000\u0013\"\b\b\u0000\u0010\t*\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lo10/c;", "Lo10/a;", "Landroid/content/Context;", "applicationContext", "Lp10/b;", "databaseKeyProvider", "<init>", "(Landroid/content/Context;Lp10/b;)V", "Loa/u;", "T", "Ljava/lang/Class;", "databaseClass", "", "", "converters", "Lra/b;", "migrations", "Lo10/b;", "name", "Ldx/i;", "Ldx/b;", "a", "(Ljava/lang/Class;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)Ldx/i;", "Landroid/content/Context;", "b", "Lp10/b;", "storage_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context applicationContext;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p10.b databaseKeyProvider;

    public c(Context context, p10.b bVar) {
        this.applicationContext = context;
        this.databaseKeyProvider = bVar;
    }

    @Override // o10.a
    public <T extends u> i<dx.b, T> a(Class<T> databaseClass, List<? extends Object> converters, List<? extends ra.b> migrations, String name) {
        Object objB;
        j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    if (!this.databaseKeyProvider.a()) {
                        aVar.b(dx.b.j.d.f45088a);
                        throw new g();
                    }
                    System.loadLibrary("sqlcipher");
                    u.a<T> aVarG = n.a(this.applicationContext, databaseClass, name).g(new SupportOpenHelperFactory(((a0) aVar.a(this.databaseKeyProvider.getKey())).getData()));
                    Iterator<T> it = converters.iterator();
                    while (it.hasNext()) {
                        aVarG.c(it.next());
                    }
                    Iterator<T> it4 = migrations.iterator();
                    while (it4.hasNext()) {
                        aVarG.b((ra.b) it4.next());
                    }
                    return new i.Right(aVarG.e());
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new i.Left((dx.b) d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            f fVar = f.f163100a;
            String message = e18.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e18, px.c.a(jVarA));
            Object objA = jVarA.a(e18);
            if (objA instanceof i.Left) {
                objB = new dx.b.Generic((Exception) ((i.Left) objA).b());
            } else {
                if (!(objA instanceof i.Right)) {
                    throw new p();
                }
                objB = ((i.Right) objA).b();
            }
            return new i.Left(objB);
        }
    }
}
