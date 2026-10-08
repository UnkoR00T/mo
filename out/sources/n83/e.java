package n83;

import fr.t;
import fu.o;
import hz.g;
import hz.h;
import hz.i;
import java.util.ArrayList;
import java.util.Set;
import mx.Label;
import oo0.BEReportIssueReason;
import oq.k;
import oq.l;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import u70.l0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0005\u001f\u001a\"$\u001cB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u0018\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010 ¨\u0006%"}, d2 = {"Ln83/e;", "Lgz/b;", "Ln83/e$d;", "Ln83/e$e;", "Lhz/i;", "validatorTextFactory", "Lmx/c;", "labelProvider", "<init>", "(Lhz/i;Lmx/c;)V", "Lx83/f;", "value", "Lhz/b;", "m", "(Lx83/f;)Lhz/b;", "Loo0/b;", "n", "(Loo0/b;)Lhz/b;", "", "Lhz/g;", "o", "(Ljava/lang/String;)Lhz/g;", "l", "params", "j", "(Ln83/e$d;Ltq/e;)Ljava/lang/Object;", "a", "Lhz/i;", "b", "Lmx/c;", "Lhz/h;", "c", "Lhz/h;", "ownerNamesValidator", "d", "vehicleNumberValidator", "e", "technicalsupport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements gz.b<Params, Results> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final b f133575e = new b(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f133576f = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final k<o> f133577g = l.a(new er.a() { // from class: n83.c
        @Override // er.a
        public final Object a() {
            return e.k();
        }
    });

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final k<o> f133578h = l.a(new er.a() { // from class: n83.d
        @Override // er.a
        public final Object a() {
            return e.i();
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final i validatorTextFactory;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final h ownerNamesValidator;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final h vehicleNumberValidator;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0096\u0001¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ln83/e$a;", "Lhz/a;", "", "Lmx/a;", "errorMessage", "<init>", "(Lmx/a;)V", "value", "", "c", "(Ljava/lang/String;)Z", "b", "Lmx/a;", "a", "()Lmx/a;", "technicalsupport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements hz.a<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ l0 f133583a;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Label errorMessage;

        public a(Label label) {
            this.f133583a = new l0(label, e.f133575e.a());
            this.errorMessage = label;
        }

        @Override // hz.a
        /* JADX INFO: renamed from: a, reason: from getter */
        public Label getErrorMessage() {
            return this.errorMessage;
        }

        @Override // hz.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public boolean b(String value) {
            return this.f133583a.b(value);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\f\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0014\u0010\u000e\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000f¨\u0006\u0012"}, d2 = {"Ln83/e$b;", "", "<init>", "()V", "Lfu/o;", "namesRegex$delegate", "Loq/k;", "b", "()Lfu/o;", "namesRegex", "alphanumericWithSpaceRegex$delegate", "a", "alphanumericWithSpaceRegex", "", "MIN_VEHICLE_NUMBER_LENGTH", "I", "MAX_VEHICLE_NUMBER_LENGTH", "MAX_OWNER_NAMES_LENGTH", "technicalsupport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class b {
        public /* synthetic */ b(fr.k kVar) {
            this();
        }

        public final o a() {
            return (o) e.f133578h.getValue();
        }

        public final o b() {
            return (o) e.f133577g.getValue();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0096\u0001¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ln83/e$c;", "Lhz/a;", "", "Lmx/a;", "errorMessage", "<init>", "(Lmx/a;)V", "value", "", "c", "(Ljava/lang/String;)Z", "b", "Lmx/a;", "a", "()Lmx/a;", "technicalsupport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class c implements hz.a<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ l0 f133585a;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Label errorMessage;

        public c(Label label) {
            this.f133585a = new l0(label, e.f133575e.b());
            this.errorMessage = label;
        }

        @Override // hz.a
        /* JADX INFO: renamed from: a, reason: from getter */
        public Label getErrorMessage() {
            return this.errorMessage;
        }

        @Override // hz.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public boolean b(String value) {
            return this.f133585a.b(value);
        }
    }

    /* JADX INFO: renamed from: n83.e$d, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Ln83/e$d;", "Lgz/b$a;", "", "Ln83/e$d$a;", "values", "<init>", "(Ljava/util/Set;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Set;", "()Ljava/util/Set;", "technicalsupport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Set<a> values;

        /* JADX INFO: renamed from: n83.e$d$a */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Ln83/e$d$a;", "", "d", "a", "b", "c", "Ln83/e$d$a$a;", "Ln83/e$d$a$b;", "Ln83/e$d$a$c;", "Ln83/e$d$a$d;", "technicalsupport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface a {

            /* JADX INFO: renamed from: n83.e$d$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Ln83/e$d$a$a;", "Ln83/e$d$a;", "", "value", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "technicalsupport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class C3306a implements a {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final String value;

                public C3306a(String str) {
                    this.value = str;
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final String getValue() {
                    return this.value;
                }
            }

            /* JADX INFO: renamed from: n83.e$d$a$b */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Ln83/e$d$a$b;", "Ln83/e$d$a;", "Lx83/f;", "value", "<init>", "(Lx83/f;)V", "a", "Lx83/f;", "()Lx83/f;", "technicalsupport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class b implements a {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final x83.f value;

                public b(x83.f fVar) {
                    this.value = fVar;
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final x83.f getValue() {
                    return this.value;
                }
            }

            /* JADX INFO: renamed from: n83.e$d$a$c */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Ln83/e$d$a$c;", "Ln83/e$d$a;", "Loo0/b;", "value", "<init>", "(Loo0/b;)V", "a", "Loo0/b;", "()Loo0/b;", "technicalsupport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class c implements a {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final BEReportIssueReason value;

                public c(BEReportIssueReason bEReportIssueReason) {
                    this.value = bEReportIssueReason;
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final BEReportIssueReason getValue() {
                    return this.value;
                }
            }

            /* JADX INFO: renamed from: n83.e$d$a$d, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Ln83/e$d$a$d;", "Ln83/e$d$a;", "", "value", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "technicalsupport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class C3307d implements a {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final String value;

                public C3307d(String str) {
                    this.value = str;
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final String getValue() {
                    return this.value;
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Params(Set<? extends a> set) {
            this.values = set;
        }

        public final Set<a> a() {
            return this.values;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && t.c(this.values, ((Params) other).values);
        }

        public int hashCode() {
            return this.values.hashCode();
        }

        public String toString() {
            return "Params(values=" + this.values + ')';
        }
    }

    /* JADX INFO: renamed from: n83.e$e, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Ln83/e$e;", "", "", "Ln83/e$e$a;", "values", "<init>", "(Ljava/util/Set;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Set;", "()Ljava/util/Set;", "technicalsupport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Results {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Set<a> values;

        /* JADX INFO: renamed from: n83.e$e$a */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0006\u0007\b\tR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0004\n\u000b\f\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Ln83/e$e$a;", "", "Lhz/b;", "getValue", "()Lhz/b;", "value", "d", "a", "b", "c", "Ln83/e$e$a$a;", "Ln83/e$e$a$b;", "Ln83/e$e$a$c;", "Ln83/e$e$a$d;", "technicalsupport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface a {

            /* JADX INFO: renamed from: n83.e$e$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ln83/e$e$a$a;", "Ln83/e$e$a;", "Lhz/b;", "value", "<init>", "(Lhz/b;)V", "a", "Lhz/b;", "getValue", "()Lhz/b;", "technicalsupport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class C3309a implements a {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public static final int f133593b = hz.b.f86845b;

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final hz.b value;

                public C3309a(hz.b bVar) {
                    this.value = bVar;
                }

                @Override // n83.e.Results.a
                public hz.b getValue() {
                    return this.value;
                }
            }

            /* JADX INFO: renamed from: n83.e$e$a$b */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ln83/e$e$a$b;", "Ln83/e$e$a;", "Lhz/b;", "value", "<init>", "(Lhz/b;)V", "a", "Lhz/b;", "getValue", "()Lhz/b;", "technicalsupport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class b implements a {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public static final int f133595b = hz.b.f86845b;

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final hz.b value;

                public b(hz.b bVar) {
                    this.value = bVar;
                }

                @Override // n83.e.Results.a
                public hz.b getValue() {
                    return this.value;
                }
            }

            /* JADX INFO: renamed from: n83.e$e$a$c */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ln83/e$e$a$c;", "Ln83/e$e$a;", "Lhz/b;", "value", "<init>", "(Lhz/b;)V", "a", "Lhz/b;", "getValue", "()Lhz/b;", "technicalsupport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class c implements a {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public static final int f133597b = hz.b.f86845b;

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final hz.b value;

                public c(hz.b bVar) {
                    this.value = bVar;
                }

                @Override // n83.e.Results.a
                public hz.b getValue() {
                    return this.value;
                }
            }

            /* JADX INFO: renamed from: n83.e$e$a$d */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ln83/e$e$a$d;", "Ln83/e$e$a;", "Lhz/b;", "value", "<init>", "(Lhz/b;)V", "a", "Lhz/b;", "getValue", "()Lhz/b;", "technicalsupport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class d implements a {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public static final int f133599b = hz.b.f86845b;

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final hz.b value;

                public d(hz.b bVar) {
                    this.value = bVar;
                }

                @Override // n83.e.Results.a
                public hz.b getValue() {
                    return this.value;
                }
            }

            hz.b getValue();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Results(Set<? extends a> set) {
            this.values = set;
        }

        public final Set<a> a() {
            return this.values;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Results) && t.c(this.values, ((Results) other).values);
        }

        public int hashCode() {
            return this.values.hashCode();
        }

        public String toString() {
            return "Results(values=" + this.values + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f133601a;

        static {
            int[] iArr = new int[x83.f.values().length];
            try {
                iArr[x83.f.OWNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[x83.f.COOWNER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[x83.f.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f133601a = iArr;
        }
    }

    public e(i iVar, mx.c cVar) {
        this.validatorTextFactory = iVar;
        this.labelProvider = cVar;
        hz.c.Companion companion = hz.c.INSTANCE;
        this.ownerNamesValidator = (h) companion.a(iVar.a().y(240, cVar.e(l83.a.f116986j, 240)), new c(cVar.c(l83.a.J0)));
        this.vehicleNumberValidator = ((h) companion.a(iVar.a().M(cVar.c(l83.a.f116972c)), new a(cVar.c(l83.a.f116997o0)))).t(cVar.c(l83.a.f116997o0)).O(4, cVar.c(l83.a.f116997o0)).y(9, cVar.c(l83.a.f116997o0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o i() {
        return new o("[A-Za-z0-9 ]+$");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o k() {
        return new o("^[\\p{L} .-]*$");
    }

    private final g l(String value) {
        return this.ownerNamesValidator.a(value);
    }

    private final hz.b m(x83.f value) {
        int i15 = f.f133601a[value.ordinal()];
        if (i15 == 1 || i15 == 2) {
            return hz.b.d.f86848c;
        }
        if (i15 == 3) {
            return new hz.b.Invalid(this.labelProvider.c(l83.a.f116972c));
        }
        throw new p();
    }

    private final hz.b n(BEReportIssueReason value) {
        return value != null ? hz.b.d.f86848c : new hz.b.Invalid(this.labelProvider.c(l83.a.f116972c));
    }

    private final g o(String value) {
        return this.vehicleNumberValidator.a(value);
    }

    public Object j(Params params, tq.e<? super Results> eVar) {
        Results.a dVar;
        Set<Params.a> setA = params.a();
        ArrayList arrayList = new ArrayList(v.y(setA, 10));
        for (Params.a aVar : setA) {
            if (aVar instanceof Params.a.C3306a) {
                dVar = new Results.a.C3309a(l(((Params.a.C3306a) aVar).getValue()).a());
            } else if (aVar instanceof Params.a.b) {
                dVar = new Results.a.b(m(((Params.a.b) aVar).getValue()));
            } else if (aVar instanceof Params.a.c) {
                dVar = new Results.a.c(n(((Params.a.c) aVar).getValue()));
            } else {
                if (!(aVar instanceof Params.a.C3307d)) {
                    throw new p();
                }
                dVar = new Results.a.d(o(((Params.a.C3307d) aVar).getValue()).a());
            }
            arrayList.add(dVar);
        }
        return new Results(v.k1(arrayList));
    }
}
