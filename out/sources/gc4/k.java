package gc4;

import android.os.Build;
import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Lgc4/k;", "Lac4/m;", "Lkx/d;", "intentActionManager", "<init>", "(Lkx/d;)V", "Lgz/b$a$a;", "params", "Ldx/i;", "", "Lac4/h;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lkx/d;", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k implements ac4.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final kx.d intentActionManager;

    public k(kx.d dVar) {
        this.intentActionManager = dVar;
    }

    @Override // gz.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object c(gz.b.a.C1792a c1792a, tq.e<? super dx.i<Object, ac4.h>> eVar) {
        if (Build.VERSION.SDK_INT < 30) {
            return new dx.i.Left(ac4.f.f5394a);
        }
        kx.f fVarA = this.intentActionManager.a(kx.a.i.f112930a);
        if (t.c(fVarA, kx.f.a.f112942a)) {
            return new dx.i.Left(ac4.f.f5394a);
        }
        if (t.c(fVarA, kx.f.b.f112943a)) {
            return new dx.i.Left(ac4.g.f5395a);
        }
        if (t.c(fVarA, kx.f.c.f112944a)) {
            return new dx.i.Right(ac4.h.f5396a);
        }
        throw new oq.p();
    }
}
