package hg;

import android.os.Looper;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Set f84317a = Collections.newSetFromMap(new WeakHashMap());

    @Deprecated
    public interface a extends ig.d {
    }

    @Deprecated
    public interface b extends ig.m {
    }

    public Looper a() {
        throw new UnsupportedOperationException();
    }
}
