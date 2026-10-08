package o14;

import android.os.Build;
import oq.i0;
import p071kotlin.Metadata;
import v04.ShowSnackbarEvent;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lo14/d;", "La14/d;", "Lzy/a;", "clipboardManager", "Lgx/d;", "globalEventManager", "<init>", "(Lzy/a;Lgx/d;)V", "La14/d$a;", "params", "Loq/i0;", "d", "(La14/d$a;Ltq/e;)Ljava/lang/Object;", "a", "Lzy/a;", "b", "Lgx/d;", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements a14.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final zy.a clipboardManager;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final gx.d globalEventManager;

    public d(zy.a aVar, gx.d dVar) {
        this.clipboardManager = aVar;
        this.globalEventManager = dVar;
    }

    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(a14.d.Params params, tq.e<? super i0> eVar) {
        this.clipboardManager.a(params.getValue());
        i0 i0Var = i0.f148189a;
        if (Build.VERSION.SDK_INT <= 32) {
            this.globalEventManager.c(new ShowSnackbarEvent(params.getSnackbarLabel()));
        }
        return i0.f148189a;
    }
}
