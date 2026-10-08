package n40;

import android.graphics.Bitmap;
import androidx.compose.ui.graphics.Color;
import er.p;
import i30.ButtonIconData;
import mx.Label;
import n4.CustomAccessibilityAction;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardLabel;
import n50.l;
import n50.x0;
import oq.i0;
import oq.k;
import p071kotlin.Metadata;
import p076m2.r;
import p076m2.t;
import pq.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u000b\u000fB9\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00168FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0011\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001b8 X \u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u001c\u0082\u0001\u0002\u001e\u001f¨\u0006 "}, d2 = {"Ln40/i;", "", "Lmx/a;", "title", "description", "Lkotlin/Function0;", "Loq/i0;", "onImageClick", "onDeleteClick", "<init>", "(Lmx/a;Lmx/a;Ler/a;Ler/a;)V", "a", "Lmx/a;", "getTitle", "()Lmx/a;", "b", "getDescription", "c", "Ler/a;", "getOnImageClick", "()Ler/a;", "d", "Li30/a;", "e", "Loq/k;", "()Li30/a;", "leadingButtonData", "Ln50/g;", "()Ln50/g;", "cardData", "Ln40/i$a;", "Ln40/i$b;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Label title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Label description;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final er.a<i0> onImageClick;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final er.a<i0> onDeleteClick;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final k leadingButtonData;

    /* JADX INFO: renamed from: n40.i$a, reason: from toString */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0001,B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001d\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010+\u001a\u00020'8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b#\u0010(\u001a\u0004\b)\u0010*¨\u0006-"}, d2 = {"Ln40/i$a;", "Ln40/i;", "Lmx/a;", "title", "description", "Lkotlin/Function0;", "Loq/i0;", "onDeleteClick", "onImageClick", "Ln40/i$a$a;", "leadingImageData", "<init>", "(Lmx/a;Lmx/a;Ler/a;Ler/a;Ln40/i$a$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "f", "Lmx/a;", "l", "()Lmx/a;", "g", "j", "h", "Ler/a;", "d", "()Ler/a;", "i", "k", "Ln40/i$a$a;", "getLeadingImageData", "()Ln40/i$a$a;", "Ln50/g;", "Ln50/g;", "b", "()Ln50/g;", "cardData", "a", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Image extends i {

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label title;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label description;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onDeleteClick;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onImageClick;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC3255a leadingImageData;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        private final DefaultSingleCardData cardData;

        /* JADX INFO: renamed from: n40.i$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Ln40/i$a$a;", "", "<init>", "()V", "b", "a", "Ln40/i$a$a$a;", "Ln40/i$a$a$b;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static abstract class AbstractC3255a {

            /* JADX INFO: renamed from: n40.i$a$a$a, reason: collision with other inner class name and from toString */
            @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016B\u001f\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\rR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Ln40/i$a$a$a;", "Ln40/i$a$a;", "", "iconResId", "Lkotlin/Function0;", "Landroidx/compose/ui/graphics/Color;", "backgroundColor", "<init>", "(ILer/p;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "c", "b", "Ler/p;", "()Ler/p;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Icon extends AbstractC3255a {

                /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private static final Icon f131369d = new Icon(jz.a.M0, C3257a.f131372a);

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final int iconResId;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final p<r, Integer, Color> backgroundColor;

                /* JADX INFO: renamed from: n40.i$a$a$a$a, reason: collision with other inner class name */
                @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
                static final class C3257a implements p<r, Integer, Color> {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public static final C3257a f131372a = new C3257a();

                    C3257a() {
                    }

                    @Override // er.p
                    public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
                        return Color.m0boximpl(c(rVar, num.intValue()));
                    }

                    public final long c(r rVar, int i15) {
                        rVar.X(1065141778);
                        if (t.k()) {
                            t.o(1065141778, i15, -1, "pl.gov.coi.common.ui.ds.filepicker.model.PickerFile.Image.LeadingImageData.Icon.Companion.PLACEHOLDER.<anonymous> (PickerFile.kt:65)");
                        }
                        long jA = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().a();
                        if (t.k()) {
                            t.n();
                        }
                        rVar.R();
                        return jA;
                    }
                }

                /* JADX INFO: renamed from: n40.i$a$a$a$b, reason: from kotlin metadata */
                @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ln40/i$a$a$a$b;", "", "<init>", "()V", "Ln40/i$a$a$a;", "PLACEHOLDER", "Ln40/i$a$a$a;", "a", "()Ln40/i$a$a$a;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final class Companion {
                    public /* synthetic */ Companion(fr.k kVar) {
                        this();
                    }

                    public final Icon a() {
                        return Icon.f131369d;
                    }

                    private Companion() {
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                public Icon(int i15, p<? super r, ? super Integer, Color> pVar) {
                    super(null);
                    this.iconResId = i15;
                    this.backgroundColor = pVar;
                }

                public final p<r, Integer, Color> b() {
                    return this.backgroundColor;
                }

                /* JADX INFO: renamed from: c, reason: from getter */
                public final int getIconResId() {
                    return this.iconResId;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Icon)) {
                        return false;
                    }
                    Icon icon = (Icon) other;
                    return this.iconResId == icon.iconResId && fr.t.c(this.backgroundColor, icon.backgroundColor);
                }

                public int hashCode() {
                    return (Integer.hashCode(this.iconResId) * 31) + this.backgroundColor.hashCode();
                }

                public String toString() {
                    return "Icon(iconResId=" + this.iconResId + ", backgroundColor=" + this.backgroundColor + ')';
                }
            }

            /* JADX INFO: renamed from: n40.i$a$a$b, reason: from toString */
            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Ln40/i$a$a$b;", "Ln40/i$a$a;", "Landroid/graphics/Bitmap;", "bitmap", "<init>", "(Landroid/graphics/Bitmap;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroid/graphics/Bitmap;", "()Landroid/graphics/Bitmap;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Image extends AbstractC3255a {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final Bitmap bitmap;

                public Image(Bitmap bitmap) {
                    super(null);
                    this.bitmap = bitmap;
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final Bitmap getBitmap() {
                    return this.bitmap;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Image) && fr.t.c(this.bitmap, ((Image) other).bitmap);
                }

                public int hashCode() {
                    return this.bitmap.hashCode();
                }

                public String toString() {
                    return "Image(bitmap=" + this.bitmap + ')';
                }
            }

            public /* synthetic */ AbstractC3255a(fr.k kVar) {
                this();
            }

            private AbstractC3255a() {
            }
        }

        public Image(Label label, Label label2, er.a<i0> aVar, er.a<i0> aVar2, AbstractC3255a abstractC3255a) {
            n50.i dVar;
            Label labelO0;
            super(label, label2, null, aVar, 4, null);
            this.title = label;
            this.description = label2;
            this.onDeleteClick = aVar;
            this.onImageClick = aVar2;
            this.leadingImageData = abstractC3255a;
            if (abstractC3255a instanceof AbstractC3255a.Image) {
                dVar = new n50.i.Image(((AbstractC3255a.Image) abstractC3255a).getBitmap(), null, k(), 2, null);
            } else {
                if (!(abstractC3255a instanceof AbstractC3255a.Icon)) {
                    throw new oq.p();
                }
                dVar = new n50.i.RoundedSquareIcon(((AbstractC3255a.Icon) abstractC3255a).getIconResId(), null, null, null, ((AbstractC3255a.Icon) abstractC3255a).b(), null, k(), null, 174, null);
            }
            LeadingSection leadingSection = new LeadingSection(false, null, dVar, 3, null);
            BodySection bodySection = new BodySection(null, new n50.b.Title(new SingleCardLabel(getTitle(), null, null, 2, 0, null, 54, null)), l.b(getDescription(), null, null, 3, null), 1, null);
            x0.IconButton iconButton = new x0.IconButton(c());
            if (abstractC3255a instanceof AbstractC3255a.Image) {
                labelO0 = c70.a.f23835a.a().d();
            } else {
                if (!(abstractC3255a instanceof AbstractC3255a.Icon)) {
                    throw new oq.p();
                }
                labelO0 = c70.a.f23835a.a().o0();
            }
            this.cardData = new DefaultSingleCardData(null, null, false, null, v.s(k() != null ? new CustomAccessibilityAction(labelO0.getText(), new er.a() { // from class: n40.g
                @Override // er.a
                public final Object a() {
                    return Boolean.valueOf(i.Image.h(this.f131355a));
                }
            }) : null, new CustomAccessibilityAction(c70.a.f23835a.a().m0().getText(), new er.a() { // from class: n40.h
                @Override // er.a
                public final Object a() {
                    return Boolean.valueOf(i.Image.i(this.f131356a));
                }
            })), false, null, null, bodySection, leadingSection, iconButton, null, 2287, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean h(Image image) {
            er.a<i0> aVarK = image.k();
            if (aVarK == null) {
                return true;
            }
            aVarK.a();
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean i(Image image) {
            image.d().a();
            return true;
        }

        @Override // n40.i
        /* JADX INFO: renamed from: b, reason: from getter */
        public DefaultSingleCardData getCardData() {
            return this.cardData;
        }

        @Override // n40.i
        public er.a<i0> d() {
            return this.onDeleteClick;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Image)) {
                return false;
            }
            Image image = (Image) other;
            return fr.t.c(this.title, image.title) && fr.t.c(this.description, image.description) && fr.t.c(this.onDeleteClick, image.onDeleteClick) && fr.t.c(this.onImageClick, image.onImageClick) && fr.t.c(this.leadingImageData, image.leadingImageData);
        }

        public int hashCode() {
            int iHashCode = ((((this.title.hashCode() * 31) + this.description.hashCode()) * 31) + this.onDeleteClick.hashCode()) * 31;
            er.a<i0> aVar = this.onImageClick;
            return ((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31) + this.leadingImageData.hashCode();
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public Label getDescription() {
            return this.description;
        }

        public er.a<i0> k() {
            return this.onImageClick;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public Label getTitle() {
            return this.title;
        }

        public String toString() {
            return "Image(title=" + this.title + ", description=" + this.description + ", onDeleteClick=" + this.onDeleteClick + ", onImageClick=" + this.onImageClick + ", leadingImageData=" + this.leadingImageData + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f131381a = new c();

        c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(994833653);
            if (t.k()) {
                t.o(994833653, i15, -1, "pl.gov.coi.common.ui.ds.filepicker.model.PickerFile.leadingButtonData$delegate.<anonymous>.<anonymous> (PickerFile.kt:34)");
            }
            long jG = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().g();
            if (t.k()) {
                t.n();
            }
            rVar.R();
            return jG;
        }
    }

    public /* synthetic */ i(Label label, Label label2, er.a aVar, er.a aVar2, fr.k kVar) {
        this(label, label2, aVar, aVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ButtonIconData e(i iVar) {
        return new ButtonIconData(null, jz.a.f106727a, c.f131381a, null, Label.INSTANCE.c(), iVar.d(), 9, null);
    }

    /* JADX INFO: renamed from: b */
    public abstract DefaultSingleCardData getCardData();

    public final ButtonIconData c() {
        return (ButtonIconData) this.leadingButtonData.getValue();
    }

    public er.a<i0> d() {
        return this.onDeleteClick;
    }

    private i(Label label, Label label2, er.a<i0> aVar, er.a<i0> aVar2) {
        this.title = label;
        this.description = label2;
        this.onImageClick = aVar;
        this.onDeleteClick = aVar2;
        this.leadingButtonData = oq.l.a(new er.a() { // from class: n40.f
            @Override // er.a
            public final Object a() {
                return i.e(this.f131354a);
            }
        });
    }

    public /* synthetic */ i(Label label, Label label2, er.a aVar, er.a aVar2, int i15, fr.k kVar) {
        this(label, label2, (i15 & 4) != 0 ? null : aVar, aVar2, null);
    }

    /* JADX INFO: renamed from: n40.i$b, reason: from toString */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u001a\u0010$\u001a\u00020 8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0018\u0010!\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Ln40/i$b;", "Ln40/i;", "Lmx/a;", "title", "description", "Lkotlin/Function0;", "Loq/i0;", "onImageClick", "onDeleteClick", "<init>", "(Lmx/a;Lmx/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "f", "Lmx/a;", "j", "()Lmx/a;", "g", "h", "Ler/a;", "i", "()Ler/a;", "d", "Ln50/g;", "Ln50/g;", "b", "()Ln50/g;", "cardData", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Regular extends i {

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label title;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label description;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onImageClick;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onDeleteClick;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        private final DefaultSingleCardData cardData;

        /* JADX INFO: renamed from: n40.i$b$a */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class a implements p<r, Integer, Color> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f131379a = new a();

            a() {
            }

            @Override // er.p
            public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
                return Color.m0boximpl(c(rVar, num.intValue()));
            }

            public final long c(r rVar, int i15) {
                rVar.X(-211823835);
                if (t.k()) {
                    t.o(-211823835, i15, -1, "pl.gov.coi.common.ui.ds.filepicker.model.PickerFile.Regular.cardData.<anonymous> (PickerFile.kt:138)");
                }
                long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
                if (t.k()) {
                    t.n();
                }
                rVar.R();
                return jB;
            }
        }

        /* JADX INFO: renamed from: n40.i$b$b, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class C3258b implements p<r, Integer, Color> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C3258b f131380a = new C3258b();

            C3258b() {
            }

            @Override // er.p
            public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
                return Color.m0boximpl(c(rVar, num.intValue()));
            }

            public final long c(r rVar, int i15) {
                rVar.X(286732967);
                if (t.k()) {
                    t.o(286732967, i15, -1, "pl.gov.coi.common.ui.ds.filepicker.model.PickerFile.Regular.cardData.<anonymous> (PickerFile.kt:137)");
                }
                long jA = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().a();
                if (t.k()) {
                    t.n();
                }
                rVar.R();
                return jA;
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        public Regular(Label label, Label label2, er.a<i0> aVar, er.a<i0> aVar2) {
            fr.k kVar = null;
            super(label, label2, null, aVar2, 4, kVar);
            this.title = label;
            this.description = label2;
            this.onImageClick = aVar;
            this.onDeleteClick = aVar2;
            d40.i.g gVar = d40.i.g.f39710e;
            d40.i.C0865i c0865i = d40.i.C0865i.f39712e;
            Label label3 = null;
            boolean z15 = false;
            Object[] objArr = 0 == true ? 1 : 0;
            LeadingSection leadingSection = new LeadingSection(z15, objArr, new n50.i.RoundedSquareIcon(jz.a.M0, label3, a.f131379a, gVar, C3258b.f131380a, c0865i, i(), null, 130, null), 3, kVar);
            this.cardData = new DefaultSingleCardData(null, null, false, null, v.r(new CustomAccessibilityAction(c70.a.f23835a.a().m0().getText(), new er.a() { // from class: n40.j
                @Override // er.a
                public final Object a() {
                    return Boolean.valueOf(i.Regular.g(this.f131382a));
                }
            })), false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(getTitle(), null, null, 2, 0, null, 54, null)), l.b(getDescription(), null, null, 3, null), 1, null), leadingSection, new x0.IconButton(c()), null, 2287, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean g(Regular regular) {
            regular.d().a();
            return true;
        }

        @Override // n40.i
        /* JADX INFO: renamed from: b, reason: from getter */
        public DefaultSingleCardData getCardData() {
            return this.cardData;
        }

        @Override // n40.i
        public er.a<i0> d() {
            return this.onDeleteClick;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Regular)) {
                return false;
            }
            Regular regular = (Regular) other;
            return fr.t.c(this.title, regular.title) && fr.t.c(this.description, regular.description) && fr.t.c(this.onImageClick, regular.onImageClick) && fr.t.c(this.onDeleteClick, regular.onDeleteClick);
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public Label getDescription() {
            return this.description;
        }

        public int hashCode() {
            int iHashCode = ((this.title.hashCode() * 31) + this.description.hashCode()) * 31;
            er.a<i0> aVar = this.onImageClick;
            return ((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31) + this.onDeleteClick.hashCode();
        }

        public er.a<i0> i() {
            return this.onImageClick;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public Label getTitle() {
            return this.title;
        }

        public String toString() {
            return "Regular(title=" + this.title + ", description=" + this.description + ", onImageClick=" + this.onImageClick + ", onDeleteClick=" + this.onDeleteClick + ')';
        }

        public /* synthetic */ Regular(Label label, Label label2, er.a aVar, er.a aVar2, int i15, fr.k kVar) {
            this(label, label2, (i15 & 4) != 0 ? null : aVar, aVar2);
        }
    }
}
