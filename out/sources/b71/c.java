package b71;

import fr.k;
import fr.t;
import i61.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p071kotlin.Metadata;
import pq.v;
import wx.i;
import wx.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0001\u0012J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H&¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013À\u0006\u0003"}, d2 = {"Lb71/c;", "", "Lb71/b;", "attachmentType", "Lb71/c$a;", "attachmentsData", "Loq/i0;", "b2", "(Lb71/b;Lb71/c$a;)V", "K7", "(Lb71/b;)Lb71/c$a;", "d6", "(Lb71/b;)V", "Li61/h;", "C0", "()Li61/h;", "h1", "()V", "a", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c {
    h C0();

    AttachmentsData K7(b attachmentType);

    void b2(b attachmentType, AttachmentsData attachmentsData);

    void d6(b attachmentType);

    void h1();

    /* JADX INFO: renamed from: b71.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u000bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lb71/c$a;", "", "", "Lwx/i;", "pickedFiles", "", "isStatementChecked", "<init>", "(Ljava/util/List;Ljava/lang/Boolean;)V", "", "c", "()Ljava/util/List;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AttachmentsData {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<i> pickedFiles;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Boolean isStatementChecked;

        /* JADX WARN: Multi-variable type inference failed */
        public AttachmentsData(List<? extends i> list, Boolean bool) {
            this.pickedFiles = list;
            this.isStatementChecked = bool;
        }

        public final List<i> a() {
            return this.pickedFiles;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Boolean getIsStatementChecked() {
            return this.isStatementChecked;
        }

        public final List<String> c() {
            List<i> list = this.pickedFiles;
            ArrayList arrayList = new ArrayList(v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(j.a((i) it.next()));
            }
            return arrayList;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AttachmentsData)) {
                return false;
            }
            AttachmentsData attachmentsData = (AttachmentsData) other;
            return t.c(this.pickedFiles, attachmentsData.pickedFiles) && t.c(this.isStatementChecked, attachmentsData.isStatementChecked);
        }

        public int hashCode() {
            int iHashCode = this.pickedFiles.hashCode() * 31;
            Boolean bool = this.isStatementChecked;
            return iHashCode + (bool == null ? 0 : bool.hashCode());
        }

        public String toString() {
            return "AttachmentsData(pickedFiles=" + this.pickedFiles + ", isStatementChecked=" + this.isStatementChecked + ')';
        }

        public /* synthetic */ AttachmentsData(List list, Boolean bool, int i15, k kVar) {
            this(list, (i15 & 2) != 0 ? null : bool);
        }
    }
}
