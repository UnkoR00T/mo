package dh;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f42098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f42099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final dl.d f42100c;

    o(Map map, Map map2, dl.d dVar) {
        this.f42098a = map;
        this.f42099b = map2;
        this.f42100c = dVar;
    }

    public final byte[] a(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new l(byteArrayOutputStream, this.f42098a, this.f42099b, this.f42100c).i(obj);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
