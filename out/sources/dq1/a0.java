package dq1;

import h30.ButtonData;
import n40.FilePickerData;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Ldq1/a0;", "Ll00/e;", "Ldq1/a0$a;", "a", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a0 extends l00.e<Data> {

    /* JADX INFO: renamed from: dq1.a0$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Ldq1/a0$a;", "", "Ln40/c;", "data", "Lh30/a;", "nextButton", "<init>", "(Ln40/c;Lh30/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ln40/c;", "()Ln40/c;", "b", "Lh30/a;", "()Lh30/a;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f43970c = FilePickerData.f131319k;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final FilePickerData data;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final ButtonData nextButton;

        public Data(FilePickerData filePickerData, ButtonData buttonData) {
            this.data = filePickerData;
            this.nextButton = buttonData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final FilePickerData getData() {
            return this.data;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final ButtonData getNextButton() {
            return this.nextButton;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return fr.t.c(this.data, data.data) && fr.t.c(this.nextButton, data.nextButton);
        }

        public int hashCode() {
            return (this.data.hashCode() * 31) + this.nextButton.hashCode();
        }

        public String toString() {
            return "Data(data=" + this.data + ", nextButton=" + this.nextButton + ')';
        }
    }
}
