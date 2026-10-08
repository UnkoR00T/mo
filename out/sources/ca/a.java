package ca;

import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.KSerializer;
import oq.p;
import p071kotlin.Metadata;
import p136y9.g;
import p136y9.l1;
import pq.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\nB\u0017\b\u0016\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0018J;\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00072\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00122\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u0019¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001cR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u001d¨\u0006 "}, d2 = {"Lca/a;", "T", "", "Lkotlinx/serialization/KSerializer;", "serializer", "<init>", "(Lkotlinx/serialization/KSerializer;)V", "", "path", "Loq/i0;", "a", "(Ljava/lang/String;)V", "name", "value", "b", "(Ljava/lang/String;Ljava/lang/String;)V", "", "index", "Ly9/l1;", "type", "Lca/a$a;", "e", "(ILy9/l1;)Lca/a$a;", "d", "()Ljava/lang/String;", "", "c", "(ILjava/lang/String;Ly9/l1;Ljava/util/List;)V", "Lkotlinx/serialization/KSerializer;", "Ljava/lang/String;", "pathArgs", "queryArgs", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final KSerializer<T> serializer;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String path;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private String pathArgs = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private String queryArgs = "";

    /* JADX INFO: renamed from: ca.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lca/a$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private enum EnumC0661a {
        PATH,
        QUERY;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ wq.a f24773d = wq.b.a(b());
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24774a;

        static {
            int[] iArr = new int[EnumC0661a.values().length];
            try {
                iArr[EnumC0661a.PATH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC0661a.QUERY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f24774a = iArr;
        }
    }

    public a(KSerializer<T> kSerializer) {
        this.serializer = kSerializer;
        this.path = kSerializer.getDescriptor().getSerialName();
    }

    private final void a(String path) {
        this.pathArgs += '/' + path;
    }

    private final void b(String name, String value) {
        this.queryArgs += (this.queryArgs.length() == 0 ? "?" : "&") + name + '=' + value;
    }

    private final EnumC0661a e(int index, l1<Object> type) {
        return ((type instanceof g) || this.serializer.getDescriptor().t(index)) ? EnumC0661a.QUERY : EnumC0661a.PATH;
    }

    public final void c(int index, String name, l1<Object> type, List<String> value) {
        int i15 = b.f24774a[e(index, type).ordinal()];
        if (i15 != 1) {
            if (i15 != 2) {
                throw new p();
            }
            Iterator<T> it = value.iterator();
            while (it.hasNext()) {
                b(name, (String) it.next());
            }
            return;
        }
        if (value.size() == 1) {
            a((String) v.l0(value));
            return;
        }
        throw new IllegalArgumentException(("Expected one value for argument " + name + ", found " + value.size() + "values instead.").toString());
    }

    public final String d() {
        return this.path + this.pathArgs + this.queryArgs;
    }
}
