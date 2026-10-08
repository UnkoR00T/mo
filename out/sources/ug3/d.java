package ug3;

import android.graphics.Bitmap;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import mx.Label;
import n30.CardListData;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lug3/d;", "Ll00/e;", "Lug3/d$a;", "a", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d extends l00.e<Data> {

    /* JADX INFO: renamed from: ug3.d$a, reason: from toString */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b%\u0010'\u001a\u0004\b\u001f\u0010(R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b#\u0010+R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b!\u0010*\u001a\u0004\b)\u0010+R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/¨\u00060"}, d2 = {"Lug3/d$a;", "", "Li50/a;", "baseScaffoldData", "Lmx/a;", "title", "Landroid/graphics/Bitmap;", "picture", "Ln30/b;", "cardListData", "Lh30/a;", "confirmButtonData", "rejectButtonData", "Lkotlin/Function0;", "Loq/i0;", "onGoToNextStep", "<init>", "(Li50/a;Lmx/a;Landroid/graphics/Bitmap;Ln30/b;Lh30/a;Lh30/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "()Li50/a;", "b", "Lmx/a;", "f", "()Lmx/a;", "c", "Landroid/graphics/Bitmap;", "d", "()Landroid/graphics/Bitmap;", "Ln30/b;", "()Ln30/b;", "e", "Lh30/a;", "()Lh30/a;", "g", "Ler/a;", "getOnGoToNextStep", "()Ler/a;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BaseScaffoldData baseScaffoldData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label title;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Bitmap picture;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final CardListData cardListData;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final ButtonData confirmButtonData;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final ButtonData rejectButtonData;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onGoToNextStep;

        public Data(BaseScaffoldData baseScaffoldData, Label label, Bitmap bitmap, CardListData cardListData, ButtonData buttonData, ButtonData buttonData2, er.a<i0> aVar) {
            this.baseScaffoldData = baseScaffoldData;
            this.title = label;
            this.picture = bitmap;
            this.cardListData = cardListData;
            this.confirmButtonData = buttonData;
            this.rejectButtonData = buttonData2;
            this.onGoToNextStep = aVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final BaseScaffoldData getBaseScaffoldData() {
            return this.baseScaffoldData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final CardListData getCardListData() {
            return this.cardListData;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final ButtonData getConfirmButtonData() {
            return this.confirmButtonData;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Bitmap getPicture() {
            return this.picture;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final ButtonData getRejectButtonData() {
            return this.rejectButtonData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return t.c(this.baseScaffoldData, data.baseScaffoldData) && t.c(this.title, data.title) && t.c(this.picture, data.picture) && t.c(this.cardListData, data.cardListData) && t.c(this.confirmButtonData, data.confirmButtonData) && t.c(this.rejectButtonData, data.rejectButtonData) && t.c(this.onGoToNextStep, data.onGoToNextStep);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final Label getTitle() {
            return this.title;
        }

        public int hashCode() {
            return (((((((((((this.baseScaffoldData.hashCode() * 31) + this.title.hashCode()) * 31) + this.picture.hashCode()) * 31) + this.cardListData.hashCode()) * 31) + this.confirmButtonData.hashCode()) * 31) + this.rejectButtonData.hashCode()) * 31) + this.onGoToNextStep.hashCode();
        }

        public String toString() {
            return "Data(baseScaffoldData=" + this.baseScaffoldData + ", title=" + this.title + ", picture=" + this.picture + ", cardListData=" + this.cardListData + ", confirmButtonData=" + this.confirmButtonData + ", rejectButtonData=" + this.rejectButtonData + ", onGoToNextStep=" + this.onGoToNextStep + ')';
        }
    }
}
