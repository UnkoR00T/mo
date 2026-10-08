package ch;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class u2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f26393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f26394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final dl.d f26395c;

    u2(Map map, Map map2, dl.d dVar) {
        this.f26393a = map;
        this.f26394b = map2;
        this.f26395c = dVar;
    }

    public final byte[] a(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new r2(byteArrayOutputStream, this.f26393a, this.f26394b, this.f26395c).i(obj);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
