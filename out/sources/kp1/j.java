package kp1;

import d30.BadgeData;
import fr.t;
import i30.ButtonIconData;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lkp1/j;", "Ll00/e;", "Lkp1/j$a;", "a", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface j extends l00.e<Data> {

    /* JADX INFO: renamed from: kp1.j$a, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0017\u0010\u0016R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0018\u0010\u0016¨\u0006\u0019"}, d2 = {"Lkp1/j$a;", "", "Ld30/a;", "Ld40/b$b;", "firstBadge", "secondBadge", "Li30/a;", "thirdBadge", "<init>", "(Ld30/a;Ld30/a;Ld30/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ld30/a;", "()Ld30/a;", "b", "c", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f112152d;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BadgeData<d40.b.C0864b> firstBadge;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final BadgeData<d40.b.C0864b> secondBadge;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final BadgeData<ButtonIconData> thirdBadge;

        static {
            int i15 = ButtonIconData.f88935g;
            int i16 = BadgeData.f39532d;
            int i17 = d40.b.C0864b.f39687h;
            f112152d = i15 | i16 | i17 | i16 | i17 | i16;
        }

        public Data(BadgeData<d40.b.C0864b> badgeData, BadgeData<d40.b.C0864b> badgeData2, BadgeData<ButtonIconData> badgeData3) {
            this.firstBadge = badgeData;
            this.secondBadge = badgeData2;
            this.thirdBadge = badgeData3;
        }

        public final BadgeData<d40.b.C0864b> a() {
            return this.firstBadge;
        }

        public final BadgeData<d40.b.C0864b> b() {
            return this.secondBadge;
        }

        public final BadgeData<ButtonIconData> c() {
            return this.thirdBadge;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return t.c(this.firstBadge, data.firstBadge) && t.c(this.secondBadge, data.secondBadge) && t.c(this.thirdBadge, data.thirdBadge);
        }

        public int hashCode() {
            return (((this.firstBadge.hashCode() * 31) + this.secondBadge.hashCode()) * 31) + this.thirdBadge.hashCode();
        }

        public String toString() {
            return "Data(firstBadge=" + this.firstBadge + ", secondBadge=" + this.secondBadge + ", thirdBadge=" + this.thirdBadge + ')';
        }
    }
}
