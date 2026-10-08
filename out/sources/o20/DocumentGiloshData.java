package o20;

import android.graphics.Bitmap;
import androidx.compose.ui.graphics.Color;
import h30.ButtonData;
import java.util.List;
import l60.KeyValueData;
import mx.Label;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: o20.r2, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b/\b\u0087\b\u0018\u00002\u00020\u0001BÝ\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\r\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004\u0012\u000e\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010\u0012\u000e\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\r\u0012\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u0010¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010)\u001a\u00020\u00142\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010$R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b4\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b8\u0010=\u001a\u0004\b>\u0010?R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b@\u0010=\u001a\u0004\bA\u0010?R\u001f\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00108\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u0017\u0010\u0016\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b0\u0010=\u001a\u0004\bN\u0010?R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\bH\u0010O\u001a\u0004\bP\u0010QR\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00048\u0006¢\u0006\f\n\u0004\bD\u0010/\u001a\u0004\bF\u00101R\u001f\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00108\u0006¢\u0006\f\n\u0004\bA\u0010C\u001a\u0004\bJ\u0010ER\u001f\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00108\u0006¢\u0006\f\n\u0004\b;\u0010C\u001a\u0004\bB\u0010ER\u0017\u0010\u001d\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b>\u0010K\u001a\u0004\b@\u0010MR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b-\u0010=\u001a\u0004\b6\u0010?R\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00108\u0006¢\u0006\f\n\u0004\bP\u0010R\u001a\u0004\b2\u0010S¨\u0006T"}, d2 = {"Lo20/r2;", "", "", "testTag", "", "Lo20/u2;", "markingsData", "Lo20/p;", "backgroundLayer", "Lo20/s2;", "documentVMS", "Landroid/graphics/Bitmap;", "photo", "Lmx/a;", "photoContentDescription", "noPhotoText", "Lkotlin/Function0;", "Landroidx/compose/ui/graphics/Color;", "noPhotoForegroundColor", "noPhotoBackgroundColor", "", "isValid", "validityMessage", "Lh30/a;", "updateButtonData", "Ll60/c;", "keyValueItems", "keyValueItemsColor", "keyTitleItemsColor", "enabledAnimations", "animationsButtonText", "Loq/i0;", "animationsButtonOnClick", "<init>", "(Ljava/lang/String;Ljava/util/List;Lo20/p;Lo20/s2;Landroid/graphics/Bitmap;Lmx/a;Lmx/a;Ler/p;Landroidx/compose/ui/graphics/Color;ZLmx/a;Lh30/a;Ljava/util/List;Ler/p;Ler/p;ZLmx/a;Ler/a;Lfr/k;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "q", "b", "Ljava/util/List;", "k", "()Ljava/util/List;", "c", "Lo20/p;", "e", "()Lo20/p;", "d", "Lo20/s2;", "f", "()Lo20/s2;", "Landroid/graphics/Bitmap;", "o", "()Landroid/graphics/Bitmap;", "Lmx/a;", "p", "()Lmx/a;", "g", "n", "h", "Ler/p;", "m", "()Ler/p;", "i", "Landroidx/compose/ui/graphics/Color;", "l", "()Landroidx/compose/ui/graphics/Color;", "j", "Z", "t", "()Z", "s", "Lh30/a;", "r", "()Lh30/a;", "Ler/a;", "()Ler/a;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DocumentGiloshData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String testTag;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<u2> markingsData;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final p backgroundLayer;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final s2 documentVMS;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Bitmap photo;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label photoContentDescription;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label noPhotoText;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final er.p<p076m2.r, Integer, Color> noPhotoForegroundColor;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final Color noPhotoBackgroundColor;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isValid;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label validityMessage;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final ButtonData updateButtonData;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<KeyValueData> keyValueItems;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final er.p<p076m2.r, Integer, Color> keyValueItemsColor;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final er.p<p076m2.r, Integer, Color> keyTitleItemsColor;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean enabledAnimations;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label animationsButtonText;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private final er.a<oq.i0> animationsButtonOnClick;

    public /* synthetic */ DocumentGiloshData(String str, List list, p pVar, s2 s2Var, Bitmap bitmap, Label label, Label label2, er.p pVar2, Color color, boolean z15, Label label3, ButtonData buttonData, List list2, er.p pVar3, er.p pVar4, boolean z16, Label label4, er.a aVar, fr.k kVar) {
        this(str, list, pVar, s2Var, bitmap, label, label2, pVar2, color, z15, label3, buttonData, list2, pVar3, pVar4, z16, label4, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 b() {
        return oq.i0.f148189a;
    }

    public final er.a<oq.i0> c() {
        return this.animationsButtonOnClick;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Label getAnimationsButtonText() {
        return this.animationsButtonText;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final p getBackgroundLayer() {
        return this.backgroundLayer;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocumentGiloshData)) {
            return false;
        }
        DocumentGiloshData documentGiloshData = (DocumentGiloshData) other;
        return fr.t.c(this.testTag, documentGiloshData.testTag) && fr.t.c(this.markingsData, documentGiloshData.markingsData) && fr.t.c(this.backgroundLayer, documentGiloshData.backgroundLayer) && fr.t.c(this.documentVMS, documentGiloshData.documentVMS) && fr.t.c(this.photo, documentGiloshData.photo) && fr.t.c(this.photoContentDescription, documentGiloshData.photoContentDescription) && fr.t.c(this.noPhotoText, documentGiloshData.noPhotoText) && fr.t.c(this.noPhotoForegroundColor, documentGiloshData.noPhotoForegroundColor) && fr.t.c(this.noPhotoBackgroundColor, documentGiloshData.noPhotoBackgroundColor) && this.isValid == documentGiloshData.isValid && fr.t.c(this.validityMessage, documentGiloshData.validityMessage) && fr.t.c(this.updateButtonData, documentGiloshData.updateButtonData) && fr.t.c(this.keyValueItems, documentGiloshData.keyValueItems) && fr.t.c(this.keyValueItemsColor, documentGiloshData.keyValueItemsColor) && fr.t.c(this.keyTitleItemsColor, documentGiloshData.keyTitleItemsColor) && this.enabledAnimations == documentGiloshData.enabledAnimations && fr.t.c(this.animationsButtonText, documentGiloshData.animationsButtonText) && fr.t.c(this.animationsButtonOnClick, documentGiloshData.animationsButtonOnClick);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final s2 getDocumentVMS() {
        return this.documentVMS;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getEnabledAnimations() {
        return this.enabledAnimations;
    }

    public final er.p<p076m2.r, Integer, Color> h() {
        return this.keyTitleItemsColor;
    }

    public int hashCode() {
        String str = this.testTag;
        int iHashCode = (((((((str == null ? 0 : str.hashCode()) * 31) + this.markingsData.hashCode()) * 31) + this.backgroundLayer.hashCode()) * 31) + this.documentVMS.hashCode()) * 31;
        Bitmap bitmap = this.photo;
        int iHashCode2 = (((iHashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31) + this.photoContentDescription.hashCode()) * 31;
        Label label = this.noPhotoText;
        int iHashCode3 = (((iHashCode2 + (label == null ? 0 : label.hashCode())) * 31) + this.noPhotoForegroundColor.hashCode()) * 31;
        Color color = this.noPhotoBackgroundColor;
        int iM17hashCodeimpl = (((((iHashCode3 + (color == null ? 0 : Color.m17hashCodeimpl(color.m20unboximpl()))) * 31) + Boolean.hashCode(this.isValid)) * 31) + this.validityMessage.hashCode()) * 31;
        ButtonData buttonData = this.updateButtonData;
        int iHashCode4 = (((((((((iM17hashCodeimpl + (buttonData == null ? 0 : buttonData.hashCode())) * 31) + this.keyValueItems.hashCode()) * 31) + this.keyValueItemsColor.hashCode()) * 31) + this.keyTitleItemsColor.hashCode()) * 31) + Boolean.hashCode(this.enabledAnimations)) * 31;
        Label label2 = this.animationsButtonText;
        return ((iHashCode4 + (label2 != null ? label2.hashCode() : 0)) * 31) + this.animationsButtonOnClick.hashCode();
    }

    public final List<KeyValueData> i() {
        return this.keyValueItems;
    }

    public final er.p<p076m2.r, Integer, Color> j() {
        return this.keyValueItemsColor;
    }

    public final List<u2> k() {
        return this.markingsData;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final Color getNoPhotoBackgroundColor() {
        return this.noPhotoBackgroundColor;
    }

    public final er.p<p076m2.r, Integer, Color> m() {
        return this.noPhotoForegroundColor;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final Label getNoPhotoText() {
        return this.noPhotoText;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final Bitmap getPhoto() {
        return this.photo;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final Label getPhotoContentDescription() {
        return this.photoContentDescription;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final String getTestTag() {
        return this.testTag;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final ButtonData getUpdateButtonData() {
        return this.updateButtonData;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final Label getValidityMessage() {
        return this.validityMessage;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final boolean getIsValid() {
        return this.isValid;
    }

    public String toString() {
        return "DocumentGiloshData(testTag=" + this.testTag + ", markingsData=" + this.markingsData + ", backgroundLayer=" + this.backgroundLayer + ", documentVMS=" + this.documentVMS + ", photo=" + this.photo + ", photoContentDescription=" + this.photoContentDescription + ", noPhotoText=" + this.noPhotoText + ", noPhotoForegroundColor=" + this.noPhotoForegroundColor + ", noPhotoBackgroundColor=" + this.noPhotoBackgroundColor + ", isValid=" + this.isValid + ", validityMessage=" + this.validityMessage + ", updateButtonData=" + this.updateButtonData + ", keyValueItems=" + this.keyValueItems + ", keyValueItemsColor=" + this.keyValueItemsColor + ", keyTitleItemsColor=" + this.keyTitleItemsColor + ", enabledAnimations=" + this.enabledAnimations + ", animationsButtonText=" + this.animationsButtonText + ", animationsButtonOnClick=" + this.animationsButtonOnClick + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    private DocumentGiloshData(String str, List<? extends u2> list, p pVar, s2 s2Var, Bitmap bitmap, Label label, Label label2, er.p<? super p076m2.r, ? super Integer, Color> pVar2, Color color, boolean z15, Label label3, ButtonData buttonData, List<KeyValueData> list2, er.p<? super p076m2.r, ? super Integer, Color> pVar3, er.p<? super p076m2.r, ? super Integer, Color> pVar4, boolean z16, Label label4, er.a<oq.i0> aVar) {
        this.testTag = str;
        this.markingsData = list;
        this.backgroundLayer = pVar;
        this.documentVMS = s2Var;
        this.photo = bitmap;
        this.photoContentDescription = label;
        this.noPhotoText = label2;
        this.noPhotoForegroundColor = pVar2;
        this.noPhotoBackgroundColor = color;
        this.isValid = z15;
        this.validityMessage = label3;
        this.updateButtonData = buttonData;
        this.keyValueItems = list2;
        this.keyValueItemsColor = pVar3;
        this.keyTitleItemsColor = pVar4;
        this.enabledAnimations = z16;
        this.animationsButtonText = label4;
        this.animationsButtonOnClick = aVar;
    }

    public /* synthetic */ DocumentGiloshData(String str, List list, p pVar, s2 s2Var, Bitmap bitmap, Label label, Label label2, er.p pVar2, Color color, boolean z15, Label label3, ButtonData buttonData, List list2, er.p pVar3, er.p pVar4, boolean z16, Label label4, er.a aVar, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? null : str, list, pVar, s2Var, bitmap, (i15 & 32) != 0 ? c70.a.f23835a.a().P() : label, (i15 & 64) != 0 ? null : label2, pVar2, (i15 & 256) != 0 ? null : color, z15, label3, (i15 & 2048) != 0 ? null : buttonData, list2, pVar3, pVar4, (32768 & i15) != 0 ? true : z16, (65536 & i15) != 0 ? null : label4, (i15 & PKIFailureInfo.unsupportedVersion) != 0 ? new er.a() { // from class: o20.q2
            @Override // er.a
            public final Object a() {
                return DocumentGiloshData.b();
            }
        } : aVar, null);
    }
}
