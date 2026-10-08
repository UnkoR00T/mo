package t02;

import eo0.EpuapApplicationType;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import p071kotlin.Metadata;
import pq.e1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u001f\u001dB)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00102\u0006\u0010\u000f\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00102\u0006\u0010\u000f\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\"R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010#¨\u0006$"}, d2 = {"Lt02/h;", "Lgz/a;", "Lt02/h$a;", "Lt02/h$b;", "Lmx/c;", "labelProvider", "Lt02/u;", "validateEpuapMessageTitleUseCase", "Lt02/r;", "validateEpuapMessageContentUseCase", "Lt02/p;", "validateEpuapApplicationNameUseCase", "<init>", "(Lmx/c;Lt02/u;Lt02/r;Lt02/p;)V", "Lt02/h$a$a$b;", "param", "", "Lt02/h$b$a$c;", "d", "(Lt02/h$a$a$b;)Ljava/util/Set;", "Lt02/h$a$a$c;", "Lt02/h$b$a$d;", "e", "(Lt02/h$a$a$c;)Ljava/util/Set;", "Lt02/h$a$a$a;", "Lt02/h$b$a;", "c", "(Lt02/h$a$a$a;)Ljava/util/Set;", "params", "b", "(Lt02/h$a;)Lt02/h$b;", "a", "Lmx/c;", "Lt02/u;", "Lt02/r;", "Lt02/p;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h implements gz.a<Params, Results> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final u validateEpuapMessageTitleUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final r validateEpuapMessageContentUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final p validateEpuapApplicationNameUseCase;

    /* JADX INFO: renamed from: t02.h$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lt02/h$a;", "Lgz/b$a;", "", "Lt02/h$a$a;", "values", "<init>", "(Ljava/util/Set;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Set;", "()Ljava/util/Set;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Set<InterfaceC4834a> values;

        /* JADX INFO: renamed from: t02.h$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lt02/h$a$a;", "", "c", "b", "a", "Lt02/h$a$a$a;", "Lt02/h$a$a$b;", "Lt02/h$a$a$c;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface InterfaceC4834a {

            /* JADX INFO: renamed from: t02.h$a$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r¨\u0006\u000e"}, d2 = {"Lt02/h$a$a$a;", "Lt02/h$a$a;", "Leo0/a0;", "type", "", "name", "<init>", "(Leo0/a0;Ljava/lang/String;)V", "a", "Leo0/a0;", "b", "()Leo0/a0;", "Ljava/lang/String;", "()Ljava/lang/String;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class C4835a implements InterfaceC4834a {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final EpuapApplicationType type;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
                private final String name;

                public C4835a(EpuapApplicationType epuapApplicationType, String str) {
                    this.type = epuapApplicationType;
                    this.name = str;
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final String getName() {
                    return this.name;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final EpuapApplicationType getType() {
                    return this.type;
                }
            }

            /* JADX INFO: renamed from: t02.h$a$a$b */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lt02/h$a$a$b;", "Lt02/h$a$a;", "", "value", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class b implements InterfaceC4834a {

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

            /* JADX INFO: renamed from: t02.h$a$a$c */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lt02/h$a$a$c;", "Lt02/h$a$a;", "", "value", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class c implements InterfaceC4834a {

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
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Params(Set<? extends InterfaceC4834a> set) {
            this.values = set;
        }

        public final Set<InterfaceC4834a> a() {
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

    /* JADX INFO: renamed from: t02.h$b, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lt02/h$b;", "", "", "Lt02/h$b$a;", "values", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Results {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<a> values;

        /* JADX INFO: renamed from: t02.h$b$a */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0006\u0007\b\tR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0004\n\u000b\f\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lt02/h$b$a;", "", "Lhz/b;", "getValue", "()Lhz/b;", "value", "d", "c", "b", "a", "Lt02/h$b$a$a;", "Lt02/h$b$a$b;", "Lt02/h$b$a$c;", "Lt02/h$b$a$d;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface a {

            /* JADX INFO: renamed from: t02.h$b$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lt02/h$b$a$a;", "Lt02/h$b$a;", "Lhz/b;", "value", "<init>", "(Lhz/b;)V", "a", "Lhz/b;", "getValue", "()Lhz/b;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class C4836a implements a {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public static final int f186638b = hz.b.f86845b;

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final hz.b value;

                public C4836a(hz.b bVar) {
                    this.value = bVar;
                }

                @Override // t02.h.Results.a
                public hz.b getValue() {
                    return this.value;
                }
            }

            /* JADX INFO: renamed from: t02.h$b$a$b, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lt02/h$b$a$b;", "Lt02/h$b$a;", "Lhz/b;", "value", "<init>", "(Lhz/b;)V", "a", "Lhz/b;", "getValue", "()Lhz/b;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class C4837b implements a {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public static final int f186640b = hz.b.f86845b;

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final hz.b value;

                public C4837b(hz.b bVar) {
                    this.value = bVar;
                }

                @Override // t02.h.Results.a
                public hz.b getValue() {
                    return this.value;
                }
            }

            /* JADX INFO: renamed from: t02.h$b$a$c */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lt02/h$b$a$c;", "Lt02/h$b$a;", "Lhz/b;", "value", "<init>", "(Lhz/b;)V", "a", "Lhz/b;", "getValue", "()Lhz/b;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class c implements a {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public static final int f186642b = hz.b.f86845b;

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final hz.b value;

                public c(hz.b bVar) {
                    this.value = bVar;
                }

                @Override // t02.h.Results.a
                public hz.b getValue() {
                    return this.value;
                }
            }

            /* JADX INFO: renamed from: t02.h$b$a$d */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lt02/h$b$a$d;", "Lt02/h$b$a;", "Lhz/b;", "value", "<init>", "(Lhz/b;)V", "a", "Lhz/b;", "getValue", "()Lhz/b;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class d implements a {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public static final int f186644b = hz.b.f86845b;

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final hz.b value;

                public d(hz.b bVar) {
                    this.value = bVar;
                }

                @Override // t02.h.Results.a
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

    public h(mx.c cVar, u uVar, r rVar, p pVar) {
        this.labelProvider = cVar;
        this.validateEpuapMessageTitleUseCase = uVar;
        this.validateEpuapMessageContentUseCase = rVar;
        this.validateEpuapApplicationNameUseCase = pVar;
    }

    private final Set<Results.a> c(Params.InterfaceC4834a.C4835a param) {
        if (param.getType() == null) {
            return e1.i(new Results.a.C4837b(new hz.b.Invalid(this.labelProvider.c(e02.a.E3))), new Results.a.C4836a(hz.b.C2039b.f86846c));
        }
        EpuapApplicationType.a code = param.getType().getCode();
        EpuapApplicationType.a aVar = EpuapApplicationType.a.OTHER;
        if (code != aVar) {
            return e1.i(new Results.a.C4837b(hz.b.d.f86848c), new Results.a.C4836a(hz.b.C2039b.f86846c));
        }
        if (param.getType().getCode() == aVar && param.getName() != null) {
            return e1.i(new Results.a.C4837b(hz.b.d.f86848c), new Results.a.C4836a(hz.b.INSTANCE.a(this.validateEpuapApplicationNameUseCase.d(p.b.a(param.getName())))));
        }
        hz.b.C2039b c2039b = hz.b.C2039b.f86846c;
        return e1.i(new Results.a.C4837b(c2039b), new Results.a.C4836a(c2039b));
    }

    private final Set<Results.a.c> d(Params.InterfaceC4834a.b param) {
        return e1.d(new Results.a.c(hz.b.INSTANCE.a(this.validateEpuapMessageContentUseCase.d(r.b.a(param.getValue())))));
    }

    private final Set<Results.a.d> e(Params.InterfaceC4834a.c param) {
        return e1.d(new Results.a.d(hz.b.INSTANCE.a(this.validateEpuapMessageTitleUseCase.g(u.c.a(param.getValue())))));
    }

    public Results b(Params params) {
        Set<Results.a> setC;
        Set<Params.InterfaceC4834a> setA = params.a();
        ArrayList arrayList = new ArrayList();
        for (Params.InterfaceC4834a interfaceC4834a : setA) {
            if (interfaceC4834a instanceof Params.InterfaceC4834a.c) {
                setC = e((Params.InterfaceC4834a.c) interfaceC4834a);
            } else if (interfaceC4834a instanceof Params.InterfaceC4834a.b) {
                setC = d((Params.InterfaceC4834a.b) interfaceC4834a);
            } else {
                if (!(interfaceC4834a instanceof Params.InterfaceC4834a.C4835a)) {
                    throw new oq.p();
                }
                setC = c((Params.InterfaceC4834a.C4835a) interfaceC4834a);
            }
            pq.v.D(arrayList, setC);
        }
        return new Results(arrayList);
    }
}
