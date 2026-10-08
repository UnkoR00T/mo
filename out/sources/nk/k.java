package nk;

import fk.u;
import nk.q;

/* JADX INFO: loaded from: classes4.dex */
public abstract class k<ParametersT extends u, SerializationT extends q> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<ParametersT> f137062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class<SerializationT> f137063b;

    class a extends k<ParametersT, SerializationT> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f137064c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Class cls, Class cls2, b bVar) {
            super(cls, cls2, null);
            this.f137064c = bVar;
        }
    }

    public interface b<ParametersT extends u, SerializationT extends q> {
    }

    /* synthetic */ k(Class cls, Class cls2, a aVar) {
        this(cls, cls2);
    }

    public static <ParametersT extends u, SerializationT extends q> k<ParametersT, SerializationT> a(b<ParametersT, SerializationT> bVar, Class<ParametersT> cls, Class<SerializationT> cls2) {
        return new a(cls, cls2, bVar);
    }

    public Class<ParametersT> b() {
        return this.f137062a;
    }

    public Class<SerializationT> c() {
        return this.f137063b;
    }

    private k(Class<ParametersT> cls, Class<SerializationT> cls2) {
        this.f137062a = cls;
        this.f137063b = cls2;
    }
}
