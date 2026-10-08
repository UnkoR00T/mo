package tj;

import com.google.android.gms.common.api.Status;
import hg.b;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public class a extends b {
    public a(int i15) {
        super(new Status(i15, String.format(Locale.getDefault(), "Install Error(%d): %s", Integer.valueOf(i15), uj.a.a(i15))));
        if (i15 == 0) {
            throw new IllegalArgumentException("errorCode should not be 0.");
        }
    }
}
