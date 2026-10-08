package ad;

import android.view.View;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a1\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroid/view/View;", "T", "view", "", "subtractPadding", "Lad/k;", "a", "(Landroid/view/View;Z)Lad/k;", "coil-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class l {
    public static final <T extends View> k<T> a(T t15, boolean z15) {
        return new RealViewSizeResolver(t15, z15);
    }

    public static /* synthetic */ k b(View view, boolean z15, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            z15 = true;
        }
        return a(view, z15);
    }
}
