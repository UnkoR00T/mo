package ai;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.api.Status;
import hg.k;
import p006NUl.j;
import p087nuL.b0;
import vh.l;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d<I, O> extends b0<l<I>, O> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Status f6374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private PendingIntent f6375b;

    @Override // p087nuL.b0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent a(Context context, l<I> lVar) {
        return new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", new j.a(this.f6375b).a());
    }

    @Override // p087nuL.b0
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public b0.a<O> b(Context context, l<I> lVar) {
        if (!lVar.p()) {
            throw new IllegalArgumentException("The task has to be executed before using this API to resolve its result.");
        }
        Exception excL = lVar.l();
        if (excL instanceof hg.b) {
            this.f6374a = ((hg.b) excL).a();
            if (excL instanceof k) {
                this.f6375b = ((k) excL).c();
            }
        }
        if (this.f6375b == null) {
            return new b0.a<>(f(lVar));
        }
        return null;
    }

    protected abstract O f(l<I> lVar);
}
