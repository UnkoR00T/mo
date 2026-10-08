package t02;

import eo0.CountryDictionary;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import p071kotlin.Metadata;
import pq.e1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u000242BQ\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001f\u0010\u001dJ\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b!\u0010\u001dJ\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b#\u0010\u001dJ\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b%\u0010\u001dJ\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b'\u0010\u001dJ\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b)\u0010\u001dJ'\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u001a2\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010+\u001a\u0004\u0018\u00010*H\u0002¢\u0006\u0004\b-\u0010.J\u001d\u00100\u001a\b\u0012\u0004\u0012\u00020/0\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b0\u0010\u001dJ\u0018\u00102\u001a\u00020\u00032\u0006\u00101\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b2\u00103R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00106R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u00107R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u00108R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u00109R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010:R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010;R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010<R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010=¨\u0006>"}, d2 = {"Lt02/j;", "Lgz/a;", "Lt02/j$a;", "Lt02/j$b;", "Lt02/b0;", "validatePublicNameUC", "Lt02/m;", "validateCityUC", "Lt02/l;", "validateBuildingNumberUC", "Lt02/k;", "validateApartmentNumberUC", "Lt02/f0;", "validateStreetUC", "Lt02/z;", "validatePostalCode", "Lt02/n;", "validateCountry", "Lt02/x;", "validateNameUC", "Lt02/g0;", "validateSurnameUC", "<init>", "(Lt02/b0;Lt02/m;Lt02/l;Lt02/k;Lt02/f0;Lt02/z;Lt02/n;Lt02/x;Lt02/g0;)V", "", "value", "", "Lt02/j$b$a$e;", "g", "(Ljava/lang/String;)Ljava/util/Set;", "Lt02/j$b$a$i;", "k", "Lt02/j$b$a$a;", "c", "Lt02/j$b$a$b;", "d", "Lt02/j$b$a$c;", "e", "Lt02/j$b$a$d;", "f", "Lt02/j$b$a$g;", "i", "Leo0/l;", "countryDictionary", "Lt02/j$b$a$f;", "h", "(Ljava/lang/String;Leo0/l;)Ljava/util/Set;", "Lt02/j$b$a$h;", "j", "params", "b", "(Lt02/j$a;)Lt02/j$b;", "a", "Lt02/b0;", "Lt02/m;", "Lt02/l;", "Lt02/k;", "Lt02/f0;", "Lt02/z;", "Lt02/n;", "Lt02/x;", "Lt02/g0;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j implements gz.a<Params, Results> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b0 validatePublicNameUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final m validateCityUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final l validateBuildingNumberUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final k validateApartmentNumberUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final f0 validateStreetUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final z validatePostalCode;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final n validateCountry;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final x validateNameUC;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final g0 validateSurnameUC;

    /* JADX INFO: renamed from: t02.j$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lt02/j$a;", "Lgz/b$a;", "", "Lt02/j$a$a;", "values", "<init>", "(Ljava/util/Set;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Set;", "()Ljava/util/Set;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Set<InterfaceC4838a> values;

        /* JADX INFO: renamed from: t02.j$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014À\u0006\u0003"}, d2 = {"Lt02/j$a$a;", "", "g", "e", "i", "c", "b", "a", "h", "f", "d", "Lt02/j$a$a$a;", "Lt02/j$a$a$b;", "Lt02/j$a$a$c;", "Lt02/j$a$a$d;", "Lt02/j$a$a$e;", "Lt02/j$a$a$f;", "Lt02/j$a$a$g;", "Lt02/j$a$a$h;", "Lt02/j$a$a$i;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface InterfaceC4838a {

            /* JADX INFO: renamed from: t02.j$a$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lt02/j$a$a$a;", "Lt02/j$a$a;", "", "value", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class C4839a implements InterfaceC4838a {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final String value;

                public C4839a(String str) {
                    this.value = str;
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final String getValue() {
                    return this.value;
                }
            }

            /* JADX INFO: renamed from: t02.j$a$a$b */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lt02/j$a$a$b;", "Lt02/j$a$a;", "", "value", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class b implements InterfaceC4838a {

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

            /* JADX INFO: renamed from: t02.j$a$a$c */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lt02/j$a$a$c;", "Lt02/j$a$a;", "", "value", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class c implements InterfaceC4838a {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final String value;

                public c(String str) {
                    this.value = str;
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final String getValue() {
                    return this.value;
                }
            }

            /* JADX INFO: renamed from: t02.j$a$a$d */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lt02/j$a$a$d;", "Lt02/j$a$a;", "", "value", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class d implements InterfaceC4838a {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final String value;

                public d(String str) {
                    this.value = str;
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final String getValue() {
                    return this.value;
                }
            }

            /* JADX INFO: renamed from: t02.j$a$a$e */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lt02/j$a$a$e;", "Lt02/j$a$a;", "", "value", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class e implements InterfaceC4838a {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final String value;

                public e(String str) {
                    this.value = str;
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final String getValue() {
                    return this.value;
                }
            }

            /* JADX INFO: renamed from: t02.j$a$a$f */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r¨\u0006\u000e"}, d2 = {"Lt02/j$a$a$f;", "Lt02/j$a$a;", "", "value", "Leo0/l;", "countryDictionary", "<init>", "(Ljava/lang/String;Leo0/l;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Leo0/l;", "()Leo0/l;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class f implements InterfaceC4838a {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final String value;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
                private final CountryDictionary countryDictionary;

                public f(String str, CountryDictionary countryDictionary) {
                    this.value = str;
                    this.countryDictionary = countryDictionary;
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final CountryDictionary getCountryDictionary() {
                    return this.countryDictionary;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final String getValue() {
                    return this.value;
                }
            }

            /* JADX INFO: renamed from: t02.j$a$a$g */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lt02/j$a$a$g;", "Lt02/j$a$a;", "", "value", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class g implements InterfaceC4838a {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final String value;

                public g(String str) {
                    this.value = str;
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final String getValue() {
                    return this.value;
                }
            }

            /* JADX INFO: renamed from: t02.j$a$a$h */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lt02/j$a$a$h;", "Lt02/j$a$a;", "", "value", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class h implements InterfaceC4838a {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final String value;

                public h(String str) {
                    this.value = str;
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final String getValue() {
                    return this.value;
                }
            }

            /* JADX INFO: renamed from: t02.j$a$a$i */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lt02/j$a$a$i;", "Lt02/j$a$a;", "", "value", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class i implements InterfaceC4838a {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final String value;

                public i(String str) {
                    this.value = str;
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final String getValue() {
                    return this.value;
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Params(Set<? extends InterfaceC4838a> set) {
            this.values = set;
        }

        public final Set<InterfaceC4838a> a() {
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

    /* JADX INFO: renamed from: t02.j$b, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lt02/j$b;", "", "", "Lt02/j$b$a;", "values", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Results {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<a> values;

        /* JADX INFO: renamed from: t02.j$b$a */
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\t\u0006\u0007\b\t\n\u000b\f\r\u000eR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\t\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018À\u0006\u0003"}, d2 = {"Lt02/j$b$a;", "", "Lhz/b;", "getValue", "()Lhz/b;", "value", "g", "e", "i", "c", "b", "a", "h", "f", "d", "Lt02/j$b$a$a;", "Lt02/j$b$a$b;", "Lt02/j$b$a$c;", "Lt02/j$b$a$d;", "Lt02/j$b$a$e;", "Lt02/j$b$a$f;", "Lt02/j$b$a$g;", "Lt02/j$b$a$h;", "Lt02/j$b$a$i;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface a {

            /* JADX INFO: renamed from: t02.j$b$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lt02/j$b$a$a;", "Lt02/j$b$a;", "Lhz/b;", "value", "<init>", "(Lhz/b;)V", "a", "Lhz/b;", "getValue", "()Lhz/b;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class C4840a implements a {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public static final int f186676b = hz.b.f86845b;

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final hz.b value;

                public C4840a(hz.b bVar) {
                    this.value = bVar;
                }

                @Override // t02.j.Results.a
                public hz.b getValue() {
                    return this.value;
                }
            }

            /* JADX INFO: renamed from: t02.j$b$a$b, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lt02/j$b$a$b;", "Lt02/j$b$a;", "Lhz/b;", "value", "<init>", "(Lhz/b;)V", "a", "Lhz/b;", "getValue", "()Lhz/b;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class C4841b implements a {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public static final int f186678b = hz.b.f86845b;

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final hz.b value;

                public C4841b(hz.b bVar) {
                    this.value = bVar;
                }

                @Override // t02.j.Results.a
                public hz.b getValue() {
                    return this.value;
                }
            }

            /* JADX INFO: renamed from: t02.j$b$a$c */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lt02/j$b$a$c;", "Lt02/j$b$a;", "Lhz/b;", "value", "<init>", "(Lhz/b;)V", "a", "Lhz/b;", "getValue", "()Lhz/b;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class c implements a {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public static final int f186680b = hz.b.f86845b;

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final hz.b value;

                public c(hz.b bVar) {
                    this.value = bVar;
                }

                @Override // t02.j.Results.a
                public hz.b getValue() {
                    return this.value;
                }
            }

            /* JADX INFO: renamed from: t02.j$b$a$d */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lt02/j$b$a$d;", "Lt02/j$b$a;", "Lhz/b;", "value", "<init>", "(Lhz/b;)V", "a", "Lhz/b;", "getValue", "()Lhz/b;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class d implements a {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public static final int f186682b = hz.b.f86845b;

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final hz.b value;

                public d(hz.b bVar) {
                    this.value = bVar;
                }

                @Override // t02.j.Results.a
                public hz.b getValue() {
                    return this.value;
                }
            }

            /* JADX INFO: renamed from: t02.j$b$a$e */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lt02/j$b$a$e;", "Lt02/j$b$a;", "Lhz/b;", "value", "<init>", "(Lhz/b;)V", "a", "Lhz/b;", "getValue", "()Lhz/b;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class e implements a {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public static final int f186684b = hz.b.f86845b;

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final hz.b value;

                public e(hz.b bVar) {
                    this.value = bVar;
                }

                @Override // t02.j.Results.a
                public hz.b getValue() {
                    return this.value;
                }
            }

            /* JADX INFO: renamed from: t02.j$b$a$f */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lt02/j$b$a$f;", "Lt02/j$b$a;", "Lhz/b;", "value", "<init>", "(Lhz/b;)V", "a", "Lhz/b;", "getValue", "()Lhz/b;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class f implements a {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public static final int f186686b = hz.b.f86845b;

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final hz.b value;

                public f(hz.b bVar) {
                    this.value = bVar;
                }

                @Override // t02.j.Results.a
                public hz.b getValue() {
                    return this.value;
                }
            }

            /* JADX INFO: renamed from: t02.j$b$a$g */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lt02/j$b$a$g;", "Lt02/j$b$a;", "Lhz/b;", "value", "<init>", "(Lhz/b;)V", "a", "Lhz/b;", "getValue", "()Lhz/b;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class g implements a {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public static final int f186688b = hz.b.f86845b;

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final hz.b value;

                public g(hz.b bVar) {
                    this.value = bVar;
                }

                @Override // t02.j.Results.a
                public hz.b getValue() {
                    return this.value;
                }
            }

            /* JADX INFO: renamed from: t02.j$b$a$h */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lt02/j$b$a$h;", "Lt02/j$b$a;", "Lhz/b;", "value", "<init>", "(Lhz/b;)V", "a", "Lhz/b;", "getValue", "()Lhz/b;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class h implements a {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public static final int f186690b = hz.b.f86845b;

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final hz.b value;

                public h(hz.b bVar) {
                    this.value = bVar;
                }

                @Override // t02.j.Results.a
                public hz.b getValue() {
                    return this.value;
                }
            }

            /* JADX INFO: renamed from: t02.j$b$a$i */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lt02/j$b$a$i;", "Lt02/j$b$a;", "Lhz/b;", "value", "<init>", "(Lhz/b;)V", "a", "Lhz/b;", "getValue", "()Lhz/b;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class i implements a {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public static final int f186692b = hz.b.f86845b;

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final hz.b value;

                public i(hz.b bVar) {
                    this.value = bVar;
                }

                @Override // t02.j.Results.a
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

    public j(b0 b0Var, m mVar, l lVar, k kVar, f0 f0Var, z zVar, n nVar, x xVar, g0 g0Var) {
        this.validatePublicNameUC = b0Var;
        this.validateCityUC = mVar;
        this.validateBuildingNumberUC = lVar;
        this.validateApartmentNumberUC = kVar;
        this.validateStreetUC = f0Var;
        this.validatePostalCode = zVar;
        this.validateCountry = nVar;
        this.validateNameUC = xVar;
        this.validateSurnameUC = g0Var;
    }

    private final Set<Results.a.C4840a> c(String value) {
        return e1.d(new Results.a.C4840a(hz.b.INSTANCE.a(this.validateApartmentNumberUC.b(new k.Params(value)))));
    }

    private final Set<Results.a.C4841b> d(String value) {
        return e1.d(new Results.a.C4841b(hz.b.INSTANCE.a(this.validateBuildingNumberUC.b(new l.Params(value)))));
    }

    private final Set<Results.a.c> e(String value) {
        return e1.d(new Results.a.c(hz.b.INSTANCE.a(this.validateCityUC.b(new m.Params(value)))));
    }

    private final Set<Results.a.d> f(String value) {
        return e1.d(new Results.a.d(hz.b.INSTANCE.a(this.validateCountry.b(new n.Params(value)))));
    }

    private final Set<Results.a.e> g(String value) {
        return e1.d(new Results.a.e(hz.b.INSTANCE.a(this.validateNameUC.b(new x.Params(value)))));
    }

    private final Set<Results.a.f> h(String value, CountryDictionary countryDictionary) {
        return e1.d(new Results.a.f(hz.b.INSTANCE.a(this.validatePostalCode.b(new z.Params(value, countryDictionary)))));
    }

    private final Set<Results.a.g> i(String value) {
        return e1.d(new Results.a.g(hz.b.INSTANCE.a(this.validatePublicNameUC.e(new b0.Params(value)))));
    }

    private final Set<Results.a.h> j(String value) {
        return e1.d(new Results.a.h(hz.b.INSTANCE.a(this.validateStreetUC.b(new f0.Params(value)))));
    }

    private final Set<Results.a.i> k(String value) {
        return e1.d(new Results.a.i(hz.b.INSTANCE.a(this.validateSurnameUC.b(new g0.Params(value)))));
    }

    public Results b(Params params) {
        Iterable iterableK;
        Set<Params.InterfaceC4838a> setA = params.a();
        ArrayList arrayList = new ArrayList();
        for (Params.InterfaceC4838a interfaceC4838a : setA) {
            if (interfaceC4838a instanceof Params.InterfaceC4838a.C4839a) {
                iterableK = c(((Params.InterfaceC4838a.C4839a) interfaceC4838a).getValue());
            } else if (interfaceC4838a instanceof Params.InterfaceC4838a.b) {
                iterableK = d(((Params.InterfaceC4838a.b) interfaceC4838a).getValue());
            } else if (interfaceC4838a instanceof Params.InterfaceC4838a.c) {
                iterableK = e(((Params.InterfaceC4838a.c) interfaceC4838a).getValue());
            } else if (interfaceC4838a instanceof Params.InterfaceC4838a.d) {
                iterableK = f(((Params.InterfaceC4838a.d) interfaceC4838a).getValue());
            } else if (interfaceC4838a instanceof Params.InterfaceC4838a.g) {
                iterableK = i(((Params.InterfaceC4838a.g) interfaceC4838a).getValue());
            } else if (interfaceC4838a instanceof Params.InterfaceC4838a.f) {
                Params.InterfaceC4838a.f fVar = (Params.InterfaceC4838a.f) interfaceC4838a;
                iterableK = h(fVar.getValue(), fVar.getCountryDictionary());
            } else if (interfaceC4838a instanceof Params.InterfaceC4838a.h) {
                iterableK = j(((Params.InterfaceC4838a.h) interfaceC4838a).getValue());
            } else if (interfaceC4838a instanceof Params.InterfaceC4838a.e) {
                iterableK = g(((Params.InterfaceC4838a.e) interfaceC4838a).getValue());
            } else {
                if (!(interfaceC4838a instanceof Params.InterfaceC4838a.i)) {
                    throw new oq.p();
                }
                iterableK = k(((Params.InterfaceC4838a.i) interfaceC4838a).getValue());
            }
            pq.v.D(arrayList, iterableK);
        }
        return new Results(arrayList);
    }
}
