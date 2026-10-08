package nk;

import nk.q;

/* JADX INFO: loaded from: classes4.dex */
public abstract class j<SerializationT extends q> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final uk.a f137059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class<SerializationT> f137060b;

    class a extends j<SerializationT> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f137061c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(uk.a aVar, Class cls, b bVar) {
            super(aVar, cls, null);
            this.f137061c = bVar;
        }
    }

    public interface b<SerializationT extends q> {
    }

    /* synthetic */ j(uk.a aVar, Class cls, a aVar2) {
        this(aVar, cls);
    }

    public static <SerializationT extends q> j<SerializationT> a(b<SerializationT> bVar, uk.a aVar, Class<SerializationT> cls) {
        return new a(aVar, cls, bVar);
    }

    public final uk.a b() {
        return this.f137059a;
    }

    public final Class<SerializationT> c() {
        return this.f137060b;
    }

    private j(uk.a aVar, Class<SerializationT> cls) {
        this.f137059a = aVar;
        this.f137060b = cls;
    }
}
