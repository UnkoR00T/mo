package ax3;

import android.graphics.Bitmap;
import g30.ModalBottomSheetData;
import h30.ButtonData;
import i50.BaseScaffoldData;
import java.util.List;
import mx.Label;
import o50.SmallCardData;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p071kotlin.Metadata;
import z30.FileBottomSheetItemData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lax3/f;", "Ll00/e;", "Lax3/f$a;", "a", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface f extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lax3/f$a;", "", "c", "a", "b", "Lax3/f$a$a;", "Lax3/f$a$b;", "Lax3/f$a$c;", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: ax3.f$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lax3/f$a$a;", "Lax3/f$a;", "Lhb4/c;", "vmsAdapter", "<init>", "(Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhb4/c;", "()Lhb4/c;", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Error implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final hb4.c vmsAdapter;

            public Error(hb4.c cVar) {
                this.vmsAdapter = cVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final hb4.c getVmsAdapter() {
                return this.vmsAdapter;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && fr.t.c(this.vmsAdapter, ((Error) other).vmsAdapter);
            }

            public int hashCode() {
                return this.vmsAdapter.hashCode();
            }

            public String toString() {
                return "Error(vmsAdapter=" + this.vmsAdapter + ')';
            }
        }

        /* JADX INFO: renamed from: ax3.f$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001:\u0004'+$ BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b \u0010&R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b/\u00101R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b)\u00102\u001a\u0004\b'\u00103R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\"\u00104\u001a\u0004\b$\u00105R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b-\u00106\u001a\u0004\b+\u00107¨\u00068"}, d2 = {"Lax3/f$a$b;", "Lax3/f$a;", "Li50/a;", "scaffoldData", "Lc30/b;", "alertData", "Lax3/f$a$b$c;", "pictureData", "Lax3/f$a$b$d;", "unfulfilledRequirementsData", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "Lax3/f$a$b$b;", "buttonsData", "Lax3/f$a$b$a;", "bottomSheetData", "Lcb4/i;", "dialogAdapter", "<init>", "(Li50/a;Lc30/b;Lax3/f$a$b$c;Lax3/f$a$b$d;Ler/a;Lax3/f$a$b$b;Lax3/f$a$b$a;Lcb4/i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "g", "()Li50/a;", "b", "Lc30/b;", "()Lc30/b;", "c", "Lax3/f$a$b$c;", "f", "()Lax3/f$a$b$c;", "d", "Lax3/f$a$b$d;", "h", "()Lax3/f$a$b$d;", "e", "Ler/a;", "()Ler/a;", "Lax3/f$a$b$b;", "()Lax3/f$a$b$b;", "Lax3/f$a$b$a;", "()Lax3/f$a$b$a;", "Lcb4/i;", "()Lcb4/i;", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initialized implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData scaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final c30.b alertData;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final PictureData pictureData;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final UnfulfilledRequirementsData unfulfilledRequirementsData;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<oq.i0> onBackClick;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonsData buttonsData;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final BottomSheetData bottomSheetData;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final cb4.i dialogAdapter;

            /* JADX INFO: renamed from: ax3.f$a$b$a, reason: collision with other inner class name and from toString */
            @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lax3/f$a$b$a;", "", "Lg30/n;", "data", "", "Lz30/a;", "content", "<init>", "(Lg30/n;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lg30/n;", "b", "()Lg30/n;", "Ljava/util/List;", "()Ljava/util/List;", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class BottomSheetData {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final ModalBottomSheetData data;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final List<FileBottomSheetItemData> content;

                public BottomSheetData(ModalBottomSheetData modalBottomSheetData, List<FileBottomSheetItemData> list) {
                    this.data = modalBottomSheetData;
                    this.content = list;
                }

                public final List<FileBottomSheetItemData> a() {
                    return this.content;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final ModalBottomSheetData getData() {
                    return this.data;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof BottomSheetData)) {
                        return false;
                    }
                    BottomSheetData bottomSheetData = (BottomSheetData) other;
                    return fr.t.c(this.data, bottomSheetData.data) && fr.t.c(this.content, bottomSheetData.content);
                }

                public int hashCode() {
                    return (this.data.hashCode() * 31) + this.content.hashCode();
                }

                public String toString() {
                    return "BottomSheetData(data=" + this.data + ", content=" + this.content + ')';
                }
            }

            /* JADX INFO: renamed from: ax3.f$a$b$b, reason: collision with other inner class name and from toString */
            @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lax3/f$a$b$b;", "", "Lh30/a;", "primary", "secondary", "<init>", "(Lh30/a;Lh30/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lh30/a;", "()Lh30/a;", "b", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class ButtonsData {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final ButtonData primary;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final ButtonData secondary;

                public ButtonsData(ButtonData buttonData, ButtonData buttonData2) {
                    this.primary = buttonData;
                    this.secondary = buttonData2;
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final ButtonData getPrimary() {
                    return this.primary;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final ButtonData getSecondary() {
                    return this.secondary;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof ButtonsData)) {
                        return false;
                    }
                    ButtonsData buttonsData = (ButtonsData) other;
                    return fr.t.c(this.primary, buttonsData.primary) && fr.t.c(this.secondary, buttonsData.secondary);
                }

                public int hashCode() {
                    int iHashCode = this.primary.hashCode() * 31;
                    ButtonData buttonData = this.secondary;
                    return iHashCode + (buttonData == null ? 0 : buttonData.hashCode());
                }

                public String toString() {
                    return "ButtonsData(primary=" + this.primary + ", secondary=" + this.secondary + ')';
                }
            }

            /* JADX INFO: renamed from: ax3.f$a$b$c, reason: from toString */
            @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001c\u001a\u0004\b\u0015\u0010\u001d¨\u0006\u001e"}, d2 = {"Lax3/f$a$b$c;", "", "Le4/l;", "scaleType", "Landroid/graphics/Bitmap;", "image", "", "Lo50/a;", "buttonsData", "<init>", "(Le4/l;Landroid/graphics/Bitmap;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Le4/l;", "c", "()Le4/l;", "b", "Landroid/graphics/Bitmap;", "()Landroid/graphics/Bitmap;", "Ljava/util/List;", "()Ljava/util/List;", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class PictureData {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final p036e4.l scaleType;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final Bitmap image;

                /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
                private final List<SmallCardData> buttonsData;

                public PictureData(p036e4.l lVar, Bitmap bitmap, List<SmallCardData> list) {
                    this.scaleType = lVar;
                    this.image = bitmap;
                    this.buttonsData = list;
                }

                public final List<SmallCardData> a() {
                    return this.buttonsData;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final Bitmap getImage() {
                    return this.image;
                }

                /* JADX INFO: renamed from: c, reason: from getter */
                public final p036e4.l getScaleType() {
                    return this.scaleType;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof PictureData)) {
                        return false;
                    }
                    PictureData pictureData = (PictureData) other;
                    return fr.t.c(this.scaleType, pictureData.scaleType) && fr.t.c(this.image, pictureData.image) && fr.t.c(this.buttonsData, pictureData.buttonsData);
                }

                public int hashCode() {
                    return (((this.scaleType.hashCode() * 31) + this.image.hashCode()) * 31) + this.buttonsData.hashCode();
                }

                public String toString() {
                    return "PictureData(scaleType=" + this.scaleType + ", image=" + this.image + ", buttonsData=" + this.buttonsData + ')';
                }
            }

            /* JADX INFO: renamed from: ax3.f$a$b$d, reason: from toString */
            @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0013B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lax3/f$a$b$d;", "", "Lmx/a;", "header", "", "Lax3/f$a$b$d$a;", "items", "<init>", "(Lmx/a;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "()Lmx/a;", "b", "Ljava/util/List;", "()Ljava/util/List;", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class UnfulfilledRequirementsData {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final Label header;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final List<Item> items;

                /* JADX INFO: renamed from: ax3.f$a$b$d$a, reason: collision with other inner class name and from toString */
                @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lax3/f$a$b$d$a;", "", "Ld40/b;", "iconData", "Lmx/a;", AnnotatedPrivateKey.LABEL, "<init>", "(Ld40/b;Lmx/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ld40/b;", "()Ld40/b;", "b", "Lmx/a;", "()Lmx/a;", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final /* data */ class Item {

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public static final int f14976c = d40.b.f39676g;

                    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                    private final d40.b iconData;

                    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                    private final Label label;

                    public Item(d40.b bVar, Label label) {
                        this.iconData = bVar;
                        this.label = label;
                    }

                    /* JADX INFO: renamed from: a, reason: from getter */
                    public final d40.b getIconData() {
                        return this.iconData;
                    }

                    /* JADX INFO: renamed from: b, reason: from getter */
                    public final Label getLabel() {
                        return this.label;
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof Item)) {
                            return false;
                        }
                        Item item = (Item) other;
                        return fr.t.c(this.iconData, item.iconData) && fr.t.c(this.label, item.label);
                    }

                    public int hashCode() {
                        return (this.iconData.hashCode() * 31) + this.label.hashCode();
                    }

                    public String toString() {
                        return "Item(iconData=" + this.iconData + ", label=" + this.label + ')';
                    }
                }

                public UnfulfilledRequirementsData(Label label, List<Item> list) {
                    this.header = label;
                    this.items = list;
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final Label getHeader() {
                    return this.header;
                }

                public final List<Item> b() {
                    return this.items;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof UnfulfilledRequirementsData)) {
                        return false;
                    }
                    UnfulfilledRequirementsData unfulfilledRequirementsData = (UnfulfilledRequirementsData) other;
                    return fr.t.c(this.header, unfulfilledRequirementsData.header) && fr.t.c(this.items, unfulfilledRequirementsData.items);
                }

                public int hashCode() {
                    return (this.header.hashCode() * 31) + this.items.hashCode();
                }

                public String toString() {
                    return "UnfulfilledRequirementsData(header=" + this.header + ", items=" + this.items + ')';
                }
            }

            public Initialized(BaseScaffoldData baseScaffoldData, c30.b bVar, PictureData pictureData, UnfulfilledRequirementsData unfulfilledRequirementsData, er.a<oq.i0> aVar, ButtonsData buttonsData, BottomSheetData bottomSheetData, cb4.i iVar) {
                this.scaffoldData = baseScaffoldData;
                this.alertData = bVar;
                this.pictureData = pictureData;
                this.unfulfilledRequirementsData = unfulfilledRequirementsData;
                this.onBackClick = aVar;
                this.buttonsData = buttonsData;
                this.bottomSheetData = bottomSheetData;
                this.dialogAdapter = iVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final c30.b getAlertData() {
                return this.alertData;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final BottomSheetData getBottomSheetData() {
                return this.bottomSheetData;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final ButtonsData getButtonsData() {
                return this.buttonsData;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final cb4.i getDialogAdapter() {
                return this.dialogAdapter;
            }

            public final er.a<oq.i0> e() {
                return this.onBackClick;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Initialized)) {
                    return false;
                }
                Initialized initialized = (Initialized) other;
                return fr.t.c(this.scaffoldData, initialized.scaffoldData) && fr.t.c(this.alertData, initialized.alertData) && fr.t.c(this.pictureData, initialized.pictureData) && fr.t.c(this.unfulfilledRequirementsData, initialized.unfulfilledRequirementsData) && fr.t.c(this.onBackClick, initialized.onBackClick) && fr.t.c(this.buttonsData, initialized.buttonsData) && fr.t.c(this.bottomSheetData, initialized.bottomSheetData) && fr.t.c(this.dialogAdapter, initialized.dialogAdapter);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final PictureData getPictureData() {
                return this.pictureData;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final BaseScaffoldData getScaffoldData() {
                return this.scaffoldData;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final UnfulfilledRequirementsData getUnfulfilledRequirementsData() {
                return this.unfulfilledRequirementsData;
            }

            public int hashCode() {
                int iHashCode = ((((this.scaffoldData.hashCode() * 31) + this.alertData.hashCode()) * 31) + this.pictureData.hashCode()) * 31;
                UnfulfilledRequirementsData unfulfilledRequirementsData = this.unfulfilledRequirementsData;
                int iHashCode2 = (((((((iHashCode + (unfulfilledRequirementsData == null ? 0 : unfulfilledRequirementsData.hashCode())) * 31) + this.onBackClick.hashCode()) * 31) + this.buttonsData.hashCode()) * 31) + this.bottomSheetData.hashCode()) * 31;
                cb4.i iVar = this.dialogAdapter;
                return iHashCode2 + (iVar != null ? iVar.hashCode() : 0);
            }

            public String toString() {
                return "Initialized(scaffoldData=" + this.scaffoldData + ", alertData=" + this.alertData + ", pictureData=" + this.pictureData + ", unfulfilledRequirementsData=" + this.unfulfilledRequirementsData + ", onBackClick=" + this.onBackClick + ", buttonsData=" + this.buttonsData + ", bottomSheetData=" + this.bottomSheetData + ", dialogAdapter=" + this.dialogAdapter + ')';
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lax3/f$a$c;", "Lax3/f$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class c implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f14979a = new c();

            private c() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof c);
            }

            public int hashCode() {
                return -1288656472;
            }

            public String toString() {
                return "Loading";
            }
        }
    }
}
