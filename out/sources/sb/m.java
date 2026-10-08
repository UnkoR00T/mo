package sb;

import android.content.Context;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lsb/m;", "Lsb/k;", "<init>", "()V", "Landroid/content/Context;", "context", "", "a", "(Landroid/content/Context;)F", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class m implements k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m f179867b = new m();

    private m() {
    }

    @Override // sb.k
    public float a(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }
}
