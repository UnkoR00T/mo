package dx;

import fr.t;
import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\t\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016À\u0006\u0003"}, d2 = {"Ldx/b;", "", "f", "c", "a", "d", "g", "i", "e", "k", "b", "j", "h", "Ldx/b$a;", "Ldx/b$b;", "Ldx/b$c;", "Ldx/b$d;", "Ldx/b$e;", "Ldx/b$g;", "Ldx/b$h;", "Ldx/b$j;", "Ldx/b$k;", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {

    /* JADX INFO: renamed from: dx.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015¨\u0006\u0016"}, d2 = {"Ldx/b$a;", "Ldx/b;", "Lmx/a;", "title", "message", "<init>", "(Lmx/a;Lmx/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "b", "()Lmx/a;", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AppUpdateRequired implements b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f45019c = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label title;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label message;

        public AppUpdateRequired(Label label, Label label2) {
            this.title = label;
            this.message = label2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Label getMessage() {
            return this.message;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Label getTitle() {
            return this.title;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AppUpdateRequired)) {
                return false;
            }
            AppUpdateRequired appUpdateRequired = (AppUpdateRequired) other;
            return t.c(this.title, appUpdateRequired.title) && t.c(this.message, appUpdateRequired.message);
        }

        public int hashCode() {
            Label label = this.title;
            int iHashCode = (label == null ? 0 : label.hashCode()) * 31;
            Label label2 = this.message;
            return iHashCode + (label2 != null ? label2.hashCode() : 0);
        }

        public String toString() {
            return "AppUpdateRequired(title=" + this.title + ", message=" + this.message + ")";
        }
    }

    /* JADX INFO: renamed from: dx.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Ldx/b$b;", "Ldx/b;", "a", "Ldx/b$b$a;", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface InterfaceC1027b extends b {

        /* JADX INFO: renamed from: dx.b$b$a */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Ldx/b$b$a;", "Ldx/b$b;", "b", "d", "f", "a", "c", "e", "Ldx/b$b$a$a;", "Ldx/b$b$a$b;", "Ldx/b$b$a$c;", "Ldx/b$b$a$d;", "Ldx/b$b$a$e;", "Ldx/b$b$a$f;", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface a extends InterfaceC1027b {

            /* JADX INFO: renamed from: dx.b$b$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ldx/b$b$a$a;", "Ldx/b$b$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class C1028a implements a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final C1028a f45022a = new C1028a();

                private C1028a() {
                }

                public boolean equals(Object other) {
                    return this == other || (other instanceof C1028a);
                }

                public int hashCode() {
                    return 1373241050;
                }

                public String toString() {
                    return "HardwareUnavailable";
                }
            }

            /* JADX INFO: renamed from: dx.b$b$a$b, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ldx/b$b$a$b;", "Ldx/b$b$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class C1029b implements a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final C1029b f45023a = new C1029b();

                private C1029b() {
                }

                public boolean equals(Object other) {
                    return this == other || (other instanceof C1029b);
                }

                public int hashCode() {
                    return 1163228407;
                }

                public String toString() {
                    return "NoHardware";
                }
            }

            /* JADX INFO: renamed from: dx.b$b$a$c */
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ldx/b$b$a$c;", "Ldx/b$b$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class c implements a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final c f45024a = new c();

                private c() {
                }

                public boolean equals(Object other) {
                    return this == other || (other instanceof c);
                }

                public int hashCode() {
                    return -1603763765;
                }

                public String toString() {
                    return "NoneEnrolled";
                }
            }

            /* JADX INFO: renamed from: dx.b$b$a$d */
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ldx/b$b$a$d;", "Ldx/b$b$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class d implements a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final d f45025a = new d();

                private d() {
                }

                public boolean equals(Object other) {
                    return this == other || (other instanceof d);
                }

                public int hashCode() {
                    return -792478966;
                }

                public String toString() {
                    return "StatusUnknown";
                }
            }

            /* JADX INFO: renamed from: dx.b$b$a$f */
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ldx/b$b$a$f;", "Ldx/b$b$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class f implements a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final f f45028a = new f();

                private f() {
                }

                public boolean equals(Object other) {
                    return this == other || (other instanceof f);
                }

                public int hashCode() {
                    return 850098631;
                }

                public String toString() {
                    return "Unsupported";
                }
            }

            /* JADX INFO: renamed from: dx.b$b$a$e, reason: from toString */
            @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Ldx/b$b$a$e;", "Ldx/b$b$a;", "", "code", "", "throwable", "<init>", "(ILjava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getCode", "b", "Ljava/lang/Throwable;", "getThrowable", "()Ljava/lang/Throwable;", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class UnknownError implements a {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final int code;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final Throwable throwable;

                public UnknownError(int i15, Throwable th4) {
                    this.code = i15;
                    this.throwable = th4;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof UnknownError)) {
                        return false;
                    }
                    UnknownError unknownError = (UnknownError) other;
                    return this.code == unknownError.code && t.c(this.throwable, unknownError.throwable);
                }

                public int hashCode() {
                    int iHashCode = Integer.hashCode(this.code) * 31;
                    Throwable th4 = this.throwable;
                    return iHashCode + (th4 == null ? 0 : th4.hashCode());
                }

                public String toString() {
                    return "UnknownError(code=" + this.code + ", throwable=" + this.throwable + ")";
                }

                public /* synthetic */ UnknownError(int i15, Throwable th4, int i16, fr.k kVar) {
                    this((i16 & 1) != 0 ? 0 : i15, (i16 & 2) != 0 ? null : th4);
                }
            }
        }
    }

    /* JADX INFO: renamed from: dx.b$d, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Ldx/b$d;", "Ldx/b;", "Ldx/b$d$a;", "data", "<init>", "(Ldx/b$d$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ldx/b$d$a;", "()Ldx/b$d$a;", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Deactivate implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final a data;

        /* JADX INFO: renamed from: dx.b$d$a */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Ldx/b$d$a;", "", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface a {
        }

        public Deactivate(a aVar) {
            this.data = aVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final a getData() {
            return this.data;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Deactivate) && t.c(this.data, ((Deactivate) other).data);
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "Deactivate(data=" + this.data + ")";
        }
    }

    /* JADX INFO: renamed from: dx.b$e, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Ldx/b$e;", "Ldx/b;", "", "e", "<init>", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Generic implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Throwable e;

        /* JADX WARN: Multi-variable type inference failed */
        public Generic() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Throwable getE() {
            return this.e;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Generic) && t.c(this.e, ((Generic) other).e);
        }

        public int hashCode() {
            Throwable th4 = this.e;
            if (th4 == null) {
                return 0;
            }
            return th4.hashCode();
        }

        public String toString() {
            return "Generic(e=" + this.e + ")";
        }

        public Generic(Throwable th4) {
            this.e = th4;
        }

        public /* synthetic */ Generic(Throwable th4, int i15, fr.k kVar) {
            this((i15 & 1) != 0 ? null : th4);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Ldx/b$f;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum f {
        WARNING,
        INFO,
        FAILURE;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ wq.a f45044e = wq.b.a(b());
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Ldx/b$h;", "Ldx/b;", "b", "c", "a", "Ldx/b$h$a;", "Ldx/b$h$b;", "Ldx/b$h$c;", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface h extends b {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ldx/b$h$a;", "Ldx/b$h;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class a implements h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f45082a = new a();

            private a() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return -492199012;
            }

            public String toString() {
                return "Critical";
            }
        }

        /* JADX INFO: renamed from: dx.b$h$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ldx/b$h$b;", "Ldx/b$h;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C1033b implements h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C1033b f45083a = new C1033b();

            private C1033b() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C1033b);
            }

            public int hashCode() {
                return -576232781;
            }

            public String toString() {
                return "NotAvailable";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ldx/b$h$c;", "Ldx/b$h;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class c implements h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f45084a = new c();

            private c() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof c);
            }

            public int hashCode() {
                return 1778275755;
            }

            public String toString() {
                return "NotEnabled";
            }
        }
    }

    /* JADX INFO: renamed from: dx.b$i, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Ldx/b$i;", "Ldx/b$g;", "", "e", "<init>", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Parsing implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Throwable e;

        public Parsing(Throwable th4) {
            this.e = th4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Throwable getE() {
            return this.e;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Parsing) && t.c(this.e, ((Parsing) other).e);
        }

        public int hashCode() {
            Throwable th4 = this.e;
            if (th4 == null) {
                return 0;
            }
            return th4.hashCode();
        }

        public String toString() {
            return "Parsing(e=" + this.e + ")";
        }

        public /* synthetic */ Parsing(Throwable th4, int i15, fr.k kVar) {
            this((i15 & 1) != 0 ? null : th4);
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Ldx/b$j;", "Ldx/b;", "d", "c", "a", "e", "b", "Ldx/b$j$a;", "Ldx/b$j$b;", "Ldx/b$j$c;", "Ldx/b$j$d;", "Ldx/b$j$e;", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface j extends b {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ldx/b$j$a;", "Ldx/b$j;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class a implements j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f45086a = new a();

            private a() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return 1958132101;
            }

            public String toString() {
                return "InactiveKeyguard";
            }
        }

        /* JADX INFO: renamed from: dx.b$j$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Ldx/b$j$b;", "Ldx/b$j;", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface InterfaceC1034b extends j {
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ldx/b$j$c;", "Ldx/b$j;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class c implements j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f45087a = new c();

            private c() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof c);
            }

            public int hashCode() {
                return 1540919590;
            }

            public String toString() {
                return "KeyInvalidate";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ldx/b$j$d;", "Ldx/b$j;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class d implements j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f45088a = new d();

            private d() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof d);
            }

            public int hashCode() {
                return 1821082195;
            }

            public String toString() {
                return "KeyNotPresent";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ldx/b$j$e;", "Ldx/b$j;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class e implements j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final e f45089a = new e();

            private e() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof e);
            }

            public int hashCode() {
                return -324213540;
            }

            public String toString() {
                return "UpdateRequired";
            }
        }
    }

    /* JADX INFO: renamed from: dx.b$k, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0015\u0010\u000b¨\u0006\u0016"}, d2 = {"Ldx/b$k;", "Ldx/b;", "", "current", "expected", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getCurrent", "b", "getExpected", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SystemBuild implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int current;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final int expected;

        public SystemBuild(int i15, int i16) {
            this.current = i15;
            this.expected = i16;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SystemBuild)) {
                return false;
            }
            SystemBuild systemBuild = (SystemBuild) other;
            return this.current == systemBuild.current && this.expected == systemBuild.expected;
        }

        public int hashCode() {
            return (Integer.hashCode(this.current) * 31) + Integer.hashCode(this.expected);
        }

        public String toString() {
            return "SystemBuild(current=" + this.current + ", expected=" + this.expected + ")";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012¨\u0006\u0013À\u0006\u0003"}, d2 = {"Ldx/b$g;", "Ldx/b;", "c", "e", "b", "a", "f", "h", "g", "d", "Ldx/b$g$a;", "Ldx/b$g$b;", "Ldx/b$g$c;", "Ldx/b$g$d;", "Ldx/b$g$e;", "Ldx/b$g$f;", "Ldx/b$g$g;", "Ldx/b$g$h;", "Ldx/b$i;", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface g extends b {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ldx/b$g$a;", "Ldx/b$g;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class a implements g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f45045a = new a();

            private a() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return 1263106029;
            }

            public String toString() {
                return "AccessTokenError";
            }
        }

        /* JADX INFO: renamed from: dx.b$g$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ldx/b$g$b;", "Ldx/b$g;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C1031b implements g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C1031b f45046a = new C1031b();

            private C1031b() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C1031b);
            }

            public int hashCode() {
                return -43392570;
            }

            public String toString() {
                return "Closed";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ldx/b$g$c;", "Ldx/b$g;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class c implements g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f45047a = new c();

            private c() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof c);
            }

            public int hashCode() {
                return -861295115;
            }

            public String toString() {
                return "EmptyBody";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ldx/b$g$e;", "Ldx/b$g;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class e implements g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final e f45078a = new e();

            private e() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof e);
            }

            public int hashCode() {
                return -1141458352;
            }

            public String toString() {
                return "NotConnected";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ldx/b$g$f;", "Ldx/b$g;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class f implements g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final f f45079a = new f();

            private f() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof f);
            }

            public int hashCode() {
                return -1480724076;
            }

            public String toString() {
                return "SocketTimeoutError";
            }
        }

        /* JADX INFO: renamed from: dx.b$g$g, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Ldx/b$g$g;", "Ldx/b$g;", "", "appUpdateRequired", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class SslCertificate implements g {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean appUpdateRequired;

            public SslCertificate(boolean z15) {
                this.appUpdateRequired = z15;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final boolean getAppUpdateRequired() {
                return this.appUpdateRequired;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SslCertificate) && this.appUpdateRequired == ((SslCertificate) other).appUpdateRequired;
            }

            public int hashCode() {
                return Boolean.hashCode(this.appUpdateRequired);
            }

            public String toString() {
                return "SslCertificate(appUpdateRequired=" + this.appUpdateRequired + ")";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ldx/b$g$h;", "Ldx/b$g;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class h implements g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final h f45081a = new h();

            private h() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof h);
            }

            public int hashCode() {
                return 769349703;
            }

            public String toString() {
                return "Timeout";
            }
        }

        /* JADX INFO: renamed from: dx.b$g$d, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0015B-\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0015\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\fR\u0019\u0010\b\u001a\u0004\u0018\u00018\u00008\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0018\u0010\u001f¨\u0006 "}, d2 = {"Ldx/b$g$d;", "T", "Ldx/b$g;", "", "requestId", "Ldx/b$g$d$a;", "code", "message", "data", "<init>", "(Ljava/lang/String;Ldx/b$g$d$a;Ljava/lang/String;Ljava/lang/Object;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getRequestId", "b", "Ldx/b$g$d$a;", "()Ldx/b$g$d$a;", "c", "getMessage", "d", "Ljava/lang/Object;", "()Ljava/lang/Object;", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Http<T> implements g {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String requestId;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final a code;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final String message;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final T data;

            /* JADX INFO: renamed from: dx.b$g$d$a */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b/\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\bj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b\u0007j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0¨\u00061"}, d2 = {"Ldx/b$g$d$a;", "", "", "code", "<init>", "(Ljava/lang/String;II)V", "a", "I", "e", "()I", "b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "y", "z", "A", "B", "C", ip.a.f96138c, "E", "F", "G", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "K", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "O", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37086m, "R", "T", "X", "Y", "Z", "h0", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public enum a {
                BAD_REQUEST(400),
                UNAUTHORIZED(401),
                PAYMENT_REQUIRED(402),
                FORBIDDEN(403),
                NOT_FOUND(404),
                METHOD_NOT_ALLOWED(405),
                NOT_ACCEPTABLE(406),
                PROXY_AUTHENTICATION_REQUIRED(407),
                REQUEST_TIMEOUT(408),
                CONFLICT(409),
                GONE(410),
                LENGTH_REQUIRED(411),
                PRECONDITION_FAILED(412),
                PAYLOAD_TOO_LARGE(413),
                URI_TOO_LONG(414),
                UNSUPPORTED_MEDIA_TYPE(415),
                RANGE_NOT_SATISFIABLE(416),
                EXPECTATION_FAILED(417),
                TEAPOT(418),
                MISDIRECTED_REQUEST(421),
                UNPROCESSABLE_CONTENT(422),
                LOCKED(423),
                FAILED_DEPENDENCY(424),
                TOO_EARLY(425),
                UPGRADE_REQUIRED(426),
                PRECONDITION_REQUIRED(428),
                TOO_MANY_REQUESTS(429),
                REQUEST_HEADER_FIELDS_TOO_LARGE(431),
                UNAVAILABLE_FOR_LEGAL_REASONS(451),
                INTERNAL_SERVER_ERROR(500),
                NOT_IMPLEMENTED(501),
                BAD_GATEWAY(502),
                SERVICE_UNAVAILBLE(503),
                GATEWAY_TIMEOUT(504),
                HTTP_VERSION_NOT_SUPPORTED(505),
                VARIANT_ALSO_NEGOTIATES(506),
                INSUFFICIENT_STORAGE(507),
                LOOP_DETECTED(508),
                NOT_EXTENDED(510),
                NETWORK_AUTHENTICATION_REQUIRED(511),
                UNKNOWN(-1);


                /* JADX INFO: renamed from: r0, reason: collision with root package name */
                private static final /* synthetic */ wq.a f45069r0 = wq.b.a(b());

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final int code;

                a(int i15) {
                    this.code = i15;
                }

                public static wq.a<a> g() {
                    return f45069r0;
                }

                /* JADX INFO: renamed from: e, reason: from getter */
                public final int getCode() {
                    return this.code;
                }
            }

            public Http(String str, a aVar, String str2, T t15) {
                this.requestId = str;
                this.code = aVar;
                this.message = str2;
                this.data = t15;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final a getCode() {
                return this.code;
            }

            public final T b() {
                return this.data;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Http)) {
                    return false;
                }
                Http http = (Http) other;
                return t.c(this.requestId, http.requestId) && this.code == http.code && t.c(this.message, http.message) && t.c(this.data, http.data);
            }

            public int hashCode() {
                String str = this.requestId;
                int iHashCode = (((((str == null ? 0 : str.hashCode()) * 31) + this.code.hashCode()) * 31) + this.message.hashCode()) * 31;
                T t15 = this.data;
                return iHashCode + (t15 != null ? t15.hashCode() : 0);
            }

            public String toString() {
                return "Http(requestId=" + this.requestId + ", code=" + this.code + ", message=" + this.message + ", data=" + this.data + ")";
            }

            public /* synthetic */ Http(String str, a aVar, String str2, Object obj, int i15, fr.k kVar) {
                this((i15 & 1) != 0 ? null : str, aVar, str2, obj);
            }
        }
    }

    /* JADX INFO: renamed from: dx.b$c, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u000e\u001eBI\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJV\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b%\u0010$R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b'\u0010$R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b'\u0010\"\u001a\u0004\b&\u0010$R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b(\u0010\"\u001a\u0004\b(\u0010$¨\u0006)"}, d2 = {"Ldx/b$c;", "Ldx/b;", "Ldx/b$c$a;", "type", "Ldx/b$f;", "informationType", "Lmx/a;", "title", "message", "secondMessage", "primaryActionLabel", "secondaryActionLabel", "<init>", "(Ldx/b$c$a;Ldx/b$f;Lmx/a;Lmx/a;Lmx/a;Lmx/a;Lmx/a;)V", "a", "(Ldx/b$c$a;Ldx/b$f;Lmx/a;Lmx/a;Lmx/a;Lmx/a;Lmx/a;)Ldx/b$c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ldx/b$c$a;", "i", "()Ldx/b$c$a;", "b", "Ldx/b$f;", "c", "()Ldx/b$f;", "Lmx/a;", "h", "()Lmx/a;", "d", "e", "f", "g", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Business implements b {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f45029h = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final a type;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final f informationType;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label title;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label message;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label secondMessage;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label primaryActionLabel;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label secondaryActionLabel;

        /* JADX INFO: renamed from: dx.b$c$a */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Ldx/b$c$a;", "", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface a {
        }

        /* JADX INFO: renamed from: dx.b$c$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldx/b$c$b;", "Ldx/b$c$a;", "<init>", "()V", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class C1030b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C1030b f45037a = new C1030b();

            private C1030b() {
            }
        }

        public Business(a aVar, f fVar, Label label, Label label2, Label label3, Label label4, Label label5) {
            this.type = aVar;
            this.informationType = fVar;
            this.title = label;
            this.message = label2;
            this.secondMessage = label3;
            this.primaryActionLabel = label4;
            this.secondaryActionLabel = label5;
        }

        public static /* synthetic */ Business b(Business business, a aVar, f fVar, Label label, Label label2, Label label3, Label label4, Label label5, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                aVar = business.type;
            }
            if ((i15 & 2) != 0) {
                fVar = business.informationType;
            }
            if ((i15 & 4) != 0) {
                label = business.title;
            }
            if ((i15 & 8) != 0) {
                label2 = business.message;
            }
            if ((i15 & 16) != 0) {
                label3 = business.secondMessage;
            }
            if ((i15 & 32) != 0) {
                label4 = business.primaryActionLabel;
            }
            if ((i15 & 64) != 0) {
                label5 = business.secondaryActionLabel;
            }
            Label label6 = label4;
            Label label7 = label5;
            Label label8 = label3;
            Label label9 = label;
            return business.a(aVar, fVar, label9, label2, label8, label6, label7);
        }

        public final Business a(a type, f informationType, Label title, Label message, Label secondMessage, Label primaryActionLabel, Label secondaryActionLabel) {
            return new Business(type, informationType, title, message, secondMessage, primaryActionLabel, secondaryActionLabel);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final f getInformationType() {
            return this.informationType;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Label getMessage() {
            return this.message;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final Label getPrimaryActionLabel() {
            return this.primaryActionLabel;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Business)) {
                return false;
            }
            Business business = (Business) other;
            return t.c(this.type, business.type) && this.informationType == business.informationType && t.c(this.title, business.title) && t.c(this.message, business.message) && t.c(this.secondMessage, business.secondMessage) && t.c(this.primaryActionLabel, business.primaryActionLabel) && t.c(this.secondaryActionLabel, business.secondaryActionLabel);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final Label getSecondMessage() {
            return this.secondMessage;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final Label getSecondaryActionLabel() {
            return this.secondaryActionLabel;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final Label getTitle() {
            return this.title;
        }

        public int hashCode() {
            return (((((((((((this.type.hashCode() * 31) + this.informationType.hashCode()) * 31) + this.title.hashCode()) * 31) + this.message.hashCode()) * 31) + this.secondMessage.hashCode()) * 31) + this.primaryActionLabel.hashCode()) * 31) + this.secondaryActionLabel.hashCode();
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final a getType() {
            return this.type;
        }

        public String toString() {
            return "Business(type=" + this.type + ", informationType=" + this.informationType + ", title=" + this.title + ", message=" + this.message + ", secondMessage=" + this.secondMessage + ", primaryActionLabel=" + this.primaryActionLabel + ", secondaryActionLabel=" + this.secondaryActionLabel + ")";
        }

        public /* synthetic */ Business(a aVar, f fVar, Label label, Label label2, Label label3, Label label4, Label label5, int i15, fr.k kVar) {
            this((i15 & 1) != 0 ? C1030b.f45037a : aVar, (i15 & 2) != 0 ? f.FAILURE : fVar, label, (i15 & 8) != 0 ? Label.INSTANCE.c() : label2, (i15 & 16) != 0 ? Label.INSTANCE.c() : label3, label4, (i15 & 64) != 0 ? Label.INSTANCE.c() : label5);
        }
    }
}
