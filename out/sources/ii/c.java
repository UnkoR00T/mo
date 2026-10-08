package ii;

import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class c implements Parcelable {
    @RecentlyNonNull
    public static c b(@RecentlyNonNull List<b> list) {
        return new m3(list);
    }

    @RecentlyNonNull
    public abstract List<b> a();
}
