package i83;

import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import j30.ButtonTextData;
import java.util.List;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Li83/g;", "Ll00/e;", "Li83/g$a;", "a", "studentschoolcardactivation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface g extends l00.e<Data> {

    /* JADX INFO: renamed from: i83.g$a, reason: from toString */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b\u001c\u0010%R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b \u0010(R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b)\u0010+R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b\u001e\u0010,\u001a\u0004\b&\u0010-¨\u0006."}, d2 = {"Li83/g$a;", "", "Li50/a;", "scaffoldData", "Lo40/a;", "headerData", "", "Lmx/a;", "bulletPoints", "Lh30/a;", "buttonData", "Lj30/a;", "qrCodeInfoButonData", "Lkotlin/Function0;", "Loq/i0;", "onBackPressed", "<init>", "(Li50/a;Lo40/a;Ljava/util/List;Lh30/a;Lj30/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "f", "()Li50/a;", "b", "Lo40/a;", "c", "()Lo40/a;", "Ljava/util/List;", "()Ljava/util/List;", "d", "Lh30/a;", "()Lh30/a;", "e", "Lj30/a;", "()Lj30/a;", "Ler/a;", "()Ler/a;", "studentschoolcardactivation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BaseScaffoldData scaffoldData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final o40.a headerData;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<Label> bulletPoints;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final ButtonData buttonData;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final ButtonTextData qrCodeInfoButonData;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackPressed;

        public Data(BaseScaffoldData baseScaffoldData, o40.a aVar, List<Label> list, ButtonData buttonData, ButtonTextData buttonTextData, er.a<i0> aVar2) {
            this.scaffoldData = baseScaffoldData;
            this.headerData = aVar;
            this.bulletPoints = list;
            this.buttonData = buttonData;
            this.qrCodeInfoButonData = buttonTextData;
            this.onBackPressed = aVar2;
        }

        public final List<Label> a() {
            return this.bulletPoints;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final ButtonData getButtonData() {
            return this.buttonData;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final o40.a getHeaderData() {
            return this.headerData;
        }

        public final er.a<i0> d() {
            return this.onBackPressed;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final ButtonTextData getQrCodeInfoButonData() {
            return this.qrCodeInfoButonData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return t.c(this.scaffoldData, data.scaffoldData) && t.c(this.headerData, data.headerData) && t.c(this.bulletPoints, data.bulletPoints) && t.c(this.buttonData, data.buttonData) && t.c(this.qrCodeInfoButonData, data.qrCodeInfoButonData) && t.c(this.onBackPressed, data.onBackPressed);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final BaseScaffoldData getScaffoldData() {
            return this.scaffoldData;
        }

        public int hashCode() {
            int iHashCode = ((((((this.scaffoldData.hashCode() * 31) + this.headerData.hashCode()) * 31) + this.bulletPoints.hashCode()) * 31) + this.buttonData.hashCode()) * 31;
            ButtonTextData buttonTextData = this.qrCodeInfoButonData;
            return ((iHashCode + (buttonTextData == null ? 0 : buttonTextData.hashCode())) * 31) + this.onBackPressed.hashCode();
        }

        public String toString() {
            return "Data(scaffoldData=" + this.scaffoldData + ", headerData=" + this.headerData + ", bulletPoints=" + this.bulletPoints + ", buttonData=" + this.buttonData + ", qrCodeInfoButonData=" + this.qrCodeInfoButonData + ", onBackPressed=" + this.onBackPressed + ')';
        }
    }
}
