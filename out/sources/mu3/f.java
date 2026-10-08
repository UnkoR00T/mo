package mu3;

import java.util.List;
import ju3.ChildData;
import ju3.ChooseChildData;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lmu3/f;", "", "a", "Lmu3/f$a;", "choosechild_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface f {

    /* JADX INFO: renamed from: mu3.f$a, reason: from toString */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"Lmu3/f$a;", "Lmu3/f;", "", "Lju3/a;", "childrenData", "Lju3/b;", "chooseChildData", "<init>", "(Ljava/util/List;Lju3/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Lju3/b;", "()Lju3/b;", "choosechild_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initialized implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<ChildData> childrenData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final ChooseChildData chooseChildData;

        public Initialized(List<ChildData> list, ChooseChildData chooseChildData) {
            this.childrenData = list;
            this.chooseChildData = chooseChildData;
        }

        public final List<ChildData> a() {
            return this.childrenData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final ChooseChildData getChooseChildData() {
            return this.chooseChildData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Initialized)) {
                return false;
            }
            Initialized initialized = (Initialized) other;
            return fr.t.c(this.childrenData, initialized.childrenData) && fr.t.c(this.chooseChildData, initialized.chooseChildData);
        }

        public int hashCode() {
            return (this.childrenData.hashCode() * 31) + this.chooseChildData.hashCode();
        }

        public String toString() {
            return "Initialized(childrenData=" + this.childrenData + ", chooseChildData=" + this.chooseChildData + ')';
        }
    }
}
