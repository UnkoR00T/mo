package s22;

import androidx.compose.ui.graphics.Color;
import eo0.EpuapApplicationType;
import fr.t;
import g30.ModalBottomSheetData;
import g30.ModalSheetState;
import g30.v;
import h30.ButtonData;
import i50.BaseScaffoldData;
import j40.DropDownButtonData;
import java.util.ArrayList;
import java.util.List;
import mx.Label;
import oq.i0;
import oq.y;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v0;
import r22.State;
import t50.TextAreaData;
import t50.s;
import x50.NavigationButtonData;
import z30.FileBottomSheetItemData;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 ,2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002*(B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJO\u0010\u001d\u001a\u00020\u001c*\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0013\u0010!\u001a\u00020 *\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u0013\u0010$\u001a\u00020#*\u00020\u001fH\u0002¢\u0006\u0004\b$\u0010%J\u0018\u0010&\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006-"}, d2 = {"Ls22/g;", "Lxw/f;", "Ls22/g$b;", "Lr22/d$a;", "Lmx/c;", "labelProvider", "Ls22/q;", "filePickerMapper", "<init>", "(Lmx/c;Ls22/q;)V", "params", "", "Lr22/d$a$a;", "h", "(Ls22/g$b;)Ljava/util/List;", "Lr22/c$a;", "", "Lmx/a;", AnnotatedPrivateKey.LABEL, "", "maxLength", "Lkotlin/Function1;", "Loq/i0;", "onValueChanged", "Lt50/s;", "type", "", "enabled", "Lt50/d;", "s", "(Lr22/c$a;Lmx/a;ILer/l;Lt50/s;Z)Lt50/d;", "Lhz/b;", "Lj40/m;", "r", "(Lhz/b;)Lj40/m;", "Lt50/e;", "v", "(Lhz/b;)Lt50/e;", "l", "(Ls22/g$b;)Lr22/d$a;", "a", "Lmx/c;", "b", "Ls22/q;", "c", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements xw.f<Params, r22.d.Data> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f177653d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final q filePickerMapper;

    /* JADX INFO: renamed from: s22.g$b, reason: from toString */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BÍ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00050\b\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00050\b\u0012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b%\u0010'R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b(\u0010&\u001a\u0004\b(\u0010'R#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b-\u0010*\u001a\u0004\b)\u0010,R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b.\u0010*\u001a\u0004\b!\u0010,R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b/\u0010&\u001a\u0004\b0\u0010'R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b1\u0010&\u001a\u0004\b-\u0010'R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b2\u0010&\u001a\u0004\b2\u0010'R#\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b0\u0010*\u001a\u0004\b/\u0010,R#\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b#\u0010*\u001a\u0004\b.\u0010,R#\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b+\u0010*\u001a\u0004\b1\u0010,¨\u00063"}, d2 = {"Ls22/g$b;", "", "Lr22/c;", "state", "Lkotlin/Function0;", "Loq/i0;", "backAction", "closeAction", "Lkotlin/Function1;", "", "titleChangeValueAction", "contentChangeValueAction", "applicationNameChangeValueAction", "pickApplicationTypeAction", "nextAction", "onScrollToFieldAction", "Lm02/c;", "onDeleteFileClick", "Lg30/v;", "onBottomSheetStateChanged", "Lt22/a;", "onPickerActionSelected", "<init>", "(Lr22/c;Ler/a;Ler/a;Ler/l;Ler/l;Ler/l;Ler/a;Ler/a;Ler/a;Ler/l;Ler/l;Ler/l;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lr22/c;", "k", "()Lr22/c;", "b", "Ler/a;", "()Ler/a;", "c", "d", "Ler/l;", "l", "()Ler/l;", "e", "f", "g", "j", "h", "i", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> backAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> closeAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<String, i0> titleChangeValueAction;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<String, i0> contentChangeValueAction;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<String, i0> applicationNameChangeValueAction;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> pickApplicationTypeAction;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> nextAction;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onScrollToFieldAction;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<m02.c, i0> onDeleteFileClick;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<v, i0> onBottomSheetStateChanged;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<t22.a, i0> onPickerActionSelected;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, er.a<i0> aVar, er.a<i0> aVar2, er.l<? super String, i0> lVar, er.l<? super String, i0> lVar2, er.l<? super String, i0> lVar3, er.a<i0> aVar3, er.a<i0> aVar4, er.a<i0> aVar5, er.l<? super m02.c, i0> lVar4, er.l<? super v, i0> lVar5, er.l<? super t22.a, i0> lVar6) {
            this.state = state;
            this.backAction = aVar;
            this.closeAction = aVar2;
            this.titleChangeValueAction = lVar;
            this.contentChangeValueAction = lVar2;
            this.applicationNameChangeValueAction = lVar3;
            this.pickApplicationTypeAction = aVar3;
            this.nextAction = aVar4;
            this.onScrollToFieldAction = aVar5;
            this.onDeleteFileClick = lVar4;
            this.onBottomSheetStateChanged = lVar5;
            this.onPickerActionSelected = lVar6;
        }

        public final er.l<String, i0> a() {
            return this.applicationNameChangeValueAction;
        }

        public final er.a<i0> b() {
            return this.backAction;
        }

        public final er.a<i0> c() {
            return this.closeAction;
        }

        public final er.l<String, i0> d() {
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
            return t.c(this.state, params.state) && t.c(this.backAction, params.backAction) && t.c(this.closeAction, params.closeAction) && t.c(this.titleChangeValueAction, params.titleChangeValueAction) && t.c(this.contentChangeValueAction, params.contentChangeValueAction) && t.c(this.applicationNameChangeValueAction, params.applicationNameChangeValueAction) && t.c(this.pickApplicationTypeAction, params.pickApplicationTypeAction) && t.c(this.nextAction, params.nextAction) && t.c(this.onScrollToFieldAction, params.onScrollToFieldAction) && t.c(this.onDeleteFileClick, params.onDeleteFileClick) && t.c(this.onBottomSheetStateChanged, params.onBottomSheetStateChanged) && t.c(this.onPickerActionSelected, params.onPickerActionSelected);
        }

        public final er.l<v, i0> f() {
            return this.onBottomSheetStateChanged;
        }

        public final er.l<m02.c, i0> g() {
            return this.onDeleteFileClick;
        }

        public final er.l<t22.a, i0> h() {
            return this.onPickerActionSelected;
        }

        public int hashCode() {
            return (((((((((((((((((((((this.state.hashCode() * 31) + this.backAction.hashCode()) * 31) + this.closeAction.hashCode()) * 31) + this.titleChangeValueAction.hashCode()) * 31) + this.contentChangeValueAction.hashCode()) * 31) + this.applicationNameChangeValueAction.hashCode()) * 31) + this.pickApplicationTypeAction.hashCode()) * 31) + this.nextAction.hashCode()) * 31) + this.onScrollToFieldAction.hashCode()) * 31) + this.onDeleteFileClick.hashCode()) * 31) + this.onBottomSheetStateChanged.hashCode()) * 31) + this.onPickerActionSelected.hashCode();
        }

        public final er.a<i0> i() {
            return this.onScrollToFieldAction;
        }

        public final er.a<i0> j() {
            return this.pickApplicationTypeAction;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final State getState() {
            return this.state;
        }

        public final er.l<String, i0> l() {
            return this.titleChangeValueAction;
        }

        public String toString() {
            return "Params(state=" + this.state + ", backAction=" + this.backAction + ", closeAction=" + this.closeAction + ", titleChangeValueAction=" + this.titleChangeValueAction + ", contentChangeValueAction=" + this.contentChangeValueAction + ", applicationNameChangeValueAction=" + this.applicationNameChangeValueAction + ", pickApplicationTypeAction=" + this.pickApplicationTypeAction + ", nextAction=" + this.nextAction + ", onScrollToFieldAction=" + this.onScrollToFieldAction + ", onDeleteFileClick=" + this.onDeleteFileClick + ", onBottomSheetStateChanged=" + this.onBottomSheetStateChanged + ", onPickerActionSelected=" + this.onPickerActionSelected + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements er.p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f177668a = new c();

        c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(30527387);
            if (p076m2.t.k()) {
                p076m2.t.o(30527387, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messagewizard.epuapmessageform.mapper.EpuapMessageFormMapper.invoke.<anonymous> (EpuapMessageFormMapper.kt:73)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jB;
        }
    }

    public g(mx.c cVar, q qVar) {
        this.labelProvider = cVar;
        this.filePickerMapper = qVar;
    }

    private final List<r22.d.Data.InterfaceC4339a> h(final Params params) {
        boolean z15;
        String description;
        r22.b bVar = r22.b.APPLICATION_TYPE;
        Label labelC = this.labelProvider.c(e02.a.f46644y3);
        Integer num = params.getState().g().d() != null ? 0 : null;
        EpuapApplicationType epuapApplicationTypeD = params.getState().g().d();
        r22.d.Data.InterfaceC4339a.DropDownButton dropDownButton = new r22.d.Data.InterfaceC4339a.DropDownButton(bVar, new DropDownButtonData(labelC, pq.v.r((epuapApplicationTypeD == null || (description = epuapApplicationTypeD.getDescription()) == null) ? null : mx.b.b(description, "applicationType")), num, r(params.getState().g().getState()), this.labelProvider.c(e02.a.f46538h), false, null, new er.l() { // from class: s22.d
            @Override // er.l
            public final Object b(Object obj) {
                return g.i(params, (DropDownButtonData) obj);
            }
        }, 96, null));
        State.Field<String> fieldC = params.getState().c();
        r22.d.Data.InterfaceC4339a.TextArea textArea = fieldC != null ? new r22.d.Data.InterfaceC4339a.TextArea(r22.b.APPLICATION_NAME, u(this, fieldC, this.labelProvider.c(e02.a.f46638x3), 2000, params.a(), new s.Flexible(6), false, 16, null)) : null;
        r22.b bVar2 = r22.b.TITLE;
        State.Field<String> fieldJ = params.getState().j();
        Label labelC2 = this.labelProvider.c(e02.a.C3);
        er.l<String, i0> lVarL = params.l();
        s.Flexible flexible = new s.Flexible(6);
        z02.a entryMessageType = params.getState().getEntryMessageType();
        if ((entryMessageType instanceof z02.a.ForwardMessage) || (entryMessageType instanceof z02.a.Reply)) {
            z15 = false;
        } else {
            if (!t.c(entryMessageType, z02.a.c.f231893a) && !(entryMessageType instanceof z02.a.EditDraft)) {
                throw new oq.p();
            }
            z15 = true;
        }
        return pq.v.s(dropDownButton, textArea, new r22.d.Data.InterfaceC4339a.TextArea(bVar2, s(fieldJ, labelC2, 250, lVarL, flexible, z15)), new r22.d.Data.InterfaceC4339a.TextArea(r22.b.CONTENT_TEXT, u(this, params.getState().e(), this.labelProvider.c(e02.a.B3), 5000, params.d(), new s.Fix(6), false, 16, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(Params params, DropDownButtonData dropDownButtonData) {
        params.j().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(Params params) {
        params.f().b(v.HIDDEN);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(Params params, t22.a aVar) {
        params.h().b(aVar);
        params.f().b(v.HIDDEN);
        return i0.f148189a;
    }

    private final j40.m r(hz.b bVar) {
        if (!t.c(bVar, hz.b.C2039b.f86846c) && !t.c(bVar, hz.b.d.f86848c)) {
            if (bVar instanceof hz.b.Invalid) {
                return new j40.m.Error(((hz.b.Invalid) bVar).getMessage());
            }
            throw new oq.p();
        }
        return new j40.m.Enabled(null, 1, null);
    }

    private final TextAreaData s(State.Field<String> field, Label label, int i15, er.l<? super String, i0> lVar, s sVar, boolean z15) {
        return new TextAreaData(null, label, sVar, null, v(field.getState()), field.d(), z15, new t50.a.Visible(i15, null, 2, null), null, v4.t.INSTANCE.e(), null, null, lVar, null, 11529, null);
    }

    static /* synthetic */ TextAreaData u(g gVar, State.Field field, Label label, int i15, er.l lVar, s sVar, boolean z15, int i16, Object obj) {
        if ((i16 & 16) != 0) {
            z15 = true;
        }
        return gVar.s(field, label, i15, lVar, sVar, z15);
    }

    private final t50.e v(hz.b bVar) {
        if (!t.c(bVar, hz.b.C2039b.f86846c) && !t.c(bVar, hz.b.d.f86848c)) {
            if (bVar instanceof hz.b.Invalid) {
                return new t50.e.Error(((hz.b.Invalid) bVar).getMessage());
            }
            throw new oq.p();
        }
        return new t50.e.Default(null, 1, null);
    }

    @Override // er.l
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public r22.d.Data b(final Params params) {
        er.a<i0> aVarB = params.b();
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.b()), this.labelProvider.c(e02.a.f46554j3), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, c.f177668a, null, params.c(), 4, null)), null, 20, null), null, v0.f(y.a(y3.a.O(y3.a.INSTANCE.o()), new er.a() { // from class: s22.e
            @Override // er.a
            public final Object a() {
                return g.m(params);
            }
        })), null, null, 53, null);
        ModalBottomSheetData modalBottomSheetData = new ModalBottomSheetData(new ModalSheetState(params.getState().getBottomSheetValue(), false, params.f(), 2, null), null, null, null, 14, null);
        wq.a<t22.a> aVarE = t22.a.e();
        ArrayList arrayList = new ArrayList(pq.v.y(aVarE, 10));
        for (final t22.a aVar : aVarE) {
            arrayList.add(new FileBottomSheetItemData(aVar.getIconResId(), this.labelProvider.c(aVar.getLabelResId()), new er.a() { // from class: s22.f
                @Override // er.a
                public final Object a() {
                    return g.q(params, aVar);
                }
            }));
        }
        Label labelC = this.labelProvider.c(e02.a.f46650z3);
        Label labelC2 = this.labelProvider.c(e02.a.f46520e);
        ButtonData buttonData = new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(e02.a.P), null, 2, null), k30.d.a.f107773a, null, params.e(), 35, null);
        er.a<i0> aVarI = params.i();
        return new r22.d.Data(baseScaffoldData, modalBottomSheetData, arrayList, aVarB, labelC, h(params), labelC2, this.filePickerMapper.b(new q.Params(params.getState().i(), params.g(), params.f())), buttonData, params.getState().getFieldTypeToScroll(), aVarI);
    }
}
