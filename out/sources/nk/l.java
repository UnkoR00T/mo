package nk;

import fk.g;

/* JADX INFO: loaded from: classes4.dex */
public abstract class l<KeyT extends fk.g, PrimitiveT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<KeyT> f137065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class<PrimitiveT> f137066b;

    class a extends l<KeyT, PrimitiveT> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f137067c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Class cls, Class cls2, b bVar) {
            super(cls, cls2, null);
            this.f137067c = bVar;
        }

        @Override // nk.l
        public PrimitiveT a(KeyT keyt) {
            return (PrimitiveT) this.f137067c.a(keyt);
        }
    }

    public interface b<KeyT extends fk.g, PrimitiveT> {
        PrimitiveT a(KeyT keyt);
    }

    /* synthetic */ l(Class cls, Class cls2, a aVar) {
        this(cls, cls2);
    }

    public static <KeyT extends fk.g, PrimitiveT> l<KeyT, PrimitiveT> b(b<KeyT, PrimitiveT> bVar, Class<KeyT> cls, Class<PrimitiveT> cls2) {
        return new a(cls, cls2, bVar);
    }

    public abstract PrimitiveT a(KeyT keyt);

    public Class<KeyT> c() {
        return this.f137065a;
    }

    public Class<PrimitiveT> d() {
        return this.f137066b;
    }

    private l(Class<KeyT> cls, Class<PrimitiveT> cls2) {
        this.f137065a = cls;
        this.f137066b = cls2;
    }
}
