package x6;

import android.content.Context;
import er.l;
import java.io.File;
import java.util.List;
import ju.p0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001BI\b\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007\u0012\u001e\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b0\n0\t\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J*\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0011\u001a\u00020\u00022\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0012H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001c\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R,\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b0\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001cR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lx6/e;", "Lir/d;", "Landroid/content/Context;", "Lu6/i;", "Ly6/h;", "", "name", "Lv6/b;", "corruptionHandler", "Lkotlin/Function1;", "", "Lu6/g;", "produceMigrations", "Lju/p0;", "scope", "<init>", "(Ljava/lang/String;Lv6/b;Ler/l;Lju/p0;)V", "thisRef", "Lmr/l;", "property", "d", "(Landroid/content/Context;Lmr/l;)Lu6/i;", "a", "Ljava/lang/String;", "b", "Lv6/b;", "c", "Ler/l;", "Lju/p0;", "", "e", "Ljava/lang/Object;", "lock", "f", "Lu6/i;", "INSTANCE", "datastore-preferences"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e implements ir.d<Context, u6.i<y6.h>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final v6.b<y6.h> corruptionHandler;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final l<Context, List<u6.g<y6.h>>> produceMigrations;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final p0 scope;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Object lock = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private volatile u6.i<y6.h> INSTANCE;

    /* JADX WARN: Multi-variable type inference failed */
    public e(String str, v6.b<y6.h> bVar, l<? super Context, ? extends List<? extends u6.g<y6.h>>> lVar, p0 p0Var) {
        this.name = str;
        this.corruptionHandler = bVar;
        this.produceMigrations = lVar;
        this.scope = p0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final File e(Context context, e eVar) {
        return c.a(context, eVar.name);
    }

    @Override // ir.d
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public u6.i<y6.h> a(Context thisRef, mr.l<?> property) {
        u6.i<y6.h> iVar;
        u6.i<y6.h> iVar2 = this.INSTANCE;
        if (iVar2 != null) {
            return iVar2;
        }
        synchronized (this.lock) {
            try {
                if (this.INSTANCE == null) {
                    final Context applicationContext = thisRef.getApplicationContext();
                    this.INSTANCE = y6.g.f224378a.c(this.corruptionHandler, this.produceMigrations.b(applicationContext), this.scope, new er.a() { // from class: x6.d
                        @Override // er.a
                        public final Object a() {
                            return e.e(applicationContext, this);
                        }
                    });
                }
                iVar = this.INSTANCE;
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return iVar;
    }
}
