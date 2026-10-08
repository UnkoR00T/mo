package androidx.compose.ui.node;

import a4.q0;
import a4.y;
import android.view.View;
import androidx.compose.ui.platform.b1;
import androidx.compose.ui.platform.c1;
import androidx.compose.ui.platform.f3;
import androidx.compose.ui.platform.m2;
import androidx.compose.ui.platform.n3;
import androidx.compose.ui.platform.r2;
import androidx.compose.ui.platform.v2;
import c5.t;
import g4.a1;
import g4.e0;
import g4.z0;
import l3.s;
import n3.h1;
import n3.x1;
import n4.a0;
import oq.i0;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p036e4.a2;
import p036e4.b2;
import p071kotlin.Metadata;
import v4.v0;
import x4.LocaleList;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000ü\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u0000 32\u00020\u0001:\u0004Õ\u0001Ö\u0001J5\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\nJ+\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004H&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0002H&¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0002H&¢\u0006\u0004\b\u0011\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0002H&¢\u0006\u0004\b\u0012\u0010\u000eJ\u0017\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0013H&¢\u0006\u0004\b\u0018\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0002H&¢\u0006\u0004\b\u0019\u0010\u000eJ\u0019\u0010\u001b\u001a\u00020\b2\b\b\u0002\u0010\u001a\u001a\u00020\u0004H&¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001dH&¢\u0006\u0004\b\u001f\u0010 J!\u0010!\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b!\u0010\"JE\u0010+\u001a\u00020*2\u001a\u0010&\u001a\u0016\u0012\u0004\u0012\u00020$\u0012\u0006\u0012\u0004\u0018\u00010%\u0012\u0004\u0012\u00020\b0#2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\b0'2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010%H&¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\bH&¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b/\u0010\u000eJ\u0017\u00100\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b0\u0010\u000eJ\u001f\u00103\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104J\u001f\u00105\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b5\u00104J\u001b\u00109\u001a\u00020\b2\n\u00108\u001a\u000606j\u0002`7H'¢\u0006\u0004\b9\u0010:J\u001d\u0010<\u001a\u00020\b2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\b0'H&¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\bH&¢\u0006\u0004\b>\u0010.J\u0017\u0010@\u001a\u00020\b2\u0006\u0010;\u001a\u00020?H&¢\u0006\u0004\b@\u0010AJ4\u0010G\u001a\u00020D2\"\u0010F\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020B\u0012\n\u0012\b\u0012\u0004\u0012\u00020D0C\u0012\u0006\u0012\u0004\u0018\u00010E0#H¦@¢\u0006\u0004\bG\u0010HJ\u0017\u0010K\u001a\u00020\b2\u0006\u0010J\u001a\u00020IH\u0016¢\u0006\u0004\bK\u0010LJ\u0017\u0010N\u001a\u00020\b2\u0006\u0010M\u001a\u00020\u0013H\u0016¢\u0006\u0004\bN\u0010OJ\u000f\u0010P\u001a\u00020\bH\u0016¢\u0006\u0004\bP\u0010.R\u0014\u0010S\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u0014\u0010W\u001a\u00020T8&X¦\u0004¢\u0006\u0006\u001a\u0004\bU\u0010VR\u0014\u0010[\u001a\u00020X8&X¦\u0004¢\u0006\u0006\u001a\u0004\bY\u0010ZR\u0014\u0010_\u001a\u00020\\8&X¦\u0004¢\u0006\u0006\u001a\u0004\b]\u0010^R\u0014\u0010c\u001a\u00020`8&X¦\u0004¢\u0006\u0006\u001a\u0004\ba\u0010bR\u0014\u0010g\u001a\u00020d8&X¦\u0004¢\u0006\u0006\u001a\u0004\be\u0010fR\u0014\u0010k\u001a\u00020h8&X¦\u0004¢\u0006\u0006\u001a\u0004\bi\u0010jR\u0014\u0010o\u001a\u00020l8&X¦\u0004¢\u0006\u0006\u001a\u0004\bm\u0010nR\u0014\u0010s\u001a\u00020p8&X¦\u0004¢\u0006\u0006\u001a\u0004\bq\u0010rR\u0014\u0010w\u001a\u00020t8&X¦\u0004¢\u0006\u0006\u001a\u0004\bu\u0010vR\u0016\u0010{\u001a\u0004\u0018\u00010x8&X¦\u0004¢\u0006\u0006\u001a\u0004\by\u0010zR\u0016\u0010\u007f\u001a\u0004\u0018\u00010|8&X¦\u0004¢\u0006\u0006\u001a\u0004\b}\u0010~R\u0018\u0010\u0083\u0001\u001a\u00030\u0080\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0018\u0010\u0087\u0001\u001a\u00030\u0084\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0018\u0010\u008b\u0001\u001a\u00030\u0088\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0018\u0010\u008f\u0001\u001a\u00030\u008c\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0018\u0010\u0093\u0001\u001a\u00030\u0090\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0018\u0010\u0097\u0001\u001a\u00030\u0094\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0018\u0010\u009b\u0001\u001a\u00030\u0098\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001R\u0018\u0010\u009f\u0001\u001a\u00030\u009c\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001R\u0018\u0010£\u0001\u001a\u00030 \u00018&X¦\u0004¢\u0006\b\u001a\u0006\b¡\u0001\u0010¢\u0001R\u001f\u0010¨\u0001\u001a\u00030¤\u00018&X§\u0004¢\u0006\u000f\u0012\u0005\b§\u0001\u0010.\u001a\u0006\b¥\u0001\u0010¦\u0001R\u0018\u0010¬\u0001\u001a\u00030©\u00018&X¦\u0004¢\u0006\b\u001a\u0006\bª\u0001\u0010«\u0001R\u0018\u0010°\u0001\u001a\u00030\u00ad\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b®\u0001\u0010¯\u0001R\u0018\u0010´\u0001\u001a\u00030±\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b²\u0001\u0010³\u0001R \u0010¸\u0001\u001a\u00020\u00048&@'X¦\u000e¢\u0006\u000f\u001a\u0006\bµ\u0001\u0010¶\u0001\"\u0005\b·\u0001\u0010\u001cR\u0018\u0010¼\u0001\u001a\u00030¹\u00018&X¦\u0004¢\u0006\b\u001a\u0006\bº\u0001\u0010»\u0001R\u0018\u0010À\u0001\u001a\u00030½\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b¾\u0001\u0010¿\u0001R\u0018\u0010Ä\u0001\u001a\u00030Á\u00018&X¦\u0004¢\u0006\b\u001a\u0006\bÂ\u0001\u0010Ã\u0001R\u0018\u0010È\u0001\u001a\u00030Å\u00018&X¦\u0004¢\u0006\b\u001a\u0006\bÆ\u0001\u0010Ç\u0001R\u0018\u0010Ì\u0001\u001a\u00030É\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÊ\u0001\u0010Ë\u0001R\u0018\u0010Ð\u0001\u001a\u00030Í\u00018&X¦\u0004¢\u0006\b\u001a\u0006\bÎ\u0001\u0010Ï\u0001R\u001a\u0010Ô\u0001\u001a\u0005\u0018\u00010Ñ\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÒ\u0001\u0010Ó\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006×\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/Owner;", "La4/q0;", "Landroidx/compose/ui/node/g;", "layoutNode", "", "affectsLookahead", "forceRequest", "scheduleMeasureAndLayout", "Loq/i0;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "(Landroidx/compose/ui/node/g;ZZZ)V", "g", "(Landroidx/compose/ui/node/g;ZZ)V", "l", "(Landroidx/compose/ui/node/g;)V", "node", "B", "w", "J", "Lm3/e;", "localPosition", "j", "(J)J", "positionInWindow", "F", "z", "sendPointerUpdate", "d", "(Z)V", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "E", "(Landroidx/compose/ui/node/g;J)V", "s", "(Landroidx/compose/ui/node/g;Z)V", "Lkotlin/Function2;", "Ln3/h1;", "Lq3/c;", "drawBlock", "Lkotlin/Function0;", "invalidateParentLayer", "explicitLayer", "Lg4/a1;", "G", "(Ler/p;Ler/a;Lq3/c;)Lg4/a1;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "()V", "q", "O", "", "oldSemanticsId", "o", "(Landroidx/compose/ui/node/g;I)V", "n", "Landroid/view/View;", "Landroidx/compose/ui/viewinterop/InteropView;", "view", "r", "(Landroid/view/View;)V", "listener", "Q", "(Ler/a;)V", "K", "Landroidx/compose/ui/node/Owner$b;", "A", "(Landroidx/compose/ui/node/Owner$b;)V", "Landroidx/compose/ui/platform/m2;", "Ltq/e;", "", "", "session", "R", "(Ler/p;Ltq/e;)Ljava/lang/Object;", "", "frameRate", "I", "(F)V", "delta", "v", "(J)V", "t", "getRoot", "()Landroidx/compose/ui/node/g;", "root", "Lg4/e0;", "getSharedDrawScope", "()Lg4/e0;", "sharedDrawScope", "Lv3/a;", "getHapticFeedBack", "()Lv3/a;", "hapticFeedBack", "Lw3/c;", "getInputModeManager", "()Lw3/c;", "inputModeManager", "Landroidx/compose/ui/platform/c1;", "getClipboardManager", "()Landroidx/compose/ui/platform/c1;", "clipboardManager", "Landroidx/compose/ui/platform/b1;", "getClipboard", "()Landroidx/compose/ui/platform/b1;", "clipboard", "Landroidx/compose/ui/platform/j;", "getAccessibilityManager", "()Landroidx/compose/ui/platform/j;", "accessibilityManager", "Ln3/x1;", "getGraphicsContext", "()Ln3/x1;", "graphicsContext", "Landroidx/compose/ui/platform/v2;", "getTextToolbar", "()Landroidx/compose/ui/platform/v2;", "textToolbar", "Lh3/p;", "getAutofillTree", "()Lh3/p;", "autofillTree", "Lh3/i;", "getAutofill", "()Lh3/i;", "autofill", "Lh3/n;", "getAutofillManager", "()Lh3/n;", "autofillManager", "Lc5/d;", "getDensity", "()Lc5/d;", "density", "Lv4/v0;", "getTextInputService", "()Lv4/v0;", "textInputService", "Landroidx/compose/ui/platform/r2;", "getSoftwareKeyboardController", "()Landroidx/compose/ui/platform/r2;", "softwareKeyboardController", "La4/y;", "getPointerIconService", "()La4/y;", "pointerIconService", "Ln4/a0;", "getSemanticsOwner", "()Ln4/a0;", "semanticsOwner", "Ll3/s;", "getFocusOwner", "()Ll3/s;", "focusOwner", "Landroidx/compose/ui/platform/n3;", "getWindowInfo", "()Landroidx/compose/ui/platform/n3;", "windowInfo", "Lz2/f;", "getRetainedValuesStore", "()Lz2/f;", "retainedValuesStore", "Lo4/d;", "getRectManager", "()Lo4/d;", "rectManager", "Lu4/k$b;", "getFontLoader", "()Lu4/k$b;", "getFontLoader$annotations", "fontLoader", "Lu4/l$b;", "getFontFamilyResolver", "()Lu4/l$b;", "fontFamilyResolver", "Lc5/t;", "getLayoutDirection", "()Lc5/t;", "layoutDirection", "Lx4/d;", "getLocaleList", "()Lx4/d;", "localeList", "getShowLayoutBounds", "()Z", "setShowLayoutBounds", "showLayoutBounds", "Landroidx/compose/ui/platform/f3;", "getViewConfiguration", "()Landroidx/compose/ui/platform/f3;", "viewConfiguration", "Lg4/c1;", "getSnapshotObserver", "()Lg4/c1;", "snapshotObserver", "Lf4/f;", "getModifierLocalManager", "()Lf4/f;", "modifierLocalManager", "Ltq/i;", "getCoroutineContext", "()Ltq/i;", "coroutineContext", "Le4/a2$a;", "getPlacementScope", "()Le4/a2$a;", "placementScope", "Lj3/d;", "getDragAndDropManager", "()Lj3/d;", "dragAndDropManager", "Lg4/z0;", "getOutOfFrameExecutor", "()Lg4/z0;", "outOfFrameExecutor", "a", "b", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface Owner extends q0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f10035a;

    /* JADX INFO: renamed from: androidx.compose.ui.node.Owner$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Landroidx/compose/ui/node/Owner$a;", "", "<init>", "()V", "", "b", "Z", "a", "()Z", "setEnableExtraAssertions", "(Z)V", "enableExtraAssertions", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f10035a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static boolean enableExtraAssertions;

        private Companion() {
        }

        public final boolean a() {
            return enableExtraAssertions;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/Owner$b;", "", "Loq/i0;", "q", "()V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface b {
        void q();
    }

    static /* synthetic */ a1 C(Owner owner, er.p pVar, er.a aVar, q3.c cVar, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createLayer");
        }
        if ((i15 & 4) != 0) {
            cVar = null;
        }
        return owner.G(pVar, aVar, cVar);
    }

    static /* synthetic */ void P(Owner owner, g gVar, boolean z15, boolean z16, boolean z17, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestMeasure");
        }
        if ((i15 & 2) != 0) {
            z15 = false;
        }
        if ((i15 & 4) != 0) {
            z16 = false;
        }
        if ((i15 & 8) != 0) {
            z17 = true;
        }
        owner.H(gVar, z15, z16, z17);
    }

    static /* synthetic */ void f(Owner owner, boolean z15, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: measureAndLayout");
        }
        if ((i15 & 1) != 0) {
            z15 = true;
        }
        owner.d(z15);
    }

    static /* synthetic */ void i(Owner owner, g gVar, boolean z15, boolean z16, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestRelayout");
        }
        if ((i15 & 2) != 0) {
            z15 = false;
        }
        if ((i15 & 4) != 0) {
            z16 = false;
        }
        owner.g(gVar, z15, z16);
    }

    static /* synthetic */ void u(Owner owner, g gVar, boolean z15, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: forceMeasureTheSubtree");
        }
        if ((i15 & 2) != 0) {
            z15 = false;
        }
        owner.s(gVar, z15);
    }

    void A(b listener);

    void B(g node);

    void E(g layoutNode, long constraints);

    long F(long positionInWindow);

    a1 G(er.p<? super h1, ? super q3.c, i0> drawBlock, er.a<i0> invalidateParentLayer, q3.c explicitLayer);

    void H(g layoutNode, boolean affectsLookahead, boolean forceRequest, boolean scheduleMeasureAndLayout);

    default void I(float frameRate) {
    }

    void J(g node);

    void K();

    void L();

    void O(g layoutNode);

    void Q(er.a<i0> listener);

    Object R(er.p<? super m2, ? super tq.e<?>, ? extends Object> pVar, tq.e<?> eVar);

    void d(boolean sendPointerUpdate);

    void g(g layoutNode, boolean affectsLookahead, boolean forceRequest);

    androidx.compose.ui.platform.j getAccessibilityManager();

    h3.i getAutofill();

    h3.n getAutofillManager();

    h3.p getAutofillTree();

    b1 getClipboard();

    c1 getClipboardManager();

    tq.i getCoroutineContext();

    c5.d getDensity();

    j3.d getDragAndDropManager();

    s getFocusOwner();

    u4.l.b getFontFamilyResolver();

    u4.k.b getFontLoader();

    x1 getGraphicsContext();

    v3.a getHapticFeedBack();

    w3.c getInputModeManager();

    t getLayoutDirection();

    LocaleList getLocaleList();

    f4.f getModifierLocalManager();

    default z0 getOutOfFrameExecutor() {
        return null;
    }

    default a2.a getPlacementScope() {
        return b2.b(this);
    }

    y getPointerIconService();

    o4.d getRectManager();

    z2.f getRetainedValuesStore();

    g getRoot();

    a0 getSemanticsOwner();

    e0 getSharedDrawScope();

    boolean getShowLayoutBounds();

    g4.c1 getSnapshotObserver();

    r2 getSoftwareKeyboardController();

    v0 getTextInputService();

    v2 getTextToolbar();

    f3 getViewConfiguration();

    n3 getWindowInfo();

    long j(long localPosition);

    void l(g layoutNode);

    default void n(g layoutNode, int oldSemanticsId) {
    }

    default void o(g layoutNode, int oldSemanticsId) {
    }

    void q(g layoutNode);

    void r(View view);

    void s(g layoutNode, boolean affectsLookahead);

    void setShowLayoutBounds(boolean z15);

    default void t() {
    }

    default void v(long delta) {
    }

    void w(g node);

    void z(g node);
}
