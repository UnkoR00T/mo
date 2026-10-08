package oi;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.Status;
import ii.h;
import ii.i;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Loi/b;", "", "Lii/h;", "prediction", "Lii/i;", "sessionToken", "Loq/i0;", "v", "(Lii/h;Lii/i;)V", "Lcom/google/android/gms/common/api/Status;", "errorStatus", "b", "(Lcom/google/android/gms/common/api/Status;)V", "java.com.google.android.libraries.places.widget.listener_prediction_listener_3p"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface b {
    void b(@RecentlyNonNull Status errorStatus);

    void v(@RecentlyNonNull h prediction, @RecentlyNonNull i sessionToken);
}
