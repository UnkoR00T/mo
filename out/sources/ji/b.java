package ji;

import android.graphics.Bitmap;
import androidx.annotation.RecentlyNonNull;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class b {
    @RecentlyNonNull
    public static b b(@RecentlyNonNull Bitmap bitmap) {
        return new v(bitmap);
    }

    @RecentlyNonNull
    public abstract Bitmap a();
}
