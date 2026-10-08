package ln;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class o implements en.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f118895a = new j();

    @Override // en.g
    public hn.b a(String str, en.a aVar, int i15, int i16, Map<en.c, ?> map) {
        if (aVar != en.a.UPC_A) {
            throw new IllegalArgumentException("Can only encode UPC-A, but got " + aVar);
        }
        return this.f118895a.a('0' + str, en.a.EAN_13, i15, i16, map);
    }
}
