package w20;

import android.graphics.Bitmap;
import androidx.compose.ui.graphics.Color;
import e20.k;
import fr.t;
import h30.ButtonData;
import i30.ButtonIconData;
import java.util.List;
import l60.KeyValueData;
import mx.Label;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: renamed from: w20.d, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b2\b\u0087\b\u0018\u00002\u00020\u0001:\u0001*BÏ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010(\u001a\u00020\u00102\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010&R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b,\u00106\u001a\u0004\b9\u00108R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b>\u0010;\u001a\u0004\b?\u0010=R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\b@\u0010BR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b/\u0010.\u001a\u0004\bC\u00100R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u0017\u0010\u0012\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bH\u00106\u001a\u0004\bI\u00108R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\bC\u0010J\u001a\u0004\bK\u0010LR\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bH\u0010OR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b?\u0010;\u001a\u0004\bD\u0010=R\u0017\u0010\u0018\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b<\u0010E\u001a\u0004\b>\u0010GR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b9\u00106\u001a\u0004\b5\u00108R\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0006¢\u0006\f\n\u0004\b3\u0010P\u001a\u0004\b1\u0010QR\u0017\u0010\u001d\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b7\u00106\u001a\u0004\bM\u00108R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006¢\u0006\f\n\u0004\bK\u0010R\u001a\u0004\b:\u0010S¨\u0006T"}, d2 = {"Lw20/d;", "", "", "background", "foreground", "Landroid/graphics/Bitmap;", "photo", "Lmx/a;", "photoContentDescription", "noPhotoText", "Landroidx/compose/ui/graphics/Color;", "noPhotoForegroundColor", "noPhotoBackgroundColor", "Le20/k;", "flag", "logo", "", "isValid", "validityMessage", "Lh30/a;", "updateButtonData", "Lw20/d$a;", "keyValuesGroup", "keyValueItemsColor", "enabledAnimations", "animationsButtonText", "Lkotlin/Function0;", "Loq/i0;", "animationsButtonOnClick", "logoFlagContentDescription", "Li30/a;", "cornerButtonIconData", "<init>", "(ILjava/lang/Integer;Landroid/graphics/Bitmap;Lmx/a;Lmx/a;Landroidx/compose/ui/graphics/Color;Landroidx/compose/ui/graphics/Color;Le20/k;Ljava/lang/Integer;ZLmx/a;Lh30/a;Lw20/d$a;Landroidx/compose/ui/graphics/Color;ZLmx/a;Ler/a;Lmx/a;Li30/a;Lfr/k;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "e", "b", "Ljava/lang/Integer;", "i", "()Ljava/lang/Integer;", "c", "Landroid/graphics/Bitmap;", "q", "()Landroid/graphics/Bitmap;", "d", "Lmx/a;", "r", "()Lmx/a;", "p", "f", "Landroidx/compose/ui/graphics/Color;", "o", "()Landroidx/compose/ui/graphics/Color;", "g", "n", "h", "Le20/k;", "()Le20/k;", "l", "j", "Z", "u", "()Z", "k", "t", "Lh30/a;", "s", "()Lh30/a;", "m", "Lw20/d$a;", "()Lw20/d$a;", "Ler/a;", "()Ler/a;", "Li30/a;", "()Li30/a;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DocumentGiloshData {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f209344t = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int background;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer foreground;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Bitmap photo;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label photoContentDescription;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label noPhotoText;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final Color noPhotoForegroundColor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final Color noPhotoBackgroundColor;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final k flag;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer logo;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isValid;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label validityMessage;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final ButtonData updateButtonData;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final a keyValuesGroup;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final Color keyValueItemsColor;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean enabledAnimations;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label animationsButtonText;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final er.a<i0> animationsButtonOnClick;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label logoFlagContentDescription;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
    private final ButtonIconData cornerButtonIconData;

    /* JADX INFO: renamed from: w20.d$a */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000f"}, d2 = {"Lw20/d$a;", "", "", "Ll60/c;", "keyValueItems", "<init>", "(Ljava/util/List;)V", "a", "Ll60/c;", "()Ll60/c;", "firstKeyValueItem", "b", "Ljava/util/List;", "()Ljava/util/List;", "remainingKeyValueItems", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final KeyValueData firstKeyValueItem;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final List<KeyValueData> remainingKeyValueItems;

        public a(List<KeyValueData> list) {
            this.firstKeyValueItem = (KeyValueData) v.n0(list);
            this.remainingKeyValueItems = v.f0(list, 1);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final KeyValueData getFirstKeyValueItem() {
            return this.firstKeyValueItem;
        }

        public final List<KeyValueData> b() {
            return this.remainingKeyValueItems;
        }
    }

    public /* synthetic */ DocumentGiloshData(int i15, Integer num, Bitmap bitmap, Label label, Label label2, Color color, Color color2, k kVar, Integer num2, boolean z15, Label label3, ButtonData buttonData, a aVar, Color color3, boolean z16, Label label4, er.a aVar2, Label label5, ButtonIconData buttonIconData, fr.k kVar2) {
        this(i15, num, bitmap, label, label2, color, color2, kVar, num2, z15, label3, buttonData, aVar, color3, z16, label4, aVar2, label5, buttonIconData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 b() {
        return i0.f148189a;
    }

    public final er.a<i0> c() {
        return this.animationsButtonOnClick;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Label getAnimationsButtonText() {
        return this.animationsButtonText;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getBackground() {
        return this.background;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocumentGiloshData)) {
            return false;
        }
        DocumentGiloshData documentGiloshData = (DocumentGiloshData) other;
        return this.background == documentGiloshData.background && t.c(this.foreground, documentGiloshData.foreground) && t.c(this.photo, documentGiloshData.photo) && t.c(this.photoContentDescription, documentGiloshData.photoContentDescription) && t.c(this.noPhotoText, documentGiloshData.noPhotoText) && t.c(this.noPhotoForegroundColor, documentGiloshData.noPhotoForegroundColor) && t.c(this.noPhotoBackgroundColor, documentGiloshData.noPhotoBackgroundColor) && this.flag == documentGiloshData.flag && t.c(this.logo, documentGiloshData.logo) && this.isValid == documentGiloshData.isValid && t.c(this.validityMessage, documentGiloshData.validityMessage) && t.c(this.updateButtonData, documentGiloshData.updateButtonData) && t.c(this.keyValuesGroup, documentGiloshData.keyValuesGroup) && t.c(this.keyValueItemsColor, documentGiloshData.keyValueItemsColor) && this.enabledAnimations == documentGiloshData.enabledAnimations && t.c(this.animationsButtonText, documentGiloshData.animationsButtonText) && t.c(this.animationsButtonOnClick, documentGiloshData.animationsButtonOnClick) && t.c(this.logoFlagContentDescription, documentGiloshData.logoFlagContentDescription) && t.c(this.cornerButtonIconData, documentGiloshData.cornerButtonIconData);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final ButtonIconData getCornerButtonIconData() {
        return this.cornerButtonIconData;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getEnabledAnimations() {
        return this.enabledAnimations;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final k getFlag() {
        return this.flag;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.background) * 31;
        Integer num = this.foreground;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Bitmap bitmap = this.photo;
        int iHashCode3 = (((iHashCode2 + (bitmap == null ? 0 : bitmap.hashCode())) * 31) + this.photoContentDescription.hashCode()) * 31;
        Label label = this.noPhotoText;
        int iHashCode4 = (iHashCode3 + (label == null ? 0 : label.hashCode())) * 31;
        Color color = this.noPhotoForegroundColor;
        int iM17hashCodeimpl = (iHashCode4 + (color == null ? 0 : Color.m17hashCodeimpl(color.m20unboximpl()))) * 31;
        Color color2 = this.noPhotoBackgroundColor;
        int iM17hashCodeimpl2 = (((iM17hashCodeimpl + (color2 == null ? 0 : Color.m17hashCodeimpl(color2.m20unboximpl()))) * 31) + this.flag.hashCode()) * 31;
        Integer num2 = this.logo;
        int iHashCode5 = (((((iM17hashCodeimpl2 + (num2 == null ? 0 : num2.hashCode())) * 31) + Boolean.hashCode(this.isValid)) * 31) + this.validityMessage.hashCode()) * 31;
        ButtonData buttonData = this.updateButtonData;
        int iHashCode6 = (((iHashCode5 + (buttonData == null ? 0 : buttonData.hashCode())) * 31) + this.keyValuesGroup.hashCode()) * 31;
        Color color3 = this.keyValueItemsColor;
        int iM17hashCodeimpl3 = (((iHashCode6 + (color3 == null ? 0 : Color.m17hashCodeimpl(color3.m20unboximpl()))) * 31) + Boolean.hashCode(this.enabledAnimations)) * 31;
        Label label2 = this.animationsButtonText;
        int iHashCode7 = (((((iM17hashCodeimpl3 + (label2 == null ? 0 : label2.hashCode())) * 31) + this.animationsButtonOnClick.hashCode()) * 31) + this.logoFlagContentDescription.hashCode()) * 31;
        ButtonIconData buttonIconData = this.cornerButtonIconData;
        return iHashCode7 + (buttonIconData != null ? buttonIconData.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Integer getForeground() {
        return this.foreground;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Color getKeyValueItemsColor() {
        return this.keyValueItemsColor;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final a getKeyValuesGroup() {
        return this.keyValuesGroup;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final Integer getLogo() {
        return this.logo;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final Label getLogoFlagContentDescription() {
        return this.logoFlagContentDescription;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final Color getNoPhotoBackgroundColor() {
        return this.noPhotoBackgroundColor;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final Color getNoPhotoForegroundColor() {
        return this.noPhotoForegroundColor;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final Label getNoPhotoText() {
        return this.noPhotoText;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final Bitmap getPhoto() {
        return this.photo;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final Label getPhotoContentDescription() {
        return this.photoContentDescription;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final ButtonData getUpdateButtonData() {
        return this.updateButtonData;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final Label getValidityMessage() {
        return this.validityMessage;
    }

    public String toString() {
        return "DocumentGiloshData(background=" + this.background + ", foreground=" + this.foreground + ", photo=" + this.photo + ", photoContentDescription=" + this.photoContentDescription + ", noPhotoText=" + this.noPhotoText + ", noPhotoForegroundColor=" + this.noPhotoForegroundColor + ", noPhotoBackgroundColor=" + this.noPhotoBackgroundColor + ", flag=" + this.flag + ", logo=" + this.logo + ", isValid=" + this.isValid + ", validityMessage=" + this.validityMessage + ", updateButtonData=" + this.updateButtonData + ", keyValuesGroup=" + this.keyValuesGroup + ", keyValueItemsColor=" + this.keyValueItemsColor + ", enabledAnimations=" + this.enabledAnimations + ", animationsButtonText=" + this.animationsButtonText + ", animationsButtonOnClick=" + this.animationsButtonOnClick + ", logoFlagContentDescription=" + this.logoFlagContentDescription + ", cornerButtonIconData=" + this.cornerButtonIconData + ')';
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final boolean getIsValid() {
        return this.isValid;
    }

    private DocumentGiloshData(int i15, Integer num, Bitmap bitmap, Label label, Label label2, Color color, Color color2, k kVar, Integer num2, boolean z15, Label label3, ButtonData buttonData, a aVar, Color color3, boolean z16, Label label4, er.a<i0> aVar2, Label label5, ButtonIconData buttonIconData) {
        this.background = i15;
        this.foreground = num;
        this.photo = bitmap;
        this.photoContentDescription = label;
        this.noPhotoText = label2;
        this.noPhotoForegroundColor = color;
        this.noPhotoBackgroundColor = color2;
        this.flag = kVar;
        this.logo = num2;
        this.isValid = z15;
        this.validityMessage = label3;
        this.updateButtonData = buttonData;
        this.keyValuesGroup = aVar;
        this.keyValueItemsColor = color3;
        this.enabledAnimations = z16;
        this.animationsButtonText = label4;
        this.animationsButtonOnClick = aVar2;
        this.logoFlagContentDescription = label5;
        this.cornerButtonIconData = buttonIconData;
    }

    public /* synthetic */ DocumentGiloshData(int i15, Integer num, Bitmap bitmap, Label label, Label label2, Color color, Color color2, k kVar, Integer num2, boolean z15, Label label3, ButtonData buttonData, a aVar, Color color3, boolean z16, Label label4, er.a aVar2, Label label5, ButtonIconData buttonIconData, int i16, fr.k kVar2) {
        this(i15, num, bitmap, (i16 & 8) != 0 ? c70.a.f23835a.a().P() : label, (i16 & 16) != 0 ? null : label2, (i16 & 32) != 0 ? null : color, (i16 & 64) != 0 ? null : color2, kVar, (i16 & 256) != 0 ? null : num2, z15, label3, (i16 & 2048) != 0 ? null : buttonData, aVar, (i16 & PKIFailureInfo.certRevoked) != 0 ? null : color3, (i16 & 16384) != 0 ? true : z16, (32768 & i16) != 0 ? null : label4, (65536 & i16) != 0 ? new er.a() { // from class: w20.c
            @Override // er.a
            public final Object a() {
                return DocumentGiloshData.b();
            }
        } : aVar2, label5, (i16 & PKIFailureInfo.transactionIdInUse) != 0 ? null : buttonIconData, null);
    }
}
