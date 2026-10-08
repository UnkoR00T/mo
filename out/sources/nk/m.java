package nk;

import com.google.crypto.tink.shaded.protobuf.r0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class m<PrimitiveT, KeyProtoT extends r0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<PrimitiveT> f137068a;

    public m(Class<PrimitiveT> cls) {
        this.f137068a = cls;
    }

    public abstract PrimitiveT a(KeyProtoT keyprotot);

    final Class<PrimitiveT> b() {
        return this.f137068a;
    }
}
