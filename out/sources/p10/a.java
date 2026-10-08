package p10;

import android.content.Context;
import dx.i;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import oa.u;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJW\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00028\u00000\u0015\"\b\b\u0000\u0010\u000b*\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010!R \u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010#R\u0014\u0010'\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, d2 = {"Lp10/a;", "Lp10/e;", "Landroid/content/Context;", "applicationContext", "Lo10/a;", "factory", "Lq10/a;", "databaseRegistry", "<init>", "(Landroid/content/Context;Lo10/a;Lq10/a;)V", "Loa/u;", "T", "Ljava/lang/Class;", "databaseClass", "", "", "converters", "Lra/b;", "migrations", "Lo10/b;", "name", "Ldx/i;", "Ldx/b;", "b", "(Ljava/lang/Class;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)Ldx/i;", "Loq/i0;", "c", "()V", "d", "a", "(Ljava/lang/String;)V", "Landroid/content/Context;", "Lo10/a;", "Lq10/a;", "", "Ljava/util/Map;", "databaseCache", "e", "Ljava/lang/Object;", "lock", "storage_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context applicationContext;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final o10.a factory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final q10.a databaseRegistry;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Map<o10.b, u> databaseCache = new LinkedHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Object lock = new Object();

    public a(Context context, o10.a aVar, q10.a aVar2) {
        this.applicationContext = context;
        this.factory = aVar;
        this.databaseRegistry = aVar2;
    }

    @Override // p10.e
    public void a(String name) {
        this.applicationContext.deleteDatabase(name);
        this.databaseRegistry.a(name);
    }

    @Override // p10.e
    public <T extends u> i<dx.b, T> b(Class<T> databaseClass, List<? extends Object> converters, List<? extends ra.b> migrations, String name) {
        synchronized (this.lock) {
            boolean zContainsKey = this.databaseCache.containsKey(o10.b.a(name));
            if (zContainsKey) {
                u uVar = this.databaseCache.get(o10.b.a(name));
                if (databaseClass.isInstance(uVar)) {
                    return new i.Right(uVar);
                }
                return new i.Left(new dx.b.Generic(new ClassCastException("Invalid database type")));
            }
            if (zContainsKey) {
                throw new p();
            }
            i<dx.b, T> iVarA = this.factory.a(databaseClass, converters, migrations, name);
            if (iVarA instanceof i.Right) {
                this.databaseCache.put(o10.b.a(name), (u) ((i.Right) iVarA).b());
                this.databaseRegistry.c(name);
            }
            return iVarA;
        }
    }

    public void c() {
        synchronized (this.lock) {
            try {
                Map<o10.b, u> map = this.databaseCache;
                Iterator<T> it = map.values().iterator();
                while (it.hasNext()) {
                    ((u) it.next()).j();
                }
                map.clear();
                i0 i0Var = i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public void d() {
        c();
        Iterator<T> it = this.databaseRegistry.d().iterator();
        while (it.hasNext()) {
            this.applicationContext.deleteDatabase((String) it.next());
        }
        this.databaseRegistry.b();
    }
}
