package k92;

import a50.RadioButtonData;
import b50.RadioButtonItemData;
import b50.RadioButtonRow;
import er.l;
import fr.k;
import fr.t;
import h30.ButtonData;
import h92.State;
import java.util.Set;
import mx.Label;
import n40.FilePickerData;
import oq.i0;
import p071kotlin.Metadata;
import pq.e1;
import pq.v;
import t50.TextAreaData;
import t50.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u001f\u001dB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ5\u0010\u0014\u001a\u00020\u0013*\u00020\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0018\u001a\u00020\u0017*\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lk92/j;", "Lxw/f;", "Lk92/j$b;", "Lh92/c$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lhz/b;", "Lt50/e;", "z", "(Lhz/b;)Lt50/e;", "Lzz/h$a;", "Lkotlin/Function1;", "Ldx3/a;", "Loq/i0;", "onImageClick", "Lkotlin/Function0;", "onDeleteFile", "Ln40/i$a;", "u", "(Lzz/h$a;Ler/l;Ler/a;)Ln40/i$a;", "", "Lmx/a;", "x", "(F)Lmx/a;", "params", "l", "(Lk92/j$b;)Lh92/c$a;", "a", "Lmx/c;", "b", "gios_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j implements xw.f<Params, h92.c.Data> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f109243b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f109244c = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Set<wx.d> f109245d;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lk92/j$a;", "", "<init>", "()V", "", "MAX_ALLOWED_FILES", "I", "gios_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: k92.j$b, reason: from toString */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001Bá\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b'\u0010*R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b)\u0010(\u001a\u0004\b#\u0010*R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b+\u0010.R#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b/\u0010(\u001a\u0004\b0\u0010*R#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b1\u0010(\u001a\u0004\b2\u0010*R#\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b2\u0010(\u001a\u0004\b3\u0010*R#\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b4\u0010(\u001a\u0004\b,\u0010*R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b0\u0010-\u001a\u0004\b/\u0010.R\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b5\u0010-\u001a\u0004\b5\u0010.R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b3\u0010-\u001a\u0004\b1\u0010.R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b%\u0010-\u001a\u0004\b4\u0010.¨\u00066"}, d2 = {"Lk92/j$b;", "", "Lh92/b;", "state", "Lkotlin/Function1;", "", "Loq/i0;", "officeInputFieldChangeAction", "entityNameInputFieldChangeAction", "caseDescriptionInputFieldChangeAction", "Lkotlin/Function0;", "nextAction", "Lfp0/l;", "radioAction", "Ldx3/a;", "onImageClick", "Lc92/a$a;", "showBottomSheet", "Lc92/a$b;", "onBottomSheetActionSelected", "onDeletePhotoClick", "removeFocus", "onFocusRemoved", "onScrolledToField", "<init>", "(Lh92/b;Ler/l;Ler/l;Ler/l;Ler/a;Ler/l;Ler/l;Ler/l;Ler/l;Ler/a;Ler/a;Ler/a;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lh92/b;", "m", "()Lh92/b;", "b", "Ler/l;", "d", "()Ler/l;", "c", "e", "Ler/a;", "()Ler/a;", "f", "j", "g", "h", "l", "i", "k", "gios_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> officeInputFieldChangeAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> entityNameInputFieldChangeAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> caseDescriptionInputFieldChangeAction;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> nextAction;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<fp0.l, i0> radioAction;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<dx3.a, i0> onImageClick;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<c92.a.ChoosePhoto, i0> showBottomSheet;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<c92.a.b, i0> onBottomSheetActionSelected;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onDeletePhotoClick;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> removeFocus;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onFocusRemoved;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onScrolledToField;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, l<? super String, i0> lVar, l<? super String, i0> lVar2, l<? super String, i0> lVar3, er.a<i0> aVar, l<? super fp0.l, i0> lVar4, l<? super dx3.a, i0> lVar5, l<? super c92.a.ChoosePhoto, i0> lVar6, l<? super c92.a.b, i0> lVar7, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4, er.a<i0> aVar5) {
            this.state = state;
            this.officeInputFieldChangeAction = lVar;
            this.entityNameInputFieldChangeAction = lVar2;
            this.caseDescriptionInputFieldChangeAction = lVar3;
            this.nextAction = aVar;
            this.radioAction = lVar4;
            this.onImageClick = lVar5;
            this.showBottomSheet = lVar6;
            this.onBottomSheetActionSelected = lVar7;
            this.onDeletePhotoClick = aVar2;
            this.removeFocus = aVar3;
            this.onFocusRemoved = aVar4;
            this.onScrolledToField = aVar5;
        }

        public final l<String, i0> a() {
            return this.caseDescriptionInputFieldChangeAction;
        }

        public final l<String, i0> b() {
            return this.entityNameInputFieldChangeAction;
        }

        public final er.a<i0> c() {
            return this.nextAction;
        }

        public final l<String, i0> d() {
            return this.officeInputFieldChangeAction;
        }

        public final l<c92.a.b, i0> e() {
            return this.onBottomSheetActionSelected;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.officeInputFieldChangeAction, params.officeInputFieldChangeAction) && t.c(this.entityNameInputFieldChangeAction, params.entityNameInputFieldChangeAction) && t.c(this.caseDescriptionInputFieldChangeAction, params.caseDescriptionInputFieldChangeAction) && t.c(this.nextAction, params.nextAction) && t.c(this.radioAction, params.radioAction) && t.c(this.onImageClick, params.onImageClick) && t.c(this.showBottomSheet, params.showBottomSheet) && t.c(this.onBottomSheetActionSelected, params.onBottomSheetActionSelected) && t.c(this.onDeletePhotoClick, params.onDeletePhotoClick) && t.c(this.removeFocus, params.removeFocus) && t.c(this.onFocusRemoved, params.onFocusRemoved) && t.c(this.onScrolledToField, params.onScrolledToField);
        }

        public final er.a<i0> f() {
            return this.onDeletePhotoClick;
        }

        public final er.a<i0> g() {
            return this.onFocusRemoved;
        }

        public final l<dx3.a, i0> h() {
            return this.onImageClick;
        }

        public int hashCode() {
            return (((((((((((((((((((((((this.state.hashCode() * 31) + this.officeInputFieldChangeAction.hashCode()) * 31) + this.entityNameInputFieldChangeAction.hashCode()) * 31) + this.caseDescriptionInputFieldChangeAction.hashCode()) * 31) + this.nextAction.hashCode()) * 31) + this.radioAction.hashCode()) * 31) + this.onImageClick.hashCode()) * 31) + this.showBottomSheet.hashCode()) * 31) + this.onBottomSheetActionSelected.hashCode()) * 31) + this.onDeletePhotoClick.hashCode()) * 31) + this.removeFocus.hashCode()) * 31) + this.onFocusRemoved.hashCode()) * 31) + this.onScrolledToField.hashCode();
        }

        public final er.a<i0> i() {
            return this.onScrolledToField;
        }

        public final l<fp0.l, i0> j() {
            return this.radioAction;
        }

        public final er.a<i0> k() {
            return this.removeFocus;
        }

        public final l<c92.a.ChoosePhoto, i0> l() {
            return this.showBottomSheet;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final State getState() {
            return this.state;
        }

        public String toString() {
            return "Params(state=" + this.state + ", officeInputFieldChangeAction=" + this.officeInputFieldChangeAction + ", entityNameInputFieldChangeAction=" + this.entityNameInputFieldChangeAction + ", caseDescriptionInputFieldChangeAction=" + this.caseDescriptionInputFieldChangeAction + ", nextAction=" + this.nextAction + ", radioAction=" + this.radioAction + ", onImageClick=" + this.onImageClick + ", showBottomSheet=" + this.showBottomSheet + ", onBottomSheetActionSelected=" + this.onBottomSheetActionSelected + ", onDeletePhotoClick=" + this.onDeletePhotoClick + ", removeFocus=" + this.removeFocus + ", onFocusRemoved=" + this.onFocusRemoved + ", onScrolledToField=" + this.onScrolledToField + ')';
        }
    }

    static {
        wx.d.Companion companion = wx.d.INSTANCE;
        f109245d = e1.i(wx.d.j0(companion.v()), wx.d.j0(companion.u()), wx.d.j0(companion.K()));
    }

    public j(mx.c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(Params params) {
        params.j().b(fp0.l.YES);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(Params params) {
        params.j().b(fp0.l.NO);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(final Params params) {
        params.k().a();
        params.l().b(new c92.a.ChoosePhoto(new l() { // from class: k92.f
            @Override // er.l
            public final Object b(Object obj) {
                return j.s(params, (c92.a.b) obj);
            }
        }));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(Params params, c92.a.b bVar) {
        params.e().b(bVar);
        return i0.f148189a;
    }

    private final n40.i.Image u(final zz.h.Image image, final l<? super dx3.a, i0> lVar, er.a<i0> aVar) {
        return new n40.i.Image(mx.b.b(image.a().getMetadata().getName(), "photoTitle"), x(image.a().d()), aVar, new er.a() { // from class: k92.e
            @Override // er.a
            public final Object a() {
                return j.v(lVar, this, image);
            }
        }, new n40.i.Image.AbstractC3255a.Image(image.getThumbnail()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(l lVar, j jVar, zz.h.Image image) {
        lVar.b(new dx3.a.Content(jVar.labelProvider.c(v72.b.f204245c0), image.a().getFileContent()));
        return i0.f148189a;
    }

    private final Label x(float f15) {
        return this.labelProvider.e(v72.b.f204253f, t04.a.c(f15));
    }

    private final t50.e z(hz.b bVar) {
        return bVar instanceof hz.b.Invalid ? new t50.e.Error(((hz.b.Invalid) bVar).getMessage()) : new t50.e.Default(null, 1, null);
    }

    @Override // er.l
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public h92.c.Data b(final Params params) {
        Label labelC = this.labelProvider.c(v72.b.f204264i1);
        RadioButtonItemData radioButtonItemData = new RadioButtonItemData(false, params.getState().getWasViolationReported() == fp0.l.YES, false, 5, null);
        Label labelC2 = this.labelProvider.c(v72.b.f204261h1);
        Label labelC3 = this.labelProvider.c(v72.b.f204255f1);
        Label labelC4 = this.labelProvider.c(v72.b.f204252e1);
        Label labelD = params.getState().f().d();
        l<String, i0> lVarD = params.d();
        hz.b state = params.getState().f().getState();
        v4.t.Companion companion = v4.t.INSTANCE;
        RadioButtonData radioButtonData = new RadioButtonData(v.q(new RadioButtonRow(radioButtonItemData, new er.a() { // from class: k92.g
            @Override // er.a
            public final Object a() {
                return j.m(params);
            }
        }, labelC2, null, new i92.b(new v50.c.Text(null, labelC3, labelC4, labelD, state, null, null, lVarD, null, false, companion.d(), null, false, null, true, null, null, null, null, null, 1031009, null)), 8, null), new RadioButtonRow(new RadioButtonItemData(false, params.getState().getWasViolationReported() == fp0.l.NO, false, 5, null), new er.a() { // from class: k92.h
            @Override // er.a
            public final Object a() {
                return j.q(params);
            }
        }, this.labelProvider.c(v72.b.f204258g1), null, null, 24, null)), b50.e.a.f16684a, null, labelC, null, null, null, 116, null);
        Label labelC5 = this.labelProvider.c(v72.b.f204276m1);
        Label labelC6 = this.labelProvider.c(v72.b.f204285p1);
        Label labelC7 = this.labelProvider.c(v72.b.f204256g);
        hz.b state2 = params.getState().e().getState();
        hz.b.Invalid invalid = state2 instanceof hz.b.Invalid ? (hz.b.Invalid) state2 : null;
        Label message = invalid != null ? invalid.getMessage() : null;
        zz.h.Image imageD = params.getState().e().d();
        FilePickerData filePickerData = new FilePickerData(labelC7, message, v.r(imageD != null ? u(imageD, params.h(), params.f()) : null), v.q(new n40.e.AllowedFormats(f109245d), new n40.e.b.File(b82.a.a(), null)), new er.a() { // from class: k92.i
            @Override // er.a
            public final Object a() {
                return j.r(params);
            }
        }, 1);
        v50.c.Text text = new v50.c.Text(null, this.labelProvider.c(v72.b.f204273l1), this.labelProvider.c(v72.b.f204270k1), params.getState().d().d(), params.getState().d().getState(), null, null, params.b(), null, false, companion.d(), null, false, null, true, null, null, null, null, null, 1031009, null);
        TextAreaData textAreaData = new TextAreaData(null, this.labelProvider.c(v72.b.f204282o1), new s.Fix(3), null, z(params.getState().c().getState()), params.getState().c().d().getText(), false, t50.a.C4878a.f187691a, this.labelProvider.c(v72.b.f204279n1), 0, null, null, params.a(), null, 11849, null);
        ButtonData buttonData = new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(v72.b.f204267j1), null, 2, null), k30.d.a.f107773a, null, params.c(), 35, null);
        boolean isFocusRemoved = params.getState().getIsFocusRemoved();
        er.a<i0> aVarG = params.g();
        c82.a scrollToField = params.getState().getScrollToField();
        return new h92.c.Data(radioButtonData, text, textAreaData, labelC5, labelC6, filePickerData, buttonData, isFocusRemoved, aVarG, scrollToField != null ? l92.b.a(scrollToField) : null, params.i());
    }
}
