package ii;

import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import java.time.Duration;

/* JADX INFO: loaded from: classes4.dex */
public abstract class z implements Parcelable {
    @RecentlyNonNull
    public static z c(@RecentlyNonNull Duration duration, int i15) {
        return new c5(duration, i15);
    }

    public abstract int a();

    @RecentlyNonNull
    public abstract Duration b();
}
