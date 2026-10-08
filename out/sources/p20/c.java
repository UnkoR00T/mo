package p20;

import android.graphics.Bitmap;
import androidx.compose.ui.graphics.Color;
import er.l;
import fr.k;
import h30.ButtonData;
import java.util.List;
import k30.d;
import l60.KeyValueData;
import mx.Label;
import n20.State;
import o20.DocumentGiloshData;
import o20.p;
import o20.s2;
import o20.u2;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import p076m2.r;
import p076m2.t;
import xw.f;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u0004\u0018\u00010\n*\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lp20/c;", "Lxw/f;", "Lp20/c$a;", "Lo20/r2;", "<init>", "()V", "Ly20/b;", "", "f", "(Ly20/b;)Z", "Lmx/a;", "e", "(Ly20/b;)Lmx/a;", "params", "h", "(Lp20/c$a;)Lo20/r2;", "a", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements f<Params, DocumentGiloshData> {

    /* JADX INFO: renamed from: p20.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b.\b\u0087\b\u0018\u00002\u00020\u0001BÕ\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u000b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\r\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0002\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r\u0012\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r\u0012\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00150\u001b\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010)\u001a\u00020\u00112\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001b\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00058\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b3\u00105R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u001f\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0017\u0010\u0013\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bJ\u0010;\u001a\u0004\bK\u0010=R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\bL\u0010;\u001a\u0004\b>\u0010=R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\r8\u0006¢\u0006\f\n\u0004\b-\u0010M\u001a\u0004\bB\u0010NR\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00028\u0006¢\u0006\f\n\u0004\bD\u0010,\u001a\u0004\bJ\u0010.R\u001f\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r8\u0006¢\u0006\f\n\u0004\b@\u0010?\u001a\u0004\bL\u0010AR\u001f\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r8\u0006¢\u0006\f\n\u0004\b<\u0010?\u001a\u0004\bF\u0010AR#\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00150\u001b8\u0006¢\u0006\f\n\u0004\b8\u0010O\u001a\u0004\b6\u0010PR\u0017\u0010\u001f\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b1\u0010Q\u001a\u0004\b:\u0010R¨\u0006S"}, d2 = {"Lp20/c$a;", "", "", "Lo20/u2;", "markingsData", "Ln20/b;", "state", "Lo20/p;", "backgroundLayer", "Landroid/graphics/Bitmap;", "photo", "Lmx/a;", "noPhotoText", "Lkotlin/Function0;", "Landroidx/compose/ui/graphics/Color;", "noPhotoForegroundColor", "noPhotoBackgroundColor", "", "isValid", "validityMessage", "getNewDocumentButton", "Loq/i0;", "getNewDocumentOnClick", "Ll60/c;", "keyValueItems", "keyValueItemsColor", "keyTitleItemsColor", "Lkotlin/Function1;", "Ln20/a;", "dispatchAction", "Lo20/s2;", "documentVMS", "<init>", "(Ljava/util/List;Ln20/b;Lo20/p;Landroid/graphics/Bitmap;Lmx/a;Ler/p;Landroidx/compose/ui/graphics/Color;ZLmx/a;Lmx/a;Ler/a;Ljava/util/List;Ler/p;Ler/p;Ler/l;Lo20/s2;Lfr/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "k", "()Ljava/util/List;", "b", "Ln20/b;", "p", "()Ln20/b;", "c", "Lo20/p;", "()Lo20/p;", "d", "Landroid/graphics/Bitmap;", "o", "()Landroid/graphics/Bitmap;", "e", "Lmx/a;", "n", "()Lmx/a;", "f", "Ler/p;", "m", "()Ler/p;", "g", "Landroidx/compose/ui/graphics/Color;", "l", "()Landroidx/compose/ui/graphics/Color;", "h", "Z", "r", "()Z", "i", "q", "j", "Ler/a;", "()Ler/a;", "Ler/l;", "()Ler/l;", "Lo20/s2;", "()Lo20/s2;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<u2> markingsData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final State<?> state;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final p backgroundLayer;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Bitmap photo;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label noPhotoText;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.p<r, Integer, Color> noPhotoForegroundColor;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final Color noPhotoBackgroundColor;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isValid;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label validityMessage;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label getNewDocumentButton;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> getNewDocumentOnClick;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<KeyValueData> keyValueItems;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.p<r, Integer, Color> keyValueItemsColor;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.p<r, Integer, Color> keyTitleItemsColor;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<n20.a, i0> dispatchAction;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
        private final s2 documentVMS;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX INFO: renamed from: p20.c$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C3732a implements er.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C3732a f151772a = new C3732a();

            C3732a() {
            }

            @Override // er.p
            public /* bridge */ /* synthetic */ Object B(Object obj, Object obj2) {
                return c((r) obj, ((Number) obj2).intValue());
            }

            public final Void c(r rVar, int i15) {
                rVar.X(1055937427);
                if (t.k()) {
                    t.o(1055937427, i15, -1, "pl.gov.coi.common.ui.document.component.mapper.DocumentGiloshScreenMapper.Params.<init>.<anonymous> (DocumentGiloshScreenMapper.kt:27)");
                }
                if (t.k()) {
                    t.n();
                }
                rVar.R();
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX INFO: renamed from: p20.c$a$b */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class b implements er.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f151773a = new b();

            b() {
            }

            @Override // er.p
            public /* bridge */ /* synthetic */ Object B(Object obj, Object obj2) {
                return c((r) obj, ((Number) obj2).intValue());
            }

            public final Void c(r rVar, int i15) {
                rVar.X(1329835353);
                if (t.k()) {
                    t.o(1329835353, i15, -1, "pl.gov.coi.common.ui.document.component.mapper.DocumentGiloshScreenMapper.Params.<init>.<anonymous> (DocumentGiloshScreenMapper.kt:34)");
                }
                if (t.k()) {
                    t.n();
                }
                rVar.R();
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX INFO: renamed from: p20.c$a$c, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C3733c implements er.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C3733c f151774a = new C3733c();

            C3733c() {
            }

            @Override // er.p
            public /* bridge */ /* synthetic */ Object B(Object obj, Object obj2) {
                return c((r) obj, ((Number) obj2).intValue());
            }

            public final Void c(r rVar, int i15) {
                rVar.X(171617792);
                if (t.k()) {
                    t.o(171617792, i15, -1, "pl.gov.coi.common.ui.document.component.mapper.DocumentGiloshScreenMapper.Params.<init>.<anonymous> (DocumentGiloshScreenMapper.kt:35)");
                }
                if (t.k()) {
                    t.n();
                }
                rVar.R();
                return null;
            }
        }

        public /* synthetic */ Params(List list, State state, p pVar, Bitmap bitmap, Label label, er.p pVar2, Color color, boolean z15, Label label2, Label label3, er.a aVar, List list2, er.p pVar3, er.p pVar4, l lVar, s2 s2Var, k kVar) {
            this(list, state, pVar, bitmap, label, pVar2, color, z15, label2, label3, aVar, list2, pVar3, pVar4, lVar, s2Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 b() {
            return i0.f148189a;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final p getBackgroundLayer() {
            return this.backgroundLayer;
        }

        public final l<n20.a, i0> d() {
            return this.dispatchAction;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final s2 getDocumentVMS() {
            return this.documentVMS;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return fr.t.c(this.markingsData, params.markingsData) && fr.t.c(this.state, params.state) && fr.t.c(this.backgroundLayer, params.backgroundLayer) && fr.t.c(this.photo, params.photo) && fr.t.c(this.noPhotoText, params.noPhotoText) && fr.t.c(this.noPhotoForegroundColor, params.noPhotoForegroundColor) && fr.t.c(this.noPhotoBackgroundColor, params.noPhotoBackgroundColor) && this.isValid == params.isValid && fr.t.c(this.validityMessage, params.validityMessage) && fr.t.c(this.getNewDocumentButton, params.getNewDocumentButton) && fr.t.c(this.getNewDocumentOnClick, params.getNewDocumentOnClick) && fr.t.c(this.keyValueItems, params.keyValueItems) && fr.t.c(this.keyValueItemsColor, params.keyValueItemsColor) && fr.t.c(this.keyTitleItemsColor, params.keyTitleItemsColor) && fr.t.c(this.dispatchAction, params.dispatchAction) && fr.t.c(this.documentVMS, params.documentVMS);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final Label getGetNewDocumentButton() {
            return this.getNewDocumentButton;
        }

        public final er.a<i0> g() {
            return this.getNewDocumentOnClick;
        }

        public final er.p<r, Integer, Color> h() {
            return this.keyTitleItemsColor;
        }

        public int hashCode() {
            int iHashCode = ((((this.markingsData.hashCode() * 31) + this.state.hashCode()) * 31) + this.backgroundLayer.hashCode()) * 31;
            Bitmap bitmap = this.photo;
            int iHashCode2 = (iHashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31;
            Label label = this.noPhotoText;
            int iHashCode3 = (((iHashCode2 + (label == null ? 0 : label.hashCode())) * 31) + this.noPhotoForegroundColor.hashCode()) * 31;
            Color color = this.noPhotoBackgroundColor;
            int iM17hashCodeimpl = (((((iHashCode3 + (color == null ? 0 : Color.m17hashCodeimpl(color.m20unboximpl()))) * 31) + Boolean.hashCode(this.isValid)) * 31) + this.validityMessage.hashCode()) * 31;
            Label label2 = this.getNewDocumentButton;
            return ((((((((((((iM17hashCodeimpl + (label2 != null ? label2.hashCode() : 0)) * 31) + this.getNewDocumentOnClick.hashCode()) * 31) + this.keyValueItems.hashCode()) * 31) + this.keyValueItemsColor.hashCode()) * 31) + this.keyTitleItemsColor.hashCode()) * 31) + this.dispatchAction.hashCode()) * 31) + this.documentVMS.hashCode();
        }

        public final List<KeyValueData> i() {
            return this.keyValueItems;
        }

        public final er.p<r, Integer, Color> j() {
            return this.keyValueItemsColor;
        }

        public final List<u2> k() {
            return this.markingsData;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final Color getNoPhotoBackgroundColor() {
            return this.noPhotoBackgroundColor;
        }

        public final er.p<r, Integer, Color> m() {
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

        public final State<?> p() {
            return this.state;
        }

        /* JADX INFO: renamed from: q, reason: from getter */
        public final Label getValidityMessage() {
            return this.validityMessage;
        }

        /* JADX INFO: renamed from: r, reason: from getter */
        public final boolean getIsValid() {
            return this.isValid;
        }

        public String toString() {
            return "Params(markingsData=" + this.markingsData + ", state=" + this.state + ", backgroundLayer=" + this.backgroundLayer + ", photo=" + this.photo + ", noPhotoText=" + this.noPhotoText + ", noPhotoForegroundColor=" + this.noPhotoForegroundColor + ", noPhotoBackgroundColor=" + this.noPhotoBackgroundColor + ", isValid=" + this.isValid + ", validityMessage=" + this.validityMessage + ", getNewDocumentButton=" + this.getNewDocumentButton + ", getNewDocumentOnClick=" + this.getNewDocumentOnClick + ", keyValueItems=" + this.keyValueItems + ", keyValueItemsColor=" + this.keyValueItemsColor + ", keyTitleItemsColor=" + this.keyTitleItemsColor + ", dispatchAction=" + this.dispatchAction + ", documentVMS=" + this.documentVMS + ')';
        }

        /* JADX WARN: Multi-variable type inference failed */
        private Params(List<? extends u2> list, State<?> state, p pVar, Bitmap bitmap, Label label, er.p<? super r, ? super Integer, Color> pVar2, Color color, boolean z15, Label label2, Label label3, er.a<i0> aVar, List<KeyValueData> list2, er.p<? super r, ? super Integer, Color> pVar3, er.p<? super r, ? super Integer, Color> pVar4, l<? super n20.a, i0> lVar, s2 s2Var) {
            this.markingsData = list;
            this.state = state;
            this.backgroundLayer = pVar;
            this.photo = bitmap;
            this.noPhotoText = label;
            this.noPhotoForegroundColor = pVar2;
            this.noPhotoBackgroundColor = color;
            this.isValid = z15;
            this.validityMessage = label2;
            this.getNewDocumentButton = label3;
            this.getNewDocumentOnClick = aVar;
            this.keyValueItems = list2;
            this.keyValueItemsColor = pVar3;
            this.keyTitleItemsColor = pVar4;
            this.dispatchAction = lVar;
            this.documentVMS = s2Var;
        }

        public /* synthetic */ Params(List list, State state, p pVar, Bitmap bitmap, Label label, er.p pVar2, Color color, boolean z15, Label label2, Label label3, er.a aVar, List list2, er.p pVar3, er.p pVar4, l lVar, s2 s2Var, int i15, k kVar) {
            this(list, state, pVar, bitmap, (i15 & 16) != 0 ? null : label, (i15 & 32) != 0 ? C3732a.f151772a : pVar2, (i15 & 64) != 0 ? null : color, z15, label2, label3, (i15 & 1024) != 0 ? new er.a() { // from class: p20.b
                @Override // er.a
                public final Object a() {
                    return c.Params.b();
                }
            } : aVar, list2, (i15 & PKIFailureInfo.certConfirmed) != 0 ? b.f151773a : pVar3, (i15 & PKIFailureInfo.certRevoked) != 0 ? C3733c.f151774a : pVar4, lVar, s2Var, null);
        }
    }

    private final Label e(y20.b bVar) {
        Label labelZ0;
        if (bVar instanceof y20.b.AnimationsDisabled) {
            labelZ0 = c70.a.f23835a.a().j0();
        } else {
            if (!(bVar instanceof y20.b.AnimationsEnabled)) {
                throw new oq.p();
            }
            labelZ0 = c70.a.f23835a.a().z0();
        }
        if (bVar.getToggleEnabled()) {
            return labelZ0;
        }
        return null;
    }

    private final boolean f(y20.b bVar) {
        return bVar instanceof y20.b.AnimationsEnabled;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(Params params) {
        params.d().b(y20.a.f223428a);
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public DocumentGiloshData b(final Params params) {
        ButtonData buttonData;
        List<u2> listK = params.k();
        p backgroundLayer = params.getBackgroundLayer();
        Bitmap photo = params.getPhoto();
        Label noPhotoText = params.getNoPhotoText();
        er.p<r, Integer, Color> pVarM = params.m();
        Color noPhotoBackgroundColor = params.getNoPhotoBackgroundColor();
        boolean isValid = params.getIsValid();
        Label validityMessage = params.getValidityMessage();
        if (params.getGetNewDocumentButton() != null) {
            buttonData = new ButtonData(params.getGetNewDocumentButton().getTag(), null, k30.a.b.f107765a, new k30.c.WithText(params.getGetNewDocumentButton(), null, 2, null), d.a.f107773a, null, params.g(), 34, null);
        } else {
            buttonData = null;
        }
        if (params.getIsValid()) {
            buttonData = null;
        }
        return new DocumentGiloshData(null, listK, backgroundLayer, params.getDocumentVMS(), photo, null, noPhotoText, pVarM, noPhotoBackgroundColor, isValid, validityMessage, buttonData, params.i(), params.j(), params.h(), f(params.p().getAnimationsState()), e(params.p().getAnimationsState()), new er.a() { // from class: p20.a
            @Override // er.a
            public final Object a() {
                return c.i(params);
            }
        }, 33, null);
    }
}
