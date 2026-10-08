package p10;

import android.content.Context;
import dx.i;
import java.util.List;
import oa.u;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJX\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00028\u00000\u0015\"\b\b\u0000\u0010\u000b*\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019H\u0096\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0019H\u0096\u0001¢\u0006\u0004\b\u001c\u0010\u001bJ\u0018\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u0013H\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010!¨\u0006\""}, d2 = {"Lp10/f;", "Lp10/e;", "Landroid/content/Context;", "applicationContext", "Lo10/c;", "factory", "Lq10/a;", "databaseRegistry", "<init>", "(Landroid/content/Context;Lo10/c;Lq10/a;)V", "Loa/u;", "T", "Ljava/lang/Class;", "databaseClass", "", "", "converters", "Lra/b;", "migrations", "Lo10/b;", "name", "Ldx/i;", "Ldx/b;", "b", "(Ljava/lang/Class;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)Ldx/i;", "Loq/i0;", "c", "()V", "d", "a", "(Ljava/lang/String;)V", "Landroid/content/Context;", "Lo10/c;", "Lq10/a;", "storage_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ a f151490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Context applicationContext;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final o10.c factory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final q10.a databaseRegistry;

    public f(Context context, o10.c cVar, q10.a aVar) {
        this.f151490a = new a(context, cVar, aVar);
        this.applicationContext = context;
        this.factory = cVar;
        this.databaseRegistry = aVar;
    }

    @Override // p10.e
    public void a(String name) {
        this.f151490a.a(name);
    }

    @Override // p10.e
    public <T extends u> i<dx.b, T> b(Class<T> databaseClass, List<? extends Object> converters, List<? extends ra.b> migrations, String name) {
        return this.f151490a.b(databaseClass, converters, migrations, name);
    }

    public void c() {
        this.f151490a.c();
    }

    public void d() {
        this.f151490a.d();
    }
}
