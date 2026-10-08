package eh;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f50258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f50259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final dl.d f50260c;

    b2(Map map, Map map2, dl.d dVar) {
        this.f50258a = map;
        this.f50259b = map2;
        this.f50260c = dVar;
    }

    public final byte[] a(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new y1(byteArrayOutputStream, this.f50258a, this.f50259b, this.f50260c).i(obj);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
