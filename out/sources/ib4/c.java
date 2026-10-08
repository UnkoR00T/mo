package ib4;

import er.l;
import fr.k;
import fr.t;
import oq.i0;
import p071kotlin.Metadata;
import xw.f;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lib4/c;", "Lxw/f;", "Lib4/c$a;", "Ljb4/b;", "a", "b", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c extends f<Params, jb4.b> {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lib4/c$b;", "", "<init>", "()V", "b", "a", "Lib4/c$b$a;", "Lib4/c$b$b;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class b {

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\t\n\u0006B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"Lib4/c$b$a;", "Lib4/c$b;", "Ldx/b$c$a;", "type", "<init>", "(Ldx/b$c$a;)V", "a", "Ldx/b$c$a;", "()Ldx/b$c$a;", "b", "c", "Lib4/c$b$a$a;", "Lib4/c$b$a$b;", "Lib4/c$b$a$c;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static abstract class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final dx.b.Business.a type;

            /* JADX INFO: renamed from: ib4.c$b$a$a, reason: collision with other inner class name and from toString */
            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lib4/c$b$a$a;", "Lib4/c$b$a;", "Ldx/b$c$a;", "type", "<init>", "(Ldx/b$c$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ldx/b$c$a;", "a", "()Ldx/b$c$a;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Close extends a {

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final dx.b.Business.a type;

                public Close(dx.b.Business.a aVar) {
                    super(aVar, null);
                    this.type = aVar;
                }

                @Override // ib4.c.b.a
                /* JADX INFO: renamed from: a, reason: from getter */
                public dx.b.Business.a getType() {
                    return this.type;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Close) && t.c(this.type, ((Close) other).type);
                }

                public int hashCode() {
                    return this.type.hashCode();
                }

                public String toString() {
                    return "Close(type=" + this.type + ")";
                }
            }

            /* JADX INFO: renamed from: ib4.c$b$a$b, reason: collision with other inner class name and from toString */
            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lib4/c$b$a$b;", "Lib4/c$b$a;", "Ldx/b$c$a;", "type", "<init>", "(Ldx/b$c$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ldx/b$c$a;", "a", "()Ldx/b$c$a;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Primary extends a {

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final dx.b.Business.a type;

                public Primary(dx.b.Business.a aVar) {
                    super(aVar, null);
                    this.type = aVar;
                }

                @Override // ib4.c.b.a
                /* JADX INFO: renamed from: a, reason: from getter */
                public dx.b.Business.a getType() {
                    return this.type;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Primary) && t.c(this.type, ((Primary) other).type);
                }

                public int hashCode() {
                    return this.type.hashCode();
                }

                public String toString() {
                    return "Primary(type=" + this.type + ")";
                }
            }

            /* JADX INFO: renamed from: ib4.c$b$a$c, reason: collision with other inner class name and from toString */
            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lib4/c$b$a$c;", "Lib4/c$b$a;", "Ldx/b$c$a;", "type", "<init>", "(Ldx/b$c$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ldx/b$c$a;", "a", "()Ldx/b$c$a;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Secondary extends a {

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final dx.b.Business.a type;

                public Secondary(dx.b.Business.a aVar) {
                    super(aVar, null);
                    this.type = aVar;
                }

                @Override // ib4.c.b.a
                /* JADX INFO: renamed from: a, reason: from getter */
                public dx.b.Business.a getType() {
                    return this.type;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Secondary) && t.c(this.type, ((Secondary) other).type);
                }

                public int hashCode() {
                    return this.type.hashCode();
                }

                public String toString() {
                    return "Secondary(type=" + this.type + ")";
                }
            }

            public /* synthetic */ a(dx.b.Business.a aVar, k kVar) {
                this(aVar);
            }

            /* JADX INFO: renamed from: a */
            public abstract dx.b.Business.a getType();

            private a(dx.b.Business.a aVar) {
                super(null);
                this.type = aVar;
            }
        }

        /* JADX INFO: renamed from: ib4.c$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lib4/c$b$b;", "Lib4/c$b;", "<init>", "()V", "b", "a", "Lib4/c$b$b$a;", "Lib4/c$b$b$b;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static abstract class AbstractC2161b extends b {

            /* JADX INFO: renamed from: ib4.c$b$b$a */
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lib4/c$b$b$a;", "Lib4/c$b$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class a extends AbstractC2161b {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final a f90859a = new a();

                private a() {
                    super(null);
                }

                public boolean equals(Object other) {
                    return this == other || (other instanceof a);
                }

                public int hashCode() {
                    return -1166272690;
                }

                public String toString() {
                    return "Close";
                }
            }

            /* JADX INFO: renamed from: ib4.c$b$b$b, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lib4/c$b$b$b;", "Lib4/c$b$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class C2162b extends AbstractC2161b {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final C2162b f90860a = new C2162b();

                private C2162b() {
                    super(null);
                }

                public boolean equals(Object other) {
                    return this == other || (other instanceof C2162b);
                }

                public int hashCode() {
                    return -1152623618;
                }

                public String toString() {
                    return "Retry";
                }
            }

            public /* synthetic */ AbstractC2161b(k kVar) {
                this();
            }

            private AbstractC2161b() {
                super(null);
            }
        }

        public /* synthetic */ b(k kVar) {
            this();
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: ib4.c$a, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u0015B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006\u001f"}, d2 = {"Lib4/c$a;", "", "Ldx/b;", "domainError", "", "genericRetryAllowed", "Lkotlin/Function1;", "Lib4/c$b;", "Loq/i0;", "resultAction", "<init>", "(Ldx/b;ZLer/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ldx/b;", "()Ldx/b;", "b", "Z", "()Z", "c", "Ler/l;", "()Ler/l;", "d", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final dx.b domainError;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean genericRetryAllowed;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<b, i0> resultAction;

        /* JADX INFO: renamed from: ib4.c$a$a, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lib4/c$a$a;", "", "<init>", "()V", "Ldx/b;", "domainError", "Lib4/c$a;", "b", "(Ldx/b;)Lib4/c$a;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final i0 c(b bVar) {
                return i0.f148189a;
            }

            public final Params b(dx.b domainError) {
                return new Params(domainError, false, new l() { // from class: ib4.b
                    @Override // er.l
                    public final Object b(Object obj) {
                        return c.Params.Companion.c((c.b) obj);
                    }
                });
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Params(dx.b bVar, boolean z15, l<? super b, i0> lVar) {
            this.domainError = bVar;
            this.genericRetryAllowed = z15;
            this.resultAction = lVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final dx.b getDomainError() {
            return this.domainError;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getGenericRetryAllowed() {
            return this.genericRetryAllowed;
        }

        public final l<b, i0> c() {
            return this.resultAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.domainError, params.domainError) && this.genericRetryAllowed == params.genericRetryAllowed && t.c(this.resultAction, params.resultAction);
        }

        public int hashCode() {
            return (((this.domainError.hashCode() * 31) + Boolean.hashCode(this.genericRetryAllowed)) * 31) + this.resultAction.hashCode();
        }

        public String toString() {
            return "Params(domainError=" + this.domainError + ", genericRetryAllowed=" + this.genericRetryAllowed + ", resultAction=" + this.resultAction + ")";
        }

        public /* synthetic */ Params(dx.b bVar, boolean z15, l lVar, int i15, k kVar) {
            this(bVar, (i15 & 2) != 0 ? true : z15, lVar);
        }
    }
}
