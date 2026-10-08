package fh;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f63034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f63035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final dl.d f63036c;

    f2(Map map, Map map2, dl.d dVar) {
        this.f63034a = map;
        this.f63035b = map2;
        this.f63036c = dVar;
    }

    public final byte[] a(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new b2(byteArrayOutputStream, this.f63034a, this.f63035b, this.f63036c).i(obj);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
