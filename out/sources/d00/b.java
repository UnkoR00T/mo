package d00;

import fr.t;
import java.util.LinkedHashMap;
import java.util.Map;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import tq.e;
import vq.d;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JD\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u001c\u0010\u000e\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000bH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\"\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00190\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Ld00/b;", "Ld00/a;", "Lez/a;", "currentTimeProvider", "<init>", "(Lez/a;)V", "T", "", "id", "", "timeout", "Lkotlin/Function1;", "Ltq/e;", "", "call", "V", "(IJLer/l;Ltq/e;)Ljava/lang/Object;", "Loq/i0;", "n", "(I)V", "clear", "()V", "a", "Lez/a;", "", "Ld00/b$a;", "b", "Ljava/util/Map;", "registry", "memory_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ez.a currentTimeProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Map<Integer, Cached> registry = new LinkedHashMap();

    /* JADX INFO: renamed from: d00.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, d2 = {"Ld00/b$a;", "", "result", "", "timeout", "<init>", "(Ljava/lang/Object;J)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "()Ljava/lang/Object;", "b", "J", "()J", "memory_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Cached {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Object result;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final long timeout;

        public Cached(Object obj, long j15) {
            this.result = obj;
            this.timeout = j15;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getResult() {
            return this.result;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getTimeout() {
            return this.timeout;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Cached)) {
                return false;
            }
            Cached cached = (Cached) other;
            return t.c(this.result, cached.result) && this.timeout == cached.timeout;
        }

        public int hashCode() {
            return (this.result.hashCode() * 31) + Long.hashCode(this.timeout);
        }

        public String toString() {
            return "Cached(result=" + this.result + ", timeout=" + this.timeout + ')';
        }
    }

    /* JADX INFO: renamed from: d00.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C0841b<T> extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f38943d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f38944e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        long f38945f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        long f38946g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f38947h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f38948j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f38949k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f38951m;

        C0841b(e<? super C0841b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f38949k = obj;
            this.f38951m |= PKIFailureInfo.systemUnavail;
            return b.this.V(0, 0L, null, this);
        }
    }

    public b(ez.a aVar) {
        this.currentTimeProvider = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x016e A[Catch: Exception -> 0x0179, TRY_LEAVE, TryCatch #3 {Exception -> 0x0179, blocks: (B:55:0x016a, B:57:0x016e, B:58:0x0174, B:63:0x0180), top: B:80:0x016a }] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:80:0x016a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01d3, code lost:
    
        if (r0 == r5) goto L71;
     */
    @Override // d00.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <T> java.lang.Object V(int r19, long r20, er.l<? super tq.e<? super T>, ? extends java.lang.Object> r22, tq.e<? super T> r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d00.b.V(int, long, er.l, tq.e):java.lang.Object");
    }

    @Override // wy.c
    public void clear() {
        this.registry.clear();
    }

    @Override // d00.a
    public void n(int id5) {
        this.registry.remove(Integer.valueOf(id5));
    }
}
