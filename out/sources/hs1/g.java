package hs1;

import h30.ButtonData;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lhs1/g;", "Ll00/e;", "Lhs1/g$a;", "a", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface g extends l00.e<Data> {

    /* JADX INFO: renamed from: hs1.g$a, reason: from toString */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u0017\u0010\u001b¨\u0006\u001c"}, d2 = {"Lhs1/g$a;", "", "Lv50/c$g;", "firstInputData", "secondInputData", "Lh30/a;", "saveAdHocButton", "nextButton", "<init>", "(Lv50/c$g;Lv50/c$g;Lh30/a;Lh30/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lv50/c$g;", "()Lv50/c$g;", "b", "d", "c", "Lh30/a;", "()Lh30/a;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f86478e = v50.c.Text.P;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final v50.c.Text firstInputData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final v50.c.Text secondInputData;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final ButtonData saveAdHocButton;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final ButtonData nextButton;

        public Data(v50.c.Text text, v50.c.Text text2, ButtonData buttonData, ButtonData buttonData2) {
            this.firstInputData = text;
            this.secondInputData = text2;
            this.saveAdHocButton = buttonData;
            this.nextButton = buttonData2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final v50.c.Text getFirstInputData() {
            return this.firstInputData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final ButtonData getNextButton() {
            return this.nextButton;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final ButtonData getSaveAdHocButton() {
            return this.saveAdHocButton;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final v50.c.Text getSecondInputData() {
            return this.secondInputData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return fr.t.c(this.firstInputData, data.firstInputData) && fr.t.c(this.secondInputData, data.secondInputData) && fr.t.c(this.saveAdHocButton, data.saveAdHocButton) && fr.t.c(this.nextButton, data.nextButton);
        }

        public int hashCode() {
            return (((((this.firstInputData.hashCode() * 31) + this.secondInputData.hashCode()) * 31) + this.saveAdHocButton.hashCode()) * 31) + this.nextButton.hashCode();
        }

        public String toString() {
            return "Data(firstInputData=" + this.firstInputData + ", secondInputData=" + this.secondInputData + ", saveAdHocButton=" + this.saveAdHocButton + ", nextButton=" + this.nextButton + ')';
        }
    }
}
