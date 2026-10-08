package m02;

import fr.k;
import fr.t;
import java.util.Map;
import oq.y;
import p071kotlin.Metadata;
import pq.v0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\t\n\u0006\u000b\fR(\u0010\b\u001a\u0016\u0012\u0006\b\u0001\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0005\r\u000e\u000f\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lm02/b;", "", "", "Lm02/a;", "Lm02/e;", "", "a", "()Ljava/util/Map;", "map", "e", "d", "b", "c", "Lm02/b$a;", "Lm02/b$b;", "Lm02/b$c;", "Lm02/b$d;", "Lm02/b$e;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {
    Map<? extends a, Field<String>> a();

    /* JADX INFO: renamed from: m02.b$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002¢\u0006\u0004\b\u0007\u0010\bJ,\u0010\t\u001a\u00020\u00002\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R,\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lm02/b$a;", "Lm02/b;", "", "Lm02/a;", "Lm02/e;", "", "map", "<init>", "(Ljava/util/Map;)V", "b", "(Ljava/util/Map;)Lm02/b$a;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Map;", "()Ljava/util/Map;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BailiffAddress implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Map<a, Field<String>> map;

        public BailiffAddress(Map<a, Field<String>> map) {
            this.map = map;
        }

        @Override // m02.b
        public Map<a, Field<String>> a() {
            return this.map;
        }

        public final BailiffAddress b(Map<a, Field<String>> map) {
            return new BailiffAddress(map);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof BailiffAddress) && t.c(this.map, ((BailiffAddress) other).map);
        }

        public int hashCode() {
            return this.map.hashCode();
        }

        public String toString() {
            return "BailiffAddress(map=" + this.map + ')';
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ BailiffAddress(Map map, int i15, k kVar) {
            if ((i15 & 1) != 0) {
                a.EnumC2987a enumC2987a = a.EnumC2987a.NAME;
                hz.b.C2039b c2039b = hz.b.C2039b.f86846c;
                map = v0.l(y.a(enumC2987a, new Field("", c2039b)), y.a(a.EnumC2987a.SURNAME, new Field("", c2039b)), y.a(a.EnumC2987a.CITY, new Field("", c2039b)), y.a(a.EnumC2987a.STREET, new Field("", c2039b)), y.a(a.EnumC2987a.BUILDING_NUMBER, new Field("", c2039b)), y.a(a.EnumC2987a.APARTMENT_NUMBER, new Field("", c2039b)), y.a(a.EnumC2987a.POSTCODE, new Field("", c2039b)), y.a(a.EnumC2987a.COUNTRY, new Field("POLSKA", c2039b)));
            }
            this(map);
        }
    }

    /* JADX INFO: renamed from: m02.b$b, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002¢\u0006\u0004\b\u0007\u0010\bJ,\u0010\t\u001a\u00020\u00002\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R,\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lm02/b$b;", "Lm02/b;", "", "Lm02/a;", "Lm02/e;", "", "map", "<init>", "(Ljava/util/Map;)V", "b", "(Ljava/util/Map;)Lm02/b$b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Map;", "()Ljava/util/Map;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BailiffIdentifier implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Map<a, Field<String>> map;

        public BailiffIdentifier(Map<a, Field<String>> map) {
            this.map = map;
        }

        @Override // m02.b
        public Map<a, Field<String>> a() {
            return this.map;
        }

        public final BailiffIdentifier b(Map<a, Field<String>> map) {
            return new BailiffIdentifier(map);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof BailiffIdentifier) && t.c(this.map, ((BailiffIdentifier) other).map);
        }

        public int hashCode() {
            return this.map.hashCode();
        }

        public String toString() {
            return "BailiffIdentifier(map=" + this.map + ')';
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ BailiffIdentifier(Map map, int i15, k kVar) {
            if ((i15 & 1) != 0) {
                a.c cVar = a.c.NIP;
                hz.b.C2039b c2039b = hz.b.C2039b.f86846c;
                map = v0.l(y.a(cVar, new Field("", c2039b)), y.a(a.c.REGON, new Field("", c2039b)));
            }
            this(map);
        }
    }

    /* JADX INFO: renamed from: m02.b$c, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002¢\u0006\u0004\b\u0007\u0010\bJ,\u0010\t\u001a\u00020\u00002\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R,\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lm02/b$c;", "Lm02/b;", "", "Lm02/a;", "Lm02/e;", "", "map", "<init>", "(Ljava/util/Map;)V", "b", "(Ljava/util/Map;)Lm02/b$c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Map;", "()Ljava/util/Map;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BailiffNames implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Map<a, Field<String>> map;

        public BailiffNames(Map<a, Field<String>> map) {
            this.map = map;
        }

        @Override // m02.b
        public Map<a, Field<String>> a() {
            return this.map;
        }

        public final BailiffNames b(Map<a, Field<String>> map) {
            return new BailiffNames(map);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof BailiffNames) && t.c(this.map, ((BailiffNames) other).map);
        }

        public int hashCode() {
            return this.map.hashCode();
        }

        public String toString() {
            return "BailiffNames(map=" + this.map + ')';
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ BailiffNames(Map map, int i15, k kVar) {
            if ((i15 & 1) != 0) {
                a.d dVar = a.d.NAME;
                hz.b.C2039b c2039b = hz.b.C2039b.f86846c;
                map = v0.l(y.a(dVar, new Field("", c2039b)), y.a(a.d.SURNAME, new Field("", c2039b)));
            }
            this(map);
        }
    }

    /* JADX INFO: renamed from: m02.b$d, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002¢\u0006\u0004\b\u0007\u0010\bJ,\u0010\t\u001a\u00020\u00002\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R,\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lm02/b$d;", "Lm02/b;", "", "Lm02/a;", "Lm02/e;", "", "map", "<init>", "(Ljava/util/Map;)V", "b", "(Ljava/util/Map;)Lm02/b$d;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Map;", "()Ljava/util/Map;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PublicAddress implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Map<a, Field<String>> map;

        public PublicAddress(Map<a, Field<String>> map) {
            this.map = map;
        }

        @Override // m02.b
        public Map<a, Field<String>> a() {
            return this.map;
        }

        public final PublicAddress b(Map<a, Field<String>> map) {
            return new PublicAddress(map);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PublicAddress) && t.c(this.map, ((PublicAddress) other).map);
        }

        public int hashCode() {
            return this.map.hashCode();
        }

        public String toString() {
            return "PublicAddress(map=" + this.map + ')';
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ PublicAddress(Map map, int i15, k kVar) {
            if ((i15 & 1) != 0) {
                a.EnumC2987a enumC2987a = a.EnumC2987a.PUBLIC_NAME;
                hz.b.C2039b c2039b = hz.b.C2039b.f86846c;
                map = v0.l(y.a(enumC2987a, new Field("", c2039b)), y.a(a.EnumC2987a.CITY, new Field("", c2039b)), y.a(a.EnumC2987a.STREET, new Field("", c2039b)), y.a(a.EnumC2987a.BUILDING_NUMBER, new Field("", c2039b)), y.a(a.EnumC2987a.APARTMENT_NUMBER, new Field("", c2039b)), y.a(a.EnumC2987a.POSTCODE, new Field("", c2039b)), y.a(a.EnumC2987a.COUNTRY, new Field("POLSKA", c2039b)));
            }
            this(map);
        }
    }

    /* JADX INFO: renamed from: m02.b$e, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002¢\u0006\u0004\b\u0007\u0010\bJ,\u0010\t\u001a\u00020\u00002\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R,\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lm02/b$e;", "Lm02/b;", "", "Lm02/a;", "Lm02/e;", "", "map", "<init>", "(Ljava/util/Map;)V", "b", "(Ljava/util/Map;)Lm02/b$e;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Map;", "()Ljava/util/Map;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PublicIdentifier implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Map<a, Field<String>> map;

        public PublicIdentifier(Map<a, Field<String>> map) {
            this.map = map;
        }

        @Override // m02.b
        public Map<a, Field<String>> a() {
            return this.map;
        }

        public final PublicIdentifier b(Map<a, Field<String>> map) {
            return new PublicIdentifier(map);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PublicIdentifier) && t.c(this.map, ((PublicIdentifier) other).map);
        }

        public int hashCode() {
            return this.map.hashCode();
        }

        public String toString() {
            return "PublicIdentifier(map=" + this.map + ')';
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ PublicIdentifier(Map map, int i15, k kVar) {
            if ((i15 & 1) != 0) {
                a.c cVar = a.c.PESEL;
                hz.b.C2039b c2039b = hz.b.C2039b.f86846c;
                map = v0.l(y.a(cVar, new Field("", c2039b)), y.a(a.c.NIP, new Field("", c2039b)), y.a(a.c.REGON, new Field("", c2039b)), y.a(a.c.KRS, new Field("", c2039b)), y.a(a.c.EUROPEAN_ID, new Field("", c2039b)));
            }
            this(map);
        }
    }
}
