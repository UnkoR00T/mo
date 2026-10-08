package ed;

import java.util.List;
import java.util.ServiceLoader;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R1\u0010\u000b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003 \u0006*\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u00050\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR)\u0010\u000f\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\f0\f0\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000e\u0010\n¨\u0006\u0010"}, d2 = {"Led/a0;", "", "<init>", "()V", "", "Led/i;", "kotlin.jvm.PlatformType", "b", "Loq/k;", "f", "()Ljava/util/List;", "fetchers", "Led/f;", "c", "e", "decoders", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a0 f49451a = new a0();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final oq.k fetchers = oq.l.a(new er.a() { // from class: ed.y
        @Override // er.a
        public final Object a() {
            return a0.d();
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final oq.k decoders = oq.l.a(new er.a() { // from class: ed.z
        @Override // er.a
        public final Object a() {
            return a0.c();
        }
    });

    private a0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List c() {
        return c.c(eu.k.P(eu.k.g(ServiceLoader.load(f.class, f.class.getClassLoader()).iterator())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List d() {
        return c.c(eu.k.P(eu.k.g(ServiceLoader.load(i.class, i.class.getClassLoader()).iterator())));
    }

    public final List<f> e() {
        return (List) decoders.getValue();
    }

    public final List<i<?>> f() {
        return (List) fetchers.getValue();
    }
}
