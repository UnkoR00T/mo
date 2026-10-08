package we3;

import h30.ButtonData;
import i50.BaseScaffoldData;
import mx.Label;
import n30.CardListData;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lwe3/c;", "Ll00/e;", "Lwe3/c$a;", "a", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lwe3/c$a;", "", "a", "b", "Lwe3/c$a$a;", "Lwe3/c$a$b;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: we3.c$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lwe3/c$a$a;", "Lwe3/c$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C5624a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C5624a f212830a = new C5624a();

            private C5624a() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C5624a);
            }

            public int hashCode() {
                return -1588657644;
            }

            public String toString() {
                return "Initial";
            }
        }

        /* JADX INFO: renamed from: we3.c$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001f\u001a\u0004\b\u001b\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010!\u001a\u0004\b\u0017\u0010\"¨\u0006#"}, d2 = {"Lwe3/c$a$b;", "Lwe3/c$a;", "Li50/a;", "scaffoldData", "Lmx/a;", "subtitle", "Ln30/b;", "images", "Lh30/a;", "bottomButton", "<init>", "(Li50/a;Lmx/a;Ln30/b;Lh30/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "c", "()Li50/a;", "b", "Lmx/a;", "d", "()Lmx/a;", "Ln30/b;", "()Ln30/b;", "Lh30/a;", "()Lh30/a;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initialized implements a {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final int f212831e = BaseScaffoldData.f89350g;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData scaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label subtitle;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final CardListData images;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonData bottomButton;

            public Initialized(BaseScaffoldData baseScaffoldData, Label label, CardListData cardListData, ButtonData buttonData) {
                this.scaffoldData = baseScaffoldData;
                this.subtitle = label;
                this.images = cardListData;
                this.bottomButton = buttonData;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final ButtonData getBottomButton() {
                return this.bottomButton;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final CardListData getImages() {
                return this.images;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final BaseScaffoldData getScaffoldData() {
                return this.scaffoldData;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final Label getSubtitle() {
                return this.subtitle;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Initialized)) {
                    return false;
                }
                Initialized initialized = (Initialized) other;
                return fr.t.c(this.scaffoldData, initialized.scaffoldData) && fr.t.c(this.subtitle, initialized.subtitle) && fr.t.c(this.images, initialized.images) && fr.t.c(this.bottomButton, initialized.bottomButton);
            }

            public int hashCode() {
                int iHashCode = ((((this.scaffoldData.hashCode() * 31) + this.subtitle.hashCode()) * 31) + this.images.hashCode()) * 31;
                ButtonData buttonData = this.bottomButton;
                return iHashCode + (buttonData == null ? 0 : buttonData.hashCode());
            }

            public String toString() {
                return "Initialized(scaffoldData=" + this.scaffoldData + ", subtitle=" + this.subtitle + ", images=" + this.images + ", bottomButton=" + this.bottomButton + ')';
            }
        }
    }
}
