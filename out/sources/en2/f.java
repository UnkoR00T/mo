package en2;

import fr.t;
import i50.BaseScaffoldData;
import n50.DefaultSingleCardData;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Len2/f;", "Ll00/e;", "Len2/f$a;", "a", "networksecurityissues_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface f extends l00.e<Data> {

    /* JADX INFO: renamed from: en2.f$a, reason: from toString */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"Len2/f$a;", "", "Ln50/g;", "fraudsAndCyberattacksCardData", "illegalContentCardData", "Li50/a;", "scaffoldData", "<init>", "(Ln50/g;Ln50/g;Li50/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ln50/g;", "()Ln50/g;", "b", "c", "Li50/a;", "()Li50/a;", "networksecurityissues_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f52096d = BaseScaffoldData.f89350g;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final DefaultSingleCardData fraudsAndCyberattacksCardData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final DefaultSingleCardData illegalContentCardData;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final BaseScaffoldData scaffoldData;

        public Data(DefaultSingleCardData defaultSingleCardData, DefaultSingleCardData defaultSingleCardData2, BaseScaffoldData baseScaffoldData) {
            this.fraudsAndCyberattacksCardData = defaultSingleCardData;
            this.illegalContentCardData = defaultSingleCardData2;
            this.scaffoldData = baseScaffoldData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final DefaultSingleCardData getFraudsAndCyberattacksCardData() {
            return this.fraudsAndCyberattacksCardData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final DefaultSingleCardData getIllegalContentCardData() {
            return this.illegalContentCardData;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final BaseScaffoldData getScaffoldData() {
            return this.scaffoldData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return t.c(this.fraudsAndCyberattacksCardData, data.fraudsAndCyberattacksCardData) && t.c(this.illegalContentCardData, data.illegalContentCardData) && t.c(this.scaffoldData, data.scaffoldData);
        }

        public int hashCode() {
            return (((this.fraudsAndCyberattacksCardData.hashCode() * 31) + this.illegalContentCardData.hashCode()) * 31) + this.scaffoldData.hashCode();
        }

        public String toString() {
            return "Data(fraudsAndCyberattacksCardData=" + this.fraudsAndCyberattacksCardData + ", illegalContentCardData=" + this.illegalContentCardData + ", scaffoldData=" + this.scaffoldData + ')';
        }
    }
}
