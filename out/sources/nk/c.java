package nk;

import fk.g;
import nk.q;

/* JADX INFO: loaded from: classes4.dex */
public abstract class c<KeyT extends fk.g, SerializationT extends q> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<KeyT> f137038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class<SerializationT> f137039b;

    class a extends c<KeyT, SerializationT> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f137040c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Class cls, Class cls2, b bVar) {
            super(cls, cls2, null);
            this.f137040c = bVar;
        }
    }

    public interface b<KeyT extends fk.g, SerializationT extends q> {
    }

    /* synthetic */ c(Class cls, Class cls2, a aVar) {
        this(cls, cls2);
    }

    public static <KeyT extends fk.g, SerializationT extends q> c<KeyT, SerializationT> a(b<KeyT, SerializationT> bVar, Class<KeyT> cls, Class<SerializationT> cls2) {
        return new a(cls, cls2, bVar);
    }

    public Class<KeyT> b() {
        return this.f137038a;
    }

    public Class<SerializationT> c() {
        return this.f137039b;
    }

    private c(Class<KeyT> cls, Class<SerializationT> cls2) {
        this.f137038a = cls;
        this.f137039b = cls2;
    }
}
