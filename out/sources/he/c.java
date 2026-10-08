package he;

import android.content.Context;
import be.v;
import java.security.MessageDigest;
import zd.l;

/* JADX INFO: loaded from: classes3.dex */
public final class c<T> implements l<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final l<?> f83965b = new c();

    private c() {
    }

    public static <T> c<T> c() {
        return (c) f83965b;
    }

    @Override // zd.l
    public v<T> a(Context context, v<T> vVar, int i15, int i16) {
        return vVar;
    }

    @Override // zd.f
    public void b(MessageDigest messageDigest) {
    }
}
