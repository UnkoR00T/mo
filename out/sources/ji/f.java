package ji;

import android.net.Uri;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class f {
    @RecentlyNonNull
    public static f b(@RecentlyNonNull Uri uri) {
        return new b0(uri);
    }

    @RecentlyNullable
    public abstract Uri a();
}
