package fg;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends ClassLoader {
    @Override // java.lang.ClassLoader
    protected final Class loadClass(String str, boolean z15) {
        return Objects.equals(str, "com.google.android.gms.iid.MessengerCompat") ? l.class : super.loadClass(str, z15);
    }
}
