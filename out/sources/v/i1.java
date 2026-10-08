package v;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class i1 {
    public static i1 a(Executor executor, Handler handler) {
        return new i(executor, handler);
    }

    public abstract Executor b();

    public abstract Handler c();
}
