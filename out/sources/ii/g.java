package ii;

import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class g implements Parcelable {
    @RecentlyNonNull
    public static g b(@RecentlyNonNull List<f> list) {
        return new v3(ak.n0.v(list));
    }

    @RecentlyNonNull
    public abstract List<f> a();
}
