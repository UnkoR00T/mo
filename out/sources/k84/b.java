package k84;

import android.content.Context;
import dx.i;
import fr.t;
import kx.d;
import kx.f;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lk84/b;", "", "Landroid/content/Context;", "context", "Lkx/d;", "intentActionManager", "<init>", "(Landroid/content/Context;Lkx/d;)V", "Ldx/i;", "Ldx/b;", "Loq/i0;", "a", "()Ldx/i;", "Landroid/content/Context;", "b", "Lkx/d;", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final d intentActionManager;

    public b(Context context, d dVar) {
        this.context = context;
        this.intentActionManager = dVar;
    }

    public final i<dx.b, i0> a() {
        f fVarA = this.intentActionManager.a(new kx.a.GoToNotificationSettings(this.context.getPackageName()));
        if (t.c(fVarA, f.c.f112944a)) {
            return new i.Right(i0.f148189a);
        }
        if (t.c(fVarA, f.a.f112942a) || t.c(fVarA, f.b.f112943a)) {
            return new i.Left(new dx.b.Generic(new Exception("Cannot open notification settings")));
        }
        throw new p();
    }
}
