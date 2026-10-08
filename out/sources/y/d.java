package y;

import android.util.Size;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Comparator<Size> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f222444a;

    public d() {
        this(false);
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(Size size, Size size2) {
        int iSignum = Long.signum((((long) size.getWidth()) * ((long) size.getHeight())) - (((long) size2.getWidth()) * ((long) size2.getHeight())));
        return this.f222444a ? iSignum * (-1) : iSignum;
    }

    public d(boolean z15) {
        this.f222444a = z15;
    }
}
