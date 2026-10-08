package vj;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import vh.o;

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"RestrictedApi"})
public final class h implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m f207106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f207107b = new Handler(Looper.getMainLooper());

    h(m mVar) {
        this.f207106a = mVar;
    }

    @Override // vj.c
    public final vh.l<b> a() {
        return this.f207106a.a();
    }

    @Override // vj.c
    public final vh.l<Void> b(Activity activity, b bVar) {
        if (bVar.b()) {
            return o.f(null);
        }
        Intent intent = new Intent(activity, (Class<?>) PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", bVar.a());
        intent.putExtra("window_flags", activity.getWindow().getDecorView().getWindowSystemUiVisibility());
        vh.m mVar = new vh.m();
        intent.putExtra("result_receiver", new g(this, this.f207107b, mVar));
        activity.startActivity(intent);
        return mVar.a();
    }
}
