package zc;

import android.view.View;
import ju.w0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR(\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\r\"\u0004\b\u000b\u0010\u000e¨\u0006\u000f"}, d2 = {"Lzc/s;", "Lzc/d;", "Landroid/view/View;", "view", "Lju/w0;", "Lzc/i;", "job", "<init>", "(Landroid/view/View;Lju/w0;)V", "a", "Landroid/view/View;", "b", "Lju/w0;", "()Lju/w0;", "(Lju/w0;)V", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class s implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final View view;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private volatile w0<? extends i> job;

    public s(View view, w0<? extends i> w0Var) {
        this.view = view;
        this.job = w0Var;
    }

    @Override // zc.d
    public w0<i> a() {
        return this.job;
    }

    public void b(w0<? extends i> w0Var) {
        this.job = w0Var;
    }
}
