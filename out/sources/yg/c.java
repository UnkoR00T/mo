package yg;

import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ClassLoader f226800a = c.class.getClassLoader();

    private c() {
    }

    public static void a(Parcel parcel, boolean z15) {
        parcel.writeInt(z15 ? 1 : 0);
    }

    public static boolean b(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
