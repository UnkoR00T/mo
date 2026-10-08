package ii;

import android.os.ParcelUuid;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public abstract class i implements Parcelable {
    @RecentlyNonNull
    public static i a() {
        return new b4(new ParcelUuid(UUID.randomUUID()));
    }

    abstract ParcelUuid b();

    @RecentlyNonNull
    public final String toString() {
        return b().toString();
    }
}
