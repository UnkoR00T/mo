package b00;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import p071kotlin.Metadata;
import p087nuL.e0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\u0005J\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lb00/r;", "LnuL/e0;", "", "maxItems", "<init>", "(I)V", "newMaxItems", "Loq/i0;", "g", "Landroid/content/Context;", "context", "LNUl/k;", "input", "Landroid/content/Intent;", "d", "(Landroid/content/Context;LNUl/k;)Landroid/content/Intent;", "c", "I", "media_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class r extends e0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int maxItems;

    public r(int i15) {
        super(i15);
        this.maxItems = i15;
    }

    @Override // p087nuL.b0
    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent a(Context context, p006NUl.k input) {
        Intent intentA = super.a(context, input);
        if (Build.VERSION.SDK_INT >= 33) {
            intentA.putExtra("android.provider.extra.PICK_IMAGES_MAX", this.maxItems);
        }
        return intentA;
    }

    public final void g(int newMaxItems) {
        this.maxItems = newMaxItems;
    }
}
