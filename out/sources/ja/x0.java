package ja;

import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001:\u0002\u0017\u001bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\u0005J\u001b\u0010\n\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\f\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\f\u0010\u000bJ*\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH¦@¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0014\u001a\u0004\u0018\u00018\u00002\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0012H&¢\u0006\u0004\b\u0014\u0010\u0015R \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\b0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001c¨\u0006 "}, d2 = {"Lja/x0;", "", "Key", "Value", "<init>", "()V", "Loq/i0;", "e", "Lkotlin/Function0;", "onInvalidatedCallback", "h", "(Ler/a;)V", "i", "Lja/x0$a;", "params", "Lja/x0$b;", "g", "(Lja/x0$a;Ltq/e;)Ljava/lang/Object;", "Lja/y0;", "state", "d", "(Lja/y0;)Ljava/lang/Object;", "Lja/u;", "a", "Lja/u;", "invalidateCallbackTracker", "", "b", "()Z", "jumpingSupported", "c", "keyReuseSupported", "paging-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class x0<Key, Value> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final u<er.a<oq.i0>> invalidateCallbackTracker = new u<>(new er.l() { // from class: ja.w0
        @Override // er.l
        public final Object b(Object obj) {
            return x0.f((er.a) obj);
        }
    }, null, 2, 0 == true ? 1 : 0);

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u0013*\b\b\u0002\u0010\u0002*\u00020\u00012\u00020\u0001:\u0004\u0014\t\u0013\rB\u0019\b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u0004\u0018\u00018\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0011\u0082\u0001\u0003\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lja/x0$a;", "", "Key", "", "loadSize", "", "placeholdersEnabled", "<init>", "(IZ)V", "a", "I", "getLoadSize", "()I", "b", "Z", "getPlaceholdersEnabled", "()Z", "()Ljava/lang/Object;", "key", "c", "d", "Lja/x0$a$a;", "Lja/x0$a$c;", "Lja/x0$a$d;", "paging-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class a<Key> {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int loadSize;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final boolean placeholdersEnabled;

        /* JADX INFO: renamed from: ja.x0$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000*\b\b\u0003\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00030\u0003B\u001f\u0012\u0006\u0010\u0004\u001a\u00028\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00028\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lja/x0$a$a;", "", "Key", "Lja/x0$a;", "key", "", "loadSize", "", "placeholdersEnabled", "<init>", "(Ljava/lang/Object;IZ)V", "d", "Ljava/lang/Object;", "a", "()Ljava/lang/Object;", "paging-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class C2393a<Key> extends a<Key> {

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
            private final Key key;

            public C2393a(Key key, int i15, boolean z15) {
                super(i15, z15, null);
                this.key = key;
            }

            @Override // ja.x0.a
            public Key a() {
                return this.key;
            }
        }

        /* JADX INFO: renamed from: ja.x0$a$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00030\f\"\b\b\u0003\u0010\u0004*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00018\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lja/x0$a$b;", "", "<init>", "()V", "Key", "Lja/y;", "loadType", "key", "", "loadSize", "", "placeholdersEnabled", "Lja/x0$a;", "a", "(Lja/y;Ljava/lang/Object;IZ)Lja/x0$a;", "paging-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {

            /* JADX INFO: renamed from: ja.x0$a$b$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final /* synthetic */ class C2394a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f101222a;

                static {
                    int[] iArr = new int[y.values().length];
                    try {
                        iArr[y.REFRESH.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[y.PREPEND.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[y.APPEND.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    f101222a = iArr;
                }
            }

            public /* synthetic */ Companion(fr.k kVar) {
                this();
            }

            public final <Key> a<Key> a(y loadType, Key key, int loadSize, boolean placeholdersEnabled) {
                int i15 = C2394a.f101222a[loadType.ordinal()];
                if (i15 == 1) {
                    return new d(key, loadSize, placeholdersEnabled);
                }
                if (i15 == 2) {
                    if (key != null) {
                        return new c(key, loadSize, placeholdersEnabled);
                    }
                    throw new IllegalArgumentException("key cannot be null for prepend");
                }
                if (i15 != 3) {
                    throw new oq.p();
                }
                if (key != null) {
                    return new C2393a(key, loadSize, placeholdersEnabled);
                }
                throw new IllegalArgumentException("key cannot be null for append");
            }

            private Companion() {
            }
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000*\b\b\u0003\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00030\u0003B\u001f\u0012\u0006\u0010\u0004\u001a\u00028\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00028\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lja/x0$a$c;", "", "Key", "Lja/x0$a;", "key", "", "loadSize", "", "placeholdersEnabled", "<init>", "(Ljava/lang/Object;IZ)V", "d", "Ljava/lang/Object;", "a", "()Ljava/lang/Object;", "paging-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class c<Key> extends a<Key> {

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
            private final Key key;

            public c(Key key, int i15, boolean z15) {
                super(i15, z15, null);
                this.key = key;
            }

            @Override // ja.x0.a
            public Key a() {
                return this.key;
            }
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000*\b\b\u0003\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00030\u0003B!\u0012\b\u0010\u0004\u001a\u0004\u0018\u00018\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00018\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lja/x0$a$d;", "", "Key", "Lja/x0$a;", "key", "", "loadSize", "", "placeholdersEnabled", "<init>", "(Ljava/lang/Object;IZ)V", "d", "Ljava/lang/Object;", "a", "()Ljava/lang/Object;", "paging-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class d<Key> extends a<Key> {

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
            private final Key key;

            public d(Key key, int i15, boolean z15) {
                super(i15, z15, null);
                this.key = key;
            }

            @Override // ja.x0.a
            public Key a() {
                return this.key;
            }
        }

        public /* synthetic */ a(int i15, boolean z15, fr.k kVar) {
            this(i15, z15);
        }

        public abstract Key a();

        private a(int i15, boolean z15) {
            this.loadSize = i15;
            this.placeholdersEnabled = z15;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u0001*\b\b\u0003\u0010\u0003*\u00020\u00012\u00020\u0001:\u0002\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lja/x0$b;", "", "Key", "Value", "<init>", "()V", "a", "b", "Lja/x0$b$a;", "Lja/x0$b$b;", "paging-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class b<Key, Value> {

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000*\b\b\u0004\u0010\u0002*\u00020\u0001*\b\b\u0005\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lja/x0$b$a;", "", "Key", "Value", "Lja/x0$b;", "", "throwable", "<init>", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Throwable;", "e", "()Ljava/lang/Throwable;", "paging-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class a<Key, Value> extends b<Key, Value> {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final Throwable throwable;

            public a(Throwable th4) {
                super(null);
                this.throwable = th4;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final Throwable getThrowable() {
                return this.throwable;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof a) && fr.t.c(this.throwable, ((a) other).throwable);
            }

            public int hashCode() {
                return this.throwable.hashCode();
            }

            public String toString() {
                return fu.r.p("LoadResult.Error(\n                    |   throwable: " + this.throwable + "\n                    |) ", null, 1, null);
            }
        }

        public /* synthetic */ b(fr.k kVar) {
            this();
        }

        private b() {
        }

        /* JADX INFO: renamed from: ja.x0$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u0000 )*\b\b\u0004\u0010\u0002*\u00020\u0001*\b\b\u0005\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u00042\b\u0012\u0004\u0012\u00028\u00050\u0005:\u0001\u001cB=\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00050\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00018\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00018\u0004\u0012\b\b\u0003\u0010\u000b\u001a\u00020\n\u0012\b\b\u0003\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eB+\b\u0016\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00050\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00018\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00018\u0004¢\u0006\u0004\b\r\u0010\u000fJ\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00050\u0010H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00050\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00018\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\t\u001a\u0004\u0018\u00018\u00048\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u0017R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001e\u0010'\u001a\u0004\b)\u0010\u0017¨\u0006*"}, d2 = {"Lja/x0$b$b;", "", "Key", "Value", "Lja/x0$b;", "", "", "data", "prevKey", "nextKey", "", "itemsBefore", "itemsAfter", "<init>", "(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;II)V", "(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;)V", "", "iterator", "()Ljava/util/Iterator;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "e", "()Ljava/util/List;", "b", "Ljava/lang/Object;", "i", "()Ljava/lang/Object;", "c", "h", "d", "I", "g", "f", "paging-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class C2395b<Key, Value> extends b<Key, Value> implements Iterable<Value>, gr.a {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private static final C2395b f101227g = new C2395b(pq.v.n(), null, null, 0, 0);

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final List<Value> data;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final Key prevKey;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            private final Key nextKey;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
            private final int itemsBefore;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
            private final int itemsAfter;

            /* JADX WARN: Multi-variable type inference failed */
            public C2395b(List<? extends Value> list, Key key, Key key2, int i15, int i16) {
                super(null);
                this.data = list;
                this.prevKey = key;
                this.nextKey = key2;
                this.itemsBefore = i15;
                this.itemsAfter = i16;
                if (i15 != Integer.MIN_VALUE && i15 < 0) {
                    throw new IllegalArgumentException("itemsBefore cannot be negative");
                }
                if (i16 != Integer.MIN_VALUE && i16 < 0) {
                    throw new IllegalArgumentException("itemsAfter cannot be negative");
                }
            }

            public final List<Value> e() {
                return this.data;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof C2395b)) {
                    return false;
                }
                C2395b c2395b = (C2395b) other;
                return fr.t.c(this.data, c2395b.data) && fr.t.c(this.prevKey, c2395b.prevKey) && fr.t.c(this.nextKey, c2395b.nextKey) && this.itemsBefore == c2395b.itemsBefore && this.itemsAfter == c2395b.itemsAfter;
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final int getItemsAfter() {
                return this.itemsAfter;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final int getItemsBefore() {
                return this.itemsBefore;
            }

            public final Key h() {
                return this.nextKey;
            }

            public int hashCode() {
                int iHashCode = this.data.hashCode() * 31;
                Key key = this.prevKey;
                int iHashCode2 = (iHashCode + (key == null ? 0 : key.hashCode())) * 31;
                Key key2 = this.nextKey;
                return ((((iHashCode2 + (key2 != null ? key2.hashCode() : 0)) * 31) + Integer.hashCode(this.itemsBefore)) * 31) + Integer.hashCode(this.itemsAfter);
            }

            public final Key i() {
                return this.prevKey;
            }

            @Override // java.lang.Iterable
            public Iterator<Value> iterator() {
                return this.data.listIterator();
            }

            public String toString() {
                return fu.r.p("LoadResult.Page(\n                    |   data size: " + this.data.size() + "\n                    |   first Item: " + pq.v.n0(this.data) + "\n                    |   last Item: " + pq.v.z0(this.data) + "\n                    |   nextKey: " + this.nextKey + "\n                    |   prevKey: " + this.prevKey + "\n                    |   itemsBefore: " + this.itemsBefore + "\n                    |   itemsAfter: " + this.itemsAfter + "\n                    |) ", null, 1, null);
            }

            public C2395b(List<? extends Value> list, Key key, Key key2) {
                this(list, key, key2, PKIFailureInfo.systemUnavail, PKIFailureInfo.systemUnavail);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 f(er.a aVar) {
        aVar.a();
        return oq.i0.f148189a;
    }

    public boolean b() {
        return false;
    }

    public boolean c() {
        return false;
    }

    public abstract Key d(PagingState<Key, Value> state);

    public final void e() {
        if (this.invalidateCallbackTracker.a()) {
            v0 v0Var = v0.f101202a;
            if (v0Var.a(3)) {
                v0Var.b(3, "Invalidated PagingSource " + this, null);
            }
        }
    }

    public abstract Object g(a<Key> aVar, tq.e<? super b<Key, Value>> eVar);

    public final void h(er.a<oq.i0> onInvalidatedCallback) {
        this.invalidateCallbackTracker.b(onInvalidatedCallback);
    }

    public final void i(er.a<oq.i0> onInvalidatedCallback) {
        this.invalidateCallbackTracker.c(onInvalidatedCallback);
    }
}
