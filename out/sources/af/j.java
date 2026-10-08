package af;

import android.annotation.SuppressLint;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes3.dex */
abstract class j {
    @SuppressLint({"ThreadPoolCreation"})
    static Executor a() {
        return new m(Executors.newSingleThreadExecutor());
    }
}
