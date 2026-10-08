package o20;

import android.graphics.Bitmap;
import h70.ShortcutsLayoutData;
import java.util.List;
import mx.Label;
import n30.CardListData;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\u000b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018À\u0006\u0003"}, d2 = {"Lo20/l;", "", "a", "c", "i", "g", "h", "e", "j", "k", "d", "b", "f", "Lo20/l$a;", "Lo20/l$b;", "Lo20/l$c;", "Lo20/l$d;", "Lo20/l$e;", "Lo20/l$f;", "Lo20/l$g;", "Lo20/l$h;", "Lo20/l$i;", "Lo20/l$j;", "Lo20/l$k;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface l {

    /* JADX INFO: renamed from: o20.l$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lo20/l$a;", "Lo20/l;", "Ln50/k;", "item", "<init>", "(Ln50/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ln50/k;", "()Ln50/k;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Button implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final n50.k item;

        public Button(n50.k kVar) {
            this.item = kVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final n50.k getItem() {
            return this.item;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Button) && fr.t.c(this.item, ((Button) other).item);
        }

        public int hashCode() {
            return this.item.hashCode();
        }

        public String toString() {
            return "Button(item=" + this.item + ')';
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lo20/l$b;", "Lo20/l;", "Lmx/a;", AnnotatedPrivateKey.LABEL, "Lmx/a;", "a", "()Lmx/a;", "Lkotlin/Function0;", "Loq/i0;", "onClick", "Ler/a;", "b", "()Ler/a;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b implements l {
        public final Label a() {
            throw null;
        }

        public final er.a<oq.i0> b() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: o20.l$c, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lo20/l$c;", "Lo20/l;", "Lmx/a;", "title", "Ln30/b;", "cardListData", "<init>", "(Lmx/a;Ln30/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "b", "()Lmx/a;", "Ln30/b;", "()Ln30/b;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Expandable implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label title;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final CardListData cardListData;

        public Expandable(Label label, CardListData cardListData) {
            this.title = label;
            this.cardListData = cardListData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final CardListData getCardListData() {
            return this.cardListData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Label getTitle() {
            return this.title;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Expandable)) {
                return false;
            }
            Expandable expandable = (Expandable) other;
            return fr.t.c(this.title, expandable.title) && fr.t.c(this.cardListData, expandable.cardListData);
        }

        public int hashCode() {
            return (this.title.hashCode() * 31) + this.cardListData.hashCode();
        }

        public String toString() {
            return "Expandable(title=" + this.title + ", cardListData=" + this.cardListData + ')';
        }
    }

    /* JADX INFO: renamed from: o20.l$d, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0011\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0012"}, d2 = {"Lo20/l$d;", "Lo20/l;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmx/a;", "a", "Lmx/a;", "()Lmx/a;", AnnotatedPrivateKey.LABEL, "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InfoItem implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label label;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Label getLabel() {
            return this.label;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof InfoItem) && fr.t.c(this.label, ((InfoItem) other).label);
        }

        public int hashCode() {
            return this.label.hashCode();
        }

        public String toString() {
            return "InfoItem(label=" + this.label + ')';
        }
    }

    /* JADX INFO: renamed from: o20.l$f, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lo20/l$f;", "Lo20/l;", "Lh70/a;", "shortcutsLayoutData", "<init>", "(Lh70/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lh70/a;", "()Lh70/a;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Shortcuts implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ShortcutsLayoutData shortcutsLayoutData;

        public Shortcuts(ShortcutsLayoutData shortcutsLayoutData) {
            this.shortcutsLayoutData = shortcutsLayoutData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final ShortcutsLayoutData getShortcutsLayoutData() {
            return this.shortcutsLayoutData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Shortcuts) && fr.t.c(this.shortcutsLayoutData, ((Shortcuts) other).shortcutsLayoutData);
        }

        public int hashCode() {
            return this.shortcutsLayoutData.hashCode();
        }

        public String toString() {
            return "Shortcuts(shortcutsLayoutData=" + this.shortcutsLayoutData + ')';
        }
    }

    /* JADX INFO: renamed from: o20.l$g, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001d"}, d2 = {"Lo20/l$g;", "Lo20/l;", "", "iconResId", "Lmx/a;", AnnotatedPrivateKey.LABEL, "Lkotlin/Function0;", "Loq/i0;", "onClick", "<init>", "(ILmx/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Lmx/a;", "()Lmx/a;", "c", "Ler/a;", "()Ler/a;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SingleCardIconForward implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int iconResId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label label;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<oq.i0> onClick;

        public SingleCardIconForward(int i15, Label label, er.a<oq.i0> aVar) {
            this.iconResId = i15;
            this.label = label;
            this.onClick = aVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getIconResId() {
            return this.iconResId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Label getLabel() {
            return this.label;
        }

        public final er.a<oq.i0> c() {
            return this.onClick;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SingleCardIconForward)) {
                return false;
            }
            SingleCardIconForward singleCardIconForward = (SingleCardIconForward) other;
            return this.iconResId == singleCardIconForward.iconResId && fr.t.c(this.label, singleCardIconForward.label) && fr.t.c(this.onClick, singleCardIconForward.onClick);
        }

        public int hashCode() {
            return (((Integer.hashCode(this.iconResId) * 31) + this.label.hashCode()) * 31) + this.onClick.hashCode();
        }

        public String toString() {
            return "SingleCardIconForward(iconResId=" + this.iconResId + ", label=" + this.label + ", onClick=" + this.onClick + ')';
        }
    }

    /* JADX INFO: renamed from: o20.l$h, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u0016\u0010\u001bR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e¨\u0006\u001f"}, d2 = {"Lo20/l$h;", "Lo20/l;", "Landroid/graphics/Bitmap;", "image", "Lmx/a;", "buttonLabel", "Lkotlin/Function0;", "Loq/i0;", "onClick", "<init>", "(Landroid/graphics/Bitmap;Lmx/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroid/graphics/Bitmap;", "b", "()Landroid/graphics/Bitmap;", "Lmx/a;", "()Lmx/a;", "c", "Ler/a;", "()Ler/a;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SingleCardImageButton implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Bitmap image;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label buttonLabel;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<oq.i0> onClick;

        public SingleCardImageButton(Bitmap bitmap, Label label, er.a<oq.i0> aVar) {
            this.image = bitmap;
            this.buttonLabel = label;
            this.onClick = aVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Label getButtonLabel() {
            return this.buttonLabel;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Bitmap getImage() {
            return this.image;
        }

        public final er.a<oq.i0> c() {
            return this.onClick;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SingleCardImageButton)) {
                return false;
            }
            SingleCardImageButton singleCardImageButton = (SingleCardImageButton) other;
            return fr.t.c(this.image, singleCardImageButton.image) && fr.t.c(this.buttonLabel, singleCardImageButton.buttonLabel) && fr.t.c(this.onClick, singleCardImageButton.onClick);
        }

        public int hashCode() {
            return (((this.image.hashCode() * 31) + this.buttonLabel.hashCode()) * 31) + this.onClick.hashCode();
        }

        public String toString() {
            return "SingleCardImageButton(image=" + this.image + ", buttonLabel=" + this.buttonLabel + ", onClick=" + this.onClick + ')';
        }
    }

    /* JADX INFO: renamed from: o20.l$i, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lo20/l$i;", "Lo20/l;", "Ln30/b;", "cardListData", "<init>", "(Ln30/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ln30/b;", "()Ln30/b;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class StaticList implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final CardListData cardListData;

        public StaticList(CardListData cardListData) {
            this.cardListData = cardListData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final CardListData getCardListData() {
            return this.cardListData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof StaticList) && fr.t.c(this.cardListData, ((StaticList) other).cardListData);
        }

        public int hashCode() {
            return this.cardListData.hashCode();
        }

        public String toString() {
            return "StaticList(cardListData=" + this.cardListData + ')';
        }
    }

    /* JADX INFO: renamed from: o20.l$j, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001b\u001a\u0004\b\u0015\u0010\u001c¨\u0006\u001d"}, d2 = {"Lo20/l$j;", "Lo20/l;", "Lmx/a;", "title", "section", "", "staticSections", "dynamicSections", "<init>", "(Lmx/a;Lmx/a;Ljava/util/List;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "d", "()Lmx/a;", "b", "c", "Ljava/util/List;", "()Ljava/util/List;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TopSection implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label title;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label section;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<Label> staticSections;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<Label> dynamicSections;

        public TopSection(Label label, Label label2, List<Label> list, List<Label> list2) {
            this.title = label;
            this.section = label2;
            this.staticSections = list;
            this.dynamicSections = list2;
        }

        public final List<Label> a() {
            return this.dynamicSections;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Label getSection() {
            return this.section;
        }

        public final List<Label> c() {
            return this.staticSections;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Label getTitle() {
            return this.title;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TopSection)) {
                return false;
            }
            TopSection topSection = (TopSection) other;
            return fr.t.c(this.title, topSection.title) && fr.t.c(this.section, topSection.section) && fr.t.c(this.staticSections, topSection.staticSections) && fr.t.c(this.dynamicSections, topSection.dynamicSections);
        }

        public int hashCode() {
            Label label = this.title;
            int iHashCode = (label == null ? 0 : label.hashCode()) * 31;
            Label label2 = this.section;
            int iHashCode2 = (iHashCode + (label2 == null ? 0 : label2.hashCode())) * 31;
            List<Label> list = this.staticSections;
            int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
            List<Label> list2 = this.dynamicSections;
            return iHashCode3 + (list2 != null ? list2.hashCode() : 0);
        }

        public String toString() {
            return "TopSection(title=" + this.title + ", section=" + this.section + ", staticSections=" + this.staticSections + ", dynamicSections=" + this.dynamicSections + ')';
        }
    }

    /* JADX INFO: renamed from: o20.l$e, reason: from toString */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"Lo20/l$e;", "Lo20/l;", "Lmx/a;", AnnotatedPrivateKey.LABEL, "", "Ln50/k;", "sections", "<init>", "(Lmx/a;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "()Lmx/a;", "b", "Ljava/util/List;", "()Ljava/util/List;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Section implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label label;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<n50.k> sections;

        /* JADX WARN: Multi-variable type inference failed */
        public Section(Label label, List<? extends n50.k> list) {
            this.label = label;
            this.sections = list;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Label getLabel() {
            return this.label;
        }

        public final List<n50.k> b() {
            return this.sections;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Section)) {
                return false;
            }
            Section section = (Section) other;
            return fr.t.c(this.label, section.label) && fr.t.c(this.sections, section.sections);
        }

        public int hashCode() {
            Label label = this.label;
            return ((label == null ? 0 : label.hashCode()) * 31) + this.sections.hashCode();
        }

        public String toString() {
            return "Section(label=" + this.label + ", sections=" + this.sections + ')';
        }

        public /* synthetic */ Section(Label label, List list, int i15, fr.k kVar) {
            this((i15 & 1) != 0 ? null : label, list);
        }
    }

    /* JADX INFO: renamed from: o20.l$k, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001a\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u0019R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001f¨\u0006 "}, d2 = {"Lo20/l$k;", "Lo20/l;", "Lmx/a;", "lastUpdateLabel", "lastUpdateValue", "updateButton", "updateButtonContentDescription", "Lkotlin/Function0;", "Loq/i0;", "onClick", "<init>", "(Lmx/a;Lmx/a;Lmx/a;Lmx/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "()Lmx/a;", "b", "c", "d", "e", "Ler/a;", "()Ler/a;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UpdateDataItem implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label lastUpdateLabel;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label lastUpdateValue;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label updateButton;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label updateButtonContentDescription;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<oq.i0> onClick;

        public UpdateDataItem(Label label, Label label2, Label label3, Label label4, er.a<oq.i0> aVar) {
            this.lastUpdateLabel = label;
            this.lastUpdateValue = label2;
            this.updateButton = label3;
            this.updateButtonContentDescription = label4;
            this.onClick = aVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Label getLastUpdateLabel() {
            return this.lastUpdateLabel;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Label getLastUpdateValue() {
            return this.lastUpdateValue;
        }

        public final er.a<oq.i0> c() {
            return this.onClick;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Label getUpdateButton() {
            return this.updateButton;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final Label getUpdateButtonContentDescription() {
            return this.updateButtonContentDescription;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UpdateDataItem)) {
                return false;
            }
            UpdateDataItem updateDataItem = (UpdateDataItem) other;
            return fr.t.c(this.lastUpdateLabel, updateDataItem.lastUpdateLabel) && fr.t.c(this.lastUpdateValue, updateDataItem.lastUpdateValue) && fr.t.c(this.updateButton, updateDataItem.updateButton) && fr.t.c(this.updateButtonContentDescription, updateDataItem.updateButtonContentDescription) && fr.t.c(this.onClick, updateDataItem.onClick);
        }

        public int hashCode() {
            int iHashCode = ((this.lastUpdateLabel.hashCode() * 31) + this.lastUpdateValue.hashCode()) * 31;
            Label label = this.updateButton;
            return ((((iHashCode + (label == null ? 0 : label.hashCode())) * 31) + this.updateButtonContentDescription.hashCode()) * 31) + this.onClick.hashCode();
        }

        public String toString() {
            return "UpdateDataItem(lastUpdateLabel=" + this.lastUpdateLabel + ", lastUpdateValue=" + this.lastUpdateValue + ", updateButton=" + this.updateButton + ", updateButtonContentDescription=" + this.updateButtonContentDescription + ", onClick=" + this.onClick + ')';
        }

        public /* synthetic */ UpdateDataItem(Label label, Label label2, Label label3, Label label4, er.a aVar, int i15, fr.k kVar) {
            this(label, label2, label3, (i15 & 8) != 0 ? c70.a.f23835a.a().N0() : label4, aVar);
        }
    }
}
