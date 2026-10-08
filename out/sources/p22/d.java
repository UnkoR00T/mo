package p22;

import androidx.compose.ui.graphics.Color;
import d12.NewMessageFieldData;
import er.l;
import er.p;
import fr.t;
import g30.ModalBottomSheetData;
import g30.ModalSheetState;
import g30.v;
import h30.ButtonData;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mx.Label;
import oq.i0;
import oq.y;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v0;
import s22.q;
import t50.TextAreaData;
import t50.e;
import t50.s;
import x50.NavigationButtonData;
import x50.i;
import xw.f;
import z30.FileBottomSheetItemData;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 32\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u00021/B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ?\u0010\u0017\u001a\u00020\u00162\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0018JU\u0010'\u001a\u00020&2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00100\u00132\b\b\u0002\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b'\u0010(J\u001d\u0010+\u001a\u00020*2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002¢\u0006\u0004\b+\u0010,J\u0018\u0010-\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102¨\u00064"}, d2 = {"Lp22/d;", "Lxw/f;", "Lp22/d$b;", "Lo22/c$a;", "Lmx/c;", "labelProvider", "Ls22/q;", "filePickerMapper", "<init>", "(Lmx/c;Ls22/q;)V", "params", "", "Ld12/b;", "f", "(Lp22/d$b;)Ljava/util/List;", "Lkotlin/Function0;", "Loq/i0;", "backAction", "closeAction", "Lkotlin/Function1;", "Lg30/v;", "bottomSheetChangeAction", "Li50/a;", "l", "(Ler/a;Ler/a;Ler/l;)Li50/a;", "", "enabled", "Lmx/a;", AnnotatedPrivateKey.LABEL, "", "value", "", "maxLength", "Lt50/e;", "state", "onValueChanged", "Lt50/s;", "type", "Lt50/d;", "r", "(ZLmx/a;Ljava/lang/String;ILt50/e;Ler/l;Lt50/s;)Lt50/d;", "onClick", "Lh30/a;", "q", "(Ler/a;)Lh30/a;", "h", "(Lp22/d$b;)Lo22/c$a;", "a", "Lmx/c;", "b", "Ls22/q;", "c", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements f<Params, o22.c.Data> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f151915d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final q filePickerMapper;

    /* JADX INFO: renamed from: p22.d$b, reason: from toString */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B¿\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\b\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00050\b\u0012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b \u0010&R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b'\u0010%\u001a\u0004\b'\u0010&R#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b,\u0010)\u001a\u0004\b(\u0010+R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b-\u0010)\u001a\u0004\b$\u0010+R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b.\u0010%\u001a\u0004\b,\u0010&R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b/\u0010%\u001a\u0004\b0\u0010&R#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b0\u0010)\u001a\u0004\b.\u0010+R#\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b\"\u0010)\u001a\u0004\b-\u0010+R#\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b*\u0010)\u001a\u0004\b/\u0010+¨\u00061"}, d2 = {"Lp22/d$b;", "", "Lo22/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "backAction", "closeAction", "Lkotlin/Function1;", "", "titleChangeValueAction", "contentChangeValueAction", "caseSignChangeValueAction", "nextAction", "onScrollToFieldAction", "Lm02/c;", "onDeleteFileClick", "Lg30/v;", "onBottomSheetStateChanged", "Lt22/a;", "onPickerActionSelected", "<init>", "(Lo22/b;Ler/a;Ler/a;Ler/l;Ler/l;Ler/l;Ler/a;Ler/a;Ler/l;Ler/l;Ler/l;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lo22/b;", "j", "()Lo22/b;", "b", "Ler/a;", "()Ler/a;", "c", "d", "Ler/l;", "k", "()Ler/l;", "e", "f", "g", "h", "i", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final o22.b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> backAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> closeAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> titleChangeValueAction;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> contentChangeValueAction;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> caseSignChangeValueAction;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> nextAction;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onScrollToFieldAction;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<m02.c, i0> onDeleteFileClick;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<v, i0> onBottomSheetStateChanged;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<t22.a, i0> onPickerActionSelected;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(o22.b bVar, er.a<i0> aVar, er.a<i0> aVar2, l<? super String, i0> lVar, l<? super String, i0> lVar2, l<? super String, i0> lVar3, er.a<i0> aVar3, er.a<i0> aVar4, l<? super m02.c, i0> lVar4, l<? super v, i0> lVar5, l<? super t22.a, i0> lVar6) {
            this.state = bVar;
            this.backAction = aVar;
            this.closeAction = aVar2;
            this.titleChangeValueAction = lVar;
            this.contentChangeValueAction = lVar2;
            this.caseSignChangeValueAction = lVar3;
            this.nextAction = aVar3;
            this.onScrollToFieldAction = aVar4;
            this.onDeleteFileClick = lVar4;
            this.onBottomSheetStateChanged = lVar5;
            this.onPickerActionSelected = lVar6;
        }

        public final er.a<i0> a() {
            return this.backAction;
        }

        public final l<String, i0> b() {
            return this.caseSignChangeValueAction;
        }

        public final er.a<i0> c() {
            return this.closeAction;
        }

        public final l<String, i0> d() {
            return this.contentChangeValueAction;
        }

        public final er.a<i0> e() {
            return this.nextAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.backAction, params.backAction) && t.c(this.closeAction, params.closeAction) && t.c(this.titleChangeValueAction, params.titleChangeValueAction) && t.c(this.contentChangeValueAction, params.contentChangeValueAction) && t.c(this.caseSignChangeValueAction, params.caseSignChangeValueAction) && t.c(this.nextAction, params.nextAction) && t.c(this.onScrollToFieldAction, params.onScrollToFieldAction) && t.c(this.onDeleteFileClick, params.onDeleteFileClick) && t.c(this.onBottomSheetStateChanged, params.onBottomSheetStateChanged) && t.c(this.onPickerActionSelected, params.onPickerActionSelected);
        }

        public final l<v, i0> f() {
            return this.onBottomSheetStateChanged;
        }

        public final l<m02.c, i0> g() {
            return this.onDeleteFileClick;
        }

        public final l<t22.a, i0> h() {
            return this.onPickerActionSelected;
        }

        public int hashCode() {
            return (((((((((((((((((((this.state.hashCode() * 31) + this.backAction.hashCode()) * 31) + this.closeAction.hashCode()) * 31) + this.titleChangeValueAction.hashCode()) * 31) + this.contentChangeValueAction.hashCode()) * 31) + this.caseSignChangeValueAction.hashCode()) * 31) + this.nextAction.hashCode()) * 31) + this.onScrollToFieldAction.hashCode()) * 31) + this.onDeleteFileClick.hashCode()) * 31) + this.onBottomSheetStateChanged.hashCode()) * 31) + this.onPickerActionSelected.hashCode();
        }

        public final er.a<i0> i() {
            return this.onScrollToFieldAction;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final o22.b getState() {
            return this.state;
        }

        public final l<String, i0> k() {
            return this.titleChangeValueAction;
        }

        public String toString() {
            return "Params(state=" + this.state + ", backAction=" + this.backAction + ", closeAction=" + this.closeAction + ", titleChangeValueAction=" + this.titleChangeValueAction + ", contentChangeValueAction=" + this.contentChangeValueAction + ", caseSignChangeValueAction=" + this.caseSignChangeValueAction + ", nextAction=" + this.nextAction + ", onScrollToFieldAction=" + this.onScrollToFieldAction + ", onDeleteFileClick=" + this.onDeleteFileClick + ", onBottomSheetStateChanged=" + this.onBottomSheetStateChanged + ", onPickerActionSelected=" + this.onPickerActionSelected + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f151929a = new c();

        c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-1865043308);
            if (p076m2.t.k()) {
                p076m2.t.o(-1865043308, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messagewizard.edormessageform.mapper.EdorMessageFormMapper.mapToBaseScaffoldData.<anonymous> (EdorMessageFormMapper.kt:167)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jB;
        }
    }

    public d(mx.c cVar, q qVar) {
        this.labelProvider = cVar;
        this.filePickerMapper = qVar;
    }

    private final List<NewMessageFieldData> f(Params params) {
        d12.a aVar = d12.a.TITTLE;
        z02.a entryMessageType = params.getState().getEntryMessageType();
        boolean z15 = false;
        if (!(entryMessageType instanceof z02.a.ForwardMessage) && !(entryMessageType instanceof z02.a.Reply)) {
            z15 = true;
            if (!t.c(entryMessageType, z02.a.c.f231893a) && !(entryMessageType instanceof z02.a.EditDraft)) {
                throw new oq.p();
            }
        }
        return pq.v.q(new NewMessageFieldData(aVar, s(this, z15, this.labelProvider.c(e02.a.C3), params.getState().getTitleValue(), GF2Field.MASK, params.getState().getTitleValidationState(), params.k(), null, 64, null)), new NewMessageFieldData(d12.a.CONTENT_TEXT, r(true, this.labelProvider.c(e02.a.B3), params.getState().getContentValue(), 5000, params.getState().getContentValidationState(), params.d(), new s.Fix(6))), new NewMessageFieldData(d12.a.CASE_SIGN, s(this, true, this.labelProvider.c(e02.a.A3), params.getState().getCaseSignValue(), 50, params.getState().getCaseSignValidationState(), params.b(), null, 64, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(Params params, t22.a aVar) {
        params.h().b(aVar);
        params.f().b(v.HIDDEN);
        return i0.f148189a;
    }

    private final BaseScaffoldData l(er.a<i0> backAction, er.a<i0> closeAction, final l<? super v, i0> bottomSheetChangeAction) {
        return new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), backAction), this.labelProvider.c(e02.a.f46554j3), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, c.f151929a, null, closeAction, 4, null)), null, 20, null), null, v0.f(y.a(y3.a.O(y3.a.INSTANCE.o()), new er.a() { // from class: p22.b
            @Override // er.a
            public final Object a() {
                return d.m(bottomSheetChangeAction);
            }
        })), null, null, 53, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(l lVar) {
        lVar.b(v.HIDDEN);
        return i0.f148189a;
    }

    private final ButtonData q(er.a<i0> onClick) {
        return new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(e02.a.P), null, 2, null), k30.d.a.f107773a, null, onClick, 35, null);
    }

    private final TextAreaData r(boolean enabled, Label label, String value, int maxLength, e state, l<? super String, i0> onValueChanged, s type) {
        return new TextAreaData(null, label, type, null, state, value, enabled, new t50.a.Visible(maxLength, null, 2, null), null, v4.t.INSTANCE.e(), null, null, onValueChanged, null, 11529, null);
    }

    static /* synthetic */ TextAreaData s(d dVar, boolean z15, Label label, String str, int i15, e eVar, l lVar, s sVar, int i16, Object obj) {
        return dVar.r(z15, label, str, i15, eVar, lVar, (i16 & 64) != 0 ? new s.Flexible(6) : sVar);
    }

    @Override // er.l
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public o22.c.Data b(final Params params) {
        BaseScaffoldData baseScaffoldDataL = l(params.a(), params.c(), params.f());
        er.a<i0> aVarA = params.a();
        Label labelC = this.labelProvider.c(e02.a.f46650z3);
        Label labelC2 = this.labelProvider.c(e02.a.f46520e);
        ButtonData buttonDataQ = q(params.e());
        er.a<i0> aVarI = params.i();
        d12.a fieldTypeToScroll = params.getState().getFieldTypeToScroll();
        List<NewMessageFieldData> listF = f(params);
        ModalBottomSheetData modalBottomSheetData = new ModalBottomSheetData(new ModalSheetState(params.getState().getBottomSheetValue(), false, params.f(), 2, null), null, null, null, 14, null);
        wq.a<t22.a> aVarE = t22.a.e();
        ArrayList arrayList = new ArrayList(pq.v.y(aVarE, 10));
        for (Iterator<t22.a> it = aVarE.iterator(); it.hasNext(); it = it) {
            final t22.a next = it.next();
            arrayList.add(new FileBottomSheetItemData(next.getIconResId(), this.labelProvider.c(next.getLabelResId()), new er.a() { // from class: p22.c
                @Override // er.a
                public final Object a() {
                    return d.i(params, next);
                }
            }));
        }
        return new o22.c.Data(baseScaffoldDataL, modalBottomSheetData, arrayList, aVarA, labelC, listF, labelC2, this.filePickerMapper.b(new q.Params(params.getState().j(), params.g(), params.f())), buttonDataQ, fieldTypeToScroll, aVarI);
    }
}
