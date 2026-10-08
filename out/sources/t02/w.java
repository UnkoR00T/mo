package t02;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import p071kotlin.Metadata;
import pq.e1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003$&\u0014B9\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001c\u0010\u001aJ\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001e\u0010\u001aJ\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b \u0010\u001aJ\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\"\u0010\u001aJ\u0018\u0010$\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010(R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010)R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010*R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010+R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010,¨\u0006-"}, d2 = {"Lt02/w;", "Lgz/a;", "Lt02/w$b;", "Lt02/w$c;", "Lmx/c;", "labelProvider", "Lj14/q;", "checkRegonNumberCorrectUC", "Lj14/l;", "checkNipNumberCheckSumUC", "Lj14/m;", "checkPeselNumberCorrectUC", "Lj14/k;", "checkKrsNumberCorrectUC", "Lt02/v;", "validateEuropeanIdUC", "<init>", "(Lmx/c;Lj14/q;Lj14/l;Lj14/m;Lj14/k;Lt02/v;)V", "d", "()Lt02/w$c;", "c", "", "value", "", "Lt02/w$c$a$a;", "e", "(Ljava/lang/String;)Ljava/util/Set;", "Lt02/w$c$a$b;", "f", "Lt02/w$c$a$c;", "g", "Lt02/w$c$a$e;", "i", "Lt02/w$c$a$d;", "h", "params", "b", "(Lt02/w$b;)Lt02/w$c;", "a", "Lmx/c;", "Lj14/q;", "Lj14/l;", "Lj14/m;", "Lj14/k;", "Lt02/v;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class w implements gz.a<Params, Results> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f186740h = 8;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Set<Params.a> f186741i = e1.i(new Params.a.Pesel(""), new Params.a.Nip(""), new Params.a.Regon(""), new Params.a.Krs(""), new Params.a.EuropeanId(""));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Set<Params.a> f186742j = e1.i(new Params.a.Nip(""), new Params.a.Regon(""));

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final j14.q checkRegonNumberCorrectUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final j14.l checkNipNumberCheckSumUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final j14.m checkPeselNumberCorrectUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final j14.k checkKrsNumberCorrectUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final v validateEuropeanIdUC;

    /* JADX INFO: renamed from: t02.w$b, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lt02/w$b;", "Lgz/b$a;", "", "Lt02/w$b$a;", "values", "<init>", "(Ljava/util/Set;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Set;", "()Ljava/util/Set;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Set<a> values;

        /* JADX INFO: renamed from: t02.w$b$a */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lt02/w$b$a;", "", "d", "c", "b", "e", "a", "Lt02/w$b$a$a;", "Lt02/w$b$a$b;", "Lt02/w$b$a$c;", "Lt02/w$b$a$d;", "Lt02/w$b$a$e;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface a {

            /* JADX INFO: renamed from: t02.w$b$a$a, reason: collision with other inner class name and from toString */
            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lt02/w$b$a$a;", "Lt02/w$b$a;", "", "value", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class EuropeanId implements a {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final String value;

                public EuropeanId(String str) {
                    this.value = str;
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final String getValue() {
                    return this.value;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof EuropeanId) && fr.t.c(this.value, ((EuropeanId) other).value);
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "EuropeanId(value=" + this.value + ')';
                }
            }

            /* JADX INFO: renamed from: t02.w$b$a$b, reason: collision with other inner class name and from toString */
            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lt02/w$b$a$b;", "Lt02/w$b$a;", "", "value", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Krs implements a {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final String value;

                public Krs(String str) {
                    this.value = str;
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final String getValue() {
                    return this.value;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Krs) && fr.t.c(this.value, ((Krs) other).value);
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "Krs(value=" + this.value + ')';
                }
            }

            /* JADX INFO: renamed from: t02.w$b$a$c, reason: from toString */
            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lt02/w$b$a$c;", "Lt02/w$b$a;", "", "value", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Nip implements a {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final String value;

                public Nip(String str) {
                    this.value = str;
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final String getValue() {
                    return this.value;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Nip) && fr.t.c(this.value, ((Nip) other).value);
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "Nip(value=" + this.value + ')';
                }
            }

            /* JADX INFO: renamed from: t02.w$b$a$d, reason: from toString */
            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lt02/w$b$a$d;", "Lt02/w$b$a;", "", "value", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Pesel implements a {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final String value;

                public Pesel(String str) {
                    this.value = str;
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final String getValue() {
                    return this.value;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Pesel) && fr.t.c(this.value, ((Pesel) other).value);
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "Pesel(value=" + this.value + ')';
                }
            }

            /* JADX INFO: renamed from: t02.w$b$a$e, reason: from toString */
            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lt02/w$b$a$e;", "Lt02/w$b$a;", "", "value", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Regon implements a {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final String value;

                public Regon(String str) {
                    this.value = str;
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final String getValue() {
                    return this.value;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Regon) && fr.t.c(this.value, ((Regon) other).value);
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "Regon(value=" + this.value + ')';
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
            return (other instanceof Params) && fr.t.c(this.values, ((Params) other).values);
        }

        public int hashCode() {
            return this.values.hashCode();
        }

        public String toString() {
            return "Params(values=" + this.values + ')';
        }
    }

    /* JADX INFO: renamed from: t02.w$c, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lt02/w$c;", "", "", "Lt02/w$c$a;", "values", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Results {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<a> values;

        /* JADX INFO: renamed from: t02.w$c$a */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0006\u0007\b\t\nR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0005\u000b\f\r\u000e\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lt02/w$c$a;", "", "Lhz/b;", "getValue", "()Lhz/b;", "value", "d", "c", "b", "e", "a", "Lt02/w$c$a$a;", "Lt02/w$c$a$b;", "Lt02/w$c$a$c;", "Lt02/w$c$a$d;", "Lt02/w$c$a$e;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface a {

            /* JADX INFO: renamed from: t02.w$c$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lt02/w$c$a$a;", "Lt02/w$c$a;", "Lhz/b;", "value", "<init>", "(Lhz/b;)V", "a", "Lhz/b;", "getValue", "()Lhz/b;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class C4844a implements a {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public static final int f186756b = hz.b.f86845b;

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final hz.b value;

                public C4844a(hz.b bVar) {
                    this.value = bVar;
                }

                @Override // t02.w.Results.a
                public hz.b getValue() {
                    return this.value;
                }
            }

            /* JADX INFO: renamed from: t02.w$c$a$b */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lt02/w$c$a$b;", "Lt02/w$c$a;", "Lhz/b;", "value", "<init>", "(Lhz/b;)V", "a", "Lhz/b;", "getValue", "()Lhz/b;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class b implements a {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public static final int f186758b = hz.b.f86845b;

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final hz.b value;

                public b(hz.b bVar) {
                    this.value = bVar;
                }

                @Override // t02.w.Results.a
                public hz.b getValue() {
                    return this.value;
                }
            }

            /* JADX INFO: renamed from: t02.w$c$a$c, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lt02/w$c$a$c;", "Lt02/w$c$a;", "Lhz/b;", "value", "<init>", "(Lhz/b;)V", "a", "Lhz/b;", "getValue", "()Lhz/b;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class C4845c implements a {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public static final int f186760b = hz.b.f86845b;

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final hz.b value;

                public C4845c(hz.b bVar) {
                    this.value = bVar;
                }

                @Override // t02.w.Results.a
                public hz.b getValue() {
                    return this.value;
                }
            }

            /* JADX INFO: renamed from: t02.w$c$a$d */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lt02/w$c$a$d;", "Lt02/w$c$a;", "Lhz/b;", "value", "<init>", "(Lhz/b;)V", "a", "Lhz/b;", "getValue", "()Lhz/b;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class d implements a {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public static final int f186762b = hz.b.f86845b;

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final hz.b value;

                public d(hz.b bVar) {
                    this.value = bVar;
                }

                @Override // t02.w.Results.a
                public hz.b getValue() {
                    return this.value;
                }
            }

            /* JADX INFO: renamed from: t02.w$c$a$e */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lt02/w$c$a$e;", "Lt02/w$c$a;", "Lhz/b;", "value", "<init>", "(Lhz/b;)V", "a", "Lhz/b;", "getValue", "()Lhz/b;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class e implements a {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public static final int f186764b = hz.b.f86845b;

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final hz.b value;

                public e(hz.b bVar) {
                    this.value = bVar;
                }

                @Override // t02.w.Results.a
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

    public w(mx.c cVar, j14.q qVar, j14.l lVar, j14.m mVar, j14.k kVar, v vVar) {
        this.labelProvider = cVar;
        this.checkRegonNumberCorrectUC = qVar;
        this.checkNipNumberCheckSumUC = lVar;
        this.checkPeselNumberCorrectUC = mVar;
        this.checkKrsNumberCorrectUC = kVar;
        this.validateEuropeanIdUC = vVar;
    }

    private final Results c() {
        hz.b.Invalid invalid = new hz.b.Invalid(this.labelProvider.c(e02.a.f46624v1));
        return new Results(pq.v.q(new Results.a.C4845c(invalid), new Results.a.e(invalid)));
    }

    private final Results d() {
        hz.b.Invalid invalid = new hz.b.Invalid(this.labelProvider.c(e02.a.f46624v1));
        return new Results(pq.v.q(new Results.a.d(invalid), new Results.a.C4845c(invalid), new Results.a.b(invalid), new Results.a.e(invalid), new Results.a.C4844a(invalid)));
    }

    private final Set<Results.a.C4844a> e(String value) {
        hz.b bVarA;
        if (value.length() > 0) {
            bVarA = hz.b.INSTANCE.a(this.validateEuropeanIdUC.b(new v.Params(value)));
        } else {
            bVarA = hz.b.C2039b.f86846c;
        }
        return e1.d(new Results.a.C4844a(bVarA));
    }

    private final Set<Results.a.b> f(String value) {
        hz.b bVarA;
        if (value.length() > 0) {
            bVarA = hz.b.INSTANCE.a(this.checkKrsNumberCorrectUC.a(new j14.k.Params(value, false)));
        } else {
            bVarA = hz.b.C2039b.f86846c;
        }
        return e1.d(new Results.a.b(bVarA));
    }

    private final Set<Results.a.C4845c> g(String value) {
        hz.b bVarA;
        if (value.length() > 0) {
            bVarA = hz.b.INSTANCE.a(this.checkNipNumberCheckSumUC.a(new j14.l.Params(value, false)));
        } else {
            bVarA = hz.b.C2039b.f86846c;
        }
        return e1.d(new Results.a.C4845c(bVarA));
    }

    private final Set<Results.a.d> h(String value) {
        hz.b bVarA;
        if (value.length() > 0) {
            bVarA = hz.b.INSTANCE.a(this.checkPeselNumberCorrectUC.a(new j14.m.Params(value, false)));
        } else {
            bVarA = hz.b.C2039b.f86846c;
        }
        return e1.d(new Results.a.d(bVarA));
    }

    private final Set<Results.a.e> i(String value) {
        hz.b bVarA;
        if (value.length() > 0) {
            bVarA = hz.b.INSTANCE.a(this.checkRegonNumberCorrectUC.a(new j14.q.Params(value, false)));
        } else {
            bVarA = hz.b.C2039b.f86846c;
        }
        return e1.d(new Results.a.e(bVarA));
    }

    public Results b(Params params) {
        Iterable iterableI;
        Set<Params.a> setA = params.a();
        if (fr.t.c(setA, f186741i)) {
            return d();
        }
        if (fr.t.c(setA, f186742j)) {
            return c();
        }
        Set<Params.a> setA2 = params.a();
        ArrayList arrayList = new ArrayList();
        for (Params.a aVar : setA2) {
            if (aVar instanceof Params.a.EuropeanId) {
                iterableI = e(((Params.a.EuropeanId) aVar).getValue());
            } else if (aVar instanceof Params.a.Krs) {
                iterableI = f(((Params.a.Krs) aVar).getValue());
            } else if (aVar instanceof Params.a.Nip) {
                iterableI = g(((Params.a.Nip) aVar).getValue());
            } else if (aVar instanceof Params.a.Pesel) {
                iterableI = h(((Params.a.Pesel) aVar).getValue());
            } else {
                if (!(aVar instanceof Params.a.Regon)) {
                    throw new oq.p();
                }
                iterableI = i(((Params.a.Regon) aVar).getValue());
            }
            pq.v.D(arrayList, iterableI);
        }
        return new Results(arrayList);
    }
}
