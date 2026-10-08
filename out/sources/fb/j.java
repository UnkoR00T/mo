package fb;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes3.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ViewGroup f60622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Runnable f60623b;

    public static j b(ViewGroup viewGroup) {
        return (j) viewGroup.getTag(h.f60600c);
    }

    static void c(ViewGroup viewGroup, j jVar) {
        viewGroup.setTag(h.f60600c, jVar);
    }

    public void a() {
        Runnable runnable;
        if (b(this.f60622a) != this || (runnable = this.f60623b) == null) {
            return;
        }
        runnable.run();
    }
}
