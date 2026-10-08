package ql1;

import er.l;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import iy.b0;
import iy.c0;
import java.util.List;
import mx.Label;
import ol1.State;
import ol1.j;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\u0011\u001a\u00020\u000e*\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lql1/d;", "Lxw/f;", "Lql1/d$a;", "Lol1/j$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "r", "(Lql1/d$a;)Lol1/j$a;", "a", "Lmx/c;", "Lkk1/a;", "", "q", "(Lkk1/a;)I", "headerResId", "", "Lol1/j$a$a;", "m", "(Lql1/d$a;)Ljava/util/List;", "fields", "dependentidinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements f<Params, j.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: ql1.d$a, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b!\u0010 \u001a\u0004\b%\u0010\"R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b$\u0010&\u001a\u0004\b\u001b\u0010(R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b'\u0010&\u001a\u0004\b\u001f\u0010(R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b\u001d\u0010&\u001a\u0004\b#\u0010(¨\u0006)"}, d2 = {"Lql1/d$a;", "", "Lol1/i;", "state", "Lkotlin/Function1;", "Liy/b0;", "Loq/i0;", "onFathersNameChanged", "onMothersNameChanged", "onMothersFamilyNameChanged", "Lkotlin/Function0;", "onScrolledToField", "backAction", "closeAction", "nextAction", "<init>", "(Lol1/i;Ler/l;Ler/l;Ler/l;Ler/a;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lol1/i;", "h", "()Lol1/i;", "b", "Ler/l;", "d", "()Ler/l;", "c", "f", "e", "Ler/a;", "g", "()Ler/a;", "dependentidinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f167168i;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<b0, i0> onFathersNameChanged;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<b0, i0> onMothersNameChanged;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<b0, i0> onMothersFamilyNameChanged;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onScrolledToField;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> backAction;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> closeAction;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> nextAction;

        static {
            int i15 = hz.b.f86845b;
            int i16 = b0.f97726c;
            f167168i = i15 | i15 | i16 | i15 | i16 | i16;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, l<? super b0, i0> lVar, l<? super b0, i0> lVar2, l<? super b0, i0> lVar3, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4) {
            this.state = state;
            this.onFathersNameChanged = lVar;
            this.onMothersNameChanged = lVar2;
            this.onMothersFamilyNameChanged = lVar3;
            this.onScrolledToField = aVar;
            this.backAction = aVar2;
            this.closeAction = aVar3;
            this.nextAction = aVar4;
        }

        public final er.a<i0> a() {
            return this.backAction;
        }

        public final er.a<i0> b() {
            return this.closeAction;
        }

        public final er.a<i0> c() {
            return this.nextAction;
        }

        public final l<b0, i0> d() {
            return this.onFathersNameChanged;
        }

        public final l<b0, i0> e() {
            return this.onMothersFamilyNameChanged;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onFathersNameChanged, params.onFathersNameChanged) && t.c(this.onMothersNameChanged, params.onMothersNameChanged) && t.c(this.onMothersFamilyNameChanged, params.onMothersFamilyNameChanged) && t.c(this.onScrolledToField, params.onScrolledToField) && t.c(this.backAction, params.backAction) && t.c(this.closeAction, params.closeAction) && t.c(this.nextAction, params.nextAction);
        }

        public final l<b0, i0> f() {
            return this.onMothersNameChanged;
        }

        public final er.a<i0> g() {
            return this.onScrolledToField;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final State getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((((((this.state.hashCode() * 31) + this.onFathersNameChanged.hashCode()) * 31) + this.onMothersNameChanged.hashCode()) * 31) + this.onMothersFamilyNameChanged.hashCode()) * 31) + this.onScrolledToField.hashCode()) * 31) + this.backAction.hashCode()) * 31) + this.closeAction.hashCode()) * 31) + this.nextAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onFathersNameChanged=" + this.onFathersNameChanged + ", onMothersNameChanged=" + this.onMothersNameChanged + ", onMothersFamilyNameChanged=" + this.onMothersFamilyNameChanged + ", onScrolledToField=" + this.onScrolledToField + ", backAction=" + this.backAction + ", closeAction=" + this.closeAction + ", nextAction=" + this.nextAction + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f167177a;

        static {
            int[] iArr = new int[kk1.a.values().length];
            try {
                iArr[kk1.a.CHILD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[kk1.a.WARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f167177a = iArr;
        }
    }

    public d(mx.c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(Params params, String str) {
        params.d().b(c0.g(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(Params params, String str) {
        params.f().b(c0.g(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(Params params, String str) {
        params.e().b(c0.g(str));
        return i0.f148189a;
    }

    private final List<j.Data.Field> m(final Params params) {
        return v.q(new j.Data.Field(rl1.a.FATHERS_NAME, new v50.c.Text(null, this.labelProvider.c(gk1.a.E), null, mx.b.b(c0.e(params.getState().getFathersName().getValue()), "fathersName"), params.getState().getFathersName().getValidationState(), null, null, new l() { // from class: ql1.a
            @Override // er.l
            public final Object b(Object obj) {
                return d.h(params, (String) obj);
            }
        }, null, false, 0, null, false, null, false, null, null, null, null, null, 1048421, null)), new j.Data.Field(rl1.a.MOTHERS_NAME, new v50.c.Text(null, this.labelProvider.c(gk1.a.R), null, mx.b.b(c0.e(params.getState().getMothersName().getValue()), "mothersName"), params.getState().getMothersName().getValidationState(), null, null, new l() { // from class: ql1.b
            @Override // er.l
            public final Object b(Object obj) {
                return d.i(params, (String) obj);
            }
        }, null, false, 0, null, false, null, false, null, null, null, null, null, 1048421, null)), new j.Data.Field(rl1.a.MOTHERS_FAMILY_NAME, new v50.c.Text(null, this.labelProvider.c(gk1.a.Q), null, mx.b.b(c0.e(params.getState().getMothersFamilyName().getValue()), "mothersFamilyName"), params.getState().getMothersFamilyName().getValidationState(), null, null, new l() { // from class: ql1.c
            @Override // er.l
            public final Object b(Object obj) {
                return d.l(params, (String) obj);
            }
        }, null, false, 0, null, false, null, false, null, null, null, null, null, 1048421, null)));
    }

    private final int q(kk1.a aVar) {
        int i15 = b.f167177a[aVar.ordinal()];
        if (i15 == 1) {
            return gk1.a.f73459u;
        }
        if (i15 == 2) {
            return gk1.a.f73463w;
        }
        throw new p();
    }

    @Override // er.l
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public j.Data b(Params params) {
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(gk1.a.W), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, null, null, params.b(), 6, null)), null, 20, null), null, null, null, null, 61, null);
        Label labelC = this.labelProvider.c(q(params.getState().getType()));
        List<j.Data.Field> listM = m(params);
        mk1.a scrollToField = params.getState().getScrollToField();
        return new j.Data(baseScaffoldData, labelC, listM, scrollToField != null ? rl1.b.a(scrollToField) : null, params.g(), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(gk1.a.S), null, 2, null), k30.d.a.f107773a, null, params.c(), 35, null));
    }
}
