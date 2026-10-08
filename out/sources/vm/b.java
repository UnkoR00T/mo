package vm;

import android.media.Image;

/* JADX INFO: loaded from: classes4.dex */
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Image f207431a;

    b(Image image) {
        this.f207431a = image;
    }

    final Image a() {
        return this.f207431a;
    }

    final Image.Plane[] b() {
        return this.f207431a.getPlanes();
    }
}
