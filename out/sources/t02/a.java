package t02;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import p071kotlin.Metadata;
import pq.e1;
import xw.PhoneNumber;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0017\u0015B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\f2\u0006\u0010\u000b\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0019¨\u0006\u001a"}, d2 = {"Lt02/a;", "Lgz/a;", "Lt02/a$a;", "Lt02/a$b;", "Lt02/d0;", "validateRdkEmailUC", "Lt02/e0;", "validateRdkPhoneNumberUC", "<init>", "(Lt02/d0;Lt02/e0;)V", "Lt02/a$a$a$b;", "param", "", "Lt02/a$b$a;", "d", "(Lt02/a$a$a$b;)Ljava/util/Set;", "Lt02/a$a$a$a;", "Lt02/a$b$a$a;", "c", "(Lt02/a$a$a$a;)Ljava/util/Set;", "params", "b", "(Lt02/a$a;)Lt02/a$b;", "a", "Lt02/d0;", "Lt02/e0;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements gz.a<Params, Results> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final d0 validateRdkEmailUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e0 validateRdkPhoneNumberUC;

    /* JADX INFO: renamed from: t02.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lt02/a$a;", "Lgz/b$a;", "", "Lt02/a$a$a;", "values", "<init>", "(Ljava/util/Set;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Set;", "()Ljava/util/Set;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Set<InterfaceC4828a> values;

        /* JADX INFO: renamed from: t02.a$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lt02/a$a$a;", "", "b", "a", "Lt02/a$a$a$a;", "Lt02/a$a$a$b;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface InterfaceC4828a {

            /* JADX INFO: renamed from: t02.a$a$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lt02/a$a$a$a;", "Lt02/a$a$a;", "Liy/b0;", "value", "<init>", "(Liy/b0;)V", "a", "Liy/b0;", "()Liy/b0;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class C4829a implements InterfaceC4828a {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public static final int f186557b = iy.b0.f97726c;

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final iy.b0 value;

                public C4829a(iy.b0 b0Var) {
                    this.value = b0Var;
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final iy.b0 getValue() {
                    return this.value;
                }
            }

            /* JADX INFO: renamed from: t02.a$a$a$b */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lt02/a$a$a$b;", "Lt02/a$a$a;", "Lxw/h;", "phoneNumber", "<init>", "(Lxw/h;)V", "a", "Lxw/h;", "()Lxw/h;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class b implements InterfaceC4828a {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public static final int f186559b = PhoneNumber.f221634d;

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final PhoneNumber phoneNumber;

                public b(PhoneNumber phoneNumber) {
                    this.phoneNumber = phoneNumber;
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final PhoneNumber getPhoneNumber() {
                    return this.phoneNumber;
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Params(Set<? extends InterfaceC4828a> set) {
            this.values = set;
        }

        public final Set<InterfaceC4828a> a() {
            return this.values;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && fr.t.c(this.values, ((Params) other).values);
        }

        public int hashCode() {
            return this.values.hashCode();
        }

        public String toString() {
            return "Params(values=" + this.values + ')';
        }
    }

    /* JADX INFO: renamed from: t02.a$b, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lt02/a$b;", "", "", "Lt02/a$b$a;", "values", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Results {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<InterfaceC4830a> values;

        /* JADX INFO: renamed from: t02.a$b$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0003\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lt02/a$b$a;", "", "Lhz/b;", "getValue", "()Lhz/b;", "value", "b", "c", "a", "Lt02/a$b$a$a;", "Lt02/a$b$a$b;", "Lt02/a$b$a$c;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface InterfaceC4830a {

            /* JADX INFO: renamed from: t02.a$b$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lt02/a$b$a$a;", "Lt02/a$b$a;", "Lhz/b;", "value", "<init>", "(Lhz/b;)V", "a", "Lhz/b;", "getValue", "()Lhz/b;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class C4831a implements InterfaceC4830a {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public static final int f186562b = hz.b.f86845b;

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final hz.b value;

                public C4831a(hz.b bVar) {
                    this.value = bVar;
                }

                @Override // t02.a.Results.InterfaceC4830a
                public hz.b getValue() {
                    return this.value;
                }
            }

            /* JADX INFO: renamed from: t02.a$b$a$b, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lt02/a$b$a$b;", "Lt02/a$b$a;", "Lhz/b;", "value", "<init>", "(Lhz/b;)V", "a", "Lhz/b;", "getValue", "()Lhz/b;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class C4832b implements InterfaceC4830a {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public static final int f186564b = hz.b.f86845b;

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final hz.b value;

                public C4832b(hz.b bVar) {
                    this.value = bVar;
                }

                @Override // t02.a.Results.InterfaceC4830a
                public hz.b getValue() {
                    return this.value;
                }
            }

            /* JADX INFO: renamed from: t02.a$b$a$c */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lt02/a$b$a$c;", "Lt02/a$b$a;", "Lhz/b;", "value", "<init>", "(Lhz/b;)V", "a", "Lhz/b;", "getValue", "()Lhz/b;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class c implements InterfaceC4830a {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public static final int f186566b = hz.b.f86845b;

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final hz.b value;

                public c(hz.b bVar) {
                    this.value = bVar;
                }

                @Override // t02.a.Results.InterfaceC4830a
                public hz.b getValue() {
                    return this.value;
                }
            }

            hz.b getValue();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Results(List<? extends InterfaceC4830a> list) {
            this.values = list;
        }

        public final List<InterfaceC4830a> a() {
            return this.values;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Results) && fr.t.c(this.values, ((Results) other).values);
        }

        public int hashCode() {
            return this.values.hashCode();
        }

        public String toString() {
            return "Results(values=" + this.values + ')';
        }
    }

    public a(d0 d0Var, e0 e0Var) {
        this.validateRdkEmailUC = d0Var;
        this.validateRdkPhoneNumberUC = e0Var;
    }

    private final Set<Results.InterfaceC4830a.C4831a> c(Params.InterfaceC4828a.C4829a param) {
        return e1.d(new Results.InterfaceC4830a.C4831a(hz.b.INSTANCE.a(this.validateRdkEmailUC.e(new d0.Params(iy.c0.e(param.getValue()))))));
    }

    private final Set<Results.InterfaceC4830a> d(Params.InterfaceC4828a.b param) throws IOException {
        e0.Result resultB = this.validateRdkPhoneNumberUC.b(new e0.Params(param.getPhoneNumber()));
        hz.g prefixValidatorResponse = resultB.getPrefixValidatorResponse();
        hz.b.Companion companion = hz.b.INSTANCE;
        return e1.i(new Results.InterfaceC4830a.c(companion.a(prefixValidatorResponse)), new Results.InterfaceC4830a.C4832b(companion.a(resultB.getNumberValidatorResponse())));
    }

    public Results b(Params params) throws IOException {
        Set<Results.InterfaceC4830a> setC;
        Set<Params.InterfaceC4828a> setA = params.a();
        ArrayList arrayList = new ArrayList();
        for (Params.InterfaceC4828a interfaceC4828a : setA) {
            if (interfaceC4828a instanceof Params.InterfaceC4828a.b) {
                setC = d((Params.InterfaceC4828a.b) interfaceC4828a);
            } else {
                if (!(interfaceC4828a instanceof Params.InterfaceC4828a.C4829a)) {
                    throw new oq.p();
                }
                setC = c((Params.InterfaceC4828a.C4829a) interfaceC4828a);
            }
            pq.v.D(arrayList, setC);
        }
        return new Results(arrayList);
    }
}
