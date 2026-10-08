package dd3;

import fr.t;
import java.util.List;
import n50.k;
import oq.i0;
import p071kotlin.Metadata;
import q40.IconPageData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Ldd3/a;", "", "a", "b", "Ldd3/a$a;", "Ldd3/a$b;", "userdata_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {

    /* JADX INFO: renamed from: dd3.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R#\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Ldd3/a$a;", "Ldd3/a;", "Lq40/g;", "Loq/i0;", "emptyStateIconPageData", "<init>", "(Lq40/g;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lq40/g;", "()Lq40/g;", "userdata_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Empty implements a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f41055b = IconPageData.f164667h;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final IconPageData<i0, i0> emptyStateIconPageData;

        public Empty(IconPageData<i0, i0> iconPageData) {
            this.emptyStateIconPageData = iconPageData;
        }

        public final IconPageData<i0, i0> a() {
            return this.emptyStateIconPageData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Empty) && t.c(this.emptyStateIconPageData, ((Empty) other).emptyStateIconPageData);
        }

        public int hashCode() {
            return this.emptyStateIconPageData.hashCode();
        }

        public String toString() {
            return "Empty(emptyStateIconPageData=" + this.emptyStateIconPageData + ')';
        }
    }

    /* JADX INFO: renamed from: dd3.a$b, reason: from toString */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019¨\u0006\u001a"}, d2 = {"Ldd3/a$b;", "Ldd3/a;", "", "Ln50/k;", "passportCards", "Lc30/b;", "bottomAlert", "<init>", "(Ljava/util/List;Lc30/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "Lc30/b;", "()Lc30/b;", "userdata_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Passports implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<k> passportCards;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final c30.b bottomAlert;

        /* JADX WARN: Multi-variable type inference failed */
        public Passports(List<? extends k> list, c30.b bVar) {
            this.passportCards = list;
            this.bottomAlert = bVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final c30.b getBottomAlert() {
            return this.bottomAlert;
        }

        public final List<k> b() {
            return this.passportCards;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Passports)) {
                return false;
            }
            Passports passports = (Passports) other;
            return t.c(this.passportCards, passports.passportCards) && t.c(this.bottomAlert, passports.bottomAlert);
        }

        public int hashCode() {
            int iHashCode = this.passportCards.hashCode() * 31;
            c30.b bVar = this.bottomAlert;
            return iHashCode + (bVar == null ? 0 : bVar.hashCode());
        }

        public String toString() {
            return "Passports(passportCards=" + this.passportCards + ", bottomAlert=" + this.bottomAlert + ')';
        }
    }
}
