package t02;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0016\u0014B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0018¨\u0006\u0019"}, d2 = {"Lt02/y;", "Lgz/a;", "Lt02/y$a;", "Lt02/y$b;", "Lt02/x;", "validateNameUC", "Lt02/g0;", "validateSurnameUC", "<init>", "(Lt02/x;Lt02/g0;)V", "", "name", "Lt02/y$b$a$a;", "c", "(Ljava/lang/String;)Lt02/y$b$a$a;", "surname", "Lt02/y$b$a$b;", "d", "(Ljava/lang/String;)Lt02/y$b$a$b;", "params", "b", "(Lt02/y$a;)Lt02/y$b;", "a", "Lt02/x;", "Lt02/g0;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class y implements gz.a<Params, Results> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final x validateNameUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final g0 validateSurnameUC;

    /* JADX INFO: renamed from: t02.y$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lt02/y$a;", "Lgz/b$a;", "", "Lt02/y$a$a;", "values", "<init>", "(Ljava/util/Set;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Set;", "()Ljava/util/Set;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Set<InterfaceC4846a> values;

        /* JADX INFO: renamed from: t02.y$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lt02/y$a$a;", "", "a", "b", "Lt02/y$a$a$a;", "Lt02/y$a$a$b;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface InterfaceC4846a {

            /* JADX INFO: renamed from: t02.y$a$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lt02/y$a$a$a;", "Lt02/y$a$a;", "", "value", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class C4847a implements InterfaceC4846a {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final String value;

                public C4847a(String str) {
                    this.value = str;
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final String getValue() {
                    return this.value;
                }
            }

            /* JADX INFO: renamed from: t02.y$a$a$b */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lt02/y$a$a$b;", "Lt02/y$a$a;", "", "value", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class b implements InterfaceC4846a {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final String value;

                public b(String str) {
                    this.value = str;
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final String getValue() {
                    return this.value;
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Params(Set<? extends InterfaceC4846a> set) {
            this.values = set;
        }

        public final Set<InterfaceC4846a> a() {
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

    /* JADX INFO: renamed from: t02.y$b, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lt02/y$b;", "", "", "Lt02/y$b$a;", "values", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Results {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<a> values;

        /* JADX INFO: renamed from: t02.y$b$a */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0006\u0007R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lt02/y$b$a;", "", "Lhz/b;", "getValue", "()Lhz/b;", "value", "a", "b", "Lt02/y$b$a$a;", "Lt02/y$b$a$b;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface a {

            /* JADX INFO: renamed from: t02.y$b$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lt02/y$b$a$a;", "Lt02/y$b$a;", "Lhz/b;", "value", "<init>", "(Lhz/b;)V", "a", "Lhz/b;", "getValue", "()Lhz/b;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class C4848a implements a {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public static final int f186778b = hz.b.f86845b;

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final hz.b value;

                public C4848a(hz.b bVar) {
                    this.value = bVar;
                }

                @Override // t02.y.Results.a
                public hz.b getValue() {
                    return this.value;
                }
            }

            /* JADX INFO: renamed from: t02.y$b$a$b, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lt02/y$b$a$b;", "Lt02/y$b$a;", "Lhz/b;", "value", "<init>", "(Lhz/b;)V", "a", "Lhz/b;", "getValue", "()Lhz/b;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class C4849b implements a {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public static final int f186780b = hz.b.f86845b;

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final hz.b value;

                public C4849b(hz.b bVar) {
                    this.value = bVar;
                }

                @Override // t02.y.Results.a
                public hz.b getValue() {
                    return this.value;
                }
            }

            hz.b getValue();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Results(List<? extends a> list) {
            this.values = list;
        }

        public final List<a> a() {
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

    public y(x xVar, g0 g0Var) {
        this.validateNameUC = xVar;
        this.validateSurnameUC = g0Var;
    }

    private final Results.a.C4848a c(String name) {
        return new Results.a.C4848a(hz.b.INSTANCE.a(this.validateNameUC.b(new x.Params(name))));
    }

    private final Results.a.C4849b d(String surname) {
        return new Results.a.C4849b(hz.b.INSTANCE.a(this.validateSurnameUC.b(new g0.Params(surname))));
    }

    public Results b(Params params) {
        Results.a aVarD;
        Set<Params.InterfaceC4846a> setA = params.a();
        ArrayList arrayList = new ArrayList(pq.v.y(setA, 10));
        for (Params.InterfaceC4846a interfaceC4846a : setA) {
            if (interfaceC4846a instanceof Params.InterfaceC4846a.C4847a) {
                aVarD = c(((Params.InterfaceC4846a.C4847a) interfaceC4846a).getValue());
            } else {
                if (!(interfaceC4846a instanceof Params.InterfaceC4846a.b)) {
                    throw new oq.p();
                }
                aVarD = d(((Params.InterfaceC4846a.b) interfaceC4846a).getValue());
            }
            arrayList.add(aVarD);
        }
        return new Results(arrayList);
    }
}
