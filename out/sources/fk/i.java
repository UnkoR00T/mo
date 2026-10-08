package fk;

import com.google.crypto.tink.shaded.protobuf.b0;
import com.google.crypto.tink.shaded.protobuf.r0;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
class i<PrimitiveT, KeyProtoT extends r0> implements h<PrimitiveT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final nk.d<KeyProtoT> f64354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class<PrimitiveT> f64355b;

    private static class a<KeyFormatProtoT extends r0, KeyProtoT extends r0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final nk.d.a<KeyFormatProtoT, KeyProtoT> f64356a;

        a(nk.d.a<KeyFormatProtoT, KeyProtoT> aVar) {
            this.f64356a = aVar;
        }

        private KeyProtoT b(KeyFormatProtoT keyformatprotot) {
            this.f64356a.e(keyformatprotot);
            return (KeyProtoT) this.f64356a.a(keyformatprotot);
        }

        KeyProtoT a(com.google.crypto.tink.shaded.protobuf.h hVar) {
            return (KeyProtoT) b(this.f64356a.d(hVar));
        }
    }

    public i(nk.d<KeyProtoT> dVar, Class<PrimitiveT> cls) {
        if (!dVar.i().contains(cls) && !Void.class.equals(cls)) {
            throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", dVar.toString(), cls.getName()));
        }
        this.f64354a = dVar;
        this.f64355b = cls;
    }

    private a<?, KeyProtoT> e() {
        return new a<>(this.f64354a.f());
    }

    private PrimitiveT f(KeyProtoT keyprotot) throws GeneralSecurityException {
        if (Void.class.equals(this.f64355b)) {
            throw new GeneralSecurityException("Cannot create a primitive for Void");
        }
        this.f64354a.j(keyprotot);
        return (PrimitiveT) this.f64354a.e(keyprotot, this.f64355b);
    }

    @Override // fk.h
    public final sk.y a(com.google.crypto.tink.shaded.protobuf.h hVar) throws GeneralSecurityException {
        try {
            return sk.y.d0().H(b()).I(e().a(hVar).l()).G(this.f64354a.g()).build();
        } catch (b0 e15) {
            throw new GeneralSecurityException("Unexpected proto", e15);
        }
    }

    @Override // fk.h
    public final String b() {
        return this.f64354a.d();
    }

    @Override // fk.h
    public final PrimitiveT c(com.google.crypto.tink.shaded.protobuf.h hVar) throws GeneralSecurityException {
        try {
            return f(this.f64354a.h(hVar));
        } catch (b0 e15) {
            throw new GeneralSecurityException("Failures parsing proto of type " + this.f64354a.c().getName(), e15);
        }
    }

    @Override // fk.h
    public final r0 d(com.google.crypto.tink.shaded.protobuf.h hVar) throws GeneralSecurityException {
        try {
            return e().a(hVar);
        } catch (b0 e15) {
            throw new GeneralSecurityException("Failures parsing proto of type " + this.f64354a.f().b().getName(), e15);
        }
    }
}
