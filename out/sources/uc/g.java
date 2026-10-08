package uc;

import ed.u;
import java.util.Map;
import kc.n;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Q\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\b\b*\u0001#\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ;\u0010\u0015\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010$R\u0014\u0010\u0013\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010 R$\u0010)\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u00028V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b(\u0010 \"\u0004\b!\u0010\u001d¨\u0006*"}, d2 = {"Luc/g;", "Luc/i;", "", "initialMaxSize", "Luc/j;", "weakMemoryCache", "<init>", "(JLuc/j;)V", "Luc/d$b;", "key", "Luc/d$c;", "a", "(Luc/d$b;)Luc/d$c;", "Lkc/n;", "image", "", "", "", "extras", "size", "Loq/i0;", "d", "(Luc/d$b;Lkc/n;Ljava/util/Map;J)V", "", "f", "(Luc/d$b;)Z", "clear", "()V", "e", "(J)V", "J", "c", "()J", "b", "Luc/j;", "uc/g$b", "Luc/g$b;", "cache", "getSize", "value", "h", "maxSize", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long initialMaxSize;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final j weakMemoryCache;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final b cache = new b(getInitialMaxSize());

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000f\u001a\u0004\b\u000b\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Luc/g$a;", "", "Lkc/n;", "image", "", "", "extras", "", "size", "<init>", "(Lkc/n;Ljava/util/Map;J)V", "a", "Lkc/n;", "b", "()Lkc/n;", "Ljava/util/Map;", "()Ljava/util/Map;", "c", "J", "()J", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final n image;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Map<String, Object> extras;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final long size;

        public a(n nVar, Map<String, ? extends Object> map, long j15) {
            this.image = nVar;
            this.extras = map;
            this.size = j15;
        }

        public final Map<String, Object> a() {
            return this.extras;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final n getImage() {
            return this.image;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final long getSize() {
            return this.size;
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"uc/g$b", "Led/u;", "Luc/d$b;", "Luc/g$a;", "key", "value", "", "n", "(Luc/d$b;Luc/g$a;)J", "oldValue", "newValue", "Loq/i0;", "m", "(Luc/d$b;Luc/g$a;Luc/g$a;)V", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends u<d.Key, a> {
        b(long j15) {
            super(j15);
        }

        @Override // ed.u
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public void b(d.Key key, a oldValue, a newValue) {
            g.this.weakMemoryCache.d(key, oldValue.getImage(), oldValue.a(), oldValue.getSize());
        }

        @Override // ed.u
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public long k(d.Key key, a value) {
            return value.getSize();
        }
    }

    public g(long j15, j jVar) {
        this.initialMaxSize = j15;
        this.weakMemoryCache = jVar;
    }

    @Override // uc.i
    public d.Value a(d.Key key) {
        a aVarC = this.cache.c(key);
        if (aVarC != null) {
            return new d.Value(aVarC.getImage(), aVarC.a());
        }
        return null;
    }

    @Override // uc.i
    public void b(long j15) {
        this.cache.j(j15);
    }

    @Override // uc.i
    /* JADX INFO: renamed from: c, reason: from getter */
    public long getInitialMaxSize() {
        return this.initialMaxSize;
    }

    @Override // uc.i
    public void clear() {
        this.cache.a();
    }

    @Override // uc.i
    public void d(d.Key key, n image, Map<String, ? extends Object> extras, long size) {
        if (size <= h()) {
            this.cache.f(key, new a(image, extras, size));
        } else {
            this.cache.h(key);
            this.weakMemoryCache.d(key, image, extras, size);
        }
    }

    @Override // uc.i
    public void e(long size) {
        this.cache.l(size);
    }

    @Override // uc.i
    public boolean f(d.Key key) {
        return this.cache.h(key) != null;
    }

    @Override // uc.i
    public long getSize() {
        return this.cache.e();
    }

    public long h() {
        return this.cache.getMaxSize();
    }
}
