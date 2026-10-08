package nk;

import fk.y;
import nk.q;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b<SerializationT extends q> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final uk.a f137035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class<SerializationT> f137036b;

    class a extends b<SerializationT> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC3378b f137037c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(uk.a aVar, Class cls, InterfaceC3378b interfaceC3378b) {
            super(aVar, cls, null);
            this.f137037c = interfaceC3378b;
        }

        @Override // nk.b
        public fk.g d(SerializationT serializationt, y yVar) {
            return this.f137037c.a(serializationt, yVar);
        }
    }

    /* JADX INFO: renamed from: nk.b$b, reason: collision with other inner class name */
    public interface InterfaceC3378b<SerializationT extends q> {
        fk.g a(SerializationT serializationt, y yVar);
    }

    /* synthetic */ b(uk.a aVar, Class cls, a aVar2) {
        this(aVar, cls);
    }

    public static <SerializationT extends q> b<SerializationT> a(InterfaceC3378b<SerializationT> interfaceC3378b, uk.a aVar, Class<SerializationT> cls) {
        return new a(aVar, cls, interfaceC3378b);
    }

    public final uk.a b() {
        return this.f137035a;
    }

    public final Class<SerializationT> c() {
        return this.f137036b;
    }

    public abstract fk.g d(SerializationT serializationt, y yVar);

    private b(uk.a aVar, Class<SerializationT> cls) {
        this.f137035a = aVar;
        this.f137036b = cls;
    }
}
