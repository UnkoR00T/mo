package ja;

import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0004\u000b\f\t\rB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004JD\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u0000\"\b\b\u0001\u0010\u0005*\u00020\u00012\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006H\u0096@¢\u0006\u0004\b\t\u0010\n\u0082\u0001\u0004\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lja/f0;", "", "T", "<init>", "()V", "R", "Lkotlin/Function2;", "Ltq/e;", "transform", "a", "(Ler/p;Ltq/e;)Ljava/lang/Object;", "d", "b", "c", "Lja/f0$a;", "Lja/f0$b;", "Lja/f0$c;", "Lja/f0$d;", "paging-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class f0<T> {

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u001c\u0010\u0010R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001d\u0010\u0010R\u0011\u0010\u001f\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0010¨\u0006 "}, d2 = {"Lja/f0$a;", "", "T", "Lja/f0;", "Lja/y;", "loadType", "", "minPageOffset", "maxPageOffset", "placeholdersRemaining", "<init>", "(Lja/y;III)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lja/y;", "c", "()Lja/y;", "b", "I", "e", "d", "g", "f", "pageCount", "paging-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class a<T> extends f0<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final y loadType;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int minPageOffset;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final int maxPageOffset;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final int placeholdersRemaining;

        /* JADX INFO: renamed from: ja.f0$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final /* synthetic */ class C2371a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f100677a;

            static {
                int[] iArr = new int[y.values().length];
                try {
                    iArr[y.APPEND.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[y.PREPEND.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f100677a = iArr;
            }
        }

        public a(y yVar, int i15, int i16, int i17) {
            super(null);
            this.loadType = yVar;
            this.minPageOffset = i15;
            this.maxPageOffset = i16;
            this.placeholdersRemaining = i17;
            if (yVar == y.REFRESH) {
                throw new IllegalArgumentException("Drop load type must be PREPEND or APPEND");
            }
            if (f() <= 0) {
                throw new IllegalArgumentException(("Drop count must be > 0, but was " + f()).toString());
            }
            if (i17 >= 0) {
                return;
            }
            throw new IllegalArgumentException(("Invalid placeholdersRemaining " + i17).toString());
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final y getLoadType() {
            return this.loadType;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getMaxPageOffset() {
            return this.maxPageOffset;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final int getMinPageOffset() {
            return this.minPageOffset;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return this.loadType == aVar.loadType && this.minPageOffset == aVar.minPageOffset && this.maxPageOffset == aVar.maxPageOffset && this.placeholdersRemaining == aVar.placeholdersRemaining;
        }

        public final int f() {
            return (this.maxPageOffset - this.minPageOffset) + 1;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final int getPlaceholdersRemaining() {
            return this.placeholdersRemaining;
        }

        public int hashCode() {
            return (((((this.loadType.hashCode() * 31) + Integer.hashCode(this.minPageOffset)) * 31) + Integer.hashCode(this.maxPageOffset)) * 31) + Integer.hashCode(this.placeholdersRemaining);
        }

        public String toString() {
            String str;
            int i15 = C2371a.f100677a[this.loadType.ordinal()];
            if (i15 == 1) {
                str = "end";
            } else {
                if (i15 != 2) {
                    throw new IllegalArgumentException("Drop load type must be PREPEND or APPEND");
                }
                str = "front";
            }
            return fu.r.p("PageEvent.Drop from the " + str + " (\n                    |   minPageOffset: " + this.minPageOffset + "\n                    |   maxPageOffset: " + this.maxPageOffset + "\n                    |   placeholdersRemaining: " + this.placeholdersRemaining + "\n                    |)", null, 1, null);
        }
    }

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\b\u0018\u0000 1*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003:\u0001\u0015BI\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010JD\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\b\b\u0002\u0010\u0011*\u00020\u00012\"\u0010\u0014\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0012H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J`\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\"\u001a\u0004\b#\u0010$R#\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00070\u00068\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u001dR\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001a\u0010*\u001a\u0004\b,\u0010\u001dR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b#\u0010.\u001a\u0004\b1\u00100¨\u00062"}, d2 = {"Lja/f0$b;", "", "T", "Lja/f0;", "Lja/y;", "loadType", "", "Lja/m1;", "pages", "", "placeholdersBefore", "placeholdersAfter", "Lja/x;", "sourceLoadStates", "mediatorLoadStates", "<init>", "(Lja/y;Ljava/util/List;IILja/x;Lja/x;)V", "R", "Lkotlin/Function2;", "Ltq/e;", "transform", "a", "(Ler/p;Ltq/e;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "d", "(Lja/y;Ljava/util/List;IILja/x;Lja/x;)Lja/f0$b;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lja/y;", "f", "()Lja/y;", "b", "Ljava/util/List;", "h", "()Ljava/util/List;", "c", "I", "j", "i", "e", "Lja/x;", "k", "()Lja/x;", "g", "paging-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class b<T> extends f0<T> {

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final b<Object> f100679h;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final y loadType;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final List<TransformablePage<T>> pages;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final int placeholdersBefore;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final int placeholdersAfter;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final LoadStates sourceLoadStates;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final LoadStates mediatorLoadStates;

        /* JADX INFO: renamed from: ja.f0$b$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JU\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00020\u000e\"\b\b\u0002\u0010\u0004*\u00020\u00012\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000f\u0010\u0010JM\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00020\u000e\"\b\b\u0002\u0010\u0004*\u00020\u00012\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0011\u0010\u0012JM\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00020\u000e\"\b\b\u0002\u0010\u0004*\u00020\u00012\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00060\u00052\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0013\u0010\u0012R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lja/f0$b$a;", "", "<init>", "()V", "T", "", "Lja/m1;", "pages", "", "placeholdersBefore", "placeholdersAfter", "Lja/x;", "sourceLoadStates", "mediatorLoadStates", "Lja/f0$b;", "c", "(Ljava/util/List;IILja/x;Lja/x;)Lja/f0$b;", "b", "(Ljava/util/List;ILja/x;Lja/x;)Lja/f0$b;", "a", "EMPTY_REFRESH_LOCAL", "Lja/f0$b;", "e", "()Lja/f0$b;", "paging-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(fr.k kVar) {
                this();
            }

            public static /* synthetic */ b d(Companion companion, List list, int i15, int i16, LoadStates loadStates, LoadStates loadStates2, int i17, Object obj) {
                if ((i17 & 16) != 0) {
                    loadStates2 = null;
                }
                return companion.c(list, i15, i16, loadStates, loadStates2);
            }

            public final <T> b<T> a(List<TransformablePage<T>> pages, int placeholdersAfter, LoadStates sourceLoadStates, LoadStates mediatorLoadStates) {
                return new b<>(y.APPEND, pages, -1, placeholdersAfter, sourceLoadStates, mediatorLoadStates, null);
            }

            public final <T> b<T> b(List<TransformablePage<T>> pages, int placeholdersBefore, LoadStates sourceLoadStates, LoadStates mediatorLoadStates) {
                return new b<>(y.PREPEND, pages, placeholdersBefore, -1, sourceLoadStates, mediatorLoadStates, null);
            }

            public final <T> b<T> c(List<TransformablePage<T>> pages, int placeholdersBefore, int placeholdersAfter, LoadStates sourceLoadStates, LoadStates mediatorLoadStates) {
                return new b<>(y.REFRESH, pages, placeholdersBefore, placeholdersAfter, sourceLoadStates, mediatorLoadStates, null);
            }

            public final b<Object> e() {
                return b.f100679h;
            }

            private Companion() {
            }
        }

        /* JADX INFO: renamed from: ja.f0$b$b, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class C2372b<R> extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f100686d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f100687e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f100688f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f100689g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f100690h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f100691j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            Object f100692k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            Object f100693l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            Object f100694m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f100695n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            Object f100696p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            /* synthetic */ Object f100697q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ b<T> f100698r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            int f100699s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2372b(b<T> bVar, tq.e<? super C2372b> eVar) {
                super(eVar);
                this.f100698r = bVar;
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f100697q = obj;
                this.f100699s |= PKIFailureInfo.systemUnavail;
                return this.f100698r.a(null, this);
            }
        }

        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            List listE = pq.v.e(TransformablePage.INSTANCE.a());
            w.NotLoading.Companion companion2 = w.NotLoading.INSTANCE;
            f100679h = Companion.d(companion, listE, 0, 0, new LoadStates(companion2.b(), companion2.a(), companion2.a()), null, 16, null);
        }

        public /* synthetic */ b(y yVar, List list, int i15, int i16, LoadStates loadStates, LoadStates loadStates2, fr.k kVar) {
            this(yVar, list, i15, i16, loadStates, loadStates2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ b e(b bVar, y yVar, List list, int i15, int i16, LoadStates loadStates, LoadStates loadStates2, int i17, Object obj) {
            if ((i17 & 1) != 0) {
                yVar = bVar.loadType;
            }
            if ((i17 & 2) != 0) {
                list = bVar.pages;
            }
            if ((i17 & 4) != 0) {
                i15 = bVar.placeholdersBefore;
            }
            if ((i17 & 8) != 0) {
                i16 = bVar.placeholdersAfter;
            }
            if ((i17 & 16) != 0) {
                loadStates = bVar.sourceLoadStates;
            }
            if ((i17 & 32) != 0) {
                loadStates2 = bVar.mediatorLoadStates;
            }
            LoadStates loadStates3 = loadStates;
            LoadStates loadStates4 = loadStates2;
            return bVar.d(yVar, list, i15, i16, loadStates3, loadStates4);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0091  */
        /* JADX WARN: Code duplicated, block: B:20:0x00ba  */
        /* JADX WARN: Code duplicated, block: B:22:0x00dd A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:23:0x00de  */
        /* JADX WARN: Code duplicated, block: B:25:0x00f0  */
        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0091 -> B:18:0x00b4). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00de -> B:24:0x00e6). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // ja.f0
        public <R> java.lang.Object a(er.p<? super T, ? super tq.e<? super R>, ? extends java.lang.Object> r18, tq.e<? super ja.f0<R>> r19) {
            /*
                Method dump skipped, instruction units count: 290
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ja.f0.b.a(er.p, tq.e):java.lang.Object");
        }

        public final b<T> d(y loadType, List<TransformablePage<T>> pages, int placeholdersBefore, int placeholdersAfter, LoadStates sourceLoadStates, LoadStates mediatorLoadStates) {
            return new b<>(loadType, pages, placeholdersBefore, placeholdersAfter, sourceLoadStates, mediatorLoadStates);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return this.loadType == bVar.loadType && fr.t.c(this.pages, bVar.pages) && this.placeholdersBefore == bVar.placeholdersBefore && this.placeholdersAfter == bVar.placeholdersAfter && fr.t.c(this.sourceLoadStates, bVar.sourceLoadStates) && fr.t.c(this.mediatorLoadStates, bVar.mediatorLoadStates);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final y getLoadType() {
            return this.loadType;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final LoadStates getMediatorLoadStates() {
            return this.mediatorLoadStates;
        }

        public final List<TransformablePage<T>> h() {
            return this.pages;
        }

        public int hashCode() {
            int iHashCode = ((((((((this.loadType.hashCode() * 31) + this.pages.hashCode()) * 31) + Integer.hashCode(this.placeholdersBefore)) * 31) + Integer.hashCode(this.placeholdersAfter)) * 31) + this.sourceLoadStates.hashCode()) * 31;
            LoadStates loadStates = this.mediatorLoadStates;
            return iHashCode + (loadStates == null ? 0 : loadStates.hashCode());
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final int getPlaceholdersAfter() {
            return this.placeholdersAfter;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final int getPlaceholdersBefore() {
            return this.placeholdersBefore;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final LoadStates getSourceLoadStates() {
            return this.sourceLoadStates;
        }

        public String toString() {
            List<T> listB;
            List<T> listB2;
            Iterator<T> it = this.pages.iterator();
            int size = 0;
            while (it.hasNext()) {
                size += ((TransformablePage) it.next()).b().size();
            }
            int i15 = this.placeholdersBefore;
            String strValueOf = i15 != -1 ? String.valueOf(i15) : "none";
            int i16 = this.placeholdersAfter;
            String strValueOf2 = i16 != -1 ? String.valueOf(i16) : "none";
            LoadStates loadStates = this.mediatorLoadStates;
            StringBuilder sb5 = new StringBuilder();
            sb5.append("PageEvent.Insert for ");
            sb5.append(this.loadType);
            sb5.append(", with ");
            sb5.append(size);
            sb5.append(" items (\n                    |   first item: ");
            TransformablePage transformablePage = (TransformablePage) pq.v.n0(this.pages);
            sb5.append((transformablePage == null || (listB2 = transformablePage.b()) == null) ? null : pq.v.n0(listB2));
            sb5.append("\n                    |   last item: ");
            TransformablePage transformablePage2 = (TransformablePage) pq.v.z0(this.pages);
            sb5.append((transformablePage2 == null || (listB = transformablePage2.b()) == null) ? null : pq.v.z0(listB));
            sb5.append("\n                    |   placeholdersBefore: ");
            sb5.append(strValueOf);
            sb5.append("\n                    |   placeholdersAfter: ");
            sb5.append(strValueOf2);
            sb5.append("\n                    |   sourceLoadStates: ");
            sb5.append(this.sourceLoadStates);
            sb5.append("\n                    ");
            String string = sb5.toString();
            if (loadStates != null) {
                string = string + "|   mediatorLoadStates: " + loadStates + '\n';
            }
            return fu.r.p(string + "|)", null, 1, null);
        }

        private b(y yVar, List<TransformablePage<T>> list, int i15, int i16, LoadStates loadStates, LoadStates loadStates2) {
            super(null);
            this.loadType = yVar;
            this.pages = list;
            this.placeholdersBefore = i15;
            this.placeholdersAfter = i16;
            this.sourceLoadStates = loadStates;
            this.mediatorLoadStates = loadStates2;
            if (yVar != y.APPEND && i15 < 0) {
                throw new IllegalArgumentException(("Prepend insert defining placeholdersBefore must be > 0, but was " + i15).toString());
            }
            if (yVar == y.PREPEND || i16 >= 0) {
                if (yVar == y.REFRESH && list.isEmpty()) {
                    throw new IllegalArgumentException("Cannot create a REFRESH Insert event with no TransformablePages as this could permanently stall pagination. Note that this check does not prevent empty LoadResults and is instead usually an indication of an internal error in Paging itself.");
                }
            } else {
                throw new IllegalArgumentException(("Append insert defining placeholdersAfter must be > 0, but was " + i16).toString());
            }
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B\u001b\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016¨\u0006\u0019"}, d2 = {"Lja/f0$c;", "", "T", "Lja/f0;", "Lja/x;", "source", "mediator", "<init>", "(Lja/x;Lja/x;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lja/x;", "d", "()Lja/x;", "b", "c", "paging-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class c<T> extends f0<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final LoadStates source;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final LoadStates mediator;

        public c(LoadStates loadStates, LoadStates loadStates2) {
            super(null);
            this.source = loadStates;
            this.mediator = loadStates2;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final LoadStates getMediator() {
            return this.mediator;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final LoadStates getSource() {
            return this.source;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return fr.t.c(this.source, cVar.source) && fr.t.c(this.mediator, cVar.mediator);
        }

        public int hashCode() {
            int iHashCode = this.source.hashCode() * 31;
            LoadStates loadStates = this.mediator;
            return iHashCode + (loadStates == null ? 0 : loadStates.hashCode());
        }

        public String toString() {
            LoadStates loadStates = this.mediator;
            String str = "PageEvent.LoadStateUpdate (\n                    |   sourceLoadStates: " + this.source + "\n                    ";
            if (loadStates != null) {
                str = str + "|   mediatorLoadStates: " + loadStates + '\n';
            }
            return fu.r.p(str + "|)", null, 1, null);
        }

        public /* synthetic */ c(LoadStates loadStates, LoadStates loadStates2, int i15, fr.k kVar) {
            this(loadStates, (i15 & 2) != 0 ? null : loadStates2);
        }
    }

    public /* synthetic */ f0(fr.k kVar) {
        this();
    }

    static /* synthetic */ <T, R> Object b(f0<T> f0Var, er.p<? super T, ? super tq.e<? super R>, ? extends Object> pVar, tq.e<? super f0<R>> eVar) {
        return f0Var;
    }

    public <R> Object a(er.p<? super T, ? super tq.e<? super R>, ? extends Object> pVar, tq.e<? super f0<R>> eVar) {
        return b(this, pVar, eVar);
    }

    private f0() {
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003BA\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJD\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\b\b\u0002\u0010\u000e*\u00020\u00012\"\u0010\u0011\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000fH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010!\u001a\u0004\b$\u0010#R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u0018R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b'\u0010%\u001a\u0004\b'\u0010\u0018¨\u0006("}, d2 = {"Lja/f0$d;", "", "T", "Lja/f0;", "", "data", "Lja/x;", "sourceLoadStates", "mediatorLoadStates", "", "placeholdersBefore", "placeholdersAfter", "<init>", "(Ljava/util/List;Lja/x;Lja/x;II)V", "R", "Lkotlin/Function2;", "Ltq/e;", "transform", "a", "(Ler/p;Ltq/e;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "Lja/x;", "g", "()Lja/x;", "d", "I", "f", "e", "paging-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class d<T> extends f0<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final List<T> data;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final LoadStates sourceLoadStates;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final LoadStates mediatorLoadStates;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final int placeholdersBefore;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final int placeholdersAfter;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class a<R> extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f100707d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f100708e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f100709f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f100710g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            /* synthetic */ Object f100711h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ d<T> f100712j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f100713k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d<T> dVar, tq.e<? super a> eVar) {
                super(eVar);
                this.f100712j = dVar;
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f100711h = obj;
                this.f100713k |= PKIFailureInfo.systemUnavail;
                return this.f100712j.a(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public d(List<? extends T> list, LoadStates loadStates, LoadStates loadStates2, int i15, int i16) {
            super(null);
            this.data = list;
            this.sourceLoadStates = loadStates;
            this.mediatorLoadStates = loadStates2;
            this.placeholdersBefore = i15;
            this.placeholdersAfter = i16;
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0061  */
        /* JADX WARN: Code duplicated, block: B:19:0x0075 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:20:0x0076  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0076 -> B:21:0x0079). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // ja.f0
        public <R> java.lang.Object a(er.p<? super T, ? super tq.e<? super R>, ? extends java.lang.Object> r14, tq.e<? super ja.f0<R>> r15) {
            /*
                r13 = this;
                boolean r0 = r15 instanceof ja.f0.d.a
                if (r0 == 0) goto L13
                r0 = r15
                ja.f0$d$a r0 = (ja.f0.d.a) r0
                int r1 = r0.f100713k
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f100713k = r1
                goto L18
            L13:
                ja.f0$d$a r0 = new ja.f0$d$a
                r0.<init>(r13, r15)
            L18:
                java.lang.Object r15 = r0.f100711h
                java.lang.Object r1 = uq.b.e()
                int r2 = r0.f100713k
                r3 = 1
                if (r2 == 0) goto L41
                if (r2 != r3) goto L39
                java.lang.Object r14 = r0.f100710g
                java.util.Collection r14 = (java.util.Collection) r14
                java.lang.Object r2 = r0.f100709f
                java.util.Iterator r2 = (java.util.Iterator) r2
                java.lang.Object r4 = r0.f100708e
                java.util.Collection r4 = (java.util.Collection) r4
                java.lang.Object r5 = r0.f100707d
                er.p r5 = (er.p) r5
                oq.u.b(r15)
                goto L79
            L39:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r15)
                throw r14
            L41:
                oq.u.b(r15)
                java.util.List<T> r15 = r13.data
                java.lang.Iterable r15 = (java.lang.Iterable) r15
                java.util.ArrayList r2 = new java.util.ArrayList
                r4 = 10
                int r4 = pq.v.y(r15, r4)
                r2.<init>(r4)
                java.util.Iterator r15 = r15.iterator()
                r12 = r15
                r15 = r14
                r14 = r2
                r2 = r12
            L5b:
                boolean r4 = r2.hasNext()
                if (r4 == 0) goto L7f
                java.lang.Object r4 = r2.next()
                r0.f100707d = r15
                r0.f100708e = r14
                r0.f100709f = r2
                r0.f100710g = r14
                r0.f100713k = r3
                java.lang.Object r4 = r15.B(r4, r0)
                if (r4 != r1) goto L76
                return r1
            L76:
                r5 = r15
                r15 = r4
                r4 = r14
            L79:
                r14.add(r15)
                r14 = r4
                r15 = r5
                goto L5b
            L7f:
                r7 = r14
                java.util.List r7 = (java.util.List) r7
                ja.x r8 = r13.sourceLoadStates
                ja.x r9 = r13.mediatorLoadStates
                int r10 = r13.placeholdersBefore
                int r11 = r13.placeholdersAfter
                ja.f0$d r6 = new ja.f0$d
                r6.<init>(r7, r8, r9, r10, r11)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: ja.f0.d.a(er.p, tq.e):java.lang.Object");
        }

        public final List<T> c() {
            return this.data;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final LoadStates getMediatorLoadStates() {
            return this.mediatorLoadStates;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final int getPlaceholdersAfter() {
            return this.placeholdersAfter;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return fr.t.c(this.data, dVar.data) && fr.t.c(this.sourceLoadStates, dVar.sourceLoadStates) && fr.t.c(this.mediatorLoadStates, dVar.mediatorLoadStates) && this.placeholdersBefore == dVar.placeholdersBefore && this.placeholdersAfter == dVar.placeholdersAfter;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getPlaceholdersBefore() {
            return this.placeholdersBefore;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final LoadStates getSourceLoadStates() {
            return this.sourceLoadStates;
        }

        public int hashCode() {
            int iHashCode = this.data.hashCode() * 31;
            LoadStates loadStates = this.sourceLoadStates;
            int iHashCode2 = (iHashCode + (loadStates == null ? 0 : loadStates.hashCode())) * 31;
            LoadStates loadStates2 = this.mediatorLoadStates;
            return ((((iHashCode2 + (loadStates2 != null ? loadStates2.hashCode() : 0)) * 31) + Integer.hashCode(this.placeholdersBefore)) * 31) + Integer.hashCode(this.placeholdersAfter);
        }

        public String toString() {
            LoadStates loadStates = this.mediatorLoadStates;
            String str = "PageEvent.StaticList with " + this.data.size() + " items (\n                    |   first item: " + pq.v.n0(this.data) + "\n                    |   last item: " + pq.v.z0(this.data) + "\n                    |   sourceLoadStates: " + this.sourceLoadStates + ",\n                    |   placeholdersBefore: " + this.placeholdersBefore + ",\n                    |   placeholdersAfter: " + this.placeholdersAfter + ",\n                    ";
            if (loadStates != null) {
                str = str + "|   mediatorLoadStates: " + loadStates + '\n';
            }
            return fu.r.p(str + "|)", null, 1, null);
        }

        public /* synthetic */ d(List list, LoadStates loadStates, LoadStates loadStates2, int i15, int i16, int i17, fr.k kVar) {
            this(list, (i17 & 2) != 0 ? null : loadStates, (i17 & 4) != 0 ? null : loadStates2, (i17 & 8) != 0 ? 0 : i15, (i17 & 16) != 0 ? 0 : i16);
        }
    }
}
