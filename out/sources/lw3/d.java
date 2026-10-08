package lw3;

import android.graphics.Bitmap;
import fx.Rectangle;
import h30.ButtonData;
import i50.BaseScaffoldData;
import jw3.MaskDefinition;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Llw3/d;", "Ll00/e;", "Llw3/d$a;", "a", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d extends l00.e<Data> {

    /* JADX INFO: renamed from: lw3.d$a, reason: from toString */
    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001:\u0001!Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b%\u0010'R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010&\u001a\u0004\b)\u0010'R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b!\u0010,R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b(\u0010/R#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b-\u00102R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b0\u00105R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b)\u00106\u001a\u0004\b3\u00107R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\u00138\u0006¢\u0006\f\n\u0004\b#\u00108\u001a\u0004\b*\u00109¨\u0006:"}, d2 = {"Llw3/d$a;", "", "Li50/a;", "scaffoldData", "Lmx/a;", "description", "rotateInfo", "Lqw3/b;", "adjustmentVMS", "Lyw3/a;", "faceValidationVMS", "Lkotlin/Function1;", "Lfx/e;", "Loq/i0;", "onContainerChanged", "Llw3/d$a$a;", "pictureData", "Lh30/a;", "rotate90DegreesLeftButtonData", "Lkotlin/Function0;", "onBack", "<init>", "(Li50/a;Lmx/a;Lmx/a;Lqw3/b;Lyw3/a;Ler/l;Llw3/d$a$a;Lh30/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "i", "()Li50/a;", "b", "Lmx/a;", "()Lmx/a;", "c", "h", "d", "Lqw3/b;", "()Lqw3/b;", "e", "Lyw3/a;", "()Lyw3/a;", "f", "Ler/l;", "()Ler/l;", "g", "Llw3/d$a$a;", "()Llw3/d$a$a;", "Lh30/a;", "()Lh30/a;", "Ler/a;", "()Ler/a;", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BaseScaffoldData scaffoldData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label description;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label rotateInfo;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final qw3.b adjustmentVMS;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final yw3.a faceValidationVMS;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<Rectangle, i0> onContainerChanged;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final PictureData pictureData;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final ButtonData rotate90DegreesLeftButtonData;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX INFO: renamed from: lw3.d$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Llw3/d$a$a;", "", "Landroid/graphics/Bitmap;", "image", "Ljw3/b;", "maskDefinition", "<init>", "(Landroid/graphics/Bitmap;Ljw3/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroid/graphics/Bitmap;", "()Landroid/graphics/Bitmap;", "b", "Ljw3/b;", "()Ljw3/b;", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class PictureData {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Bitmap image;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final MaskDefinition maskDefinition;

            public PictureData(Bitmap bitmap, MaskDefinition maskDefinition) {
                this.image = bitmap;
                this.maskDefinition = maskDefinition;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final Bitmap getImage() {
                return this.image;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final MaskDefinition getMaskDefinition() {
                return this.maskDefinition;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PictureData)) {
                    return false;
                }
                PictureData pictureData = (PictureData) other;
                return fr.t.c(this.image, pictureData.image) && fr.t.c(this.maskDefinition, pictureData.maskDefinition);
            }

            public int hashCode() {
                return (this.image.hashCode() * 31) + this.maskDefinition.hashCode();
            }

            public String toString() {
                return "PictureData(image=" + this.image + ", maskDefinition=" + this.maskDefinition + ')';
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Data(BaseScaffoldData baseScaffoldData, Label label, Label label2, qw3.b bVar, yw3.a aVar, er.l<? super Rectangle, i0> lVar, PictureData pictureData, ButtonData buttonData, er.a<i0> aVar2) {
            this.scaffoldData = baseScaffoldData;
            this.description = label;
            this.rotateInfo = label2;
            this.adjustmentVMS = bVar;
            this.faceValidationVMS = aVar;
            this.onContainerChanged = lVar;
            this.pictureData = pictureData;
            this.rotate90DegreesLeftButtonData = buttonData;
            this.onBack = aVar2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final qw3.b getAdjustmentVMS() {
            return this.adjustmentVMS;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Label getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final yw3.a getFaceValidationVMS() {
            return this.faceValidationVMS;
        }

        public final er.a<i0> d() {
            return this.onBack;
        }

        public final er.l<Rectangle, i0> e() {
            return this.onContainerChanged;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return fr.t.c(this.scaffoldData, data.scaffoldData) && fr.t.c(this.description, data.description) && fr.t.c(this.rotateInfo, data.rotateInfo) && fr.t.c(this.adjustmentVMS, data.adjustmentVMS) && fr.t.c(this.faceValidationVMS, data.faceValidationVMS) && fr.t.c(this.onContainerChanged, data.onContainerChanged) && fr.t.c(this.pictureData, data.pictureData) && fr.t.c(this.rotate90DegreesLeftButtonData, data.rotate90DegreesLeftButtonData) && fr.t.c(this.onBack, data.onBack);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final PictureData getPictureData() {
            return this.pictureData;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final ButtonData getRotate90DegreesLeftButtonData() {
            return this.rotate90DegreesLeftButtonData;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final Label getRotateInfo() {
            return this.rotateInfo;
        }

        public int hashCode() {
            int iHashCode = ((((((((((this.scaffoldData.hashCode() * 31) + this.description.hashCode()) * 31) + this.rotateInfo.hashCode()) * 31) + this.adjustmentVMS.hashCode()) * 31) + this.faceValidationVMS.hashCode()) * 31) + this.onContainerChanged.hashCode()) * 31;
            PictureData pictureData = this.pictureData;
            return ((((iHashCode + (pictureData == null ? 0 : pictureData.hashCode())) * 31) + this.rotate90DegreesLeftButtonData.hashCode()) * 31) + this.onBack.hashCode();
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final BaseScaffoldData getScaffoldData() {
            return this.scaffoldData;
        }

        public String toString() {
            return "Data(scaffoldData=" + this.scaffoldData + ", description=" + this.description + ", rotateInfo=" + this.rotateInfo + ", adjustmentVMS=" + this.adjustmentVMS + ", faceValidationVMS=" + this.faceValidationVMS + ", onContainerChanged=" + this.onContainerChanged + ", pictureData=" + this.pictureData + ", rotate90DegreesLeftButtonData=" + this.rotate90DegreesLeftButtonData + ", onBack=" + this.onBack + ')';
        }
    }
}
