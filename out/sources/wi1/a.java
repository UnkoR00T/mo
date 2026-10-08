package wi1;

import er.l;
import er.p;
import fr.t;
import java.util.List;
import ju.p0;
import lu.w;
import ml0.j;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;
import vi1.ChildParticipant;
import vq.k;
import xi0.ContactDetails;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0012\u0014B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lwi1/a;", "", "Lwi1/a$a;", "Lwi1/a$b;", "Lui0/a;", "contactDetailsDownloadManager", "Lac4/a;", "loaderUC", "Lml0/j;", "getChildrenUC", "Lwi1/d;", "isAgeFromPeselValidForTrainingUC", "<init>", "(Lui0/a;Lac4/a;Lml0/j;Lwi1/d;)V", "params", "Lmu/g;", "f", "(Lwi1/a$a;)Lmu/g;", "a", "Lui0/a;", "b", "Lac4/a;", "c", "Lml0/j;", "d", "Lwi1/d;", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements gz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ui0.a contactDetailsDownloadManager;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ac4.a loaderUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final j getChildrenUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final d isAgeFromPeselValidForTrainingUC;

    /* JADX INFO: renamed from: wi1.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lwi1/a$a;", "Lgz/b$a;", "", "downloadChildren", "downloadContactDetails", "<init>", "(ZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean downloadChildren;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean downloadContactDetails;

        public Params(boolean z15, boolean z16) {
            this.downloadChildren = z15;
            this.downloadContactDetails = z16;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getDownloadChildren() {
            return this.downloadChildren;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getDownloadContactDetails() {
            return this.downloadContactDetails;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return this.downloadChildren == params.downloadChildren && this.downloadContactDetails == params.downloadContactDetails;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.downloadChildren) * 31) + Boolean.hashCode(this.downloadContactDetails);
        }

        public String toString() {
            return "Params(downloadChildren=" + this.downloadChildren + ", downloadContactDetails=" + this.downloadContactDetails + ')';
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lwi1/a$b;", "", "a", "c", "b", "Lwi1/a$b$a;", "Lwi1/a$b$b;", "Lwi1/a$b$c;", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface b {

        /* JADX INFO: renamed from: wi1.a$b$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lwi1/a$b$a;", "Lwi1/a$b;", "", "Lvi1/a;", "children", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Children implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<ChildParticipant> children;

            public Children(List<ChildParticipant> list) {
                this.children = list;
            }

            public final List<ChildParticipant> a() {
                return this.children;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Children) && t.c(this.children, ((Children) other).children);
            }

            public int hashCode() {
                return this.children.hashCode();
            }

            public String toString() {
                return "Children(children=" + this.children + ')';
            }
        }

        /* JADX INFO: renamed from: wi1.a$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lwi1/a$b$b;", "Lwi1/a$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C5643b implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C5643b f213585a = new C5643b();

            private C5643b() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C5643b);
            }

            public int hashCode() {
                return -1293979997;
            }

            public String toString() {
                return "Finished";
            }
        }

        /* JADX INFO: renamed from: wi1.a$b$c, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lwi1/a$b$c;", "Lwi1/a$b;", "Lxi0/e;", "rdkContactDetails", "<init>", "(Lxi0/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lxi0/e;", "()Lxi0/e;", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class RdkData implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final ContactDetails rdkContactDetails;

            public RdkData(ContactDetails contactDetails) {
                this.rdkContactDetails = contactDetails;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final ContactDetails getRdkContactDetails() {
                return this.rdkContactDetails;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof RdkData) && t.c(this.rdkContactDetails, ((RdkData) other).rdkContactDetails);
            }

            public int hashCode() {
                return this.rdkContactDetails.hashCode();
            }

            public String toString() {
                return "RdkData(rdkContactDetails=" + this.rdkContactDetails + ')';
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Llu/w;", "Lwi1/a$b;", "Loq/i0;", "<anonymous>", "(Llu/w;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends k implements p<w<? super b>, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f213587e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f213588f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private /* synthetic */ Object f213589g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Params f213590h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ a f213591j;

        /* JADX INFO: renamed from: wi1.a$c$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
        static final class C5644a extends k implements p<p0, tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f213592e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ a f213593f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ w<b> f213594g;

            /* JADX INFO: renamed from: wi1.a$c$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
            static final class C5645a extends k implements l<tq.e<? super i0>, Object> {

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                Object f213595e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f213596f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                Object f213597g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f213598h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f213599j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f213600k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                Object f213601l;

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                Object f213602m;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                Object f213603n;

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                int f213604p;

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f213605q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                int f213606r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                int f213607s;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                int f213608t;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                int f213609v;

                /* JADX INFO: renamed from: w, reason: collision with root package name */
                final /* synthetic */ a f213610w;

                /* JADX INFO: renamed from: x, reason: collision with root package name */
                final /* synthetic */ w<b> f213611x;

                /* JADX INFO: renamed from: wi1.a$c$a$a$a, reason: collision with other inner class name */
                @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
                public static final /* synthetic */ class C5646a {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public static final /* synthetic */ int[] f213612a;

                    static {
                        int[] iArr = new int[d.b.values().length];
                        try {
                            iArr[d.b.IncorrectPesel.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[d.b.Invalid.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[d.b.Valid.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        f213612a = iArr;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C5645a(a aVar, w<? super b> wVar, tq.e<? super C5645a> eVar) {
                    super(1, eVar);
                    this.f213610w = aVar;
                    this.f213611x = wVar;
                }

                /* JADX WARN: Code duplicated, block: B:22:0x00a4  */
                /* JADX WARN: Code duplicated, block: B:40:0x0139  */
                /* JADX WARN: Code restructure failed: missing block: B:11:0x005b, code lost:
                
                    if (r2 == r1) goto L24;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:23:0x00eb, code lost:
                
                    if (r3 == r1) goto L24;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:24:0x00ed, code lost:
                
                    return r1;
                 */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00eb -> B:25:0x00ee). Please report as a decompilation issue!!! */
                @Override // vq.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object J(java.lang.Object r25) throws java.lang.Throwable {
                    /*
                        Method dump skipped, instruction units count: 334
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: wi1.a.c.C5644a.C5645a.J(java.lang.Object):java.lang.Object");
                }

                public final tq.e<i0> M(tq.e<?> eVar) {
                    return new C5645a(this.f213610w, this.f213611x, eVar);
                }

                @Override // er.l
                /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
                public final Object b(tq.e<? super i0> eVar) {
                    return ((C5645a) M(eVar)).J(i0.f148189a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C5644a(a aVar, w<? super b> wVar, tq.e<? super C5644a> eVar) {
                super(2, eVar);
                this.f213593f = aVar;
                this.f213594g = wVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f213592e;
                if (i15 == 0) {
                    u.b(obj);
                    ac4.a aVar = this.f213593f.loaderUC;
                    C5645a c5645a = new C5645a(this.f213593f, this.f213594g, null);
                    this.f213592e = 1;
                    if (ac4.a.a(aVar, null, c5645a, this, 1, null) == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj);
                }
                return i0.f148189a;
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
                return ((C5644a) v(p0Var, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                return new C5644a(this.f213593f, this.f213594g, eVar);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
        static final class b extends k implements p<p0, tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f213613e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ a f213614f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ w<b> f213615g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(a aVar, w<? super b> wVar, tq.e<? super b> eVar) {
                super(2, eVar);
                this.f213614f = aVar;
                this.f213615g = wVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f213613e;
                if (i15 == 0) {
                    u.b(obj);
                    ui0.a aVar = this.f213614f.contactDetailsDownloadManager;
                    this.f213613e = 1;
                    obj = aVar.b(this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj);
                }
                dx.i iVar = (dx.i) obj;
                w<b> wVar = this.f213615g;
                if (iVar instanceof dx.i.Right) {
                    wVar.d(new b.RdkData((ContactDetails) ((dx.i.Right) iVar).b()));
                }
                return i0.f148189a;
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
                return ((b) v(p0Var, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                return new b(this.f213614f, this.f213615g, eVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Params params, a aVar, tq.e<? super c> eVar) {
            super(2, eVar);
            this.f213590h = params;
            this.f213591j = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(a aVar) {
            px.f.f163100a.b("Channel closed", px.c.a(aVar));
            return i0.f148189a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0099, code lost:
        
            if (lu.u.b(r1, r3, r10) == r0) goto L22;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r11) throws java.lang.Throwable {
            /*
                r10 = this;
                java.lang.Object r0 = r10.f213589g
                r1 = r0
                lu.w r1 = (lu.w) r1
                java.lang.Object r0 = uq.b.e()
                int r2 = r10.f213588f
                r7 = 2
                r8 = 1
                if (r2 == 0) goto L2c
                if (r2 == r8) goto L24
                if (r2 != r7) goto L1c
                java.lang.Object r0 = r10.f213587e
                java.util.List r0 = (java.util.List) r0
                oq.u.b(r11)
                goto L9c
            L1c:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L24:
                java.lang.Object r2 = r10.f213587e
                java.util.List r2 = (java.util.List) r2
                oq.u.b(r11)
                goto L7b
            L2c:
                oq.u.b(r11)
                java.util.ArrayList r11 = new java.util.ArrayList
                r11.<init>()
                wi1.a$a r2 = r10.f213590h
                boolean r2 = r2.getDownloadChildren()
                r9 = 0
                if (r2 == 0) goto L4f
                wi1.a$c$a r4 = new wi1.a$c$a
                wi1.a r2 = r10.f213591j
                r4.<init>(r2, r1, r9)
                r5 = 3
                r6 = 0
                r2 = 0
                r3 = 0
                ju.d2 r2 = ju.i.d(r1, r2, r3, r4, r5, r6)
                r11.add(r2)
            L4f:
                wi1.a$a r2 = r10.f213590h
                boolean r2 = r2.getDownloadContactDetails()
                if (r2 == 0) goto L69
                wi1.a$c$b r4 = new wi1.a$c$b
                wi1.a r2 = r10.f213591j
                r4.<init>(r2, r1, r9)
                r5 = 3
                r6 = 0
                r2 = 0
                r3 = 0
                ju.d2 r2 = ju.i.d(r1, r2, r3, r4, r5, r6)
                r11.add(r2)
            L69:
                r10.f213589g = r1
                java.lang.Object r2 = vq.j.a(r11)
                r10.f213587e = r2
                r10.f213588f = r8
                java.lang.Object r2 = ju.f.c(r11, r10)
                if (r2 != r0) goto L7a
                goto L9b
            L7a:
                r2 = r11
            L7b:
                wi1.a$b$b r11 = wi1.a.b.C5643b.f213585a
                r1.d(r11)
                wi1.a r11 = r10.f213591j
                wi1.b r3 = new wi1.b
                r3.<init>()
                java.lang.Object r11 = vq.j.a(r1)
                r10.f213589g = r11
                java.lang.Object r11 = vq.j.a(r2)
                r10.f213587e = r11
                r10.f213588f = r7
                java.lang.Object r11 = lu.u.b(r1, r3, r10)
                if (r11 != r0) goto L9c
            L9b:
                return r0
            L9c:
                oq.i0 r11 = oq.i0.f148189a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: wi1.a.c.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(w<? super b> wVar, tq.e<? super i0> eVar) {
            return ((c) v(wVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            c cVar = new c(this.f213590h, this.f213591j, eVar);
            cVar.f213589g = obj;
            return cVar;
        }
    }

    public a(ui0.a aVar, ac4.a aVar2, j jVar, d dVar) {
        this.contactDetailsDownloadManager = aVar;
        this.loaderUC = aVar2;
        this.getChildrenUC = jVar;
        this.isAgeFromPeselValidForTrainingUC = dVar;
    }

    public mu.g<b> f(Params params) {
        return mu.i.e(new c(params, this, null));
    }
}
