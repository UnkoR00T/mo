package an2;

import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import mx.Label;
import p071kotlin.Metadata;
import t50.TextAreaData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lan2/c;", "Ll00/e;", "Lan2/c$a;", "a", "networksecurityissues_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c extends l00.e<Data> {

    /* JADX INFO: renamed from: an2.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b\u001c\u0010!¨\u0006\""}, d2 = {"Lan2/c$a;", "", "Li50/a;", "baseScaffoldData", "Lmx/a;", "contentHeader", "Lh30/a;", "nextButtonData", "Lt50/d;", "inputTextData", "<init>", "(Li50/a;Lmx/a;Lh30/a;Lt50/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "()Li50/a;", "b", "Lmx/a;", "()Lmx/a;", "c", "Lh30/a;", "d", "()Lh30/a;", "Lt50/d;", "()Lt50/d;", "networksecurityissues_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f7959e = TextAreaData.f187694o | BaseScaffoldData.f89350g;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BaseScaffoldData baseScaffoldData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label contentHeader;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final ButtonData nextButtonData;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final TextAreaData inputTextData;

        public Data(BaseScaffoldData baseScaffoldData, Label label, ButtonData buttonData, TextAreaData textAreaData) {
            this.baseScaffoldData = baseScaffoldData;
            this.contentHeader = label;
            this.nextButtonData = buttonData;
            this.inputTextData = textAreaData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final BaseScaffoldData getBaseScaffoldData() {
            return this.baseScaffoldData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Label getContentHeader() {
            return this.contentHeader;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final TextAreaData getInputTextData() {
            return this.inputTextData;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final ButtonData getNextButtonData() {
            return this.nextButtonData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return t.c(this.baseScaffoldData, data.baseScaffoldData) && t.c(this.contentHeader, data.contentHeader) && t.c(this.nextButtonData, data.nextButtonData) && t.c(this.inputTextData, data.inputTextData);
        }

        public int hashCode() {
            return (((((this.baseScaffoldData.hashCode() * 31) + this.contentHeader.hashCode()) * 31) + this.nextButtonData.hashCode()) * 31) + this.inputTextData.hashCode();
        }

        public String toString() {
            return "Data(baseScaffoldData=" + this.baseScaffoldData + ", contentHeader=" + this.contentHeader + ", nextButtonData=" + this.nextButtonData + ", inputTextData=" + this.inputTextData + ')';
        }
    }
}
